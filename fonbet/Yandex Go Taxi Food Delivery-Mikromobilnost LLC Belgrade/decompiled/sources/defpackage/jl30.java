package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class jl30 implements ml30 {
    public final ll30 a;

    public jl30(ll30 ll30Var) {
        this.a = ll30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jl30) && this.a.equals(((jl30) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpenBluetoothSettings(screenAnalyticsState=" + this.a + Extension.C_BRAKE;
    }
}
