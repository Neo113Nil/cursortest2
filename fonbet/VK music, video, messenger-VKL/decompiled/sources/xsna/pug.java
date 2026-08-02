package xsna;

/* compiled from: CommunityChannelOpenParams.kt */
/* loaded from: classes5.dex */
public final class pug {
    public final String a;
    public final Integer b;
    public final Integer c;

    public pug(String str, Integer num, Integer num2) {
        this.a = str;
        this.b = num;
        this.c = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pug)) {
            return false;
        }
        pug pugVar = (pug) obj;
        return epx.f(this.a, pugVar.a) && epx.f(this.b, pugVar.b) && epx.f(this.c, pugVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityChannelOpenParams(url=");
        sb.append(this.a);
        sb.append(", postId=");
        sb.append(this.b);
        sb.append(", postIndex=");
        return uqi.b(sb, this.c, ')');
    }
}
