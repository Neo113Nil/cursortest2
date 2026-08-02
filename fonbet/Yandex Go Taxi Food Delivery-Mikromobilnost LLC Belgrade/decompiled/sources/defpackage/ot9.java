package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ot9 implements st9 {
    public final cy9 a;

    public ot9(int i) {
        this(cy9.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ot9) && jl40.l(this.a, ((ot9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ly3.m("Failure(chargersErrorDetails=", this.a, Extension.C_BRAKE);
    }

    public ot9() {
        this(0);
    }

    public ot9(cy9 cy9Var) {
        this.a = cy9Var;
    }
}
