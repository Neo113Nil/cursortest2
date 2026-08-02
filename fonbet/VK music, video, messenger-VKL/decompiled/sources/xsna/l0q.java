package xsna;

/* compiled from: EventSenders.kt */
/* loaded from: classes6.dex */
public final class l0q {
    public final zvp a;
    public final e2n0 b;

    public l0q(zvp zvpVar, e2n0 e2n0Var) {
        this.a = zvpVar;
        this.b = e2n0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0q)) {
            return false;
        }
        l0q l0qVar = (l0q) obj;
        return epx.f(this.a, l0qVar.a) && epx.f(this.b, l0qVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "EventSenders(errorEventSender=" + this.a + ", successEventSender=" + this.b + ')';
    }
}
