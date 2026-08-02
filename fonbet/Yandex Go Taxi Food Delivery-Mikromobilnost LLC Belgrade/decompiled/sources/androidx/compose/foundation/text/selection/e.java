package androidx.compose.foundation.text.selection;

import defpackage.bts;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.gr5;
import defpackage.kj2;
import defpackage.m3u0;
import defpackage.o430;
import defpackage.sls;
import defpackage.tls;
import defpackage.vkq0;
import defpackage.wls;
import defpackage.wu60;
import defpackage.zls;
import defpackage.zpn;
import defpackage.zy11;

/* loaded from: classes10.dex */
public final /* synthetic */ class e implements zls {
    public final /* synthetic */ sls a;
    public final /* synthetic */ tls b;

    public /* synthetic */ e(sls slsVar, tls tlsVar) {
        this.a = slsVar;
        this.b = tlsVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Integer) obj3).getClass();
        bts btsVar = (bts) ((fid) obj2);
        btsVar.e0(759876635);
        Object Q = btsVar.Q();
        o430 o430Var = did.a;
        if (Q == o430Var) {
            Q = androidx.compose.runtime.f.d(this.a);
            btsVar.o0(Q);
        }
        m3u0 m3u0Var = (m3u0) Q;
        Object Q2 = btsVar.Q();
        if (Q2 == o430Var) {
            Q2 = new androidx.compose.animation.core.a(new wu60(((wu60) m3u0Var.getValue()).a), vkq0.b, new wu60(vkq0.c), 8);
            btsVar.o0(Q2);
        }
        androidx.compose.animation.core.a aVar = (androidx.compose.animation.core.a) Q2;
        boolean e = btsVar.e(aVar);
        Object Q3 = btsVar.Q();
        if (e || Q3 == o430Var) {
            Q3 = new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1(m3u0Var, aVar, null);
            btsVar.o0(Q3);
        }
        zpn.e(btsVar, (wls) Q3, zy11.a);
        kj2 kj2Var = aVar.d;
        boolean k = btsVar.k(kj2Var);
        Object Q4 = btsVar.Q();
        if (k || Q4 == o430Var) {
            Q4 = new gr5(kj2Var, 7);
            btsVar.o0(Q4);
        }
        f530 f530Var = (f530) this.b.invoke((sls) Q4);
        btsVar.t(false);
        return f530Var;
    }
}
