package com.yandex.go.analytics.rythm.repository;

import defpackage.cne0;
import defpackage.g050;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.analytics.rythm.repository.RythmEventsRepository$removeEvents$2", f = "RythmEventsRepository.kt", l = {111}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class RythmEventsRepository$removeEvents$2 extends SuspendLambda implements wls {
    final /* synthetic */ int $countFromStart;
    final /* synthetic */ String $eventGroupKey;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RythmEventsRepository$removeEvents$2(a aVar, String str, int i, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$eventGroupKey = str;
        this.$countFromStart = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RythmEventsRepository$removeEvents$2(this.this$0, this.$eventGroupKey, this.$countFromStart, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RythmEventsRepository$removeEvents$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a aVar;
        g050 g050Var;
        String str;
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            b.b(obj);
            a aVar2 = this.this$0;
            kotlinx.coroutines.sync.a aVar3 = aVar2.c;
            String str2 = this.$eventGroupKey;
            int i3 = this.$countFromStart;
            this.L$0 = aVar3;
            this.L$1 = aVar2;
            this.L$2 = str2;
            this.I$0 = i3;
            this.label = 1;
            if (aVar3.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            aVar = aVar2;
            g050Var = aVar3;
            str = str2;
            i = i3;
        } else {
            if (i2 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$0;
            str = (String) this.L$2;
            aVar = (a) this.L$1;
            g050Var = (g050) this.L$0;
            b.b(obj);
        }
        try {
            String a = a.a(aVar, str);
            cne0 cne0Var = aVar.d;
            List J = kotlin.collections.a.J(cne0Var.m(a, ";"), i);
            if (J.isEmpty()) {
                cne0Var.w(a);
            } else {
                cne0Var.s(a, ";", J);
            }
            g050Var.d(null);
            return zy11.a;
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
    }
}
