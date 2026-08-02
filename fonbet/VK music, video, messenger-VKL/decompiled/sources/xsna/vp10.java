package xsna;

import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.List;

/* compiled from: MediaAttachmentContext.kt */
/* loaded from: classes4.dex */
public final class vp10 {
    public final NewsEntry a;
    public final NewsEntry b;
    public final PhotoAttachment c;
    public final int d;
    public final int e;
    public final List<EntryAttachment> f;
    public final xah0 g;

    public vp10(NewsEntry newsEntry, NewsEntry newsEntry2, PhotoAttachment photoAttachment, int i, int i2, List<EntryAttachment> list, xah0 xah0Var) {
        this.a = newsEntry;
        this.b = newsEntry2;
        this.c = photoAttachment;
        this.d = i;
        this.e = i2;
        this.f = list;
        this.g = xah0Var;
    }

    public final PhotoAttachment a() {
        return this.c;
    }

    public final NewsEntry b() {
        return this.a;
    }

    public final NewsEntry c() {
        return this.b;
    }

    public final int d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vp10)) {
            return false;
        }
        vp10 vp10Var = (vp10) obj;
        return epx.f(this.a, vp10Var.a) && epx.f(this.b, vp10Var.b) && epx.f(this.c, vp10Var.c) && this.d == vp10Var.d && this.e == vp10Var.e && epx.f(this.f, vp10Var.f) && epx.f(this.g, vp10Var.g);
    }

    public final int hashCode() {
        int a = fw3.a(shy.a(this.e, shy.a(this.d, (this.c.hashCode() + e630.b(this.a.hashCode() * 31, 31, this.b)) * 31, 31), 31), 31, this.f);
        xah0 xah0Var = this.g;
        return a + (xah0Var == null ? 0 : xah0Var.hashCode());
    }

    public final String toString() {
        return "MediaAttachmentContext(entry=" + this.a + ", rootEntry=" + this.b + ", attachment=" + this.c + ", viewType=" + this.d + ", index=" + this.e + ", onMediaAttachments=" + this.f + ", screen=" + this.g + ')';
    }
}
