package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class o8q0 {
    public final r8q0 a;
    public final r8q0 b;
    public final Object c;
    public final boolean d;
    public final yg e;
    public final ul4 f;
    public final m8q0 g;
    public final r9x0 h;
    public final r9x0 i;

    public o8q0(r8q0 r8q0Var, r8q0 r8q0Var2, Object obj, boolean z, yg ygVar, ul4 ul4Var, m8q0 m8q0Var, r9x0 r9x0Var, r9x0 r9x0Var2) {
        this.a = r8q0Var;
        this.b = r8q0Var2;
        this.c = obj;
        this.d = z;
        this.e = ygVar;
        this.f = ul4Var;
        this.g = m8q0Var;
        this.h = r9x0Var;
        this.i = r9x0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8q0)) {
            return false;
        }
        o8q0 o8q0Var = (o8q0) obj;
        return this.a.equals(o8q0Var.a) && this.b.equals(o8q0Var.b) && jl40.l(this.c, o8q0Var.c) && this.d == o8q0Var.d && jl40.l(this.e, o8q0Var.e) && jl40.l(this.f, o8q0Var.f) && jl40.l(this.g, o8q0Var.g) && jl40.l(this.h, o8q0Var.h) && jl40.l(this.i, o8q0Var.i);
    }

    public final int hashCode() {
        int e = unr0.e(smw0.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
        yg ygVar = this.e;
        int hashCode = (e + (ygVar == null ? 0 : ygVar.hashCode())) * 31;
        ul4 ul4Var = this.f;
        int hashCode2 = (hashCode + (ul4Var == null ? 0 : ul4Var.hashCode())) * 31;
        m8q0 m8q0Var = this.g;
        int hashCode3 = (hashCode2 + (m8q0Var == null ? 0 : m8q0Var.hashCode())) * 31;
        r9x0 r9x0Var = this.h;
        int hashCode4 = (hashCode3 + (r9x0Var == null ? 0 : r9x0Var.hashCode())) * 31;
        r9x0 r9x0Var2 = this.i;
        return hashCode4 + (r9x0Var2 != null ? r9x0Var2.hashCode() : 0);
    }

    public final String toString() {
        return "SegmentOptionModel(selectedText=" + this.a + ", unselectedText=" + this.b + ", value=" + this.c + ", isAvailable=" + this.d + ", accessibilityInfo=" + this.e + ", badge=" + this.f + ", hint=" + this.g + ", selectionAction=" + this.h + ", unselectionAction=" + this.i + Extension.C_BRAKE;
    }
}
