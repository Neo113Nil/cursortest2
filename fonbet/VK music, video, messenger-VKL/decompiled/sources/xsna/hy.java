package xsna;

/* compiled from: ActionButtonsHints.kt */
/* loaded from: classes4.dex */
public final class hy {
    public final boolean a;

    public hy() {
        this(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hy) && this.a == ((hy) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("ActionButtonsHints(isVkTicketOnboardingEnabled="), this.a, ')');
    }

    public hy(boolean z) {
        this.a = z;
    }
}
