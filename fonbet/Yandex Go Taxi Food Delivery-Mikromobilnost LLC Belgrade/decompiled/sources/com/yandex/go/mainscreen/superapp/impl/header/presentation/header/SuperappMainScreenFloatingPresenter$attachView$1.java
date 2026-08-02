package com.yandex.go.mainscreen.superapp.impl.header.presentation.header;

import com.yandex.go.mainscreen.superapp.impl.header.domain.h;
import defpackage.dcw0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qit0;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uyj;
import defpackage.vpr;
import defpackage.wls;
import defpackage.xbw0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.mainscreen.superapp.impl.header.presentation.header.SuperappMainScreenFloatingPresenter$attachView$1", f = "SuperappMainScreenFloatingPresenter.kt", l = {37}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class SuperappMainScreenFloatingPresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ xbw0 $mvpView;
    int label;
    final /* synthetic */ dcw0 this$0;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lbk10;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.mainscreen.superapp.impl.header.presentation.header.SuperappMainScreenFloatingPresenter$attachView$1$1", f = "SuperappMainScreenFloatingPresenter.kt", l = {35}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.mainscreen.superapp.impl.header.presentation.header.SuperappMainScreenFloatingPresenter$attachView$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ dcw0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(dcw0 dcw0Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = dcw0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            vpr vprVar = (vpr) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                b.b(obj);
                tpr b = ((h) this.this$0.x).b();
                this.L$0 = null;
                this.label = 1;
                if (e.u(b, vprVar, this) == coroutineSingletons) {
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
    public SuperappMainScreenFloatingPresenter$attachView$1(dcw0 dcw0Var, xbw0 xbw0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dcw0Var;
        this.$mvpView = xbw0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperappMainScreenFloatingPresenter$attachView$1(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperappMainScreenFloatingPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            rol0 rol0Var = new rol0(new AnonymousClass1(this.this$0, null));
            this.this$0.y.getClass();
            tpr F = e.F(rol0Var, uyj.a);
            qit0 qit0Var = new qit0(20, this.$mvpView);
            this.label = 1;
            if (F.collect(qit0Var, this) == coroutineSingletons) {
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
