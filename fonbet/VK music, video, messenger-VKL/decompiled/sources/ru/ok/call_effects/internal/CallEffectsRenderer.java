package ru.ok.call_effects.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import java.util.Collection;
import java.util.Map;
import kotlin.Pair;
import ru.ok.TFFrameType;
import ru.ok.call_effects.CallEffects;
import ru.ok.call_effects.Configuration;
import ru.ok.call_effects.internal.CallEffectsRenderer;
import ru.ok.call_effects.internal.mirroring.MirroringKt;
import ru.ok.call_effects.internal.tensorflow.TensorflowBitmaps;
import ru.ok.call_effects.internal.tensorflow.TensorflowConfigurator;
import ru.ok.face.entity.FaceFigure;
import ru.ok.gl.objects.FrameBuffer;
import ru.ok.gl.tf.Tensorflow;
import ru.ok.gl.tf.TensorflowSegmentationType;
import ru.ok.gl.tf.gestures.Figure;
import ru.ok.gl.tf.gestures.FiguresConsumer;
import ru.ok.gl.util.Consumer;
import ru.ok.gl.util.FrameHolder;
import ru.ok.gl.util.GlThread;
import ru.ok.gl.util.Logger;
import ru.ok.tensorflow.entity.CompositeGesture;
import ru.ok.tensorflow.entity.Gesture;
import xsna.fs2;
import xsna.gs2;
import xsna.kv2;
import xsna.pn00;
import xsna.w29;
import xsna.zcl;
import xsna.zy60;

/* compiled from: CallEffectsRenderer.kt */
/* loaded from: classes9.dex */
public final class CallEffectsRenderer {
    public static final Companion Companion = new Companion(null);
    private static final String LOG_TAG = "CallEffects";
    private final BeautyFilterEffect beautyFilterEffect;
    private int bigFrame;
    private final EffectsFrameBuffers frameBuffers;
    private FiguresConsumer<Figure<? extends Object>> gesturesConsumer;
    private final Handler glThreadHandler;
    private final ICQMasksEffect icqMasksEffect;
    private boolean isPreviousCameraBufferSaved;
    private boolean isReleased;
    private final Logger logger;
    private int normalFrame;
    private final boolean shouldReleaseTensorflowConfigurator;
    private boolean shouldSkipFirstRenderResult;
    private int smallFrame;
    private final TensorflowBitmaps tensorflowBitmaps;
    private final TensorflowConfigurator tensorflowConfigurator;
    private final TimeIntervalValidator timeIntervalValidator;
    private final VirtualBackgroundEffect virtualBackgroundEffect;

