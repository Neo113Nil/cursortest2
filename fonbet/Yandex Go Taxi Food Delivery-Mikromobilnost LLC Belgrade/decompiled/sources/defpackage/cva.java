package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class cva implements gva {
    public final cy9 a;

    public cva(cy9 cy9Var) {
        this.a = cy9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cva) && jl40.l(this.a, ((cva) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ly3.m("Failure(chargersErrorDetails=", this.a, Extension.C_BRAKE);
    }
}
