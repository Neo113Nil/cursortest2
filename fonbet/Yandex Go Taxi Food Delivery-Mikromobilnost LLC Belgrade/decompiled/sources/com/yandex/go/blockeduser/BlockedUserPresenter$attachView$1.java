package com.yandex.go.blockeduser;

import com.yandex.go.blockeduser.api.analytics.BlockedReason;
import defpackage.b1;
import defpackage.c46;
import defpackage.d46;
import defpackage.e46;
import defpackage.jqr;
import defpackage.m46;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.blockeduser.BlockedUserPresenter$attachView$1", f = "BlockedUserPresenter.kt", l = {74}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class BlockedUserPresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ c46 $mvpView;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ e46 this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm46;", "it", "Lzy11;", "<anonymous>", "(Lm46;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.blockeduser.BlockedUserPresenter$attachView$1$1", f = "BlockedUserPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.blockeduser.BlockedUserPresenter$attachView$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ e46 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(e46 e46Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = e46Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((m46) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            m46 m46Var = (m46) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            e46 e46Var = this.this$0;
            BlockedReason blockedReason = m46Var.b;
            String str = m46Var.c;
            b1 b1Var = e46Var.B;
            int i = d46.a[blockedReason.ordinal()];
            if (i == 1) {
                b1Var.f(blockedReason.name(), null);
            } else {
                if (i != 2) {
                    w511.b();
                    return null;
                }
                b1Var.f(blockedReason.name(), str);
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockedUserPresenter$attachView$1(e46 e46Var, c46 c46Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = e46Var;
        this.$mvpView = c46Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BlockedUserPresenter$attachView$1(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BlockedUserPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            e46 e46Var = this.this$0;
            jqr jqrVar = new jqr(new mth(e46Var.y.d, 6), new AnonymousClass1(e46Var, null), 3);
            e46 e46Var2 = this.this$0;
            c46 c46Var = this.$mvpView;
            o oVar = new o(jqrVar, new BlockedUserPresenter$attachView$1$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
            d dVar = new d(e46Var2, c46Var);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (oVar.collect(dVar, this) == coroutineSingletons) {
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
