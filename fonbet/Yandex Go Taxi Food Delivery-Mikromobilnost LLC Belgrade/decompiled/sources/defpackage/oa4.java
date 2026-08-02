package defpackage;

import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes8.dex */
public final class oa4 implements gw90 {
    public final g8a0 a;
    public final ka4 b;

    public oa4(g8a0 g8a0Var, b8r b8rVar, ka4 ka4Var) {
        this.a = g8a0Var;
        this.b = ka4Var;
    }

    @Override // defpackage.gw90
    public final bw90 a(PaymentMethod$Type paymentMethod$Type) {
        boolean contains;
        xw91 xw91Var = xw91.b;
        ka4 ka4Var = this.b;
        if (jl40.l(ka4Var, xw91Var)) {
            contains = true;
        } else if (jl40.l(ka4Var, dab1.w)) {
            contains = this.a.c(paymentMethod$Type);
        } else {
            if (!(ka4Var instanceof ja4)) {
                w511.b();
                return null;
            }
            contains = ((ja4) ka4Var).a().contains(paymentMethod$Type.getCode());
        }
        return contains ? xw91.C : aw90.a;
    }
}
