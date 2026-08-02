package xsna;

import xsna.em7;
import xsna.hv9;
import xsna.osa;
import xsna.zb;

/* compiled from: DefaultCheckoutConfirmationAdapter.kt */
/* loaded from: classes6.dex */
public class icl extends qul implements jjv0 {

    /* compiled from: DefaultCheckoutConfirmationAdapter.kt */
    public interface a extends osa.a, zb.a, em7.a, hv9.a {
    }

    public icl(a aVar) {
        super(true);
        x0(wu80.class, new xx0(28));
        x0(nsa.class, new i50(aVar, 22));
        x0(ckl.class, new t9e(aVar, 14));
        x0(t9u.class, new dkg(aVar, 11));
        x0(cm7.class, new nfj(aVar, 4));
        x0(z8f0.class, new rf(29));
        x0(yl7.class, new gv3(16));
        x0(q1e0.class, new oa(20));
        x0(iv9.class, new fm0(aVar, 27));
        x0(vl7.class, new qt0(21));
    }

    @Override // xsna.jjv0
    public final int n1(int i) {
        if (i == -1) {
            return 0;
        }
        hfz hfzVar = this.d.get(i);
        hki0 hki0Var = hfzVar instanceof hki0 ? (hki0) hfzVar : null;
        if (hki0Var != null) {
            return hki0Var.n1(i);
        }
        return 0;
    }

    @Override // xsna.jjv0
    public final int t(int i) {
        if (i == -1) {
            return 0;
        }
        this.d.get(i);
        return 0;
    }
}
