package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.hkq;
import xsna.jkq;
import xsna.kkq;

/* compiled from: FaqFeature.kt */
/* loaded from: classes14.dex */
public final class ikq extends wk50<skq, nkq, hkq, kkq> {
    public final f4z f;

    public ikq(lkq lkqVar, hkq.b bVar) {
        super(bVar, lkqVar);
        this.f = new f4z();
    }

    @Override // xsna.wk50
    public final void N(nkq nkqVar, hkq hkqVar) {
        hkq hkqVar2 = hkqVar;
        if (hkqVar2 instanceof hkq.b) {
            hkq.b bVar = (hkq.b) hkqVar2;
            T(new kkq.a(bVar.b, bVar.c));
        } else {
            if (!(hkqVar2 instanceof hkq.a)) {
                throw new NoWhenBranchMatchedException();
            }
            this.f.b(jkq.a.a);
        }
    }
}
