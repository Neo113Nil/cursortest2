package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.interactor;

import defpackage.je31;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.rsn;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class o implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ q b;

    public o(vpr vprVar, q qVar) {
        this.a = vprVar;
        this.b = qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        VerticalHubV2UiStateInteractor$uiStateFlow$$inlined$map$1$2$1 verticalHubV2UiStateInteractor$uiStateFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof VerticalHubV2UiStateInteractor$uiStateFlow$$inlined$map$1$2$1) {
            verticalHubV2UiStateInteractor$uiStateFlow$$inlined$map$1$2$1 = (VerticalHubV2UiStateInteractor$uiStateFlow$$inlined$map$1$2$1) continuation;
            int i2 = verticalHubV2UiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                verticalHubV2UiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = verticalHubV2UiStateInteractor$uiStateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verticalHubV2UiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    rsn rsnVar = (rsn) obj;
                    je31 je31Var = (je31) rsnVar.a;
                    je31 je31Var2 = (je31) rsnVar.b;
                    if (!jl40.l(je31Var != null ? je31Var.c : null, je31Var2.c)) {
                        this.b.f.a = false;
                    }
                    verticalHubV2UiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$0 = null;
                    verticalHubV2UiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$1 = null;
                    verticalHubV2UiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$2 = null;
                    verticalHubV2UiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$3 = null;
                    verticalHubV2UiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(je31Var2, verticalHubV2UiStateInteractor$uiStateFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        verticalHubV2UiStateInteractor$uiStateFlow$$inlined$map$1$2$1 = new VerticalHubV2UiStateInteractor$uiStateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = verticalHubV2UiStateInteractor$uiStateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verticalHubV2UiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
