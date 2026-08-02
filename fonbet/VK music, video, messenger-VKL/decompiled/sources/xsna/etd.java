package xsna;

/* compiled from: ClipsDraftMusicCatalog.kt */
/* loaded from: classes17.dex */
public final class etd {
    public final Integer a;
    public final Integer b;
    public final Long c;
    public final boolean d;
    public final String e;

    public etd() {
        this(null, null, null, false, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof etd)) {
            return false;
        }
        etd etdVar = (etd) obj;
        return epx.f(this.a, etdVar.a) && epx.f(this.b, etdVar.b) && epx.f(this.c, etdVar.c) && this.d == etdVar.d && epx.f(this.e, etdVar.e);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.c;
        int b = qoy.b((hashCode2 + (l == null ? 0 : l.hashCode())) * 31, 31, this.d);
        String str = this.e;
        return b + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsDraftMusicCatalog(bannerId=");
        sb.append(this.a);
        sb.append(", playlistId=");
        sb.append(this.b);
        sb.append(", playlistOwnerId=");
        sb.append(this.c);
        sb.append(", fromLocalVideo=");
        sb.append(this.d);
        sb.append(", hashtag=");
        return ho8.a(sb, this.e, ')');
    }

    public etd(Integer num, Integer num2, Long l, boolean z, String str) {
        this.a = num;
        this.b = num2;
        this.c = l;
        this.d = z;
        this.e = str;
    }
}
