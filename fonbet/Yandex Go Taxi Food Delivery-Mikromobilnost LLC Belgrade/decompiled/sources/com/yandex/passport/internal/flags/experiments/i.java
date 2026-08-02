package com.yandex.passport.internal.flags.experiments;

import com.yandex.passport.internal.analytics.a0;
import com.yandex.passport.internal.flags.presentation.c1;
import com.yandex.passport.internal.flags.presentation.d0;
import com.yandex.passport.internal.flags.presentation.o0;
import defpackage.bts;
import defpackage.did;
import defpackage.fid;
import defpackage.o430;
import defpackage.sls;
import defpackage.tls;
import defpackage.wls;
import defpackage.wwg;
import defpackage.zy11;

/* loaded from: classes15.dex */
public final class i implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ExperimentsInternalTestActivity b;

    public /* synthetic */ i(ExperimentsInternalTestActivity experimentsInternalTestActivity, int i) {
        this.a = i;
        this.b = experimentsInternalTestActivity;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        o0 viewModel;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        ExperimentsInternalTestActivity experimentsInternalTestActivity = this.b;
        int i2 = 0;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar = (bts) fidVar;
                    if (btsVar.E()) {
                        btsVar.Y();
                        break;
                    }
                }
                viewModel = experimentsInternalTestActivity.getViewModel();
                d0 d0Var = (d0) androidx.compose.runtime.f.b(viewModel.A, fidVar).getValue();
                bts btsVar2 = (bts) fidVar;
                btsVar2.e0(-1809755185);
                boolean e = fidVar.e(experimentsInternalTestActivity);
                Object Q = btsVar2.Q();
                o430 o430Var = did.a;
                if (e || Q == o430Var) {
                    Q = new a0(3, experimentsInternalTestActivity);
                    btsVar2.o0(Q);
                }
                tls tlsVar = (tls) Q;
                btsVar2.t(false);
                btsVar2.e0(-1809753437);
                boolean e2 = fidVar.e(experimentsInternalTestActivity);
                Object Q2 = btsVar2.Q();
                if (e2 || Q2 == o430Var) {
                    Q2 = new h(0, experimentsInternalTestActivity);
                    btsVar2.o0(Q2);
                }
                btsVar2.t(false);
                c1.j(d0Var, tlsVar, (sls) Q2, fidVar, 0);
                break;
            default:
                fid fidVar2 = (fid) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar3 = (bts) fidVar2;
                    if (btsVar3.E()) {
                        btsVar3.Y();
                        break;
                    }
                }
                com.yandex.passport.common.ui.compose.theme.e.a(false, false, wwg.S(761197106, true, new i(experimentsInternalTestActivity, i2), fidVar2), fidVar2, 384, 3);
                break;
        }
        return zy11Var;
    }
}
