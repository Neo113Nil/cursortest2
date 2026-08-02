package xsna;

/* compiled from: SelectGroupVerificationEvent.kt */
/* loaded from: classes18.dex */
public final class r7i0 implements t7i0 {
    public final String a;

    public r7i0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r7i0) && epx.f(this.a, ((r7i0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("OpenUrl(url="), this.a, ')');
    }
}
