package ru.ok.gl.tf.gestures.processor;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.LongSparseArray;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import ru.ok.face.entity.CatFigure;
import ru.ok.face.entity.FaceFigure;
import ru.ok.gl.tf.Tensorflow;
import ru.ok.gl.tf.gestures.Figure;
import ru.ok.gl.util.IntPair;
import ru.ok.gl.util.ScaledTime;
import ru.ok.tensorflow.entity.CompositeGesture;
import ru.ok.tensorflow.entity.CompositeRecognition;
import ru.ok.tensorflow.entity.Detection;
import ru.ok.tensorflow.entity.Gesture;
import ru.ok.tensorflow.entity.Recognition;
import ru.ok.tensorflow.gesture.HeartGestureAssembler;
import ru.ok.tensorflow.util.ImageUtils;

@SuppressLint({"NewApi"})
/* loaded from: classes9.dex */
public final class Composer {
    private int frameHeight;
    private int frameWidth;
    private int rendererHeight;
    public volatile Matrix rendererTransform;
    private int rendererWidth;
    private Runnable updateCallback;
    private final HeartGestureAssembler heartAssembler = new HeartGestureAssembler(null);
    private final CopyOnWriteArrayList<Frame<CompositeGesture>> compositeFrames = new CopyOnWriteArrayList<>();
    private final CopyOnWriteArrayList<Frame<Gesture>> frames = new CopyOnWriteArrayList<>();
    private final CopyOnWriteArrayList<FaceFigure> faces = new CopyOnWriteArrayList<>();
    private final CopyOnWriteArrayList<CatFigure> cats = new CopyOnWriteArrayList<>();
    private final LongSparseArray<GestureAccumulator> accumulators = new LongSparseArray<>();
    private final ArrayList<CompositeRecognition> tempCompositeRecognitions = new ArrayList<>();
    private final ArrayList<Recognition> tempRecognitions = new ArrayList<>();
    private final float[] tempFloats = new float[64];
    private final RectF tempRect = new RectF();
    private boolean isSmoothEnabled = true;

    private void addCompositeFrame(Collection<Frame<CompositeGesture>> collection, CompositeRecognition compositeRecognition) {
        if (compositeRecognition.leftRecognition == null && compositeRecognition.rightRecognition == null) {
            throw new IllegalArgumentException();
        }
        SimpleFrame simpleFrame = new SimpleFrame(compositeRecognition.gesture);
        updateCompositeFrame(simpleFrame, compositeRecognition);
        collection.add(simpleFrame);
    }

    private void addFrame(Collection<Frame<Gesture>> collection, Recognition recognition) {
        SimpleFrame simpleFrame = new SimpleFrame(recognition.id, Tensorflow.recognitionToGesture(recognition));
        this.accumulators.put(recognition.id, new GestureAccumulator());
        updateFrame(simpleFrame, recognition);
        collection.add(simpleFrame);
    }

    private void dispatchFiguresUpdate() {
        Runnable runnable = this.updateCallback;
        if (runnable != null) {
            runnable.run();
        }
    }

    private GestureAccumulator getGestureAccumulator(Recognition recognition) {
        GestureAccumulator gestureAccumulator = this.accumulators.get(recognition.id);
        if (gestureAccumulator != null) {
            return gestureAccumulator;
        }
        LongSparseArray<GestureAccumulator> longSparseArray = this.accumulators;
        long j = recognition.id;
        GestureAccumulator gestureAccumulator2 = new GestureAccumulator();
        longSparseArray.put(j, gestureAccumulator2);
        return gestureAccumulator2;
    }

