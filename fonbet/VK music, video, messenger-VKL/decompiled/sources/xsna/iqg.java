package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.fqg;
import xsna.mqg;
import xsna.oqg;

/* compiled from: CommunityAddDescriptionFeature.kt */
/* loaded from: classes5.dex */
public final class iqg extends wk50<sqg, pqg, fqg, mqg> {
    public final f4z f;

    public iqg() {
        super(fqg.a.b, new nqg(new pqg("", null)));
        this.f = new f4z();
    }

    @Override // xsna.wk50
    public final void N(pqg pqgVar, fqg fqgVar) {
        pqg pqgVar2 = pqgVar;
        fqg fqgVar2 = fqgVar;
        if (fqgVar2.equals(fqg.a.b)) {
            T(mqg.b.b);
            return;
        }
        if (fqgVar2.equals(fqg.b.b)) {
            this.f.b(new oqg.a(drm0.p0(pqgVar2.b).toString()));
        } else {
            if (!(fqgVar2 instanceof fqg.c)) {
                throw new NoWhenBranchMatchedException();
            }
            fqg.c cVar = (fqg.c) fqgVar2;
            T(new mqg.a(cVar.b, cVar.c));
        }
    }
}
