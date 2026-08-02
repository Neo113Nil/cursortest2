package com.yandex.passport.internal.account;

import com.yandex.passport.api.PassportSocialProviderCode;
import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.internal.analytics.AnalyticsFromValue;
import com.yandex.passport.internal.usecase.o;
import com.yandex.passport.internal.usecase.p;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/passport/internal/ModernAccount;", "<anonymous>", "(Ltse;)Lcom/yandex/passport/internal/ModernAccount;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.account.LoginController$fetchModernAccount$1", f = "LoginController.kt", l = {321}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class LoginController$fetchModernAccount$1 extends SuspendLambda implements wls {
    final /* synthetic */ AnalyticsFromValue $analyticsFromValue;
    final /* synthetic */ Environment $environment;
    final /* synthetic */ MasterToken $masterToken;
    final /* synthetic */ PassportSocialProviderCode $socialCode;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginController$fetchModernAccount$1(c cVar, Environment environment, MasterToken masterToken, PassportSocialProviderCode passportSocialProviderCode, AnalyticsFromValue analyticsFromValue, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$environment = environment;
        this.$masterToken = masterToken;
        this.$socialCode = passportSocialProviderCode;
        this.$analyticsFromValue = analyticsFromValue;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LoginController$fetchModernAccount$1(this.this$0, this.$environment, this.$masterToken, this.$socialCode, this.$analyticsFromValue, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LoginController$fetchModernAccount$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            p pVar = this.this$0.h;
            o oVar = new o(this.$environment, 0L, this.$masterToken, this.$socialCode, this.$analyticsFromValue);
            this.label = 1;
            obj = pVar.a(oVar, this);
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
        Object value = ((Result) obj).getValue();
        kotlin.b.b(value);
        return value;
    }
}
