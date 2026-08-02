package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class e5r0 implements g5r0 {
    public final String a;
    public final boolean b;
    public final Integer c;
    public final boolean d;
    public final sls e;

    public e5r0(String str, boolean z, Integer num, boolean z2, sls slsVar) {
        this.a = str;
        this.b = z;
        this.c = num;
        this.d = z2;
        this.e = slsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e5r0)) {
            return false;
        }
        e5r0 e5r0Var = (e5r0) obj;
        return jl40.l(this.a, e5r0Var.a) && this.b == e5r0Var.b && jl40.l(this.c, e5r0Var.c) && this.d == e5r0Var.d && jl40.l(this.e, e5r0Var.e);
    }

    public final int hashCode() {
        int e = unr0.e(this.a.hashCode() * 31, 31, this.b);
        Integer num = this.c;
        return this.e.hashCode() + unr0.e((e + (num == null ? 0 : num.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder l = oo31.l("ToggleSetting(title=", this.a, ", isSelected=", ", iconRes=", this.b);
        l.append(this.c);
        l.append(", drawDivider=");
        l.append(this.d);
        l.append(", onToggled=");
        return ly3.r(l, this.e, Extension.C_BRAKE);
    }
}
