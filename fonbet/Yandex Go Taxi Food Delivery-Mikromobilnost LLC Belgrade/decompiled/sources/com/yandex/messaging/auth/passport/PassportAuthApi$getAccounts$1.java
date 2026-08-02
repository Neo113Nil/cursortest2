package com.yandex.messaging.auth.passport;

import com.yandex.passport.internal.entities.Filter;
import com.yandex.passport.internal.impl.f;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.una1;
import defpackage.vh3;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "Lkotlin/Result;", "", "Lcom/yandex/passport/api/i;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.auth.passport.PassportAuthApi$getAccounts$1", f = "PassportAuthApi.kt", l = {HProv.PP_DHOID}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class PassportAuthApi$getAccounts$1 extends SuspendLambda implements wls {
    final /* synthetic */ vh3 $filter;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassportAuthApi$getAccounts$1(b bVar, vh3 vh3Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$filter = vh3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PassportAuthApi$getAccounts$1(this.this$0, this.$filter, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PassportAuthApi$getAccounts$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object o;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            f fVar = this.this$0.b;
            Filter c = una1.c(this.$filter);
            this.label = 1;
            o = fVar.o(c, this);
            if (o == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            o = ((Result) obj).getValue();
        }
        return new Result(o);
    }
}