    private boolean isBurstRecognition(Recognition recognition) {
        float f;
        Iterator<Frame<CompositeGesture>> it = this.compositeFrames.iterator();
        while (it.hasNext()) {
            Frame<CompositeGesture> next = it.next();
            if (recognition.id == next.getLeftId() || recognition.id == next.getRightId()) {
                return false;
            }
        }
        Iterator<Frame<Gesture>> it2 = this.frames.iterator();
        while (it2.hasNext()) {
            if (recognition.id == it2.next().getId()) {
                return false;
            }
        }
        recognition.detection.fillRect(this.tempRect);
        if (this.rendererTransform != null) {
            this.rendererTransform.mapRect(this.tempRect);
            f = Calculator.getMaxRadius(this.tempRect);
        } else {
            f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        Iterator<Frame<Gesture>> it3 = this.frames.iterator();
        while (it3.hasNext()) {
            Frame<Gesture> next2 = it3.next();
            if (PointF.length(next2.getRect().left - this.tempRect.left, next2.getRect().top - this.tempRect.top) <= next2.getMaxRadius() + f) {
                return true;
            }
        }
        return false;
    }

    private void maybeCreateRendererTransform() {
        int i;
        int i2;
        if (this.rendererTransform != null || (i = this.frameWidth) == 0 || (i2 = this.frameHeight) == 0 || this.rendererWidth == 0 || this.rendererHeight == 0) {
            return;
        }
        this.rendererTransform = calculateRendererTransform(i, i2);
    }

    private void removeFrames() {
        removeFrames(this.compositeFrames);
        removeFrames(this.frames);
        this.accumulators.clear();
    }

    private CompositeRecognition updateCompositeFrame(Frame<CompositeGesture> frame, Collection<CompositeRecognition> collection) {
        Recognition recognition;
        for (CompositeRecognition compositeRecognition : collection) {
            Recognition recognition2 = compositeRecognition.leftRecognition;
            if ((recognition2 != null && recognition2.id == frame.getLeftId()) || ((recognition = compositeRecognition.rightRecognition) != null && recognition.id == frame.getRightId())) {
                updateCompositeFrame(frame, compositeRecognition);
                return compositeRecognition;
            }
        }
        return null;
    }

    private Recognition updateFrame(Frame<Gesture> frame, Collection<Recognition> collection) {
        for (Recognition recognition : collection) {
            if (recognition.id == frame.getId()) {
                updateFrame(frame, recognition);
                return recognition;
            }
        }
        return null;
    }

    private void updateRendererTransform(IntPair intPair, IntPair intPair2) {
        int i = this.frameWidth;
        int i2 = intPair.first;
        if (i != i2 || this.frameHeight != intPair.second || this.rendererWidth != intPair2.first || this.rendererHeight != intPair2.second) {
            this.frameWidth = i2;
            this.frameHeight = intPair.second;
            this.rendererWidth = intPair2.first;
            this.rendererHeight = intPair2.second;
            this.rendererTransform = null;
        }
        maybeCreateRendererTransform();
    }

    public Matrix calculateRendererTransform(int i, int i2) {
        return ImageUtils.getTransformationMatrix(i, i2, this.rendererWidth, this.rendererHeight, false, false, true);
    }

    public void enableSmooth(boolean z) {
        this.isSmoothEnabled = z;
    }

    @NonNull
    public Collection<? extends CatFigure> getCats() {
        return this.cats;
    }

    @NonNull
    public Collection<? extends Figure<CompositeGesture>> getCompositeFigures() {
        return this.compositeFrames;
    }

    @NonNull
    public Collection<? extends FaceFigure> getFaces() {
        return this.faces;
    }

    @NonNull
    public Collection<? extends Figure<Gesture>> getFigures() {
        return this.frames;
    }

    @NonNull
    public Collection<FaceFigure> getResult() {
        return this.faces;
    }

    public void process(List<Recognition> list, List<FaceFigure> list2, List<CatFigure> list3, Bitmap bitmap, @NonNull IntPair intPair, @NonNull IntPair intPair2) {
        updateRendererTransform(intPair, intPair2);
        this.faces.clear();
        int i = 0;
        if (list2 != null && this.rendererTransform != null) {
            for (int i2 = 0; i2 < list2.size(); i2++) {
                FaceFigure faceFigure = list2.get(i2);
                Detection transform = faceFigure.detection.transform(this.rendererTransform);
                float[] fArr = (float[]) faceFigure.mesh.clone();
                this.rendererTransform.mapPoints(fArr);
                list2.set(i2, new FaceFigure(transform, fArr, faceFigure.score, faceFigure.rotationMatrix, faceFigure.is3DMesh));
            }
            this.faces.addAll(list2);
        }
        this.cats.clear();
        if (list3 != null && this.rendererTransform != null) {
            for (int i3 = 0; i3 < list3.size(); i3++) {
                CatFigure catFigure = list3.get(i3);
                Detection transform2 = catFigure.detection.transform(this.rendererTransform);
                float[] fArr2 = catFigure.mesh;
                float[] copyOf = Arrays.copyOf(fArr2, fArr2.length);
                this.rendererTransform.mapPoints(copyOf);
                list3.set(i3, new CatFigure(transform2, copyOf, catFigure.score, (float[]) catFigure.angles.clone()));
            }
            this.cats.addAll(list3);
        }
        boolean z = ((list2 == null || list2.isEmpty()) && (list3 == null || list3.isEmpty())) ? false : true;
        if (list == null || list.isEmpty()) {
            if (!this.frames.isEmpty() || !this.compositeFrames.isEmpty()) {
                removeFrames();
                dispatchFiguresUpdate();
            }
            if (z) {
                dispatchFiguresUpdate();
                return;
            }
            return;
        }
        if (!this.isSmoothEnabled) {
            removeFrames();
            Iterator<Recognition> it = list.iterator();
            while (it.hasNext()) {
                addFrame(this.frames, it.next());
            }
            Iterator<CompositeRecognition> it2 = this.heartAssembler.assembleHearts(list, null).iterator();
            while (it2.hasNext()) {
                addCompositeFrame(this.compositeFrames, it2.next());
            }
            dispatchFiguresUpdate();
            return;
        }
        this.tempRecognitions.clear();
        if (this.frames.isEmpty()) {
            Iterator<Recognition> it3 = list.iterator();
            while (it3.hasNext()) {
                addFrame(this.frames, it3.next());
            }
        } else {
            this.tempRecognitions.addAll(list);
            int i4 = 0;
            while (i4 < this.frames.size()) {
                Frame<Gesture> frame = this.frames.get(i4);
                Recognition updateFrame = updateFrame(frame, this.tempRecognitions);
                if (updateFrame != null) {
                    this.tempRecognitions.remove(updateFrame);
                    i4++;
                } else {
                    this.accumulators.remove(frame.getId());
                    this.frames.remove(i4);
                    frame.release();
                }
            }
        }
        List<CompositeRecognition> assembleHearts = this.heartAssembler.assembleHearts(list, null);
        if (assembleHearts == null || assembleHearts.isEmpty()) {
            removeFrames(this.compositeFrames);
        } else if (this.compositeFrames.isEmpty()) {
            Iterator<CompositeRecognition> it4 = assembleHearts.iterator();
            while (it4.hasNext()) {
                addCompositeFrame(this.compositeFrames, it4.next());
            }
        } else {
            this.tempCompositeRecognitions.clear();
            this.tempCompositeRecognitions.addAll(assembleHearts);
            while (i < this.compositeFrames.size()) {
                Frame<CompositeGesture> frame2 = this.compositeFrames.get(i);
                CompositeRecognition updateCompositeFrame = updateCompositeFrame(frame2, this.tempCompositeRecognitions);
                if (updateCompositeFrame != null) {
                    this.tempCompositeRecognitions.remove(updateCompositeFrame);
                    i++;
                } else {
                    this.compositeFrames.remove(i);
                    frame2.release();
                }
            }
            Iterator<CompositeRecognition> it5 = this.tempCompositeRecognitions.iterator();
            while (it5.hasNext()) {
                addCompositeFrame(this.compositeFrames, it5.next());
            }
        }
        Iterator<Recognition> it6 = this.tempRecognitions.iterator();
        while (it6.hasNext()) {
            Recognition next = it6.next();
            if (!isBurstRecognition(next)) {
                addFrame(this.frames, next);
            }
        }
        dispatchFiguresUpdate();
    }

    public void release() {
        this.updateCallback = null;
        this.faces.clear();
        this.cats.clear();
        removeFrames();
    }

    public void setFiguresUpdateCallback(Runnable runnable) {
        this.updateCallback = runnable;
    }

    private static <G> void removeFrames(List<Frame<G>> list) {
        while (!list.isEmpty()) {
            list.remove(0).release();
        }
    }

    private void updateFrame(Frame<Gesture> frame, Recognition recognition) {
        frame.setBoundsRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.rendererWidth, this.rendererHeight);
        frame.setRectTransform(this.rendererTransform);
        Gesture recognitionToGesture = Tensorflow.recognitionToGesture(recognition);
        frame.setLastGesture(recognitionToGesture);
        GestureAccumulator gestureAccumulator = getGestureAccumulator(recognition);
        if (this.isSmoothEnabled) {
            if (gestureAccumulator.hasGesture()) {
                Gesture favoriteGesture = gestureAccumulator.getFavoriteGesture();
                frame.setGesture(favoriteGesture);
                frame.setGestureColor(Tensorflow.getColor(favoriteGesture));
                gestureAccumulator.reset();
            } else if (frame.getGesture() == null) {
                frame.setGesture(recognitionToGesture);
                frame.setGestureColor(Tensorflow.getColor(recognitionToGesture));
            }
        } else {
            frame.setGesture(recognitionToGesture);
            frame.setGestureColor(Tensorflow.getColor(recognitionToGesture));
        }
        gestureAccumulator.process(recognition);
        float rotation = Calculator.getRotation(recognition, this.rendererTransform, this.tempFloats, 7);
        float rotation2 = Calculator.getRotation(recognition, this.rendererTransform, this.tempFloats, 6);
        frame.setGestureAngle(90.0f - rotation);
        frame.setStraighGestureAngle(90.0f - rotation2);
        recognition.detection.fillRect(this.tempRect);
        frame.setRawRect(this.tempRect);
        frame.setPoints(recognition.detection.getKeypoint(11), recognition.detection.getKeypoint(5), recognition.detection.getKeypoint(6), recognition.detection.getKeypoint(7), recognition.detection.getKeypoint(4));
    }

