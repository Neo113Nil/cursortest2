package defpackage;

import kotlinx.datetime.YearMonth;

/* loaded from: classes4.dex */
public final class nb61 extends e7 {
    public final od7 a;

    public nb61(od7 od7Var) {
        this.a = od7Var;
    }

    @Override // defpackage.e7
    public final od7 a() {
        return this.a;
    }

    @Override // defpackage.e7
    public final fpe b() {
        return pb61.a;
    }

    @Override // defpackage.e7
    public final Object d(fpe fpeVar) {
        oqv oqvVar = (oqv) fpeVar;
        Integer num = oqvVar.a;
        pb61.a(num, "year");
        int intValue = num.intValue();
        Integer num2 = oqvVar.b;
        pb61.a(num2, "monthNumber");
        return new YearMonth(intValue, num2.intValue());
    }
}
