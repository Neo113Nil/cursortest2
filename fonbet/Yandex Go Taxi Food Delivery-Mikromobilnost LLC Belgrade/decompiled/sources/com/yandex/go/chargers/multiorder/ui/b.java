package com.yandex.go.chargers.multiorder.ui;

import defpackage.jl40;
import defpackage.ny61;
import defpackage.u5a;
import defpackage.uda;
import defpackage.v5a;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;

    public b(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ChargersMultiOrderPresenter$observeLayersConditionChange$$inlined$map$1$2$1 chargersMultiOrderPresenter$observeLayersConditionChange$$inlined$map$1$2$1;
        int i;
        kotlinx.serialization.json.b bVar;
        Object obj2;
        if (continuation instanceof ChargersMultiOrderPresenter$observeLayersConditionChange$$inlined$map$1$2$1) {
            chargersMultiOrderPresenter$observeLayersConditionChange$$inlined$map$1$2$1 = (ChargersMultiOrderPresenter$observeLayersConditionChange$$inlined$map$1$2$1) continuation;
            int i2 = chargersMultiOrderPresenter$observeLayersConditionChange$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersMultiOrderPresenter$observeLayersConditionChange$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = chargersMultiOrderPresenter$observeLayersConditionChange$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersMultiOrderPresenter$observeLayersConditionChange$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    u5a u5aVar = ((v5a) obj).d;
                    if (u5aVar != null) {
                        String str = u5aVar.b;
                        Iterator it = u5aVar.a.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            if (jl40.l(((uda) obj2).a, str)) {
                                break;
                            }
                        }
                        uda udaVar = (uda) obj2;
                        if (udaVar != null) {
                            bVar = udaVar.c;
                            chargersMultiOrderPresenter$observeLayersConditionChange$$inlined$map$1$2$1.L$0 = null;
                            chargersMultiOrderPresenter$observeLayersConditionChange$$inlined$map$1$2$1.L$1 = null;
                            chargersMultiOrderPresenter$observeLayersConditionChange$$inlined$map$1$2$1.L$2 = null;
                            chargersMultiOrderPresenter$observeLayersConditionChange$$inlined$map$1$2$1.L$3 = null;
                            chargersMultiOrderPresenter$observeLayersConditionChange$$inlined$map$1$2$1.label = 1;
                            if (this.a.emit(bVar, chargersMultiOrderPresenter$observeLayersConditionChange$$inlined$map$1$2$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    bVar = null;
                    chargersMultiOrderPresenter$observeLayersConditionChange$$inlined$map$1$2$1.L$0 = null;
                    chargersMultiOrderPresenter$observeLayersConditionChange$$inlined$map$1$2$1.L$1 = null;
                    chargersMultiOrderPresenter$observeLayersConditionChange$$inlined$map$1$2$1.L$2 = null;
                    chargersMultiOrderPresenter$observeLayersConditionChange$$inlined$map$1$2$1.L$3 = null;
                    chargersMultiOrderPresenter$observeLayersConditionChange$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(bVar, chargersMultiOrderPresenter$observeLayersConditionChange$$inlined$map$1$2$1) == coroutineSingletons) {
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
        chargersMultiOrderPresenter$observeLayersConditionChange$$inlined$map$1$2$1 = new ChargersMultiOrderPresenter$observeLayersConditionChange$$inlined$map$1$2$1(this, continuation);
        Object obj32 = chargersMultiOrderPresenter$observeLayersConditionChange$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersMultiOrderPresenter$observeLayersConditionChange$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
