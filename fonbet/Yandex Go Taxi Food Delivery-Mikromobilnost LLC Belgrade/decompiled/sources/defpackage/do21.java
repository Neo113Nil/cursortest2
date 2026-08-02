package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class do21 {
    public final String a;
    public final boolean b;

    public do21(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof do21)) {
            return false;
        }
        do21 do21Var = (do21) obj;
        return jl40.l(this.a, do21Var.a) && this.b == do21Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return xvz.k("UserInput(email=", this.a, ", cvvValid=", this.b, Extension.C_BRAKE);
    }

    public /* synthetic */ do21(int i) {
        this(null, false);
    }

    public do21() {
        this(0);
    }
}
