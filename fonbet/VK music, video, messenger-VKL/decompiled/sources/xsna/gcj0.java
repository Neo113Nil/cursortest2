package xsna;

/* compiled from: SharingSendFailedEvent.kt */
/* loaded from: classes5.dex */
public final class gcj0 implements nbj0 {
    public final Throwable a;
    public final Long b;

    public gcj0(Throwable th, Long l) {
        this.a = th;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gcj0)) {
            return false;
        }
        gcj0 gcj0Var = (gcj0) obj;
        return epx.f(this.a, gcj0Var.a) && epx.f(this.b, gcj0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SharingSendFailedEvent(throwable=");
        sb.append(this.a);
        sb.append(", dialogId=");
        return iq.b(sb, this.b, ')');
    }
}
