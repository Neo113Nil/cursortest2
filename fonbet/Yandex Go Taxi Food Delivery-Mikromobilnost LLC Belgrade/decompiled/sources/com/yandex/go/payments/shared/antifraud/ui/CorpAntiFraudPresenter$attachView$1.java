package com.yandex.go.payments.shared.antifraud.ui;

import defpackage.foc;
import defpackage.gue;
import defpackage.lue;
import defpackage.mvg;
import defpackage.nue;
import defpackage.ny61;
import defpackage.pue;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.shared.antifraud.ui.CorpAntiFraudPresenter$attachView$1", f = "CorpAntiFraudPresenter.kt", l = {31}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class CorpAntiFraudPresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ gue $corpAntiFraudData;
    final /* synthetic */ lue $mvpView;
    int label;
    final /* synthetic */ nue this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CorpAntiFraudPresenter$attachView$1(nue nueVar, gue gueVar, lue lueVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = nueVar;
        this.$corpAntiFraudData = gueVar;
        this.$mvpView = lueVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CorpAntiFraudPresenter$attachView$1(this.this$0, this.$corpAntiFraudData, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CorpAntiFraudPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0.y;
            gue gueVar = this.$corpAntiFraudData;
            this.label = 1;
            obj = aVar.a(gueVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            this.$mvpView.render(this.$corpAntiFraudData, false);
        } else {
            ((pue) this.this$0.B.a).r(new foc(22));
        }
        return zy11.a;
    }
}
