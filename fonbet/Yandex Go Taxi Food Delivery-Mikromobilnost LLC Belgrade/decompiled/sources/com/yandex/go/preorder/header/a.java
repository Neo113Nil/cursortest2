package com.yandex.go.preorder.header;

import defpackage.ik31;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.vpr;
import defpackage.ycc;
import defpackage.za31;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar, g gVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009d, code lost:
    
        if (r2.size() != 1) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MainScreenRidaHeaderStateInteractor$singleUnavailableTariffFlow$$inlined$map$1$2$1 mainScreenRidaHeaderStateInteractor$singleUnavailableTariffFlow$$inlined$map$1$2$1;
        int i;
        Object obj2;
        if (continuation instanceof MainScreenRidaHeaderStateInteractor$singleUnavailableTariffFlow$$inlined$map$1$2$1) {
            mainScreenRidaHeaderStateInteractor$singleUnavailableTariffFlow$$inlined$map$1$2$1 = (MainScreenRidaHeaderStateInteractor$singleUnavailableTariffFlow$$inlined$map$1$2$1) continuation;
            int i2 = mainScreenRidaHeaderStateInteractor$singleUnavailableTariffFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mainScreenRidaHeaderStateInteractor$singleUnavailableTariffFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = mainScreenRidaHeaderStateInteractor$singleUnavailableTariffFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mainScreenRidaHeaderStateInteractor$singleUnavailableTariffFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    ik31 ik31Var = (ik31) obj;
                    List list = ik31Var.a.a;
                    pex0 pex0Var = ik31Var.b.a;
                    if (pex0Var.u) {
                        List<za31> list2 = list;
                        Iterator it = list2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            if (((za31) obj2).a.c()) {
                                break;
                            }
                        }
                        za31 za31Var = (za31) obj2;
                        if (za31Var == null || (r2 = za31Var.b) == null) {
                            List arrayList = new ArrayList();
                            for (za31 za31Var2 : list2) {
                                ycc.r(jl40.l(za31Var2.d, "") ? za31Var2.b : EmptyList.a, arrayList);
                            }
                        }
                    }
                    pex0Var = null;
                    mainScreenRidaHeaderStateInteractor$singleUnavailableTariffFlow$$inlined$map$1$2$1.L$0 = null;
                    mainScreenRidaHeaderStateInteractor$singleUnavailableTariffFlow$$inlined$map$1$2$1.L$1 = null;
                    mainScreenRidaHeaderStateInteractor$singleUnavailableTariffFlow$$inlined$map$1$2$1.L$2 = null;
                    mainScreenRidaHeaderStateInteractor$singleUnavailableTariffFlow$$inlined$map$1$2$1.L$3 = null;
                    mainScreenRidaHeaderStateInteractor$singleUnavailableTariffFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(pex0Var, mainScreenRidaHeaderStateInteractor$singleUnavailableTariffFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj3);
                }
                return zy11.a;
            }
        }
        mainScreenRidaHeaderStateInteractor$singleUnavailableTariffFlow$$inlined$map$1$2$1 = new MainScreenRidaHeaderStateInteractor$singleUnavailableTariffFlow$$inlined$map$1$2$1(this, continuation);
        Object obj32 = mainScreenRidaHeaderStateInteractor$singleUnavailableTariffFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mainScreenRidaHeaderStateInteractor$singleUnavailableTariffFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
