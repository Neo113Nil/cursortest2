package com.yandex.go.tariffcard.ui;

import defpackage.iix0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.yandex.taxi.summary.requirements.list.interactors.u0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.tariffcard.ui.TariffOptionsCardPresenter$attachView$2", f = "TariffOptionsCardPresenter.kt", l = {MSException.ERROR_INVALID_PARAMETER}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TariffOptionsCardPresenter$attachView$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ iix0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffOptionsCardPresenter$attachView$2(iix0 iix0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iix0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TariffOptionsCardPresenter$attachView$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TariffOptionsCardPresenter$attachView$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            u0 u0Var = this.this$0.L;
            this.label = 1;
            if (u0Var.e(this) == coroutineSingletons) {
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
