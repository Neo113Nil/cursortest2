package xsna;

import kotlin.LazyThreadSafetyMode;
import xsna.ch00;
import xsna.qg00;
import xsna.xg00;

/* compiled from: ManageCommunitiesNotificationsFeature.kt */
/* loaded from: classes5.dex */
public final class tg00 extends wk50<lh00, dh00, qg00, xg00> {
    public final b25 f;
    public final f4z g;
    public final rqu h;
    public final hpj i;
    public final Object j;

    public tg00(b25 b25Var) {
        super(qg00.f.b, new yg00(new dh00(14)));
        this.f = b25Var;
        this.g = new f4z();
        this.h = new rqu(b25Var);
        this.i = zvj.a(hqu0.b());
        this.j = msy.a(LazyThreadSafetyMode.NONE, new nh0(20));
    }

    @Override // xsna.wk50
    public final void N(dh00 dh00Var, qg00 qg00Var) {
        qg00 qg00Var2 = qg00Var;
        boolean equals = qg00Var2.equals(qg00.f.b);
        hpj hpjVar = this.i;
        if (equals) {
            myc0.h(hpjVar, null, null, new sg00(this, null), 3);
            return;
        }
        if (qg00Var2.equals(qg00.g.b)) {
            T(xg00.d.b);
            myc0.h(hpjVar, null, null, new sg00(this, null), 3);
            return;
        }
        boolean equals2 = qg00Var2.equals(qg00.b.b);
        f4z f4zVar = this.g;
        if (equals2) {
            f4zVar.b(ch00.a.a);
            return;
        }
        if (qg00Var2.equals(qg00.a.b)) {
            f4zVar.b(ch00.b.a);
            return;
        }
        if (qg00Var2 instanceof qg00.e) {
            qg00.e eVar = (qg00.e) qg00Var2;
            f4zVar.b(new ch00.c(eVar.b, eVar.c));
        } else if (qg00Var2 instanceof qg00.c) {
            qg00.c cVar = (qg00.c) qg00Var2;
            f4zVar.b(new ch00.d(cVar.b, cVar.c));
        } else if (qg00Var2 instanceof qg00.d) {
            myc0.h(hpjVar, null, null, new rg00(this, ((qg00.d) qg00Var2).b, null), 3);
        }
    }
}
