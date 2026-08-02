package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemAnalyticsV2;
import defpackage.a0v;
import defpackage.c0v;
import defpackage.e0v;
import defpackage.fx01;
import defpackage.g0v;
import defpackage.hta1;
import defpackage.jd31;
import defpackage.je31;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rfb1;
import defpackage.rzu;
import defpackage.tcc;
import defpackage.tls;
import defpackage.tse;
import defpackage.tzu;
import defpackage.vzu;
import defpackage.w511;
import defpackage.wg6;
import defpackage.wls;
import defpackage.wzu;
import defpackage.yzu;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.VerticalHubV2ScreenKt$VerticalHubV2Screen$1$2$3$3$1", f = "VerticalHubV2Screen.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class VerticalHubV2ScreenKt$VerticalHubV2Screen$1$2$3$3$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $action;
    final /* synthetic */ wg6 $state;
    final /* synthetic */ je31 $uiState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalHubV2ScreenKt$VerticalHubV2Screen$1$2$3$3$1(tls tlsVar, je31 je31Var, wg6 wg6Var, Continuation continuation) {
        super(2, continuation);
        this.$action = tlsVar;
        this.$uiState = je31Var;
        this.$state = wg6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VerticalHubV2ScreenKt$VerticalHubV2Screen$1$2$3$3$1(this.$action, this.$uiState, this.$state, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        VerticalHubV2ScreenKt$VerticalHubV2Screen$1$2$3$3$1 verticalHubV2ScreenKt$VerticalHubV2Screen$1$2$3$3$1 = (VerticalHubV2ScreenKt$VerticalHubV2Screen$1$2$3$3$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        verticalHubV2ScreenKt$VerticalHubV2Screen$1$2$3$3$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        fx01 fx01Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        tls tlsVar = this.$action;
        List<g0v> list = this.$uiState.b.a;
        ArrayList arrayList = new ArrayList();
        for (g0v g0vVar : list) {
            if (g0vVar instanceof wzu) {
                List list2 = ((wzu) g0vVar).h;
                ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(hta1.d((HubItemAnalyticsV2) it.next(), null));
                }
                fx01Var = new fx01(arrayList2);
            } else if (g0vVar instanceof yzu) {
                List list3 = ((yzu) g0vVar).i;
                ArrayList arrayList3 = new ArrayList(tcc.n(list3, 10));
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(hta1.d((HubItemAnalyticsV2) it2.next(), null));
                }
                fx01Var = new fx01(arrayList3);
            } else if (g0vVar instanceof a0v) {
                List list4 = ((a0v) g0vVar).j;
                ArrayList arrayList4 = new ArrayList(tcc.n(list4, 10));
                Iterator it3 = list4.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(hta1.d((HubItemAnalyticsV2) it3.next(), null));
                }
                fx01Var = new fx01(arrayList4);
            } else {
                if (!(g0vVar instanceof e0v) && !jl40.l(g0vVar, c0v.a) && !(g0vVar instanceof vzu) && !(g0vVar instanceof tzu) && !(g0vVar instanceof rzu)) {
                    w511.b();
                    return null;
                }
                fx01Var = null;
            }
            if (fx01Var != null) {
                arrayList.add(fx01Var);
            }
        }
        tlsVar.invoke(new jd31(arrayList, rfb1.b(this.$state)));
        return zy11.a;
    }
}