    /* compiled from: CallEffectsRenderer.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    @GlThread
    public CallEffectsRenderer(Context context, Logger logger, TensorflowSegmentationType tensorflowSegmentationType, TensorflowConfigurator tensorflowConfigurator, boolean z, Configuration configuration) {
        this.logger = logger;
        this.tensorflowConfigurator = tensorflowConfigurator;
        this.shouldReleaseTensorflowConfigurator = z;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            throw new IllegalStateException("Create instance of CallEffects on GL thread");
        }
        Handler handler = new Handler(myLooper);
        this.glThreadHandler = handler;
        this.virtualBackgroundEffect = new VirtualBackgroundEffect(context, handler);
        this.beautyFilterEffect = new BeautyFilterEffect(context, handler, configuration);
        this.icqMasksEffect = new ICQMasksEffect(context, handler);
        this.tensorflowBitmaps = new TensorflowBitmaps(context, tensorflowSegmentationType);
        this.frameBuffers = new EffectsFrameBuffers(context);
        this.shouldSkipFirstRenderResult = true;
        this.timeIntervalValidator = new TimeIntervalValidator(1000L);
        tensorflowConfigurator.setListeners(new Consumer() { // from class: xsna.x29
            @Override // ru.ok.gl.util.Consumer
            public final void accept(Object obj) {
                CallEffectsRenderer.this.handleFullSegmentation((Bitmap) obj);
            }
        }, new FiguresConsumer() { // from class: xsna.y29
            @Override // ru.ok.gl.tf.gestures.FiguresConsumer
            public final void accept(Collection collection) {
                CallEffectsRenderer.this.handleFaceMeshes(collection);
            }
        }, new FiguresConsumer() { // from class: xsna.z29
            @Override // ru.ok.gl.tf.gestures.FiguresConsumer
            public final void accept(Collection collection) {
                CallEffectsRenderer.this.handleGestures(collection);
            }
        }, new FiguresConsumer() { // from class: xsna.a39
            @Override // ru.ok.gl.tf.gestures.FiguresConsumer
            public final void accept(Collection collection) {
                CallEffectsRenderer.this.handleCompositeGestures(collection);
            }
        });
    }

    private final CallEffects.Result applyEffect(CallEffects.Frame frame, CallEffects.MirroringParameters mirroringParameters) {
        CallEffects.Result result;
        if (this.isPreviousCameraBufferSaved) {
            this.tensorflowConfigurator.setFrameSize(Call_effects_frame_extensionsKt.getRotatedSize(frame));
            result = applyEffectToPreviousCameraBuffer(frame, mirroringParameters);
        } else {
            result = null;
        }
        this.frameBuffers.saveCameraFrame(frame, mirroringParameters);
        this.isPreviousCameraBufferSaved = true;
        return result;
    }

    private final CallEffects.Result applyEffectToPreviousCameraBuffer(CallEffects.Frame frame, CallEffects.MirroringParameters mirroringParameters) {
        Size rotatedSize = Call_effects_frame_extensionsKt.getRotatedSize(frame);
        FrameBuffer lastCameraFrameBuffer = this.frameBuffers.getLastCameraFrameBuffer();
        if (lastCameraFrameBuffer == null) {
            return null;
        }
        boolean shouldMirrorEffect = MirroringKt.shouldMirrorEffect(frame, mirroringParameters);
        if (this.beautyFilterEffect.isEnabled()) {
            this.beautyFilterEffect.render(lastCameraFrameBuffer, shouldMirrorEffect, frame.isFrontCamera());
        }
        if (this.virtualBackgroundEffect.isEnabled()) {
            this.virtualBackgroundEffect.render(lastCameraFrameBuffer, frame.isFrontCamera(), frame.isFrontCamera());
        }
        if (this.icqMasksEffect.isEnabled()) {
            this.icqMasksEffect.render(lastCameraFrameBuffer, frame.isFrontCamera(), frame.isFrontCamera());
        }
        FrameBuffer resultFrameBuffer = this.frameBuffers.getResultFrameBuffer(rotatedSize);
        this.frameBuffers.copy(lastCameraFrameBuffer, resultFrameBuffer);
        if (this.shouldSkipFirstRenderResult) {
            this.shouldSkipFirstRenderResult = false;
            return null;
        }
        Matrix matrix = new Matrix();
        if (MirroringKt.shouldMirrorFrame(frame, mirroringParameters)) {
            matrix.setScale(-1.0f, 1.0f, 0.5f, 0.5f);
        }
        return new CallEffects.Result(resultFrameBuffer.getTextureId(), rotatedSize, matrix);
    }

    private final boolean configureTensorflow(boolean z, boolean z2, boolean z3, boolean z4) {
        boolean tryConfigureTensorflow = (z || z2 || z3) ? this.tensorflowConfigurator.tryConfigureTensorflow(z, z2 ? 1 : 0, z4) : false;
        Logger logger = this.logger;
        if (logger != null) {
            logger.d(LOG_TAG, "isTensorflowConfigured: " + tryConfigureTensorflow);
        }
        return tryConfigureTensorflow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: disableBeautyFilter$lambda-3, reason: not valid java name */
    public static final void m392disableBeautyFilter$lambda3(CallEffectsRenderer callEffectsRenderer) {
        try {
            callEffectsRenderer.beautyFilterEffect.disable();
            callEffectsRenderer.resetFlagsIfDisabled();
        } catch (Throwable th) {
            Logger logger = callEffectsRenderer.logger;
            if (logger != null) {
                logger.e(LOG_TAG, "can't disable beauty filter", th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleCompositeGestures(Collection<? extends Figure<CompositeGesture>> collection) {
        FiguresConsumer<Figure<? extends Object>> figuresConsumer = this.gesturesConsumer;
        if (figuresConsumer != null) {
            figuresConsumer.accept(collection);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleFaceMeshes(Collection<? extends FaceFigure> collection) {
        if (this.icqMasksEffect.isEnabled()) {
            this.icqMasksEffect.handleFaceMeshes(collection);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleFullSegmentation(Bitmap bitmap) {
        if (bitmap != null) {
            this.virtualBackgroundEffect.handleFullSegmentation(bitmap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleGestures(Collection<? extends Figure<Gesture>> collection) {
        FiguresConsumer<Figure<? extends Object>> figuresConsumer = this.gesturesConsumer;
        if (figuresConsumer != null) {
            figuresConsumer.accept(collection);
        }
    }

    private final boolean initTensorflowGpu(boolean z, boolean z2) {
        Tensorflow tensorflow = this.tensorflowConfigurator.getTensorflow();
        boolean z3 = false;
        if (tensorflow == null) {
            return false;
        }
        if (z && z2) {
            Tensorflow tensorflow2 = this.tensorflowConfigurator.getTensorflow();
            if (tensorflow2 != null) {
                tensorflow2.tryStartInitGpu();
            }
            if (tensorflow.isReady() && tensorflow.isPersonSegmentationGpued()) {
                z3 = true;
            }
        }
        Logger logger = this.logger;
        if (logger != null) {
            logger.d(LOG_TAG, "tensorflow GPU initialized: " + z3);
        }
        return z3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void releaseInternal() {
        if (this.isReleased) {
            return;
        }
        try {
            if (this.shouldReleaseTensorflowConfigurator) {
                this.tensorflowConfigurator.release();
            }
            this.tensorflowBitmaps.release();
            this.frameBuffers.release();
            this.virtualBackgroundEffect.release();
            this.icqMasksEffect.release();
        } catch (Throwable th) {
            Logger logger = this.logger;
            if (logger != null) {
                logger.e(LOG_TAG, "release failed", th);
            }
        }
        this.isReleased = true;
    }

    private final void resetFlagsIfDisabled() {
        if (this.virtualBackgroundEffect.isEnabled() || this.beautyFilterEffect.isEnabled() || this.icqMasksEffect.isEnabled()) {
            return;
        }
        this.isPreviousCameraBufferSaved = false;
        this.shouldSkipFirstRenderResult = true;
    }

    private final CallEffects.Result tryApplyEffect(CallEffects.Frame frame, CallEffects.Effect effect, CallEffects.Effect effect2, CallEffects.BeautyFilter beautyFilter, CallEffects.MirroringParameters mirroringParameters, boolean z, boolean z2) {
        Logger logger;
        Logger logger2;
        Logger logger3;
        Logger logger4;
        boolean z3 = false;
        boolean z4 = effect != null;
        boolean z5 = effect2 != null;
        boolean z6 = z && this.timeIntervalValidator.checkIsTimeIntervalPassed();
        boolean z7 = z4 | z5 | z6;
        Logger logger5 = this.logger;
        if (logger5 != null) {
            logger5.d(LOG_TAG, zy60.c("shouldUseTensorflow: ", " shouldUseTensorflowFace: ", z4, z5));
        }
        boolean configureTensorflow = configureTensorflow(z4, z5, z6, z2);
        boolean tryInitFrameBuffers = this.frameBuffers.tryInitFrameBuffers(frame);
        if (!tryInitFrameBuffers) {
            Logger logger6 = this.logger;
            if (logger6 != null) {
                logger6.d(LOG_TAG, "isFrameBuffersReady: " + tryInitFrameBuffers);
            }
            return null;
        }
        boolean initTensorflowGpu = initTensorflowGpu(z7, configureTensorflow);
        Size rotatedSize = Call_effects_frame_extensionsKt.getRotatedSize(frame);
        if (configureTensorflow && initTensorflowGpu) {
            z3 = true;
        }
        if (effect != null && z3 && !this.virtualBackgroundEffect.trySelectEffect(effect, rotatedSize) && (logger4 = this.logger) != null) {
            logger4.d(LOG_TAG, "virtual background can't select effect");
        }
        if (effect2 != null && !this.icqMasksEffect.trySelectMask(effect2, rotatedSize) && (logger3 = this.logger) != null) {
            logger3.d(LOG_TAG, "maskengine can't enable itself");
        }
        if (beautyFilter != null && !this.beautyFilterEffect.trySetEnabled(beautyFilter, rotatedSize) && (logger2 = this.logger) != null) {
            logger2.d(LOG_TAG, "beauty filter can't enable itself");
        }
        if (z7 && configureTensorflow && !tryFitFrameToTensorflow(frame, mirroringParameters) && (logger = this.logger) != null) {
            logger.d(LOG_TAG, "can't fit frame to tensorflow");
        }
        if (effect2 == null && beautyFilter == null && effect == null) {
            return null;
        }
        return applyEffect(frame, mirroringParameters);
    }

    private final boolean tryFitFrameToTensorflow(CallEffects.Frame frame, CallEffects.MirroringParameters mirroringParameters) {
        FrameHolder frameHolder;
        boolean z;
        FrameHolder frameHolder2;
        Tensorflow tensorflow = this.tensorflowConfigurator.getTensorflow();
        if (tensorflow == null) {
            return false;
        }
        TFFrameType tFFrameType = TFFrameType.BIG;
        int useFrame = tensorflow.useFrame(tFFrameType);
        TFFrameType tFFrameType2 = TFFrameType.NORMAL;
        int useFrame2 = tensorflow.useFrame(tFFrameType2);
        TFFrameType tFFrameType3 = TFFrameType.SMALL;
        int useFrame3 = tensorflow.useFrame(tFFrameType3);
        this.tensorflowBitmaps.setMirroringParameters(mirroringParameters);
        FrameHolder frameHolder3 = null;
        if (useFrame3 != 0) {
            frameHolder = this.tensorflowBitmaps.createSmallFrameHolder(frame, (useFrame3 & 1) == 1, (useFrame3 & 2) == 2);
            if (frameHolder == null) {
                return false;
            }
        } else {
            frameHolder = null;
        }
        if (tensorflow.isFrameRequired(tFFrameType2)) {
            z = false;
            frameHolder2 = this.tensorflowBitmaps.createNormalFrameHolder(frame, (useFrame2 & 1) == 1, (useFrame2 & 2) == 2);
            if (frameHolder2 == null) {
                return false;
            }
        } else {
            z = false;
            frameHolder2 = null;
        }
        if (tensorflow.isFrameRequired(tFFrameType)) {
            frameHolder3 = this.tensorflowBitmaps.createBigFrameHolder(frame, (useFrame & 1) == 1 ? true : z, (useFrame & 2) == 2 ? true : z);
            if (frameHolder3 == null) {
                return z;
            }
        }
        this.bigFrame = useFrame;
        this.normalFrame = useFrame2;
        this.smallFrame = useFrame3;
        Map<TFFrameType, FrameHolder> k = pn00.k(new Pair(tFFrameType, frameHolder3), new Pair(tFFrameType2, frameHolder2), new Pair(tFFrameType3, frameHolder));
        Tensorflow tensorflow2 = this.tensorflowConfigurator.getTensorflow();
        if (tensorflow2 != null) {
            tensorflow2.acceptTens(k);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: unselectMaskEffect$lambda-2, reason: not valid java name */
    public static final void m394unselectMaskEffect$lambda2(CallEffectsRenderer callEffectsRenderer) {
        try {
            callEffectsRenderer.icqMasksEffect.unselectEffect();
            callEffectsRenderer.resetFlagsIfDisabled();
        } catch (Throwable th) {
            Logger logger = callEffectsRenderer.logger;
            if (logger != null) {
                logger.e(LOG_TAG, "can't unselect effect", th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: unselectVirtualBackgroundEffect$lambda-1, reason: not valid java name */
    public static final void m395unselectVirtualBackgroundEffect$lambda1(CallEffectsRenderer callEffectsRenderer) {
        try {
            callEffectsRenderer.virtualBackgroundEffect.unselectEffect();
            callEffectsRenderer.resetFlagsIfDisabled();
        } catch (Throwable th) {
            Logger logger = callEffectsRenderer.logger;
            if (logger != null) {
                logger.e(LOG_TAG, "can't unselect effect", th);
            }
        }
    }

    @GlThread
    public final CallEffects.Result apply(CallEffects.Frame frame, CallEffects.Effect effect, CallEffects.Effect effect2, CallEffects.BeautyFilter beautyFilter, CallEffects.MirroringParameters mirroringParameters, boolean z, boolean z2) {
        boolean z3 = (effect == null && beautyFilter == null && effect2 == null && !z) ? false : true;
        if (this.isReleased || !z3) {
            return null;
        }
        try {
            return tryApplyEffect(frame, effect, effect2, beautyFilter, mirroringParameters, z, z2);
        } catch (Throwable th) {
            Logger logger = this.logger;
            if (logger != null) {
                logger.e(LOG_TAG, "can't apply effect to frame", th);
            }
            return null;
        }
    }

    public final void disableBeautyFilter() {
        this.glThreadHandler.post(new w29(this, 0));
    }

    public final void release() {
        this.glThreadHandler.post(new kv2(this, 1));
    }

    public final void setGesturesConsumer(FiguresConsumer<Figure<? extends Object>> figuresConsumer) {
        this.gesturesConsumer = figuresConsumer;
    }

    public final void setMaskEngineModelPath(String str) {
        this.icqMasksEffect.setEngineModelPath(str);
    }

    public final void unselectMaskEffect() {
        this.glThreadHandler.post(new gs2(this, 4));
    }

    public final void unselectVirtualBackgroundEffect() {
        this.glThreadHandler.post(new fs2(this, 2));
    }
}
