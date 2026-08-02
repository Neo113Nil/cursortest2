package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class euz0 {
    public final String a;
    public final wp2 b;

    public euz0(String str, wp2 wp2Var) {
        this.a = str;
        this.b = wp2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof euz0)) {
            return false;
        }
        euz0 euz0Var = (euz0) obj;
        return jl40.l(this.a, euz0Var.a) && jl40.l(this.b, euz0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TooltipBodyUiState(text=" + this.a + ", textColor=" + this.b + Extension.C_BRAKE;
    }
}
