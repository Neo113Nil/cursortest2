package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.interactor;

import com.yandex.go.taxi.summary.mobilityhub.model.OffersErrorReason;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.ErrorButtonAction;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.DefaultOfferBodyDtoV2$IconBodyDtoV2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.DefaultOfferBodyDtoV2$NavigatorRouteBodyDtoV2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.DefaultOfferBodyDtoV2$TextBodyDtoV2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.DefaultOfferBodyDtoV2$TransportRouteBodyDtoV2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemDtoV2$DefaultOfferItemDtoV2;
import defpackage.avj0;
import defpackage.c0v;
import defpackage.eja1;
import defpackage.exr;
import defpackage.g92;
import defpackage.gxu;
import defpackage.jl40;
import defpackage.ke31;
import defpackage.khq0;
import defpackage.kyh0;
import defpackage.le31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pu60;
import defpackage.qu60;
import defpackage.ru60;
import defpackage.su60;
import defpackage.tu60;
import defpackage.u1n;
import defpackage.vpr;
import defpackage.w511;
import defpackage.y9o;
import defpackage.yc31;
import defpackage.yw01;
import defpackage.z0v;
import defpackage.zls;
import defpackage.zuj0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.interactor.VerticalHubV2UiStateInteractor$hubOffersStateFlow$$inlined$flatMapLatest$1", f = "VerticalHubV2UiStateInteractor.kt", l = {216, 189}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class VerticalHubV2UiStateInteractor$hubOffersStateFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalHubV2UiStateInteractor$hubOffersStateFlow$$inlined$flatMapLatest$1(q qVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = qVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        VerticalHubV2UiStateInteractor$hubOffersStateFlow$$inlined$flatMapLatest$1 verticalHubV2UiStateInteractor$hubOffersStateFlow$$inlined$flatMapLatest$1 = new VerticalHubV2UiStateInteractor$hubOffersStateFlow$$inlined$flatMapLatest$1(this.this$0, (Continuation) obj3);
        verticalHubV2UiStateInteractor$hubOffersStateFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        verticalHubV2UiStateInteractor$hubOffersStateFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return verticalHubV2UiStateInteractor$hubOffersStateFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x01d6, code lost:
    
        if (kotlinx.coroutines.flow.e.u((defpackage.tpr) r2, r1, r18) == r3) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x01d8, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e8, code lost:
    
        if (r2 == r3) goto L70;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ErrorButtonAction errorButtonAction;
        Object g92Var;
        String str;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tu60 tu60Var = (tu60) obj2;
            if (tu60Var instanceof qu60) {
                q qVar = this.this$0;
                qu60 qu60Var = (qu60) tu60Var;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = vprVar;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 1;
                qVar.getClass();
                List list = qu60Var.a.a;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (obj3 instanceof HubItemDtoV2$DefaultOfferItemDtoV2) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.f fVar = ((HubItemDtoV2$DefaultOfferItemDtoV2) it.next()).e;
                    if (fVar instanceof DefaultOfferBodyDtoV2$IconBodyDtoV2) {
                        str = ((DefaultOfferBodyDtoV2$IconBodyDtoV2) fVar).a;
                    } else {
                        if (!(fVar instanceof DefaultOfferBodyDtoV2$TransportRouteBodyDtoV2) && !(fVar instanceof DefaultOfferBodyDtoV2$TextBodyDtoV2) && !(fVar instanceof DefaultOfferBodyDtoV2$NavigatorRouteBodyDtoV2) && !jl40.l(fVar, com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.e.INSTANCE) && fVar != null) {
                            w511.b();
                            return null;
                        }
                        str = null;
                    }
                    if (str != null) {
                        arrayList2.add(str);
                    }
                }
                g92Var = kotlinx.coroutines.flow.e.X(qVar.l.c, new VerticalHubV2UiStateInteractor$mapLoadedState$$inlined$flatMapLatest$1(null, qVar, qu60Var, new yw01(kotlin.sequences.b.g(eja1.d("", ((com.yandex.go.taxi.tariffs.internal.repository.k) qVar.a).j().a), new exr(5, kotlin.collections.a.N0(arrayList2))), new ke31(0))));
            } else if (tu60Var instanceof ru60) {
                q qVar2 = this.this$0;
                ru60 ru60Var = (ru60) tu60Var;
                qVar2.getClass();
                ArrayList arrayList3 = new ArrayList(6);
                for (int i2 = 0; i2 < 6; i2++) {
                    arrayList3.add(c0v.a);
                }
                khq0 a = qVar2.l.a();
                g92Var = kotlinx.coroutines.flow.e.X(qVar2.h.a(ru60Var.a, a != null ? a.h : null), new VerticalHubV2UiStateInteractor$mapLoadingState$$inlined$flatMapLatest$1(null, qVar2, ru60Var, a, arrayList3));
            } else {
                boolean l = jl40.l(tu60Var, pu60.a);
                gxu gxuVar = gxu.a;
                z0v z0vVar = z0v.a;
                EmptyList emptyList = EmptyList.a;
                if (l) {
                    avj0 avj0Var = (avj0) this.this$0.e.e;
                    g92Var = new g92(2, new le31(emptyList, null, new y9o(avj0Var.h(kyh0.mt_select_destination_address), avj0Var.h(kyh0.mt_will_show_routes), new u1n(8, avj0Var.h(kyh0.mt_routes_button_to_addresses), ErrorButtonAction.OPEN_ADDRESS_SELECTOR)), null, z0vVar, false, gxuVar, null));
                } else {
                    if (!(tu60Var instanceof su60)) {
                        w511.b();
                        return null;
                    }
                    com.yandex.go.taxi.summary.mobilityhub.mapper.e eVar = this.this$0.e;
                    OffersErrorReason offersErrorReason = ((su60) tu60Var).a;
                    zuj0 zuj0Var = eVar.e;
                    int i3 = yc31.a[offersErrorReason.ordinal()];
                    if (i3 == 1) {
                        errorButtonAction = ErrorButtonAction.REFRESH_TRANSPORT_ROUTES;
                    } else if (i3 == 2) {
                        errorButtonAction = ErrorButtonAction.REFRESH_ROUTESTATS;
                    } else {
                        if (i3 != 3) {
                            w511.b();
                            return null;
                        }
                        errorButtonAction = ErrorButtonAction.REFRESH;
                    }
                    avj0 avj0Var2 = (avj0) zuj0Var;
                    g92Var = new g92(2, new le31(emptyList, null, new y9o(avj0Var2.h(kyh0.mt_routes_loading_error), avj0Var2.h(kyh0.mt_try_later), new u1n(8, avj0Var2.h(kyh0.mobility_hub_error_state_eror_500_button_title), errorButtonAction)), null, z0vVar, false, gxuVar, null));
                }
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar = (vpr) this.L$2;
            kotlin.b.b(obj);
            g92Var = obj;
        }
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.label = 2;
    }
}
