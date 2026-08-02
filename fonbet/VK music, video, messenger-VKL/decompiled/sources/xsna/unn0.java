package xsna;

/* compiled from: ErrorCommand.kt */
/* loaded from: classes2.dex */
public final class unn0 extends avp {
    public final m7q a;

    public unn0(m7q m7qVar) {
        this.a = m7qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof unn0) && epx.f(this.a, ((unn0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SwitchSource(source=" + this.a + ')';
    }
}
