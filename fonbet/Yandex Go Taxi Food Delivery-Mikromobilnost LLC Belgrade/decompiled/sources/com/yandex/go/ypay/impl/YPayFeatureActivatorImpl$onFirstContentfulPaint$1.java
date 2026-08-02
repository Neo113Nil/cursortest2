package com.yandex.go.ypay.impl;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.b0;
import defpackage.g721;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qqo;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.experiments.d;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.ypay.impl.YPayFeatureActivatorImpl$onFirstContentfulPaint$1", f = "YPayFeatureActivatorImpl.kt", l = {29}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class YPayFeatureActivatorImpl$onFirstContentfulPaint$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.ypay.impl.YPayFeatureActivatorImpl$onFirstContentfulPaint$1$1", f = "YPayFeatureActivatorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.ypay.impl.YPayFeatureActivatorImpl$onFirstContentfulPaint$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ b this$0;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
        @mvg(c = "com.yandex.go.ypay.impl.YPayFeatureActivatorImpl$onFirstContentfulPaint$1$1$1", f = "YPayFeatureActivatorImpl.kt", l = {31}, m = "invokeSuspend", v = 2)
        /* renamed from: com.yandex.go.ypay.impl.YPayFeatureActivatorImpl$onFirstContentfulPaint$1$1$1, reason: invalid class name and collision with other inner class name */
        final class C00801 extends SuspendLambda implements wls {
            int label;
            final /* synthetic */ b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00801(b bVar, Continuation continuation) {
                super(2, continuation);
                this.this$0 = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C00801(this.this$0, continuation);
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                return ((C00801) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.b.b(obj);
                    tpr a = d.a((qqo) this.this$0.e.getValue());
                    g721 g721Var = new g721(15, this.this$0);
                    this.label = 1;
                    if (a.collect(g721Var, this) == coroutineSingletons) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(b bVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((tse) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            tse tseVar = (tse) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            this.this$0.c.getClass();
            sjh sjhVar = uyj.a;
            tje.N(tseVar, mdh.b, null, new C00801(this.this$0, null), 2);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YPayFeatureActivatorImpl$onFirstContentfulPaint$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new YPayFeatureActivatorImpl$onFirstContentfulPaint$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((YPayFeatureActivatorImpl$onFirstContentfulPaint$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            Lifecycle lifecycle = bVar.b;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(bVar, null);
            this.label = 1;
            if (b0.b(lifecycle, state, anonymousClass1, this) == coroutineSingletons) {
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
