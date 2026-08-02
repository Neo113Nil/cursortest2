package xsna;

import android.graphics.PointF;
import java.util.List;

/* compiled from: PointKeyframeAnimation.java */
/* loaded from: classes12.dex */
public final class llb0 extends phy<PointF> {
    public final PointF i;

    public llb0(List<nhy<PointF>> list) {
        super(list);
        this.i = new PointF();
    }

    @Override // xsna.tf6
    public final Object g(nhy nhyVar, float f) {
        return h(nhyVar, f, f, f);
    }

    @Override // xsna.tf6
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final PointF h(nhy<PointF> nhyVar, float f, float f2, float f3) {
        PointF pointF;
        PointF pointF2;
        PointF pointF3 = nhyVar.b;
        if (pointF3 == null || (pointF = nhyVar.c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF4 = pointF3;
        PointF pointF5 = pointF;
        a900<A> a900Var = this.e;
        if (a900Var != 0 && (pointF2 = (PointF) a900Var.b(nhyVar.g, nhyVar.h.floatValue(), pointF4, pointF5, f, e(), this.d)) != null) {
            return pointF2;
        }
        float f4 = pointF4.x;
        float b = u11.b(pointF5.x, f4, f2, f4);
        float f5 = pointF4.y;
        float b2 = u11.b(pointF5.y, f5, f3, f5);
        PointF pointF6 = this.i;
        pointF6.set(b, b2);
        return pointF6;
    }
}
