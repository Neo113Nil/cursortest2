package xsna;

import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vk.feed.core.models.news.NewsEntry;

/* compiled from: MyTargetNativeAdPrefetchHelper.kt */
/* loaded from: classes4.dex */
public final class cs50 extends de {
    public final zix b;
    public final mr50 c = new mr50();

    public cs50(zix zixVar) {
        this.b = zixVar;
    }

    @Override // xsna.de
    public final int b0(u1c0 u1c0Var) {
        return 0;
    }

    @Override // xsna.de
    public final /* bridge */ /* synthetic */ String d0(u1c0 u1c0Var, int i) {
        return null;
    }

    @Override // xsna.de
    public final io.reactivex.rxjava3.core.q e0(String str, NewsEntry newsEntry) {
        if (!(newsEntry instanceof MyTargetNativeAdEntry)) {
            return null;
        }
        io.reactivex.rxjava3.internal.operators.single.b bVar = new io.reactivex.rxjava3.internal.operators.single.b(new k5g((MyTargetNativeAdEntry) newsEntry, this.b));
        asu0 asu0Var = asu0.a;
        asu0Var.getClass();
        return new io.reactivex.rxjava3.internal.operators.mixed.q(bVar.q(asu0.i()).m(asu0Var.d()), new qj4(new td0(28, newsEntry, this), 22));
    }

    @Override // xsna.de
    public final io.reactivex.rxjava3.core.q<NewsEntry> f0(u1c0 u1c0Var) {
        return e0(u1c0Var.l, u1c0Var.b);
    }

    @Override // xsna.de
    public final boolean l0() {
        return true;
    }
}
