package com.yandex.messaging.ui.about;

import com.yandex.messaging.internal.v;
import defpackage.ds31;
import defpackage.gm51;
import defpackage.i6;
import defpackage.jqr;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q6v;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import io.appmetrica.analytics.AppMetricaYandex;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Li6;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.about.AboutScreenViewModel$uiState$1", f = "AboutScreenViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class AboutScreenViewModel$uiState$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AboutScreenViewModel$uiState$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AboutScreenViewModel$uiState$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        AboutScreenViewModel$uiState$1 aboutScreenViewModel$uiState$1 = (AboutScreenViewModel$uiState$1) create((vpr) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        aboutScreenViewModel$uiState$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        gm51 gm51Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        a aVar = this.this$0;
        q6v q6vVar = aVar.w;
        r0 r0Var = aVar.y;
        do {
            value = r0Var.getValue();
            gm51Var = (gm51) q6vVar;
        } while (!r0Var.k(value, i6.a((i6) value, false, String.valueOf(AppMetricaYandex.getUuid(gm51Var.a)), String.valueOf(AppMetricaYandex.getDeviceId(gm51Var.a)), 51)));
        v vVar = aVar.x;
        zy11 zy11Var = zy11.a;
        e.H(ds31.a(aVar), new jqr(vVar.a(zy11Var), new AboutScreenViewModel$loadMetrics$2(aVar, null), 3));
        return zy11Var;
    }
}
