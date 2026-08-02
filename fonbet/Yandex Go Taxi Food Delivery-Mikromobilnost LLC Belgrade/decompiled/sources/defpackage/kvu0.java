package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.model.content.ShapeStroke$LineCapType;
import com.airbnb.lottie.model.content.ShapeStroke$LineJoinType;
import com.airbnb.lottie.utils.a;

/* loaded from: classes10.dex */
public final class kvu0 extends ra5 {
    public final l35 q;
    public final String r;
    public final boolean s;
    public final lfc t;
    public e131 u;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public kvu0(LottieDrawable lottieDrawable, l35 l35Var, qir0 qir0Var) {
        super(lottieDrawable, l35Var, r3, r0 != 1 ? r0 != 2 ? r0 != 3 ? null : Paint.Join.ROUND : Paint.Join.MITER : Paint.Join.BEVEL, qir0Var.i, qir0Var.e, qir0Var.f, qir0Var.c, qir0Var.b);
        ShapeStroke$LineCapType shapeStroke$LineCapType = qir0Var.g;
        shapeStroke$LineCapType.getClass();
        int i = pir0.a[shapeStroke$LineCapType.ordinal()];
        Paint.Cap cap = i != 1 ? i != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        ShapeStroke$LineJoinType shapeStroke$LineJoinType = qir0Var.h;
        shapeStroke$LineJoinType.getClass();
        int i2 = pir0.b[shapeStroke$LineJoinType.ordinal()];
        this.q = l35Var;
        this.r = qir0Var.a;
        this.s = qir0Var.j;
        i35 I = qir0Var.d.I();
        this.t = (lfc) I;
        I.a(this);
        l35Var.c(I);
    }

    @Override // defpackage.ra5, defpackage.ccm
    public final void f(Canvas canvas, Matrix matrix, int i, a aVar) {
        if (this.s) {
            return;
        }
        lfc lfcVar = this.t;
        int m = lfcVar.m(lfcVar.b(), lfcVar.d());
        LPaint lPaint = this.i;
        lPaint.setColor(m);
        e131 e131Var = this.u;
        if (e131Var != null) {
            lPaint.setColorFilter((ColorFilter) e131Var.f());
        }
        super.f(canvas, matrix, i, aVar);
    }

    @Override // defpackage.ra5, defpackage.tix
    public final void g(puz puzVar, Object obj) {
        super.g(puzVar, obj);
        PointF pointF = cuz.a;
        lfc lfcVar = this.t;
        if (obj == 2) {
            lfcVar.k(puzVar);
            return;
        }
        if (obj == cuz.I) {
            e131 e131Var = this.u;
            l35 l35Var = this.q;
            if (e131Var != null) {
                l35Var.m(e131Var);
            }
            if (puzVar == null) {
                this.u = null;
                return;
            }
            e131 e131Var2 = new e131(puzVar, null);
            this.u = e131Var2;
            e131Var2.a(this);
            l35Var.c(lfcVar);
        }
    }

    @Override // defpackage.uee
    public final String getName() {
        return this.r;
    }
}
