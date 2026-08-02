package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class hj0 {
    public final boolean a;
    public final sls b;
    public final sls c;
    public final sls d;
    public final sls e;

    public hj0(boolean z, sls slsVar, sls slsVar2, sls slsVar3, sls slsVar4) {
        this.a = z;
        this.b = slsVar;
        this.c = slsVar2;
        this.d = slsVar3;
        this.e = slsVar4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hj0)) {
            return false;
        }
        hj0 hj0Var = (hj0) obj;
        return this.a == hj0Var.a && this.b.equals(hj0Var.b) && this.c.equals(hj0Var.c) && this.d.equals(hj0Var.d) && this.e.equals(hj0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + nnm.a(nnm.a(nnm.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddPhotocommentButtonModel(enabled=");
        sb.append(this.a);
        sb.append(", onOpenCameraClick=");
        sb.append(this.b);
        sb.append(", onOpenGalleryClick=");
        sb.append(this.c);
        sb.append(", onDisabledButtonClick=");
        sb.append(this.d);
        sb.append(", sendAnalyticsOnClick=");
        return ly3.r(sb, this.e, Extension.C_BRAKE);
    }
}
