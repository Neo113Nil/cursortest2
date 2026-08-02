package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class fvs0 implements jvs0, r1c {
    public final fa6 a;
    public final x2s b;
    public final b151 c;
    public final String d;
    public final boolean e;

    public fvs0(fa6 fa6Var, x2s x2sVar, wzw0 wzw0Var, String str, boolean z) {
        this.a = fa6Var;
        this.b = x2sVar;
        this.c = wzw0Var;
        this.d = str;
        this.e = z;
    }

    @Override // defpackage.jvs0
    public final float a() {
        return 8.0f;
    }

    @Override // defpackage.r1c
    public final b151 b() {
        return this.c;
    }

    @Override // defpackage.jvs0
    public final String d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fvs0)) {
            return false;
        }
        fvs0 fvs0Var = (fvs0) obj;
        return this.a.equals(fvs0Var.a) && this.b.equals(fvs0Var.b) && jl40.l(this.c, fvs0Var.c) && jl40.l(this.d, fvs0Var.d) && this.e == fvs0Var.e;
    }

    public final int hashCode() {
        int a = tse0.a(this.b, this.a.hashCode() * 31, 31);
        b151 b151Var = this.c;
        int hashCode = (a + (b151Var == null ? 0 : b151Var.hashCode())) * 31;
        String str = this.d;
        return Boolean.hashCode(this.e) + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrailSwitch(state=");
        sb.append(this.a);
        sb.append(", onShownAnalyticsData=");
        sb.append(this.b);
        sb.append(", widgetAction=");
        sb.append(this.c);
        sb.append(", presentationId=");
        sb.append(this.d);
        sb.append(", shouldClearSemantics=");
        return x4e.i(sb, this.e, Extension.C_BRAKE);
    }
}
