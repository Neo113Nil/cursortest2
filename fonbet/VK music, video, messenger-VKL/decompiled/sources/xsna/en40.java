package xsna;

/* compiled from: MusicLongtapParams.kt */
/* loaded from: classes3.dex */
public final class en40 {
    public final String a;
    public final Integer b;
    public final Long c;
    public final Integer d;
    public final Long e;
    public final Integer f;

    public en40() {
        this(null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof en40)) {
            return false;
        }
        en40 en40Var = (en40) obj;
        return epx.f(this.a, en40Var.a) && epx.f(this.b, en40Var.b) && epx.f(this.c, en40Var.c) && epx.f(this.d, en40Var.d) && epx.f(this.e, en40Var.e) && epx.f(this.f, en40Var.f);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.c;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num2 = this.d;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l2 = this.e;
        int hashCode5 = (hashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num3 = this.f;
        return hashCode5 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicLongtapParams(trackCode=");
        sb.append(this.a);
        sb.append(", audioId=");
        sb.append(this.b);
        sb.append(", audioOwnerId=");
        sb.append(this.c);
        sb.append(", audioIdNew=");
        sb.append(this.d);
        sb.append(", audioOwnerIdNew=");
        sb.append(this.e);
        sb.append(", volume=");
        return uqi.b(sb, this.f, ')');
    }

    public en40(Integer num, Integer num2, Integer num3, Long l, Long l2, String str) {
        this.a = str;
        this.b = num;
        this.c = l;
        this.d = num2;
        this.e = l2;
        this.f = num3;
    }
}
