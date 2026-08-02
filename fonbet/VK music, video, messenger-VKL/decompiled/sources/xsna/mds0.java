package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.VideoAttachment;

/* compiled from: VideoContext.kt */
/* loaded from: classes4.dex */
public final class mds0 {
    public final NewsEntry a;
    public final NewsEntry b;
    public final VideoAttachment c;
    public final int d;

    public mds0(int i, NewsEntry newsEntry, NewsEntry newsEntry2, VideoAttachment videoAttachment) {
        this.a = newsEntry;
        this.b = newsEntry2;
        this.c = videoAttachment;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mds0)) {
            return false;
        }
        mds0 mds0Var = (mds0) obj;
        return epx.f(this.a, mds0Var.a) && epx.f(this.b, mds0Var.b) && epx.f(this.c, mds0Var.c) && this.d == mds0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ((this.c.hashCode() + e630.b(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoContext(entry=");
        sb.append(this.a);
        sb.append(", rootEntry=");
        sb.append(this.b);
        sb.append(", attachment=");
        sb.append(this.c);
        sb.append(", viewType=");
        return vu5.b(sb, this.d, ')');
    }
}
