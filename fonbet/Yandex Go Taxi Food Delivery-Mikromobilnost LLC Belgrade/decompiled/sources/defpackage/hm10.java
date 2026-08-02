package defpackage;

import com.yandex.go.payments.paymentlist.experiments.MainMenuPaymentMethodsSelectorExperiment;

/* loaded from: classes13.dex */
public final class hm10 extends g6a0 {
    public final String b;
    public final CharSequence c;
    public final String d;
    public final boolean e;
    public final String f;
    public final kdc g;
    public final kdc h;

    public hm10(String str, CharSequence charSequence, String str2, boolean z, String str3, MainMenuPaymentMethodsSelectorExperiment.ShowPolicy showPolicy, kdc kdcVar, kdc kdcVar2) {
        super(new fvc(new Object[]{str, charSequence, str2, Boolean.valueOf(z), str3, showPolicy, kdcVar, kdcVar2}));
        this.b = str;
        this.c = charSequence;
        this.d = str2;
        this.e = z;
        this.f = str3;
        this.g = kdcVar;
        this.h = kdcVar2;
    }

    public final String c() {
        return this.b;
    }

    public final String m() {
        return this.f;
    }

    public final kdc n() {
        return this.g;
    }
}
