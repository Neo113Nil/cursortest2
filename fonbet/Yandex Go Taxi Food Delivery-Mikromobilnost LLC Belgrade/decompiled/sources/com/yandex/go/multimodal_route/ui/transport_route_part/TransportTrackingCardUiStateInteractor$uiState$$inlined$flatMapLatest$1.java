package com.yandex.go.multimodal_route.ui.transport_route_part;

import com.yandex.go.address.models.Address;
import com.yandex.go.multimodal_route.analytics.MultimodalRouteAnalytics$MultimodalRouteTripStatus;
import com.yandex.go.multimodal_route.network.models.TaxiFeedbackDto;
import com.yandex.go.multimodal_route.network.models.TaxiTransportInfoResponseDto;
import com.yandex.go.multimodal_route.taxi_feedback.TaxiFeedbackStateRepository;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.transport.masstransit.Route;
import defpackage.es40;
import defpackage.fi6;
import defpackage.g92;
import defpackage.lt40;
import defpackage.mt40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.tpr;
import defpackage.v1l0;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.multimodal_route.ui.transport_route_part.TransportTrackingCardUiStateInteractor$uiState$$inlined$flatMapLatest$1", f = "TransportTrackingCardUiStateInteractor.kt", l = {219, 221, 189}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
public final class TransportTrackingCardUiStateInteractor$uiState$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ String $mmOfferId$inlined;
    final /* synthetic */ Address $originalDestAddress$inlined;
    final /* synthetic */ String $routeType$inlined;
    final /* synthetic */ o2y0 $taxiOrderHolder$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ s this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransportTrackingCardUiStateInteractor$uiState$$inlined$flatMapLatest$1(Continuation continuation, o2y0 o2y0Var, s sVar, Address address, String str, String str2) {
        super(3, continuation);
        this.$taxiOrderHolder$inlined = o2y0Var;
        this.this$0 = sVar;
        this.$originalDestAddress$inlined = address;
        this.$mmOfferId$inlined = str;
        this.$routeType$inlined = str2;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        TransportTrackingCardUiStateInteractor$uiState$$inlined$flatMapLatest$1 transportTrackingCardUiStateInteractor$uiState$$inlined$flatMapLatest$1 = new TransportTrackingCardUiStateInteractor$uiState$$inlined$flatMapLatest$1((Continuation) obj3, this.$taxiOrderHolder$inlined, this.this$0, this.$originalDestAddress$inlined, this.$mmOfferId$inlined, this.$routeType$inlined);
        transportTrackingCardUiStateInteractor$uiState$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        transportTrackingCardUiStateInteractor$uiState$$inlined$flatMapLatest$1.L$1 = obj2;
        return transportTrackingCardUiStateInteractor$uiState$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x01d7, code lost:
    
        if (kotlinx.coroutines.flow.e.u(r1, r0, r27) != r6) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0081, code lost:
    
        if (r2 == null) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e6 A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        TaxiTransportInfoResponseDto taxiTransportInfoResponseDto;
        TaxiOrder b;
        vpr vprVar;
        String str;
        CharSequence charSequence;
        Object i;
        vpr vprVar2;
        String str2;
        TaxiOrder b2;
        tpr g92Var;
        Iterator it;
        v1l0 v1l0Var;
        CharSequence charSequence2;
        TaxiTransportInfoResponseDto taxiTransportInfoResponseDto2;
        Object a;
        vpr vprVar3;
        CharSequence charSequence3;
        TaxiTransportInfoResponseDto taxiTransportInfoResponseDto3;
        s sVar;
        Route route;
        String str3;
        TaxiFeedbackDto taxiFeedbackDto;
        tpr lVar;
        v1l0 v1l0Var2;
        vpr vprVar4 = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            taxiTransportInfoResponseDto = (TaxiTransportInfoResponseDto) obj2;
            if (taxiTransportInfoResponseDto == null) {
                g92Var = new g92(2, null);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.label = 3;
            } else {
                String str4 = taxiTransportInfoResponseDto.d;
                if (str4 != null) {
                    if (str4.length() == 0) {
                        o2y0 o2y0Var = this.$taxiOrderHolder$inlined;
                        str4 = (o2y0Var == null || (b2 = o2y0Var.b()) == null) ? null : b2.x();
                    }
                }
                o2y0 o2y0Var2 = this.$taxiOrderHolder$inlined;
                str4 = (o2y0Var2 == null || (b = o2y0Var2.b()) == null) ? null : b.x();
                FormattedText formattedText = taxiTransportInfoResponseDto.b;
                if (formattedText != null) {
                    ru.yandex.taxi.widget.c cVar = this.this$0.e;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = vprVar4;
                    this.L$3 = null;
                    this.L$4 = taxiTransportInfoResponseDto;
                    this.L$5 = null;
                    this.L$6 = str4;
                    this.label = 1;
                    i = ru.yandex.taxi.widget.c.i(cVar, formattedText, null, this, 30);
                    if (i != coroutineSingletons) {
                        String str5 = str4;
                        vprVar2 = vprVar4;
                        str2 = str5;
                    }
                    return coroutineSingletons;
                }
                vprVar = vprVar4;
                str = str4;
                charSequence = null;
                TaxiTransportInfoResponseDto taxiTransportInfoResponseDto4 = taxiTransportInfoResponseDto;
                it = taxiTransportInfoResponseDto4.e.iterator();
                while (true) {
                    if (it.hasNext()) {
                        v1l0Var = null;
                        break;
                    }
                    v1l0Var = (v1l0) this.this$0.t.get((String) it.next());
                    if (v1l0Var != null) {
                        break;
                    }
                }
                if (v1l0Var != null) {
                    s sVar2 = this.this$0;
                    List list = taxiTransportInfoResponseDto4.e;
                    String str6 = taxiTransportInfoResponseDto4.f;
                    Calendar calendar = taxiTransportInfoResponseDto4.g;
                    Long l = calendar != null ? new Long(calendar.getTimeInMillis()) : null;
                    Address address = this.$originalDestAddress$inlined;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = vprVar;
                    this.L$3 = null;
                    this.L$4 = taxiTransportInfoResponseDto4;
                    this.L$5 = charSequence;
                    this.L$6 = str;
                    this.label = 2;
                    a = s.a(sVar2, list, str6, l, address, this);
                    if (a != coroutineSingletons) {
                        vprVar3 = vprVar;
                        charSequence3 = charSequence;
                        taxiTransportInfoResponseDto3 = taxiTransportInfoResponseDto4;
                        v1l0Var2 = (v1l0) a;
                        if (v1l0Var2 != null) {
                        }
                    }
                    return coroutineSingletons;
                }
                vprVar4 = vprVar;
                charSequence2 = charSequence;
                taxiTransportInfoResponseDto2 = taxiTransportInfoResponseDto4;
                String str7 = str;
                Route route2 = v1l0Var.b;
                Route route3 = v1l0Var.a;
                sVar = this.this$0;
                if (sVar.u) {
                }
                es40 es40Var = this.this$0.r;
                str3 = this.$mmOfferId$inlined;
                if (str3 == null) {
                }
                es40Var.b(str3, this.$routeType$inlined, MultimodalRouteAnalytics$MultimodalRouteTripStatus.Complete);
                List list2 = v1l0Var.c;
                fi6 fi6Var = new fi6();
                fi6Var.d(route.getGeometry());
                BoundingBox g = fi6Var.g();
                s sVar3 = this.this$0;
                taxiFeedbackDto = taxiTransportInfoResponseDto2.h;
                TaxiFeedbackStateRepository taxiFeedbackStateRepository = sVar3.c;
                if (taxiFeedbackDto != null) {
                }
                s sVar4 = this.this$0;
                g92Var = kotlinx.coroutines.flow.e.X(new p(lVar, taxiTransportInfoResponseDto2, route, sVar4, str7), new TransportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$flatMapLatest$1(null, this.$taxiOrderHolder$inlined, route, route3, sVar4, list2, taxiTransportInfoResponseDto2, charSequence2, g));
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.label = 3;
            }
        } else if (i2 == 1) {
            str2 = (String) this.L$6;
            taxiTransportInfoResponseDto = (TaxiTransportInfoResponseDto) this.L$4;
            vprVar2 = (vpr) this.L$2;
            kotlin.b.b(obj);
            i = obj;
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str8 = (String) this.L$6;
            charSequence3 = (CharSequence) this.L$5;
            taxiTransportInfoResponseDto3 = (TaxiTransportInfoResponseDto) this.L$4;
            vprVar3 = (vpr) this.L$2;
            kotlin.b.b(obj);
            str = str8;
            a = obj;
            v1l0Var2 = (v1l0) a;
            if (v1l0Var2 != null) {
                g92Var = new g92(2, null);
                vprVar4 = vprVar3;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.label = 3;
            } else {
                charSequence2 = charSequence3;
                taxiTransportInfoResponseDto2 = taxiTransportInfoResponseDto3;
                v1l0Var = v1l0Var2;
                vprVar4 = vprVar3;
                String str72 = str;
                Route route22 = v1l0Var.b;
                Route route32 = v1l0Var.a;
                sVar = this.this$0;
                if (sVar.u) {
                    route = route22;
                } else {
                    mt40 mt40Var = sVar.o;
                    mt40Var.getClass();
                    route = new lt40(route22, mt40Var);
                }
                es40 es40Var2 = this.this$0.r;
                str3 = this.$mmOfferId$inlined;
                if (str3 == null) {
                    str3 = "";
                }
                es40Var2.b(str3, this.$routeType$inlined, MultimodalRouteAnalytics$MultimodalRouteTripStatus.Complete);
                List list22 = v1l0Var.c;
                fi6 fi6Var2 = new fi6();
                fi6Var2.d(route.getGeometry());
                BoundingBox g2 = fi6Var2.g();
                s sVar32 = this.this$0;
                taxiFeedbackDto = taxiTransportInfoResponseDto2.h;
                TaxiFeedbackStateRepository taxiFeedbackStateRepository2 = sVar32.c;
                if (taxiFeedbackDto != null) {
                    com.yandex.go.coroutines.g gVar = taxiFeedbackStateRepository2.a;
                    gVar.a(0L);
                    gVar.b();
                    lVar = new g92(2, null);
                } else {
                    com.yandex.go.coroutines.g gVar2 = taxiFeedbackStateRepository2.a;
                    gVar2.b();
                    gVar2.a(taxiFeedbackDto.c * 1000);
                    lVar = new l(taxiFeedbackStateRepository2.c, taxiFeedbackDto, sVar32);
                }
                s sVar42 = this.this$0;
                g92Var = kotlinx.coroutines.flow.e.X(new p(lVar, taxiTransportInfoResponseDto2, route, sVar42, str72), new TransportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$flatMapLatest$1(null, this.$taxiOrderHolder$inlined, route, route32, sVar42, list22, taxiTransportInfoResponseDto2, charSequence2, g2));
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.label = 3;
            }
        }
        str = str2;
        vprVar = vprVar2;
        charSequence = (CharSequence) i;
        TaxiTransportInfoResponseDto taxiTransportInfoResponseDto42 = taxiTransportInfoResponseDto;
        it = taxiTransportInfoResponseDto42.e.iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        if (v1l0Var != null) {
        }
    }
}
