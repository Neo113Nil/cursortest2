package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class kpy0 implements pre {
    public final String a;
    public final int b;
    public final String c;
    public final dqy0 d;
    public final dqy0 e;
    public final String f;
    public final List g;
    public final zpy0 h;
    public final int i;
    public final boolean j;
    public final int k;
    public final String l;

    public kpy0(String str, int i, String str2, dqy0 dqy0Var, dqy0 dqy0Var2, String str3, List list, zpy0 zpy0Var, int i2, boolean z, int i3, String str4) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = dqy0Var;
        this.e = dqy0Var2;
        this.f = str3;
        this.g = list;
        this.h = zpy0Var;
        this.i = i2;
        this.j = z;
        this.k = i3;
        this.l = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kpy0)) {
            return false;
        }
        kpy0 kpy0Var = (kpy0) obj;
        return jl40.l(this.a, kpy0Var.a) && this.b == kpy0Var.b && jl40.l(this.c, kpy0Var.c) && jl40.l(this.d, kpy0Var.d) && jl40.l(this.e, kpy0Var.e) && jl40.l(this.f, kpy0Var.f) && this.g.equals(kpy0Var.g) && jl40.l(this.h, kpy0Var.h) && this.i == kpy0Var.i && this.j == kpy0Var.j && this.k == kpy0Var.k && jl40.l(this.l, kpy0Var.l);
    }

    @Override // defpackage.pre
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.pre
    public final String getType() {
        return "text-input";
    }

    public final int hashCode() {
        int b = unr0.b(oyr.b(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        dqy0 dqy0Var = this.d;
        int hashCode = (b + (dqy0Var == null ? 0 : dqy0Var.hashCode())) * 31;
        dqy0 dqy0Var2 = this.e;
        int c = unr0.c(unr0.b((hashCode + (dqy0Var2 == null ? 0 : dqy0Var2.hashCode())) * 31, 31, this.f), 31, this.g);
        zpy0 zpy0Var = this.h;
        int b2 = oyr.b(this.k, unr0.e(oyr.b(this.i, (c + (zpy0Var == null ? 0 : zpy0Var.hashCode())) * 31, 31), 31, this.j), 31);
        String str = this.l;
        return b2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder u = b64.u(this.b, "TextInputRemoteCoreWidget(id=", this.a, ", height=", ", placeholder=");
        u.append(this.c);
        u.append(", focusedStyle=");
        u.append(this.d);
        u.append(", unfocusedStyle=");
        u.append(this.e);
        u.append(", formStateKey=");
        u.append(this.f);
        u.append(", trails=");
        u.append(this.g);
        u.append(", stopWordsConfig=");
        u.append(this.h);
        u.append(", maxSymbols=");
        tse0.z(u, this.i, ", forceOpenKeyboard=", this.j, ", horizontalInset=");
        return xvz.h(this.k, ", metricaLabel=", this.l, Extension.C_BRAKE, u);
    }
}
