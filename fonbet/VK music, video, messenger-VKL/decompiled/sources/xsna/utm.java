package xsna;

import com.vk.im.ui.components.common.PromoLinkAction;
import xsna.i5e0;

/* compiled from: DialogsListVc.java */
/* loaded from: classes2.dex */
public final class utm implements izs<PromoLinkAction, s3q0> {
    public final /* synthetic */ i5e0.a b;
    public final /* synthetic */ vtm c;

    public utm(vtm vtmVar, i5e0.a aVar) {
        this.c = vtmVar;
        this.b = aVar;
    }

    @Override // xsna.izs
    public final s3q0 invoke(PromoLinkAction promoLinkAction) {
        xtm xtmVar = this.c.F;
        if (xtmVar == null) {
            return null;
        }
        xtmVar.q(this.b.a);
        return null;
    }
}
