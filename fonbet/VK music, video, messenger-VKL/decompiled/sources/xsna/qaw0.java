package xsna;

import com.vk.vmoji.character.model.VmojiStickerPackPreviewModel;
import com.vk.vmoji.character.recommendations.VmojiRecommendationsFragment;
import kotlin.NoWhenBranchMatchedException;
import xsna.a7f0;
import xsna.naw0;
import xsna.sf90;
import xsna.taw0;
import xsna.waw0;

/* compiled from: VmojiRecommendationsFeature.kt */
/* loaded from: classes7.dex */
public final class qaw0 extends wk50<abw0, waw0, naw0, taw0> {
    public final hhd0 f;
    public final raw0 g;
    public final String h;

    public qaw0(vaw0 vaw0Var, hhd0 hhd0Var, raw0 raw0Var, String str) {
        super(naw0.b.b, vaw0Var);
        this.f = hhd0Var;
        this.g = raw0Var;
        this.h = str;
    }

    @Override // xsna.wk50
    public final void N(waw0 waw0Var, naw0 naw0Var) {
        String str;
        waw0 waw0Var2 = waw0Var;
        naw0 naw0Var2 = naw0Var;
        if (naw0Var2 instanceof naw0.b) {
            if (waw0Var2 instanceof waw0.a) {
                waw0.a aVar = (waw0.a) waw0Var2;
                T(new taw0.a(aVar.b, aVar.c, aVar.d, aVar.f.a));
                return;
            }
            return;
        }
        boolean z = naw0Var2 instanceof naw0.a;
        hhd0 hhd0Var = this.f;
        if (z) {
            ((VmojiRecommendationsFragment) hhd0Var.b).finish();
            return;
        }
        boolean z2 = naw0Var2 instanceof naw0.d;
        raw0 raw0Var = this.g;
        if (z2) {
            if (waw0Var2 instanceof waw0.a) {
                waw0.a aVar2 = (waw0.a) waw0Var2;
                if (aVar2.e instanceof waw0.a.AbstractC3923a.C3924a) {
                    T(taw0.c.C3736c.b);
                    a7f0.a.f(this, rsg0.w0(yfb.x(raw0Var.a.f(aVar2.b))).l(new f0j0(new wo40(28), 12)).l(new xw70(new t6c0(20), 18)), new ehm0(this, 15), new emh0(this, 24), 1);
                    return;
                }
                return;
            }
            return;
        }
        if (!(naw0Var2 instanceof naw0.c)) {
            if (!(naw0Var2 instanceof naw0.e)) {
                throw new NoWhenBranchMatchedException();
            }
            VmojiStickerPackPreviewModel vmojiStickerPackPreviewModel = ((naw0.e) naw0Var2).b;
            hhd0Var.getClass();
            b6m.e().d(((VmojiRecommendationsFragment) hhd0Var.b).requireContext(), vmojiStickerPackPreviewModel.b, this.h);
            return;
        }
        naw0.c cVar = (naw0.c) naw0Var2;
        if (waw0Var2 instanceof waw0.a) {
            waw0.a aVar3 = (waw0.a) waw0Var2;
            sf90 sf90Var = aVar3.f;
            if (aVar3.e instanceof waw0.a.AbstractC3923a.C3924a) {
                if ((!(cVar instanceof naw0.c.b) || (sf90Var instanceof sf90.b)) && (str = sf90Var.a) != null) {
                    T(taw0.b.c.b);
                    a7f0.a.f(this, rsg0.w0(yfb.x(raw0Var.a.f(str))).l(new f0j0(new wo40(28), 12)).l(new i3u(new yml0(14), 26)), new gfv0(this, 2), new hfv0(this, 2), 1);
                }
            }
        }
    }
}
