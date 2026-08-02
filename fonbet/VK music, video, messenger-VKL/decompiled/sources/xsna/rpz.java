package xsna;

/* compiled from: LoadMarkerItemReviewsArgs.kt */
/* loaded from: classes18.dex */
public final class rpz {
    public final Integer a;
    public final String b;
    public final String c;

    public rpz() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rpz)) {
            return false;
        }
        rpz rpzVar = (rpz) obj;
        return epx.f(this.a, rpzVar.a) && epx.f(this.b, rpzVar.b) && epx.f(this.c, rpzVar.c);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoadMarkerItemReviewsArgs(offset=");
        sb.append(this.a);
        sb.append(", sort=");
        sb.append(this.b);
        sb.append(", adsLabel=");
        return ho8.a(sb, this.c, ')');
    }

    public rpz(Integer num, String str, String str2) {
        this.a = num;
        this.b = str;
        this.c = str2;
    }
}
