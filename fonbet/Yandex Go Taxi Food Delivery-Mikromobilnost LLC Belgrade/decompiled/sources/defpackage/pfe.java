package defpackage;

/* loaded from: classes8.dex */
public final class pfe {
    public static final pfe d = new pfe(2, null, null);
    public final int a;
    public final String b;
    public final String c;

    public pfe(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pfe)) {
            return false;
        }
        pfe pfeVar = (pfe) obj;
        return this.a == pfeVar.a && jl40.l(this.b, pfeVar.b) && jl40.l(this.c, pfeVar.c);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContentDescription(isImportantForAccessibility=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", actionText=");
        return b64.p(sb, this.c, ')');
    }
}
