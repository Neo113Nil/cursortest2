package defpackage;

import android.graphics.PointF;
import com.yandex.go.layers.api.model.AppearanceType;
import com.yandex.runtime.image.ImageProvider;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class lz2 {
    public final ImageProvider a;
    public final float b;
    public final y2b1 c;
    public final float d;
    public final pt3 e;
    public final float f;
    public final AppearanceType g;
    public final PointF h;
    public final ImageProvider i;
    public final PointF j;
    public final float k;

    public lz2(ImageProvider imageProvider, float f, y2b1 y2b1Var, float f2, pt3 pt3Var, AppearanceType appearanceType, PointF pointF, ImageProvider imageProvider2, PointF pointF2, int i) {
        this(imageProvider, f, (i & 4) != 0 ? fc4.a : y2b1Var, (i & 8) != 0 ? 1.0f : f2, (i & 16) != 0 ? null : pt3Var, 1.0f, (i & 64) != 0 ? AppearanceType.NORMAL : appearanceType, (i & 128) != 0 ? mz2.a : pointF, (i & 256) != 0 ? null : imageProvider2, (i & 512) != 0 ? mz2.a : pointF2);
    }

    public static lz2 a(lz2 lz2Var, float f) {
        ImageProvider imageProvider = lz2Var.a;
        float f2 = lz2Var.b;
        y2b1 y2b1Var = lz2Var.c;
        pt3 pt3Var = lz2Var.e;
        float f3 = lz2Var.f;
        AppearanceType appearanceType = lz2Var.g;
        PointF pointF = lz2Var.h;
        ImageProvider imageProvider2 = lz2Var.i;
        PointF pointF2 = lz2Var.j;
        lz2Var.getClass();
        return new lz2(imageProvider, f2, y2b1Var, f, pt3Var, f3, appearanceType, pointF, imageProvider2, pointF2);
    }

    public final AppearanceType b() {
        return this.g;
    }

    public final pt3 c() {
        return this.e;
    }

    public final y2b1 d() {
        return this.c;
    }

    public final ImageProvider e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lz2)) {
            return false;
        }
        lz2 lz2Var = (lz2) obj;
        return jl40.l(this.a, lz2Var.a) && Float.compare(this.b, lz2Var.b) == 0 && jl40.l(this.c, lz2Var.c) && Float.compare(this.d, lz2Var.d) == 0 && jl40.l(this.e, lz2Var.e) && Float.compare(this.f, lz2Var.f) == 0 && this.g == lz2Var.g && jl40.l(this.h, lz2Var.h) && jl40.l(this.i, lz2Var.i) && jl40.l(this.j, lz2Var.j);
    }

    public final float f() {
        return this.d;
    }

    public final ImageProvider g() {
        return this.i;
    }

    public final float h() {
        return this.b;
    }

    public final int hashCode() {
        int c = g8e.c(this.d, (this.c.hashCode() + g8e.c(this.b, this.a.hashCode() * 31, 31)) * 31, 31);
        pt3 pt3Var = this.e;
        int hashCode = (this.h.hashCode() + ((this.g.hashCode() + g8e.c(this.f, (c + (pt3Var == null ? 0 : pt3Var.hashCode())) * 31, 31)) * 31)) * 31;
        ImageProvider imageProvider = this.i;
        return this.j.hashCode() + ((hashCode + (imageProvider != null ? imageProvider.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Appearance(image=" + this.a + ", zIndex=" + this.b + ", azimuth=" + this.c + ", scale=" + this.d + ", autoscale=" + this.e + ", densityScale=" + this.f + ", appearanceType=" + this.g + ", anchor=" + this.h + ", selectedStateImage=" + this.i + ", selectedStateAnchor=" + this.j + Extension.C_BRAKE;
    }

    public lz2(ImageProvider imageProvider, float f, y2b1 y2b1Var, float f2, pt3 pt3Var, float f3, AppearanceType appearanceType, PointF pointF, ImageProvider imageProvider2, PointF pointF2) {
        this.a = imageProvider;
        this.b = f;
        this.c = y2b1Var;
        this.d = f2;
        this.e = pt3Var;
        this.f = f3;
        this.g = appearanceType;
        this.h = pointF;
        this.i = imageProvider2;
        this.j = pointF2;
        this.k = f2;
    }
}
