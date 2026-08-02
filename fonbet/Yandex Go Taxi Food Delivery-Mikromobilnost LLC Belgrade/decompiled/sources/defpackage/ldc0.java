package defpackage;

import com.yandex.go.places.map.domain.entities.PlacesPinWarV2Config$ZoomStep;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ldc0 extends an91 {
    public final int a;
    public final float b;
    public final zm91 c;
    public final PlacesPinWarV2Config$ZoomStep d;
    public final hdc0 e;
    public final Float f;
    public final ixy0 g;

    public ldc0(int i, float f, zm91 zm91Var, PlacesPinWarV2Config$ZoomStep placesPinWarV2Config$ZoomStep, hdc0 hdc0Var, Float f2, ixy0 ixy0Var) {
        this.a = i;
        this.b = f;
        this.c = zm91Var;
        this.d = placesPinWarV2Config$ZoomStep;
        this.e = hdc0Var;
        this.f = f2;
        this.g = ixy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ldc0)) {
            return false;
        }
        ldc0 ldc0Var = (ldc0) obj;
        return this.a == ldc0Var.a && Float.compare(this.b, ldc0Var.b) == 0 && this.c.equals(ldc0Var.c) && this.d == ldc0Var.d && jl40.l(this.e, ldc0Var.e) && jl40.l(this.f, ldc0Var.f) && jl40.l(this.g, ldc0Var.g);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + g8e.c(this.b, Integer.hashCode(this.a) * 31, 31)) * 31)) * 31;
        hdc0 hdc0Var = this.e;
        int hashCode2 = (hashCode + (hdc0Var == null ? 0 : hdc0Var.hashCode())) * 31;
        Float f = this.f;
        int hashCode3 = (hashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        ixy0 ixy0Var = this.g;
        return hashCode3 + (ixy0Var != null ? ixy0Var.hashCode() : 0);
    }

    public final String toString() {
        return "Enabled(lessThanZoom=" + this.a + ", clusterRadiusDp=" + this.b + ", cameraRedrawMode=" + this.c + ", zoomStep=" + this.d + ", animation=" + this.e + ", superPinPriorityThreshold=" + this.f + ", stubImage=" + this.g + Extension.C_BRAKE;
    }
}
