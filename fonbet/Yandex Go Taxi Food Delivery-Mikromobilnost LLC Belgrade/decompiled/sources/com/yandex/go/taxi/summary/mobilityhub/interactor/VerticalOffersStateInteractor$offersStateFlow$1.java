package com.yandex.go.taxi.summary.mobilityhub.interactor;

import com.yandex.go.taxi.summary.mobilityhub.model.TransportErrorReason;
import defpackage.dbl0;
import defpackage.ems;
import defpackage.h2v;
import defpackage.jl40;
import defpackage.m811;
import defpackage.mvg;
import defpackage.n811;
import defpackage.ny61;
import defpackage.o811;
import defpackage.p811;
import defpackage.scc;
import defpackage.ubl0;
import defpackage.w511;
import defpackage.zt60;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\n¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lubl0;", "routeStatsState", "Lp811;", "transportState", "Lh2v;", ConfigConstants.CONFIG, "", "selectedFilter", "Lzy11;", "<unused var>", "Lzt60;", "<anonymous>", "(Lcom/yandex/go/taxi/summary/mobilityhub/interactor/RouteStatsState;Lcom/yandex/go/taxi/summary/mobilityhub/model/TransportRouteState;Lcom/yandex/go/taxi/summary/mobilityhub/model/HubVerticalConfig;Ljava/lang/String;V)Lcom/yandex/go/taxi/summary/mobilityhub/interactor/OffersData;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.interactor.VerticalOffersStateInteractor$offersStateFlow$1", f = "VerticalOffersStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class VerticalOffersStateInteractor$offersStateFlow$1 extends SuspendLambda implements ems {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    int label;
    final /* synthetic */ z this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalOffersStateInteractor$offersStateFlow$1(z zVar, Continuation continuation) {
        super(6, continuation);
        this.this$0 = zVar;
    }

    @Override // defpackage.ems
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        VerticalOffersStateInteractor$offersStateFlow$1 verticalOffersStateInteractor$offersStateFlow$1 = new VerticalOffersStateInteractor$offersStateFlow$1(this.this$0, (Continuation) obj6);
        verticalOffersStateInteractor$offersStateFlow$1.L$0 = (ubl0) obj;
        verticalOffersStateInteractor$offersStateFlow$1.L$1 = (p811) obj2;
        verticalOffersStateInteractor$offersStateFlow$1.L$2 = (h2v) obj3;
        verticalOffersStateInteractor$offersStateFlow$1.L$3 = (String) obj4;
        return verticalOffersStateInteractor$offersStateFlow$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        EmptyList emptyList;
        TransportErrorReason transportErrorReason;
        ubl0 ubl0Var = (ubl0) this.L$0;
        p811 p811Var = (p811) this.L$1;
        h2v h2vVar = (h2v) this.L$2;
        String str = (String) this.L$3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.getClass();
        boolean z2 = p811Var instanceof m811;
        boolean z3 = true;
        EmptyList emptyList2 = EmptyList.a;
        if (z2) {
            transportErrorReason = ((m811) p811Var).a;
            emptyList = emptyList2;
        } else {
            if (!(p811Var instanceof n811)) {
                if (!jl40.l(p811Var, o811.a)) {
                    w511.b();
                    return null;
                }
                z = true;
                emptyList = emptyList2;
                transportErrorReason = null;
                if (!ubl0Var.b && !z) {
                    z3 = false;
                }
                dbl0 dbl0Var = ubl0Var.a;
                boolean z4 = ubl0Var.c;
                if (str.length() <= 0) {
                    str = null;
                }
                return new zt60(z3, dbl0Var, emptyList, h2vVar, transportErrorReason, z4, scc.h(str));
            }
            emptyList = ((n811) p811Var).a;
            transportErrorReason = null;
        }
        z = false;
        if (!ubl0Var.b) {
            z3 = false;
        }
        dbl0 dbl0Var2 = ubl0Var.a;
        boolean z42 = ubl0Var.c;
        if (str.length() <= 0) {
        }
        return new zt60(z3, dbl0Var2, emptyList, h2vVar, transportErrorReason, z42, scc.h(str));
    }
}
