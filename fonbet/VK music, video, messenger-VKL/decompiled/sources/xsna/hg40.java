package xsna;

/* compiled from: MusicDislikeParams.kt */
/* loaded from: classes3.dex */
public final class hg40 {
    public final String a;
    public final Integer b;
    public final Integer c;
    public final Long d;
    public final Integer e;
    public final Long f;

    public hg40() {
        this(null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hg40)) {
            return false;
        }
        hg40 hg40Var = (hg40) obj;
        return epx.f(this.a, hg40Var.a) && epx.f(this.b, hg40Var.b) && epx.f(this.c, hg40Var.c) && epx.f(this.d, hg40Var.d) && epx.f(this.e, hg40Var.e) && epx.f(this.f, hg40Var.f);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.d;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num3 = this.e;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l2 = this.f;
        return hashCode5 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicDislikeParams(trackCode=");
        sb.append(this.a);
        sb.append(", timelinePositionSec=");
        sb.append(this.b);
        sb.append(", audioId=");
        sb.append(this.c);
        sb.append(", audioOwnerId=");
        sb.append(this.d);
        sb.append(", playlistId=");
        sb.append(this.e);
        sb.append(", playlistOwnerId=");
        return iq.b(sb, this.f, ')');
    }

    public hg40(Integer num, Integer num2, Integer num3, Long l, Long l2, String str) {
        this.a = str;
        this.b = num;
        this.c = num2;
        this.d = l;
        this.e = num3;
        this.f = l2;
    }
}
