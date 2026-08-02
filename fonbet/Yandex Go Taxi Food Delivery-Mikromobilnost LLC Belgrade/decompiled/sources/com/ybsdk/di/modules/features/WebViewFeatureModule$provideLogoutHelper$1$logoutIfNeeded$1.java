package com.ybsdk.di.modules.features;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.ppp0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.di.modules.features.WebViewFeatureModule$provideLogoutHelper$1$logoutIfNeeded$1", f = "WebViewFeatureModule.kt", l = {310}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class WebViewFeatureModule$provideLogoutHelper$1$logoutIfNeeded$1 extends SuspendLambda implements wls {
    final /* synthetic */ ppp0 $passportManager;
    final /* synthetic */ String $token;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewFeatureModule$provideLogoutHelper$1$logoutIfNeeded$1(String str, ppp0 ppp0Var, Continuation continuation) {
        super(2, continuation);
        this.$token = str;
        this.$passportManager = ppp0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WebViewFeatureModule$provideLogoutHelper$1$logoutIfNeeded$1(this.$token, this.$passportManager, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WebViewFeatureModule$provideLogoutHelper$1$logoutIfNeeded$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            String str = this.$token;
            if (str != null) {
                ppp0 ppp0Var = this.$passportManager;
                this.label = 1;
                if (((com.ybsdk.feature.passport.impl.a) ppp0Var).a(str, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            ((Result) obj).getClass();
        }
        return zy11.a;
    }
}
