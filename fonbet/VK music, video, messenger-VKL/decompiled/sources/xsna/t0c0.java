package xsna;

import com.vk.common.links.AwayLink;
import com.vk.feed.core.models.news.NewsEntry;
import xsna.qjc;
import xsna.xa60;

/* compiled from: PostCensoredSpanClickListener.kt */
/* loaded from: classes4.dex */
public final class t0c0 implements qjc.a {
    public final p870 b;
    public final NewsEntry c;

    public t0c0(p870 p870Var, NewsEntry newsEntry) {
        this.b = p870Var;
        this.c = newsEntry;
    }

    @Override // xsna.qjc.a
    public final void I(AwayLink awayLink) {
        this.b.e(147, new xa60(this.c, (xa60.a) null, 6));
    }
}
