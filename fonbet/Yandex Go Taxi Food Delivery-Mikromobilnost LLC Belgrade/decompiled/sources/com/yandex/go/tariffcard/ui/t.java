package com.yandex.go.tariffcard.ui;

import defpackage.f6v;
import defpackage.fnx0;
import defpackage.mi31;
import defpackage.nkt;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.tix0;
import defpackage.vfx0;
import defpackage.vpr;
import defpackage.yfx0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class t implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ tix0 b;

    public t(vpr vprVar, tix0 tix0Var) {
        this.a = vprVar;
        this.b = tix0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TariffOptionsCardStateInteractor$gluedRequirementsFlow$$inlined$map$1$2$1 tariffOptionsCardStateInteractor$gluedRequirementsFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof TariffOptionsCardStateInteractor$gluedRequirementsFlow$$inlined$map$1$2$1) {
            tariffOptionsCardStateInteractor$gluedRequirementsFlow$$inlined$map$1$2$1 = (TariffOptionsCardStateInteractor$gluedRequirementsFlow$$inlined$map$1$2$1) continuation;
            int i2 = tariffOptionsCardStateInteractor$gluedRequirementsFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffOptionsCardStateInteractor$gluedRequirementsFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = tariffOptionsCardStateInteractor$gluedRequirementsFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffOptionsCardStateInteractor$gluedRequirementsFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    fnx0 fnx0Var = (fnx0) obj;
                    pex0 pex0Var = fnx0Var.c;
                    String str = pex0Var.b;
                    tix0 tix0Var = this.b;
                    tix0Var.e.getClass();
                    nkt nktVar = new nkt(yfx0.a(pex0Var));
                    vfx0 vfx0Var = tix0Var.d;
                    mi31 mi31Var = fnx0Var.a;
                    vfx0Var.getClass();
                    f6v b = ru.yandex.taxi.requirements.utils.c.b(nktVar, vfx0.a(mi31Var));
                    tariffOptionsCardStateInteractor$gluedRequirementsFlow$$inlined$map$1$2$1.L$0 = null;
                    tariffOptionsCardStateInteractor$gluedRequirementsFlow$$inlined$map$1$2$1.L$1 = null;
                    tariffOptionsCardStateInteractor$gluedRequirementsFlow$$inlined$map$1$2$1.L$2 = null;
                    tariffOptionsCardStateInteractor$gluedRequirementsFlow$$inlined$map$1$2$1.L$3 = null;
                    tariffOptionsCardStateInteractor$gluedRequirementsFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(b, tariffOptionsCardStateInteractor$gluedRequirementsFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        tariffOptionsCardStateInteractor$gluedRequirementsFlow$$inlined$map$1$2$1 = new TariffOptionsCardStateInteractor$gluedRequirementsFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = tariffOptionsCardStateInteractor$gluedRequirementsFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffOptionsCardStateInteractor$gluedRequirementsFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
