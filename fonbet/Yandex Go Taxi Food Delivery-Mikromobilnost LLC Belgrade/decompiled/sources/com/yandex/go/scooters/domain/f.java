package com.yandex.go.scooters.domain;

import com.yandex.mapkit.map.Map;
import defpackage.ah00;
import defpackage.gh00;
import defpackage.l8x;
import defpackage.tje;
import defpackage.tls;
import defpackage.v7n0;
import defpackage.zy11;

/* loaded from: classes13.dex */
public final /* synthetic */ class f implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ v7n0 b;

    public /* synthetic */ f(v7n0 v7n0Var, int i) {
        this.a = i;
        this.b = v7n0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                v7n0 v7n0Var = this.b;
                gh00 gh00Var = (gh00) v7n0Var.a;
                Map map = gh00Var.b;
                if (map != null) {
                    map.set2DMode(false);
                }
                gh00Var.I(v7n0Var.d);
                gh00Var.v();
                ScootersCommonMapSetupLifecycleInteractor$onDismiss$1$1 scootersCommonMapSetupLifecycleInteractor$onDismiss$1$1 = new ScootersCommonMapSetupLifecycleInteractor$onDismiss$1$1(v7n0Var, v7n0.class, "job", "getJob()Lkotlinx/coroutines/Job;", 0);
                l8x l8xVar = (l8x) scootersCommonMapSetupLifecycleInteractor$onDismiss$1$1.get();
                scootersCommonMapSetupLifecycleInteractor$onDismiss$1$1.i(null);
                if (l8xVar != null) {
                    l8xVar.a(null);
                    break;
                }
                break;
            default:
                v7n0 v7n0Var2 = this.b;
                ah00 ah00Var = v7n0Var2.a;
                v7n0Var2.d = ((gh00) ah00Var).o();
                Map map2 = ((gh00) ah00Var).b;
                if (map2 != null) {
                    map2.set2DMode(true);
                }
                ScootersCommonMapSetupLifecycleInteractor$onLaunch$1$1 scootersCommonMapSetupLifecycleInteractor$onLaunch$1$1 = new ScootersCommonMapSetupLifecycleInteractor$onLaunch$1$1(v7n0Var2, v7n0.class, "job", "getJob()Lkotlinx/coroutines/Job;", 0);
                l8x l8xVar2 = (l8x) scootersCommonMapSetupLifecycleInteractor$onLaunch$1$1.get();
                scootersCommonMapSetupLifecycleInteractor$onLaunch$1$1.i(null);
                if (l8xVar2 != null) {
                    l8xVar2.a(null);
                }
                v7n0Var2.e = tje.N(v7n0Var2.b, null, null, new ScootersCommonMapSetupLifecycleInteractor$onLaunch$1$2(v7n0Var2, null), 3);
                break;
        }
        return zy11Var;
    }
}
