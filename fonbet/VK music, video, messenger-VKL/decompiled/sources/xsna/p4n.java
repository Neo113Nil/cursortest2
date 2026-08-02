package xsna;

/* compiled from: DiscoverMediaPreviewUiModel.kt */
/* loaded from: classes4.dex */
public final class p4n {
    public final String a;
    public final String b;
    public final String c;

    public p4n(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p4n)) {
            return false;
        }
        p4n p4nVar = (p4n) obj;
        return epx.f(this.a, p4nVar.a) && epx.f(this.b, p4nVar.b) && epx.f(this.c, p4nVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return this.c.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Blurred(imageUrl=");
        sb.append(this.a);
        sb.append(", thumbHash=");
        sb.append(this.b);
        sb.append(", contentDescription=");
        return ho8.a(sb, this.c, ')');
    }
}
