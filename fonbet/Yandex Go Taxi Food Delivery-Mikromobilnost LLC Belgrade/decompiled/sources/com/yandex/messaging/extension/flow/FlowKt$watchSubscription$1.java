package com.yandex.messaging.extension.flow;

import defpackage.e3n;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sls;
import defpackage.wls;
import defpackage.zy11;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isActive", "Lzy11;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.extension.flow.FlowKt$watchSubscription$1", f = "Flow.kt", l = {HProv.PP_CACHE_SIZE}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class FlowKt$watchSubscription$1 extends SuspendLambda implements wls {
    final /* synthetic */ e3n $closeTimeout;
    final /* synthetic */ Ref$ObjectRef<Closeable> $lastCloseable;
    final /* synthetic */ sls $onActivate;
    /* synthetic */ boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt$watchSubscription$1(Ref$ObjectRef ref$ObjectRef, sls slsVar, e3n e3nVar, Continuation continuation) {
        super(2, continuation);
        this.$lastCloseable = ref$ObjectRef;
        this.$onActivate = slsVar;
        this.$closeTimeout = e3nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FlowKt$watchSubscription$1 flowKt$watchSubscription$1 = new FlowKt$watchSubscription$1(this.$lastCloseable, this.$onActivate, this.$closeTimeout, continuation);
        flowKt$watchSubscription$1.Z$0 = ((Boolean) obj).booleanValue();
        return flowKt$watchSubscription$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((FlowKt$watchSubscription$1) create(bool, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [T, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (this.Z$0) {
                Ref$ObjectRef<Closeable> ref$ObjectRef = this.$lastCloseable;
                if (ref$ObjectRef.element == null) {
                    ref$ObjectRef.element = this.$onActivate.invoke();
                }
                return zy11.a;
            }
            e3n e3nVar = this.$closeTimeout;
            if (e3nVar != null) {
                long j = e3nVar.a;
                this.label = 1;
                if (kotlinx.coroutines.a.j(j, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        Closeable closeable = this.$lastCloseable.element;
        if (closeable != null) {
            closeable.close();
        }
        this.$lastCloseable.element = null;
        return zy11.a;
    }
}
