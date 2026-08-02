package xsna;

/* compiled from: VoipAsrOnlineEnabled.kt */
/* loaded from: classes7.dex */
public final class gew0 {
    public final boolean a;
    public final boolean b;

    public gew0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gew0)) {
            return false;
        }
        gew0 gew0Var = (gew0) obj;
        return this.a == gew0Var.a && this.b == gew0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VoipAsrOnlineEnabled(isEnabled=");
        sb.append(this.a);
        sb.append(", isOn=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
