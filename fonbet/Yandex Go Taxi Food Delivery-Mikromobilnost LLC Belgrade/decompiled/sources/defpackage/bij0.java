package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class bij0 implements kij0, e6v, k1c {
    public final cw70 a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public bij0(cw70 cw70Var, String str, boolean z, boolean z2) {
        this.a = cw70Var;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = cw70Var.b.length() > 0;
    }

    @Override // defpackage.k1c
    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bij0)) {
            return false;
        }
        bij0 bij0Var = (bij0) obj;
        return jl40.l(this.a, bij0Var.a) && jl40.l(this.b, bij0Var.b) && this.c == bij0Var.c && this.d == bij0Var.d;
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + unr0.e(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    @Override // defpackage.k1c
    public final boolean isChecked() {
        return this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrderForOther(state=");
        sb.append(this.a);
        sb.append(", trailAccessibilityTitle=");
        sb.append(this.b);
        sb.append(", isFirst=");
        return smw0.k(", isLast=", Extension.C_BRAKE, sb, this.c, this.d);
    }
}
