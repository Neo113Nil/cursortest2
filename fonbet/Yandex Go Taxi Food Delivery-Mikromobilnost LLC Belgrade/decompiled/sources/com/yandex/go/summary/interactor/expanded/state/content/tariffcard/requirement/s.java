package com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement;

import defpackage.f6v;
import defpackage.h6v;
import defpackage.hmx0;
import defpackage.ncx0;
import defpackage.ny61;
import defpackage.vfx0;
import defpackage.vpr;
import defpackage.zrm;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class s implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ zrm b;

    public s(vpr vprVar, zrm zrmVar) {
        this.a = vprVar;
        this.b = zrmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ForceTopRequirementsUiStateInteractor$special$$inlined$map$1$2$1 forceTopRequirementsUiStateInteractor$special$$inlined$map$1$2$1;
        int i;
        h6v h6vVar;
        if (continuation instanceof ForceTopRequirementsUiStateInteractor$special$$inlined$map$1$2$1) {
            forceTopRequirementsUiStateInteractor$special$$inlined$map$1$2$1 = (ForceTopRequirementsUiStateInteractor$special$$inlined$map$1$2$1) continuation;
            int i2 = forceTopRequirementsUiStateInteractor$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                forceTopRequirementsUiStateInteractor$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = forceTopRequirementsUiStateInteractor$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = forceTopRequirementsUiStateInteractor$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    f6v f6vVar = (f6v) obj;
                    h6v h6vVar2 = f6vVar.a;
                    if (h6vVar2 == null) {
                        h6vVar = null;
                    } else if (h6vVar2.b) {
                        h6vVar = new h6v(null, true);
                    } else {
                        Object obj3 = h6vVar2.a;
                        if (obj3 == null) {
                            h6vVar = new h6v(null, false);
                        } else {
                            ((vfx0) this.b.b).getClass();
                            h6vVar = new h6v(vfx0.c((hmx0) obj3), false);
                        }
                    }
                    f6v f6vVar2 = new f6v(h6vVar, ((ncx0) f6vVar.b).b);
                    forceTopRequirementsUiStateInteractor$special$$inlined$map$1$2$1.L$0 = null;
                    forceTopRequirementsUiStateInteractor$special$$inlined$map$1$2$1.L$1 = null;
                    forceTopRequirementsUiStateInteractor$special$$inlined$map$1$2$1.L$2 = null;
                    forceTopRequirementsUiStateInteractor$special$$inlined$map$1$2$1.L$3 = null;
                    forceTopRequirementsUiStateInteractor$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(f6vVar2, forceTopRequirementsUiStateInteractor$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        forceTopRequirementsUiStateInteractor$special$$inlined$map$1$2$1 = new ForceTopRequirementsUiStateInteractor$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = forceTopRequirementsUiStateInteractor$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = forceTopRequirementsUiStateInteractor$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
