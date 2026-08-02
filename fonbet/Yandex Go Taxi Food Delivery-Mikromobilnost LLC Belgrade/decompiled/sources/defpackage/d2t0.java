package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes9.dex */
public final class d2t0 {
    public static final c2t0 Companion = new c2t0();
    public final Float a;
    public final Boolean b;
    public final y1t0 c;
    public final y1t0 d;

    public /* synthetic */ d2t0(int i, Float f, Boolean bool, y1t0 y1t0Var, y1t0 y1t0Var2) {
        if (12 != (i & 12)) {
            qje.Z(i, 12, b2t0.a.getDescriptor());
            throw null;
        }
        this.a = (i & 1) == 0 ? Float.valueOf(0.0f) : f;
        if ((i & 2) == 0) {
            this.b = Boolean.FALSE;
        } else {
            this.b = bool;
        }
        this.c = y1t0Var;
        this.d = y1t0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!d2t0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        d2t0 d2t0Var = (d2t0) obj;
        return jl40.k(this.a, d2t0Var.a) && jl40.l(this.b, d2t0Var.b) && jl40.l(this.c, d2t0Var.c) && jl40.l(this.d, d2t0Var.d);
    }

    public final int hashCode() {
        Float f = this.a;
        int hashCode = (f != null ? f.hashCode() : 0) * 31;
        Boolean bool = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (bool != null ? bool.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "SnappingParams(offset=" + this.a + ", forceSnapOnFling=" + this.b + ", increasing=" + this.c + ", decreasing=" + this.d + Extension.C_BRAKE;
    }

    public d2t0(y1t0 y1t0Var, y1t0 y1t0Var2) {
        Float valueOf = Float.valueOf(0.0f);
        Boolean bool = Boolean.FALSE;
        this.a = valueOf;
        this.b = bool;
        this.c = y1t0Var;
        this.d = y1t0Var2;
    }
}
