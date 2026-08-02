package com.yandex.plus.home;

import com.yandex.plus.log.api.LogPriority;
import defpackage.e3n;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rkd0;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "Le3n;", "rechargeTime", "Lzy11;", "<anonymous>", "(Ltse;Le3n;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.PlusHomeSdkImpl$11", f = "PlusHomeSdkImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class PlusHomeSdkImpl$11 extends SuspendLambda implements zls {
    /* synthetic */ long J$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
    @mvg(c = "com.yandex.plus.home.PlusHomeSdkImpl$11$2", f = "PlusHomeSdkImpl.kt", l = {142}, m = "invokeSuspend")
    /* renamed from: com.yandex.plus.home.PlusHomeSdkImpl$11$2, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        final /* synthetic */ long $rechargeTime;
        int label;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(c cVar, long j, Continuation continuation) {
            super(2, continuation);
            this.this$0 = cVar;
            this.$rechargeTime = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.this$0, this.$rechargeTime, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                com.yandex.plus.experiments.impl.providers.a a = this.this$0.f.a();
                long j = this.$rechargeTime;
                this.label = 1;
                if (a.e(j, this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
    @mvg(c = "com.yandex.plus.home.PlusHomeSdkImpl$11$3", f = "PlusHomeSdkImpl.kt", l = {143}, m = "invokeSuspend")
    /* renamed from: com.yandex.plus.home.PlusHomeSdkImpl$11$3, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass3 extends SuspendLambda implements wls {
        final /* synthetic */ long $rechargeTime;
        int label;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(c cVar, long j, Continuation continuation) {
            super(2, continuation);
            this.this$0 = cVar;
            this.$rechargeTime = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass3(this.this$0, this.$rechargeTime, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                com.yandex.plus.home.graphql.configuration.a aVar = (com.yandex.plus.home.graphql.configuration.a) this.this$0.f.v.getValue();
                long j = this.$rechargeTime;
                this.label = 1;
                if (aVar.c(j, this) == coroutineSingletons) {
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
    public PlusHomeSdkImpl$11(c cVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((e3n) obj2).a;
        PlusHomeSdkImpl$11 plusHomeSdkImpl$11 = new PlusHomeSdkImpl$11(this.this$0, (Continuation) obj3);
        plusHomeSdkImpl$11.L$0 = (tse) obj;
        plusHomeSdkImpl$11.J$0 = j;
        zy11 zy11Var = zy11.a;
        plusHomeSdkImpl$11.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        long j = this.J$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        rkd0 rkd0Var = this.this$0.b.A;
        LogPriority logPriority = LogPriority.INFO;
        if (rkd0Var.e(logPriority)) {
            rkd0Var.b(logPriority, "PlusHomeSdkImpl", "Collect cooldown: rechargeTime=" + ((Object) e3n.p(j)), null);
        }
        tje.N(tseVar, null, null, new AnonymousClass2(this.this$0, j, null), 3);
        tje.N(tseVar, null, null, new AnonymousClass3(this.this$0, j, null), 3);
        return zy11.a;
    }
}
