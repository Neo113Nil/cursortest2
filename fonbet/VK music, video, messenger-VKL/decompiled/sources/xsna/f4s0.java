package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.feed.core.models.news.NewsEntry;

/* compiled from: VideoAutoPlayWithFooterHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class f4s0 extends ol60 {
    public final NewsEntry h;
    public final NewsEntry i;
    public final jq6 j;
    public final byte k;
    public final VideoFile l;
    public final String m;
    public final String n;
    public final String o;
    public final int p;
    public final int q;

    public f4s0(NewsEntry newsEntry, NewsEntry newsEntry2, jq6 jq6Var, byte b, VideoFile videoFile, String str, String str2, String str3, int i, int i2) {
        super(i2, 0, 0, 0, null);
        this.h = newsEntry;
        this.i = newsEntry2;
        this.j = jq6Var;
        this.k = b;
        this.l = videoFile;
        this.m = str;
        this.n = str2;
        this.o = str3;
        this.p = i;
        this.q = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f4s0)) {
            return false;
        }
        f4s0 f4s0Var = (f4s0) obj;
        return epx.f(this.h, f4s0Var.h) && epx.f(this.i, f4s0Var.i) && epx.f(this.j, f4s0Var.j) && this.k == f4s0Var.k && epx.f(this.l, f4s0Var.l) && epx.f(this.m, f4s0Var.m) && epx.f(this.n, f4s0Var.n) && epx.f(this.o, f4s0Var.o) && this.p == f4s0Var.p && this.q == f4s0Var.q;
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        int b = jq.b(this.l, (Byte.hashCode(this.k) + ((this.j.hashCode() + e630.b(this.h.hashCode() * 31, 31, this.i)) * 31)) * 31, 31);
        String str = this.m;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.n;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.o;
        return Integer.hashCode(0) + shy.a(this.q, shy.a(this.p, (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoAutoPlayWithFooterHolderUiDto(entry=");
        sb.append(this.h);
        sb.append(", rootEntry=");
        sb.append(this.i);
        sb.append(", baseVideoAutoplayHolderUiDto=");
        sb.append(this.j);
        sb.append(", flags=");
        sb.append((int) this.k);
        sb.append(", video=");
        sb.append(this.l);
        sb.append(", title=");
        sb.append(this.m);
        sb.append(", subtitle=");
        sb.append(this.n);
        sb.append(", description=");
        sb.append(this.o);
        sb.append(", views=");
        sb.append(this.p);
        sb.append(", videoViewType=");
        return h5s.c(this.q, ", seqId=0)", sb);
    }
}
