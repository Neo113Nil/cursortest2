package xsna;

/* compiled from: FeedTopBar.kt */
/* loaded from: classes18.dex */
public final class v4r {
    public final gko a;
    public final gzs<s3q0> b;
    public final CharSequence c;
    public final Integer d;

    public v4r(gko gkoVar, gzs gzsVar, String str, Integer num) {
        this.a = gkoVar;
        this.b = gzsVar;
        this.c = str;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v4r)) {
            return false;
        }
        v4r v4rVar = (v4r) obj;
        return epx.f(this.a, v4rVar.a) && epx.f(this.b, v4rVar.b) && epx.f(this.c, v4rVar.c) && epx.f(this.d, v4rVar.d);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a.a) * 31;
        gzs<s3q0> gzsVar = this.b;
        int hashCode2 = (hashCode + (gzsVar == null ? 0 : gzsVar.hashCode())) * 31;
        CharSequence charSequence = this.c;
        int hashCode3 = (hashCode2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        Integer num = this.d;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Icon(icon=");
        sb.append(this.a);
        sb.append(", onClick=");
        sb.append(this.b);
        sb.append(", contentDescription=");
        sb.append((Object) this.c);
        sb.append(", count=");
        return uqi.b(sb, this.d, ')');
    }
}
