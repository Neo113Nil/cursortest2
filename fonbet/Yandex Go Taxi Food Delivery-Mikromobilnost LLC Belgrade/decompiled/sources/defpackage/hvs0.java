package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class hvs0 implements jvs0 {
    public final gvs0 a;
    public final gvs0 b;
    public final String c;

    public hvs0(gvs0 gvs0Var, gvs0 gvs0Var2, String str) {
        this.a = gvs0Var;
        this.b = gvs0Var2;
        this.c = str;
    }

    @Override // defpackage.jvs0
    public final float a() {
        return 8.0f;
    }

    @Override // defpackage.jvs0
    public final String d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hvs0)) {
            return false;
        }
        hvs0 hvs0Var = (hvs0) obj;
        return jl40.l(this.a, hvs0Var.a) && this.b.equals(hvs0Var.b) && jl40.l(this.c, hvs0Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrailTwoButtons(firstButton=");
        sb.append(this.a);
        sb.append(", secondButton=");
        sb.append(this.b);
        sb.append(", presentationId=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
