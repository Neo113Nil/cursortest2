package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class pu1 {
    public final paj0 a;
    public final String b;
    public final String c;

    public pu1(paj0 paj0Var, String str, String str2) {
        this.a = paj0Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pu1)) {
            return false;
        }
        pu1 pu1Var = (pu1) obj;
        return jl40.l(this.a, pu1Var.a) && jl40.l(this.b, pu1Var.b) && jl40.l(this.c, pu1Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AltChoiceData(sections=");
        sb.append(this.a);
        sb.append(", selectedKey=");
        sb.append(this.b);
        sb.append(", selectedDeliverySlot=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
