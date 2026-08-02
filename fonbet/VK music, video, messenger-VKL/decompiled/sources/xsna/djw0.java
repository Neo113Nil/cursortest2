package xsna;

/* compiled from: VoipCallSettings.kt */
/* loaded from: classes7.dex */
public final class djw0 {
    public final boolean a;
    public final boolean b;

    public djw0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djw0)) {
            return false;
        }
        djw0 djw0Var = (djw0) obj;
        return this.a == djw0Var.a && this.b == djw0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VoipCallSettings(chatHistoryEnabled=");
        sb.append(this.a);
        sb.append(", isSuspiciousCall=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
