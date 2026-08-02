package xsna;

/* compiled from: HoldStateChangedEvent.kt */
/* loaded from: classes8.dex */
public final class iav {
    public final String a;
    public final boolean b;

    public iav(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iav)) {
            return false;
        }
        iav iavVar = (iav) obj;
        return epx.f(this.a, iavVar.a) && this.b == iavVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "HoldStateChangedEvent(participantId=" + this.a + ", isHeld=" + this.b + ")";
    }
}
