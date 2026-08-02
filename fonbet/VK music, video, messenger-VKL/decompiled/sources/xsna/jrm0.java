package xsna;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.model.content.ShapeStroke;

/* compiled from: StrokeContent.java */
/* loaded from: classes12.dex */
public final class jrm0 extends ro6 {
    public final com.airbnb.lottie.model.layer.a q;
    public final String r;
    public final boolean s;
    public final u6g t;

    @Nullable
    public pjr0 u;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public jrm0(k800 k800Var, com.airbnb.lottie.model.layer.a aVar, ShapeStroke shapeStroke) {
        super(k800Var, aVar, r3, r0 != 1 ? r0 != 2 ? r0 != 3 ? null : Paint.Join.ROUND : Paint.Join.MITER : Paint.Join.BEVEL, shapeStroke.i, shapeStroke.e, shapeStroke.f, shapeStroke.c, shapeStroke.b);
        ShapeStroke.LineCapType lineCapType = shapeStroke.g;
        lineCapType.getClass();
        int i = ShapeStroke.a.a[lineCapType.ordinal()];
        Paint.Cap cap = i != 1 ? i != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        ShapeStroke.LineJoinType lineJoinType = shapeStroke.h;
        lineJoinType.getClass();
        int i2 = ShapeStroke.a.b[lineJoinType.ordinal()];
        this.q = aVar;
        this.r = shapeStroke.a;
        this.s = shapeStroke.j;
        tf6<Integer, Integer> j = shapeStroke.d.j();
        this.t = (u6g) j;
        j.a(this);
        aVar.h(j);
    }

    @Override // xsna.ro6, xsna.plo
    public final void e(Canvas canvas, Matrix matrix, int i, @Nullable com.airbnb.lottie.utils.a aVar) {
        if (this.s) {
            return;
        }
        u6g u6gVar = this.t;
        int m = u6gVar.m(u6gVar.b(), u6gVar.d());
        xky xkyVar = this.i;
        xkyVar.setColor(m);
        pjr0 pjr0Var = this.u;
        if (pjr0Var != null) {
            xkyVar.setColorFilter((ColorFilter) pjr0Var.f());
        }
        super.e(canvas, matrix, i, aVar);
    }

    @Override // xsna.ro6, xsna.vdy
    public final <T> void f(T t, @Nullable a900<T> a900Var) {
        super.f(t, a900Var);
        PointF pointF = t800.a;
        u6g u6gVar = this.t;
        if (t == 2) {
            u6gVar.k(a900Var);
            return;
        }
        if (t == t800.I) {
            pjr0 pjr0Var = this.u;
            com.airbnb.lottie.model.layer.a aVar = this.q;
            if (pjr0Var != null) {
                aVar.o(pjr0Var);
            }
            if (a900Var == null) {
                this.u = null;
                return;
            }
            pjr0 pjr0Var2 = new pjr0(null, a900Var);
            this.u = pjr0Var2;
            pjr0Var2.a(this);
            aVar.h(u6gVar);
        }
    }

    @Override // xsna.gfj
    public final String getName() {
        return this.r;
    }
}
