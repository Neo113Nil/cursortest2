package xsna;

/* compiled from: OnBotBtnRequestFailedEvent.kt */
/* loaded from: classes2.dex */
public final class e280 extends sxp {
    public final Throwable b;

    public e280(Throwable th) {
        this.b = th;
    }

    @Override // xsna.sxp
    public final Object a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e280) && epx.f(this.b, ((e280) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return oq.c(new StringBuilder("OnBotBtnRequestFailedEvent(reason="), this.b, ')');
    }
}
