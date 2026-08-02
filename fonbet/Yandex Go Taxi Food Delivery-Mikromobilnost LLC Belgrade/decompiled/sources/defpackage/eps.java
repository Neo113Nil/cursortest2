package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class eps implements hps {
    public final Text.Constant a;
    public final Text.Constant b;
    public final rr51 c;
    public final ms d;
    public final ms e;
    public final rbv f;

    public eps(Text.Constant constant, Text.Constant constant2, rr51 rr51Var, ms msVar, ms msVar2, rbv rbvVar) {
        this.a = constant;
        this.b = constant2;
        this.c = rr51Var;
        this.d = msVar;
        this.e = msVar2;
        this.f = rbvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eps)) {
            return false;
        }
        eps epsVar = (eps) obj;
        return this.a.equals(epsVar.a) && this.b.equals(epsVar.b) && this.c.equals(epsVar.c) && this.d.equals(epsVar.d) && jl40.l(this.e, epsVar.e) && jl40.l(this.f, epsVar.f);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + xvz.d(this.b, this.a.hashCode() * 31, 31)) * 31)) * 31;
        ms msVar = this.e;
        int hashCode2 = (hashCode + (msVar == null ? 0 : msVar.hashCode())) * 31;
        rbv rbvVar = this.f;
        return hashCode2 + (rbvVar != null ? rbvVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder u = ly3.u("OperationConfirmationScreen(title=", this.a, ", subtitle=", this.b, ", bottomDivkitWidget=");
        u.append(this.c);
        u.append(", primaryButton=");
        u.append(this.d);
        u.append(", secondaryButton=");
        u.append(this.e);
        u.append(", backgroundImage=");
        u.append(this.f);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
