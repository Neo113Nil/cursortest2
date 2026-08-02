package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.requirements.ListItemType;

/* loaded from: classes6.dex */
public final class hij0 implements kij0, e6v, lhx0 {
    public final apj0 a;
    public final cjw0 b;
    public final gij0 c;
    public final boolean d;
    public final boolean e;

    public hij0(apj0 apj0Var, cjw0 cjw0Var, gij0 gij0Var, boolean z, boolean z2) {
        this.a = apj0Var;
        this.b = cjw0Var;
        this.c = gij0Var;
        this.d = z;
        this.e = z2;
    }

    public static hij0 m(hij0 hij0Var, cjw0 cjw0Var, boolean z, boolean z2, int i) {
        apj0 apj0Var = hij0Var.a;
        if ((i & 2) != 0) {
            cjw0Var = hij0Var.b;
        }
        cjw0 cjw0Var2 = cjw0Var;
        gij0 gij0Var = hij0Var.c;
        if ((i & 8) != 0) {
            z = hij0Var.d;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = hij0Var.e;
        }
        return new hij0(apj0Var, cjw0Var2, gij0Var, z3, z2);
    }

    @Override // defpackage.lhx0
    public final String b() {
        return this.a.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hij0)) {
            return false;
        }
        hij0 hij0Var = (hij0) obj;
        return jl40.l(this.a, hij0Var.a) && jl40.l(this.b, hij0Var.b) && jl40.l(this.c, hij0Var.c) && this.d == hij0Var.d && this.e == hij0Var.e;
    }

    @Override // defpackage.e6v
    public final String getId() {
        apj0 apj0Var = this.a;
        return apj0Var.a + ((apj0Var.f != null || apj0Var.g) ? ListItemType.USUAL : ListItemType.TOGGLE);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        cjw0 cjw0Var = this.b;
        int hashCode2 = (hashCode + (cjw0Var == null ? 0 : cjw0Var.hashCode())) * 31;
        gij0 gij0Var = this.c;
        return Boolean.hashCode(this.e) + unr0.e((hashCode2 + (gij0Var != null ? gij0Var.hashCode() : 0)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Toggle(item=");
        sb.append(this.a);
        sb.append(", badge=");
        sb.append(this.b);
        sb.append(", trackColors=");
        sb.append(this.c);
        sb.append(", isFirst=");
        sb.append(this.d);
        sb.append(", isLast=");
        return x4e.i(sb, this.e, Extension.C_BRAKE);
    }

    public /* synthetic */ hij0(apj0 apj0Var, cjw0 cjw0Var, gij0 gij0Var) {
        this(apj0Var, cjw0Var, gij0Var, false, false);
    }
}
