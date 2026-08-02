package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class id80 extends u0x implements r7u, u7u, s7u, xdu0, uvr, a2t0 {
    public final String a;
    public final md80 b;
    public final aeu0 c;
    public final boolean d;
    public final t1t0 e;
    public final d2t0 f;
    public final d2t0 g;
    public final i601 h;

    public id80(String str, md80 md80Var, aeu0 aeu0Var, boolean z, t1t0 t1t0Var, d2t0 d2t0Var, d2t0 d2t0Var2, i601 i601Var) {
        this.a = str;
        this.b = md80Var;
        this.c = aeu0Var;
        this.d = z;
        this.e = t1t0Var;
        this.f = d2t0Var;
        this.g = d2t0Var2;
        this.h = i601Var;
    }

    @Override // defpackage.uvr
    public final String a() {
        return "orders_widgets";
    }

    @Override // defpackage.a2t0
    public final d2t0 b() {
        return this.f;
    }

    @Override // defpackage.a2t0
    public final d2t0 c() {
        return this.g;
    }

    @Override // defpackage.a2t0
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.a2t0
    public final t1t0 e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof id80)) {
            return false;
        }
        id80 id80Var = (id80) obj;
        return jl40.l(this.a, id80Var.a) && jl40.l(this.b, id80Var.b) && jl40.l(this.c, id80Var.c) && this.d == id80Var.d && jl40.l(this.e, id80Var.e) && jl40.l(this.f, id80Var.f) && jl40.l(this.g, id80Var.g) && jl40.l(this.h, id80Var.h);
    }

    @Override // defpackage.xdu0
    public final aeu0 f() {
        return this.c;
    }

    @Override // defpackage.r7u
    public final Object g() {
        return new hd80(this.b.a);
    }

    @Override // defpackage.s7u
    public final Object getItemId() {
        return this.a;
    }

    @Override // defpackage.u7u
    public final Object getModel() {
        return this.b;
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b.a);
        aeu0 aeu0Var = this.c;
        int e = unr0.e((b + (aeu0Var == null ? 0 : aeu0Var.hashCode())) * 31, 31, this.d);
        t1t0 t1t0Var = this.e;
        int hashCode = (e + (t1t0Var == null ? 0 : t1t0Var.hashCode())) * 31;
        d2t0 d2t0Var = this.f;
        int hashCode2 = (hashCode + (d2t0Var == null ? 0 : d2t0Var.hashCode())) * 31;
        d2t0 d2t0Var2 = this.g;
        return this.h.hashCode() + ((hashCode2 + (d2t0Var2 != null ? d2t0Var2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "OrdersWidgetItem(itemId=" + this.a + ", model=" + this.b + ", stickyParams=" + this.c + ", isSnapping=" + this.d + ", snappingCallbacks=" + this.e + ", snappingEnd=" + this.f + ", snappingStart=" + this.g + ", properties=" + this.h + Extension.C_BRAKE;
    }
}
