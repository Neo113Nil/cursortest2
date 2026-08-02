package xsna;

/* compiled from: FailedChannel.kt */
/* loaded from: classes2.dex */
public final class djq {
    public final Integer a;
    public final String b;

    public djq(Integer num, String str) {
        this.a = num;
        this.b = str;
    }

    public final Integer a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djq)) {
            return false;
        }
        djq djqVar = (djq) obj;
        return epx.f(this.a, djqVar.a) && epx.f(this.b, djqVar.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FailedError(code=");
        sb.append(this.a);
        sb.append(", description=");
        return ho8.a(sb, this.b, ')');
    }
}
