package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class bfq0 implements b151 {
    public final boolean a;
    public final boolean b;
    public final r9x0 c;
    public final String d;
    public final Object e;
    public final x2s f;

    public bfq0(boolean z, boolean z2, r9x0 r9x0Var, String str, Object obj, x2s x2sVar) {
        this.a = z;
        this.b = z2;
        this.c = r9x0Var;
        this.d = str;
        this.e = obj;
        this.f = x2sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bfq0)) {
            return false;
        }
        bfq0 bfq0Var = (bfq0) obj;
        return this.a == bfq0Var.a && this.b == bfq0Var.b && jl40.l(this.c, bfq0Var.c) && jl40.l(this.d, bfq0Var.d) && jl40.l(this.e, bfq0Var.e) && this.f.equals(bfq0Var.f);
    }

    public final int hashCode() {
        int e = unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b);
        r9x0 r9x0Var = this.c;
        int b = unr0.b((e + (r9x0Var == null ? 0 : r9x0Var.hashCode())) * 31, 31, this.d);
        Object obj = this.e;
        return this.f.hashCode() + ((b + (obj != null ? obj.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder u = qv10.u("SelectWidgetAction(isSelected=", ", isUnselectEnabled=", ", action=", this.a, this.b);
        u.append(this.c);
        u.append(", formStateKey=");
        u.append(this.d);
        u.append(", value=");
        u.append(this.e);
        u.append(", analyticsData=");
        u.append(this.f);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
