package xsna;

import com.vk.dto.common.Image;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.PhotoAttachment;

/* compiled from: RestrictedPhotoHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class ocg0 extends ol60 {
    public final NewsEntry h;
    public final NewsEntry i;
    public final PhotoAttachment j;
    public final int k;
    public final Image l;
    public final String m;

    public ocg0(NewsEntry newsEntry, NewsEntry newsEntry2, PhotoAttachment photoAttachment, int i, Image image, String str) {
        super(i, 0, 0, 0, null);
        this.h = newsEntry;
        this.i = newsEntry2;
        this.j = photoAttachment;
        this.k = i;
        this.l = image;
        this.m = str;
    }

    public static ocg0 i(ocg0 ocg0Var, PhotoAttachment photoAttachment) {
        NewsEntry newsEntry = ocg0Var.h;
        NewsEntry newsEntry2 = ocg0Var.i;
        int i = ocg0Var.k;
        Image image = ocg0Var.l;
        String str = ocg0Var.m;
        ocg0Var.getClass();
        ocg0Var.getClass();
        return new ocg0(newsEntry, newsEntry2, photoAttachment, i, image, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ocg0)) {
            return false;
        }
        ocg0 ocg0Var = (ocg0) obj;
        return epx.f(this.h, ocg0Var.h) && epx.f(this.i, ocg0Var.i) && epx.f(this.j, ocg0Var.j) && this.k == ocg0Var.k && epx.f(this.l, ocg0Var.l) && epx.f(this.m, ocg0Var.m);
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        int b = fq.b(this.l, shy.a(this.k, (this.j.hashCode() + e630.b(this.h.hashCode() * 31, 31, this.i)) * 31, 31), 31);
        String str = this.m;
        return Integer.hashCode(0) + ((b + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RestrictedPhotoHolderUiDto(entry=");
        sb.append(this.h);
        sb.append(", rootEntry=");
        sb.append(this.i);
        sb.append(", attachment=");
        sb.append(this.j);
        sb.append(", photoViewType=");
        sb.append(this.k);
        sb.append(", image=");
        sb.append(this.l);
        sb.append(", restrictionTitle=");
        return i5s.a(sb, this.m, ", seqId=0)");
    }
}
