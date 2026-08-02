package com.yandex.go.taxi.summary.mobilityhub.interactor;

import com.yandex.go.taxi.summary.mobilityhub.model.OffersErrorReason;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.MobilityHubScreenResponse;
import com.yandex.mapkit.transport.masstransit.Route;
import defpackage.c611;
import defpackage.d0l0;
import defpackage.dbl0;
import defpackage.g92;
import defpackage.ku60;
import defpackage.mu60;
import defpackage.mvg;
import defpackage.nu60;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.rol0;
import defpackage.tcc;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zt60;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.interactor.VerticalOffersStateInteractor$offersStateFlow$$inlined$flatMapLatest$1", f = "VerticalOffersStateInteractor.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class VerticalOffersStateInteractor$offersStateFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ pz40 $lastResponse$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ z this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalOffersStateInteractor$offersStateFlow$$inlined$flatMapLatest$1(Continuation continuation, z zVar, pz40 pz40Var) {
        super(3, continuation);
        this.this$0 = zVar;
        this.$lastResponse$inlined = pz40Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        VerticalOffersStateInteractor$offersStateFlow$$inlined$flatMapLatest$1 verticalOffersStateInteractor$offersStateFlow$$inlined$flatMapLatest$1 = new VerticalOffersStateInteractor$offersStateFlow$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0, this.$lastResponse$inlined);
        verticalOffersStateInteractor$offersStateFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        verticalOffersStateInteractor$offersStateFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return verticalOffersStateInteractor$offersStateFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tpr g92Var;
        dbl0 dbl0Var;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        zt60 zt60Var = (zt60) obj2;
        z zVar = this.this$0;
        MobilityHubScreenResponse mobilityHubScreenResponse = (MobilityHubScreenResponse) ((r0) this.$lastResponse$inlined).getValue();
        zVar.getClass();
        if (zt60Var.a) {
            g92Var = new g92(2, new mu60(mobilityHubScreenResponse != null ? mobilityHubScreenResponse.d : null));
        } else {
            d0l0 c = zVar.f.c();
            if (c.b() == null) {
                g92Var = new g92(2, ku60.a);
            } else if (zt60Var.e != null) {
                g92Var = new g92(2, new nu60(OffersErrorReason.TransportLoadingError));
            } else if (zt60Var.f || (dbl0Var = zt60Var.b) == null) {
                g92Var = new g92(2, new nu60(OffersErrorReason.RouteStatsLoadingError));
            } else {
                List list = zt60Var.c;
                ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new c611(UUID.randomUUID().toString(), (Route) it.next(), c.a()));
                }
                g92Var = new rol0(new VerticalOffersStateInteractor$offersResponse$1(mobilityHubScreenResponse, zVar, arrayList, zt60Var, c, dbl0Var, null));
            }
        }
        VerticalOffersStateInteractor$offersStateFlow$2$1 verticalOffersStateInteractor$offersStateFlow$2$1 = new VerticalOffersStateInteractor$offersStateFlow$2$1(this.$lastResponse$inlined, null);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 1;
        kotlinx.coroutines.flow.e.w(vprVar);
        Object collect = g92Var.collect(new kotlinx.coroutines.flow.i0(vprVar, verticalOffersStateInteractor$offersStateFlow$2$1), this);
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (collect != coroutineSingletons2) {
            collect = zy11Var;
        }
        if (collect != coroutineSingletons2) {
            collect = zy11Var;
        }
        return collect == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
