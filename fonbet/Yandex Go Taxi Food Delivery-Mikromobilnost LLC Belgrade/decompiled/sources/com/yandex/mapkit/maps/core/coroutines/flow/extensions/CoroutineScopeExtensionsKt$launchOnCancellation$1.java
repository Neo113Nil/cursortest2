package com.yandex.mapkit.maps.core.coroutines.flow.extensions;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mapkit.maps.core.coroutines.flow.extensions.CoroutineScopeExtensionsKt$launchOnCancellation$1", f = "CoroutineScopeExtensions.kt", l = {16, 18}, m = "invokeSuspend", v = 1)
/* loaded from: classes15.dex */
public final class CoroutineScopeExtensionsKt$launchOnCancellation$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $block;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineScopeExtensionsKt$launchOnCancellation$1(tls tlsVar, Continuation<? super CoroutineScopeExtensionsKt$launchOnCancellation$1> continuation) {
        super(2, continuation);
        this.$block = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
        return new CoroutineScopeExtensionsKt$launchOnCancellation$1(this.$block, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(tse tseVar, Continuation<? super zy11> continuation) {
        return ((CoroutineScopeExtensionsKt$launchOnCancellation$1) create(tseVar, continuation)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (Throwable th) {
            tls tlsVar = this.$block;
            this.L$0 = th;
            this.label = 2;
            if (tlsVar.invoke(this) != coroutineSingletons) {
                throw th;
            }
        }
        if (i == 0) {
            b.b(obj);
            this.label = 1;
            if (a.d(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Throwable th2 = (Throwable) this.L$0;
                b.b(obj);
                throw th2;
            }
            b.b(obj);
        }
        throw new KotlinNothingValueException();
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        try {
            a.d(this);
            throw new KotlinNothingValueException();
        } catch (Throwable th) {
            this.$block.invoke(this);
            throw th;
        }
    }
}
