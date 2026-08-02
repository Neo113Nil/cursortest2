package com.yandex.go.superapp.order_tracking.eats.domain;

import defpackage.d3p;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.w201;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ String b;

    public a(vpr vprVar, String str) {
        this.a = vprVar;
        this.b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        EatsOrderDetailsUiStateInteractor$observeUiState$$inlined$mapNotNull$1$2$1 eatsOrderDetailsUiStateInteractor$observeUiState$$inlined$mapNotNull$1$2$1;
        int i;
        Object obj2;
        if (continuation instanceof EatsOrderDetailsUiStateInteractor$observeUiState$$inlined$mapNotNull$1$2$1) {
            eatsOrderDetailsUiStateInteractor$observeUiState$$inlined$mapNotNull$1$2$1 = (EatsOrderDetailsUiStateInteractor$observeUiState$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = eatsOrderDetailsUiStateInteractor$observeUiState$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eatsOrderDetailsUiStateInteractor$observeUiState$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = eatsOrderDetailsUiStateInteractor$observeUiState$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = eatsOrderDetailsUiStateInteractor$observeUiState$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    Iterator it = ((List) obj).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (jl40.l(((w201) obj2).getId(), this.b)) {
                            break;
                        }
                    }
                    d3p d3pVar = obj2 instanceof d3p ? (d3p) obj2 : null;
                    if (d3pVar != null) {
                        eatsOrderDetailsUiStateInteractor$observeUiState$$inlined$mapNotNull$1$2$1.L$0 = null;
                        eatsOrderDetailsUiStateInteractor$observeUiState$$inlined$mapNotNull$1$2$1.L$1 = null;
                        eatsOrderDetailsUiStateInteractor$observeUiState$$inlined$mapNotNull$1$2$1.L$2 = null;
                        eatsOrderDetailsUiStateInteractor$observeUiState$$inlined$mapNotNull$1$2$1.L$3 = null;
                        eatsOrderDetailsUiStateInteractor$observeUiState$$inlined$mapNotNull$1$2$1.L$4 = null;
                        eatsOrderDetailsUiStateInteractor$observeUiState$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(d3pVar, eatsOrderDetailsUiStateInteractor$observeUiState$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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
        eatsOrderDetailsUiStateInteractor$observeUiState$$inlined$mapNotNull$1$2$1 = new EatsOrderDetailsUiStateInteractor$observeUiState$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj32 = eatsOrderDetailsUiStateInteractor$observeUiState$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = eatsOrderDetailsUiStateInteractor$observeUiState$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
