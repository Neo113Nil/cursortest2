package com.yandex.go.masstransit.sdk.checkout.impl.conditions;

import defpackage.bzd;
import defpackage.ie;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.unr0;
import defpackage.vpr;
import defpackage.vyd;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar, ie ieVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ConditionsUiStateInteractor$uiStateFlow$$inlined$map$1$2$1 conditionsUiStateInteractor$uiStateFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ConditionsUiStateInteractor$uiStateFlow$$inlined$map$1$2$1) {
            conditionsUiStateInteractor$uiStateFlow$$inlined$map$1$2$1 = (ConditionsUiStateInteractor$uiStateFlow$$inlined$map$1$2$1) continuation;
            int i2 = conditionsUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                conditionsUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = conditionsUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = conditionsUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    vyd vydVar = (vyd) obj;
                    vydVar.getClass();
                    List list = vydVar.a;
                    ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                    Iterator it = list.iterator();
                    if (it.hasNext()) {
                        throw unr0.i(it);
                    }
                    bzd bzdVar = new bzd(arrayList, null);
                    conditionsUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$0 = null;
                    conditionsUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$1 = null;
                    conditionsUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$2 = null;
                    conditionsUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$3 = null;
                    conditionsUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(bzdVar, conditionsUiStateInteractor$uiStateFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        conditionsUiStateInteractor$uiStateFlow$$inlined$map$1$2$1 = new ConditionsUiStateInteractor$uiStateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = conditionsUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = conditionsUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
