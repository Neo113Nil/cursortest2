package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.AlbumAttachment;

/* compiled from: AlbumAttachmentContext.kt */
/* loaded from: classes4.dex */
public final class bd1 {
    public final NewsEntry a;
    public final NewsEntry b;
    public final AlbumAttachment c;
    public final xah0 d;

    public bd1(NewsEntry newsEntry, NewsEntry newsEntry2, AlbumAttachment albumAttachment, xah0 xah0Var) {
        this.a = newsEntry;
        this.b = newsEntry2;
        this.c = albumAttachment;
        this.d = xah0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bd1)) {
            return false;
        }
        bd1 bd1Var = (bd1) obj;
        return epx.f(this.a, bd1Var.a) && epx.f(this.b, bd1Var.b) && epx.f(this.c, bd1Var.c) && epx.f(this.d, bd1Var.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + e630.b(this.a.hashCode() * 31, 31, this.b)) * 31;
        xah0 xah0Var = this.d;
        return hashCode + (xah0Var == null ? 0 : xah0Var.hashCode());
    }

    public final String toString() {
        return "AlbumAttachmentContext(entry=" + this.a + ", rootEntry=" + this.b + ", attachment=" + this.c + ", screen=" + this.d + ')';
    }
}
