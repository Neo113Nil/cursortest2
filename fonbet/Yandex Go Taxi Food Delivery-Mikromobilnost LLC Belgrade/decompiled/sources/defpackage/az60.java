package defpackage;

import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class az60 implements ez60 {
    public final Set a;
    public final iz60 b;
    public final zy60 c;
    public final gz60 d;

    public az60(Set set, bz60 bz60Var) {
        iz60 iz60Var = bz60Var.a;
        zy60 zy60Var = bz60Var.b;
        gz60 gz60Var = bz60Var.c;
        this.a = set;
        this.b = iz60Var;
        this.c = zy60Var;
        this.d = gz60Var;
    }

    @Override // defpackage.ez60
    public final Set a() {
        return this.a;
    }

    @Override // defpackage.ez60
    public final iz60 b() {
        return this.b;
    }

    @Override // defpackage.ez60
    public final zy60 c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof az60)) {
            return false;
        }
        az60 az60Var = (az60) obj;
        return jl40.l(this.a, az60Var.a) && this.b.equals(az60Var.b) && this.c.equals(az60Var.c) && this.d.equals(az60Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Input(sources=" + this.a + ", timeout=" + this.b + ", jump=" + this.c + ", referenceMatching=" + this.d + Extension.C_BRAKE;
    }
}
