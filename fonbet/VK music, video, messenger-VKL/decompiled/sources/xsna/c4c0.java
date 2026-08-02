package xsna;

/* compiled from: PostInfoUiDto.kt */
/* loaded from: classes4.dex */
public final class c4c0 {
    public final Long a;
    public final Long b;
    public final String c;
    public final Integer d;

    public c4c0(Long l, Long l2, String str, Integer num) {
        this.a = l;
        this.b = l2;
        this.c = str;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4c0)) {
            return false;
        }
        c4c0 c4c0Var = (c4c0) obj;
        return epx.f(this.a, c4c0Var.a) && epx.f(this.b, c4c0Var.b) && epx.f(this.c, c4c0Var.c) && epx.f(this.d, c4c0Var.d);
    }

    public final int hashCode() {
        Long l = this.a;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostInfoUiDto(postId=");
        sb.append(this.a);
        sb.append(", sourceId=");
        sb.append(this.b);
        sb.append(", trackCode=");
        sb.append(this.c);
        sb.append(", date=");
        return uqi.b(sb, this.d, ')');
    }
}
