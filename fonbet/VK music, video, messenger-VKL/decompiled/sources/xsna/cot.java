package xsna;

import com.vk.clips.sdk.shared.item.ads.AdsItemAction;
import com.vk.clips.sdk.shared.item.ads.AdsItemPatch;
import kotlin.NoWhenBranchMatchedException;
import xsna.nz0;
import xsna.wk50;
import xsna.xw0;

/* compiled from: GestureActionApplier.kt */
/* loaded from: classes17.dex */
public final class cot implements oj50<nz0, AdsItemAction, AdsItemPatch> {
    public final wj50<xw0> a;

    public cot(f4z f4zVar) {
        this.a = f4zVar;
    }

    @Override // xsna.oj50
    public final void a(wk50.a aVar, km50 km50Var, kj50 kj50Var) {
        nz0 nz0Var = (nz0) km50Var;
        AdsItemAction adsItemAction = (AdsItemAction) kj50Var;
        if ((nz0Var instanceof nz0.a) && (adsItemAction instanceof AdsItemAction.c)) {
            AdsItemAction.c cVar = (AdsItemAction.c) adsItemAction;
            if (cVar instanceof AdsItemAction.c.C0645c) {
                nz0.a aVar2 = (nz0.a) nz0Var;
                if (b(aVar, aVar2)) {
                    return;
                }
                this.a.b(new xw0.n(aVar2.d, aVar2.l));
                return;
            }
            if (cVar instanceof AdsItemAction.c.a) {
                b(aVar, (nz0.a) nz0Var);
            } else {
                if (!(cVar instanceof AdsItemAction.c.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                b(aVar, (nz0.a) nz0Var);
            }
        }
    }

    public final boolean b(wk50.a aVar, nz0.a aVar2) {
        if (aVar2.f.b) {
            this.a.b(xw0.b.a);
            return true;
        }
        if (!aVar2.h) {
            return false;
        }
        aVar.b(AdsItemPatch.c.a.b);
        return true;
    }

    @Override // xsna.oj50
    public final void onDestroy() {
    }
}
