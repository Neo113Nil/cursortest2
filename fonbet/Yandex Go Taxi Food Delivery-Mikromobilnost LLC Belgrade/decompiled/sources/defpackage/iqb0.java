package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class iqb0 {
    public final String a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final h670 e;
    public final String f;

    public iqb0(String str, boolean z, String str2, boolean z2, h670 h670Var, String str3) {
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = z2;
        this.e = h670Var;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iqb0)) {
            return false;
        }
        iqb0 iqb0Var = (iqb0) obj;
        return jl40.l(this.a, iqb0Var.a) && this.b == iqb0Var.b && jl40.l(this.c, iqb0Var.c) && this.d == iqb0Var.d && jl40.l(this.e, iqb0Var.e) && jl40.l(this.f, iqb0Var.f);
    }

    public final int hashCode() {
        int e = unr0.e(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int e2 = unr0.e((e + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        h670 h670Var = this.e;
        return this.f.hashCode() + ((e2 + (h670Var != null ? h670Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder l = oo31.l("PickupPointPin(title=", this.a, ", titleHasChevron=", ", subtitle=", this.b);
        tse0.y(this.c, ", subtitleHasChevron=", ", action=", l, this.d);
        l.append(this.e);
        l.append(", analyticsId=");
        l.append(this.f);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
