package com.yandex.messaging.profile;

import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.profile.ProfileHolder$onNewProfile$1", f = "ProfileHolder.kt", l = {72}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class ProfileHolder$onNewProfile$1 extends SuspendLambda implements wls {
    final /* synthetic */ noh $profilePromise;
    Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileHolder$onNewProfile$1(d dVar, noh nohVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$profilePromise = nohVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProfileHolder$onNewProfile$1(this.this$0, this.$profilePromise, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ProfileHolder$onNewProfile$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        pz40 pz40Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            r0 r0Var = this.this$0.c;
            noh nohVar = this.$profilePromise;
            this.L$0 = r0Var;
            this.label = 1;
            Object k = nohVar.k(this);
            if (k == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = k;
            pz40Var = r0Var;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            pz40Var = (pz40) this.L$0;
            kotlin.b.b(obj);
        }
        ((r0) pz40Var).l(obj);
        return zy11.a;
    }
}
