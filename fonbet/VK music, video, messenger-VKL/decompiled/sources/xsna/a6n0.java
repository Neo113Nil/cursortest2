package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.feed.core.models.news.NewsEntry;

/* compiled from: SuggestedVideoSingleAutoPlayHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class a6n0 extends ol60 {
    public final NewsEntry h;
    public final NewsEntry i;
    public final jq6 j;
    public final VideoFile k;
    public final String l;
    public final boolean m;
    public final int n;

    public a6n0(NewsEntry newsEntry, NewsEntry newsEntry2, jq6 jq6Var, VideoFile videoFile, String str, boolean z, int i) {
        super(i, 0, 0, 0, null);
        this.h = newsEntry;
        this.i = newsEntry2;
        this.j = jq6Var;
        this.k = videoFile;
        this.l = str;
        this.m = z;
        this.n = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a6n0)) {
            return false;
        }
        a6n0 a6n0Var = (a6n0) obj;
        return epx.f(this.h, a6n0Var.h) && epx.f(this.i, a6n0Var.i) && epx.f(this.j, a6n0Var.j) && epx.f(this.k, a6n0Var.k) && epx.f(this.l, a6n0Var.l) && this.m == a6n0Var.m && this.n == a6n0Var.n;
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        int hashCode = (this.j.hashCode() + e630.b(this.h.hashCode() * 31, 31, this.i)) * 31;
        VideoFile videoFile = this.k;
        int hashCode2 = (hashCode + (videoFile == null ? 0 : videoFile.hashCode())) * 31;
        String str = this.l;
        return Integer.hashCode(0) + shy.a(this.n, qoy.b((hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.m), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuggestedVideoSingleAutoPlayHolderUiDto(entry=");
        sb.append(this.h);
        sb.append(", rootEntry=");
        sb.append(this.i);
        sb.append(", baseVideoAutoplayHolderUiDto=");
        sb.append(this.j);
        sb.append(", video=");
        sb.append(this.k);
        sb.append(", title=");
        sb.append(this.l);
        sb.append(", bottomInfoInvisible=");
        sb.append(this.m);
        sb.append(", videoViewType=");
        return h5s.c(this.n, ", seqId=0)", sb);
    }
}
