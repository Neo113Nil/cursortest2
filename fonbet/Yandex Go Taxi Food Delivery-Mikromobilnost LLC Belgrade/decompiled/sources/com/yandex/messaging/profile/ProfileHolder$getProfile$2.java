package com.yandex.messaging.profile;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.profile.ProfileHolder$getProfile$2", f = "ProfileHolder.kt", l = {56}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class ProfileHolder$getProfile$2 extends SuspendLambda implements wls {
    final /* synthetic */ tls $accessor;
    Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileHolder$getProfile$2(tls tlsVar, d dVar, Continuation continuation) {
        super(2, continuation);
        this.$accessor = tlsVar;
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProfileHolder$getProfile$2(this.$accessor, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ProfileHolder$getProfile$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tls tlsVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tls tlsVar2 = this.$accessor;
            d dVar = this.this$0;
            this.L$0 = tlsVar2;
            this.label = 1;
            Object y = kotlinx.coroutines.flow.e.y(dVar.b(), this);
            if (y == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = y;
            tlsVar = tlsVar2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tlsVar = (tls) this.L$0;
            kotlin.b.b(obj);
        }
        tlsVar.invoke(obj);
        return zy11.a;
    }
}
