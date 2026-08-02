package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.api.exception.PassportAccountNotAuthorizedException;
import com.yandex.passport.api.exception.PassportAccountNotFoundException;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.ModernAccount;
import defpackage.d6z;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.methods.performer.IsMasterTokenValidPerformer$performMethod$1", f = "IsMasterTokenValidPerformer.kt", l = {25}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class IsMasterTokenValidPerformer$performMethod$1 extends SuspendLambda implements wls {
    final /* synthetic */ Uid $uid;
    int label;
    final /* synthetic */ r0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IsMasterTokenValidPerformer$performMethod$1(r0 r0Var, Uid uid, Continuation continuation) {
        super(2, continuation);
        this.this$0 = r0Var;
        this.$uid = uid;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new IsMasterTokenValidPerformer$performMethod$1(this.this$0, this.$uid, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((IsMasterTokenValidPerformer$performMethod$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ModernAccount e = this.this$0.a.a().e(this.$uid);
            if (e == null) {
                throw new PassportAccountNotFoundException(this.$uid);
            }
            String value = e.getMasterToken().getValue();
            if (value == null) {
                throw new PassportAccountNotAuthorizedException(this.$uid);
            }
            com.yandex.passport.data.network.core.o oVar = this.this$0.b;
            this.label = 1;
            obj = ((com.yandex.passport.internal.network.n) oVar).c(value, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return new Result(d6z.d(obj));
    }
}
