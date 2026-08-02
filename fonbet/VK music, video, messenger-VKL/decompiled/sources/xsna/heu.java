package xsna;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.compose.ui.unit.LayoutDirection;
import xsna.er9;
import xsna.mdu;

/* compiled from: GraphicsLayerV29.android.kt */
/* loaded from: classes11.dex */
public final class heu implements pdu {
    public final ir9 b;
    public final er9 c;
    public final RenderNode d;
    public long e;
    public Paint f;
    public Matrix g;
    public boolean h;
    public float i;
    public int j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public long p;
    public long q;
    public float r;
    public float s;
    public float t;
    public float u;
    public boolean v;
    public boolean w;
    public boolean x;
    public gyf0 y;
    public int z;

    public heu() {
        ir9 ir9Var = new ir9();
        er9 er9Var = new er9();
        this.b = ir9Var;
        this.c = er9Var;
        RenderNode b = m9f.b();
        this.d = b;
        this.e = 0L;
        b.setClipToBounds(false);
        e(b, 0);
        this.i = 1.0f;
        this.j = 3;
        this.k = 1.0f;
        this.l = 1.0f;
        long j = l5g.b;
        this.p = j;
        this.q = j;
        this.u = 8.0f;
        this.z = 0;
    }

    @Override // xsna.pdu
    public final void A(float f) {
        this.k = f;
        this.d.setScaleX(f);
    }

    @Override // xsna.pdu
    public final void B(float f) {
        this.l = f;
        this.d.setScaleY(f);
    }

    @Override // xsna.pdu
    public final gyf0 C() {
        return this.y;
    }

    @Override // xsna.pdu
    public final boolean D() {
        boolean hasDisplayList;
        hasDisplayList = this.d.hasDisplayList();
        return hasDisplayList;
    }

    @Override // xsna.pdu
    public final void E(Outline outline, long j) {
        this.d.setOutline(outline);
        this.h = outline != null;
        d();
    }

    @Override // xsna.pdu
    public final float F() {
        return this.o;
    }

    @Override // xsna.pdu
    public final void G() {
        this.d.discardDisplayList();
    }

    @Override // xsna.pdu
    public final float H() {
        return this.s;
    }

    @Override // xsna.pdu
    public final float I() {
        return this.t;
    }

    @Override // xsna.pdu
    public final float J() {
        return this.k;
    }

    @Override // xsna.pdu
    public final void K(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.d.resetPivot();
        } else {
            this.d.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.d.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // xsna.pdu
    public final float L() {
        return this.r;
    }

    @Override // xsna.pdu
    public final float M() {
        return this.l;
    }

    @Override // xsna.pdu
    public final long N() {
        return this.q;
    }

    @Override // xsna.pdu
    public final float O() {
        return this.u;
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
        return this.z;
    }

    @Override // xsna.pdu
    public final void R(int i, int i2, long j) {
        this.d.setPosition(i, i2, ((int) (j >> 32)) + i, ((int) (4294967295L & j)) + i2);
        this.e = pli.w(j);
    }

    @Override // xsna.pdu
    public final long S() {
        return this.p;
    }

    @Override // xsna.pdu
    public final void T(azl azlVar, LayoutDirection layoutDirection, mdu mduVar, mdu.a aVar) {
        RecordingCanvas beginRecording;
        er9 er9Var = this.c;
        beginRecording = this.d.beginRecording();
        try {
            ir9 ir9Var = this.b;
            d52 d52Var = ir9Var.a;
            Canvas canvas = d52Var.a;
            d52Var.a = beginRecording;
            er9.b bVar = er9Var.c;
            bVar.f(azlVar);
            bVar.g(layoutDirection);
            bVar.b = mduVar;
            bVar.h(this.e);
            bVar.e(d52Var);
            aVar.invoke(er9Var);
            ir9Var.a.a = canvas;
        } finally {
            this.d.endRecording();
        }
    }

    @Override // xsna.pdu
    public final int U() {
        return this.j;
    }

    @Override // xsna.pdu
    public final void V(yq9 yq9Var) {
        Canvas canvas = e52.a;
        ((d52) yq9Var).a.drawRenderNode(this.d);
    }

    @Override // xsna.pdu
    public final void W(int i) {
        this.z = i;
        k();
    }

    @Override // xsna.pdu
    public final float a() {
        return this.i;
    }

    @Override // xsna.pdu
    public final void b(float f) {
        this.i = f;
        this.d.setAlpha(f);
    }

    @Override // xsna.pdu
    public final d6g c() {
        return null;
    }

    public final void d() {
        boolean z = this.v;
        boolean z2 = false;
        boolean z3 = z && !this.h;
        if (z && this.h) {
            z2 = true;
        }
        if (z3 != this.w) {
            this.w = z3;
            this.d.setClipToBounds(z3);
        }
        if (z2 != this.x) {
            this.x = z2;
            this.d.setClipToOutline(z2);
        }
    }

    public final void e(RenderNode renderNode, int i) {
        if (i == 1) {
            renderNode.setUseCompositingLayer(true, this.f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setUseCompositingLayer(false, this.f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, this.f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // xsna.pdu
    public final void f(boolean z) {
        this.v = z;
        d();
    }

    @Override // xsna.pdu
    public final void g(float f) {
        this.r = f;
        this.d.setRotationX(f);
    }

    @Override // xsna.pdu
    public final void h(float f) {
        this.s = f;
        this.d.setRotationY(f);
    }

    @Override // xsna.pdu
    public final void i(float f) {
        this.o = f;
        this.d.setElevation(f);
    }

    @Override // xsna.pdu
    public final void j(float f) {
        this.t = f;
        this.d.setRotationZ(f);
    }

    public final void k() {
        int i = this.z;
        if (i != 1 && this.j == 3 && this.y == null) {
            e(this.d, i);
        } else {
            e(this.d, 1);
        }
    }

    @Override // xsna.pdu
    public final void l(int i) {
        this.j = i;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setBlendMode(z42.a(i));
        k();
    }

    @Override // xsna.pdu
    public final void m(long j) {
        this.p = j;
        this.d.setAmbientShadowColor(f870.H(j));
    }

    @Override // xsna.pdu
    public final void n(float f) {
        this.n = f;
        this.d.setTranslationY(f);
    }

    @Override // xsna.pdu
    public final void o(float f) {
        this.m = f;
        this.d.setTranslationX(f);
    }

    @Override // xsna.pdu
    public final float p() {
        return this.n;
    }

    @Override // xsna.pdu
    public final float q() {
        return this.m;
    }

    @Override // xsna.pdu
    public final void r(long j) {
        this.q = j;
        this.d.setSpotShadowColor(f870.H(j));
    }

    @Override // xsna.pdu
    public final void s(gyf0 gyf0Var) {
        this.y = gyf0Var;
        if (Build.VERSION.SDK_INT >= 31) {
            this.d.setRenderEffect(gyf0Var != null ? gyf0Var.a() : null);
        }
    }

    @Override // xsna.pdu
    public final void t() {
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setColorFilter(null);
        k();
    }

    @Override // xsna.pdu
    public final void u(float f) {
        this.u = f;
        this.d.setCameraDistance(f);
    }
}
