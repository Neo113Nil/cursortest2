package xsna;

import com.vk.dto.common.Image;

/* compiled from: VideoRestrictionPlaceholder.kt */
/* loaded from: classes16.dex */
public final class rdt0 {
    public final pdt0 a;
    public final Image b;
    public final l8s0 c;

    public rdt0(pdt0 pdt0Var, Image image, l8s0 l8s0Var) {
        this.a = pdt0Var;
        this.b = image;
        this.c = l8s0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rdt0)) {
            return false;
        }
        rdt0 rdt0Var = (rdt0) obj;
        return epx.f(this.a, rdt0Var.a) && epx.f(this.b, rdt0Var.b) && epx.f(this.c, rdt0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + fq.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "VideoRestrictionViewState(restrictionType=" + this.a + ", videoImage=" + this.b + ", videoCardSize=" + this.c + ')';
    }
}
