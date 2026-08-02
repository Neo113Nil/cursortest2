package xsna;

import com.vk.dto.common.Image;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.AlbumAttachment;

/* compiled from: RestrictedBlurredAlbumHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class gcg0 extends ol60 {
    public final NewsEntry h;
    public final NewsEntry i;
    public final AlbumAttachment j;
    public final String k;
    public final int l;
    public final Image m;
    public final boolean n;
    public final boolean o;

    public gcg0(NewsEntry newsEntry, NewsEntry newsEntry2, AlbumAttachment albumAttachment, String str, int i, Image image, boolean z, boolean z2) {
        super(111, 0, 0, 0, null);
        this.h = newsEntry;
        this.i = newsEntry2;
        this.j = albumAttachment;
        this.k = str;
        this.l = i;
        this.m = image;
        this.n = z;
        this.o = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gcg0)) {
            return false;
        }
        gcg0 gcg0Var = (gcg0) obj;
        return epx.f(this.h, gcg0Var.h) && epx.f(this.i, gcg0Var.i) && epx.f(this.j, gcg0Var.j) && epx.f(this.k, gcg0Var.k) && this.l == gcg0Var.l && epx.f(this.m, gcg0Var.m) && this.n == gcg0Var.n && this.o == gcg0Var.o;
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        int hashCode = (this.j.hashCode() + e630.b(this.h.hashCode() * 31, 31, this.i)) * 31;
        String str = this.k;
        return Integer.hashCode(0) + qoy.b(qoy.b(fq.b(this.m, shy.a(this.l, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31, this.n), 31, this.o);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RestrictedBlurredAlbumHolderUiDto(entry=");
        sb.append(this.h);
        sb.append(", rootEntry=");
        sb.append(this.i);
        sb.append(", attachment=");
        sb.append(this.j);
        sb.append(", title=");
        sb.append(this.k);
        sb.append(", size=");
        sb.append(this.l);
        sb.append(", image=");
        sb.append(this.m);
        sb.append(", hasRestriction=");
        sb.append(this.n);
        sb.append(", hasBlurredRestriction=");
        return n23.b(sb, this.o, ", seqId=0)");
    }
}
