package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.VideoAttachment;

/* compiled from: VideoAttachmentContext.kt */
/* loaded from: classes4.dex */
public final class p2s0 {
    public final NewsEntry a;
    public final NewsEntry b;
    public final VideoAttachment c;
    public final int d;
    public final s1c0 e;

    public p2s0(NewsEntry newsEntry, NewsEntry newsEntry2, VideoAttachment videoAttachment, int i, s1c0 s1c0Var) {
        this.a = newsEntry;
        this.b = newsEntry2;
        this.c = videoAttachment;
        this.d = i;
        this.e = s1c0Var;
    }

    public final VideoAttachment a() {
        return this.c;
    }

    public final NewsEntry b() {
        return this.a;
    }

    public final NewsEntry c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2s0)) {
            return false;
        }
        p2s0 p2s0Var = (p2s0) obj;
        return epx.f(this.a, p2s0Var.a) && epx.f(this.b, p2s0Var.b) && epx.f(this.c, p2s0Var.c) && this.d == p2s0Var.d && epx.f(this.e, p2s0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + shy.a(this.d, (this.c.hashCode() + e630.b(this.a.hashCode() * 31, 31, this.b)) * 31, 31);
    }

    public final String toString() {
        return "VideoAttachmentContext(entry=" + this.a + ", rootEntry=" + this.b + ", attachment=" + this.c + ", viewType=" + this.d + ", displayContext=" + this.e + ')';
    }
}
