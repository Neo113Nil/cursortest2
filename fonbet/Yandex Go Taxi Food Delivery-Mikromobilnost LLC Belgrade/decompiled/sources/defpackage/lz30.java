package defpackage;

import com.yandex.go.payments.domain.l0;
import com.yandex.go.payments.transport.data.b;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes13.dex */
public final class lz30 {
    public final qr30 a;
    public final n6a0 b;
    public final b c;

    public lz30(qr30 qr30Var, n6a0 n6a0Var) {
        this.a = qr30Var;
        this.b = n6a0Var;
        l0 a = qr30Var.a();
        qr30Var.getClass();
        this.c = new b(a.j("transport_card"), this);
    }

    public final m6a0 a() {
        qr30 qr30Var = this.a;
        l0 a = qr30Var.a();
        qr30Var.getClass();
        lv90 i = a.i("transport_card");
        if (i != null) {
            return this.b.a(i);
        }
        return null;
    }

    public final void b(m6a0 m6a0Var) {
        PaymentMethod$Type paymentMethod$Type = m6a0Var != null ? m6a0Var.a : null;
        PaymentMethod$Type paymentMethod$Type2 = PaymentMethod$Type.TRANSPORT_CARD;
        qr30 qr30Var = this.a;
        if (paymentMethod$Type != paymentMethod$Type2) {
            l0 a = qr30Var.a();
            qr30Var.getClass();
            a.g(null, "transport_card");
            return;
        }
        kv90 kv90Var = lv90.Companion;
        String str = m6a0Var.b;
        kv90Var.getClass();
        lv90 b = kv90.b(str, paymentMethod$Type2);
        l0 a2 = qr30Var.a();
        qr30Var.getClass();
        a2.e.a(b, "transport_card");
    }
}
