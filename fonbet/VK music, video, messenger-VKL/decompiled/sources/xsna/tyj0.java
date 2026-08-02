package xsna;

import com.vk.feed.core.models.news.NewsEntry;

/* compiled from: SkeletonOptionalNativeAdUiDto.kt */
/* loaded from: classes4.dex */
public final class tyj0 extends ol60 {
    public final int h;
    public final NewsEntry i;

    public tyj0(int i, NewsEntry newsEntry) {
        super(i, 0, 0, 0, null);
        this.h = i;
        this.i = newsEntry;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tyj0)) {
            return false;
        }
        tyj0 tyj0Var = (tyj0) obj;
        tyj0Var.getClass();
        return this.h == tyj0Var.h && epx.f(this.i, tyj0Var.i);
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        return this.i.hashCode() + shy.a(this.h, Integer.hashCode(0) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SkeletonOptionalNativeAdUiDto(seqId=0, customViewType=");
        sb.append(this.h);
        sb.append(", raw=");
        return ck70.a(sb, this.i, ')');
    }
}
