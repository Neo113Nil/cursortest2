package defpackage;

import java.util.ArrayList;

/* loaded from: classes12.dex */
public final class e6 {
    public final String a;
    public final ArrayList b;
    public final String c;
    public final String d;

    public e6(String str, String str2, String str3, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e6)) {
            return false;
        }
        e6 e6Var = (e6) obj;
        return this.a.equals(e6Var.a) && this.b.equals(e6Var.b) && this.c.equals(e6Var.c) && this.d.equals(e6Var.d);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + unr0.e(unr0.e(unr0.b(unr0.b(ly3.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, true), 31, false);
    }

    public final String toString() {
        return g8e.r(x4e.m("AboutScreenUiState(version=", this.a, ", additionalPolicies=", ", legalInfo=", this.b), this.c, ", copyright=", this.d, ", showLicenceAgreement=true, showTermsOfService=false, showOtherYandexApps=false)");
    }
}
