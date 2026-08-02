package xsna;

import com.vk.core.util.measure.ScaleType;
import com.vk.feed.core.models.news.NewsEntry;
import one.video.transform.TransformController;

/* compiled from: VideoAutoplayNoInfoHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class h4s0 extends ol60 {
    public final NewsEntry h;
    public final NewsEntry i;
    public final jq6 j;
    public final int k;
    public final ScaleType l;
    public final TransformController.ScaleType m;
    public final boolean n;

    public h4s0(NewsEntry newsEntry, NewsEntry newsEntry2, jq6 jq6Var, int i, ScaleType scaleType, TransformController.ScaleType scaleType2, boolean z) {
        super(i, 0, 0, 0, null);
        this.h = newsEntry;
        this.i = newsEntry2;
        this.j = jq6Var;
        this.k = i;
        this.l = scaleType;
        this.m = scaleType2;
        this.n = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h4s0)) {
            return false;
        }
        h4s0 h4s0Var = (h4s0) obj;
        return epx.f(this.h, h4s0Var.h) && epx.f(this.i, h4s0Var.i) && epx.f(this.j, h4s0Var.j) && this.k == h4s0Var.k && this.l == h4s0Var.l && this.m == h4s0Var.m && this.n == h4s0Var.n;
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + qoy.b((this.m.hashCode() + ((this.l.hashCode() + shy.a(this.k, (this.j.hashCode() + e630.b(this.h.hashCode() * 31, 31, this.i)) * 31, 31)) * 31)) * 31, 31, this.n);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoAutoplayNoInfoHolderUiDto(entry=");
        sb.append(this.h);
        sb.append(", rootEntry=");
        sb.append(this.i);
        sb.append(", baseVideoAutoplayHolderUiDto=");
        sb.append(this.j);
        sb.append(", videoViewType=");
        sb.append(this.k);
        sb.append(", previewScaleType=");
        sb.append(this.l);
        sb.append(", videoScaleType=");
        sb.append(this.m);
        sb.append(", isCarousel=");
        return n23.b(sb, this.n, ", seqId=0)");
    }
}
