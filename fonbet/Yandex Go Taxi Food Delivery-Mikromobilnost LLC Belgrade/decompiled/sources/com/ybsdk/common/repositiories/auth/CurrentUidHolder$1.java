package com.ybsdk.common.repositiories.auth;

import defpackage.bif;
import defpackage.cif;
import defpackage.dif;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zmp0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.common.repositiories.auth.CurrentUidHolder$1", f = "CurrentUidHolder.kt", l = {31}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CurrentUidHolder$1 extends SuspendLambda implements wls {
    final /* synthetic */ zmp0 $sdkAuthStorage;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CurrentUidHolder$1(zmp0 zmp0Var, f fVar, Continuation continuation) {
        super(2, continuation);
        this.$sdkAuthStorage = zmp0Var;
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CurrentUidHolder$1(this.$sdkAuthStorage, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CurrentUidHolder$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            zmp0 zmp0Var = this.$sdkAuthStorage;
            this.label = 1;
            obj = ((com.ybsdk.persistence.a) zmp0Var).a(this);
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
        Long l = (Long) obj;
        r0 r0Var = this.this$0.a;
        do {
            value = r0Var.getValue();
            obj2 = (dif) value;
            if (jl40.l(obj2, cif.a)) {
                obj2 = new bif(l);
            }
        } while (!r0Var.k(value, obj2));
        return zy11.a;
    }
}
