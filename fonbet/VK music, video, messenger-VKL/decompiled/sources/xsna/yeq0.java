package xsna;

/* compiled from: UrlFragment.kt */
/* loaded from: classes6.dex */
public final class yeq0 {
    public final String a;

    public yeq0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yeq0) && epx.f(this.a, ((yeq0) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("UrlFragment(value="), this.a, ')');
    }
}
