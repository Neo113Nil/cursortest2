package xsna;

import java.util.List;

/* compiled from: ScaleKeyframeAnimation.java */
/* loaded from: classes12.dex */
public final class t4h0 extends phy<b5h0> {
    public final b5h0 i;

    public t4h0(List<nhy<b5h0>> list) {
        super(list);
        this.i = new b5h0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.tf6
    public final Object g(nhy nhyVar, float f) {
        T t;
        float f2;
        T t2 = nhyVar.b;
        if (t2 == 0 || (t = nhyVar.c) == 0) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        b5h0 b5h0Var = (b5h0) t2;
        b5h0 b5h0Var2 = (b5h0) t;
        a900<A> a900Var = this.e;
        if (a900Var != 0) {
            f2 = f;
            b5h0 b5h0Var3 = (b5h0) a900Var.b(nhyVar.g, nhyVar.h.floatValue(), b5h0Var, b5h0Var2, f2, e(), this.d);
            if (b5h0Var3 != null) {
                return b5h0Var3;
            }
        } else {
            f2 = f;
        }
        float f3 = ls20.f(b5h0Var.a, b5h0Var2.a, f2);
        float f4 = ls20.f(b5h0Var.b, b5h0Var2.b, f2);
        b5h0 b5h0Var4 = this.i;
        b5h0Var4.a = f3;
        b5h0Var4.b = f4;
        return b5h0Var4;
    }
}
