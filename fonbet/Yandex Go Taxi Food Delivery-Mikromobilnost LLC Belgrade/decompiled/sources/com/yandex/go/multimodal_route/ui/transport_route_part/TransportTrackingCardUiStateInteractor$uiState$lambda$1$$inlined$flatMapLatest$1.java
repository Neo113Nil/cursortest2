package com.yandex.go.multimodal_route.ui.transport_route_part;

import com.yandex.go.multimodal_route.network.models.TaxiTransportInfoResponseDto;
import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.transport.masstransit.Route;
import defpackage.fay0;
import defpackage.g92;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.multimodal_route.ui.transport_route_part.TransportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$flatMapLatest$1", f = "TransportTrackingCardUiStateInteractor.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
public final class TransportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ List $addresses$inlined;
    final /* synthetic */ Route $filteredFromTaxiRoute$inlined;
    final /* synthetic */ Route $fullRoute$inlined;
    final /* synthetic */ BoundingBox $routeFocusBBPoints$inlined;
    final /* synthetic */ TaxiTransportInfoResponseDto $taxiInfo$inlined;
    final /* synthetic */ o2y0 $taxiOrderHolder$inlined;
    final /* synthetic */ CharSequence $title$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ s this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$flatMapLatest$1(Continuation continuation, o2y0 o2y0Var, Route route, Route route2, s sVar, List list, TaxiTransportInfoResponseDto taxiTransportInfoResponseDto, CharSequence charSequence, BoundingBox boundingBox) {
        super(3, continuation);
        this.$taxiOrderHolder$inlined = o2y0Var;
        this.$filteredFromTaxiRoute$inlined = route;
        this.$fullRoute$inlined = route2;
        this.this$0 = sVar;
        this.$addresses$inlined = list;
        this.$taxiInfo$inlined = taxiTransportInfoResponseDto;
        this.$title$inlined = charSequence;
        this.$routeFocusBBPoints$inlined = boundingBox;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        TransportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$flatMapLatest$1 transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$flatMapLatest$1 = new TransportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$flatMapLatest$1((Continuation) obj3, this.$taxiOrderHolder$inlined, this.$filteredFromTaxiRoute$inlined, this.$fullRoute$inlined, this.this$0, this.$addresses$inlined, this.$taxiInfo$inlined, this.$title$inlined, this.$routeFocusBBPoints$inlined);
        transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$flatMapLatest$1.L$1 = obj2;
        return transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            fay0 fay0Var = (fay0) obj2;
            o2y0 o2y0Var = this.$taxiOrderHolder$inlined;
            kotlinx.coroutines.flow.internal.g X = kotlinx.coroutines.flow.e.X(o2y0Var != null ? kotlinx.coroutines.flow.e.t(new r(o2y0Var.a())) : new g92(2, Boolean.FALSE), new TransportTrackingCardUiStateInteractor$uiState$lambda$1$4$$inlined$flatMapLatest$1(null, fay0Var, this.$filteredFromTaxiRoute$inlined, this.$fullRoute$inlined, this.this$0, this.$addresses$inlined, this.$taxiInfo$inlined, this.$title$inlined, this.$routeFocusBBPoints$inlined));
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(X, vprVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
