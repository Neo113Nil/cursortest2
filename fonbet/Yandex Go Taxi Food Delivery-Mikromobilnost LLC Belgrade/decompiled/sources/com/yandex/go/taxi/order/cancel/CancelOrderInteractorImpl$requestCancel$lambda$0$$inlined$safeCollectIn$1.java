package com.yandex.go.taxi.order.cancel;

import defpackage.a3y0;
import defpackage.c6e;
import defpackage.hst;
import defpackage.jst;
import defpackage.jx81;
import defpackage.mvg;
import defpackage.nw7;
import defpackage.ny61;
import defpackage.osb1;
import defpackage.qw7;
import defpackage.tpr;
import defpackage.tse;
import defpackage.ud;
import defpackage.w4j0;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.o;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.cancel.CancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$safeCollectIn$1", f = "CancelOrderInteractorImpl.kt", l = {HProv.PP_SIGNATUREOID}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class CancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$safeCollectIn$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $orderId$inlined;
    final /* synthetic */ String $orderId$inlined$1;
    final /* synthetic */ tpr $this_safeCollectIn;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ qw7 this$0;

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lvpr;", "", "cause", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.taxi.order.cancel.CancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$safeCollectIn$1$1", f = "CancelOrderInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.order.cancel.CancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$safeCollectIn$1$1, reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass1 extends SuspendLambda implements zls {
        final /* synthetic */ String $orderId$inlined;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ qw7 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(qw7 qw7Var, String str, Continuation continuation) {
            super(3, continuation);
            this.this$0 = qw7Var;
            this.$orderId$inlined = str;
        }

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$orderId$inlined, (Continuation) obj3);
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
            qw7 qw7Var = this.this$0;
            String str = this.$orderId$inlined;
            qw7Var.getClass();
            if (jx81.D(th)) {
                c6e c6eVar = qw7Var.c;
                if (!osb1.b(c6eVar.a)) {
                    c6eVar.c.getClass();
                    a3y0.h((String[]) Arrays.copyOf(new String[0], 0));
                    hst hstVar = jst.e;
                    ((ru.yandex.taxi.jobs.b) c6eVar.b.get()).e(new w4j0("connectivity_changed", 0L, null, null, null, false, false, 0L, null, 2046));
                }
                nw7 a = qw7Var.a(str);
                if (a != null) {
                    a.onError(th);
                }
            } else {
                nw7 a2 = qw7Var.a(str);
                if (a2 != null) {
                    a2.onError(th);
                }
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$safeCollectIn$1(tpr tprVar, Continuation continuation, qw7 qw7Var, String str, String str2) {
        super(2, continuation);
        this.$this_safeCollectIn = tprVar;
        this.this$0 = qw7Var;
        this.$orderId$inlined = str;
        this.$orderId$inlined$1 = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$safeCollectIn$1(this.$this_safeCollectIn, continuation, this.this$0, this.$orderId$inlined, this.$orderId$inlined$1);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$safeCollectIn$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            o oVar = new o(this.$this_safeCollectIn, new AnonymousClass1(this.this$0, this.$orderId$inlined$1, null));
            ud udVar = new ud(4, this.this$0, this.$orderId$inlined);
            this.L$0 = null;
            this.label = 1;
            if (oVar.collect(udVar, this) == coroutineSingletons) {
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
