package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class jar implements m1j {
    public final String a;
    public final String b;
    public final obm c;
    public final String d;
    public final k911 e;
    public final String f;

    public jar(String str, String str2, obm obmVar, String str3, k911 k911Var, String str4) {
        this.a = str;
        this.b = str2;
        this.c = obmVar;
        this.d = str3;
        this.e = k911Var;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jar)) {
            return false;
        }
        jar jarVar = (jar) obj;
        return jl40.l(this.a, jarVar.a) && this.b.equals(jarVar.b) && jl40.l(this.c, jarVar.c) && this.d.equals(jarVar.d) && this.e.equals(jarVar.e) && jl40.l(this.f, jarVar.f);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.f;
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        obm obmVar = this.c;
        return this.f.hashCode() + smw0.e(this.e, unr0.b((b + (obmVar == null ? 0 : obmVar.a.hashCode())) * 31, 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("FinishRouteSectionItem(title=", this.a, ", time=", this.b, ", icon=");
        v.append(this.c);
        v.append(", contentDescription=");
        v.append(this.d);
        v.append(", transportType=");
        v.append(this.e);
        v.append(", id=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
