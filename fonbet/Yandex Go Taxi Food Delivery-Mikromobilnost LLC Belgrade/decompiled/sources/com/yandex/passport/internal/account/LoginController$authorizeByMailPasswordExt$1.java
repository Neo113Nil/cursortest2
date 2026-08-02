package com.yandex.passport.internal.account;

import com.yandex.passport.api.PassportSocialProviderCode;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.internal.analytics.AnalyticsFromValue;
import com.yandex.passport.internal.h;
import com.yandex.passport.internal.usecase.n;
import com.yandex.passport.internal.usecase.o;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lcom/yandex/passport/internal/ModernAccount;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.account.LoginController$authorizeByMailPasswordExt$1", f = "LoginController.kt", l = {157}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class LoginController$authorizeByMailPasswordExt$1 extends SuspendLambda implements wls {
    final /* synthetic */ Environment $environment;
    final /* synthetic */ h $extAuthCredits;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginController$authorizeByMailPasswordExt$1(c cVar, Environment environment, h hVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$environment = environment;
        this.$extAuthCredits = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LoginController$authorizeByMailPasswordExt$1(this.this$0, this.$environment, this.$extAuthCredits, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LoginController$authorizeByMailPasswordExt$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AnalyticsFromValue analyticsFromValue;
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
        n nVar = this.this$0.j;
        PassportSocialProviderCode passportSocialProviderCode = PassportSocialProviderCode.OTHER;
        AnalyticsFromValue.Companion.getClass();
        analyticsFromValue = AnalyticsFromValue.MAILISH_GIMAP;
        o oVar = new o(this.$environment, 0L, this.this$0.a.a(this.$environment).k(this.$extAuthCredits), passportSocialProviderCode, analyticsFromValue);
        this.label = 1;
        Object a = nVar.a(oVar, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
