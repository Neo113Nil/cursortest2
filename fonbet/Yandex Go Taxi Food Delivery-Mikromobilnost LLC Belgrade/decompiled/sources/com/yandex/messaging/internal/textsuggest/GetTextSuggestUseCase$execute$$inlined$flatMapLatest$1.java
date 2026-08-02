package com.yandex.messaging.internal.textsuggest;

import defpackage.eci0;
import defpackage.m8g;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s020;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.textsuggest.GetTextSuggestUseCase$execute$$inlined$flatMapLatest$1", f = "GetTextSuggestUseCase.kt", l = {189}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class GetTextSuggestUseCase$execute$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ String $queryId$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTextSuggestUseCase$execute$$inlined$flatMapLatest$1(String str, Continuation continuation) {
        super(3, continuation);
        this.$queryId$inlined = str;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GetTextSuggestUseCase$execute$$inlined$flatMapLatest$1 getTextSuggestUseCase$execute$$inlined$flatMapLatest$1 = new GetTextSuggestUseCase$execute$$inlined$flatMapLatest$1(this.$queryId$inlined, (Continuation) obj3);
        getTextSuggestUseCase$execute$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        getTextSuggestUseCase$execute$$inlined$flatMapLatest$1.L$1 = obj2;
        return getTextSuggestUseCase$execute$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        vpr vprVar = (vpr) this.L$0;
        eci0 eci0Var = ((com.yandex.messaging.internal.authorized.textsuggest.b) ((m8g) ((s020) this.L$1)).B0.get()).h;
        String str = this.$queryId$inlined;
        this.label = 1;
        e.w(vprVar);
        Object collect = eci0Var.a.collect(new b(new c(vprVar), str), this);
        if (collect != coroutineSingletons) {
            collect = zy11Var;
        }
        if (collect != coroutineSingletons) {
            collect = zy11Var;
        }
        if (collect != coroutineSingletons) {
            collect = zy11Var;
        }
        return collect == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
