package xsna;

import com.vk.feed.core.models.news.NewsEntry;

/* compiled from: RecommendationsCarouselErrorHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class jbf0 extends ol60 {
    public final NewsEntry h;
    public final int i;

    public jbf0(int i, NewsEntry newsEntry) {
        super(i, 0, 0, 0, null);
        this.h = newsEntry;
        this.i = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jbf0)) {
            return false;
        }
        jbf0 jbf0Var = (jbf0) obj;
        return epx.f(this.h, jbf0Var.h) && this.i == jbf0Var.i;
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + shy.a(this.i, this.h.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecommendationsCarouselErrorHolderUiDto(entry=");
        sb.append(this.h);
        sb.append(", holderViewType=");
        return h5s.c(this.i, ", seqId=0)", sb);
    }
}
