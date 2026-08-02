package defpackage;

/* loaded from: classes.dex */
public final class bb91 extends dd91 {
    public final String b;
    public final int c;
    public final int d;

    public /* synthetic */ bb91(String str, int i, int i2) {
        this.b = str;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.dd91
    public final String a() {
        return this.b;
    }

    @Override // defpackage.dd91
    public final int b() {
        return this.c;
    }

    @Override // defpackage.dd91
    public final int c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof dd91)) {
                return false;
            }
            dd91 dd91Var = (dd91) obj;
            if (!this.b.equals(dd91Var.a())) {
                return false;
            }
            int b = dd91Var.b();
            int i = this.c;
            if (i == 0) {
                throw null;
            }
            if (i != b) {
                return false;
            }
            int c = dd91Var.c();
            if (this.d == 0) {
                throw null;
            }
            if (c != 1) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() ^ 1000003;
        int i = this.c;
        if (i == 0) {
            throw null;
        }
        int i2 = (((hashCode * 1000003) ^ 1237) * 1000003) ^ i;
        if (this.d != 0) {
            return (i2 * 583896283) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        int i = this.c;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "NO_CHECKS" : "SKIP_SECURITY_CHECK" : "SKIP_COMPLIANCE_CHECK" : "ALL_CHECKS";
        String str2 = this.d == 1 ? "READ_AND_WRITE" : "null";
        String str3 = this.b;
        StringBuilder sb = new StringBuilder(str2.length() + str.length() + String.valueOf(str3).length() + 73 + 91 + 1);
        g8e.D(sb, "FileComplianceOptions{fileOwner=", str3, ", hasDifferentDmaOwner=false, fileChecks=", str);
        return unr0.r(sb, ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=", str2, "}");
    }
}
