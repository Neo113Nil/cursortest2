package xsna;

import com.vk.dto.common.ImageSize;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.AlbumAttachment;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PrimaryAlbumHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class s6d0 extends ol60 {
    public final NewsEntry h;
    public final NewsEntry i;
    public final AlbumAttachment j;
    public final String k;
    public final int l;
    public final int m;
    public final int n;
    public final List<ImageSize> o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final String s;
    public final int t;
    public final Float u;

    public s6d0(NewsEntry newsEntry, NewsEntry newsEntry2, AlbumAttachment albumAttachment, String str, int i, int i2, int i3, ArrayList arrayList, boolean z, boolean z2, boolean z3, String str2, int i4, Float f) {
        super(Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE, 0, 0, 0, null);
        this.h = newsEntry;
        this.i = newsEntry2;
        this.j = albumAttachment;
        this.k = str;
        this.l = i;
        this.m = i2;
        this.n = i3;
        this.o = arrayList;
        this.p = z;
        this.q = z2;
        this.r = z3;
        this.s = str2;
        this.t = i4;
        this.u = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6d0)) {
            return false;
        }
        s6d0 s6d0Var = (s6d0) obj;
        return epx.f(this.h, s6d0Var.h) && epx.f(this.i, s6d0Var.i) && epx.f(this.j, s6d0Var.j) && epx.f(this.k, s6d0Var.k) && this.l == s6d0Var.l && this.m == s6d0Var.m && this.n == s6d0Var.n && epx.f(this.o, s6d0Var.o) && this.p == s6d0Var.p && this.q == s6d0Var.q && this.r == s6d0Var.r && epx.f(this.s, s6d0Var.s) && this.t == s6d0Var.t && epx.f(this.u, s6d0Var.u);
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        int hashCode = (this.j.hashCode() + e630.b(this.h.hashCode() * 31, 31, this.i)) * 31;
        String str = this.k;
        int a = shy.a(this.n, shy.a(this.m, shy.a(this.l, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31);
        List<ImageSize> list = this.o;
        int b = qoy.b(qoy.b(qoy.b((a + (list == null ? 0 : list.hashCode())) * 31, 31, this.p), 31, this.q), 31, this.r);
        String str2 = this.s;
        int a2 = shy.a(this.t, (b + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        Float f = this.u;
        return Integer.hashCode(0) + ((a2 + (f == null ? 0 : f.hashCode())) * 31);
    }

    public final String toString() {
        return "PrimaryAlbumHolderUiDto(entry=" + this.h + ", rootEntry=" + this.i + ", attachment=" + this.j + ", title=" + this.k + ", size=" + this.l + ", width=" + this.m + ", height=" + this.n + ", remoteImages=" + this.o + ", hasRestriction=" + this.p + ", hasBlurredRestriction=" + this.q + ", hasOverlay=" + this.r + ", restrictionTitle=" + this.s + ", restrictionIconResId=" + this.t + ", ratio=" + this.u + ", seqId=0)";
    }
}
