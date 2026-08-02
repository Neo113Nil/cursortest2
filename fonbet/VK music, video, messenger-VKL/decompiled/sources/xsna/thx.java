package xsna;

/* compiled from: InternalMiniAppInfo.kt */
/* loaded from: classes11.dex */
public final class thx {
    public final long a;
    public final String b;

    public thx(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof thx)) {
            return false;
        }
        thx thxVar = (thx) obj;
        return this.a == thxVar.a && epx.f(this.b, thxVar.b);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InternalMiniAppInfo(id=");
        sb.append(this.a);
        sb.append(", path=");
        return ho8.a(sb, this.b, ')');
    }
}
