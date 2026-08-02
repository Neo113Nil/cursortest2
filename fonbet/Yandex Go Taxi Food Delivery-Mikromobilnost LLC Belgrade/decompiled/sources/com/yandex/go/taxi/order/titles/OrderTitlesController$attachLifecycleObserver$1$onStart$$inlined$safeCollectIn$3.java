package com.yandex.go.taxi.order.titles;

import defpackage.a3y0;
import defpackage.c980;
import defpackage.d980;
import defpackage.hst;
import defpackage.ist;
import defpackage.jst;
import defpackage.ke00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.o;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.titles.OrderTitlesController$attachLifecycleObserver$1$onStart$$inlined$safeCollectIn$3", f = "OrderTitlesController.kt", l = {HProv.PP_SIGNATUREOID}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class OrderTitlesController$attachLifecycleObserver$1$onStart$$inlined$safeCollectIn$3 extends SuspendLambda implements wls {
    final /* synthetic */ tpr $this_safeCollectIn;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ d980 this$0;

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lvpr;", "", "cause", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.taxi.order.titles.OrderTitlesController$attachLifecycleObserver$1$onStart$$inlined$safeCollectIn$3$1", f = "OrderTitlesController.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.order.titles.OrderTitlesController$attachLifecycleObserver$1$onStart$$inlined$safeCollectIn$3$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements zls {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ d980 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(d980 d980Var, Continuation continuation) {
            super(3, continuation);
            this.this$0 = d980Var;
        }

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, (Continuation) obj3);
            anonymousClass1.L$0 = (Throwable) obj2;
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Throwable th = (Throwable) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            a3y0 a3y0Var = this.this$0.o;
            String l = a3y0Var.l(new String[]{"attachLifecycleObserver", "processOrder"});
            hst hstVar = jst.e;
            String str = a3y0Var.a;
            ist m = hstVar.m(l);
            ke00 a = m.b.a();
            if (a != null && a.b(15)) {
                a.a(15, str, th, "Error while getting new order", m.a);
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderTitlesController$attachLifecycleObserver$1$onStart$$inlined$safeCollectIn$3(tpr tprVar, Continuation continuation, d980 d980Var) {
        super(2, continuation);
        this.$this_safeCollectIn = tprVar;
        this.this$0 = d980Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderTitlesController$attachLifecycleObserver$1$onStart$$inlined$safeCollectIn$3(this.$this_safeCollectIn, continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderTitlesController$attachLifecycleObserver$1$onStart$$inlined$safeCollectIn$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            o oVar = new o(this.$this_safeCollectIn, new AnonymousClass1(this.this$0, null));
            c980 c980Var = new c980(this.this$0, 2);
            this.L$0 = null;
            this.label = 1;
            if (oVar.collect(c980Var, this) == coroutineSingletons) {
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
