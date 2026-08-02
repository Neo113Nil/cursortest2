package com.yandex.messaging.internal.suspend;

import defpackage.e1k;
import defpackage.l8x;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.suspend.SuspendDisposableKt$attachToContext$2", f = "SuspendDisposable.kt", l = {HProv.PP_REBOOT}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class SuspendDisposableKt$attachToContext$2 extends SuspendLambda implements wls {
    final /* synthetic */ l8x $job;
    final /* synthetic */ e1k $this_attachToContext;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuspendDisposableKt$attachToContext$2(l8x l8xVar, e1k e1kVar, Continuation continuation) {
        super(2, continuation);
        this.$job = l8xVar;
        this.$this_attachToContext = e1kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuspendDisposableKt$attachToContext$2(this.$job, this.$this_attachToContext, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuspendDisposableKt$attachToContext$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, zy11] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                l8x l8xVar = this.$job;
                this.label = 1;
                if (l8xVar.u0(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
            }
            this.$this_attachToContext.close();
            this = zy11.a;
            return this;
        } catch (Throwable th) {
            this.$this_attachToContext.close();
            throw th;
        }
    }
}
