package com.yandex.go.multimodal_route.ui.transport_route_part;

import com.yandex.go.address.models.Address;
import com.yandex.go.multimodal_route.network.models.TaxiTransportInfoResponseDto;
import com.yandex.go.multimodal_route.ui.detailed_card.MultimodalRouteFabState;
import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.transport.masstransit.Route;
import defpackage.bg30;
import defpackage.h711;
import defpackage.ia11;
import defpackage.j611;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r611;
import defpackage.scc;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.video.m3.preload_manager.PreloadManagerBuilder;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/yandex/go/multimodal_route/ui/detailed_card/MultimodalRouteFabState;", "focusState", "", "Lh711;", "items", "Lia11;", "<anonymous>", "(Lcom/yandex/go/multimodal_route/ui/detailed_card/MultimodalRouteFabState;Ljava/util/List;)Lia11;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.multimodal_route.ui.transport_route_part.TransportTrackingCardUiStateInteractor$uiState$3$2$1$1", f = "TransportTrackingCardUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class TransportTrackingCardUiStateInteractor$uiState$3$2$1$1 extends SuspendLambda implements zls {
    final /* synthetic */ List<Address> $addresses;
    final /* synthetic */ Route $filteredFromTaxiRoute;
    final /* synthetic */ BoundingBox $routeFocusBBPoints;
    final /* synthetic */ TaxiTransportInfoResponseDto $taxiInfo;
    final /* synthetic */ CharSequence $title;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ s this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransportTrackingCardUiStateInteractor$uiState$3$2$1$1(TaxiTransportInfoResponseDto taxiTransportInfoResponseDto, Route route, List list, s sVar, CharSequence charSequence, BoundingBox boundingBox, Continuation continuation) {
        super(3, continuation);
        this.$taxiInfo = taxiTransportInfoResponseDto;
        this.$filteredFromTaxiRoute = route;
        this.$addresses = list;
        this.this$0 = sVar;
        this.$title = charSequence;
        this.$routeFocusBBPoints = boundingBox;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        TransportTrackingCardUiStateInteractor$uiState$3$2$1$1 transportTrackingCardUiStateInteractor$uiState$3$2$1$1 = new TransportTrackingCardUiStateInteractor$uiState$3$2$1$1(this.$taxiInfo, this.$filteredFromTaxiRoute, this.$addresses, this.this$0, this.$title, this.$routeFocusBBPoints, (Continuation) obj3);
        transportTrackingCardUiStateInteractor$uiState$3$2$1$1.L$0 = (MultimodalRouteFabState) obj;
        transportTrackingCardUiStateInteractor$uiState$3$2$1$1.L$1 = (List) obj2;
        return transportTrackingCardUiStateInteractor$uiState$3$2$1$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MultimodalRouteFabState multimodalRouteFabState = (MultimodalRouteFabState) this.L$0;
        List list = (List) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            h711 h711Var = (h711) obj2;
            if ((h711Var instanceof r611) && (kotlin.collections.a.S(i2, list) instanceof j611)) {
                h711Var = null;
            }
            if (h711Var != null) {
                arrayList.add(h711Var);
            }
            i = i2;
        }
        String str = this.$taxiInfo.a;
        bg30 bg30Var = new bg30(this.$filteredFromTaxiRoute, null, this.$addresses, null, null, PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC);
        s sVar = this.this$0;
        return new ia11(this.$title, arrayList, multimodalRouteFabState, this.$routeFocusBBPoints, bg30Var, str, sVar.u, sVar.q.a.isEnabled());
    }
}
