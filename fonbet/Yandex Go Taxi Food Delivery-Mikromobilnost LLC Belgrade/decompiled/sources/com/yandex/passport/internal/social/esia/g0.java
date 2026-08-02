package com.yandex.passport.internal.social.esia;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class g0 implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ com.arkivanov.mvikotlin.extensions.coroutines.a b;
    public final /* synthetic */ i0 c;

    public g0(vpr vprVar, com.arkivanov.mvikotlin.extensions.coroutines.a aVar, i0 i0Var) {
        this.a = vprVar;
        this.b = aVar;
        this.c = i0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        EsiaBindViewModel$special$$inlined$mapStateful$2$2$1 esiaBindViewModel$special$$inlined$mapStateful$2$2$1;
        int i;
        if (continuation instanceof EsiaBindViewModel$special$$inlined$mapStateful$2$2$1) {
            esiaBindViewModel$special$$inlined$mapStateful$2$2$1 = (EsiaBindViewModel$special$$inlined$mapStateful$2$2$1) continuation;
            int i2 = esiaBindViewModel$special$$inlined$mapStateful$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                esiaBindViewModel$special$$inlined$mapStateful$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = esiaBindViewModel$special$$inlined$mapStateful$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = esiaBindViewModel$special$$inlined$mapStateful$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    EsiaBindViewModel$InternalState esiaBindViewModel$InternalState = (EsiaBindViewModel$InternalState) this.b.getValue();
                    this.c.c.a("KEY_STATE", esiaBindViewModel$InternalState);
                    EsiaBindViewModel$State uiState = esiaBindViewModel$InternalState.getUiState();
                    esiaBindViewModel$special$$inlined$mapStateful$2$2$1.label = 1;
                    if (this.a.emit(uiState, esiaBindViewModel$special$$inlined$mapStateful$2$2$1) == coroutineSingletons) {
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
        esiaBindViewModel$special$$inlined$mapStateful$2$2$1 = new EsiaBindViewModel$special$$inlined$mapStateful$2$2$1(this, continuation);
        Object obj22 = esiaBindViewModel$special$$inlined$mapStateful$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = esiaBindViewModel$special$$inlined$mapStateful$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
