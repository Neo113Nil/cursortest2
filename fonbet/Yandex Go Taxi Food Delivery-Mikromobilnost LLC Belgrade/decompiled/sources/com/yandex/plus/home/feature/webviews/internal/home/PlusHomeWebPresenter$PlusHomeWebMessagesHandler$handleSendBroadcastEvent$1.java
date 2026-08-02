package com.yandex.plus.home.feature.webviews.internal.home;

import defpackage.bv80;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.feature.webviews.internal.home.PlusHomeWebPresenter$PlusHomeWebMessagesHandler$handleSendBroadcastEvent$1", f = "PlusHomeWebPresenter.kt", l = {725}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PlusHomeWebPresenter$PlusHomeWebMessagesHandler$handleSendBroadcastEvent$1 extends SuspendLambda implements wls {
    final /* synthetic */ bv80 $outMessage;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusHomeWebPresenter$PlusHomeWebMessagesHandler$handleSendBroadcastEvent$1(d dVar, bv80 bv80Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$outMessage = bv80Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlusHomeWebPresenter$PlusHomeWebMessagesHandler$handleSendBroadcastEvent$1(this.this$0, this.$outMessage, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlusHomeWebPresenter$PlusHomeWebMessagesHandler$handleSendBroadcastEvent$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.plus.home.feature.webviews.internal.d dVar = this.this$0.v;
            bv80 bv80Var = this.$outMessage;
            this.label = 1;
            if (dVar.a(bv80Var, this) == coroutineSingletons) {
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
