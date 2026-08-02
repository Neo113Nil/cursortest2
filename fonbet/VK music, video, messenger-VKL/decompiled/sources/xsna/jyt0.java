package xsna;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.e;
import com.unity3d.services.UnityAdsConstants;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Lambda;

/* compiled from: ViewLayer.android.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes11.dex */
public final class jyt0 extends View implements m490 {
    public static Method g;
    public static Field h;
    public static boolean i;
    public static boolean j;
    public boolean b;
    public Rect c;
    public boolean d;
    public float e;
    public long f;

    /* compiled from: ViewLayer.android.kt */
    public static final class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            ((jyt0) view).getClass();
            throw null;
        }
    }

    /* compiled from: ViewLayer.android.kt */
    public static final class b extends Lambda implements wzs<View, Matrix, s3q0> {
        public static final b i = new b(2);

        @Override // xsna.wzs
        public final s3q0 invoke(View view, Matrix matrix) {
            matrix.set(view.getMatrix());
            return s3q0.a;
        }
    }

    static {
        new a();
    }

    public jyt0() {
        throw null;
    }

    private final Path getManualClipPath() {
        if (getClipToOutline()) {
            throw null;
        }
        return null;
    }

    private final void setInvalidated(boolean z) {
        if (z == this.d) {
            return;
        }
        this.d = z;
        throw null;
    }

    @Override // xsna.m490
    public final void a(oh50 oh50Var, boolean z) {
        if (!z) {
            throw null;
        }
        throw null;
    }

    @Override // xsna.m490
    public final void b(gzs gzsVar, wzs wzsVar) {
        throw null;
    }

    @Override // xsna.m490
    public final void c(yq9 yq9Var, mdu mduVar) {
        if (getElevation() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            yq9Var.s();
        }
        getDrawingTime();
        throw null;
    }

    @Override // xsna.m490
    public final void d(float[] fArr) {
        throw null;
    }

    @Override // xsna.m490
    public final void destroy() {
        setInvalidated(false);
        throw null;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        throw null;
    }

    @Override // xsna.m490
    public final long e(long j2, boolean z) {
        if (z) {
            throw null;
        }
        throw null;
    }

    @Override // xsna.m490
    public final boolean f(long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        if (this.b) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= intBitsToFloat && intBitsToFloat < ((float) getWidth()) && UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= intBitsToFloat2 && intBitsToFloat2 < ((float) getHeight());
        }
        if (getClipToOutline()) {
            throw null;
        }
        return true;
    }

    @Override // xsna.m490
    public final void g(float[] fArr) {
        throw null;
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final pho getContainer() {
        return null;
    }

    public float getFrameRate() {
        return this.e;
    }

    public long getLayerId() {
        return 0L;
    }

    public final p52 getOwnerView() {
        return null;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT < 29) {
            return -1L;
        }
        throw null;
    }

    @Override // xsna.m490
    /* renamed from: getUnderlyingMatrix-sQKQjiQ, reason: not valid java name */
    public float[] mo409getUnderlyingMatrixsQKQjiQ() {
        throw null;
    }

    @Override // xsna.m490
    public final void h(long j2) {
        int i2 = (int) (j2 >> 32);
        if (i2 != getLeft()) {
            offsetLeftAndRight(i2 - getLeft());
            throw null;
        }
        int i3 = (int) (j2 & 4294967295L);
        if (i3 == getTop()) {
            return;
        }
        offsetTopAndBottom(i3 - getTop());
        throw null;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // xsna.m490
    public final void i() {
        if (!this.d || j) {
            return;
        }
        try {
            if (!i) {
                i = true;
                g = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                h = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                Method method = g;
                if (method != null) {
                    method.setAccessible(true);
                }
                Field field = h;
                if (field != null) {
                    field.setAccessible(true);
                }
            }
            Field field2 = h;
            if (field2 != null) {
                field2.setBoolean(this, true);
            }
            Method method2 = g;
            if (method2 != null) {
                method2.invoke(this, null);
            }
        } catch (Throwable unused) {
            j = true;
        }
        setInvalidated(false);
    }

    @Override // android.view.View, xsna.m490
    public final void invalidate() {
        if (this.d) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        throw null;
    }

    @Override // xsna.m490
    public final void j(sfg0 sfg0Var) {
        Rect rect;
        int i2 = sfg0Var.b | 0;
        if ((i2 & 4096) != 0) {
            long j2 = sfg0Var.o;
            this.f = j2;
            setPivotX(lkp0.b(j2) * getWidth());
            setPivotY(lkp0.c(this.f) * getHeight());
        }
        if ((i2 & 1) != 0) {
            setScaleX(sfg0Var.c);
        }
        if ((i2 & 2) != 0) {
            setScaleY(sfg0Var.d);
        }
        if ((i2 & 4) != 0) {
            setAlpha(sfg0Var.e);
        }
        if ((i2 & 8) != 0) {
            setTranslationX(sfg0Var.f);
        }
        if ((i2 & 16) != 0) {
            setTranslationY(sfg0Var.g);
        }
        if ((i2 & 32) != 0) {
            setElevation(sfg0Var.h);
        }
        if ((i2 & 1024) != 0) {
            setRotation(sfg0Var.m);
        }
        if ((i2 & 256) != 0) {
            setRotationX(sfg0Var.k);
        }
        if ((i2 & 512) != 0) {
            setRotationY(sfg0Var.l);
        }
        if ((i2 & 2048) != 0) {
            setCameraDistancePx(sfg0Var.n);
        }
        getManualClipPath();
        boolean z = sfg0Var.q;
        e.a aVar = androidx.compose.ui.graphics.e.a;
        boolean z2 = false;
        boolean z3 = z && sfg0Var.p != aVar;
        if ((i2 & 24576) != 0) {
            if (z && sfg0Var.p == aVar) {
                z2 = true;
            }
            this.b = z2;
            if (this.b) {
                Rect rect2 = this.c;
                if (rect2 == null) {
                    this.c = new Rect(0, 0, getWidth(), getHeight());
                } else {
                    rect2.set(0, 0, getWidth(), getHeight());
                }
                rect = this.c;
            } else {
                rect = null;
            }
            setClipBounds(rect);
            setClipToOutline(z3);
        }
        throw null;
    }

    @Override // xsna.m490
    public final void k(long j2) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        if (i2 == getWidth() && i3 == getHeight()) {
            return;
        }
        setPivotX(lkp0.b(this.f) * i2);
        setPivotY(lkp0.c(this.f) * i3);
        throw null;
    }

    public final void setCameraDistancePx(float f) {
        setCameraDistance(f * getResources().getDisplayMetrics().densityDpi);
    }

    public void setFrameRate(float f) {
        this.e = f;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    public void setFrameRateFromParent(boolean z) {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }
}
