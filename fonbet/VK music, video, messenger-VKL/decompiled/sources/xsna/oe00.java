package xsna;

/* compiled from: MainMenuBroadcastEvent.kt */
/* loaded from: classes7.dex */
public final class oe00 {
    public final int a;

    public oe00(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oe00) && this.a == ((oe00) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("OperationNotPermitted(text="), this.a, ')');
    }
}
