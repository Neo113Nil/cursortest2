package xsna;

import com.vk.feed.core.models.news.NewsEntry;

/* compiled from: SkeletonBlockHeaderHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class cyj0 extends ol60 {
    public final NewsEntry h;
    public final bwy i;

    public cyj0(NewsEntry newsEntry, bwy bwyVar) {
        super(252, 0, 0, 0, null);
        this.h = newsEntry;
        this.i = bwyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cyj0)) {
            return false;
        }
        cyj0 cyj0Var = (cyj0) obj;
        return epx.f(this.h, cyj0Var.h) && epx.f(this.i, cyj0Var.i);
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + ((this.i.hashCode() + (this.h.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SkeletonBlockHeaderHolderUiDto(entry=" + this.h + ", lazyLoadState=" + this.i + ", seqId=0)";
    }
}
