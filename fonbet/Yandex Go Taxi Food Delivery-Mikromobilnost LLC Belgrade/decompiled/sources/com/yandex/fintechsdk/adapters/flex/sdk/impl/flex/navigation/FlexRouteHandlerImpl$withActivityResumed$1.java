package com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.navigation;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleDestroyedException;
import androidx.lifecycle.m0;
import defpackage.g6u;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.sjh;
import defpackage.sls;
import defpackage.tse;
import defpackage.uyj;
import defpackage.vg10;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.navigation.FlexRouteHandlerImpl$withActivityResumed$1", f = "FlexRouteHandlerImpl.kt", l = {439}, m = "invokeSuspend")
/* loaded from: classes10.dex */
public final class FlexRouteHandlerImpl$withActivityResumed$1 extends SuspendLambda implements wls {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ sls $navigate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlexRouteHandlerImpl$withActivityResumed$1(FragmentActivity fragmentActivity, sls slsVar, Continuation<? super FlexRouteHandlerImpl$withActivityResumed$1> continuation) {
        super(2, continuation);
        this.$activity = fragmentActivity;
        this.$navigate = slsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
        return new FlexRouteHandlerImpl$withActivityResumed$1(this.$activity, this.$navigate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(tse tseVar, Continuation<? super zy11> continuation) {
        return ((FlexRouteHandlerImpl$withActivityResumed$1) create(tseVar, continuation)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            Lifecycle lifecycle = this.$activity.getLifecycle();
            Lifecycle.State state = Lifecycle.State.RESUMED;
            final sls slsVar = this.$navigate;
            if (state.compareTo(Lifecycle.State.CREATED) < 0) {
                vg10.r(state, "target state must be CREATED or greater, found ");
                return null;
            }
            sjh sjhVar = uyj.a;
            g6u g6uVar = o400.a.x;
            boolean G = g6uVar.G(get_context());
            if (!G) {
                if (lifecycle.b() == Lifecycle.State.DESTROYED) {
                    throw new LifecycleDestroyedException();
                }
                if (lifecycle.b().compareTo(state) >= 0) {
                    slsVar.invoke();
                }
            }
            sls slsVar2 = new sls() { // from class: com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.navigation.FlexRouteHandlerImpl$withActivityResumed$1$invokeSuspend$$inlined$withStateAtLeast$1
                {
                    super(0);
                }

                @Override // defpackage.sls
                public final zy11 invoke() {
                    sls.this.invoke();
                    return zy11.a;
                }
            };
            this.label = 1;
            if (m0.a(lifecycle, state, G, g6uVar, slsVar2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
