package xsna;

/* compiled from: ClipsDraftOrdData.kt */
/* loaded from: classes17.dex */
public final class gtd {
    public final boolean a;
    public final String b;
    public final String c;

    public gtd(boolean z, String str, String str2) {
        this.a = z;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gtd)) {
            return false;
        }
        gtd gtdVar = (gtd) obj;
        return this.a == gtdVar.a && epx.f(this.b, gtdVar.b) && epx.f(this.c, gtdVar.c);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsDraftOrdData(isAd=");
        sb.append(this.a);
        sb.append(", predId=");
        sb.append(this.b);
        sb.append(", erId=");
        return ho8.a(sb, this.c, ')');
    }
}
