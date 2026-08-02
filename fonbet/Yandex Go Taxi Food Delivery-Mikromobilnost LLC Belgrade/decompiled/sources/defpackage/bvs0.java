package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class bvs0 implements jvs0 {
    public final ldc a;
    public final String b;

    public bvs0(ldc ldcVar, String str) {
        this.a = ldcVar;
        this.b = str;
    }

    @Override // defpackage.jvs0
    public final float a() {
        return 0.0f;
    }

    @Override // defpackage.jvs0
    public final float c() {
        return 8.0f;
    }

    @Override // defpackage.jvs0
    public final String d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bvs0)) {
            return false;
        }
        bvs0 bvs0Var = (bvs0) obj;
        return jl40.l(this.a, bvs0Var.a) && jl40.l(this.b, bvs0Var.b);
    }

    public final int hashCode() {
        ldc ldcVar = this.a;
        int hashCode = (ldcVar == null ? 0 : Long.hashCode(ldcVar.a)) * 961;
        String str = this.b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "TrailNav(tintColor=" + this.a + ", onShownAnalyticsData=null, presentationId=" + this.b + Extension.C_BRAKE;
    }
}
