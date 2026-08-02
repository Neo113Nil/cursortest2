package com.yandex.passport.internal.ui.social.authenticators;

import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.analytics.AnalyticsFromValue;
import com.yandex.passport.internal.credentials.CredentialProvider;
import com.yandex.passport.internal.entities.Code;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.social.authenticators.AuthSocialViewModel$onBrowserSocialSuccess$1", f = "AuthSocialViewModel.kt", l = {378}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AuthSocialViewModel$onBrowserSocialSuccess$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $codeValue;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthSocialViewModel$onBrowserSocialSuccess$1(c cVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$codeValue = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AuthSocialViewModel$onBrowserSocialSuccess$1(this.this$0, this.$codeValue, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AuthSocialViewModel$onBrowserSocialSuccess$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AnalyticsFromValue analyticsFromValue;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.passport.internal.usecase.authorize.d dVar = this.this$0.D;
            Code code = new Code(this.this$0.b.getFilter().getPrimaryEnvironment(), this.$codeValue, Integer.MAX_VALUE);
            String str = this.this$0.K;
            AnalyticsFromValue.Companion.getClass();
            analyticsFromValue = AnalyticsFromValue.SOCIAL_BROWSER;
            com.yandex.passport.internal.usecase.authorize.c cVar = new com.yandex.passport.internal.usecase.authorize.c(code, str, CredentialProvider.FromProperties.INSTANCE, analyticsFromValue.withLoginSdk(this.this$0.b.isFromAuthSdk()));
            this.label = 1;
            obj = dVar.a(cVar, this);
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
        c cVar2 = this.this$0;
        Throwable a = Result.a(value);
        if (a == null) {
            cVar2.e0((ModernAccount) value);
        } else {
            cVar2.c0(a);
        }
        return zy11.a;
    }
}
