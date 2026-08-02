package defpackage;

import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class pff {
    public final Integer a;
    public final Set b;
    public final ziq0 c;
    public final String d;
    public final String e;

    public pff(Integer num, Set set, ziq0 ziq0Var, String str, String str2) {
        this.a = num;
        this.b = set;
        this.c = ziq0Var;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pff)) {
            return false;
        }
        pff pffVar = (pff) obj;
        return jl40.l(this.a, pffVar.a) && jl40.l(this.b, pffVar.b) && jl40.l(this.c, pffVar.c) && jl40.l(this.d, pffVar.d) && jl40.l(this.e, pffVar.e);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Set set = this.b;
        int hashCode2 = (hashCode + (set == null ? 0 : set.hashCode())) * 31;
        ziq0 ziq0Var = this.c;
        int hashCode3 = (hashCode2 + (ziq0Var == null ? 0 : ziq0Var.hashCode())) * 31;
        String str = this.d;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CurrentFeedbackModel(score=");
        sb.append(this.a);
        sb.append(", reasonIds=");
        sb.append(this.b);
        sb.append(", tip=");
        sb.append(this.c);
        sb.append(", comment=");
        sb.append(this.d);
        sb.append(", manualTipAmount=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
