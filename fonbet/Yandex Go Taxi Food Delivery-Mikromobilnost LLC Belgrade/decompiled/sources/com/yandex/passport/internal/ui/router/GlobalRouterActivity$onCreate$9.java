package com.yandex.passport.internal.ui.router;

import android.content.Intent;
import android.os.Bundle;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.router.GlobalRouterActivity$onCreate$9", f = "GlobalRouterActivity.kt", l = {198}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class GlobalRouterActivity$onCreate$9 extends SuspendLambda implements wls {
    final /* synthetic */ Bundle $savedInstanceState;
    int label;
    final /* synthetic */ GlobalRouterActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalRouterActivity$onCreate$9(GlobalRouterActivity globalRouterActivity, Bundle bundle, Continuation continuation) {
        super(2, continuation);
        this.this$0 = globalRouterActivity;
        this.$savedInstanceState = bundle;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GlobalRouterActivity$onCreate$9(this.this$0, this.$savedInstanceState, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GlobalRouterActivity$onCreate$9) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        m viewModel;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            viewModel = this.this$0.getViewModel();
            Intent intent = this.this$0.getIntent();
            boolean z = this.$savedInstanceState != null;
            this.label = 1;
            if (viewModel.W(intent, z, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
