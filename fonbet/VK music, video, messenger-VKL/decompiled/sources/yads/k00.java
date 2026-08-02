package yads;

import xsna.epx;
import xsna.ss9;

/* loaded from: classes10.dex */
public final class k00 {
    public final String a;
    public final String b;

    public k00(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k00)) {
            return false;
        }
        k00 k00Var = (k00) obj;
        return epx.f(this.a, k00Var.a) && epx.f(this.b, k00Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return ss9.a("CoreCreative(creativeId=", this.a, ", campaignId=", this.b, ")");
    }
}
