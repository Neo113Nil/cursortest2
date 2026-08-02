package xsna;

import com.vk.feed.core.models.news.NewsEntry;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class r2n implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ NewsEntry c;

    public /* synthetic */ r2n(int i, NewsEntry newsEntry) {
        this.b = i;
        this.c = newsEntry;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        u1c0 u1c0Var = (u1c0) obj;
        switch (this.b) {
            case 0:
                if (u1c0Var instanceof k2n) {
                    return lbs.c(u1c0Var, null, null, g2n.a(this.c, ((k2n) u1c0Var).s), 3);
                }
                return u1c0Var;
            default:
                return Boolean.valueOf(u1c0Var.c == 78 && u1c0Var.a == this.c);
        }
    }
}
