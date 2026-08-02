package xsna;

/* compiled from: MusicPlayerListenerConfig.kt */
/* loaded from: classes3.dex */
public final class rx40 {
    public final boolean a;
    public final boolean b;

    public rx40() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx40)) {
            return false;
        }
        rx40 rx40Var = (rx40) obj;
        return this.a == rx40Var.a && this.b == rx40Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Default(skipInternalStates=");
        sb.append(this.a);
        sb.append(", emitSingleUniqueStatePerAudio=");
        return defpackage.q0.a(sb, this.b, ')');
    }

    public rx40(int i) {
        this.a = true;
        this.b = true;
    }
}
