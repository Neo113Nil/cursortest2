package com.yandex.go.lifecycle.processor;

import defpackage.e3n;
import defpackage.f8z0;
import defpackage.h3y;
import defpackage.hst;
import defpackage.jse;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s630;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\"\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n"}, d2 = {"<anonymous>", "", "T"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.lifecycle.processor.BaseLifecycleProcessor$processorListeners$1", f = "BaseLifecycleProcessor.kt", l = {16}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class BaseLifecycleProcessor$processorListeners$1 extends SuspendLambda implements tls {
    final /* synthetic */ h3y $listeners;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\r\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0002\b\u0003\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Ltse;", "", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Ltse;)Ljava/util/Set;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.lifecycle.processor.BaseLifecycleProcessor$processorListeners$1$1", f = "BaseLifecycleProcessor.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.lifecycle.processor.BaseLifecycleProcessor$processorListeners$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ h3y $listeners;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, h3y h3yVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aVar;
            this.$listeners = h3yVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$listeners, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            this.this$0.a();
            h3y h3yVar = this.$listeners;
            long a = s630.a();
            Object obj2 = h3yVar.get();
            long a2 = f8z0.a(a);
            hst hstVar = jst.e;
            Thread.currentThread().getName();
            e3n.p(a2);
            hstVar.getClass();
            return obj2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseLifecycleProcessor$processorListeners$1(a aVar, h3y h3yVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$listeners = h3yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new BaseLifecycleProcessor$processorListeners$1(this.this$0, this.$listeners, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((BaseLifecycleProcessor$processorListeners$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        a aVar = this.this$0;
        jse jseVar = aVar.a;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(aVar, this.$listeners, null);
        this.label = 1;
        Object k0 = tje.k0(jseVar, anonymousClass1, this);
        return k0 == coroutineSingletons ? coroutineSingletons : k0;
    }
}
