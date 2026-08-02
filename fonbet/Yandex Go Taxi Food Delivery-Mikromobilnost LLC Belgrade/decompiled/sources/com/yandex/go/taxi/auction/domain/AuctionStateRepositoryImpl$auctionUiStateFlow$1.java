package com.yandex.go.taxi.auction.domain;

import com.yandex.go.zone.dto.objects.AuctionConditionalSliderSettings;
import com.yandex.go.zone.dto.objects.AuctionDisplaySettings;
import com.yandex.go.zone.dto.objects.AuctionInfo;
import com.yandex.go.zone.dto.objects.AuctionSliderSettings;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.b1;
import defpackage.fe3;
import defpackage.ge3;
import defpackage.jl40;
import defpackage.mi31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.od3;
import defpackage.pex0;
import defpackage.sb2;
import defpackage.sho;
import defpackage.tcc;
import defpackage.wls;
import defpackage.x4e;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.Regex;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmi31;", "it", "Lzy11;", "<anonymous>", "(Lmi31;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.auction.domain.AuctionStateRepositoryImpl$auctionUiStateFlow$1", f = "AuctionStateRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class AuctionStateRepositoryImpl$auctionUiStateFlow$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ge3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuctionStateRepositoryImpl$auctionUiStateFlow$1(ge3 ge3Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = ge3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AuctionStateRepositoryImpl$auctionUiStateFlow$1 auctionStateRepositoryImpl$auctionUiStateFlow$1 = new AuctionStateRepositoryImpl$auctionUiStateFlow$1(this.this$0, continuation);
        auctionStateRepositoryImpl$auctionUiStateFlow$1.L$0 = obj;
        return auctionStateRepositoryImpl$auctionUiStateFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        AuctionStateRepositoryImpl$auctionUiStateFlow$1 auctionStateRepositoryImpl$auctionUiStateFlow$1 = (AuctionStateRepositoryImpl$auctionUiStateFlow$1) create((mi31) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        auctionStateRepositoryImpl$auctionUiStateFlow$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        mi31 mi31Var = (mi31) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        fe3 c = this.this$0.c(mi31Var);
        pex0 pex0Var = mi31Var.a;
        AuctionInfo auctionInfo = pex0Var.C0;
        AuctionInfo auctionInfo2 = pex0Var.C0;
        this.this$0.d(mi31Var, jl40.l(auctionInfo, c.a) ? c : null);
        ge3 ge3Var = this.this$0;
        ge3Var.getClass();
        AuctionInfo.Companion.getClass();
        if (!jl40.l(auctionInfo2, AuctionInfo.f)) {
            b1 b1Var = ge3Var.f.a;
            AuctionSliderSettings auctionSliderSettings = auctionInfo2.e.a;
            String str = auctionSliderSettings.a;
            String str2 = auctionSliderSettings.b;
            double d = auctionInfo2.a;
            MapBuilder mapBuilder = new MapBuilder();
            mapBuilder.put(UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, str);
            mapBuilder.put("text", str2);
            MapBuilder w = x4e.w(d, mapBuilder, "startPrice");
            AuctionDisplaySettings auctionDisplaySettings = auctionInfo2.e;
            int i = auctionDisplaySettings.c;
            double d2 = auctionInfo2.d;
            double d3 = auctionInfo2.c;
            double d4 = auctionInfo2.b;
            List<AuctionConditionalSliderSettings> list = auctionDisplaySettings.b;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            for (AuctionConditionalSliderSettings auctionConditionalSliderSettings : list) {
                AuctionSliderSettings auctionSliderSettings2 = auctionConditionalSliderSettings.b;
                arrayList.add(new od3(auctionConditionalSliderSettings.a, auctionSliderSettings2.b, auctionSliderSettings2.a));
            }
            MapBuilder mapBuilder2 = new MapBuilder();
            mapBuilder2.put("default", w);
            mapBuilder2.put("costPrecision", Integer.valueOf(i));
            mapBuilder2.put("maxPrice", Double.valueOf(d2));
            mapBuilder2.put("minPrice", Double.valueOf(d3));
            mapBuilder2.put("step", Double.valueOf(d4));
            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((od3) it.next()).d);
            }
            mapBuilder2.put("conditions", arrayList2);
            MapBuilder j = mapBuilder2.j();
            b1Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("settings", j);
            HashMap hashMap2 = new HashMap();
            Regex regex = sho.a;
            b1Var.a.a(sb2.q("auction_settings_changed", hashMap), hashMap, 2, hashMap2);
        }
        return zy11.a;
    }
}
