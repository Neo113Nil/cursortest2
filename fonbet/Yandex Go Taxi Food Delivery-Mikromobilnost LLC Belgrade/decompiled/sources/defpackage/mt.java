package defpackage;

import com.yandex.go.overdraft.data.model.t0;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class mt {
    public final String a;
    public final kdc b;
    public final kdc c;
    public final t0 d;
    public final er31 e;

    public mt(String str, kdc kdcVar, kdc kdcVar2, t0 t0Var, er31 er31Var) {
        this.a = str;
        this.b = kdcVar;
        this.c = kdcVar2;
        this.d = t0Var;
        this.e = er31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mt)) {
            return false;
        }
        mt mtVar = (mt) obj;
        return jl40.l(this.a, mtVar.a) && jl40.l(this.b, mtVar.b) && jl40.l(this.c, mtVar.c) && jl40.l(this.d, mtVar.d) && jl40.l(this.e, mtVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        kdc kdcVar = this.b;
        int hashCode2 = (hashCode + (kdcVar == null ? 0 : kdcVar.hashCode())) * 31;
        kdc kdcVar2 = this.c;
        int hashCode3 = (this.d.hashCode() + ((hashCode2 + (kdcVar2 == null ? 0 : kdcVar2.hashCode())) * 31)) * 31;
        er31 er31Var = this.e;
        return hashCode3 + (er31Var != null ? er31Var.hashCode() : 0);
    }

    public final String toString() {
        return "ActionButtonViewModel(title=" + this.a + ", backgroundColor=" + this.b + ", titleColor=" + this.c + ", tapAction=" + this.d + ", tapActionPayload=" + this.e + Extension.C_BRAKE;
    }
}
