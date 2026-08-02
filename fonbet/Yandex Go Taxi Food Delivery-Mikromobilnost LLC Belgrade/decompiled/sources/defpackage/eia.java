package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class eia implements gia {
    public final cy9 a;

    public eia(cy9 cy9Var) {
        this.a = cy9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eia) && jl40.l(this.a, ((eia) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ly3.m("Error(errorDetails=", this.a, Extension.C_BRAKE);
    }
}
