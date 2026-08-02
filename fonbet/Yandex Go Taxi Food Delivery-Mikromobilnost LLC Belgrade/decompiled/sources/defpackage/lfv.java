package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class lfv {
    public final rbv a;
    public final rbv b;
    public final Text c;
    public final rbv d;
    public final Text e;

    public lfv(rbv rbvVar, rbv rbvVar2, Text.Constant constant, nbv nbvVar, Text.Resource resource) {
        this.a = rbvVar;
        this.b = rbvVar2;
        this.c = constant;
        this.d = nbvVar;
        this.e = resource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lfv)) {
            return false;
        }
        lfv lfvVar = (lfv) obj;
        return jl40.l(this.a, lfvVar.a) && jl40.l(this.b, lfvVar.b) && jl40.l(this.c, lfvVar.c) && jl40.l(this.d, lfvVar.d) && jl40.l(this.e, lfvVar.e);
    }

    public final int hashCode() {
        rbv rbvVar = this.a;
        int hashCode = (rbvVar == null ? 0 : rbvVar.hashCode()) * 31;
        rbv rbvVar2 = this.b;
        int hashCode2 = (hashCode + (rbvVar2 == null ? 0 : rbvVar2.hashCode())) * 31;
        Text text = this.c;
        int hashCode3 = (hashCode2 + (text == null ? 0 : text.hashCode())) * 31;
        rbv rbvVar3 = this.d;
        int hashCode4 = (hashCode3 + (rbvVar3 == null ? 0 : rbvVar3.hashCode())) * 31;
        Text text2 = this.e;
        return hashCode4 + (text2 != null ? text2.hashCode() : 0);
    }

    public final String toString() {
        return "State(titleImage=" + this.a + ", cornerImage=" + this.b + ", titleText=" + this.c + ", titleTextIcon=" + this.d + ", subtitleText=" + this.e + Extension.C_BRAKE;
    }
}
