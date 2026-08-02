package com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.HomeButtonSectionDelegate$requestSubscriptionInfo$1", f = "HomeButtonSectionDelegate.kt", l = {46}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class HomeButtonSectionDelegate$requestSubscriptionInfo$1 extends SuspendLambda implements tls {
    final /* synthetic */ String $message;
    final /* synthetic */ String $place;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeButtonSectionDelegate$requestSubscriptionInfo$1(e eVar, String str, String str2, Continuation continuation) {
        super(1, continuation);
        this.this$0 = eVar;
        this.$message = str;
        this.$place = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new HomeButtonSectionDelegate$requestSubscriptionInfo$1(this.this$0, this.$message, this.$place, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((HomeButtonSectionDelegate$requestSubscriptionInfo$1) create((Continuation) obj)).invokeSuspend(zy11.a);
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
        com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.f fVar = this.this$0.k;
        String str = this.$message;
        String str2 = this.$place;
        this.label = 1;
        Object a = fVar.a.a(str, str2, this);
        if (a != coroutineSingletons) {
            a = zy11Var;
        }
        return a == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
