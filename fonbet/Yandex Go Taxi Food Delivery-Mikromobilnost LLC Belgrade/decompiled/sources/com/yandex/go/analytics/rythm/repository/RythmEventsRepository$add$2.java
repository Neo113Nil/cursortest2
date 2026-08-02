package com.yandex.go.analytics.rythm.repository;

import defpackage.cm2;
import defpackage.ell0;
import defpackage.g050;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xnt;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)I"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.analytics.rythm.repository.RythmEventsRepository$add$2", f = "RythmEventsRepository.kt", l = {111}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class RythmEventsRepository$add$2 extends SuspendLambda implements wls {
    final /* synthetic */ ell0 $event;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RythmEventsRepository$add$2(a aVar, ell0 ell0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$event = ell0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RythmEventsRepository$add$2(this.this$0, this.$event, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RythmEventsRepository$add$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a aVar;
        g050 g050Var;
        ell0 ell0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            aVar = this.this$0;
            kotlinx.coroutines.sync.a aVar2 = aVar.c;
            ell0 ell0Var2 = this.$event;
            this.L$0 = aVar2;
            this.L$1 = aVar;
            this.L$2 = ell0Var2;
            this.label = 1;
            if (aVar2.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            g050Var = aVar2;
            ell0Var = ell0Var2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ell0Var = (ell0) this.L$2;
            aVar = (a) this.L$1;
            g050Var = (g050) this.L$0;
            b.b(obj);
        }
        try {
            String a = a.a(aVar, ell0Var.a);
            ArrayList o0 = kotlin.collections.a.o0(a.b(aVar, a), ((xnt) aVar.a).e(ell0Var.b, cm2.a));
            aVar.d.s(a, ";", o0);
            return new Integer(o0.size());
        } finally {
            g050Var.d(null);
        }
    }
}
