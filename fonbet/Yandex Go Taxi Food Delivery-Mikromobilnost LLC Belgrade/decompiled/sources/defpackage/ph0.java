package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ph0 implements xh0 {
    public final boolean a;
    public final qh0 b;
    public final String c;
    public final boolean d;

    public ph0(boolean z, qh0 qh0Var, String str, boolean z2) {
        this.a = z;
        this.b = qh0Var;
        this.c = str;
        this.d = z2;
    }

    @Override // defpackage.xh0
    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ph0)) {
            return false;
        }
        ph0 ph0Var = (ph0) obj;
        return this.a == ph0Var.a && jl40.l(this.b, ph0Var.b) && jl40.l(this.c, ph0Var.c) && this.d == ph0Var.d;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31;
        String str = this.c;
        return Boolean.hashCode(this.d) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InfoScreenContent(isFullscreen=");
        sb.append(this.a);
        sb.append(", infoScreen=");
        sb.append(this.b);
        sb.append(", bindUrl=");
        return nnm.i(this.c, ", showBackButton=", Extension.C_BRAKE, sb, this.d);
    }
}
