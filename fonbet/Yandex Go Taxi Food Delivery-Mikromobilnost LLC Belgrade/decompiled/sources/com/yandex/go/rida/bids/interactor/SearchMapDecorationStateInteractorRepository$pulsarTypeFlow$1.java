package com.yandex.go.rida.bids.interactor;

import com.yandex.go.rida.bids.state.MapDecorationUiState$PulsarType;
import com.yandex.go.zone.dto.objects.ServiceLevel;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rup0;
import defpackage.sup0;
import defpackage.w511;
import defpackage.yal0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lyal0;", "routestats", "", "serviceLevelValue", "Lcom/yandex/go/rida/bids/state/MapDecorationUiState$PulsarType;", "<anonymous>", "(Lyal0;I)Lcom/yandex/go/rida/bids/state/MapDecorationUiState$PulsarType;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.rida.bids.interactor.SearchMapDecorationStateInteractorRepository$pulsarTypeFlow$1", f = "SearchMapDecorationStateInteractorRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SearchMapDecorationStateInteractorRepository$pulsarTypeFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ int I$0;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ sup0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchMapDecorationStateInteractorRepository$pulsarTypeFlow$1(sup0 sup0Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = sup0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        SearchMapDecorationStateInteractorRepository$pulsarTypeFlow$1 searchMapDecorationStateInteractorRepository$pulsarTypeFlow$1 = new SearchMapDecorationStateInteractorRepository$pulsarTypeFlow$1(this.this$0, (Continuation) obj3);
        searchMapDecorationStateInteractorRepository$pulsarTypeFlow$1.L$0 = (yal0) obj;
        searchMapDecorationStateInteractorRepository$pulsarTypeFlow$1.I$0 = intValue;
        return searchMapDecorationStateInteractorRepository$pulsarTypeFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yal0 yal0Var = (yal0) this.L$0;
        int i = this.I$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.getClass();
        ServiceLevel h = yal0Var.h(i);
        ServiceLevel.SearchingPulsarDTO searchingPulsarDTO = h != null ? h.T : null;
        ServiceLevel.SearchingPulsarDTO.SearchingPulsar searchingPulsar = searchingPulsarDTO != null ? searchingPulsarDTO.a : null;
        int i2 = searchingPulsar == null ? -1 : rup0.a[searchingPulsar.ordinal()];
        if (i2 != -1) {
            if (i2 == 1) {
                return MapDecorationUiState$PulsarType.TWO_CIRCLES;
            }
            if (i2 == 2) {
                return MapDecorationUiState$PulsarType.WIDE_CIRCLE;
            }
            if (i2 != 3) {
                w511.b();
                return null;
            }
        }
        return MapDecorationUiState$PulsarType.NONE;
    }
}
