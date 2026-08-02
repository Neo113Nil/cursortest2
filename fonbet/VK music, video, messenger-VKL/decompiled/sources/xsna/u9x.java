package xsna;

import android.graphics.PointF;

/* compiled from: IntegerKeyframeAnimation.java */
/* loaded from: classes12.dex */
public final class u9x extends phy<Integer> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.tf6
    public final Object g(nhy nhyVar, float f) {
        int i;
        float f2;
        int i2;
        T t = nhyVar.b;
        if (t == 0) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        T t2 = nhyVar.c;
        if (t2 == 0) {
            if (nhyVar.k == 784923401) {
                nhyVar.k = ((Integer) t).intValue();
            }
            i = nhyVar.k;
        } else {
            if (nhyVar.l == 784923401) {
                nhyVar.l = ((Integer) t2).intValue();
            }
            i = nhyVar.l;
        }
        a900<A> a900Var = this.e;
        if (a900Var != 0) {
            f2 = f;
            Integer num = (Integer) a900Var.b(nhyVar.g, nhyVar.h.floatValue(), (Integer) t, Integer.valueOf(i), f2, e(), this.d);
            if (num != null) {
                i2 = num.intValue();
                return Integer.valueOf(i2);
            }
        } else {
            f2 = f;
        }
        if (nhyVar.k == 784923401) {
            nhyVar.k = ((Integer) t).intValue();
        }
        int i3 = nhyVar.k;
        PointF pointF = ls20.a;
        i2 = (int) (((i - i3) * f2) + i3);
        return Integer.valueOf(i2);
    }
}
