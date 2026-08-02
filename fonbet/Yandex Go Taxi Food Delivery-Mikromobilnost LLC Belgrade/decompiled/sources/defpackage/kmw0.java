package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class kmw0 implements lmw0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final idj0 e;
    public final List f;
    public final koj0 g;
    public final tlx0 h;

    public kmw0(String str, String str2, String str3, String str4, idj0 idj0Var, List list, koj0 koj0Var, tlx0 tlx0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = idj0Var;
        this.f = list;
        this.g = koj0Var;
        this.h = tlx0Var;
    }

    @Override // defpackage.lmw0
    public final idj0 a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kmw0)) {
            return false;
        }
        kmw0 kmw0Var = (kmw0) obj;
        return jl40.l(this.a, kmw0Var.a) && jl40.l(this.b, kmw0Var.b) && jl40.l(this.c, kmw0Var.c) && jl40.l(this.d, kmw0Var.d) && jl40.l(this.e, kmw0Var.e) && jl40.l(this.f, kmw0Var.f) && this.g.equals(kmw0Var.g) && this.h.equals(kmw0Var.h);
    }

    @Override // defpackage.lmw0
    public final String getDescription() {
        return this.c;
    }

    @Override // defpackage.lmw0
    public final String getLabel() {
        return this.b;
    }

    @Override // defpackage.lmw0
    public final String getName() {
        return this.a;
    }

    @Override // defpackage.lmw0
    public final List h() {
        return this.f;
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        idj0 idj0Var = this.e;
        return this.h.hashCode() + ((this.g.hashCode() + unr0.c((hashCode + (idj0Var != null ? idj0Var.hashCode() : 0)) * 31, 31, this.f)) * 31);
    }

    @Override // defpackage.lmw0
    public final koj0 l() {
        return this.g;
    }

    public final String toString() {
        StringBuilder v = b64.v("RedirectRequirement(name=", this.a, ", label=", this.b, ", description=");
        g8e.D(v, this.c, ", driverName=", this.d, ", badge=");
        v.append(this.e);
        v.append(", restrictedToClasses=");
        v.append(this.f);
        v.append(", images=");
        v.append(this.g);
        v.append(", tariffRedirect=");
        v.append(this.h);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
