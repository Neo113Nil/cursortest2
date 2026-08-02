package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ao extends nr {
    public final String a;
    public final String b;
    public final Object c;
    public final f030 d;

    public ao(String str, String str2, Object obj, f030 f030Var) {
        this.a = str;
        this.b = str2;
        this.c = obj;
        this.d = f030Var;
    }

    @Override // defpackage.nr
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ao)) {
            return false;
        }
        ao aoVar = (ao) obj;
        return jl40.l(this.a, aoVar.a) && jl40.l(this.b, aoVar.b) && jl40.l(this.c, aoVar.c) && jl40.l(this.d, aoVar.d);
    }

    public final int hashCode() {
        int c = smw0.c(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        f030 f030Var = this.d;
        return c + (f030Var == null ? 0 : f030Var.hashCode());
    }

    public final String toString() {
        StringBuilder v = b64.v("ActionRover(title=", this.a, ", action=", this.b, ", payload=");
        v.append(this.c);
        v.append(", confirmationModal=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
