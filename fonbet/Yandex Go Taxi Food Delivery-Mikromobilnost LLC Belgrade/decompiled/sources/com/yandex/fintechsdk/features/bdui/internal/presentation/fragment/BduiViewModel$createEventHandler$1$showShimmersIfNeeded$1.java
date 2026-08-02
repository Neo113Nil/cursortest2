package com.yandex.fintechsdk.features.bdui.internal.presentation.fragment;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.qh5;
import defpackage.ug5;
import defpackage.v7w;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv7w;", "Lzy11;", "Lrh5;", "<anonymous>", "(Lv7w;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.fintechsdk.features.bdui.internal.presentation.fragment.BduiViewModel$createEventHandler$1$showShimmersIfNeeded$1", f = "BduiViewModel.kt", l = {262}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class BduiViewModel$createEventHandler$1$showShimmersIfNeeded$1 extends SuspendLambda implements wls {
    final /* synthetic */ ug5 $query;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BduiViewModel$createEventHandler$1$showShimmersIfNeeded$1(ug5 ug5Var, b bVar, Continuation continuation) {
        super(2, continuation);
        this.$query = ug5Var;
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BduiViewModel$createEventHandler$1$showShimmersIfNeeded$1 bduiViewModel$createEventHandler$1$showShimmersIfNeeded$1 = new BduiViewModel$createEventHandler$1$showShimmersIfNeeded$1(this.$query, this.this$0, continuation);
        bduiViewModel$createEventHandler$1$showShimmersIfNeeded$1.L$0 = obj;
        return bduiViewModel$createEventHandler$1$showShimmersIfNeeded$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BduiViewModel$createEventHandler$1$showShimmersIfNeeded$1) create((v7w) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            v7w v7wVar = (v7w) this.L$0;
            ug5 ug5Var = this.$query;
            if (ug5Var != null && b.a(this.this$0, ug5Var)) {
                this.label = 1;
                if (com.yandex.fintechsdk.core.architecture.api.mvi.b.d(v7wVar, qh5.a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
