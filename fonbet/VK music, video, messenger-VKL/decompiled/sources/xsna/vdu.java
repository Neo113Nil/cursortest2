package xsna;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.view.RenderNode;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.concurrent.atomic.AtomicBoolean;
import xsna.er9;
import xsna.mdu;

/* compiled from: GraphicsLayerV23.android.kt */
/* loaded from: classes11.dex */
public final class vdu implements pdu {
    public static final AtomicBoolean C = new AtomicBoolean(true);
    public boolean A;
    public gyf0 B;
    public final ir9 b;
    public final er9 c;
    public final RenderNode d;
    public long e;
    public Paint f;
    public Matrix g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public float l;
    public boolean m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public long s;
    public long t;
    public float u;
    public float v;
    public float w;
    public float x;
    public boolean y;
    public boolean z;

    public vdu(p52 p52Var, ir9 ir9Var, er9 er9Var) {
        this.b = ir9Var;
        this.c = er9Var;
        RenderNode create = RenderNode.create("Compose", p52Var);
        this.d = create;
        this.e = 0L;
        this.i = 0L;
        if (C.getAndSet(false)) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            nyf0.c(create, nyf0.a(create));
            nyf0.d(create, nyf0.b(create));
            myf0.a(create);
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
        }
        create.setClipToBounds(false);
        e(0);
        this.j = 0;
        this.k = 3;
        this.l = 1.0f;
        this.n = 1.0f;
        this.o = 1.0f;
        long j = l5g.b;
        this.s = j;
        this.t = j;
        this.x = 8.0f;
    }

    @Override // xsna.pdu
    public final void A(float f) {
        this.n = f;
        this.d.setScaleX(f);
    }

    @Override // xsna.pdu
    public final void B(float f) {
        this.o = f;
        this.d.setScaleY(f);
    }

    @Override // xsna.pdu
    public final gyf0 C() {
        return this.B;
    }

    @Override // xsna.pdu
    public final boolean D() {
        return this.d.isValid();
    }

    @Override // xsna.pdu
    public final void E(Outline outline, long j) {
        this.i = j;
        this.d.setOutline(outline);
        this.h = outline != null;
        d();
    }

    @Override // xsna.pdu
    public final float F() {
        return this.r;
    }

    @Override // xsna.pdu
    public final void G() {
        myf0.a(this.d);
    }

    @Override // xsna.pdu
    public final float H() {
        return this.v;
    }

    @Override // xsna.pdu
    public final float I() {
        return this.w;
    }

    @Override // xsna.pdu
    public final float J() {
        return this.n;
    }

    @Override // xsna.pdu
    public final void K(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.m = true;
            this.d.setPivotX(((int) (this.e >> 32)) / 2.0f);
            this.d.setPivotY(((int) (4294967295L & this.e)) / 2.0f);
        } else {
            this.m = false;
            this.d.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.d.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // xsna.pdu
    public final float L() {
        return this.u;
    }

    @Override // xsna.pdu
    public final float M() {
        return this.o;
    }

    @Override // xsna.pdu
    public final long N() {
        return this.t;
    }

    @Override // xsna.pdu
    public final float O() {
        return this.x;
    }

    @Override // xsna.pdu
    public final Matrix P() {
        Matrix matrix = this.g;
        if (matrix == null) {
            matrix = new Matrix();
            this.g = matrix;
        }
        this.d.getMatrix(matrix);
        return matrix;
    }

    @Override // xsna.pdu
    public final int Q() {
        return this.j;
    }

    @Override // xsna.pdu
    public final void R(int i, int i2, long j) {
        int i3 = (int) (j >> 32);
        int i4 = (int) (4294967295L & j);
        this.d.setLeftTopRightBottom(i, i2, i + i3, i2 + i4);
        if (q9x.b(this.e, j)) {
            return;
        }
        if (this.m) {
            this.d.setPivotX(i3 / 2.0f);
            this.d.setPivotY(i4 / 2.0f);
        }
        this.e = j;
    }

    @Override // xsna.pdu
    public final long S() {
        return this.s;
    }

    @Override // xsna.pdu
    public final void T(azl azlVar, LayoutDirection layoutDirection, mdu mduVar, mdu.a aVar) {
        Canvas start = this.d.start(Math.max((int) (this.e >> 32), (int) (this.i >> 32)), Math.max((int) (this.e & 4294967295L), (int) (this.i & 4294967295L)));
        try {
            d52 d52Var = this.b.a;
            Canvas canvas = d52Var.a;
            d52Var.a = start;
            er9 er9Var = this.c;
            er9.b bVar = er9Var.c;
            long w = pli.w(this.e);
            azl b = bVar.b();
            LayoutDirection c = bVar.c();
            yq9 a = bVar.a();
            long d = bVar.d();
            mdu mduVar2 = bVar.b;
            bVar.f(azlVar);
            bVar.g(layoutDirection);
            bVar.e(d52Var);
            bVar.h(w);
            bVar.b = mduVar;
            d52Var.e();
            try {
                aVar.invoke(er9Var);
                d52Var.a();
                bVar.f(b);
                bVar.g(c);
                bVar.e(a);
                bVar.h(d);
                bVar.b = mduVar2;
                d52Var.a = canvas;
                this.d.end(start);
            } catch (Throwable th) {
                d52Var.a();
                er9.b bVar2 = er9Var.c;
                bVar2.f(b);
                bVar2.g(c);
                bVar2.e(a);
                bVar2.h(d);
                bVar2.b = mduVar2;
                throw th;
            }
        } catch (Throwable th2) {
            this.d.end(start);
            throw th2;
        }
    }

    @Override // xsna.pdu
    public final int U() {
        return this.k;
    }

    @Override // xsna.pdu
    public final void V(yq9 yq9Var) {
        Canvas canvas = e52.a;
        ((d52) yq9Var).a.drawRenderNode(this.d);
    }

    @Override // xsna.pdu
    public final void W(int i) {
        this.j = i;
        k();
    }

    @Override // xsna.pdu
    public final float a() {
        return this.l;
    }

    @Override // xsna.pdu
    public final void b(float f) {
        this.l = f;
        this.d.setAlpha(f);
    }

    @Override // xsna.pdu
    public final d6g c() {
        return null;
    }

    public final void d() {
        boolean z = this.y;
        boolean z2 = false;
        boolean z3 = z && !this.h;
        if (z && this.h) {
            z2 = true;
        }
        if (z3 != this.z) {
            this.z = z3;
            this.d.setClipToBounds(z3);
        }
        if (z2 != this.A) {
            this.A = z2;
            this.d.setClipToOutline(z2);
        }
    }

    public final void e(int i) {
        RenderNode renderNode = this.d;
        if (i == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // xsna.pdu
    public final void f(boolean z) {
        this.y = z;
        d();
    }

    @Override // xsna.pdu
    public final void g(float f) {
        this.u = f;
        this.d.setRotationX(f);
    }

    @Override // xsna.pdu
    public final void h(float f) {
        this.v = f;
        this.d.setRotationY(f);
    }

    @Override // xsna.pdu
    public final void i(float f) {
        this.r = f;
        this.d.setElevation(f);
    }

    @Override // xsna.pdu
    public final void j(float f) {
        this.w = f;
        this.d.setRotation(f);
    }

    public final void k() {
        int i = this.j;
        if (i != 1 && this.k == 3) {
            e(i);
        } else {
            e(1);
        }
    }

    @Override // xsna.pdu
    public final void l(int i) {
        if (this.k == i) {
            return;
        }
        this.k = i;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(z42.b(i)));
        k();
    }

    @Override // xsna.pdu
    public final void m(long j) {
        this.s = j;
        nyf0.c(this.d, f870.H(j));
    }

    @Override // xsna.pdu
    public final void n(float f) {
        this.q = f;
        this.d.setTranslationY(f);
    }

    @Override // xsna.pdu
    public final void o(float f) {
        this.p = f;
        this.d.setTranslationX(f);
    }

    @Override // xsna.pdu
    public final float p() {
        return this.q;
    }

    @Override // xsna.pdu
    public final float q() {
        return this.p;
    }

    @Override // xsna.pdu
    public final void r(long j) {
        this.t = j;
        nyf0.d(this.d, f870.H(j));
    }

    @Override // xsna.pdu
    public final void s(gyf0 gyf0Var) {
        this.B = gyf0Var;
    }

    @Override // xsna.pdu
    public final void t() {
        k();
    }

    @Override // xsna.pdu
    public final void u(float f) {
        this.x = f;
        this.d.setCameraDistance(-f);
    }
}
