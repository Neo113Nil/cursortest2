package com.yandex.passport.internal.ui.bouncer;

import android.os.Bundle;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.ui.bouncer.model.d2;
import com.yandex.passport.internal.ui.bouncer.model.m2;
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
@mvg(c = "com.yandex.passport.internal.ui.bouncer.BouncerActivity$onCreate$8$1", f = "BouncerActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class BouncerActivity$onCreate$8$1 extends SuspendLambda implements wls {
    final /* synthetic */ LoginProperties $loginProperties;
    final /* synthetic */ Bundle $savedInstanceState;
    int label;
    final /* synthetic */ BouncerActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BouncerActivity$onCreate$8$1(Bundle bundle, LoginProperties loginProperties, BouncerActivity bouncerActivity, Continuation continuation) {
        super(2, continuation);
        this.$savedInstanceState = bundle;
        this.$loginProperties = loginProperties;
        this.this$0 = bouncerActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BouncerActivity$onCreate$8$1(this.$savedInstanceState, this.$loginProperties, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        BouncerActivity$onCreate$8$1 bouncerActivity$onCreate$8$1 = (BouncerActivity$onCreate$8$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        bouncerActivity$onCreate$8$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        c cVar;
        c cVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (this.$savedInstanceState != null || this.$loginProperties.getSelectAccountParams() == null) {
            cVar = this.this$0.component;
            (cVar != null ? cVar : null).getWishSource().a(new d2(this.$loginProperties));
        } else {
            cVar2 = this.this$0.component;
            (cVar2 != null ? cVar2 : null).getWishSource().a(new m2(com.yandex.passport.internal.util.p.B(this.$loginProperties.getSelectAccountParams().getUid()), this.$loginProperties));
        }
        return zy11.a;
    }
}
