package com.yandex.go.chargers.offer.ui.compose.ui;

import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersOfferCardCloseReason;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersOfferCardOpenReason;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersSubscriptionToggleState;
import com.yandex.go.chargers.offer.ChargersOfferOpenReason;
import defpackage.a8a;
import defpackage.c8a;
import defpackage.dxa;
import defpackage.em9;
import defpackage.h7a;
import defpackage.laa;
import defpackage.mvg;
import defpackage.n9a;
import defpackage.ny61;
import defpackage.oaa;
import defpackage.paa;
import defpackage.swa;
import defpackage.tn9;
import defpackage.twa;
import defpackage.vr60;
import defpackage.vva;
import defpackage.w511;
import defpackage.wls;
import defpackage.wwa;
import defpackage.x7a;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lpaa;", "it", "Lzy11;", "<anonymous>", "(Lpaa;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.offer.ui.compose.ui.ChargersOfferUiStateInteractor$getUiStateFlow$1", f = "ChargersOfferUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersOfferUiStateInteractor$getUiStateFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ ChargersOfferOpenReason $openReason;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersOfferUiStateInteractor$getUiStateFlow$1(e eVar, ChargersOfferOpenReason chargersOfferOpenReason, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$openReason = chargersOfferOpenReason;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChargersOfferUiStateInteractor$getUiStateFlow$1 chargersOfferUiStateInteractor$getUiStateFlow$1 = new ChargersOfferUiStateInteractor$getUiStateFlow$1(this.this$0, this.$openReason, continuation);
        chargersOfferUiStateInteractor$getUiStateFlow$1.L$0 = obj;
        return chargersOfferUiStateInteractor$getUiStateFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ChargersOfferUiStateInteractor$getUiStateFlow$1 chargersOfferUiStateInteractor$getUiStateFlow$1 = (ChargersOfferUiStateInteractor$getUiStateFlow$1) create((paa) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        chargersOfferUiStateInteractor$getUiStateFlow$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChargersAnalytics$ChargersOfferCardOpenReason chargersAnalytics$ChargersOfferCardOpenReason;
        boolean z;
        tn9 tn9Var;
        CharSequence charSequence;
        n9a n9aVar;
        List list;
        paa paaVar = (paa) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        String str = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        e eVar = this.this$0;
        ChargersOfferOpenReason chargersOfferOpenReason = this.$openReason;
        if (paaVar instanceof laa) {
            eVar.b.n(ChargersAnalytics$ChargersOfferCardCloseReason.Error);
        } else if (paaVar instanceof oaa) {
            em9 em9Var = eVar.b;
            oaa oaaVar = (oaa) paaVar;
            c8a c8aVar = oaaVar.d;
            String str2 = oaaVar.a;
            int i = h7a.a[chargersOfferOpenReason.ordinal()];
            if (i == 1) {
                chargersAnalytics$ChargersOfferCardOpenReason = ChargersAnalytics$ChargersOfferCardOpenReason.Deeplink;
            } else {
                if (i != 2) {
                    w511.b();
                    return null;
                }
                chargersAnalytics$ChargersOfferCardOpenReason = ChargersAnalytics$ChargersOfferCardOpenReason.Qr;
            }
            swa swaVar = c8aVar.i;
            a8a a8aVar = c8aVar.k;
            if (swaVar != null && (list = swaVar.c) != null) {
                List list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    loop0: while (it.hasNext()) {
                        List list3 = ((twa) it.next()).b;
                        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                            Iterator it2 = list3.iterator();
                            while (it2.hasNext()) {
                                if (((wwa) it2.next()).e instanceof dxa) {
                                    z = true;
                                    break loop0;
                                }
                            }
                        }
                    }
                }
            }
            z = false;
            swa swaVar2 = c8aVar.i;
            boolean z2 = (swaVar2 != null ? swaVar2.b : null) != null;
            String str3 = oaaVar.f;
            ChargersAnalytics$ChargersSubscriptionToggleState chargersAnalytics$ChargersSubscriptionToggleState = (a8aVar == null || (n9aVar = a8aVar.h) == null) ? null : n9aVar.b ? ChargersAnalytics$ChargersSubscriptionToggleState.On : ChargersAnalytics$ChargersSubscriptionToggleState.Off;
            vva vvaVar = c8aVar.l;
            Integer valueOf = vvaVar != null ? Integer.valueOf(vvaVar.a) : null;
            vr60 vr60Var = c8aVar.f;
            String str4 = vr60Var != null ? vr60Var.h : null;
            String str5 = oaaVar.e;
            String str6 = a8aVar != null ? a8aVar.a : null;
            x7a x7aVar = c8aVar.m;
            if (x7aVar != null && (tn9Var = x7aVar.c) != null && (charSequence = tn9Var.a) != null) {
                str = charSequence.toString();
            }
            em9Var.o(str2, chargersAnalytics$ChargersOfferCardOpenReason, z, z2, str3, chargersAnalytics$ChargersSubscriptionToggleState, valueOf, str4, str, str5, str6, eVar.d);
        } else {
            eVar.getClass();
        }
        return zy11.a;
    }
}
