package xsna;

import com.vk.dto.discover.carousel.apps.AppCarousel;
import java.util.AbstractList;
import java.util.List;

/* compiled from: MiniAppsCarouselUiDto.kt */
/* loaded from: classes4.dex */
public final class vq20 extends ol60 {
    public final List<gp20> h;
    public final AppCarousel i;

    public vq20(AbstractList abstractList, AppCarousel appCarousel) {
        super(127, 0, 0, 0, null);
        this.h = abstractList;
        this.i = appCarousel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vq20)) {
            return false;
        }
        vq20 vq20Var = (vq20) obj;
        return epx.f(this.h, vq20Var.h) && epx.f(this.i, vq20Var.i);
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + ((this.i.hashCode() + (this.h.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "MiniAppsCarouselUiDto(items=" + this.h + ", entry=" + this.i + ", seqId=0)";
    }
}
