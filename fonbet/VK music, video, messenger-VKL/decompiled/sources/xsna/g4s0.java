package xsna;

import com.vk.feed.core.models.news.NewsEntry;

/* compiled from: VideoAutoplayHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class g4s0 extends ol60 {
    public final NewsEntry h;
    public final NewsEntry i;
    public final jq6 j;
    public final int k;

    public g4s0(NewsEntry newsEntry, NewsEntry newsEntry2, jq6 jq6Var, int i) {
        super(i, 0, 0, 0, null);
        this.h = newsEntry;
        this.i = newsEntry2;
        this.j = jq6Var;
        this.k = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4s0)) {
            return false;
        }
        g4s0 g4s0Var = (g4s0) obj;
        return epx.f(this.h, g4s0Var.h) && epx.f(this.i, g4s0Var.i) && epx.f(this.j, g4s0Var.j) && this.k == g4s0Var.k;
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + shy.a(this.k, (this.j.hashCode() + e630.b(this.h.hashCode() * 31, 31, this.i)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoAutoplayHolderUiDto(entry=");
        sb.append(this.h);
        sb.append(", rootEntry=");
        sb.append(this.i);
        sb.append(", baseVideoAutoplayHolderUiDto=");
        sb.append(this.j);
        sb.append(", videoViewType=");
        return h5s.c(this.k, ", seqId=0)", sb);
    }
}
