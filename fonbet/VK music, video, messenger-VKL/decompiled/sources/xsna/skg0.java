package xsna;

import com.vk.clips.sdk.shared.api.analytics.SdkClipViewerClick;
import com.vk.clips.sdk.shared.item.ads.AdsItemAction;
import com.vk.clips.sdk.shared.item.ads.AdsItemPatch;
import kotlin.NoWhenBranchMatchedException;
import xsna.ky0;
import xsna.nz0;
import xsna.wk50;
import xsna.xw0;

/* compiled from: RightTitleActionApplier.kt */
/* loaded from: classes17.dex */
public final class skg0 implements oj50<nz0, AdsItemAction, AdsItemPatch> {
    public final pih0 a;
    public final f4z b;
    public final f4z c;

    public skg0(iih0 iih0Var, f4z f4zVar, f4z f4zVar2) {
        this.a = iih0Var;
        this.b = f4zVar;
        this.c = f4zVar2;
    }

    @Override // xsna.oj50
    public final void a(wk50.a aVar, km50 km50Var, kj50 kj50Var) {
        nz0 nz0Var = (nz0) km50Var;
        AdsItemAction adsItemAction = (AdsItemAction) kj50Var;
        if ((nz0Var instanceof nz0.a) && (adsItemAction instanceof AdsItemAction.q)) {
            AdsItemAction.q qVar = (AdsItemAction.q) adsItemAction;
            boolean z = qVar instanceof AdsItemAction.q.a;
            pih0 pih0Var = this.a;
            if (z) {
                nz0.a aVar2 = (nz0.a) nz0Var;
                pih0Var.o2(new SdkClipViewerClick.u(aVar2.b.a, true));
                this.b.b(new xw0.l.a(aVar2.c));
                return;
            }
            if (!(qVar instanceof AdsItemAction.q.b)) {
                throw new NoWhenBranchMatchedException();
            }
            pih0Var.o2(new SdkClipViewerClick.u(((nz0.a) nz0Var).b.a, false));
            this.c.b(ky0.g.a);
        }
    }

    @Override // xsna.oj50
    public final void onDestroy() {
    }
}
