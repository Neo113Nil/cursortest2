package defpackage;

import ru.yandex.taxi.analytics.q;

/* loaded from: classes12.dex */
public final class ez90 {
    public final ac20 a;

    public ez90(ac20 ac20Var) {
        this.a = ac20Var;
    }

    public final void a(String str, String str2, Throwable th) {
        if (str2 != null) {
            str = g8e.p(str, "; request_id=", str2);
        }
        ((q) this.a).e("PaymentDomain", str, th);
    }
}
