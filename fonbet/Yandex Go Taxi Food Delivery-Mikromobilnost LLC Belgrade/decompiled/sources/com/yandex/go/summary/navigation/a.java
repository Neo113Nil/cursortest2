package com.yandex.go.summary.navigation;

import defpackage.agd;
import defpackage.bov0;
import defpackage.gbn;
import defpackage.gci0;
import defpackage.gv9;
import defpackage.iqv0;
import defpackage.kkv0;
import defpackage.me4;
import defpackage.mth;
import defpackage.tje;
import defpackage.tls;
import defpackage.yfd;
import defpackage.zy11;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes14.dex */
public final /* synthetic */ class a implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;

    public /* synthetic */ a(e eVar, int i) {
        this.a = i;
        this.b = eVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                yfd yfdVar = (yfd) obj;
                ((agd) yfdVar).f = me4.a;
                e eVar = this.b;
                gbn gbnVar = eVar.H;
                gci0 gci0Var = gbnVar.b;
                agd agdVar = (agd) yfdVar;
                agdVar.c = kotlinx.coroutines.flow.e.o(gci0Var != null ? new mth(gci0Var, 6) : gbnVar.a.a);
                agdVar.e = new a(eVar, 1);
                ComposeSummaryRouter$content$1$handlePerformanceUiAction$1 composeSummaryRouter$content$1$handlePerformanceUiAction$1 = new ComposeSummaryRouter$content$1$handlePerformanceUiAction$1(1, eVar.t0, kkv0.class, "handleAction", "handleAction(Lcom/yandex/go/summary/ui/model/common/action/PerformanceUiAction;)V", 0);
                n0 b = eVar.J.b();
                bov0 a = eVar.h0.a();
                if (a == null) {
                    a = bov0.e;
                }
                agdVar.g = new androidx.compose.runtime.internal.a(-1437914995, new gv9(eVar, !a.a, composeSummaryRouter$content$1$handlePerformanceUiAction$1, b, 1), true);
                break;
            default:
                e eVar2 = this.b;
                tje.N(eVar2.o(), null, null, new ComposeSummaryRouter$content$1$1$1(eVar2, (iqv0) obj, null), 3);
                break;
        }
        return zy11Var;
    }
}
