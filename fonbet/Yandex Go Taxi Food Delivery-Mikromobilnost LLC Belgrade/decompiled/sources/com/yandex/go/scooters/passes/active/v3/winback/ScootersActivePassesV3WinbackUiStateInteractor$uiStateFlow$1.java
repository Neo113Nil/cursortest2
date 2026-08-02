package com.yandex.go.scooters.passes.active.v3.winback;

import defpackage.bms;
import defpackage.bvf0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qum0;
import defpackage.rum0;
import defpackage.zum0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Lzum0;", "winbackInfo", "", "inProgress", "Lpum0;", "<anonymous>", "(Lru/yandex/taxi/theme/ThemeType;Lzum0;Z)Lpum0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.passes.active.v3.winback.ScootersActivePassesV3WinbackUiStateInteractor$uiStateFlow$1", f = "ScootersActivePassesV3WinbackUiStateInteractor.kt", l = {28}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersActivePassesV3WinbackUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ qum0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersActivePassesV3WinbackUiStateInteractor$uiStateFlow$1(qum0 qum0Var, Continuation continuation) {
        super(4, continuation);
        this.this$0 = qum0Var;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        ScootersActivePassesV3WinbackUiStateInteractor$uiStateFlow$1 scootersActivePassesV3WinbackUiStateInteractor$uiStateFlow$1 = new ScootersActivePassesV3WinbackUiStateInteractor$uiStateFlow$1(this.this$0, (Continuation) obj4);
        scootersActivePassesV3WinbackUiStateInteractor$uiStateFlow$1.L$0 = (zum0) obj2;
        scootersActivePassesV3WinbackUiStateInteractor$uiStateFlow$1.Z$0 = booleanValue;
        return scootersActivePassesV3WinbackUiStateInteractor$uiStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zum0 zum0Var = (zum0) this.L$0;
        boolean z = this.Z$0;
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
        rum0 rum0Var = this.this$0.c;
        this.L$0 = null;
        this.Z$0 = z;
        this.label = 1;
        rum0Var.getClass();
        Object n = bvf0.n(new ScootersActivePassesV3WinbackUiStateMapper$mapToUiState$2(zum0Var, z, rum0Var, null), this);
        return n == coroutineSingletons ? coroutineSingletons : n;
    }
}
