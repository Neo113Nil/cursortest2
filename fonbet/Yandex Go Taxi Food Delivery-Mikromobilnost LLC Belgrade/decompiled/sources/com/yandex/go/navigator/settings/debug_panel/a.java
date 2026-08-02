package com.yandex.go.navigator.settings.debug_panel;

import com.yandex.go.navigator.settings.debug_panel.domain.b;
import defpackage.agd;
import defpackage.amp0;
import defpackage.cgs0;
import defpackage.df50;
import defpackage.dgs0;
import defpackage.idd;
import defpackage.t;
import defpackage.tje;
import defpackage.tls;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.yfd;
import defpackage.yfs0;
import defpackage.zy11;
import kotlinx.coroutines.flow.e;

/* loaded from: classes12.dex */
public final /* synthetic */ class a implements tls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ t b;
    public final /* synthetic */ dgs0 c;
    public final /* synthetic */ Object w;

    public /* synthetic */ a(t tVar, amp0 amp0Var, dgs0 dgs0Var) {
        this.b = tVar;
        this.w = amp0Var;
        this.c = dgs0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.w;
        dgs0 dgs0Var = this.c;
        t tVar = this.b;
        switch (i) {
            case 0:
                amp0 amp0Var = (amp0) obj2;
                yfd yfdVar = (yfd) obj;
                yfs0 yfs0Var = new yfs0(tVar);
                df50 df50Var = (df50) amp0Var.b;
                tpr t = e.t(e.n(df50Var.b, df50Var.d, ((b) amp0Var.c).e, new SimulationSettingsUiStateInteractor$uiStateFlow$1(4, null)));
                ((tt2) amp0Var.a).getClass();
                ((agd) yfdVar).c = e.F(t, uyj.a);
                agd agdVar = (agd) yfdVar;
                agdVar.e = new a(tVar, dgs0Var, yfs0Var);
                idd.a.getClass();
                agdVar.g = idd.b;
                break;
            default:
                tje.N(tVar.o(), null, null, new SimulationSettingsRouter$content$1$1$1(dgs0Var, (cgs0) obj, (yfs0) obj2, null), 3);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ a(t tVar, dgs0 dgs0Var, yfs0 yfs0Var) {
        this.b = tVar;
        this.c = dgs0Var;
        this.w = yfs0Var;
    }
}
