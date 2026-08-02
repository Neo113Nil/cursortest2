package androidx.camera.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Rational;
import android.util.Size;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.camera.view.internal.ScreenFlashUiInfo$ProviderType;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import androidx.lifecycle.v;
import defpackage.af61;
import defpackage.ar7;
import defpackage.bf61;
import defpackage.cf61;
import defpackage.cye0;
import defpackage.d3i0;
import defpackage.d6z;
import defpackage.df61;
import defpackage.dn7;
import defpackage.dy40;
import defpackage.e70;
import defpackage.eur;
import defpackage.eye0;
import defpackage.fur;
import defpackage.fye0;
import defpackage.g8e;
import defpackage.geb1;
import defpackage.iq7;
import defpackage.kbs;
import defpackage.kf61;
import defpackage.lw01;
import defpackage.m810;
import defpackage.ni91;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.rdp0;
import defpackage.rxe0;
import defpackage.s920;
import defpackage.sgb1;
import defpackage.sp31;
import defpackage.t7v;
import defpackage.t920;
import defpackage.tis0;
import defpackage.tob1;
import defpackage.uy80;
import defpackage.v8v;
import defpackage.vfc0;
import defpackage.w9x0;
import defpackage.wbj;
import defpackage.xt31;
import defpackage.yci0;
import defpackage.yln;
import defpackage.znw0;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class PreviewView extends FrameLayout {
    static final int DEFAULT_BACKGROUND_COLOR = 17170444;
    private static final ImplementationMode DEFAULT_IMPL_MODE = ImplementationMode.PERFORMANCE;
    private static final String TAG = "PreviewView";
    final AtomicReference<a> mActiveStreamStateObserver;
    iq7 mCameraController;
    ar7 mCameraInfoInternal;
    private final DisplayRotationListener mDisplayRotationListener;
    eye0 mImplementation;
    ImplementationMode mImplementationMode;
    cye0 mOnFrameUpdateListener;
    Executor mOnFrameUpdateListenerExecutor;
    private final View.OnLayoutChangeListener mOnLayoutChangeListener;
    final dy40 mPreviewStreamStateLiveData;
    final c mPreviewTransform;
    fye0 mPreviewViewMeteringPointFactory;
    final ScreenFlashView mScreenFlashView;
    final rxe0 mSurfaceProvider;
    private MotionEvent mTouchUpEvent;
    boolean mUseDisplayRotation;
    private final df61 mZoomGestureDetector;

    public class DisplayRotationListener implements DisplayManager.DisplayListener {
        public DisplayRotationListener() {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i) {
            Display defaultDisplay = PreviewView.this.getDefaultDisplay();
            if (defaultDisplay == null || defaultDisplay.getDisplayId() != i) {
                return;
            }
            PreviewView.this.redrawPreview();
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i) {
        }
    }

    public enum ImplementationMode {
        PERFORMANCE(0),
        COMPATIBLE(1);

        private final int mId;

        ImplementationMode(int i) {
            this.mId = i;
        }

        public static ImplementationMode a(int i) {
            for (ImplementationMode implementationMode : values()) {
                if (implementationMode.mId == i) {
                    return implementationMode;
                }
            }
            ny61.g(oyr.i(i, "Unknown implementation mode id "));
            return null;
        }

        public final int b() {
            return this.mId;
        }
    }

    public enum ScaleType {
        FILL_START(0),
        FILL_CENTER(1),
        FILL_END(2),
        FIT_START(3),
        FIT_CENTER(4),
        FIT_END(5);

        private final int mId;

        ScaleType(int i) {
            this.mId = i;
        }

        public static ScaleType a(int i) {
            for (ScaleType scaleType : values()) {
                if (scaleType.mId == i) {
                    return scaleType;
                }
            }
            ny61.g(oyr.i(i, "Unknown scale type id "));
            return null;
        }

        public final int b() {
            return this.mId;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class StreamState {
        private static final /* synthetic */ StreamState[] $VALUES;
        public static final StreamState IDLE;
        public static final StreamState STREAMING;

        static {
            StreamState streamState = new StreamState("IDLE", 0);
            IDLE = streamState;
            StreamState streamState2 = new StreamState("STREAMING", 1);
            STREAMING = streamState2;
            $VALUES = new StreamState[]{streamState, streamState2};
        }

        public static StreamState valueOf(String str) {
            return (StreamState) Enum.valueOf(StreamState.class, str);
        }

        public static StreamState[] values() {
            return (StreamState[]) $VALUES.clone();
        }
    }

    public PreviewView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        ImplementationMode implementationMode = DEFAULT_IMPL_MODE;
        this.mImplementationMode = implementationMode;
        c cVar = new c();
        cVar.h = c.i;
        this.mPreviewTransform = cVar;
        this.mUseDisplayRotation = true;
        this.mPreviewStreamStateLiveData = new dy40(StreamState.IDLE);
        this.mActiveStreamStateObserver = new AtomicReference<>();
        this.mPreviewViewMeteringPointFactory = new fye0(cVar);
        this.mDisplayRotationListener = new DisplayRotationListener();
        this.mOnLayoutChangeListener = new yln(13, this);
        this.mSurfaceProvider = new f(this);
        tob1.b();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, d3i0.PreviewView, i, i2);
        int[] iArr = d3i0.PreviewView;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        sp31.b(this, context, iArr, attributeSet, obtainStyledAttributes, i, i2);
        try {
            setScaleType(ScaleType.a(obtainStyledAttributes.getInteger(d3i0.PreviewView_scaleType, cVar.h.b())));
            setImplementationMode(ImplementationMode.a(obtainStyledAttributes.getInteger(d3i0.PreviewView_implementationMode, implementationMode.b())));
            obtainStyledAttributes.recycle();
            this.mZoomGestureDetector = new df61(context, new vfc0(6, this));
            if (getBackground() == null) {
                setBackgroundColor(getContext().getColor(17170444));
            }
            ScreenFlashView screenFlashView = new ScreenFlashView(context);
            this.mScreenFlashView = screenFlashView;
            screenFlashView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private void attachToControllerIfReady(boolean z) {
        tob1.b();
        xt31 viewPort = getViewPort();
        if (this.mCameraController == null || viewPort == null || !isAttachedToWindow()) {
            return;
        }
        try {
            this.mCameraController.a(getSurfaceProvider(), viewPort);
        } catch (IllegalStateException e) {
            if (!z) {
                throw e;
            }
            sgb1.e(TAG, e.toString(), e);
        }
    }

    private DisplayManager getDisplayManager() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return (DisplayManager) context.getSystemService("display");
    }

    private v8v getScreenFlashInternal() {
        return this.mScreenFlashView.getScreenFlash();
    }

    private int getViewPortScaleType() {
        int ordinal = getScaleType().ordinal();
        if (ordinal == 0) {
            return 0;
        }
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                i = 3;
                if (ordinal != 3 && ordinal != 4 && ordinal != 5) {
                    yci0.t(getScaleType(), "Unexpected scale type: ");
                    return 0;
                }
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i3 - i == i7 - i5 && i4 - i2 == i8 - i6) {
            return;
        }
        redrawPreview();
        attachToControllerIfReady(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean lambda$new$1(cf61 cf61Var) {
        iq7 iq7Var;
        if (!(cf61Var instanceof bf61) || (iq7Var = this.mCameraController) == null) {
            return true;
        }
        float f = ((bf61) cf61Var).a;
        if (!iq7Var.k()) {
            sgb1.g(5, "CameraController");
            return true;
        }
        if (!iq7Var.z) {
            sgb1.g(3, "CameraController");
            return true;
        }
        sgb1.g(3, "CameraController");
        tob1.b();
        kf61 kf61Var = (kf61) iq7Var.C.d();
        if (kf61Var == null) {
            return true;
        }
        iq7Var.r(Math.min(Math.max(kf61Var.d() * (f > 1.0f ? g8e.b(f, 1.0f, 2.0f, 1.0f) : 1.0f - ((1.0f - f) * 2.0f)), kf61Var.c()), kf61Var.a()));
        return true;
    }

    private void setScreenFlashUiInfo(v8v v8vVar) {
        iq7 iq7Var = this.mCameraController;
        if (iq7Var == null) {
            sgb1.g(3, TAG);
            return;
        }
        ScreenFlashUiInfo$ProviderType screenFlashUiInfo$ProviderType = ScreenFlashUiInfo$ProviderType.PREVIEW_VIEW;
        rdp0 rdp0Var = new rdp0(screenFlashUiInfo$ProviderType, v8vVar);
        rdp0 h = iq7Var.h();
        iq7Var.L.put(screenFlashUiInfo$ProviderType, rdp0Var);
        rdp0 h2 = iq7Var.h();
        if (h2 == null || h2.equals(h)) {
            return;
        }
        iq7Var.y();
    }

    public static boolean shouldReuseImplementation(eye0 eye0Var, znw0 znw0Var, ImplementationMode implementationMode) {
        return (eye0Var instanceof j) && !shouldUseTextureView(znw0Var, implementationMode);
    }

    public static boolean shouldUseTextureView(znw0 znw0Var, ImplementationMode implementationMode) {
        boolean equals = znw0Var.e.f().y().equals("androidx.camera.camera2.legacy");
        boolean z = (wbj.a.b(SurfaceViewStretchedQuirk.class) == null && wbj.a.b(SurfaceViewNotCroppedByParentQuirk.class) == null) ? false : true;
        if (!equals && !z) {
            int ordinal = implementationMode.ordinal();
            if (ordinal == 0) {
                return false;
            }
            if (ordinal != 1) {
                kbs.f(implementationMode, "Invalid implementation mode: ");
                return false;
            }
        }
        return true;
    }

    public Bitmap getBitmap() {
        tob1.b();
        eye0 eye0Var = this.mImplementation;
        if (eye0Var == null) {
            return null;
        }
        FrameLayout frameLayout = eye0Var.b;
        Bitmap b = eye0Var.b();
        if (b == null) {
            return null;
        }
        c cVar = eye0Var.c;
        Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
        int layoutDirection = frameLayout.getLayoutDirection();
        if (!cVar.f()) {
            return b;
        }
        Matrix d = cVar.d();
        RectF e = cVar.e(layoutDirection, size);
        Bitmap createBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), b.getConfig());
        Canvas canvas = new Canvas(createBitmap);
        Matrix matrix = new Matrix();
        matrix.postConcat(d);
        matrix.postScale(e.width() / cVar.a.getWidth(), e.height() / cVar.a.getHeight());
        matrix.postTranslate(e.left, e.top);
        canvas.drawBitmap(b, matrix, new Paint(7));
        return createBitmap;
    }

    public iq7 getController() {
        tob1.b();
        return this.mCameraController;
    }

    public Display getDefaultDisplay() {
        if (getDisplay() == null) {
            return null;
        }
        Display display = getDisplayManager().getDisplay(0);
        return display != null ? display : getDisplay();
    }

    public ImplementationMode getImplementationMode() {
        tob1.b();
        return this.mImplementationMode;
    }

    public t920 getMeteringPointFactory() {
        tob1.b();
        return this.mPreviewViewMeteringPointFactory;
    }

    public uy80 getOutputTransform() {
        Matrix matrix;
        tob1.b();
        try {
            matrix = this.mPreviewTransform.c(getLayoutDirection(), new Size(getWidth(), getHeight()));
        } catch (IllegalStateException unused) {
            matrix = null;
        }
        Rect rect = this.mPreviewTransform.b;
        if (matrix == null || rect == null) {
            sgb1.g(3, TAG);
            return null;
        }
        RectF rectF = lw01.a;
        RectF rectF2 = new RectF(rect);
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(lw01.a, rectF2, Matrix.ScaleToFit.FILL);
        matrix.preConcat(matrix2);
        if (this.mImplementation instanceof l) {
            matrix.postConcat(getMatrix());
        } else if (!getMatrix().isIdentity()) {
            sgb1.g(5, TAG);
        }
        return new uy80(matrix, new Size(rect.width(), rect.height()));
    }

    public v getPreviewStreamState() {
        return this.mPreviewStreamStateLiveData;
    }

    public ScaleType getScaleType() {
        tob1.b();
        return this.mPreviewTransform.h;
    }

    public v8v getScreenFlash() {
        return getScreenFlashInternal();
    }

    public Matrix getSensorToViewTransform() {
        tob1.b();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        c cVar = this.mPreviewTransform;
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        if (!cVar.f()) {
            return null;
        }
        Matrix matrix = new Matrix(cVar.d);
        matrix.postConcat(cVar.c(layoutDirection, size));
        return matrix;
    }

    public rxe0 getSurfaceProvider() {
        tob1.b();
        return this.mSurfaceProvider;
    }

    public xt31 getViewPort(int i) {
        tob1.b();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        Rational rational = new Rational(getWidth(), getHeight());
        int viewPortScaleType = getViewPortScaleType();
        int layoutDirection = getLayoutDirection();
        xt31 xt31Var = new xt31();
        xt31Var.a = viewPortScaleType;
        xt31Var.b = rational;
        xt31Var.c = i;
        xt31Var.d = layoutDirection;
        return xt31Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode()) {
            startListeningToDisplayChange();
        }
        addOnLayoutChangeListener(this.mOnLayoutChangeListener);
        eye0 eye0Var = this.mImplementation;
        if (eye0Var != null) {
            eye0Var.c();
        }
        attachToControllerIfReady(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.mOnLayoutChangeListener);
        eye0 eye0Var = this.mImplementation;
        if (eye0Var != null) {
            eye0Var.d();
        }
        iq7 iq7Var = this.mCameraController;
        if (iq7Var != null) {
            iq7Var.b();
        }
        if (isInEditMode()) {
            return;
        }
        stopListeningToDisplayChange();
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x00a6, code lost:
    
        if (r11 != false) goto L151;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        float f3;
        float f4;
        boolean z;
        if (this.mCameraController == null) {
            return super.onTouchEvent(motionEvent);
        }
        boolean z2 = false;
        boolean z3 = motionEvent.getPointerCount() == 1;
        boolean z4 = motionEvent.getAction() == 1;
        boolean z5 = motionEvent.getEventTime() - motionEvent.getDownTime() < ((long) ViewConfiguration.getLongPressTimeout());
        if (z3 && z4 && z5) {
            this.mTouchUpEvent = motionEvent;
            performClick();
            return true;
        }
        df61 df61Var = this.mZoomGestureDetector;
        int i = df61Var.a;
        vfc0 vfc0Var = df61Var.b;
        motionEvent.getEventTime();
        int actionMasked = motionEvent.getActionMasked();
        if (df61Var.c) {
            df61Var.l.onTouchEvent(motionEvent);
        }
        int pointerCount = motionEvent.getPointerCount();
        boolean z6 = (motionEvent.getButtonState() & 32) != 0;
        boolean z7 = df61Var.k == 2 && !z6;
        boolean z8 = actionMasked == 1 || actionMasked == 3 || z7;
        if (actionMasked == 0 || z8) {
            if (df61Var.g) {
                ((PreviewView) vfc0Var.b).lambda$new$1(new af61());
                df61Var.g = false;
                df61Var.h = 0.0f;
                df61Var.k = 0;
            } else if (df61Var.a() && z8) {
                df61Var.g = false;
                df61Var.h = 0.0f;
                df61Var.k = 0;
            }
        }
        if (!df61Var.g && df61Var.d && !df61Var.a() && !z8 && z6) {
            df61Var.i = motionEvent.getX();
            df61Var.j = motionEvent.getY();
            df61Var.k = 2;
            df61Var.h = 0.0f;
        }
        boolean z9 = actionMasked == 0 || actionMasked == 6 || actionMasked == 5 || z7;
        boolean z10 = actionMasked == 6;
        int actionIndex = z10 ? motionEvent.getActionIndex() : -1;
        int i2 = z10 ? pointerCount - 1 : pointerCount;
        if (df61Var.a()) {
            f2 = df61Var.i;
            f = df61Var.j;
            df61Var.m = motionEvent.getY() < f;
        } else {
            float f5 = 0.0f;
            float f6 = 0.0f;
            for (int i3 = 0; i3 < pointerCount; i3++) {
                if (actionIndex != i3) {
                    f5 = motionEvent.getX(i3) + f5;
                    f6 = motionEvent.getY(i3) + f6;
                }
            }
            float f7 = i2;
            float f8 = f5 / f7;
            f = f6 / f7;
            f2 = f8;
        }
        float f9 = 0.0f;
        float f10 = 0.0f;
        for (int i4 = 0; i4 < pointerCount; i4++) {
            if (actionIndex != i4) {
                f9 = Math.abs(motionEvent.getX(i4) - f2) + f9;
                f10 = Math.abs(motionEvent.getY(i4) - f) + f10;
            }
        }
        float f11 = i2;
        float f12 = (f9 / f11) * 2.0f;
        float f13 = 2.0f * (f10 / f11);
        if (df61Var.a()) {
            f3 = 0.0f;
            f4 = f2;
        } else {
            f3 = 0.0f;
            f4 = f2;
            f13 = (float) Math.hypot(f12, f13);
        }
        boolean z11 = df61Var.g;
        m810.b(f4);
        m810.b(f);
        if (!df61Var.a() && df61Var.g && (f13 < f3 || z9)) {
            ((PreviewView) vfc0Var.b).lambda$new$1(new af61());
            df61Var.g = false;
            df61Var.h = f13;
        }
        if (z9) {
            df61Var.e = f13;
            df61Var.f = f13;
            df61Var.h = f13;
        }
        int i5 = df61Var.a() ? i : 0;
        if (!df61Var.g && f13 >= i5 && (z11 || Math.abs(f13 - df61Var.h) > i)) {
            df61Var.e = f13;
            df61Var.f = f13;
            df61Var.g = ((PreviewView) vfc0Var.b).lambda$new$1(new af61());
        }
        if (actionMasked == 2) {
            df61Var.e = f13;
            if (df61Var.g) {
                float f14 = 1.0f;
                if (df61Var.a()) {
                    boolean z12 = df61Var.m;
                    if ((z12 && df61Var.e < df61Var.f) || (!z12 && df61Var.e > df61Var.f)) {
                        z2 = true;
                    }
                    float abs = Math.abs(1.0f - (df61Var.e / df61Var.f)) * 0.5f;
                    if (df61Var.f > df61Var.a) {
                        f14 = z2 ? 1.0f + abs : 1.0f - abs;
                    }
                } else {
                    float f15 = df61Var.f;
                    if (f15 > f3) {
                        f14 = df61Var.e / f15;
                    }
                }
                z = ((PreviewView) vfc0Var.b).lambda$new$1(new bf61(f14));
            } else {
                z = true;
            }
            if (z) {
                df61Var.f = df61Var.e;
            }
        }
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        long j;
        if (this.mCameraController != null) {
            MotionEvent motionEvent = this.mTouchUpEvent;
            float x = motionEvent != null ? motionEvent.getX() : getWidth() / 2.0f;
            MotionEvent motionEvent2 = this.mTouchUpEvent;
            float y = motionEvent2 != null ? motionEvent2.getY() : getHeight() / 2.0f;
            iq7 iq7Var = this.mCameraController;
            fye0 fye0Var = this.mPreviewViewMeteringPointFactory;
            dy40 dy40Var = iq7Var.E;
            long j2 = iq7Var.M;
            if (!iq7Var.k()) {
                sgb1.g(5, "CameraController");
            } else if (iq7Var.A) {
                PointF pointF = new PointF(x, y);
                s920 b = fye0Var.b(pointF.x, pointF.y, 0.16666667f);
                s920 b2 = fye0Var.b(pointF.x, pointF.y, 0.25f);
                int i = 1;
                eur eurVar = new eur(b, 1);
                eurVar.a(b2, 2);
                if (j2 > 0) {
                    d6z.m("autoCancelDuration must be at least 1", j2 >= 1);
                    j = 1000000;
                    eurVar.d = j2 / 1000000;
                } else {
                    j = 1000000;
                    eurVar.d = 0L;
                }
                fur furVar = new fur(eurVar);
                sgb1.g(3, "CameraController");
                tis0 tis0Var = iq7Var.B;
                if (tis0Var != null) {
                    synchronized (tis0Var.w) {
                        tis0Var.b = true;
                    }
                }
                dy40Var.m(new w9x0(1));
                tis0 tis0Var2 = new tis0(pointF, dy40Var);
                iq7Var.B = tis0Var2;
                ni91.a(((e70) iq7Var.s.b()).j(furVar), tis0Var2, geb1.b());
                long j3 = j2 / j;
                sgb1.g(3, "CameraController");
                if (j3 > 0) {
                    new Handler(Looper.getMainLooper()).postDelayed(new dn7(i, tis0Var2), j3);
                }
            } else {
                sgb1.g(3, "CameraController");
            }
        }
        this.mTouchUpEvent = null;
        return super.performClick();
    }

    public void redrawPreview() {
        Rect rect;
        tob1.b();
        if (this.mImplementation != null) {
            updateDisplayRotationIfNeeded();
            this.mImplementation.f();
        }
        fye0 fye0Var = this.mPreviewViewMeteringPointFactory;
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        fye0Var.getClass();
        tob1.b();
        synchronized (fye0Var) {
            try {
                if (size.getWidth() != 0 && size.getHeight() != 0 && (rect = fye0Var.c) != null) {
                    fye0Var.d = fye0Var.b.a(layoutDirection, rect, size);
                }
                fye0Var.d = null;
            } finally {
            }
        }
        iq7 iq7Var = this.mCameraController;
        if (iq7Var != null) {
            Matrix sensorToViewTransform = getSensorToViewTransform();
            tob1.b();
            t7v t7vVar = iq7Var.h;
            if (t7vVar != null && t7vVar.c() == 1) {
                iq7Var.h.a(sensorToViewTransform);
            }
        }
    }

    public void setController(iq7 iq7Var) {
        tob1.b();
        iq7 iq7Var2 = this.mCameraController;
        if (iq7Var2 != null && iq7Var2 != iq7Var) {
            iq7Var2.b();
            setScreenFlashUiInfo(null);
        }
        this.mCameraController = iq7Var;
        attachToControllerIfReady(false);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    public void setFrameUpdateListener(Executor executor, cye0 cye0Var) {
        if (this.mImplementationMode == ImplementationMode.PERFORMANCE) {
            ny61.g("PERFORMANCE mode doesn't support frame update listener");
            return;
        }
        this.mOnFrameUpdateListenerExecutor = executor;
        eye0 eye0Var = this.mImplementation;
        if (eye0Var != null) {
            eye0Var.g(executor);
        }
    }

    public void setImplementationMode(ImplementationMode implementationMode) {
        tob1.b();
        this.mImplementationMode = implementationMode;
    }

    public void setScaleType(ScaleType scaleType) {
        tob1.b();
        this.mPreviewTransform.h = scaleType;
        redrawPreview();
        attachToControllerIfReady(false);
    }

    public void setScreenFlashOverlayColor(int i) {
        this.mScreenFlashView.setBackgroundColor(i);
    }

    public void setScreenFlashWindow(Window window) {
        tob1.b();
        this.mScreenFlashView.setScreenFlashWindow(window);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    public void startListeningToDisplayChange() {
        DisplayManager displayManager = getDisplayManager();
        if (displayManager == null) {
            return;
        }
        displayManager.registerDisplayListener(this.mDisplayRotationListener, new Handler(Looper.getMainLooper()));
    }

    public void stopListeningToDisplayChange() {
        DisplayManager displayManager = getDisplayManager();
        if (displayManager == null) {
            return;
        }
        displayManager.unregisterDisplayListener(this.mDisplayRotationListener);
    }

    public void updateDisplayRotationIfNeeded() {
        Display defaultDisplay;
        ar7 ar7Var;
        if (!this.mUseDisplayRotation || (defaultDisplay = getDefaultDisplay()) == null || (ar7Var = this.mCameraInfoInternal) == null) {
            return;
        }
        c cVar = this.mPreviewTransform;
        int i = ar7Var.i(defaultDisplay.getRotation());
        int rotation = defaultDisplay.getRotation();
        if (cVar.g) {
            cVar.c = i;
            cVar.e = rotation;
        }
    }

    public xt31 getViewPort() {
        tob1.b();
        Display defaultDisplay = getDefaultDisplay();
        if (defaultDisplay == null) {
            return null;
        }
        return getViewPort(defaultDisplay.getRotation());
    }

    public PreviewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreviewView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreviewView(Context context) {
        this(context, null);
    }
}
