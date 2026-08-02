package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.ui.transport_type_selector;

import defpackage.ab11;
import defpackage.dlq0;
import defpackage.elq0;
import defpackage.ny61;
import defpackage.qa11;
import defpackage.ra11;
import defpackage.tcc;
import defpackage.vom;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ ra11 b;
    public final /* synthetic */ elq0 c;
    public final /* synthetic */ dlq0 w;

    public c(vpr vprVar, ra11 ra11Var, elq0 elq0Var, dlq0 dlq0Var) {
        this.a = vprVar;
        this.b = ra11Var;
        this.c = elq0Var;
        this.w = dlq0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TransportTypeSelectorUiStateInteractor$uiStateFlowInternal$$inlined$map$1$2$1 transportTypeSelectorUiStateInteractor$uiStateFlowInternal$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof TransportTypeSelectorUiStateInteractor$uiStateFlowInternal$$inlined$map$1$2$1) {
            transportTypeSelectorUiStateInteractor$uiStateFlowInternal$$inlined$map$1$2$1 = (TransportTypeSelectorUiStateInteractor$uiStateFlowInternal$$inlined$map$1$2$1) continuation;
            int i2 = transportTypeSelectorUiStateInteractor$uiStateFlowInternal$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transportTypeSelectorUiStateInteractor$uiStateFlowInternal$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = transportTypeSelectorUiStateInteractor$uiStateFlowInternal$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transportTypeSelectorUiStateInteractor$uiStateFlowInternal$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Set set = (Set) obj;
                    ra11 ra11Var = this.b;
                    List<qa11> list = ra11Var.e;
                    ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                    for (qa11 qa11Var : list) {
                        boolean contains = set.contains(qa11Var.a);
                        if (qa11Var.d != contains) {
                            qa11Var = qa11.a(qa11Var, contains);
                        }
                        arrayList.add(qa11Var);
                    }
                    ab11 ab11Var = new ab11(ra11Var.a, com.yandex.go.design.compose.list.a.b(arrayList, vom.S), set.size() >= 2 ? this.c : this.w);
                    transportTypeSelectorUiStateInteractor$uiStateFlowInternal$$inlined$map$1$2$1.L$0 = null;
                    transportTypeSelectorUiStateInteractor$uiStateFlowInternal$$inlined$map$1$2$1.L$1 = null;
                    transportTypeSelectorUiStateInteractor$uiStateFlowInternal$$inlined$map$1$2$1.L$2 = null;
                    transportTypeSelectorUiStateInteractor$uiStateFlowInternal$$inlined$map$1$2$1.L$3 = null;
                    transportTypeSelectorUiStateInteractor$uiStateFlowInternal$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(ab11Var, transportTypeSelectorUiStateInteractor$uiStateFlowInternal$$inlined$map$1$2$1) == coroutineSingletons) {
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
        transportTypeSelectorUiStateInteractor$uiStateFlowInternal$$inlined$map$1$2$1 = new TransportTypeSelectorUiStateInteractor$uiStateFlowInternal$$inlined$map$1$2$1(this, continuation);
        Object obj22 = transportTypeSelectorUiStateInteractor$uiStateFlowInternal$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transportTypeSelectorUiStateInteractor$uiStateFlowInternal$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
