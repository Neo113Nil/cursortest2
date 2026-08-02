package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class dvs0 implements jvs0, r1c {
    public final float a;
    public final e3k0 b;
    public final x2s c;
    public final b151 d;
    public final String e;
    public final boolean f;

    public dvs0(float f, e3k0 e3k0Var, x2s x2sVar, dib dibVar, String str, boolean z) {
        this.a = f;
        this.b = e3k0Var;
        this.c = x2sVar;
        this.d = dibVar;
        this.e = str;
        this.f = z;
    }

    @Override // defpackage.jvs0
    public final float a() {
        return 8.0f;
    }

    @Override // defpackage.r1c
    public final b151 b() {
        return this.d;
    }

    @Override // defpackage.jvs0
    public final String d() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dvs0)) {
            return false;
        }
        dvs0 dvs0Var = (dvs0) obj;
        return y7m.b(this.a, dvs0Var.a) && jl40.l(this.b, dvs0Var.b) && this.c.equals(dvs0Var.c) && jl40.l(this.d, dvs0Var.d) && jl40.l(this.e, dvs0Var.e) && this.f == dvs0Var.f;
    }

    public final int hashCode() {
        int a = tse0.a(this.c, (this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31, 31);
        b151 b151Var = this.d;
        int hashCode = (a + (b151Var == null ? 0 : b151Var.hashCode())) * 31;
        String str = this.e;
        return Boolean.hashCode(this.f) + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String c = y7m.c(this.a);
        StringBuilder sb = new StringBuilder("TrailRichCheckControl(width=");
        sb.append(c);
        sb.append(", state=");
        sb.append(this.b);
        sb.append(", onShownAnalyticsData=");
        sb.append(this.c);
        sb.append(", widgetAction=");
        sb.append(this.d);
        sb.append(", presentationId=");
        return nnm.i(this.e, ", shouldClearSemantics=", Extension.C_BRAKE, sb, this.f);
    }
}
