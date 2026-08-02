package xsna;

import com.vk.feed.core.models.news.NewsEntry;

/* compiled from: ClipVideoHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class efd extends ol60 {
    public final NewsEntry h;
    public final NewsEntry i;
    public final jq6 j;
    public final float k;
    public final boolean l;
    public final int m;
    public final String n;
    public final rmc o;

    public efd(NewsEntry newsEntry, NewsEntry newsEntry2, jq6 jq6Var, float f, boolean z, int i, String str, rmc rmcVar) {
        super(i, 0, 0, 0, null);
        this.h = newsEntry;
        this.i = newsEntry2;
        this.j = jq6Var;
        this.k = f;
        this.l = z;
        this.m = i;
        this.n = str;
        this.o = rmcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof efd)) {
            return false;
        }
        efd efdVar = (efd) obj;
        return epx.f(this.h, efdVar.h) && epx.f(this.i, efdVar.i) && epx.f(this.j, efdVar.j) && Float.compare(this.k, efdVar.k) == 0 && this.l == efdVar.l && this.m == efdVar.m && epx.f(this.n, efdVar.n) && epx.f(this.o, efdVar.o);
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        int a = shy.a(this.m, qoy.b(io.reactivex.rxjava3.subjects.b.a(this.k, (this.j.hashCode() + e630.b(this.h.hashCode() * 31, 31, this.i)) * 31, 31), 31, this.l), 31);
        String str = this.n;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        rmc rmcVar = this.o;
        return Integer.hashCode(0) + ((hashCode + (rmcVar == null ? 0 : rmcVar.hashCode())) * 31);
    }

    public final String toString() {
        return "ClipVideoHolderUiDto(entry=" + this.h + ", rootEntry=" + this.i + ", baseVideoAutoplayHolderUiDto=" + this.j + ", videoRatio=" + this.k + ", shouldShowBanner=" + this.l + ", clipViewType=" + this.m + ", trackCode=" + this.n + ", clipCarouselAttachesParams=" + this.o + ", seqId=0)";
    }
}
