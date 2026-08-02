package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ivs0 implements jvs0 {
    public final lvi0 a;
    public final boolean b;
    public final s810 c;
    public final a470 d;
    public final v570 e;
    public final x9x0 f;
    public final String g;

    public ivs0(lvi0 lvi0Var, boolean z, s810 s810Var, a470 a470Var, v570 v570Var, x9x0 x9x0Var, String str) {
        this.a = lvi0Var;
        this.b = z;
        this.c = s810Var;
        this.d = a470Var;
        this.e = v570Var;
        this.f = x9x0Var;
        this.g = str;
    }

    @Override // defpackage.jvs0
    public final String d() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ivs0)) {
            return false;
        }
        ivs0 ivs0Var = (ivs0) obj;
        return this.a.equals(ivs0Var.a) && this.b == ivs0Var.b && this.c.equals(ivs0Var.c) && this.d.equals(ivs0Var.d) && this.e.equals(ivs0Var.e) && this.f.equals(ivs0Var.f) && jl40.l(this.g, ivs0Var.g);
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((unr0.e(this.a.hashCode() * 31, 31, this.b) + 0) * 31)) * 31)) * 961)) * 31;
        String str = this.g;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrailUploadImagesButton(icon=");
        sb.append(this.a);
        sb.append(", isEnabled=");
        sb.append(this.b);
        sb.append(", disabledWidgetAction=");
        sb.append(this.c);
        sb.append(", openCameraWidgetAction=");
        sb.append(this.d);
        sb.append(", openGalleryWidgetAction=");
        sb.append(this.e);
        sb.append(", onShownAnalyticsData=null, widgetAction=");
        sb.append(this.f);
        sb.append(", presentationId=");
        return oyr.t(sb, this.g, Extension.C_BRAKE);
    }
}
