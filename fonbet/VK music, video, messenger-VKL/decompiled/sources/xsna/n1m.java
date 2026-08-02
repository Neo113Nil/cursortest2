package xsna;

import com.vk.clips.sdk.shared.item.static_ads.StaticAdsItemPatch;
import com.vk.clips.sdk.shared.item.static_ads.a;
import kotlin.NoWhenBranchMatchedException;
import xsna.mwk0;
import xsna.vvk0;
import xsna.wk50;
import xsna.yt0;

/* compiled from: DescriptionActionApplier.kt */
/* loaded from: classes17.dex */
public final class n1m implements oj50<mwk0, com.vk.clips.sdk.shared.item.static_ads.a, StaticAdsItemPatch> {
    public final f4z a;
    public final xd40 b;

    public n1m(f4z f4zVar, xd40 xd40Var) {
        this.a = f4zVar;
        this.b = xd40Var;
    }

    @Override // xsna.oj50
    public final void a(wk50.a aVar, km50 km50Var, kj50 kj50Var) {
        mwk0 mwk0Var = (mwk0) km50Var;
        com.vk.clips.sdk.shared.item.static_ads.a aVar2 = (com.vk.clips.sdk.shared.item.static_ads.a) kj50Var;
        if ((mwk0Var instanceof mwk0.a) && (aVar2 instanceof a.b)) {
            a.b bVar = (a.b) aVar2;
            if (bVar instanceof a.b.C0690b) {
                this.b.invoke(new yt0.f(new zt0(((mwk0.a) mwk0Var).b.h, null)));
                aVar.b(StaticAdsItemPatch.c.b.b);
            } else if (bVar instanceof a.b.C0689a) {
                aVar.b(StaticAdsItemPatch.c.a.b);
            } else {
                if (!(bVar instanceof a.b.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.a.b(new vvk0.b(((a.b.c) aVar2).b));
            }
        }
    }

    @Override // xsna.oj50
    public final void onDestroy() {
    }
}
