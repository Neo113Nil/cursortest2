package defpackage;

import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes13.dex */
public final class n6a0 {
    public static m6a0 b(n6a0 n6a0Var, lea0 lea0Var) {
        n6a0Var.getClass();
        return new m6a0(lea0Var.c(), lea0Var.getId(), null);
    }

    public final m6a0 a(lv90 lv90Var) {
        PaymentMethod$Type paymentMethod$Type = lv90Var.a;
        if (paymentMethod$Type == null) {
            return null;
        }
        return new m6a0(paymentMethod$Type, lv90Var.b, null);
    }
}
