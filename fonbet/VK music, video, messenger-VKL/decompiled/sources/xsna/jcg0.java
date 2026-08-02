package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.PhotoAttachment;

/* compiled from: RestrictedBlurredPhotoHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class jcg0 extends ol60 {
    public final NewsEntry h;
    public final NewsEntry i;
    public final PhotoAttachment j;
    public final int k;
    public final int l;
    public final String m;
    public final boolean n;
    public final String o;
    public final String p;
    public final String q;
    public final boolean r;
    public final int s;
    public final int t;
    public final int u;

    public jcg0(NewsEntry newsEntry, NewsEntry newsEntry2, PhotoAttachment photoAttachment, int i, int i2, String str, boolean z, String str2, String str3, String str4, boolean z2, int i3, int i4, int i5) {
        super(i5, 0, 0, 0, null);
        this.h = newsEntry;
        this.i = newsEntry2;
        this.j = photoAttachment;
        this.k = i;
        this.l = i2;
        this.m = str;
        this.n = z;
        this.o = str2;
        this.p = str3;
        this.q = str4;
        this.r = z2;
        this.s = i3;
        this.t = i4;
        this.u = i5;
    }

    public static jcg0 i(jcg0 jcg0Var, PhotoAttachment photoAttachment, int i, int i2, int i3) {
        NewsEntry newsEntry = jcg0Var.h;
        NewsEntry newsEntry2 = jcg0Var.i;
        PhotoAttachment photoAttachment2 = (i3 & 4) != 0 ? jcg0Var.j : photoAttachment;
        int i4 = jcg0Var.k;
        PhotoAttachment photoAttachment3 = photoAttachment2;
        int i5 = jcg0Var.l;
        String str = jcg0Var.m;
        boolean z = jcg0Var.n;
        String str2 = jcg0Var.o;
        String str3 = jcg0Var.p;
        String str4 = jcg0Var.q;
        boolean z2 = jcg0Var.r;
        int i6 = (i3 & 2048) != 0 ? jcg0Var.s : i;
        int i7 = (i3 & 4096) != 0 ? jcg0Var.t : i2;
        int i8 = jcg0Var.u;
        jcg0Var.getClass();
        jcg0Var.getClass();
        return new jcg0(newsEntry, newsEntry2, photoAttachment3, i4, i5, str, z, str2, str3, str4, z2, i6, i7, i8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jcg0)) {
            return false;
        }
        jcg0 jcg0Var = (jcg0) obj;
        return epx.f(this.h, jcg0Var.h) && epx.f(this.i, jcg0Var.i) && epx.f(this.j, jcg0Var.j) && this.k == jcg0Var.k && this.l == jcg0Var.l && epx.f(this.m, jcg0Var.m) && this.n == jcg0Var.n && epx.f(this.o, jcg0Var.o) && epx.f(this.p, jcg0Var.p) && epx.f(this.q, jcg0Var.q) && this.r == jcg0Var.r && this.s == jcg0Var.s && this.t == jcg0Var.t && this.u == jcg0Var.u;
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        int a = shy.a(this.l, shy.a(this.k, (this.j.hashCode() + e630.b(this.h.hashCode() * 31, 31, this.i)) * 31, 31), 31);
        String str = this.m;
        int b = qoy.b((a + (str == null ? 0 : str.hashCode())) * 31, 31, this.n);
        String str2 = this.o;
        int hashCode = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.p;
        int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.q;
        return Integer.hashCode(0) + shy.a(this.u, shy.a(this.t, shy.a(this.s, qoy.b((hashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.r), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RestrictedBlurredPhotoHolderUiDto(entry=");
        sb.append(this.h);
        sb.append(", rootEntry=");
        sb.append(this.i);
        sb.append(", attachment=");
        sb.append(this.j);
        sb.append(", sizeWidth=");
        sb.append(this.k);
        sb.append(", sizeHeight=");
        sb.append(this.l);
        sb.append(", thumbUrl=");
        sb.append(this.m);
        sb.append(", hasBlurredRestriction=");
        sb.append(this.n);
        sb.append(", restrictionTitle=");
        sb.append(this.o);
        sb.append(", restrictionButtonTitle=");
        sb.append(this.p);
        sb.append(", restrictedViewUrl=");
        sb.append(this.q);
        sb.append(", isAttachedGoodsViewVisible=");
        sb.append(this.r);
        sb.append(", attachedGoodsIconEndMargin=");
        sb.append(this.s);
        sb.append(", attachedGoodsIconBottomMargin=");
        sb.append(this.t);
        sb.append(", photoViewType=");
        return h5s.c(this.u, ", seqId=0)", sb);
    }
}