    private void updateCompositeFrame(Frame<CompositeGesture> frame, CompositeRecognition compositeRecognition) {
        frame.setBoundsRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.rendererWidth, this.rendererHeight);
        frame.setRectTransform(this.rendererTransform);
        Recognition recognition = compositeRecognition.leftRecognition;
        if (recognition != null) {
            frame.setLeftId(recognition.id);
            compositeRecognition.leftRecognition.detection.fillRect(this.tempRect);
            frame.setLeftRect(this.tempRect);
        }
        Recognition recognition2 = compositeRecognition.rightRecognition;
        if (recognition2 != null) {
            frame.setRightId(recognition2.id);
            compositeRecognition.rightRecognition.detection.fillRect(this.tempRect);
            frame.setRightRect(this.tempRect);
        }
        frame.setGestureColor(Tensorflow.getColor(compositeRecognition.gesture));
        frame.setGestureAngle(compositeRecognition.rotationDegrees);
        frame.setLastGesture(compositeRecognition.gesture);
        frame.setGesture(compositeRecognition.gesture);
        float[] fArr = compositeRecognition.center;
        float f = fArr[0];
        float f2 = fArr[1];
        RectF rectF = this.tempRect;
        float f3 = compositeRecognition.size;
        rectF.set(f - f3, f2 - f3, f + f3, f2 + f3);
        frame.setKeepRawRectSize(true);
        frame.setRawRect(this.tempRect);
    }

    public void setClearFiguresDelay(@NonNull ScaledTime scaledTime) {
    }

    public void setUseMovementPrediction(boolean z) {
    }

    public void setUseSd(boolean z) {
    }
}
