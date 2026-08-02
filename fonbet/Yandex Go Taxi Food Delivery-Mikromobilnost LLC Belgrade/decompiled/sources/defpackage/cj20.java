package defpackage;

import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;

/* loaded from: classes8.dex */
public final class cj20 {
    public final raa0 a;
    public final lx4 b;

    public cj20(raa0 raa0Var, lx4 lx4Var) {
        this.a = raa0Var;
        this.b = lx4Var;
    }

    public final void a(String str, boolean z, boolean z2) {
        String b;
        zzs zzsVar;
        i d = ((j) this.b).d(oyr.p("PaymentMethods.", str, ".MissingParams"));
        d.g("has_country_code", z);
        d.g("has_currency", z2);
        qaa0 a = this.a.a();
        if (a == null || (b = a.c) == null) {
            b = (a == null || (zzsVar = a.b) == null) ? "empty" : zzsVar.b();
        }
        d.d("geo", b);
        d.m();
    }
}
