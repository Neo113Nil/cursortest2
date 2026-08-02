package com.yandex.go.taxi.tariffs.internal.factory;

import com.yandex.go.taxi.tariffs.internal.routestats.models.RouteStatsMode;
import com.yandex.go.zone.model.Zone;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.bbl0;
import defpackage.ems;
import defpackage.fnx0;
import defpackage.g7j0;
import defpackage.ijj0;
import defpackage.jn40;
import defpackage.kb5;
import defpackage.mi31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.qqo;
import defpackage.vo40;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lfnx0;", PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, "Lbbl0;", Constants.KEY_DATA, "Lcom/yandex/go/taxi/tariffs/internal/routestats/models/RouteStatsMode;", "mode", "Lzy11;", "<unused var>", "Lg7j0;", "<anonymous>", "(Lru/yandex/taxi/tariffs/model/TariffSelection;Lcom/yandex/go/taxi/tariffs/internal/routestats/models/RouteStatsData;Lcom/yandex/go/taxi/tariffs/internal/routestats/models/RouteStatsMode;VV)Lcom/yandex/go/taxi/tariffs/internal/models/RequestInfo;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.tariffs.internal.factory.TariffInfoRequestFactory$infoFlow$1", f = "TariffInfoRequestFactory.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class TariffInfoRequestFactory$infoFlow$1 extends SuspendLambda implements ems {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffInfoRequestFactory$infoFlow$1(a aVar, Continuation continuation) {
        super(6, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.ems
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        TariffInfoRequestFactory$infoFlow$1 tariffInfoRequestFactory$infoFlow$1 = new TariffInfoRequestFactory$infoFlow$1(this.this$0, (Continuation) obj6);
        tariffInfoRequestFactory$infoFlow$1.L$0 = (fnx0) obj;
        tariffInfoRequestFactory$infoFlow$1.L$1 = (bbl0) obj2;
        tariffInfoRequestFactory$infoFlow$1.L$2 = (RouteStatsMode) obj3;
        return tariffInfoRequestFactory$infoFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        pex0 pex0Var;
        jn40 jn40Var;
        fnx0 fnx0Var = (fnx0) this.L$0;
        bbl0 bbl0Var = (bbl0) this.L$1;
        RouteStatsMode routeStatsMode = (RouteStatsMode) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        RouteStatsMode routeStatsMode2 = (RouteStatsMode) this.this$0.d.b.getAndSet(null);
        RouteStatsMode routeStatsMode3 = routeStatsMode2 == null ? routeStatsMode : routeStatsMode2;
        if (routeStatsMode3 == null) {
            return null;
        }
        a aVar = this.this$0;
        mi31 mi31Var = fnx0Var.a;
        vo40 vo40Var = aVar.e;
        vo40Var.getClass();
        pex0 pex0Var2 = mi31Var.a;
        boolean z2 = false;
        if (pex0Var2.K0 && (jn40Var = pex0Var2.V) != null && jn40Var.i && !((Boolean) ((qqo) vo40Var.c.getValue()).b()).booleanValue()) {
            String str = mi31Var.b;
            String str2 = mi31Var.f;
            pex0 pex0Var3 = mi31Var.a;
            kb5 kb5Var = new kb5(str, str2, pex0Var3.O, pex0Var3.u0, pex0Var3.K0, 32);
            ijj0 ijj0Var = vo40Var.b;
            Zone zone = bbl0Var.b;
            List list = bbl0Var.d;
            List e = ijj0Var.e(zone, kb5Var, list);
            if (e.size() != list.size() || !e.containsAll(list)) {
                z = true;
                bbl0 a = bbl0.a(bbl0Var, null, z, null, 130559);
                kb5 kb5Var2 = fnx0Var.e;
                pex0Var = fnx0Var.c;
                if (pex0Var.u && !pex0Var.v) {
                    z2 = true;
                }
                return new g7j0(kb5Var2, a, routeStatsMode3, z2, aVar.f.a());
            }
        }
        z = false;
        bbl0 a2 = bbl0.a(bbl0Var, null, z, null, 130559);
        kb5 kb5Var22 = fnx0Var.e;
        pex0Var = fnx0Var.c;
        if (pex0Var.u) {
            z2 = true;
        }
        return new g7j0(kb5Var22, a2, routeStatsMode3, z2, aVar.f.a());
    }
}
