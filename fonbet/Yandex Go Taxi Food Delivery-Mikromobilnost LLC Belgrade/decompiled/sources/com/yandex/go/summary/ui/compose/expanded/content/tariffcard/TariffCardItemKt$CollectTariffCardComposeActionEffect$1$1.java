package com.yandex.go.summary.ui.compose.expanded.content.tariffcard;

import defpackage.fwi;
import defpackage.lz40;
import defpackage.m3u0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p651;
import defpackage.tls;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.ui.compose.expanded.content.tariffcard.TariffCardItemKt$CollectTariffCardComposeActionEffect$1$1", f = "TariffCardItem.kt", l = {629}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TariffCardItemKt$CollectTariffCardComposeActionEffect$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ lz40 $carouselComposeActionFlow;
    final /* synthetic */ fwi $density;
    final /* synthetic */ tls $handleCarouselCellUiAction;
    final /* synthetic */ tls $handleRequirementUiAction;
    final /* synthetic */ m3u0 $latestTariffCardUiState;
    final /* synthetic */ tpr $tariffCardComposeActionFlow;
    final /* synthetic */ androidx.compose.foundation.lazy.b $tariffCardLazyListState;
    final /* synthetic */ p651 $windowInsets;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffCardItemKt$CollectTariffCardComposeActionEffect$1$1(tpr tprVar, m3u0 m3u0Var, androidx.compose.foundation.lazy.b bVar, p651 p651Var, fwi fwiVar, lz40 lz40Var, tls tlsVar, tls tlsVar2, Continuation continuation) {
        super(2, continuation);
        this.$tariffCardComposeActionFlow = tprVar;
        this.$latestTariffCardUiState = m3u0Var;
        this.$tariffCardLazyListState = bVar;
        this.$windowInsets = p651Var;
        this.$density = fwiVar;
        this.$carouselComposeActionFlow = lz40Var;
        this.$handleRequirementUiAction = tlsVar;
        this.$handleCarouselCellUiAction = tlsVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TariffCardItemKt$CollectTariffCardComposeActionEffect$1$1(this.$tariffCardComposeActionFlow, this.$latestTariffCardUiState, this.$tariffCardLazyListState, this.$windowInsets, this.$density, this.$carouselComposeActionFlow, this.$handleRequirementUiAction, this.$handleCarouselCellUiAction, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TariffCardItemKt$CollectTariffCardComposeActionEffect$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr tprVar = this.$tariffCardComposeActionFlow;
            m3u0 m3u0Var = this.$latestTariffCardUiState;
            androidx.compose.foundation.lazy.b bVar = this.$tariffCardLazyListState;
            p651 p651Var = this.$windowInsets;
            fwi fwiVar = this.$density;
            lz40 lz40Var = this.$carouselComposeActionFlow;
            tls tlsVar = this.$handleRequirementUiAction;
            tls tlsVar2 = this.$handleCarouselCellUiAction;
            o oVar = new o(tprVar, new TariffCardItemKt$CollectTariffCardComposeActionEffect$1$1$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
            a aVar = new a(m3u0Var, bVar, p651Var, fwiVar, lz40Var, tlsVar, tlsVar2);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (oVar.collect(aVar, this) == coroutineSingletons) {
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
