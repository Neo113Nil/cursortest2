package xsna;

import com.vk.common.links.AwayLink;
import com.vk.feed.core.models.news.NewsEntry;
import xsna.qjc;
import xsna.xa60;

/* compiled from: CommentCensoredSpanClickListener.kt */
/* loaded from: classes4.dex */
public final class vag implements qjc.a {
    public final p870 b;
    public final xa60.a c;

    public vag(p870 p870Var, xa60.a aVar) {
        this.b = p870Var;
        this.c = aVar;
    }

    @Override // xsna.qjc.a
    public final void I(AwayLink awayLink) {
        this.b.e(147, new xa60((NewsEntry) null, this.c, 5));
    }
}
