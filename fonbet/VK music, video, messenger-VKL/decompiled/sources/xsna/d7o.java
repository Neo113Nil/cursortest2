package xsna;

import android.graphics.PointF;
import com.vk.feed.core.models.news.NewsEntry;

/* compiled from: DoubleTapLikeAction.kt */
/* loaded from: classes4.dex */
public final class d7o extends gux {
    public final g7o a;
    public final NewsEntry b;
    public final String c;
    public final PointF d;

    public d7o(g7o g7oVar, NewsEntry newsEntry, String str, PointF pointF) {
        this.a = g7oVar;
        this.b = newsEntry;
        this.c = str;
        this.d = pointF;
    }

    @Override // xsna.gux
    public final void a() {
        g7o g7oVar = this.a;
        g7oVar.o = this.b;
        g7oVar.q = this.d;
        g7oVar.l();
    }
}
