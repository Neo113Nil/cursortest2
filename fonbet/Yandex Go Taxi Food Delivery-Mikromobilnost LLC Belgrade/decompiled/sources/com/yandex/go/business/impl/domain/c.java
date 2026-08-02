package com.yandex.go.business.impl.domain;

import com.yandex.go.business.impl.experiment.YangoBusinessExperiment;
import defpackage.d6z;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wn51;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ g b;

    public c(vpr vprVar, g gVar) {
        this.a = vprVar;
        this.b = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        YangoBusinessInteractorImpl$special$$inlined$map$1$2$1 yangoBusinessInteractorImpl$special$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof YangoBusinessInteractorImpl$special$$inlined$map$1$2$1) {
            yangoBusinessInteractorImpl$special$$inlined$map$1$2$1 = (YangoBusinessInteractorImpl$special$$inlined$map$1$2$1) continuation;
            int i2 = yangoBusinessInteractorImpl$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yangoBusinessInteractorImpl$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = yangoBusinessInteractorImpl$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = yangoBusinessInteractorImpl$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    YangoBusinessExperiment yangoBusinessExperiment = (YangoBusinessExperiment) obj;
                    this.b.getClass();
                    boolean z = yangoBusinessExperiment.b;
                    String Y = d6z.Y(yangoBusinessExperiment, yangoBusinessExperiment.e);
                    String str = yangoBusinessExperiment.f;
                    wn51 wn51Var = new wn51(z, Y, str != null ? d6z.Y(yangoBusinessExperiment, str) : null);
                    yangoBusinessInteractorImpl$special$$inlined$map$1$2$1.L$0 = null;
                    yangoBusinessInteractorImpl$special$$inlined$map$1$2$1.L$1 = null;
                    yangoBusinessInteractorImpl$special$$inlined$map$1$2$1.L$2 = null;
                    yangoBusinessInteractorImpl$special$$inlined$map$1$2$1.L$3 = null;
                    yangoBusinessInteractorImpl$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(wn51Var, yangoBusinessInteractorImpl$special$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        yangoBusinessInteractorImpl$special$$inlined$map$1$2$1 = new YangoBusinessInteractorImpl$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = yangoBusinessInteractorImpl$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = yangoBusinessInteractorImpl$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
