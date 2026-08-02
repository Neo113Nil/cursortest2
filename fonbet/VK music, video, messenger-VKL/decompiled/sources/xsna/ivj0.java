package xsna;

import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.photo.PhotoTag;
import com.vk.dto.tags.Tag;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.List;

/* compiled from: SinglePhotoHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class ivj0 extends ol60 {
    public final NewsEntry h;
    public final NewsEntry i;
    public final PhotoAttachment j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final boolean o;
    public final List<PhotoTag> p;
    public final List<Tag> q;
    public final boolean r;
    public final Image s;
    public final int t;
    public final int u;
    public final List<ImageSize> v;
    public final Float w;

    public ivj0(NewsEntry newsEntry, NewsEntry newsEntry2, PhotoAttachment photoAttachment, int i, int i2, int i3, int i4, boolean z, List list, List list2, boolean z2, Image image, int i5, int i6, List list3, Float f) {
        super(i, 0, 0, 0, null);
        this.h = newsEntry;
        this.i = newsEntry2;
        this.j = photoAttachment;
        this.k = i;
        this.l = i2;
        this.m = i3;
        this.n = i4;
        this.o = z;
        this.p = list;
        this.q = list2;
        this.r = z2;
        this.s = image;
        this.t = i5;
        this.u = i6;
        this.v = list3;
        this.w = f;
    }

    public static ivj0 i(ivj0 ivj0Var, PhotoAttachment photoAttachment) {
        NewsEntry newsEntry = ivj0Var.h;
        NewsEntry newsEntry2 = ivj0Var.i;
        int i = ivj0Var.k;
        int i2 = ivj0Var.l;
        int i3 = ivj0Var.m;
        ivj0Var.getClass();
        int i4 = ivj0Var.n;
        boolean z = ivj0Var.o;
        List<PhotoTag> list = ivj0Var.p;
        List<Tag> list2 = ivj0Var.q;
        boolean z2 = ivj0Var.r;
        Image image = ivj0Var.s;
        int i5 = ivj0Var.t;
        int i6 = ivj0Var.u;
        List<ImageSize> list3 = ivj0Var.v;
        Float f = ivj0Var.w;
        ivj0Var.getClass();
        ivj0Var.getClass();
        return new ivj0(newsEntry, newsEntry2, photoAttachment, i, i2, i3, i4, z, list, list2, z2, image, i5, i6, list3, f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ivj0)) {
            return false;
        }
        ivj0 ivj0Var = (ivj0) obj;
        return epx.f(this.h, ivj0Var.h) && epx.f(this.i, ivj0Var.i) && epx.f(this.j, ivj0Var.j) && this.k == ivj0Var.k && this.l == ivj0Var.l && this.m == ivj0Var.m && this.n == ivj0Var.n && this.o == ivj0Var.o && epx.f(this.p, ivj0Var.p) && epx.f(this.q, ivj0Var.q) && this.r == ivj0Var.r && epx.f(this.s, ivj0Var.s) && this.t == ivj0Var.t && this.u == ivj0Var.u && epx.f(this.v, ivj0Var.v) && epx.f(this.w, ivj0Var.w);
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        int a = fw3.a(shy.a(this.u, shy.a(this.t, fq.b(this.s, qoy.b(fw3.a(fw3.a(qoy.b(shy.a(this.n, shy.a(0, shy.a(this.m, shy.a(this.l, shy.a(this.k, (this.j.hashCode() + e630.b(this.h.hashCode() * 31, 31, this.i)) * 31, 31), 31), 31), 31), 31), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31), 31), 31), 31, this.v);
        Float f = this.w;
        return Integer.hashCode(0) + ((a + (f == null ? 0 : f.hashCode())) * 31);
    }

    public final String toString() {
        return "SinglePhotoHolderUiDto(entry=" + this.h + ", rootEntry=" + this.i + ", attachment=" + this.j + ", photoViewType=" + this.k + ", attachedGoodsIconEndMargin=" + this.l + ", attachedGoodsIconBottomMargin=" + this.m + ", marketLayoutIconEndMargin=0, marketLayoutIconBottomPadding=" + this.n + ", isPhotoZoomAnimationEnabled=" + this.o + ", tags=" + this.p + ", taggedGoods=" + this.q + ", hasTags=" + this.r + ", image=" + this.s + ", sizeWidth=" + this.t + ", sizeHeight=" + this.u + ", images=" + this.v + ", ratio=" + this.w + ", seqId=0)";
    }
}
