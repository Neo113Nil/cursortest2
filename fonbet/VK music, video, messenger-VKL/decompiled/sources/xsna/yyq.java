package xsna;

import xsna.q630;

/* compiled from: FeedFooter.kt */
/* loaded from: classes18.dex */
public final class yyq {
    public final wh50 a;

    public yyq(String str) {
        this.a = androidx.compose.runtime.k.b(str);
    }

    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1303360920);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1303360920, i2, -1, "com.vk.feed.design.compose.newsfeed.footer.FeedFooter.ReactionsOverlay.Content (FeedFooter.kt:389)");
            }
            q630.a aVar2 = q630.a.a;
            xzq.b((String) ((zak0) this.a).getValue(), aVar2, 0L, 0L, M, (i2 << 3) & 112);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = aVar2;
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ubh(this, q630Var, i, 2);
        }
    }
}
