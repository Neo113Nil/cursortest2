package com.yandex.passport.api.internal.integration;

import com.yandex.passport.internal.account.c;
import com.yandex.passport.internal.analytics.AnalyticsFromValue;
import com.yandex.passport.internal.entities.UserCredentials;
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
@mvg(c = "com.yandex.passport.api.internal.integration.TestInternalDataResponder$authorizeByCredentials$1", f = "TestInternalDataResponder.kt", l = {102}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class TestInternalDataResponder$authorizeByCredentials$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $captchaAnswer;
    final /* synthetic */ UserCredentials $credentials;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TestInternalDataResponder$authorizeByCredentials$1(b bVar, UserCredentials userCredentials, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$credentials = userCredentials;
        this.$captchaAnswer = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TestInternalDataResponder$authorizeByCredentials$1(this.this$0, this.$credentials, this.$captchaAnswer, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TestInternalDataResponder$authorizeByCredentials$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AnalyticsFromValue analyticsFromValue;
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0.b;
            UserCredentials userCredentials = this.$credentials;
            String str = this.$captchaAnswer;
            AnalyticsFromValue.Companion.getClass();
            analyticsFromValue = AnalyticsFromValue.CREDENTIALS;
            this.label = 1;
            a = cVar.a(userCredentials, str, analyticsFromValue, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            a = ((Result) obj).getValue();
        }
        kotlin.b.b(a);
        return a;
    }
}
