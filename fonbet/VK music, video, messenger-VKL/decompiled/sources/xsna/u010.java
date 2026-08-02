package xsna;

import com.vk.comments.core.BoardComment;
import com.vk.comments.impl.marketitem.commentlist.presentation.MarketItemCommentsFragment;
import xsna.k010;
import xsna.xn50;

/* compiled from: MarketItemCommentsFragment.kt */
/* loaded from: classes17.dex */
public final class u010 implements ofg {
    public final /* synthetic */ MarketItemCommentsFragment a;

    public u010(MarketItemCommentsFragment marketItemCommentsFragment) {
        this.a = marketItemCommentsFragment;
    }

    @Override // xsna.ofg
    public final void a() {
        l010 l010Var = this.a.S;
        if (l010Var != null) {
            l010Var.notifyDataSetChanged();
        }
    }

    @Override // xsna.ofg
    public final void b(boolean z) {
        k010.a aVar = k010.a.b;
        MarketItemCommentsFragment marketItemCommentsFragment = this.a;
        xn50.a.c(marketItemCommentsFragment, aVar);
        if (z) {
            xn50.a.c(marketItemCommentsFragment, k010.j.b);
        }
    }

    @Override // xsna.ofg
    public final void c(iag iagVar) {
        xn50.a.c(this.a, new k010.f((BoardComment) iagVar));
    }

    @Override // xsna.ofg
    public final void d(iag iagVar) {
        k010.b bVar = new k010.b((BoardComment) iagVar);
        MarketItemCommentsFragment marketItemCommentsFragment = this.a;
        marketItemCommentsFragment.getClass();
        xn50.a.c(marketItemCommentsFragment, bVar);
    }

    @Override // xsna.ofg
    public final void e() {
        k010.a aVar = k010.a.b;
        MarketItemCommentsFragment marketItemCommentsFragment = this.a;
        marketItemCommentsFragment.getClass();
        xn50.a.c(marketItemCommentsFragment, aVar);
        marketItemCommentsFragment.getClass();
        xn50.a.c(marketItemCommentsFragment, k010.j.b);
    }
}
