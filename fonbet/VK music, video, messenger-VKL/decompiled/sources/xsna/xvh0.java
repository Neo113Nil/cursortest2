package xsna;

/* compiled from: SearchLinksAnalyticsInfo.kt */
/* loaded from: classes16.dex */
public final class xvh0 {
    public final String a;

    public xvh0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xvh0) && epx.f(this.a, ((xvh0) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("SearchLinksAnalyticsInfo(trackCode="), this.a, ')');
    }
}
