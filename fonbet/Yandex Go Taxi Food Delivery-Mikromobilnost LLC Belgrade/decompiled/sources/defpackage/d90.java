package defpackage;

import com.yandex.go.payments.data.model.response.PaymentMethods;
import com.yandex.go.payments.paymentlist.data.c;

/* loaded from: classes8.dex */
public final class d90 {
    public final cda0 a;
    public final raa0 b;

    public d90(cda0 cda0Var, raa0 raa0Var) {
        this.a = cda0Var;
        this.b = raa0Var;
    }

    public final ka0 a() {
        c cVar = (c) this.a;
        String str = cVar.g.b.g().p;
        PaymentMethods.LocationInfo locationInfo = cVar.g.b.g().o;
        Integer num = locationInfo != null ? locationInfo.c : null;
        qaa0 a = this.b.a();
        return new ka0(a != null ? a.b : null, num, str);
    }
}
