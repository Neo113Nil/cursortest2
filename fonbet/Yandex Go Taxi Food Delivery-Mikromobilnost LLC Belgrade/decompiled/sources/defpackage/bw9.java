package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class bw9 implements dw9 {
    public final cy9 a;

    public bw9(cy9 cy9Var) {
        this.a = cy9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bw9) && this.a.equals(((bw9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ly3.m("Error(details=", this.a, Extension.C_BRAKE);
    }
}
