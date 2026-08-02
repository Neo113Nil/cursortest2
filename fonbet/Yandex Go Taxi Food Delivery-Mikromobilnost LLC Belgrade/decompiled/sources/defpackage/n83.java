package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ln83;", "Lj530;", "Lr83;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class n83 extends j530 {
    public final float a;
    public final tls b;

    public n83(float f, tls tlsVar) {
        this.a = f;
        this.b = tlsVar;
        if (f > 0.0f) {
            return;
        }
        gxv.a("aspectRatio " + f + " must be > 0");
    }

    @Override // defpackage.j530
    public final e530 a() {
        r83 r83Var = new r83();
        r83Var.a = this.a;
        return r83Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        n83 n83Var = obj instanceof n83 ? (n83) obj : null;
        if (n83Var == null || this.a != n83Var.a) {
            return false;
        }
        ((n83) obj).getClass();
        return true;
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        ((r83) e530Var).a = this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Float.hashCode(this.a) * 31);
    }
}
