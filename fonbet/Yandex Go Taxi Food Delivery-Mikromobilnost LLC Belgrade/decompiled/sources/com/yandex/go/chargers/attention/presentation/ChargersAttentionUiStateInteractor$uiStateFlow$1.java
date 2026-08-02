package com.yandex.go.chargers.attention.presentation;

import defpackage.jn9;
import defpackage.mvg;
import defpackage.nm9;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Lnm9;", "attention", "Lin9;", "<anonymous>", "(Lru/yandex/taxi/theme/ThemeType;Lnm9;)Lin9;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.attention.presentation.ChargersAttentionUiStateInteractor$uiStateFlow$1", f = "ChargersAttentionUiStateInteractor.kt", l = {24}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersAttentionUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ jn9 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersAttentionUiStateInteractor$uiStateFlow$1(jn9 jn9Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = jn9Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ChargersAttentionUiStateInteractor$uiStateFlow$1 chargersAttentionUiStateInteractor$uiStateFlow$1 = new ChargersAttentionUiStateInteractor$uiStateFlow$1(this.this$0, (Continuation) obj3);
        chargersAttentionUiStateInteractor$uiStateFlow$1.L$0 = (nm9) obj2;
        return chargersAttentionUiStateInteractor$uiStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        nm9 nm9Var = (nm9) this.L$0;
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
        a aVar = this.this$0.d;
        this.L$0 = null;
        this.label = 1;
        Object a = aVar.a(nm9Var, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
