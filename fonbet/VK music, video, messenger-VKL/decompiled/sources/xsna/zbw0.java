package xsna;

/* compiled from: VoiceMessageViewState.kt */
/* loaded from: classes18.dex */
public final class zbw0 implements ao50 {
    public final boolean a;

    public zbw0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zbw0) && this.a == ((zbw0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("VoiceMessageViewState(isVisible="), this.a, ')');
    }
}
