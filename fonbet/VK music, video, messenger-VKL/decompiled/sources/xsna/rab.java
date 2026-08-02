package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.pab;

/* compiled from: ChannelReactionQuantitySelectorReducer.kt */
/* loaded from: classes16.dex */
public final class rab extends dm50<vab, pab, sab> {
    public rab() {
        super(new sab(0));
    }

    @Override // xsna.dm50
    public final sab c(sab sabVar, pab pabVar) {
        sab sabVar2 = sabVar;
        pab pabVar2 = pabVar;
        if (pabVar2 instanceof pab.a) {
            int i = ((pab.a) pabVar2).b;
            return sab.a(sabVar2, 0, i, sabVar2.b * i, 1);
        }
        if (!(pabVar2 instanceof pab.b)) {
            throw new NoWhenBranchMatchedException();
        }
        int i2 = ((pab.b) pabVar2).b;
        return sab.a(sabVar2, i2, 0, sabVar2.c * i2, 2);
    }

    @Override // xsna.dm50
    public final vab d() {
        return new vab(e(new com.vk.movika.sdk.base.observable.c(this, 21)));
    }

    @Override // xsna.dm50
    public final void h(sab sabVar, vab vabVar) {
        f(vabVar.a, sabVar);
    }
}
