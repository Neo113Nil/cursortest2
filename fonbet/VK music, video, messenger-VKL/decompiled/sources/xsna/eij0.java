package xsna;

/* compiled from: ShowHintEvent.kt */
@vby
/* loaded from: classes2.dex */
public final class eij0 {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof eij0) {
            return epx.f(this.a, ((eij0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return air.b(')', "ShowHintEvent(id=", this.a);
    }
}
