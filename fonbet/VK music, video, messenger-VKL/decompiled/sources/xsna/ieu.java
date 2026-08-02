package xsna;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.unit.LayoutDirection;
import xsna.mdu;

/* compiled from: GraphicsViewLayer.android.kt */
/* loaded from: classes11.dex */
public final class ieu implements pdu {
    public static final a B = new a();
    public gyf0 A;
    public final qho b;
    public final ir9 c;
    public final iyt0 d;
    public final Resources e;
    public final Rect f;
    public Paint g;
    public int h;
    public int i;
    public long j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;
    public long v;
    public long w;
    public float x;
    public float y;
    public float z;

    /* compiled from: GraphicsViewLayer.android.kt */
    public static final class a extends Canvas {
        @Override // android.graphics.Canvas
        public final boolean isHardwareAccelerated() {
            return true;
        }
    }

    public ieu(qho qhoVar) {
        ir9 ir9Var = new ir9();
        er9 er9Var = new er9();
        this.b = qhoVar;
        this.c = ir9Var;
        iyt0 iyt0Var = new iyt0(qhoVar, ir9Var, er9Var);
        this.d = iyt0Var;
        this.e = qhoVar.getResources();
        this.f = new Rect();
        qhoVar.addView(iyt0Var);
        iyt0Var.setClipBounds(null);
        this.j = 0L;
        View.generateViewId();
        this.n = 3;
        this.o = 0;
        this.p = 1.0f;
        this.q = 1.0f;
        this.r = 1.0f;
        long j = l5g.b;
        this.v = j;
        this.w = j;
    }

    @Override // xsna.pdu
    public final void A(float f) {
        this.q = f;
        this.d.setScaleX(f);
    }

    @Override // xsna.pdu
    public final void B(float f) {
        this.r = f;
        this.d.setScaleY(f);
    }

    @Override // xsna.pdu
    public final gyf0 C() {
        return this.A;
    }

    @Override // xsna.pdu
    public final void E(Outline outline, long j) {
        iyt0 iyt0Var = this.d;
        iyt0Var.f = outline;
        iyt0Var.invalidateOutline();
        if ((this.m || iyt0Var.getClipToOutline()) && outline != null) {
            iyt0Var.setClipToOutline(true);
            if (this.m) {
                this.m = false;
                this.k = true;
            }
        }
        this.l = outline != null;
    }

    @Override // xsna.pdu
    public final float F() {
        return this.u;
    }

    @Override // xsna.pdu
    public final void G() {
        this.b.removeViewInLayout(this.d);
    }

    @Override // xsna.pdu
    public final float H() {
        return this.y;
    }

    @Override // xsna.pdu
    public final float I() {
        return this.z;
    }

    @Override // xsna.pdu
    public final float J() {
        return this.q;
    }

