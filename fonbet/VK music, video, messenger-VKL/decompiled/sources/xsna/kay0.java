package xsna;

@vby
/* loaded from: classes9.dex */
public final class kay0 {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof kay0) {
            return epx.f(this.a, ((kay0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return air.b(')', "PushToken(value=", this.a);
    }
}
