package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.PollAttachment;

/* compiled from: PollAttachmentV3HolderUiDto.kt */
/* loaded from: classes4.dex */
public final class xmb0 extends ol60 {
    public final NewsEntry h;
    public final NewsEntry i;
    public final PollAttachment j;
    public final int k;

    public xmb0(NewsEntry newsEntry, NewsEntry newsEntry2, PollAttachment pollAttachment, int i) {
        super(343, 0, 0, 0, null);
        this.h = newsEntry;
        this.i = newsEntry2;
        this.j = pollAttachment;
        this.k = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xmb0)) {
            return false;
        }
        xmb0 xmb0Var = (xmb0) obj;
        return epx.f(this.h, xmb0Var.h) && epx.f(this.i, xmb0Var.i) && epx.f(this.j, xmb0Var.j) && this.k == xmb0Var.k;
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + shy.a(this.k, (this.j.f.hashCode() + e630.b(this.h.hashCode() * 31, 31, this.i)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PollAttachmentV3HolderUiDto(entry=");
        sb.append(this.h);
        sb.append(", rootEntry=");
        sb.append(this.i);
        sb.append(", attachment=");
        sb.append(this.j);
        sb.append(", title=");
        return h5s.c(this.k, ", seqId=0)", sb);
    }
}