    @Override // xsna.pdu
    public final void K(long j) {
        long j2 = 9223372034707292159L & j;
        iyt0 iyt0Var = this.d;
        if (j2 == 9205357640488583168L) {
            iyt0Var.resetPivot();
        } else {
            iyt0Var.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            iyt0Var.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // xsna.pdu
    public final float L() {
        return this.x;
    }

    @Override // xsna.pdu
    public final float M() {
        return this.r;
    }

    @Override // xsna.pdu
    public final long N() {
        return this.w;
    }

    @Override // xsna.pdu
    public final float O() {
        return this.d.getCameraDistance() / this.e.getDisplayMetrics().densityDpi;
    }

    @Override // xsna.pdu
    public final Matrix P() {
        return this.d.getMatrix();
    }

    @Override // xsna.pdu
    public final int Q() {
        return this.o;
    }

    @Override // xsna.pdu
    public final void R(int i, int i2, long j) {
        boolean b = q9x.b(this.j, j);
        iyt0 iyt0Var = this.d;
        if (b) {
            int i3 = this.h;
            if (i3 != i) {
                iyt0Var.offsetLeftAndRight(i - i3);
            }
            int i4 = this.i;
            if (i4 != i2) {
                iyt0Var.offsetTopAndBottom(i2 - i4);
            }
        } else {
            if (this.m || iyt0Var.getClipToOutline()) {
                this.k = true;
            }
            iyt0Var.layout(i, i2, ((int) (j >> 32)) + i, ((int) (4294967295L & j)) + i2);
            this.j = j;
        }
        this.h = i;
        this.i = i2;
    }

    @Override // xsna.pdu
    public final long S() {
        return this.v;
    }

    @Override // xsna.pdu
    public final void T(azl azlVar, LayoutDirection layoutDirection, mdu mduVar, mdu.a aVar) {
        iyt0 iyt0Var = this.d;
        ViewParent parent = iyt0Var.getParent();
        qho qhoVar = this.b;
        if (parent == null) {
            qhoVar.addView(iyt0Var);
        }
        iyt0Var.h = azlVar;
        iyt0Var.i = layoutDirection;
        iyt0Var.j = aVar;
        iyt0Var.k = mduVar;
        if (iyt0Var.isAttachedToWindow()) {
            iyt0Var.setVisibility(4);
            iyt0Var.setVisibility(0);
            try {
                ir9 ir9Var = this.c;
                a aVar2 = B;
                d52 d52Var = ir9Var.a;
                Canvas canvas = d52Var.a;
                d52Var.a = aVar2;
                qhoVar.a(d52Var, iyt0Var, iyt0Var.getDrawingTime());
                ir9Var.a.a = canvas;
            } catch (ClassCastException unused) {
            }
        }
    }

    @Override // xsna.pdu
    public final int U() {
        return this.n;
    }

    @Override // xsna.pdu
    public final void V(yq9 yq9Var) {
        Rect rect;
        boolean z = this.k;
        iyt0 iyt0Var = this.d;
        if (z) {
            if ((this.m || iyt0Var.getClipToOutline()) && !this.l) {
                rect = this.f;
                rect.left = 0;
                rect.top = 0;
                rect.right = iyt0Var.getWidth();
                rect.bottom = iyt0Var.getHeight();
            } else {
                rect = null;
            }
            iyt0Var.setClipBounds(rect);
        }
        Canvas canvas = e52.a;
        if (((d52) yq9Var).a.isHardwareAccelerated()) {
            this.b.a(yq9Var, iyt0Var, iyt0Var.getDrawingTime());
        }
    }

    @Override // xsna.pdu
    public final void W(int i) {
        this.o = i;
        e();
    }

    @Override // xsna.pdu
    public final float a() {
        return this.p;
    }

    @Override // xsna.pdu
    public final void b(float f) {
        this.p = f;
        this.d.setAlpha(f);
    }

    @Override // xsna.pdu
    public final d6g c() {
        return null;
    }

    public final void d(int i) {
        iyt0 iyt0Var = this.d;
        boolean z = true;
        if (i == 1) {
            iyt0Var.setLayerType(2, this.g);
        } else if (i == 2) {
            iyt0Var.setLayerType(0, this.g);
            z = false;
        } else {
            iyt0Var.setLayerType(0, this.g);
        }
        iyt0Var.setCanUseCompositingLayer$ui_graphics(z);
    }

    public final void e() {
        int i = this.o;
        if (i != 1 && this.n == 3) {
            d(i);
        } else {
            d(1);
        }
    }

    @Override // xsna.pdu
    public final void f(boolean z) {
        boolean z2 = false;
        this.m = z && !this.l;
        this.k = true;
        if (z && this.l) {
            z2 = true;
        }
        this.d.setClipToOutline(z2);
    }

    @Override // xsna.pdu
    public final void g(float f) {
        this.x = f;
        this.d.setRotationX(f);
    }

    @Override // xsna.pdu
    public final void h(float f) {
        this.y = f;
        this.d.setRotationY(f);
    }

    @Override // xsna.pdu
    public final void i(float f) {
        this.u = f;
        this.d.setElevation(f);
    }

    @Override // xsna.pdu
    public final void j(float f) {
        this.z = f;
        this.d.setRotation(f);
    }

    @Override // xsna.pdu
    public final void l(int i) {
        this.n = i;
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(z42.b(i)));
        e();
    }

    @Override // xsna.pdu
    public final void m(long j) {
        this.v = j;
        this.d.setOutlineAmbientShadowColor(f870.H(j));
    }

    @Override // xsna.pdu
    public final void n(float f) {
        this.t = f;
        this.d.setTranslationY(f);
    }

    @Override // xsna.pdu
    public final void o(float f) {
        this.s = f;
        this.d.setTranslationX(f);
    }

    @Override // xsna.pdu
    public final float p() {
        return this.t;
    }

    @Override // xsna.pdu
    public final float q() {
        return this.s;
    }

    @Override // xsna.pdu
    public final void r(long j) {
        this.w = j;
        this.d.setOutlineSpotShadowColor(f870.H(j));
    }

    @Override // xsna.pdu
    public final void s(gyf0 gyf0Var) {
        this.A = gyf0Var;
        if (Build.VERSION.SDK_INT >= 31) {
            this.d.setRenderEffect(gyf0Var != null ? gyf0Var.a() : null);
        }
    }

    @Override // xsna.pdu
    public final void t() {
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
        }
        paint.setColorFilter(null);
        e();
    }

    @Override // xsna.pdu
    public final void u(float f) {
        this.d.setCameraDistance(f * this.e.getDisplayMetrics().densityDpi);
    }
}
