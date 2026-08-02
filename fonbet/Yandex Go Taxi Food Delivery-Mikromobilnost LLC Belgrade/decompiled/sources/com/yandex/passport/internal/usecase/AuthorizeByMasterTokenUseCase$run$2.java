package com.yandex.passport.internal.usecase;

import com.yandex.passport.common.exception.InvalidTokenException;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.analytics.AnalyticsFromValue;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lcom/yandex/passport/internal/ModernAccount;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.usecase.AuthorizeByMasterTokenUseCase$run$2", f = "AuthorizeByMasterTokenUseCase.kt", l = {39}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class AuthorizeByMasterTokenUseCase$run$2 extends SuspendLambda implements wls {
    final /* synthetic */ a $params;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthorizeByMasterTokenUseCase$run$2(a aVar, b bVar, Continuation continuation) {
        super(2, continuation);
        this.$params = aVar;
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AuthorizeByMasterTokenUseCase$run$2(this.$params, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AuthorizeByMasterTokenUseCase$run$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a aVar;
        AnalyticsFromValue analyticsFromValue;
        b bVar;
        AnalyticsFromValue analyticsFromValue2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            aVar = this.$params;
            b bVar2 = this.this$0;
            AnalyticsFromValue.Companion.getClass();
            analyticsFromValue = AnalyticsFromValue.MAILISH_EXTERNAL;
            p pVar = bVar2.b;
            o oVar = new o(aVar.a, 0L, aVar.b, null, analyticsFromValue);
            this.L$0 = bVar2;
            this.L$1 = aVar;
            this.L$2 = analyticsFromValue;
            this.label = 1;
            Object a = pVar.a(oVar, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = a;
            bVar = bVar2;
            analyticsFromValue2 = analyticsFromValue;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            analyticsFromValue2 = (AnalyticsFromValue) this.L$2;
            aVar = (a) this.L$1;
            bVar = (b) this.L$0;
            kotlin.b.b(obj);
        }
        Object value = ((Result) obj).getValue();
        if (!(value instanceof Result.Failure)) {
            ModernAccount modernAccount = (ModernAccount) value;
            if (!aVar.c.isEmpty() && !aVar.c.contains(new Integer(modernAccount.getPrimaryAliasType()))) {
                throw new InvalidTokenException("Invalid token. Wrong account type: " + modernAccount.getPrimaryAliasType());
            }
            value = bVar.c.a(modernAccount, analyticsFromValue2.getEvent(), true);
        }
        return new Result(value);
    }
}
