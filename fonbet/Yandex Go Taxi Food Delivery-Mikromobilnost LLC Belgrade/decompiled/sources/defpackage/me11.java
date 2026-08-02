package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class me11 {
    public final fr a;
    public final fr b;

    public me11(fr frVar, fr frVar2) {
        this.a = frVar;
        this.b = frVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof me11)) {
            return false;
        }
        me11 me11Var = (me11) obj;
        return jl40.l(this.a, me11Var.a) && jl40.l(this.b, me11Var.b);
    }

    public final int hashCode() {
        fr frVar = this.a;
        int hashCode = (frVar == null ? 0 : frVar.hashCode()) * 31;
        fr frVar2 = this.b;
        return hashCode + (frVar2 != null ? frVar2.hashCode() : 0);
    }

    public final String toString() {
        return "TriggerActions(showAction=" + this.a + ", tapAction=" + this.b + Extension.C_BRAKE;
    }
}
