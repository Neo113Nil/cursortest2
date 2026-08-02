package xsna;

/* compiled from: LinkVKBidEvent.kt */
/* loaded from: classes18.dex */
public final class jbz implements kbz {
    public final String a;

    public jbz(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jbz) && epx.f(this.a, ((jbz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("OpenUrl(url="), this.a, ')');
    }
}
