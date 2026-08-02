package com.yandex.fintechsdk.features.bdui.internal.presentation.action.card.pay.poll;

import com.yandex.fintechsdk.adapters.flex.sdk.api.FlexAdapter;
import defpackage.fp51;
import defpackage.ig5;
import defpackage.jg5;
import defpackage.jh5;
import defpackage.ns31;
import defpackage.tje;
import defpackage.tse;
import defpackage.uxd0;
import defpackage.vm50;
import defpackage.vxd0;
import defpackage.wm50;
import defpackage.z22;

/* loaded from: classes12.dex */
public final class a implements jg5 {
    public final z22 a;
    public final FlexAdapter b;
    public final ns31 c;
    public final fp51 w;

    public a(z22 z22Var, FlexAdapter flexAdapter, ns31 ns31Var, fp51 fp51Var) {
        this.a = z22Var;
        this.b = flexAdapter;
        this.c = ns31Var;
        this.w = fp51Var;
    }

    @Override // defpackage.jg5
    public final void y(ig5 ig5Var, jh5 jh5Var) {
        wm50 wm50Var = jh5Var.a;
        if (ig5Var instanceof uxd0) {
            fp51 fp51Var = this.w;
            if (fp51Var == null) {
                vm50 vm50Var = ((uxd0) ig5Var).g;
                if (vm50Var != null) {
                    wm50Var.dispatch(vm50Var);
                    return;
                }
                return;
            }
            tse tseVar = (tse) this.c.a();
            if (tseVar == null) {
                return;
            }
            uxd0 uxd0Var = (uxd0) ig5Var;
            int i = uxd0Var.a + 1;
            vm50 vm50Var2 = uxd0Var.f;
            if (vm50Var2 != null) {
                wm50Var.dispatch(vm50Var2);
            }
            tje.N(tseVar, new vxd0(this, ig5Var, jh5Var), null, new PollPayCardActionHandler$handle$4(i, this, ig5Var, fp51Var, jh5Var, null), 2);
        }
    }
}
