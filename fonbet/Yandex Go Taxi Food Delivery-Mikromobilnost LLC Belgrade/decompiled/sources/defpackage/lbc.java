package defpackage;

/* loaded from: classes2.dex */
public final class lbc {
    public final String a;
    public final String b;
    public final boolean c;

    public lbc(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lbc)) {
            return false;
        }
        lbc lbcVar = (lbc) obj;
        return this.a.equals(lbcVar.a) && this.b.equals(lbcVar.b) && this.c == lbcVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CollectUserContacts(webViewUrl=");
        sb.append(this.a);
        sb.append(", skipText=");
        sb.append(this.b);
        sb.append(", alreadyCollected=");
        return unr0.u(sb, this.c, ')');
    }
}
