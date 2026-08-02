package com.yandex.go.flex.main_screen.data.widgets.tracking;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.b0;
import defpackage.c231;
import defpackage.j551;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.widgets.domain.f;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.flex.main_screen.data.widgets.tracking.TrackingListCountersVariableLcpListener$onLargestContentfulPaint$1", f = "TrackingListCountersVariableLcpListener.kt", l = {39}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class TrackingListCountersVariableLcpListener$onLargestContentfulPaint$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ c this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.flex.main_screen.data.widgets.tracking.TrackingListCountersVariableLcpListener$onLargestContentfulPaint$1$1", f = "TrackingListCountersVariableLcpListener.kt", l = {42}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.flex.main_screen.data.widgets.tracking.TrackingListCountersVariableLcpListener$onLargestContentfulPaint$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ c this$0;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc231;", "variable", "Lzy11;", "<anonymous>", "(Lc231;)V"}, k = 3, mv = {2, 4, 0})
        @mvg(c = "com.yandex.go.flex.main_screen.data.widgets.tracking.TrackingListCountersVariableLcpListener$onLargestContentfulPaint$1$1$2", f = "TrackingListCountersVariableLcpListener.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.yandex.go.flex.main_screen.data.widgets.tracking.TrackingListCountersVariableLcpListener$onLargestContentfulPaint$1$1$2, reason: invalid class name */
        final class AnonymousClass2 extends SuspendLambda implements wls {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ c this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(c cVar, Continuation continuation) {
                super(2, continuation);
                this.this$0 = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((c231) obj, (Continuation) obj2);
                zy11 zy11Var = zy11.a;
                anonymousClass2.invokeSuspend(zy11Var);
                return zy11Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                c231 c231Var = (c231) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                this.this$0.d.i(c231Var);
                return zy11.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(c cVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
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
                kotlin.b.b(obj);
                j551 j551Var = this.this$0.c;
                f fVar = new f(j551Var.c.b(), j551Var);
                j551Var.a.getClass();
                tpr F = e.F(fVar, uyj.a);
                c cVar = this.this$0;
                b bVar = new b(F, cVar);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(cVar, null);
                this.label = 1;
                if (e.k(bVar, anonymousClass2, this) == coroutineSingletons) {
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
    public TrackingListCountersVariableLcpListener$onLargestContentfulPaint$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TrackingListCountersVariableLcpListener$onLargestContentfulPaint$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TrackingListCountersVariableLcpListener$onLargestContentfulPaint$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0;
            Lifecycle lifecycle = cVar.a;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(cVar, null);
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
