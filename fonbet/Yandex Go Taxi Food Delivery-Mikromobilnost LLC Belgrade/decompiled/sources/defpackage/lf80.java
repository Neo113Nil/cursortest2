package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class lf80 {
    public final boolean a;
    public final float b;
    public final float c;

    public lf80(float f, float f2, boolean z) {
        this.a = z;
        this.b = f;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lf80)) {
            return false;
        }
        lf80 lf80Var = (lf80) obj;
        return this.a == lf80Var.a && Float.compare(this.b, lf80Var.b) == 0 && Float.compare(this.c, lf80Var.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + g8e.c(this.b, Boolean.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrganizationCardGalleryExperimentConfig(isEnabled=");
        sb.append(this.a);
        sb.append(", widthMultiplier=");
        sb.append(this.b);
        sb.append(", heightHideableMultiplier=");
        return uw51.i(sb, this.c, Extension.C_BRAKE);
    }
}
