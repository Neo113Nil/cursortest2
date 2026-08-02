package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.api.exception.PassportAccountNotFoundException;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.credentials.ClientCredentials;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lcom/yandex/passport/internal/entities/ClientToken;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.methods.performer.GetTokenPerformer$getToken$1", f = "GetTokenPerformer.kt", l = {38}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class GetTokenPerformer$getToken$1 extends SuspendLambda implements wls {
    final /* synthetic */ ClientCredentials $clientCredentials;
    final /* synthetic */ Uid $uid;
    int label;
    final /* synthetic */ m0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTokenPerformer$getToken$1(m0 m0Var, Uid uid, ClientCredentials clientCredentials, Continuation continuation) {
        super(2, continuation);
        this.this$0 = m0Var;
        this.$uid = uid;
        this.$clientCredentials = clientCredentials;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GetTokenPerformer$getToken$1(this.this$0, this.$uid, this.$clientCredentials, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GetTokenPerformer$getToken$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        Uid uid = this.$uid;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "getToken: uid=" + uid, 8);
        }
        m0 m0Var = this.this$0;
        Uid uid2 = this.$uid;
        ModernAccount e = m0Var.a.a().e(uid2);
        if (e == null) {
            throw new PassportAccountNotFoundException(uid2);
        }
        com.yandex.passport.internal.usecase.h0 h0Var = this.this$0.b;
        com.yandex.passport.internal.usecase.g0 g0Var = new com.yandex.passport.internal.usecase.g0(e, this.$clientCredentials, 4);
        this.label = 1;
        Object a = h0Var.a(g0Var, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
