package com.yandex.messaging.core.ui;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.b0;
import defpackage.g6u;
import defpackage.jq60;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.pey;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tls;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.core.ui.ObserveAsEventsKt$ObserveAsEvents$1$1", f = "ObserveAsEvents.kt", l = {18}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ObserveAsEventsKt$ObserveAsEvents$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ tpr $flow;
    final /* synthetic */ pey $lifecycleOwner;
    final /* synthetic */ tls $onEvent;
    int label;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.yandex.messaging.core.ui.ObserveAsEventsKt$ObserveAsEvents$1$1$1", f = "ObserveAsEvents.kt", l = {19}, m = "invokeSuspend")
    /* renamed from: com.yandex.messaging.core.ui.ObserveAsEventsKt$ObserveAsEvents$1$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ tpr $flow;
        final /* synthetic */ tls $onEvent;
        int label;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
        @mvg(c = "com.yandex.messaging.core.ui.ObserveAsEventsKt$ObserveAsEvents$1$1$1$1", f = "ObserveAsEvents.kt", l = {20}, m = "invokeSuspend")
        /* renamed from: com.yandex.messaging.core.ui.ObserveAsEventsKt$ObserveAsEvents$1$1$1$1, reason: invalid class name and collision with other inner class name */
        final class C00851 extends SuspendLambda implements wls {
            final /* synthetic */ tpr $flow;
            final /* synthetic */ tls $onEvent;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00851(tpr tprVar, tls tlsVar, Continuation continuation) {
                super(2, continuation);
                this.$flow = tprVar;
                this.$onEvent = tlsVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C00851(this.$flow, this.$onEvent, continuation);
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                return ((C00851) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    b.b(obj);
                    tpr tprVar = this.$flow;
                    jq60 jq60Var = new jq60(0, this.$onEvent);
                    this.label = 1;
                    if (tprVar.collect(jq60Var, this) == coroutineSingletons) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(tpr tprVar, tls tlsVar, Continuation continuation) {
            super(2, continuation);
            this.$flow = tprVar;
            this.$onEvent = tlsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$flow, this.$onEvent, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                b.b(obj);
                sjh sjhVar = uyj.a;
                g6u g6uVar = o400.a.x;
                C00851 c00851 = new C00851(this.$flow, this.$onEvent, null);
                this.label = 1;
                if (tje.k0(g6uVar, c00851, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObserveAsEventsKt$ObserveAsEvents$1$1(pey peyVar, tpr tprVar, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.$lifecycleOwner = peyVar;
        this.$flow = tprVar;
        this.$onEvent = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ObserveAsEventsKt$ObserveAsEvents$1$1(this.$lifecycleOwner, this.$flow, this.$onEvent, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ObserveAsEventsKt$ObserveAsEvents$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            pey peyVar = this.$lifecycleOwner;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$flow, this.$onEvent, null);
            this.label = 1;
            if (b0.a(peyVar, state, anonymousClass1, this) == coroutineSingletons) {
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
