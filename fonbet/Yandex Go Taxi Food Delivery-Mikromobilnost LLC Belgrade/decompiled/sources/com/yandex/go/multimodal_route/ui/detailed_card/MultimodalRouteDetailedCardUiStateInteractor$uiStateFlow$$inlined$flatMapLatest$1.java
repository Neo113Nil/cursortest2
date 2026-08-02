package com.yandex.go.multimodal_route.ui.detailed_card;

import com.yandex.go.multimodal_route.analytics.MultimodalRouteAnalytics$MultimodalRouteSource;
import defpackage.as40;
import defpackage.fay0;
import defpackage.ft40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.multimodal_route.ui.detailed_card.MultimodalRouteDetailedCardUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1", f = "MultimodalRouteDetailedCardUiStateInteractor.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
public final class MultimodalRouteDetailedCardUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ List $addresses$inlined;
    final /* synthetic */ String $mmOfferId$inlined;
    final /* synthetic */ List $mmValue$inlined;
    final /* synthetic */ as40 $multimodalPoints$inlined;
    final /* synthetic */ String $routeType$inlined;
    final /* synthetic */ String $routeUri$inlined;
    final /* synthetic */ MultimodalRouteAnalytics$MultimodalRouteSource $source$inlined;
    final /* synthetic */ String $taxiEta$inlined;
    final /* synthetic */ long $taxiEtaValue$inlined;
    final /* synthetic */ String $taxiPrice$inlined;
    final /* synthetic */ fay0 $taxiSectionDataOverride$inlined;
    final /* synthetic */ String $taxiTariffClass$inlined;
    final /* synthetic */ Long $totalDurationMs$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ft40 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultimodalRouteDetailedCardUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1(long j, as40 as40Var, ft40 ft40Var, fay0 fay0Var, MultimodalRouteAnalytics$MultimodalRouteSource multimodalRouteAnalytics$MultimodalRouteSource, Long l, String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, Continuation continuation) {
        super(3, continuation);
        this.this$0 = ft40Var;
        this.$routeUri$inlined = str;
        this.$multimodalPoints$inlined = as40Var;
        this.$mmOfferId$inlined = str2;
        this.$taxiSectionDataOverride$inlined = fay0Var;
        this.$taxiTariffClass$inlined = str3;
        this.$taxiPrice$inlined = str4;
        this.$taxiEta$inlined = str5;
        this.$addresses$inlined = list;
        this.$totalDurationMs$inlined = l;
        this.$taxiEtaValue$inlined = j;
        this.$routeType$inlined = str6;
        this.$source$inlined = multimodalRouteAnalytics$MultimodalRouteSource;
        this.$mmValue$inlined = list2;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ft40 ft40Var = this.this$0;
        String str = this.$routeUri$inlined;
        as40 as40Var = this.$multimodalPoints$inlined;
        String str2 = this.$mmOfferId$inlined;
        fay0 fay0Var = this.$taxiSectionDataOverride$inlined;
        String str3 = this.$taxiTariffClass$inlined;
        String str4 = this.$taxiPrice$inlined;
        String str5 = this.$taxiEta$inlined;
        List list = this.$addresses$inlined;
        Long l = this.$totalDurationMs$inlined;
        long j = this.$taxiEtaValue$inlined;
        String str6 = this.$routeType$inlined;
        MultimodalRouteDetailedCardUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1 multimodalRouteDetailedCardUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1 = new MultimodalRouteDetailedCardUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1(j, as40Var, ft40Var, fay0Var, this.$source$inlined, l, str, str2, str3, str4, str5, str6, list, this.$mmValue$inlined, (Continuation) obj3);
        multimodalRouteDetailedCardUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        multimodalRouteDetailedCardUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return multimodalRouteDetailedCardUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ft40 ft40Var = this.this$0;
            String str = this.$routeUri$inlined;
            as40 as40Var = this.$multimodalPoints$inlined;
            String str2 = this.$mmOfferId$inlined;
            fay0 fay0Var = this.$taxiSectionDataOverride$inlined;
            String str3 = this.$taxiTariffClass$inlined;
            String str4 = this.$taxiPrice$inlined;
            String str5 = this.$taxiEta$inlined;
            List list = this.$addresses$inlined;
            Long l = this.$totalDurationMs$inlined;
            rol0 rol0Var = new rol0(new MultimodalRouteDetailedCardUiStateInteractor$uiStateFlow$1$1(this.$taxiEtaValue$inlined, as40Var, ft40Var, fay0Var, this.$source$inlined, l, str, str2, str3, str4, str5, this.$routeType$inlined, list, this.$mmValue$inlined, null));
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(rol0Var, vprVar, this) == coroutineSingletons) {
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
