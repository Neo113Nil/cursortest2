package com.yandex.go.payments.addmethod.ui.home;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yandex.go.compose.ComposeContentKt$ContentImpl$scope$1$1$action$1;
import defpackage.agd;
import defpackage.bgd;
import defpackage.bms;
import defpackage.bts;
import defpackage.did;
import defpackage.f4z;
import defpackage.fid;
import defpackage.fva0;
import defpackage.gg0;
import defpackage.o430;
import defpackage.sls;
import defpackage.t9h0;
import defpackage.tfx;
import defpackage.tje;
import defpackage.tls;
import defpackage.xfd;
import defpackage.xh0;
import defpackage.xpb1;
import defpackage.xva0;
import defpackage.yfd;
import defpackage.yuf0;
import defpackage.zy11;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;

/* loaded from: classes13.dex */
public final /* synthetic */ class a implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ gg0 b;

    public /* synthetic */ a(gg0 gg0Var, int i) {
        this.a = i;
        this.b = gg0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        final gg0 gg0Var = this.b;
        switch (i) {
            case 0:
                yfd yfdVar = (yfd) obj;
                ((agd) yfdVar).f = xpb1.y;
                tje.N(gg0Var.o(), null, null, new AddPaymentHomeComposeRouter$content$1$1(gg0Var, yfdVar, null), 3);
                b bVar = new b(gg0Var, yfdVar);
                agd agdVar = (agd) yfdVar;
                agdVar.e = bVar;
                agdVar.g = new androidx.compose.runtime.internal.a(-631916066, new bms() { // from class: com.yandex.go.payments.addmethod.ui.home.c
                    @Override // defpackage.bms
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i2;
                        xfd xfdVar = (xfd) obj2;
                        xh0 xh0Var = (xh0) obj3;
                        fid fidVar = (fid) obj4;
                        int intValue = ((Integer) obj5).intValue();
                        if ((intValue & 6) == 0) {
                            i2 = ((intValue & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2) | intValue;
                        } else {
                            i2 = intValue;
                        }
                        if ((intValue & 48) == 0) {
                            i2 |= (intValue & 64) == 0 ? ((bts) fidVar).k(xh0Var) : fidVar.e(xh0Var) ? 32 : 16;
                        }
                        bts btsVar = (bts) fidVar;
                        boolean V = btsVar.V(i2 & 1, (i2 & 147) != 146);
                        zy11 zy11Var2 = zy11.a;
                        if (!V) {
                            btsVar.Y();
                            return zy11Var2;
                        }
                        fva0 a = f4z.a();
                        View view = (View) btsVar.m(AndroidCompositionLocals_androidKt.f);
                        boolean k = btsVar.k(view);
                        Object Q = btsVar.Q();
                        o430 o430Var = did.a;
                        if (k || Q == o430Var) {
                            View rootView = view.getRootView();
                            Object tag = rootView.getTag(t9h0.metricsStateHolder);
                            if (tag == null) {
                                tag = new xva0();
                                rootView.setTag(t9h0.metricsStateHolder, tag);
                            }
                            Q = (xva0) tag;
                            btsVar.o0(Q);
                        }
                        xva0 xva0Var = (xva0) Q;
                        Object Q2 = btsVar.Q();
                        if (Q2 == o430Var) {
                            fva0.f(a, "Payments.FeatureAddYapeToken", PerformanceAnalytics$Type.Inflate, 0L, 4);
                            yuf0 yuf0Var = xva0Var.a;
                            if (yuf0Var != null) {
                                yuf0Var.I("Payments.FeatureAddYapeToken");
                                Q2 = zy11Var2;
                            } else {
                                Q2 = null;
                            }
                            btsVar.o0(Q2);
                        }
                        ComposeContentKt$ContentImpl$scope$1$1$action$1 composeContentKt$ContentImpl$scope$1$1$action$1 = ((bgd) xfdVar).a;
                        gg0 gg0Var2 = gg0.this;
                        com.yandex.go.superapp.web.view.a aVar = gg0Var2.I;
                        boolean e = btsVar.e(gg0Var2);
                        Object Q3 = btsVar.Q();
                        if (e || Q3 == o430Var) {
                            AddPaymentHomeComposeRouter$content$1$3$1$1$1 addPaymentHomeComposeRouter$content$1$3$1$1$1 = new AddPaymentHomeComposeRouter$content$1$3$1$1$1(0, gg0Var2, gg0.class, "trackNequiInfoScreenShown", "trackNequiInfoScreenShown()V", 0);
                            btsVar.o0(addPaymentHomeComposeRouter$content$1$3$1$1$1);
                            Q3 = addPaymentHomeComposeRouter$content$1$3$1$1$1;
                        }
                        sls slsVar = (sls) ((tfx) Q3);
                        boolean e2 = btsVar.e(gg0Var2);
                        Object Q4 = btsVar.Q();
                        if (e2 || Q4 == o430Var) {
                            Q4 = new AddPaymentHomeComposeRouter$content$1$3$1$2$1(1, gg0Var2, gg0.class, "trackNequiInfoScreenAction", "trackNequiInfoScreenAction(Lcom/yandex/go/payments/addmethod/ui/home/AddPaymentHomeUiAction;)V", 0);
                            btsVar.o0(Q4);
                        }
                        d.c(xh0Var, composeContentKt$ContentImpl$scope$1$1$action$1, aVar, slsVar, (tls) ((tfx) Q4), btsVar, (i2 >> 3) & 14);
                        return zy11Var2;
                    }
                }, true);
                break;
            default:
                tje.N(gg0Var.o(), null, null, new AddPaymentHomeComposeRouter$content$1$2$1$2$1(gg0Var, (String) obj, null), 3);
                break;
        }
        return zy11Var;
    }
}
