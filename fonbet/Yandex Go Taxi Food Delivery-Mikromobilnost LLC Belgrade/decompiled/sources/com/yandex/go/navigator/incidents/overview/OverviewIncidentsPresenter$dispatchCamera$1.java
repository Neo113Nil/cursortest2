package com.yandex.go.navigator.incidents.overview;

import defpackage.dh00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.t290;
import defpackage.tse;
import defpackage.w290;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.incidents.overview.OverviewIncidentsPresenter$dispatchCamera$1", f = "OverviewIncidentsPresenter.kt", l = {HProv.PP_NK_SYNC}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class OverviewIncidentsPresenter$dispatchCamera$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ w290 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverviewIncidentsPresenter$dispatchCamera$1(w290 w290Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = w290Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OverviewIncidentsPresenter$dispatchCamera$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OverviewIncidentsPresenter$dispatchCamera$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            t290 t290Var = (t290) this.this$0.Dg();
            this.label = 1;
            if (t290Var.awaitFocusRectReady(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        w290 w290Var = this.this$0;
        dh00.a(w290Var.D, w290Var.y.b, 0.0f, null, null, HProv.PP_DELETE_SAVED_PASSWD);
        return zy11.a;
    }
}
