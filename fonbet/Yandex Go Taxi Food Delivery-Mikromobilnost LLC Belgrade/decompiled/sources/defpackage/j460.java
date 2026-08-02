package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class j460 extends k460 {
    public final i360 a;
    public final boolean b;

    public j460(i360 i360Var, boolean z) {
        this.a = i360Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j460)) {
            return false;
        }
        j460 j460Var = (j460) obj;
        return jl40.l(this.a, j460Var.a) && this.b == j460Var.b;
    }

    public final int hashCode() {
        i360 i360Var = this.a;
        return Boolean.hashCode(this.b) + ((i360Var == null ? 0 : i360Var.hashCode()) * 31);
    }

    public final String toString() {
        return "SendingModel(labels=" + this.a + ", wasShown=" + this.b + Extension.C_BRAKE;
    }
}
