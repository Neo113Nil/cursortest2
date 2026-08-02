package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class gp9 implements ip9 {
    public final cy9 a;

    public gp9() {
        this(new cy9(15, null, null, null, null));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gp9) && jl40.l(this.a, ((gp9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ly3.m("Failure(chargersErrorDetails=", this.a, Extension.C_BRAKE);
    }

    public gp9(cy9 cy9Var) {
        this.a = cy9Var;
    }
}
