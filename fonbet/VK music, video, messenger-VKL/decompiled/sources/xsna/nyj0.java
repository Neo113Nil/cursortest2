package xsna;

import com.vk.feed.core.models.news.NewsEntry;

/* compiled from: SkeletonErrorBlockHeaderHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class nyj0 extends ol60 {
    public final NewsEntry h;

    public nyj0(NewsEntry newsEntry) {
        super(259, 0, 0, 0, null);
        this.h = newsEntry;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nyj0) && epx.f(this.h, ((nyj0) obj).h);
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (this.h.hashCode() * 31);
    }

    public final String toString() {
        return "SkeletonErrorBlockHeaderHolderUiDto(entry=" + this.h + ", seqId=0)";
    }
}
