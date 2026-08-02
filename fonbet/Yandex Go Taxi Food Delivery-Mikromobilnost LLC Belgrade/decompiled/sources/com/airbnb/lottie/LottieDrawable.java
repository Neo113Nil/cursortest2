package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.configurations.reducemotion.ReducedMotionMode;
import com.airbnb.lottie.model.content.LBlendMode;
import com.airbnb.lottie.model.layer.Layer$LayerType;
import com.airbnb.lottie.model.layer.Layer$MatteType;
import com.airbnb.lottie.utils.LottieValueAnimator;
import defpackage.anm;
import defpackage.ayr;
import defpackage.cuz;
import defpackage.eud;
import defpackage.fbz;
import defpackage.ge2;
import defpackage.h8v;
import defpackage.hes0;
import defpackage.htz;
import defpackage.hzk;
import defpackage.i8v;
import defpackage.l35;
import defpackage.lgz;
import defpackage.ltz;
import defpackage.mwa0;
import defpackage.mxx;
import defpackage.nsz;
import defpackage.ntz;
import defpackage.ny61;
import defpackage.ouz;
import defpackage.oyr;
import defpackage.puz;
import defpackage.pxx;
import defpackage.six;
import defpackage.sly0;
import defpackage.ssu;
import defpackage.stz;
import defpackage.ti20;
import defpackage.upx;
import defpackage.utz;
import defpackage.wtz;
import defpackage.xw00;
import defpackage.xxr;
import defpackage.yd2;
import defpackage.zw21;
import defpackage.zxi0;
import defpackage.zxr;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public class LottieDrawable extends Drawable implements Drawable.Callback, Animatable {
    public static final int INFINITE = -1;
    private static final float MAX_DELTA_MS_ASYNC_SET_PROGRESS = 50.0f;
    private static final long MAX_SOFTWARE_BITMAP_PIXELS = 50000000;
    public static final int RESTART = 1;
    public static final int REVERSE = 2;
    private static final boolean invalidateSelfOnMainThread = false;
    private int alpha;
    private final LottieValueAnimator animator;
    private AsyncUpdates asyncUpdates;
    private Rect canvasClipBounds;
    private RectF canvasClipBoundsRectF;
    private boolean clipTextToBoundingBox;
    private boolean clipToCompositionBounds;
    private nsz composition;
    private eud compositionLayer;
    String defaultFontFileExtension;
    zxr fontAssetDelegate;
    private ayr fontAssetManager;
    private Map<String, Typeface> fontMap;
    private boolean ignoreSystemAnimationsDisabled;
    private h8v imageAssetDelegate;
    private i8v imageAssetManager;
    private String imageAssetsFolder;
    private Runnable invalidateSelfRunnable;
    private boolean isApplyingOpacityToLayersEnabled;
    private boolean isApplyingShadowToLayersEnabled;
    private boolean isDirty;
    private float lastDrawnProgress;
    private final ArrayList<stz> lazyCompositionTasks;
    private final utz lottieFeatureFlags;
    private Handler mainThreadHandler;
    private boolean maintainOriginalImageBounds;
    private OnVisibleAction onVisibleAction;
    private boolean outlineMasksAndMattes;
    private boolean performanceTrackingEnabled;
    private final ValueAnimator.AnimatorUpdateListener progressUpdateListener;
    private RenderMode renderMode;
    private final Matrix renderingMatrix;
    private boolean safeMode;
    private final Semaphore setProgressDrawLock;
    private Bitmap softwareRenderingBitmap;
    private Canvas softwareRenderingCanvas;
    private Rect softwareRenderingDstBoundsRect;
    private RectF softwareRenderingDstBoundsRectF;
    private Matrix softwareRenderingOriginalCanvasMatrix;
    private float[] softwareRenderingOriginalCanvasMatrixElements;
    private Matrix softwareRenderingOriginalCanvasMatrixInverse;
    private Paint softwareRenderingPaint;
    private Rect softwareRenderingSrcBoundsRect;
    private RectF softwareRenderingTransformedBounds;
    private boolean systemAnimationsEnabled;
    sly0 textDelegate;
    private final Runnable updateProgressRunnable;
    private boolean useSoftwareRendering;
    private static final List<String> ALLOWED_REDUCED_MOTION_MARKERS = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
    private static final Executor setProgressExecutor = new ThreadPoolExecutor(0, 2, 35, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ouz());

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class OnVisibleAction {
        private static final /* synthetic */ OnVisibleAction[] $VALUES;
        public static final OnVisibleAction NONE;
        public static final OnVisibleAction PLAY;
        public static final OnVisibleAction RESUME;

        static {
            OnVisibleAction onVisibleAction = new OnVisibleAction(JCP.RAW_PREFIX, 0);
            NONE = onVisibleAction;
            OnVisibleAction onVisibleAction2 = new OnVisibleAction("PLAY", 1);
            PLAY = onVisibleAction2;
            OnVisibleAction onVisibleAction3 = new OnVisibleAction("RESUME", 2);
            RESUME = onVisibleAction3;
            $VALUES = new OnVisibleAction[]{onVisibleAction, onVisibleAction2, onVisibleAction3};
        }

        public static OnVisibleAction valueOf(String str) {
            return (OnVisibleAction) Enum.valueOf(OnVisibleAction.class, str);
        }

        public static OnVisibleAction[] values() {
            return (OnVisibleAction[]) $VALUES.clone();
        }
    }

    public LottieDrawable() {
        LottieValueAnimator lottieValueAnimator = new LottieValueAnimator();
        this.animator = lottieValueAnimator;
        this.systemAnimationsEnabled = true;
        this.ignoreSystemAnimationsDisabled = false;
        this.safeMode = false;
        this.onVisibleAction = OnVisibleAction.NONE;
        this.lazyCompositionTasks = new ArrayList<>();
        this.lottieFeatureFlags = new utz();
        this.maintainOriginalImageBounds = false;
        this.clipToCompositionBounds = true;
        this.alpha = 255;
        this.clipTextToBoundingBox = false;
        this.renderMode = RenderMode.AUTOMATIC;
        this.useSoftwareRendering = false;
        this.renderingMatrix = new Matrix();
        this.softwareRenderingOriginalCanvasMatrixElements = new float[9];
        this.isDirty = false;
        yd2 yd2Var = new yd2(2, this);
        this.progressUpdateListener = yd2Var;
        this.setProgressDrawLock = new Semaphore(1);
        this.updateProgressRunnable = new ssu(6, this);
        this.lastDrawnProgress = -3.4028235E38f;
        lottieValueAnimator.addUpdateListener(yd2Var);
    }

    private void buildCompositionLayer() {
        nsz nszVar = this.composition;
        if (nszVar == null) {
            return;
        }
        hzk hzkVar = pxx.a;
        Rect rect = nszVar.k;
        List list = Collections.EMPTY_LIST;
        eud eudVar = new eud(this, new mxx(list, nszVar, "__container", -1L, Layer$LayerType.PRE_COMP, -1L, null, list, new ge2(), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, list, Layer$MatteType.NONE, null, false, null, null, LBlendMode.NORMAL), nszVar.j, nszVar);
        this.compositionLayer = eudVar;
        if (this.outlineMasksAndMattes) {
            eudVar.o(true);
        }
        this.compositionLayer.M = this.clipToCompositionBounds;
    }

    private void computeRenderMode() {
        nsz nszVar = this.composition;
        if (nszVar == null) {
            return;
        }
        RenderMode renderMode = this.renderMode;
        int i = nszVar.o;
        renderMode.getClass();
        int i2 = zxi0.a[renderMode.ordinal()];
        boolean z = false;
        if (i2 != 1 && (i2 == 2 || i > 4)) {
            z = true;
        }
        this.useSoftwareRendering = z;
    }

    private void convertRect(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    private void drawDirectlyToCanvas(Canvas canvas) {
        eud eudVar = this.compositionLayer;
        nsz nszVar = this.composition;
        if (eudVar == null || nszVar == null) {
            return;
        }
        this.renderingMatrix.reset();
        if (!getBounds().isEmpty()) {
            this.renderingMatrix.preTranslate(r2.left, r2.top);
            this.renderingMatrix.preScale(r2.width() / nszVar.k.width(), r2.height() / nszVar.k.height());
        }
        eudVar.f(canvas, this.renderingMatrix, this.alpha, null);
    }

    private void ensureSoftwareRenderingBitmap(int i, int i2) {
        Bitmap bitmap = this.softwareRenderingBitmap;
        if (bitmap == null || bitmap.getWidth() < i || this.softwareRenderingBitmap.getHeight() < i2) {
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            this.softwareRenderingBitmap = createBitmap;
            this.softwareRenderingCanvas.setBitmap(createBitmap);
            this.isDirty = true;
            return;
        }
        if (this.softwareRenderingBitmap.getWidth() > i || this.softwareRenderingBitmap.getHeight() > i2) {
            Bitmap createBitmap2 = Bitmap.createBitmap(this.softwareRenderingBitmap, 0, 0, i, i2);
            this.softwareRenderingBitmap = createBitmap2;
            this.softwareRenderingCanvas.setBitmap(createBitmap2);
            this.isDirty = true;
        }
    }

    private void ensureSoftwareRenderingObjectsInitialized() {
        if (this.softwareRenderingCanvas != null) {
            return;
        }
        this.softwareRenderingCanvas = new Canvas();
        this.softwareRenderingTransformedBounds = new RectF();
        this.softwareRenderingOriginalCanvasMatrix = new Matrix();
        this.softwareRenderingOriginalCanvasMatrixInverse = new Matrix();
        this.canvasClipBounds = new Rect();
        this.canvasClipBoundsRectF = new RectF();
        this.softwareRenderingPaint = new LPaint();
        this.softwareRenderingSrcBoundsRect = new Rect();
        this.softwareRenderingDstBoundsRect = new Rect();
        this.softwareRenderingDstBoundsRectF = new RectF();
    }

    private Context getContext() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    private ayr getFontAssetManager() {
        if (getCallback() == null) {
            return null;
        }
        if (this.fontAssetManager == null) {
            ayr ayrVar = new ayr(getCallback(), this.fontAssetDelegate);
            this.fontAssetManager = ayrVar;
            String str = this.defaultFontFileExtension;
            if (str != null) {
                ayrVar.b(str);
            }
        }
        return this.fontAssetManager;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
    
        if (r1 == r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
    
        if (r0 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        r4.imageAssetManager = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private i8v getImageAssetManager() {
        i8v i8vVar = this.imageAssetManager;
        if (i8vVar != null) {
            Context context = getContext();
            Context context2 = i8vVar.a;
            if (context != null) {
                if (context2 instanceof Application) {
                    context = context.getApplicationContext();
                }
            }
        }
        if (this.imageAssetManager == null) {
            this.imageAssetManager = new i8v(getCallback(), this.imageAssetsFolder, this.composition.c());
        }
        return this.imageAssetManager;
    }

    private boolean ignoreCanvasClipBounds() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            return false;
        }
        if (((View) callback).getParent() instanceof ViewGroup) {
            return !((ViewGroup) r2).getClipChildren();
        }
        return false;
    }

    private static boolean isFinite(float f) {
        return (Float.isNaN(f) || Float.isInfinite(f)) ? false : true;
    }

    private static boolean isFiniteRect(RectF rectF) {
        return isFinite(rectF.left) && isFinite(rectF.top) && isFinite(rectF.right) && isFinite(rectF.bottom);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addValueCallback$17(six sixVar, Object obj, puz puzVar, nsz nszVar) {
        addValueCallback(sixVar, (six) obj, puzVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(ValueAnimator valueAnimator) {
        if (getAsyncUpdatesEnabled()) {
            invalidateSelf();
            return;
        }
        eud eudVar = this.compositionLayer;
        if (eudVar != null) {
            eudVar.p(this.animator.getAnimatedValueAbsolute());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1() {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2() {
        eud eudVar = this.compositionLayer;
        if (eudVar == null) {
            return;
        }
        try {
            this.setProgressDrawLock.acquire();
            eudVar.p(this.animator.getAnimatedValueAbsolute());
            if (invalidateSelfOnMainThread && this.isDirty) {
                if (this.mainThreadHandler == null) {
                    this.mainThreadHandler = new Handler(Looper.getMainLooper());
                    this.invalidateSelfRunnable = new fbz(7, this);
                }
                this.mainThreadHandler.post(this.invalidateSelfRunnable);
            }
        } catch (InterruptedException unused) {
        } catch (Throwable th) {
            this.setProgressDrawLock.release();
            throw th;
        }
        this.setProgressDrawLock.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$playAnimation$3(nsz nszVar) {
        playAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$resumeAnimation$4(nsz nszVar) {
        resumeAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setFrame$15(int i, nsz nszVar) {
        setFrame(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMaxFrame$10(String str, nsz nszVar) {
        setMaxFrame(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMaxFrame$7(int i, nsz nszVar) {
        setMaxFrame(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMaxProgress$8(float f, nsz nszVar) {
        setMaxProgress(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMinAndMaxFrame$11(String str, nsz nszVar) {
        setMinAndMaxFrame(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMinAndMaxFrame$12(String str, String str2, boolean z, nsz nszVar) {
        setMinAndMaxFrame(str, str2, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMinAndMaxFrame$13(int i, int i2, nsz nszVar) {
        setMinAndMaxFrame(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMinAndMaxProgress$14(float f, float f2, nsz nszVar) {
        setMinAndMaxProgress(f, f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMinFrame$5(int i, nsz nszVar) {
        setMinFrame(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMinFrame$9(String str, nsz nszVar) {
        setMinFrame(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMinProgress$6(float f, nsz nszVar) {
        setMinProgress(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setProgress$16(float f, nsz nszVar) {
        setProgress(f);
    }

    private void renderAndDrawAsBitmap(Canvas canvas, eud eudVar) {
        if (this.composition == null || eudVar == null) {
            return;
        }
        ensureSoftwareRenderingObjectsInitialized();
        canvas.getMatrix(this.softwareRenderingOriginalCanvasMatrix);
        canvas.getClipBounds(this.canvasClipBounds);
        convertRect(this.canvasClipBounds, this.canvasClipBoundsRectF);
        this.softwareRenderingOriginalCanvasMatrix.mapRect(this.canvasClipBoundsRectF);
        convertRect(this.canvasClipBoundsRectF, this.canvasClipBounds);
        boolean z = this.clipToCompositionBounds;
        RectF rectF = this.softwareRenderingTransformedBounds;
        if (z) {
            rectF.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            eudVar.b(rectF, null, false);
        }
        this.softwareRenderingOriginalCanvasMatrix.mapRect(this.softwareRenderingTransformedBounds);
        Rect bounds = getBounds();
        float width = bounds.width() / getIntrinsicWidth();
        float height = bounds.height() / getIntrinsicHeight();
        scaleRect(this.softwareRenderingTransformedBounds, width, height);
        if (!ignoreCanvasClipBounds()) {
            RectF rectF2 = this.softwareRenderingTransformedBounds;
            Rect rect = this.canvasClipBounds;
            rectF2.intersect(rect.left, rect.top, rect.right, rect.bottom);
        }
        if (!isFiniteRect(this.softwareRenderingTransformedBounds)) {
            lgz.b("Skipping software rendering: transformed bounds contain non-finite values.");
            return;
        }
        int ceil = (int) Math.ceil(this.softwareRenderingTransformedBounds.width());
        int ceil2 = (int) Math.ceil(this.softwareRenderingTransformedBounds.height());
        if (ceil <= 0 || ceil2 <= 0) {
            lgz.b("Skipping software rendering: transformed bounds have negative values.");
            return;
        }
        long j = ceil * ceil2;
        if (j > MAX_SOFTWARE_BITMAP_PIXELS) {
            lgz.b("Skipping software rendering: bitmap request exceeds safe pixel count (" + j + Extension.C_BRAKE);
            return;
        }
        ensureSoftwareRenderingBitmap(ceil, ceil2);
        if (this.isDirty) {
            this.softwareRenderingOriginalCanvasMatrix.getValues(this.softwareRenderingOriginalCanvasMatrixElements);
            float[] fArr = this.softwareRenderingOriginalCanvasMatrixElements;
            float f = fArr[0];
            float f2 = fArr[4];
            this.renderingMatrix.set(this.softwareRenderingOriginalCanvasMatrix);
            this.renderingMatrix.preScale(width, height);
            Matrix matrix = this.renderingMatrix;
            RectF rectF3 = this.softwareRenderingTransformedBounds;
            matrix.postTranslate(-rectF3.left, -rectF3.top);
            this.renderingMatrix.postScale(1.0f / f, 1.0f / f2);
            this.softwareRenderingBitmap.eraseColor(0);
            this.softwareRenderingCanvas.setMatrix(zw21.a);
            this.softwareRenderingCanvas.scale(f, f2);
            eudVar.f(this.softwareRenderingCanvas, this.renderingMatrix, this.alpha, null);
            this.softwareRenderingOriginalCanvasMatrix.invert(this.softwareRenderingOriginalCanvasMatrixInverse);
            this.softwareRenderingOriginalCanvasMatrixInverse.mapRect(this.softwareRenderingDstBoundsRectF, this.softwareRenderingTransformedBounds);
            convertRect(this.softwareRenderingDstBoundsRectF, this.softwareRenderingDstBoundsRect);
        }
        this.softwareRenderingSrcBoundsRect.set(0, 0, ceil, ceil2);
        canvas.drawBitmap(this.softwareRenderingBitmap, this.softwareRenderingSrcBoundsRect, this.softwareRenderingDstBoundsRect, this.softwareRenderingPaint);
    }

    private void scaleRect(RectF rectF, float f, float f2) {
        rectF.set(rectF.left * f, rectF.top * f2, rectF.right * f, rectF.bottom * f2);
    }

    private boolean shouldSetProgressBeforeDrawing() {
        nsz nszVar = this.composition;
        if (nszVar == null) {
            return false;
        }
        float f = this.lastDrawnProgress;
        float animatedValueAbsolute = this.animator.getAnimatedValueAbsolute();
        this.lastDrawnProgress = animatedValueAbsolute;
        return Math.abs(animatedValueAbsolute - f) * nszVar.b() >= MAX_DELTA_MS_ASYNC_SET_PROGRESS;
    }

    public void addAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.animator.addListener(animatorListener);
    }

    public void addAnimatorPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.animator.addPauseListener(animatorPauseListener);
    }

    public void addAnimatorUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.animator.addUpdateListener(animatorUpdateListener);
    }

    public <T> void addValueCallback(final six sixVar, final T t, final puz puzVar) {
        eud eudVar = this.compositionLayer;
        if (eudVar == null) {
            this.lazyCompositionTasks.add(new stz() { // from class: mtz
                @Override // defpackage.stz
                public final void a(nsz nszVar) {
                    LottieDrawable.this.lambda$addValueCallback$17(sixVar, t, puzVar, nszVar);
                }
            });
            return;
        }
        boolean z = true;
        if (sixVar == six.c) {
            eudVar.g(puzVar, t);
        } else if (sixVar.c() != null) {
            sixVar.c().g(puzVar, t);
        } else {
            List<six> resolveKeyPath = resolveKeyPath(sixVar);
            for (int i = 0; i < resolveKeyPath.size(); i++) {
                resolveKeyPath.get(i).c().g(puzVar, t);
            }
            z = true ^ resolveKeyPath.isEmpty();
        }
        if (z) {
            invalidateSelf();
            if (t == cuz.C) {
                setProgress(getProgress());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean animationsEnabled(Context context) {
        ReducedMotionMode reducedMotionMode;
        if (this.ignoreSystemAnimationsDisabled) {
            return true;
        }
        if (!this.systemAnimationsEnabled) {
            return false;
        }
        upx.d.getClass();
        if (context != null) {
            Matrix matrix = zw21.a;
            if (Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f) {
                reducedMotionMode = ReducedMotionMode.REDUCED_MOTION;
                return reducedMotionMode != ReducedMotionMode.STANDARD_MOTION;
            }
        }
        reducedMotionMode = ReducedMotionMode.STANDARD_MOTION;
        if (reducedMotionMode != ReducedMotionMode.STANDARD_MOTION) {
        }
    }

    public void cancelAnimation() {
        this.lazyCompositionTasks.clear();
        this.animator.cancel();
        if (isVisible()) {
            return;
        }
        this.onVisibleAction = OnVisibleAction.NONE;
    }

    public void clearComposition() {
        if (this.animator.isRunning()) {
            this.animator.cancel();
            if (!isVisible()) {
                this.onVisibleAction = OnVisibleAction.NONE;
            }
        }
        this.composition = null;
        this.compositionLayer = null;
        this.imageAssetManager = null;
        this.lastDrawnProgress = -3.4028235E38f;
        this.animator.clearComposition();
        invalidateSelf();
    }

    @Deprecated
    public void disableExtraScaleModeInFitXY() {
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        eud eudVar = this.compositionLayer;
        if (eudVar == null) {
            return;
        }
        boolean asyncUpdatesEnabled = getAsyncUpdatesEnabled();
        if (asyncUpdatesEnabled) {
            try {
                this.setProgressDrawLock.acquire();
            } catch (InterruptedException unused) {
                AsyncUpdates asyncUpdates = upx.a;
                if (!asyncUpdatesEnabled) {
                    return;
                }
                this.setProgressDrawLock.release();
                if (eudVar.L == this.animator.getAnimatedValueAbsolute()) {
                    return;
                }
            } catch (Throwable th) {
                AsyncUpdates asyncUpdates2 = upx.a;
                if (asyncUpdatesEnabled) {
                    this.setProgressDrawLock.release();
                    if (eudVar.L != this.animator.getAnimatedValueAbsolute()) {
                        setProgressExecutor.execute(this.updateProgressRunnable);
                    }
                }
                throw th;
            }
        }
        AsyncUpdates asyncUpdates3 = upx.a;
        if (asyncUpdatesEnabled && shouldSetProgressBeforeDrawing()) {
            setProgress(this.animator.getAnimatedValueAbsolute());
        }
        boolean z = this.safeMode;
        boolean z2 = this.useSoftwareRendering;
        if (z) {
            try {
                if (z2) {
                    renderAndDrawAsBitmap(canvas, eudVar);
                } else {
                    drawDirectlyToCanvas(canvas);
                }
            } catch (Throwable unused2) {
                lgz.a.getClass();
                AsyncUpdates asyncUpdates4 = upx.a;
            }
        } else if (z2) {
            renderAndDrawAsBitmap(canvas, eudVar);
        } else {
            drawDirectlyToCanvas(canvas);
        }
        this.isDirty = false;
        if (asyncUpdatesEnabled) {
            this.setProgressDrawLock.release();
            if (eudVar.L == this.animator.getAnimatedValueAbsolute()) {
                return;
            }
            setProgressExecutor.execute(this.updateProgressRunnable);
        }
    }

    public void enableFeatureFlag(LottieFeatureFlag lottieFeatureFlag, boolean z) {
        boolean a = this.lottieFeatureFlags.a(lottieFeatureFlag, z);
        if (this.composition == null || !a) {
            return;
        }
        buildCompositionLayer();
    }

    @Deprecated
    public void enableMergePathsForKitKatAndAbove(boolean z) {
        boolean a = this.lottieFeatureFlags.a(LottieFeatureFlag.MergePathsApi19, z);
        if (this.composition == null || !a) {
            return;
        }
        buildCompositionLayer();
    }

    public void endAnimation() {
        this.lazyCompositionTasks.clear();
        this.animator.endAnimation();
        if (isVisible()) {
            return;
        }
        this.onVisibleAction = OnVisibleAction.NONE;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.alpha;
    }

    public AsyncUpdates getAsyncUpdates() {
        AsyncUpdates asyncUpdates = this.asyncUpdates;
        return asyncUpdates != null ? asyncUpdates : upx.a;
    }

    public boolean getAsyncUpdatesEnabled() {
        return getAsyncUpdates() == AsyncUpdates.ENABLED;
    }

    public Bitmap getBitmapForId(String str) {
        i8v imageAssetManager = getImageAssetManager();
        if (imageAssetManager != null) {
            return imageAssetManager.a(str);
        }
        return null;
    }

    public boolean getClipTextToBoundingBox() {
        return this.clipTextToBoundingBox;
    }

    public boolean getClipToCompositionBounds() {
        return this.clipToCompositionBounds;
    }

    public nsz getComposition() {
        return this.composition;
    }

    public int getFrame() {
        return (int) this.animator.getFrame();
    }

    @Deprecated
    public Bitmap getImageAsset(String str) {
        i8v imageAssetManager = getImageAssetManager();
        if (imageAssetManager != null) {
            return imageAssetManager.a(str);
        }
        nsz nszVar = this.composition;
        wtz wtzVar = nszVar == null ? null : (wtz) ((HashMap) nszVar.c()).get(str);
        if (wtzVar != null) {
            return wtzVar.f;
        }
        return null;
    }

    public String getImageAssetsFolder() {
        return this.imageAssetsFolder;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        nsz nszVar = this.composition;
        if (nszVar == null) {
            return -1;
        }
        return nszVar.k.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        nsz nszVar = this.composition;
        if (nszVar == null) {
            return -1;
        }
        return nszVar.k.width();
    }

    public wtz getLottieImageAssetForId(String str) {
        nsz nszVar = this.composition;
        if (nszVar == null) {
            return null;
        }
        return (wtz) ((HashMap) nszVar.c()).get(str);
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.maintainOriginalImageBounds;
    }

    public xw00 getMarkerForAnimationsDisabled() {
        Iterator<String> it = ALLOWED_REDUCED_MOTION_MARKERS.iterator();
        xw00 xw00Var = null;
        while (it.hasNext()) {
            xw00Var = this.composition.d(it.next());
            if (xw00Var != null) {
                break;
            }
        }
        return xw00Var;
    }

    public float getMaxFrame() {
        return this.animator.getMaxFrame();
    }

    public float getMinFrame() {
        return this.animator.getMinFrame();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public mwa0 getPerformanceTracker() {
        nsz nszVar = this.composition;
        if (nszVar != null) {
            return nszVar.a;
        }
        return null;
    }

    public float getProgress() {
        return this.animator.getAnimatedValueAbsolute();
    }

    public RenderMode getRenderMode() {
        return this.useSoftwareRendering ? RenderMode.SOFTWARE : RenderMode.HARDWARE;
    }

    public int getRepeatCount() {
        return this.animator.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.animator.getRepeatMode();
    }

    public float getSpeed() {
        return this.animator.getSpeed();
    }

    public sly0 getTextDelegate() {
        return null;
    }

    public Typeface getTypeface(xxr xxrVar) {
        Map<String, Typeface> map = this.fontMap;
        if (map != null) {
            String a = xxrVar.a();
            if (map.containsKey(a)) {
                return map.get(a);
            }
            String b = xxrVar.b();
            if (map.containsKey(b)) {
                return map.get(b);
            }
            String str = xxrVar.a() + "-" + xxrVar.c();
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        ayr fontAssetManager = getFontAssetManager();
        if (fontAssetManager != null) {
            return fontAssetManager.a(xxrVar);
        }
        return null;
    }

    public boolean hasMasks() {
        eud eudVar = this.compositionLayer;
        return eudVar != null && eudVar.q();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean hasMatte() {
        boolean booleanValue;
        eud eudVar = this.compositionLayer;
        if (eudVar == null) {
            return false;
        }
        ArrayList arrayList = eudVar.D;
        if (eudVar.J == null) {
            if (eudVar.s != null) {
                eudVar.J = Boolean.TRUE;
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((l35) arrayList.get(size)).s != null) {
                        eudVar.J = Boolean.TRUE;
                    }
                }
                eudVar.J = Boolean.FALSE;
            }
            booleanValue = true;
            return !booleanValue;
        }
        booleanValue = eudVar.J.booleanValue();
        if (!booleanValue) {
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable.Callback callback;
        if (this.isDirty) {
            return;
        }
        this.isDirty = true;
        if ((!invalidateSelfOnMainThread || Looper.getMainLooper() == Looper.myLooper()) && (callback = getCallback()) != null) {
            callback.invalidateDrawable(this);
        }
    }

    public boolean isAnimating() {
        LottieValueAnimator lottieValueAnimator = this.animator;
        if (lottieValueAnimator == null) {
            return false;
        }
        return lottieValueAnimator.isRunning();
    }

    public boolean isAnimatingOrWillAnimateOnVisible() {
        if (isVisible()) {
            return this.animator.isRunning();
        }
        OnVisibleAction onVisibleAction = this.onVisibleAction;
        return onVisibleAction == OnVisibleAction.PLAY || onVisibleAction == OnVisibleAction.RESUME;
    }

    public boolean isApplyingOpacityToLayersEnabled() {
        return this.isApplyingOpacityToLayersEnabled;
    }

    public boolean isApplyingShadowToLayersEnabled() {
        return this.isApplyingShadowToLayersEnabled;
    }

    public boolean isFeatureFlagEnabled(LottieFeatureFlag lottieFeatureFlag) {
        return this.lottieFeatureFlags.a.contains(lottieFeatureFlag);
    }

    public boolean isLooping() {
        return this.animator.getRepeatCount() == -1;
    }

    @Deprecated
    public boolean isMergePathsEnabledForKitKatAndAbove() {
        utz utzVar = this.lottieFeatureFlags;
        return utzVar.a.contains(LottieFeatureFlag.MergePathsApi19);
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return isAnimating();
    }

    @Deprecated
    public void loop(boolean z) {
        this.animator.setRepeatCount(z ? -1 : 0);
    }

    public void pauseAnimation() {
        this.lazyCompositionTasks.clear();
        this.animator.pauseAnimation();
        if (isVisible()) {
            return;
        }
        this.onVisibleAction = OnVisibleAction.NONE;
    }

    public void playAnimation() {
        if (this.compositionLayer == null) {
            this.lazyCompositionTasks.add(new stz() { // from class: qtz
                @Override // defpackage.stz
                public final void a(nsz nszVar) {
                    LottieDrawable.this.lambda$playAnimation$3(nszVar);
                }
            });
            return;
        }
        computeRenderMode();
        if (animationsEnabled(getContext()) || getRepeatCount() == 0) {
            if (isVisible()) {
                this.animator.playAnimation();
                this.onVisibleAction = OnVisibleAction.NONE;
            } else {
                this.onVisibleAction = OnVisibleAction.PLAY;
            }
        }
        if (animationsEnabled(getContext())) {
            return;
        }
        xw00 markerForAnimationsDisabled = getMarkerForAnimationsDisabled();
        if (markerForAnimationsDisabled != null) {
            setFrame((int) markerForAnimationsDisabled.b);
        } else {
            setFrame((int) (getSpeed() < 0.0f ? getMinFrame() : getMaxFrame()));
        }
        this.animator.endAnimation();
        if (isVisible()) {
            return;
        }
        this.onVisibleAction = OnVisibleAction.NONE;
    }

    public void removeAllAnimatorListeners() {
        this.animator.removeAllListeners();
    }

    public void removeAllUpdateListeners() {
        this.animator.removeAllUpdateListeners();
        this.animator.addUpdateListener(this.progressUpdateListener);
    }

    public void removeAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.animator.removeListener(animatorListener);
    }

    public void removeAnimatorPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.animator.removePauseListener(animatorPauseListener);
    }

    public void removeAnimatorUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.animator.removeUpdateListener(animatorUpdateListener);
    }

    public List<six> resolveKeyPath(six sixVar) {
        if (this.compositionLayer == null) {
            lgz.b("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        this.compositionLayer.a(sixVar, 0, arrayList, new six(new String[0]));
        return arrayList;
    }

    public void resumeAnimation() {
        if (this.compositionLayer == null) {
            this.lazyCompositionTasks.add(new stz() { // from class: otz
                @Override // defpackage.stz
                public final void a(nsz nszVar) {
                    LottieDrawable.this.lambda$resumeAnimation$4(nszVar);
                }
            });
            return;
        }
        computeRenderMode();
        if (animationsEnabled(getContext()) || getRepeatCount() == 0) {
            if (isVisible()) {
                this.animator.resumeAnimation();
                this.onVisibleAction = OnVisibleAction.NONE;
            } else {
                this.onVisibleAction = OnVisibleAction.RESUME;
            }
        }
        if (animationsEnabled(getContext())) {
            return;
        }
        setFrame((int) (getSpeed() < 0.0f ? getMinFrame() : getMaxFrame()));
        this.animator.endAnimation();
        if (isVisible()) {
            return;
        }
        this.onVisibleAction = OnVisibleAction.NONE;
    }

    public void reverseAnimationSpeed() {
        this.animator.reverseAnimationSpeed();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.alpha = i;
        invalidateSelf();
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.isApplyingOpacityToLayersEnabled = z;
    }

    public void setApplyingShadowToLayersEnabled(boolean z) {
        this.isApplyingShadowToLayersEnabled = z;
    }

    public void setAsyncUpdates(AsyncUpdates asyncUpdates) {
        this.asyncUpdates = asyncUpdates;
    }

    public void setClipTextToBoundingBox(boolean z) {
        if (z != this.clipTextToBoundingBox) {
            this.clipTextToBoundingBox = z;
            invalidateSelf();
        }
    }

    public void setClipToCompositionBounds(boolean z) {
        if (z != this.clipToCompositionBounds) {
            this.clipToCompositionBounds = z;
            eud eudVar = this.compositionLayer;
            if (eudVar != null) {
                eudVar.M = z;
            }
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        lgz.b("Use addColorFilter instead.");
    }

    public boolean setComposition(nsz nszVar) {
        if (this.composition == nszVar) {
            return false;
        }
        this.isDirty = true;
        clearComposition();
        this.composition = nszVar;
        buildCompositionLayer();
        this.animator.setComposition(nszVar);
        setProgress(this.animator.getAnimatedFraction());
        Iterator it = new ArrayList(this.lazyCompositionTasks).iterator();
        while (it.hasNext()) {
            stz stzVar = (stz) it.next();
            if (stzVar != null) {
                stzVar.a(nszVar);
            }
            it.remove();
        }
        this.lazyCompositionTasks.clear();
        nszVar.a.a = this.performanceTrackingEnabled;
        computeRenderMode();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public void setDefaultFontFileExtension(String str) {
        this.defaultFontFileExtension = str;
        ayr fontAssetManager = getFontAssetManager();
        if (fontAssetManager != null) {
            fontAssetManager.b(str);
        }
    }

    public void setFontAssetDelegate(zxr zxrVar) {
        this.fontAssetDelegate = zxrVar;
        ayr ayrVar = this.fontAssetManager;
        if (ayrVar != null) {
            ayrVar.c(zxrVar);
        }
    }

    public void setFontMap(Map<String, Typeface> map) {
        if (map == this.fontMap) {
            return;
        }
        this.fontMap = map;
        invalidateSelf();
    }

    public void setFrame(final int i) {
        if (this.composition == null) {
            this.lazyCompositionTasks.add(new stz() { // from class: itz
                @Override // defpackage.stz
                public final void a(nsz nszVar) {
                    LottieDrawable.this.lambda$setFrame$15(i, nszVar);
                }
            });
        } else {
            this.animator.setFrame(i);
        }
    }

    @Deprecated
    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.ignoreSystemAnimationsDisabled = z;
    }

    public void setImageAssetDelegate(h8v h8vVar) {
        i8v i8vVar = this.imageAssetManager;
        if (i8vVar != null) {
            i8vVar.getClass();
        }
    }

    public void setImagesAssetsFolder(String str) {
        this.imageAssetsFolder = str;
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        this.maintainOriginalImageBounds = z;
    }

    public void setMaxFrame(String str) {
        nsz nszVar = this.composition;
        if (nszVar == null) {
            this.lazyCompositionTasks.add(new htz(this, str, 1));
            return;
        }
        xw00 d = nszVar.d(str);
        if (d != null) {
            setMaxFrame((int) (d.b + d.c));
        } else {
            ny61.g(oyr.p("Cannot find marker with name ", str, Extension.DOT_CHAR));
        }
    }

    public void setMaxProgress(float f) {
        nsz nszVar = this.composition;
        if (nszVar == null) {
            this.lazyCompositionTasks.add(new ntz(this, f, 0));
        } else {
            this.animator.setMaxFrame(ti20.f(nszVar.l, nszVar.m, f));
        }
    }

    public void setMinAndMaxFrame(final String str, final String str2, final boolean z) {
        nsz nszVar = this.composition;
        if (nszVar == null) {
            this.lazyCompositionTasks.add(new stz() { // from class: ptz
                @Override // defpackage.stz
                public final void a(nsz nszVar2) {
                    LottieDrawable.this.lambda$setMinAndMaxFrame$12(str, str2, z, nszVar2);
                }
            });
            return;
        }
        xw00 d = nszVar.d(str);
        if (d == null) {
            ny61.g(oyr.p("Cannot find marker with name ", str, Extension.DOT_CHAR));
            return;
        }
        int i = (int) d.b;
        xw00 d2 = this.composition.d(str2);
        if (d2 != null) {
            setMinAndMaxFrame(i, (int) (d2.b + (z ? 1.0f : 0.0f)));
        } else {
            ny61.g(oyr.p("Cannot find marker with name ", str2, Extension.DOT_CHAR));
        }
    }

    public void setMinAndMaxProgress(final float f, final float f2) {
        nsz nszVar = this.composition;
        if (nszVar == null) {
            this.lazyCompositionTasks.add(new stz() { // from class: jtz
                @Override // defpackage.stz
                public final void a(nsz nszVar2) {
                    LottieDrawable.this.lambda$setMinAndMaxProgress$14(f, f2, nszVar2);
                }
            });
            return;
        }
        int f3 = (int) ti20.f(nszVar.l, nszVar.m, f);
        nsz nszVar2 = this.composition;
        setMinAndMaxFrame(f3, (int) ti20.f(nszVar2.l, nszVar2.m, f2));
    }

    public void setMinFrame(String str) {
        nsz nszVar = this.composition;
        if (nszVar == null) {
            this.lazyCompositionTasks.add(new htz(this, str, 2));
            return;
        }
        xw00 d = nszVar.d(str);
        if (d != null) {
            setMinFrame((int) d.b);
        } else {
            ny61.g(oyr.p("Cannot find marker with name ", str, Extension.DOT_CHAR));
        }
    }

    public void setMinProgress(float f) {
        nsz nszVar = this.composition;
        if (nszVar == null) {
            this.lazyCompositionTasks.add(new ntz(this, f, 1));
        } else {
            setMinFrame((int) ti20.f(nszVar.l, nszVar.m, f));
        }
    }

    public void setOutlineMasksAndMattes(boolean z) {
        if (this.outlineMasksAndMattes == z) {
            return;
        }
        this.outlineMasksAndMattes = z;
        eud eudVar = this.compositionLayer;
        if (eudVar != null) {
            eudVar.o(z);
        }
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.performanceTrackingEnabled = z;
        nsz nszVar = this.composition;
        if (nszVar != null) {
            nszVar.a.a = z;
        }
    }

    public void setProgress(final float f) {
        nsz nszVar = this.composition;
        if (nszVar == null) {
            this.lazyCompositionTasks.add(new stz() { // from class: rtz
                @Override // defpackage.stz
                public final void a(nsz nszVar2) {
                    LottieDrawable.this.lambda$setProgress$16(f, nszVar2);
                }
            });
        } else {
            AsyncUpdates asyncUpdates = upx.a;
            this.animator.setFrame(ti20.f(nszVar.l, nszVar.m, f));
        }
    }

    public void setRenderMode(RenderMode renderMode) {
        this.renderMode = renderMode;
        computeRenderMode();
    }

    public void setRepeatCount(int i) {
        this.animator.setRepeatCount(i);
    }

    public void setRepeatMode(int i) {
        this.animator.setRepeatMode(i);
    }

    public void setSafeMode(boolean z) {
        this.safeMode = z;
    }

    public void setSpeed(float f) {
        this.animator.setSpeed(f);
    }

    @Deprecated
    public void setSystemAnimationsAreEnabled(Boolean bool) {
        this.systemAnimationsEnabled = bool.booleanValue();
    }

    public void setTextDelegate(sly0 sly0Var) {
    }

    public void setUseCompositionFrameRate(boolean z) {
        this.animator.setUseCompositionFrameRate(z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean isVisible = isVisible();
        boolean visible = super.setVisible(z, z2);
        if (z) {
            OnVisibleAction onVisibleAction = this.onVisibleAction;
            if (onVisibleAction == OnVisibleAction.PLAY) {
                playAnimation();
                return visible;
            }
            if (onVisibleAction == OnVisibleAction.RESUME) {
                resumeAnimation();
                return visible;
            }
        } else {
            if (this.animator.isRunning()) {
                pauseAnimation();
                this.onVisibleAction = OnVisibleAction.RESUME;
                return visible;
            }
            if (isVisible) {
                this.onVisibleAction = OnVisibleAction.NONE;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        playAnimation();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        endAnimation();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public Bitmap updateBitmap(String str, Bitmap bitmap) {
        Bitmap bitmap2;
        i8v imageAssetManager = getImageAssetManager();
        if (imageAssetManager == null) {
            lgz.b("Cannot update bitmap. Most likely the drawable is not added to a View which prevents Lottie from getting a Context.");
            return null;
        }
        Map map = imageAssetManager.c;
        if (bitmap == null) {
            wtz wtzVar = (wtz) map.get(str);
            bitmap2 = wtzVar.f;
            wtzVar.f = null;
        } else {
            Bitmap bitmap3 = ((wtz) map.get(str)).f;
            imageAssetManager.b(bitmap, str);
            bitmap2 = bitmap3;
        }
        invalidateSelf();
        return bitmap2;
    }

    public boolean useTextGlyphs() {
        return this.fontMap == null && this.composition.h.e() > 0;
    }

    @Deprecated
    public boolean enableMergePathsForKitKatAndAbove() {
        utz utzVar = this.lottieFeatureFlags;
        return utzVar.a.contains(LottieFeatureFlag.MergePathsApi19);
    }

    private void convertRect(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void setMinFrame(int i) {
        if (this.composition == null) {
            this.lazyCompositionTasks.add(new ltz(this, i, 1));
        } else {
            this.animator.setMinFrame(i);
        }
    }

    public void setMaxFrame(int i) {
        if (this.composition == null) {
            this.lazyCompositionTasks.add(new ltz(this, i, 0));
        } else {
            this.animator.setMaxFrame(i + 0.99f);
        }
    }

    public void setMinAndMaxFrame(String str) {
        nsz nszVar = this.composition;
        if (nszVar == null) {
            this.lazyCompositionTasks.add(new htz(this, str, 0));
            return;
        }
        xw00 d = nszVar.d(str);
        if (d != null) {
            int i = (int) d.b;
            setMinAndMaxFrame(i, ((int) d.c) + i);
        } else {
            ny61.g(oyr.p("Cannot find marker with name ", str, Extension.DOT_CHAR));
        }
    }

    public void setMinAndMaxFrame(final int i, final int i2) {
        if (this.composition == null) {
            this.lazyCompositionTasks.add(new stz() { // from class: ktz
                @Override // defpackage.stz
                public final void a(nsz nszVar) {
                    LottieDrawable.this.lambda$setMinAndMaxFrame$13(i, i2, nszVar);
                }
            });
        } else {
            this.animator.setMinAndMaxFrames(i, i2 + 0.99f);
        }
    }

    public <T> void addValueCallback(six sixVar, T t, hes0 hes0Var) {
        addValueCallback(sixVar, (six) t, (puz) new anm(1, hes0Var));
    }

    public void draw(Canvas canvas, Matrix matrix) {
        eud eudVar = this.compositionLayer;
        nsz nszVar = this.composition;
        if (eudVar == null || nszVar == null) {
            return;
        }
        boolean asyncUpdatesEnabled = getAsyncUpdatesEnabled();
        if (asyncUpdatesEnabled) {
            try {
                this.setProgressDrawLock.acquire();
                if (shouldSetProgressBeforeDrawing()) {
                    setProgress(this.animator.getAnimatedValueAbsolute());
                }
            } catch (InterruptedException unused) {
                if (!asyncUpdatesEnabled) {
                    return;
                }
                this.setProgressDrawLock.release();
                if (eudVar.L == this.animator.getAnimatedValueAbsolute()) {
                    return;
                }
            } catch (Throwable th) {
                if (asyncUpdatesEnabled) {
                    this.setProgressDrawLock.release();
                    if (eudVar.L != this.animator.getAnimatedValueAbsolute()) {
                        setProgressExecutor.execute(this.updateProgressRunnable);
                    }
                }
                throw th;
            }
        }
        boolean z = this.safeMode;
        int i = this.alpha;
        if (z) {
            try {
                draw(canvas, matrix, eudVar, i);
            } catch (Throwable unused2) {
                lgz.a.getClass();
                AsyncUpdates asyncUpdates = upx.a;
            }
        } else {
            draw(canvas, matrix, eudVar, i);
        }
        this.isDirty = false;
        if (asyncUpdatesEnabled) {
            this.setProgressDrawLock.release();
            if (eudVar.L == this.animator.getAnimatedValueAbsolute()) {
                return;
            }
            setProgressExecutor.execute(this.updateProgressRunnable);
        }
    }

    private void draw(Canvas canvas, Matrix matrix, eud eudVar, int i) {
        if (this.useSoftwareRendering) {
            canvas.save();
            canvas.concat(matrix);
            renderAndDrawAsBitmap(canvas, eudVar);
            canvas.restore();
            return;
        }
        eudVar.f(canvas, matrix, i, null);
    }
}
