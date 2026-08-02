package yads;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes10.dex */
public final class ek2 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public ek2(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ek2)) {
            return false;
        }
        ek2 ek2Var = (ek2) obj;
        return mc3.a(this.a, ek2Var.a) && mc3.a(this.b, ek2Var.b) && mc3.a(this.c, ek2Var.c) && mc3.a(this.d, ek2Var.d) && mc3.a(this.e, ek2Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.e;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
