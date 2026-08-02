package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class mps extends nps {
    public final Text.Constant a;
    public final Text.Constant b;
    public final YbButtonViewGroup.b c;
    public final rr51 d;
    public final rbv e;

    public mps(Text.Constant constant, Text.Constant constant2, YbButtonViewGroup.b bVar, rr51 rr51Var, rbv rbvVar) {
        this.a = constant;
        this.b = constant2;
        this.c = bVar;
        this.d = rr51Var;
        this.e = rbvVar;
    }

    public final rbv a() {
        return this.e;
    }

    public final YbButtonViewGroup.b b() {
        return this.c;
    }

    public final rr51 c() {
        return this.d;
    }

    public final Text d() {
        return this.b;
    }

    public final Text e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mps)) {
            return false;
        }
        mps mpsVar = (mps) obj;
        return this.a.equals(mpsVar.a) && this.b.equals(mpsVar.b) && this.c.equals(mpsVar.c) && this.d.equals(mpsVar.d) && jl40.l(this.e, mpsVar.e);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + xvz.d(this.b, this.a.hashCode() * 31, 31)) * 31)) * 31;
        rbv rbvVar = this.e;
        return hashCode + (rbvVar == null ? 0 : rbvVar.hashCode());
    }

    public final String toString() {
        StringBuilder u = ly3.u("OperationConfirmScreen(title=", this.a, ", subtitle=", this.b, ", buttonViewGroup=");
        u.append(this.c);
        u.append(", divBlock=");
        u.append(this.d);
        u.append(", backgroundImage=");
        u.append(this.e);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
