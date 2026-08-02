package yads;

import xsna.epx;
import xsna.ss9;

/* loaded from: classes10.dex */
public final class pr1 {
    public final String a;
    public final String b;

    public pr1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pr1)) {
            return false;
        }
        pr1 pr1Var = (pr1) obj;
        return epx.f(this.a, pr1Var.a) && epx.f(this.b, pr1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return ss9.a("MediationAdapterSignature(format=", this.a, ", className=", this.b, ")");
    }
}
