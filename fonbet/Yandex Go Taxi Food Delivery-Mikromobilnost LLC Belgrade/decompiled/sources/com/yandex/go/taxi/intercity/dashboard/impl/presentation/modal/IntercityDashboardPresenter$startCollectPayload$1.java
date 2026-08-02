package com.yandex.go.taxi.intercity.dashboard.impl.presentation.modal;

import com.adjust.sdk.Constants;
import defpackage.agw;
import defpackage.bgw;
import defpackage.cgw;
import defpackage.dgw;
import defpackage.eai;
import defpackage.hfw;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pj;
import defpackage.tje;
import defpackage.tse;
import defpackage.tse0;
import defpackage.uyj;
import defpackage.v8b1;
import defpackage.w511;
import defpackage.wls;
import defpackage.zfw;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lhfw;", "payload", "Lzy11;", "<anonymous>", "(Lhfw;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.intercity.dashboard.impl.presentation.modal.IntercityDashboardPresenter$startCollectPayload$1", f = "IntercityDashboardPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class IntercityDashboardPresenter$startCollectPayload$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntercityDashboardPresenter$startCollectPayload$1(g gVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        IntercityDashboardPresenter$startCollectPayload$1 intercityDashboardPresenter$startCollectPayload$1 = new IntercityDashboardPresenter$startCollectPayload$1(this.this$0, continuation);
        intercityDashboardPresenter$startCollectPayload$1.L$0 = obj;
        return intercityDashboardPresenter$startCollectPayload$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        IntercityDashboardPresenter$startCollectPayload$1 intercityDashboardPresenter$startCollectPayload$1 = (IntercityDashboardPresenter$startCollectPayload$1) create((hfw) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        intercityDashboardPresenter$startCollectPayload$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        hfw hfwVar = (hfw) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        v8b1 v8b1Var = hfwVar.b;
        pj pjVar = this.this$0.B.a;
        if (v8b1Var instanceof dgw) {
            str = "superapp";
        } else if (v8b1Var instanceof agw) {
            str = Constants.DEEPLINK;
        } else if (v8b1Var instanceof cgw) {
            str = "summary";
        } else if (v8b1Var instanceof bgw) {
            str = "discovery";
        } else {
            if (!(v8b1Var instanceof zfw)) {
                w511.b();
                return null;
            }
            str = "tariff_switch";
        }
        agw agwVar = v8b1Var instanceof agw ? (agw) v8b1Var : null;
        String str2 = agwVar != null ? agwVar.a : null;
        pjVar.getClass();
        HashMap hashMap = new HashMap();
        if (str2 != null) {
            hashMap.put(Constants.DEEPLINK, str2);
        }
        pjVar.a.a("IntercityMain.Shown", hashMap, 1, tse0.r("open_origin", hashMap, str));
        g gVar = this.this$0;
        String str3 = hfwVar.a;
        gVar.R.cancel();
        gVar.R = gVar.D.c(new eai(str3, 0));
        g gVar2 = this.this$0;
        String str4 = hfwVar.c;
        zy11 zy11Var = zy11.a;
        if (str4 == null) {
            gVar2.getClass();
            return zy11Var;
        }
        tse Jg = gVar2.Jg();
        gVar2.y.getClass();
        tje.N(Jg, uyj.a, null, new IntercityDashboardPresenter$handlePreferredTariff$1(gVar2, str4, null), 2);
        return zy11Var;
    }
}
