package ru.ok.gl.tf.gestures;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.util.Size;
import androidx.annotation.NonNull;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import ru.ok.face.entity.CatFigure;
import ru.ok.face.entity.FaceFigure;
import ru.ok.face.entity.FaceMorphingFigure;
import ru.ok.face.pipeline_frugal.FrugalKeypointPipeline;
import ru.ok.gl.tf.Tensorflow;
import ru.ok.gl.tf.TensorflowListener;
import ru.ok.gl.tf.gestures.Figure;
import ru.ok.gl.tf.gestures.TensorflowGestureDetector;
import ru.ok.gl.tf.gestures.processor.Processor;
import ru.ok.gl.util.Consumer;
import ru.ok.gl.util.Consumer5;
import ru.ok.gl.util.ScaledTime;
import ru.ok.pattern.entity.PatternMatch;
import ru.ok.tensorflow.customview.OverlayView;
import ru.ok.tensorflow.entity.CompositeGesture;
import ru.ok.tensorflow.entity.Detection;
import ru.ok.tensorflow.entity.Gesture;
import ru.ok.tensorflow.entity.Recognition;

@SuppressLint({"NewApi"})
/* loaded from: classes9.dex */
public final class TensorflowGestureDetector implements TensorflowListener {
    private final CopyOnWriteArraySet<FiguresConsumer<PatternMatch>> bodyPatternMatchConsumers;
    private final CopyOnWriteArraySet<FiguresConsumer<CatFigure>> catConsumers;
    private final CopyOnWriteArraySet<FiguresConsumer<Figure<CompositeGesture>>> compositeFigureConsumers;
    private final CopyOnWriteArraySet<FiguresConsumer<FaceFigure>> faceConsumers;
    private final CopyOnWriteArraySet<FiguresConsumer<Figure<Gesture>>> figureConsumers;
    private final CopyOnWriteArraySet<Consumer<Bitmap>> fullSegmentationConsumers;
    private final CopyOnWriteArraySet<Consumer<FaceMorphingFigure>> morphingConsumers;
    private final Processor processor;
    private final Consumer5<Tensorflow, List<Recognition>, List<FaceFigure>, List<CatFigure>, Bitmap> recognitionConsumer;
    private final Tensorflow tensorflow;

    public static final class Builder {
        OverlayView overlayView;
        final Tensorflow tensorflow;

        public Builder(@NonNull Tensorflow tensorflow) {
            this.tensorflow = tensorflow;
        }

        public TensorflowGestureDetector build() {
            return new TensorflowGestureDetector(this);
        }

