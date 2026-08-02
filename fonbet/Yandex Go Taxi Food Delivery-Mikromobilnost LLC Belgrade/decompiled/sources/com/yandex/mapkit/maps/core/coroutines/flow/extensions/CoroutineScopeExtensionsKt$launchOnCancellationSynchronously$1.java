package com.yandex.mapkit.maps.core.coroutines.flow.extensions;

import defpackage.dvw;
import defpackage.j18;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mapkit.maps.core.coroutines.flow.extensions.CoroutineScopeExtensionsKt$launchOnCancellationSynchronously$1", f = "CoroutineScopeExtensions.kt", l = {39}, m = "invokeSuspend", v = 1)
/* loaded from: classes15.dex */
public final class CoroutineScopeExtensionsKt$launchOnCancellationSynchronously$1 extends SuspendLambda implements wls {
    final /* synthetic */ sls $block;
    int I$0;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineScopeExtensionsKt$launchOnCancellationSynchronously$1(sls slsVar, Continuation<? super CoroutineScopeExtensionsKt$launchOnCancellationSynchronously$1> continuation) {
        super(2, continuation);
        this.$block = slsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
        return new CoroutineScopeExtensionsKt$launchOnCancellationSynchronously$1(this.$block, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(tse tseVar, Continuation<? super zy11> continuation) {
        return ((CoroutineScopeExtensionsKt$launchOnCancellationSynchronously$1) create(tseVar, continuation)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            sls slsVar = this.$block;
            this.L$0 = slsVar;
            this.I$0 = 0;
            this.label = 1;
            j18 j18Var = new j18(1, dvw.b(this));
            j18Var.u();
            j18Var.w(new CoroutineScopeExtensionsKt$launchOnCancellationSynchronously$1$1$1(slsVar));
            if (j18Var.s() == coroutineSingletons) {
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

    public final Object invokeSuspend$$forInline(Object obj) {
        sls slsVar = this.$block;
        j18 j18Var = new j18(1, dvw.b(this));
        j18Var.u();
        j18Var.w(new CoroutineScopeExtensionsKt$launchOnCancellationSynchronously$1$1$1(slsVar));
        j18Var.s();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return zy11.a;
    }
}
