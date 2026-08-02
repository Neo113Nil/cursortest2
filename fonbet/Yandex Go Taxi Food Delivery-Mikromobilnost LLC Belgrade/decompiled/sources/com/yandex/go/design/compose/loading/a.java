package com.yandex.go.design.compose.loading;

import defpackage.bts;
import defpackage.did;
import defpackage.dur0;
import defpackage.eur0;
import defpackage.fid;
import defpackage.jcb1;
import defpackage.k2z;
import defpackage.ldc;
import defpackage.ltr0;
import defpackage.mcb1;
import defpackage.mtr0;
import defpackage.o430;
import defpackage.q4z;
import defpackage.r190;
import defpackage.rhe;
import defpackage.wls;
import defpackage.zls;
import defpackage.zp2;
import defpackage.zpn;

/* loaded from: classes12.dex */
public final /* synthetic */ class a implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ eur0 c;

    public /* synthetic */ a(boolean z, eur0 eur0Var, int i) {
        this.a = i;
        this.b = z;
        this.c = eur0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        o430 o430Var = did.a;
        eur0 eur0Var = this.c;
        boolean z = this.b;
        fid fidVar = (fid) obj2;
        ((Integer) obj3).getClass();
        switch (i) {
            case 0:
                bts btsVar = (bts) fidVar;
                btsVar.e0(1010738480);
                dur0 d = mcb1.d(zp2.a, zp2.d, btsVar);
                btsVar.e0(657077047);
                ltr0 ltr0Var = (ltr0) btsVar.m(q4z.a);
                btsVar.t(false);
                mtr0 e = jcb1.e(z, eur0Var, btsVar, 0);
                boolean k = btsVar.k(ltr0Var);
                Object Q = btsVar.Q();
                if (k || Q == o430Var) {
                    Q = new LoadingContentKt$loadingContent$1$1$1(ltr0Var, null);
                    btsVar.o0(Q);
                }
                zpn.e(btsVar, (wls) Q, ltr0Var);
                boolean k2 = btsVar.k(ltr0Var) | btsVar.k(e) | btsVar.k(d);
                Object Q2 = btsVar.Q();
                if (k2 || Q2 == o430Var) {
                    Q2 = new rhe(ltr0Var, e, d);
                    btsVar.o0(Q2);
                }
                rhe rheVar = (rhe) Q2;
                btsVar.t(false);
                return rheVar;
            default:
                bts btsVar2 = (bts) fidVar;
                btsVar2.e0(328983850);
                long j = zp2.d;
                btsVar2.e0(-357363952);
                btsVar2.t(false);
                btsVar2.e0(-1674095087);
                long j2 = ((ldc) btsVar2.m(k2z.b)).a;
                btsVar2.t(false);
                dur0 d2 = mcb1.d(j, j2, btsVar2);
                btsVar2.e0(-1674092591);
                ltr0 ltr0Var2 = (ltr0) btsVar2.m(q4z.a);
                btsVar2.t(false);
                mtr0 e2 = jcb1.e(z, eur0Var, btsVar2, 0);
                boolean k3 = btsVar2.k(ltr0Var2);
                Object Q3 = btsVar2.Q();
                if (k3 || Q3 == o430Var) {
                    Q3 = new LoadingOverlayKt$loadingOverlay$1$1$1(ltr0Var2, null);
                    btsVar2.o0(Q3);
                }
                zpn.e(btsVar2, (wls) Q3, ltr0Var2);
                boolean k4 = btsVar2.k(ltr0Var2) | btsVar2.k(e2) | btsVar2.k(d2);
                Object Q4 = btsVar2.Q();
                if (k4 || Q4 == o430Var) {
                    Q4 = new r190(ltr0Var2, e2, d2);
                    btsVar2.o0(Q4);
                }
                r190 r190Var = (r190) Q4;
                btsVar2.t(false);
                return r190Var;
        }
    }
}
