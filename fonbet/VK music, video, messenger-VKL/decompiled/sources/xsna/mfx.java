package xsna;

/* compiled from: IntermediateToken.kt */
@vby
/* loaded from: classes5.dex */
public final class mfx {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof mfx) {
            return epx.f(this.a, ((mfx) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return air.b(')', "IntermediateToken(token=", this.a);
    }
}
