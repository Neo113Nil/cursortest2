package xsna;

/* compiled from: EventsFlow.kt */
@vby
/* loaded from: classes16.dex */
public final class a1q<T> {
    public final ksr<T> a;

    public /* synthetic */ a1q(ksr ksrVar) {
        this.a = ksrVar;
    }

    public static final /* synthetic */ a1q a(ksr ksrVar) {
        return new a1q(ksrVar);
    }

    public final /* synthetic */ ksr b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a1q) {
            return epx.f(this.a, ((a1q) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "EventsFlow(value=" + this.a + ')';
    }
}
