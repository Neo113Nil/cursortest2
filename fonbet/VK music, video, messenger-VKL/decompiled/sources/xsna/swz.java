package xsna;

/* compiled from: LocalityChangeEvent.kt */
/* loaded from: classes6.dex */
public final class swz {
    public final qwz a;

    public swz(qwz qwzVar) {
        this.a = qwzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof swz) && epx.f(this.a, ((swz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LocalityChangeEvent(locality=" + this.a + ')';
    }
}
