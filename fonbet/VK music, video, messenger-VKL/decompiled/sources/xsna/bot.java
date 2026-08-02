package xsna;

import com.vk.clips.sdk.shared.item.static_ads.StaticAdsItemPatch;
import com.vk.clips.sdk.shared.item.static_ads.a;
import com.vk.clips.sdk.shared.item.static_ads.events.b;
import kotlin.NoWhenBranchMatchedException;
import xsna.mwk0;
import xsna.wk50;

/* compiled from: GestureActionApplier.kt */
/* loaded from: classes17.dex */
public final class bot implements oj50<mwk0, com.vk.clips.sdk.shared.item.static_ads.a, StaticAdsItemPatch> {
    public final f4z a;

    public bot(f4z f4zVar) {
        this.a = f4zVar;
    }

    @Override // xsna.oj50
    public final void a(wk50.a aVar, km50 km50Var, kj50 kj50Var) {
        mwk0 mwk0Var = (mwk0) km50Var;
        com.vk.clips.sdk.shared.item.static_ads.a aVar2 = (com.vk.clips.sdk.shared.item.static_ads.a) kj50Var;
        if ((mwk0Var instanceof mwk0.a) && (aVar2 instanceof a.c)) {
            a.c cVar = (a.c) aVar2;
            boolean z = cVar instanceof a.c.b;
            f4z f4zVar = this.a;
            if (z) {
                mwk0.a aVar3 = (mwk0.a) mwk0Var;
                if (aVar3.e.b) {
                    f4zVar.b(b.a.a);
                    return;
                } else {
                    if (aVar3.c) {
                        aVar.b(StaticAdsItemPatch.c.a.b);
                        return;
                    }
                    return;
                }
            }
            if (!(cVar instanceof a.c.C0691a)) {
                throw new NoWhenBranchMatchedException();
            }
            mwk0.a aVar4 = (mwk0.a) mwk0Var;
            if (aVar4.e.b) {
                f4zVar.b(b.a.a);
            } else if (aVar4.c) {
                aVar.b(StaticAdsItemPatch.c.a.b);
            }
        }
    }

    @Override // xsna.oj50
    public final void onDestroy() {
    }
}
