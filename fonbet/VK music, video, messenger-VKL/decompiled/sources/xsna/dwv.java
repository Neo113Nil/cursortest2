package xsna;

import com.vk.feed.core.models.news.NewsEntry;

/* compiled from: IgnoredFooterHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class dwv extends ol60 {
    public final NewsEntry h;

    public dwv(NewsEntry newsEntry) {
        super(279, 0, 0, 0, null);
        this.h = newsEntry;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dwv) && epx.f(this.h, ((dwv) obj).h);
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (this.h.hashCode() * 31);
    }

    public final String toString() {
        return "IgnoredFooterHolderUiDto(entry=" + this.h + ", seqId=0)";
    }
}
