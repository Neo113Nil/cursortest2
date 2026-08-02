package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.VideoAttachment;

/* compiled from: VideoAutoPlayContext.kt */
/* loaded from: classes4.dex */
public final class p3s0 {
    public final NewsEntry a;
    public final NewsEntry b;
    public final VideoAttachment c;
    public final int d;
    public final s1c0 e;

    public p3s0(NewsEntry newsEntry, NewsEntry newsEntry2, VideoAttachment videoAttachment, int i, s1c0 s1c0Var) {
        this.a = newsEntry;
        this.b = newsEntry2;
        this.c = videoAttachment;
        this.d = i;
        this.e = s1c0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p3s0)) {
            return false;
        }
        p3s0 p3s0Var = (p3s0) obj;
        return epx.f(this.a, p3s0Var.a) && epx.f(this.b, p3s0Var.b) && epx.f(this.c, p3s0Var.c) && this.d == p3s0Var.d && epx.f(this.e, p3s0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + shy.a(this.d, (this.c.hashCode() + e630.b(this.a.hashCode() * 31, 31, this.b)) * 31, 31);
    }

    public final String toString() {
        return "VideoAutoPlayContext(entry=" + this.a + ", rootEntry=" + this.b + ", attachment=" + this.c + ", viewType=" + this.d + ", displayContext=" + this.e + ')';
    }
}
