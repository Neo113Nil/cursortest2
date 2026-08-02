package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class avs0 implements jvs0 {
    public final y4v a;
    public final String b;

    public avs0(y4v y4vVar, String str) {
        this.a = y4vVar;
        this.b = str;
    }

    @Override // defpackage.jvs0
    public final String d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof avs0)) {
            return false;
        }
        avs0 avs0Var = (avs0) obj;
        return this.a.equals(avs0Var.a) && jl40.l(this.b, avs0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 961;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "TrailIconSpot(iconSpot=" + this.a + ", onShownAnalyticsData=null, presentationId=" + this.b + Extension.C_BRAKE;
    }
}
