package com.yandex.messaging.profile;

import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.t24;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.profile.ProfileHolder$subscribe$$inlined$suspendDisposable$1$1", f = "ProfileHolder.kt", l = {33}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class ProfileHolder$subscribe$$inlined$suspendDisposable$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $listener$inlined;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileHolder$subscribe$$inlined$suspendDisposable$1$1(tls tlsVar, d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$listener$inlined = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ProfileHolder$subscribe$$inlined$suspendDisposable$1$1 profileHolder$subscribe$$inlined$suspendDisposable$1$1 = new ProfileHolder$subscribe$$inlined$suspendDisposable$1$1(this.$listener$inlined, this.this$0, continuation);
        profileHolder$subscribe$$inlined$suspendDisposable$1$1.L$0 = obj;
        return profileHolder$subscribe$$inlined$suspendDisposable$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ProfileHolder$subscribe$$inlined$suspendDisposable$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            mth b = this.this$0.b();
            t24 t24Var = new t24(13, this.$listener$inlined);
            this.label = 1;
            if (b.collect(t24Var, this) == coroutineSingletons) {
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
