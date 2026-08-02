package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class dme {
    public final String a;
    public final vsy0 b;
    public final zle c;
    public final cme d;
    public final boolean e;

    public dme(String str, vsy0 vsy0Var, zle zleVar, cme cmeVar, boolean z) {
        this.a = str;
        this.b = vsy0Var;
        this.c = zleVar;
        this.d = cmeVar;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dme)) {
            return false;
        }
        dme dmeVar = (dme) obj;
        return jl40.l(this.a, dmeVar.a) && jl40.l(this.b, dmeVar.b) && jl40.l(this.c, dmeVar.c) && jl40.l(this.d, dmeVar.d) && this.e == dmeVar.e;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        zle zleVar = this.c;
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((hashCode + (zleVar == null ? 0 : zleVar.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ControlButtonState(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", action=");
        sb.append(this.c);
        sb.append(", image=");
        sb.append(this.d);
        sb.append(", drawIconAsTextColor=");
        return x4e.i(sb, this.e, Extension.C_BRAKE);
    }
}
