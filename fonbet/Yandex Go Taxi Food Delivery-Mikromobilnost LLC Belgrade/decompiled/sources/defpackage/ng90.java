package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class ng90 {
    public final Object a;
    public final kq90 b;
    public final String c;

    public ng90(Object obj, kq90 kq90Var, String str) {
        this.a = obj;
        this.b = kq90Var;
        this.c = str;
    }

    public final String a() {
        return this.c;
    }

    public final kq90 b() {
        return this.b;
    }

    public final Object c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ng90.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        ng90 ng90Var = (ng90) obj;
        return this.a.equals(ng90Var.a) && this.b.equals(ng90Var.b) && jl40.l(this.c, ng90Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PartCacheResult(resource=");
        sb.append(this.a);
        sb.append(", patchParams=");
        sb.append(this.b);
        sb.append(", id=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