        public Builder setOverlayView(OverlayView overlayView) {
            this.overlayView = overlayView;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void accept(Tensorflow tensorflow, List<Recognition> list, List<FaceFigure> list2, List<CatFigure> list3, Bitmap bitmap) {
        Size frameSize = tensorflow.getFrameSize();
        this.processor.process(list, list2, list3, bitmap, frameSize.getWidth(), frameSize.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void acceptBodyPatternMatch(List<PatternMatch> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<FiguresConsumer<PatternMatch>> it = this.bodyPatternMatchConsumers.iterator();
        while (it.hasNext()) {
            it.next().accept(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void acceptFigures(Collection<? extends Figure<Gesture>> collection, Collection<? extends Figure<CompositeGesture>> collection2, Collection<? extends FaceFigure> collection3, Collection<? extends CatFigure> collection4, Bitmap bitmap) {
        Iterator<FiguresConsumer<Figure<Gesture>>> it = this.figureConsumers.iterator();
        while (it.hasNext()) {
            it.next().accept(collection);
        }
        Iterator<FiguresConsumer<Figure<CompositeGesture>>> it2 = this.compositeFigureConsumers.iterator();
        while (it2.hasNext()) {
            it2.next().accept(collection2);
        }
        Iterator<FiguresConsumer<FaceFigure>> it3 = this.faceConsumers.iterator();
        while (it3.hasNext()) {
            it3.next();
        }
        Iterator<FiguresConsumer<CatFigure>> it4 = this.catConsumers.iterator();
        while (it4.hasNext()) {
            it4.next();
        }
        if (bitmap != null) {
            Iterator<Consumer<Bitmap>> it5 = this.fullSegmentationConsumers.iterator();
            while (it5.hasNext()) {
                it5.next().accept(bitmap);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void acceptFullCats(List<CatFigure> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            CatFigure catFigure = list.get(i);
            Detection transform = catFigure.detection.transform(this.processor.composer.rendererTransform);
            float[] fArr = (float[]) catFigure.mesh.clone();
            this.processor.composer.rendererTransform.mapPoints(fArr);
            list.set(i, new CatFigure(transform, fArr, catFigure.score, (float[]) catFigure.angles.clone()));
        }
        Iterator<FiguresConsumer<CatFigure>> it = this.catConsumers.iterator();
        while (it.hasNext()) {
            it.next().accept(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void acceptFullFaces(List<FaceFigure> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            FaceFigure faceFigure = list.get(i);
            Detection transform = faceFigure.detection.transform(this.processor.composer.rendererTransform);
            float[] fArr = (float[]) faceFigure.mesh.clone();
            if (faceFigure.is3DMesh) {
                for (int i2 = 0; i2 < faceFigure.mesh.length / 3; i2++) {
                    int i3 = i2 * 3;
                    float[] fArr2 = fArr;
                    this.processor.composer.rendererTransform.mapPoints(fArr2, i3, faceFigure.mesh, i3, 1);
                    fArr = fArr2;
                }
            } else {
                this.processor.composer.rendererTransform.mapPoints(fArr);
            }
            FaceFigure faceFigure2 = new FaceFigure(transform, fArr, faceFigure.score, faceFigure.rotationMatrix, faceFigure.is3DMesh);
            if (this.tensorflow.isSolvePnpAnglesEnabled()) {
                FrugalKeypointPipeline.processFaceAngles(faceFigure2);
            }
            list.set(i, faceFigure2);
        }
        Iterator<FiguresConsumer<FaceFigure>> it = this.faceConsumers.iterator();
        while (it.hasNext()) {
            it.next().accept(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void acceptFullSegm(Bitmap bitmap) {
        if (bitmap != null) {
            Iterator<Consumer<Bitmap>> it = this.fullSegmentationConsumers.iterator();
            while (it.hasNext()) {
                it.next().accept(bitmap);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void acceptMorph(FaceMorphingFigure faceMorphingFigure) {
        if (faceMorphingFigure != null) {
            Size originalFrameSize = this.tensorflow.getOriginalFrameSize();
            Detection transform = faceMorphingFigure.detection.transform(this.processor.composer.calculateRendererTransform(originalFrameSize.getWidth(), originalFrameSize.getHeight()));
            Iterator<Consumer<FaceMorphingFigure>> it = this.morphingConsumers.iterator();
            while (it.hasNext()) {
                it.next().accept(new FaceMorphingFigure(transform, faceMorphingFigure.mesh, faceMorphingFigure.score, faceMorphingFigure.rotationMatrix, faceMorphingFigure.is3DMesh, faceMorphingFigure.outputImg, faceMorphingFigure.outputMask, faceMorphingFigure.outputWarpMap, faceMorphingFigure.cropScaleFactor, faceMorphingFigure.cropTranslateFactor));
            }
        }
    }

    public void addBodyPatternMatchConsumer(FiguresConsumer<PatternMatch> figuresConsumer) {
        if (figuresConsumer != null) {
            this.bodyPatternMatchConsumers.add(figuresConsumer);
        }
    }

    public void addCatConsumer(FiguresConsumer<CatFigure> figuresConsumer) {
        if (figuresConsumer != null) {
            this.catConsumers.add(figuresConsumer);
        }
    }

    @Override // ru.ok.gl.tf.TensorflowListener
    public void addCompositeFigureConsumer(FiguresConsumer<Figure<CompositeGesture>> figuresConsumer) {
        if (figuresConsumer != null) {
            this.compositeFigureConsumers.add(figuresConsumer);
        }
    }

    @Override // ru.ok.gl.tf.TensorflowListener
    public void addFaceConsumer(FiguresConsumer<FaceFigure> figuresConsumer) {
        if (figuresConsumer != null) {
            this.faceConsumers.add(figuresConsumer);
        }
    }

    @Override // ru.ok.gl.tf.TensorflowListener
    public void addFigureConsumer(FiguresConsumer<Figure<Gesture>> figuresConsumer) {
        if (figuresConsumer != null) {
            this.figureConsumers.add(figuresConsumer);
        }
    }

    @Override // ru.ok.gl.tf.TensorflowListener
    public void addFullSegmentationConsumer(Consumer<Bitmap> consumer) {
        if (consumer != null) {
            this.fullSegmentationConsumers.add(consumer);
        }
    }

    public void addMorphConsumer(Consumer<FaceMorphingFigure> consumer) {
        if (consumer != null) {
            this.morphingConsumers.add(consumer);
        }
    }

    public void addSkySegmentationConsumer(Consumer<Bitmap> consumer) {
        if (consumer != null) {
            this.fullSegmentationConsumers.add(consumer);
        }
    }

    public void enableDrawing(boolean z) {
        this.processor.enableDrawing(z);
    }

    public void enableSd(boolean z) {
        this.processor.enableSd(z);
    }

    public void enableSmooth(boolean z) {
        this.processor.enableSmooth(z);
    }

    public void release() {
        this.figureConsumers.clear();
        this.compositeFigureConsumers.clear();
        this.faceConsumers.clear();
        this.fullSegmentationConsumers.clear();
        this.morphingConsumers.clear();
        this.tensorflow.removeRecognitionConsumer(this.recognitionConsumer);
        this.processor.release();
    }

    public void removeBodyPatternMatchConsumer(FiguresConsumer<PatternMatch> figuresConsumer) {
        this.bodyPatternMatchConsumers.remove(figuresConsumer);
    }

    public void removeCatConsumer(FiguresConsumer<CatFigure> figuresConsumer) {
        this.catConsumers.remove(figuresConsumer);
    }

    @Override // ru.ok.gl.tf.TensorflowListener
    public void removeCompositeFigureConsumer(FiguresConsumer<Figure<CompositeGesture>> figuresConsumer) {
        this.compositeFigureConsumers.remove(figuresConsumer);
    }

    @Override // ru.ok.gl.tf.TensorflowListener
    public void removeFaceConsumer(FiguresConsumer<FaceFigure> figuresConsumer) {
        this.faceConsumers.remove(figuresConsumer);
    }

    @Override // ru.ok.gl.tf.TensorflowListener
    public void removeFigureConsumer(FiguresConsumer<Figure<Gesture>> figuresConsumer) {
        this.figureConsumers.remove(figuresConsumer);
    }

    @Override // ru.ok.gl.tf.TensorflowListener
    public void removeFullSegmentationConsumer(Consumer<Bitmap> consumer) {
        this.fullSegmentationConsumers.remove(consumer);
    }

    public void removeMorphConsumer(Consumer<FaceMorphingFigure> consumer) {
        this.morphingConsumers.remove(consumer);
    }

    public void removeSkySegmentationConsumer(Consumer<Bitmap> consumer) {
        this.fullSegmentationConsumers.remove(consumer);
    }

    public void setSize(Size size) {
        this.processor.setSize(size);
    }

    private TensorflowGestureDetector(Builder builder) {
        this.figureConsumers = new CopyOnWriteArraySet<>();
        this.compositeFigureConsumers = new CopyOnWriteArraySet<>();
        this.faceConsumers = new CopyOnWriteArraySet<>();
        this.catConsumers = new CopyOnWriteArraySet<>();
        this.bodyPatternMatchConsumers = new CopyOnWriteArraySet<>();
        this.fullSegmentationConsumers = new CopyOnWriteArraySet<>();
        this.morphingConsumers = new CopyOnWriteArraySet<>();
        Consumer5<Tensorflow, List<Recognition>, List<FaceFigure>, List<CatFigure>, Bitmap> consumer5 = new Consumer5() { // from class: xsna.aao0
            @Override // ru.ok.gl.util.Consumer5
            public final void accept(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                TensorflowGestureDetector.this.accept((Tensorflow) obj, (List) obj2, (List) obj3, (List) obj4, (Bitmap) obj5);
            }
        };
        this.recognitionConsumer = consumer5;
        Tensorflow tensorflow = builder.tensorflow;
        this.tensorflow = tensorflow;
        Processor processor = new Processor(builder.overlayView);
        this.processor = processor;
        processor.setUseMovementPrediction(true);
        processor.setClearFiguresDelay(new ScaledTime(500L, TimeUnit.MILLISECONDS));
        processor.setFiguresConsumer(new Processor.FiguresConsumer() { // from class: xsna.bao0
            @Override // ru.ok.gl.util.Consumer5
            public final void accept(Collection<? extends Figure<Gesture>> collection, Collection<? extends Figure<CompositeGesture>> collection2, Collection<? extends FaceFigure> collection3, Collection<? extends CatFigure> collection4, Bitmap bitmap) {
                TensorflowGestureDetector.this.acceptFigures(collection, collection2, collection3, collection4, bitmap);
            }
        });
        tensorflow.addRecognitionConsumer(consumer5);
        tensorflow.addSegmentationConsumer(new Consumer() { // from class: xsna.cao0
            @Override // ru.ok.gl.util.Consumer
            public final void accept(Object obj) {
                TensorflowGestureDetector.this.acceptFullSegm((Bitmap) obj);
            }
        });
        tensorflow.addFacesConsumer(new Consumer() { // from class: xsna.dao0
            @Override // ru.ok.gl.util.Consumer
            public final void accept(Object obj) {
                TensorflowGestureDetector.this.acceptFullFaces((List) obj);
            }
        });
        tensorflow.addCatsConsumer(new Consumer() { // from class: xsna.eao0
            @Override // ru.ok.gl.util.Consumer
            public final void accept(Object obj) {
                TensorflowGestureDetector.this.acceptFullCats((List) obj);
            }
        });
        tensorflow.addBodyPatternMatchConsumer(new Consumer() { // from class: xsna.fao0
            @Override // ru.ok.gl.util.Consumer
            public final void accept(Object obj) {
                TensorflowGestureDetector.this.acceptBodyPatternMatch((List) obj);
            }
        });
        tensorflow.addMorphConsumer(new Consumer() { // from class: xsna.gao0
            @Override // ru.ok.gl.util.Consumer
            public final void accept(Object obj) {
                TensorflowGestureDetector.this.acceptMorph((FaceMorphingFigure) obj);
            }
        });
    }
}
