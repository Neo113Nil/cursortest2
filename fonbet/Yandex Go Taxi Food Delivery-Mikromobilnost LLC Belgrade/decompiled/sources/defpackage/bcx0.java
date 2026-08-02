package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class bcx0 implements ccx0 {
    public final String a;
    public final String b;

    public bcx0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bcx0)) {
            return false;
        }
        bcx0 bcx0Var = (bcx0) obj;
        return jl40.l(this.a, bcx0Var.a) && jl40.l(this.b, bcx0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return unr0.p("ScrollToRequirement(groupName=", this.a, ", requirementName=", this.b, Extension.C_BRAKE);
    }
}
