package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class hkb0 implements mkb0 {
    public final String a;
    public final okb0 b;
    public final String c;

    public hkb0(String str, okb0 okb0Var, String str2) {
        this.a = str;
        this.b = okb0Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hkb0)) {
            return false;
        }
        hkb0 hkb0Var = (hkb0) obj;
        return jl40.l(this.a, hkb0Var.a) && jl40.l(this.b, hkb0Var.b) && jl40.l(this.c, hkb0Var.c);
    }

    @Override // defpackage.mkb0
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Error(id=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append(this.b);
        sb.append(", imageLocalPath=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
