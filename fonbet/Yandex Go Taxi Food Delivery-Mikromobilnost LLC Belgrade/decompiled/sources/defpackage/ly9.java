package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ly9 {
    public final cy9 a;

    public /* synthetic */ ly9(cy9 cy9Var) {
        this.a = cy9Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ly9) {
            return jl40.l(this.a, ((ly9) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ly3.m("ChargersErrorPayload(chargersErrorDetails=", this.a, Extension.C_BRAKE);
    }
}
