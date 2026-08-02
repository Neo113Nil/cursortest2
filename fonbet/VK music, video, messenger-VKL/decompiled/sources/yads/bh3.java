package yads;

import xsna.qcy;
import xsna.wq70;

/* loaded from: classes10.dex */
public final class bh3 extends wq70 {
    public final /* synthetic */ ch3 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh3(ch3 ch3Var) {
        super(null);
        this.a = ch3Var;
    }

    @Override // xsna.wq70
    public final void afterChange(qcy qcyVar, Object obj, Object obj2) {
        this.a.f.d = (v71) obj2;
    }
}
