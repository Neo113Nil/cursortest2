package xsna;

import com.vk.comments.impl.marketitem.commentlist.presentation.MarketItemCommentsFragment;
import xsna.k010;
import xsna.xn50;

/* compiled from: MarketItemCommentsFragment.kt */
/* loaded from: classes17.dex */
public final class w010 implements i3g0 {
    public final /* synthetic */ MarketItemCommentsFragment b;

    public w010(MarketItemCommentsFragment marketItemCommentsFragment) {
        this.b = marketItemCommentsFragment;
    }

    @Override // xsna.i3g0
    public final void a(int i) {
        eeg eegVar = this.b.a0;
        if (eegVar != null) {
            eegVar.d(i);
        }
    }

    @Override // xsna.i3g0
    public final void e() {
        MarketItemCommentsFragment marketItemCommentsFragment = this.b;
        eeg eegVar = marketItemCommentsFragment.a0;
        if (eegVar != null) {
            eegVar.j();
        }
        xn50.a.c(marketItemCommentsFragment, k010.a.b);
    }

    @Override // xsna.i3g0
    public final void f() {
        MarketItemCommentsFragment marketItemCommentsFragment = this.b;
        eeg eegVar = marketItemCommentsFragment.a0;
        xn50.a.c(marketItemCommentsFragment, new k010.e.c(eegVar != null ? eegVar.c() : null));
    }
}
