package xsna;

import com.vk.comments.core.BoardComment;
import com.vk.comments.impl.marketitem.commentlist.presentation.MarketItemCommentsFragment;
import xsna.k010;
import xsna.xn50;

/* compiled from: MarketItemCommentsFragment.kt */
/* loaded from: classes17.dex */
public final class v010 implements bgg {
    public final /* synthetic */ MarketItemCommentsFragment a;

    public v010(MarketItemCommentsFragment marketItemCommentsFragment) {
        this.a = marketItemCommentsFragment;
    }

    @Override // xsna.bgg
    public final void a(iag iagVar) {
        xn50.a.c(this.a, new k010.g((BoardComment) iagVar));
    }

    @Override // xsna.bgg
    public final void b(iag iagVar) {
        xn50.a.c(this.a, new k010.e.b(iagVar.getId()));
    }

    @Override // xsna.bgg
    public final void c(iag iagVar) {
        xn50.a.c(this.a, new k010.e.a(iagVar.getId()));
    }
}
