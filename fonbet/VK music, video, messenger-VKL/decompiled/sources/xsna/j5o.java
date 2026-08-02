package xsna;

import com.vk.donut.price.model.template.DonutPriceTemplate;
import com.vk.dto.common.VideoFile;

/* compiled from: DonutVideoTeaserUiDto.kt */
/* loaded from: classes4.dex */
public final class j5o extends ol60 {
    public final float h;
    public final VideoFile i;
    public final DonutPriceTemplate j;
    public final String k;
    public final r1o l;

    public j5o(VideoFile videoFile, DonutPriceTemplate donutPriceTemplate, String str, r1o r1oVar) {
        super(27, 0, 0, 0, null);
        this.h = 1.7777778f;
        this.i = videoFile;
        this.j = donutPriceTemplate;
        this.k = str;
        this.l = r1oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j5o)) {
            return false;
        }
        j5o j5oVar = (j5o) obj;
        return Float.compare(this.h, j5oVar.h) == 0 && epx.f(this.i, j5oVar.i) && epx.f(this.j, j5oVar.j) && epx.f(this.k, j5oVar.k) && epx.f(this.l, j5oVar.l);
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        int b = jq.b(this.i, Float.hashCode(this.h) * 31, 31);
        DonutPriceTemplate donutPriceTemplate = this.j;
        int hashCode = (b + (donutPriceTemplate == null ? 0 : donutPriceTemplate.b.hashCode())) * 31;
        String str = this.k;
        return Integer.hashCode(0) + ((this.l.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "DonutVideoTeaserUiDto(ratio=" + this.h + ", video=" + this.i + ", donutPriceTemplate=" + this.j + ", supportBadgeTitle=" + this.k + ", action=" + this.l + ", seqId=0)";
    }
}
