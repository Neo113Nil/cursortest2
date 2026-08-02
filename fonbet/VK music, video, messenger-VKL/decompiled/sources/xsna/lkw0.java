package xsna;

/* compiled from: VoipCallViewState.kt */
/* loaded from: classes7.dex */
public final class lkw0 {
    public final boolean a;

    public lkw0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lkw0) && this.a == ((lkw0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("VoipCallViewState(feedbackButtonsVisible="), this.a, ')');
    }
}
