package com.yandex.go.scooters.passes.active.v3.freeze;

import defpackage.bvf0;
import defpackage.dms;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vrm0;
import defpackage.xum0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Lxum0;", "freezeInfo", "", "autorenewInProgress", "freezeInProgress", "Lurm0;", "<anonymous>", "(Lru/yandex/taxi/theme/ThemeType;Lxum0;ZZ)Lurm0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.passes.active.v3.freeze.ScootersActivePassesV3FreezeUiStateInteractor$uiStateFlow$1", f = "ScootersActivePassesV3FreezeUiStateInteractor.kt", l = {29}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersActivePassesV3FreezeUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements dms {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    int label;
    final /* synthetic */ vrm0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersActivePassesV3FreezeUiStateInteractor$uiStateFlow$1(vrm0 vrm0Var, Continuation continuation) {
        super(5, continuation);
        this.this$0 = vrm0Var;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        boolean booleanValue2 = ((Boolean) obj4).booleanValue();
        ScootersActivePassesV3FreezeUiStateInteractor$uiStateFlow$1 scootersActivePassesV3FreezeUiStateInteractor$uiStateFlow$1 = new ScootersActivePassesV3FreezeUiStateInteractor$uiStateFlow$1(this.this$0, (Continuation) obj5);
        scootersActivePassesV3FreezeUiStateInteractor$uiStateFlow$1.L$0 = (xum0) obj2;
        scootersActivePassesV3FreezeUiStateInteractor$uiStateFlow$1.Z$0 = booleanValue;
        scootersActivePassesV3FreezeUiStateInteractor$uiStateFlow$1.Z$1 = booleanValue2;
        return scootersActivePassesV3FreezeUiStateInteractor$uiStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        xum0 xum0Var = (xum0) this.L$0;
        boolean z = this.Z$0;
        boolean z2 = this.Z$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        d dVar = this.this$0.c;
        this.L$0 = null;
        this.Z$0 = z;
        this.Z$1 = z2;
        this.label = 1;
        dVar.getClass();
        Object n = bvf0.n(new ScootersActivePassesV3FreezeUiStateMapper$mapToUiState$2(xum0Var, z, z2, dVar, null), this);
        return n == coroutineSingletons ? coroutineSingletons : n;
    }
}
