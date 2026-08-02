package xsna;

import xsna.mnb;
import xsna.wmb;

/* compiled from: ChatClipsBottomBarDecorationFeature.kt */
/* loaded from: classes2.dex */
public final class bnb implements izs<?, s3q0> {
    public final /* synthetic */ ymb b;
    public final /* synthetic */ wmb.e c;

    public bnb(ymb ymbVar, wmb.e eVar) {
        this.b = ymbVar;
        this.c = eVar;
    }

    @Override // xsna.izs
    public final s3q0 invoke(Object obj) {
        ymb ymbVar = this.b;
        ymbVar.l.add(this.c.b.a1());
        ymbVar.T(mnb.c.b);
        return s3q0.a;
    }
}
