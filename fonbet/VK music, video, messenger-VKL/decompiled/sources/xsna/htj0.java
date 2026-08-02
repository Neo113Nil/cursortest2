package xsna;

import com.vk.dto.common.Image;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.AlbumAttachment;

/* compiled from: SingleAlbumHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class htj0 extends ol60 {
    public final NewsEntry h;
    public final NewsEntry i;
    public final AlbumAttachment j;
    public final String k;
    public final int l;
    public final Image m;
    public final boolean n;
    public final boolean o;

    public htj0(NewsEntry newsEntry, NewsEntry newsEntry2, AlbumAttachment albumAttachment, String str, int i, Image image, boolean z, boolean z2) {
        super(52, 0, 0, 0, null);
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
        if (!(obj instanceof htj0)) {
            return false;
        }
        htj0 htj0Var = (htj0) obj;
        return epx.f(this.h, htj0Var.h) && epx.f(this.i, htj0Var.i) && epx.f(this.j, htj0Var.j) && epx.f(this.k, htj0Var.k) && this.l == htj0Var.l && epx.f(this.m, htj0Var.m) && this.n == htj0Var.n && this.o == htj0Var.o;
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
        StringBuilder sb = new StringBuilder("SingleAlbumHolderUiDto(entry=");
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
