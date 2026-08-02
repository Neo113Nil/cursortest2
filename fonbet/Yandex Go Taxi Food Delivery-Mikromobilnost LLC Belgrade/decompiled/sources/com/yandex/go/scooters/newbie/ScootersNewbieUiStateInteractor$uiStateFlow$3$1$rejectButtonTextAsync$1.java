package com.yandex.go.scooters.newbie;

import defpackage.f9s;
import defpackage.g2o0;
import defpackage.mvg;
import defpackage.n1o0;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/CharSequence;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.newbie.ScootersNewbieUiStateInteractor$uiStateFlow$3$1$rejectButtonTextAsync$1", f = "ScootersNewbieUiStateInteractor.kt", l = {39}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersNewbieUiStateInteractor$uiStateFlow$3$1$rejectButtonTextAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ n1o0 $experiment;
    final /* synthetic */ n1o0.b $initialModal;
    int label;
    final /* synthetic */ g2o0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersNewbieUiStateInteractor$uiStateFlow$3$1$rejectButtonTextAsync$1(n1o0.b bVar, n1o0 n1o0Var, g2o0 g2o0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = g2o0Var;
        this.$initialModal = bVar;
        this.$experiment = n1o0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersNewbieUiStateInteractor$uiStateFlow$3$1$rejectButtonTextAsync$1(this.$initialModal, this.$experiment, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersNewbieUiStateInteractor$uiStateFlow$3$1$rejectButtonTextAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ru.yandex.taxi.widget.c cVar = this.this$0.c;
        FormattedText e = f9s.e(this.$initialModal.d, this.$experiment);
        this.label = 1;
        Object e2 = ru.yandex.taxi.widget.c.e(cVar, e, null, false, this, 30);
        return e2 == coroutineSingletons ? coroutineSingletons : e2;
    }
}
