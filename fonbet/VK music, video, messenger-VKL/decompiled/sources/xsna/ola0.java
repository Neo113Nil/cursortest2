package xsna;

/* compiled from: PinSetState.kt */
/* loaded from: classes6.dex */
public final class ola0 implements ona0 {
    public final String a;

    public ola0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ola0) && epx.f(this.a, ((ola0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("PinConfirmState(pin="), this.a, ')');
    }
}
