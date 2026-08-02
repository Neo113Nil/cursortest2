package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class h460 extends k460 {
    public final i360 a;

    public h460(i360 i360Var) {
        this.a = i360Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h460) && jl40.l(this.a, ((h460) obj).a);
    }

    public final int hashCode() {
        i360 i360Var = this.a;
        if (i360Var == null) {
            return 0;
        }
        return i360Var.hashCode();
    }

    public final String toString() {
        return "EditingModel(labels=" + this.a + Extension.C_BRAKE;
    }
}
