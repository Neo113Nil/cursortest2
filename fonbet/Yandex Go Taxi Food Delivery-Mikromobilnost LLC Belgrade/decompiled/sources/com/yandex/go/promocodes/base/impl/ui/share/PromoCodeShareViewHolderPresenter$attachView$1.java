package com.yandex.go.promocodes.base.impl.ui.share;

import defpackage.bnf0;
import defpackage.jbh;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.sjh;
import defpackage.t1b0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zmf0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.common_models.net.SimplePersistentBooleanExperiment;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.promocodes.base.impl.ui.share.PromoCodeShareViewHolderPresenter$attachView$1", f = "PromoCodeShareViewHolderPresenter.kt", l = {25, 28}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PromoCodeShareViewHolderPresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ bnf0 $mvpView;
    Object L$0;
    int label;
    final /* synthetic */ zmf0 this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isExperimentEnabled", "Lzy11;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.promocodes.base.impl.ui.share.PromoCodeShareViewHolderPresenter$attachView$1$1", f = "PromoCodeShareViewHolderPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.promocodes.base.impl.ui.share.PromoCodeShareViewHolderPresenter$attachView$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ bnf0 $mvpView;
        /* synthetic */ boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(bnf0 bnf0Var, Continuation continuation) {
            super(2, continuation);
            this.$mvpView = bnf0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$mvpView, continuation);
            anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create(bool, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z = this.Z$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            this.$mvpView.setShareState(z ? PromoCodeShareViewHolderState.V2 : PromoCodeShareViewHolderState.V1);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromoCodeShareViewHolderPresenter$attachView$1(zmf0 zmf0Var, bnf0 bnf0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = zmf0Var;
        this.$mvpView = bnf0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PromoCodeShareViewHolderPresenter$attachView$1(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PromoCodeShareViewHolderPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0071, code lost:
    
        if (kotlinx.coroutines.flow.e.k(r8, r1, r7) == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        tpr tprVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            rqo rqoVar = this.this$0.x;
            SimplePersistentBooleanExperiment simplePersistentBooleanExperiment = SimplePersistentBooleanExperiment.NEW_REFERRAL_SCREEN;
            tpr a = ((jbh) rqoVar).f(simplePersistentBooleanExperiment).a();
            t1b0 f = ((jbh) this.this$0.x).f(simplePersistentBooleanExperiment);
            this.L$0 = a;
            this.label = 1;
            Object b = f.b(this);
            if (b != coroutineSingletons) {
                tprVar = a;
                obj = b;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                b.b(obj);
                return zy11.a;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        tprVar = (tpr) this.L$0;
        b.b(obj);
        tpr d = com.yandex.go.coroutines.b.d(tprVar, new PromoCodeShareViewHolderPresenter$attachView$1$invokeSuspend$$inlined$start$1(obj, null));
        this.this$0.y.getClass();
        sjh sjhVar = uyj.a;
        tpr F = e.F(d, mdh.b);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$mvpView, null);
        this.L$0 = null;
        this.label = 2;
    }
}
