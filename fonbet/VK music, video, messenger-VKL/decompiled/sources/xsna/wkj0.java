package xsna;

import com.vk.clips.sdk.shared.item.ads.AdsItemAction;
import com.vk.clips.sdk.shared.item.ads.AdsItemPatch;
import kotlin.NoWhenBranchMatchedException;
import xsna.nz0;
import xsna.wk50;

/* compiled from: SideControlsActionApplier.kt */
/* loaded from: classes17.dex */
public final class wkj0 implements oj50<nz0, AdsItemAction, AdsItemPatch> {
    public final f4z a;

    public wkj0(f4z f4zVar) {
        this.a = f4zVar;
    }

    @Override // xsna.oj50
    public final void a(wk50.a aVar, km50 km50Var, kj50 kj50Var) {
        nz0 nz0Var = (nz0) km50Var;
        AdsItemAction adsItemAction = (AdsItemAction) kj50Var;
        if ((nz0Var instanceof nz0.a) && (adsItemAction instanceof AdsItemAction.r)) {
            if (!(((AdsItemAction.r) adsItemAction) instanceof com.vk.clips.sdk.shared.item.ads.a)) {
                throw new NoWhenBranchMatchedException();
            }
            this.a.b(new jy0(((nz0.a) nz0Var).b.a));
        }
    }

    @Override // xsna.oj50
    public final void onDestroy() {
    }
}
