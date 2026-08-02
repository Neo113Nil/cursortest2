package com.yandex.go.multimodal_route.ui.transport_route_part;

import com.yandex.go.address.models.Address;
import com.yandex.go.multimodal_route.network.models.TaxiTransportInfoResponseDto;
import com.yandex.mapkit.LocalizedValue;
import com.yandex.mapkit.transport.masstransit.Route;
import com.yandex.mapkit.transport.masstransit.Section;
import com.yandex.mapkit.transport.masstransit.SectionMetadata;
import com.yandex.mapkit.transport.masstransit.Weight;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.v1l0;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lcom/yandex/go/multimodal_route/network/models/TaxiTransportInfoResponseDto;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.multimodal_route.ui.transport_route_part.TransportTrackingCardUiStateInteractor$uiState$2", f = "TransportTrackingCardUiStateInteractor.kt", l = {HProv.PP_LICENSE, 167, 176, 179, 182, 183, 189}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class TransportTrackingCardUiStateInteractor$uiState$2 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $isTaxiFinished;
    final /* synthetic */ String $mmOfferId;
    final /* synthetic */ Address $originalDestAddress;
    final /* synthetic */ o2y0 $taxiOrderHolder;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ s this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransportTrackingCardUiStateInteractor$uiState$2(s sVar, String str, o2y0 o2y0Var, boolean z, Address address, Continuation continuation) {
        super(2, continuation);
        this.this$0 = sVar;
        this.$mmOfferId = str;
        this.$taxiOrderHolder = o2y0Var;
        this.$isTaxiFinished = z;
        this.$originalDestAddress = address;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TransportTrackingCardUiStateInteractor$uiState$2 transportTrackingCardUiStateInteractor$uiState$2 = new TransportTrackingCardUiStateInteractor$uiState$2(this.this$0, this.$mmOfferId, this.$taxiOrderHolder, this.$isTaxiFinished, this.$originalDestAddress, continuation);
        transportTrackingCardUiStateInteractor$uiState$2.L$0 = obj;
        return transportTrackingCardUiStateInteractor$uiState$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TransportTrackingCardUiStateInteractor$uiState$2) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x01ed, code lost:
    
        if (r2 == r7) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x01d3, code lost:
    
        if (kotlinx.coroutines.a.i(r0, r16) != r7) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00ac, code lost:
    
        if (r0 == r7) goto L97;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0111  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        o2y0 o2y0Var;
        Long l;
        v1l0 v1l0Var;
        Object a2;
        TaxiTransportInfoResponseDto taxiTransportInfoResponseDto;
        long value;
        SectionMetadata metadata;
        Weight weight;
        LocalizedValue time;
        Long l2;
        Object a3;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                kotlin.b.b(obj);
                com.yandex.go.multimodal_route.repositories.a aVar = this.this$0.a;
                String str = (this.$mmOfferId != null || (o2y0Var = this.$taxiOrderHolder) == null) ? null : o2y0Var.b().a;
                String str2 = this.$mmOfferId;
                boolean z = this.$isTaxiFinished;
                this.L$0 = vprVar;
                this.label = 1;
                a = aVar.a(str, str2, this, z);
                break;
            case 1:
                kotlin.b.b(obj);
                a = ((Result) obj).getValue();
                if (a instanceof Result.Failure) {
                    a = null;
                }
                TaxiTransportInfoResponseDto taxiTransportInfoResponseDto2 = (TaxiTransportInfoResponseDto) a;
                if (taxiTransportInfoResponseDto2 != null) {
                    Calendar calendar = taxiTransportInfoResponseDto2.g;
                    l = calendar != null ? new Long(calendar.getTimeInMillis()) : null;
                    List list = taxiTransportInfoResponseDto2.e;
                    s sVar = this.this$0;
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            v1l0Var = (v1l0) sVar.t.get((String) it.next());
                            if (v1l0Var != null) {
                            }
                        } else {
                            v1l0Var = null;
                        }
                    }
                    if (v1l0Var == null) {
                        s sVar2 = this.this$0;
                        List list2 = taxiTransportInfoResponseDto2.e;
                        String str3 = taxiTransportInfoResponseDto2.f;
                        Address address = this.$originalDestAddress;
                        this.L$0 = vprVar;
                        this.L$1 = taxiTransportInfoResponseDto2;
                        this.L$2 = l;
                        this.label = 2;
                        a2 = s.a(sVar2, list2, str3, l, address, this);
                        if (a2 != coroutineSingletons) {
                            taxiTransportInfoResponseDto = taxiTransportInfoResponseDto2;
                            v1l0Var = (v1l0) a2;
                            if (v1l0Var != null) {
                                taxiTransportInfoResponseDto2 = taxiTransportInfoResponseDto;
                            }
                        }
                    }
                    s sVar3 = this.this$0;
                    Route route = v1l0Var.a;
                    if (route == null) {
                        sVar3.getClass();
                        value = 60000;
                    } else {
                        sVar3.i.getClass();
                        List<Section> sections = route.getSections();
                        ArrayList arrayList = new ArrayList();
                        boolean z2 = false;
                        for (Object obj2 : sections) {
                            boolean z3 = ((Section) obj2).getMetadata().getData().getTaxi() != null ? true : z2;
                            if (z2) {
                                arrayList.add(obj2);
                            }
                            z2 = z3;
                        }
                        Section section = (Section) kotlin.collections.a.R(arrayList);
                        value = ((section == null || (metadata = section.getMetadata()) == null || (weight = metadata.getWeight()) == null || (time = weight.getTime()) == null) ? 0L : ((long) time.getValue()) * 1000) + 60000;
                    }
                    if (l == null || l.longValue() + value >= System.currentTimeMillis()) {
                        this.L$0 = vprVar;
                        this.L$1 = null;
                        this.L$2 = l;
                        this.L$3 = null;
                        this.J$0 = value;
                        this.label = 4;
                        if (vprVar.emit(taxiTransportInfoResponseDto2, this) != coroutineSingletons) {
                            l2 = l;
                            if (!this.$isTaxiFinished || l2 != null) {
                                this.L$0 = vprVar;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.J$0 = value;
                                this.label = 5;
                                break;
                            }
                        }
                    } else {
                        this.this$0.u = true;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.J$0 = value;
                        this.label = 3;
                        if (vprVar.emit(taxiTransportInfoResponseDto2, this) == coroutineSingletons) {
                        }
                    }
                }
            case 2:
                Long l3 = (Long) this.L$2;
                taxiTransportInfoResponseDto = (TaxiTransportInfoResponseDto) this.L$1;
                kotlin.b.b(obj);
                l = l3;
                a2 = obj;
                v1l0Var = (v1l0) a2;
                if (v1l0Var != null) {
                }
            case 3:
                kotlin.b.b(obj);
                return zy11Var;
            case 4:
                value = this.J$0;
                l2 = (Long) this.L$2;
                kotlin.b.b(obj);
                if (!this.$isTaxiFinished) {
                }
                this.L$0 = vprVar;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.J$0 = value;
                this.label = 5;
                break;
            case 5:
                value = this.J$0;
                kotlin.b.b(obj);
                com.yandex.go.multimodal_route.repositories.a aVar2 = this.this$0.a;
                String str4 = this.$mmOfferId;
                this.L$0 = vprVar;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.J$0 = value;
                this.label = 6;
                a3 = aVar2.a(null, str4, this, true);
                break;
            case 6:
                value = this.J$0;
                kotlin.b.b(obj);
                a3 = ((Result) obj).getValue();
                if (a3 instanceof Result.Failure) {
                    a3 = null;
                }
                this.this$0.u = true;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.J$0 = value;
                this.label = 7;
                return vprVar.emit((TaxiTransportInfoResponseDto) a3, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
            case 7:
                kotlin.b.b(obj);
                return zy11Var;
            default:
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
