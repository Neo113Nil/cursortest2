package xsna;

/* compiled from: StorefrontServicesState.kt */
/* loaded from: classes18.dex */
public final class y7p0 {
    public final String a;
    public final Integer b;

    public y7p0() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y7p0)) {
            return false;
        }
        y7p0 y7p0Var = (y7p0) obj;
        return epx.f(this.a, y7p0Var.a) && epx.f(this.b, y7p0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopBarState(editUrl=");
        sb.append(this.a);
        sb.append(", bookmarksCount=");
        return uqi.b(sb, this.b, ')');
    }

    public y7p0(String str, Integer num) {
        this.a = str;
        this.b = num;
    }
}
