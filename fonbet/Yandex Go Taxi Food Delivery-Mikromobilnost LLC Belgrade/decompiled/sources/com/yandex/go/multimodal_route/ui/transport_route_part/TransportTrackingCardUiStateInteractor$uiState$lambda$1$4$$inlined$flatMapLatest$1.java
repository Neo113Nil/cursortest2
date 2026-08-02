package com.yandex.go.multimodal_route.ui.transport_route_part;

import com.yandex.go.multimodal_route.network.models.TaxiTransportInfoResponseDto;
import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.transport.masstransit.Route;
import defpackage.fay0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.multimodal_route.ui.transport_route_part.TransportTrackingCardUiStateInteractor$uiState$lambda$1$4$$inlined$flatMapLatest$1", f = "TransportTrackingCardUiStateInteractor.kt", l = {HProv.PP_AUTH_INFO, 189}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
public final class TransportTrackingCardUiStateInteractor$uiState$lambda$1$4$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ List $addresses$inlined;
    final /* synthetic */ Route $filteredFromTaxiRoute$inlined;
    final /* synthetic */ Route $fullRoute$inlined;
    final /* synthetic */ BoundingBox $routeFocusBBPoints$inlined;
    final /* synthetic */ TaxiTransportInfoResponseDto $taxiInfo$inlined;
    final /* synthetic */ fay0 $taxiSectionData$inlined;
    final /* synthetic */ CharSequence $title$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ s this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransportTrackingCardUiStateInteractor$uiState$lambda$1$4$$inlined$flatMapLatest$1(Continuation continuation, fay0 fay0Var, Route route, Route route2, s sVar, List list, TaxiTransportInfoResponseDto taxiTransportInfoResponseDto, CharSequence charSequence, BoundingBox boundingBox) {
        super(3, continuation);
        this.$taxiSectionData$inlined = fay0Var;
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
        TransportTrackingCardUiStateInteractor$uiState$lambda$1$4$$inlined$flatMapLatest$1 transportTrackingCardUiStateInteractor$uiState$lambda$1$4$$inlined$flatMapLatest$1 = new TransportTrackingCardUiStateInteractor$uiState$lambda$1$4$$inlined$flatMapLatest$1((Continuation) obj3, this.$taxiSectionData$inlined, this.$filteredFromTaxiRoute$inlined, this.$fullRoute$inlined, this.this$0, this.$addresses$inlined, this.$taxiInfo$inlined, this.$title$inlined, this.$routeFocusBBPoints$inlined);
        transportTrackingCardUiStateInteractor$uiState$lambda$1$4$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        transportTrackingCardUiStateInteractor$uiState$lambda$1$4$$inlined$flatMapLatest$1.L$1 = obj2;
        return transportTrackingCardUiStateInteractor$uiState$lambda$1$4$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a4, code lost:
    
        if (kotlinx.coroutines.flow.e.u(r6, r4, r17) == r3) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b;
        vpr vprVar;
        tpr tprVar;
        vpr vprVar2 = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ((Boolean) obj2).getClass();
            fay0 fay0Var = this.$taxiSectionData$inlined;
            Route route = fay0Var == null ? this.$filteredFromTaxiRoute$inlined : this.$fullRoute$inlined;
            s sVar = this.this$0;
            r0 r0Var = sVar.j.f;
            ru.yandex.taxi.masstransit.detailedroute.ui.f fVar = sVar.f;
            List list = this.$addresses$inlined;
            boolean isEnabled = sVar.q.a.isEnabled();
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = vprVar2;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = r0Var;
            this.label = 1;
            b = fVar.b(route, list, fay0Var, false, isEnabled, 0L);
            if (b != coroutineSingletons) {
                vprVar = vprVar2;
                tprVar = r0Var;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                kotlin.b.b(obj);
                return zy11.a;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        tprVar = (tpr) this.L$5;
        vpr vprVar3 = (vpr) this.L$2;
        kotlin.b.b(obj);
        vprVar = vprVar3;
        b = obj;
        m0 m0Var = new m0(tprVar, (tpr) b, new TransportTrackingCardUiStateInteractor$uiState$3$2$1$1(this.$taxiInfo$inlined, this.$filteredFromTaxiRoute$inlined, this.$addresses$inlined, this.this$0, this.$title$inlined, this.$routeFocusBBPoints$inlined, null));
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.L$5 = null;
        this.label = 2;
    }
}
