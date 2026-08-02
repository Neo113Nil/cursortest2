package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class mf20 extends dg20 {
    public final String a;
    public final q0d0 b;
    public final g0k c;
    public final ArrayList d;
    public final ofe e;

    public mf20(String str, q0d0 q0d0Var, g0k g0kVar, ArrayList arrayList, ofe ofeVar) {
        this.a = str;
        this.b = q0d0Var;
        this.c = g0kVar;
        this.d = arrayList;
        this.e = ofeVar;
    }

    @Override // defpackage.dg20
    public final q0d0 a() {
        return this.b;
    }

    @Override // defpackage.dg20
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mf20)) {
            return false;
        }
        mf20 mf20Var = (mf20) obj;
        return jl40.l(this.a, mf20Var.a) && jl40.l(this.b, mf20Var.b) && this.c.equals(mf20Var.c) && this.d.equals(mf20Var.d) && jl40.l(this.e, mf20Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        q0d0 q0d0Var = this.b;
        int b = ly3.b((this.c.hashCode() + ((hashCode + (q0d0Var == null ? 0 : q0d0Var.hashCode())) * 31)) * 31, 31, this.d);
        ofe ofeVar = this.e;
        return b + (ofeVar != null ? ofeVar.hashCode() : 0);
    }

    public final String toString() {
        return "HorizontalGroupMicroWidgetModel(id=" + this.a + ", action=" + this.b + ", displaySettings=" + this.c + ", microWidgetModels=" + this.d + ", contentDescription=" + this.e + Extension.C_BRAKE;
    }
}
