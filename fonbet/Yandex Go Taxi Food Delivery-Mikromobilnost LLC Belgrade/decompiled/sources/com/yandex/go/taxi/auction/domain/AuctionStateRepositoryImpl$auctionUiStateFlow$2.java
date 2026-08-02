package com.yandex.go.taxi.auction.domain;

import com.yandex.go.zone.dto.objects.AuctionConditionalSliderSettings;
import com.yandex.go.zone.dto.objects.AuctionDisplaySettings;
import com.yandex.go.zone.dto.objects.AuctionInfo;
import com.yandex.go.zone.dto.objects.AuctionSliderSettings;
import com.ybsdk.widgets.common.MoneyInputEditView;
import defpackage.ae3;
import defpackage.be3;
import defpackage.bms;
import defpackage.ce3;
import defpackage.evu0;
import defpackage.fe3;
import defpackage.fef;
import defpackage.ge3;
import defpackage.h0w;
import defpackage.jl40;
import defpackage.mi31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.pex0;
import defpackage.sd3;
import defpackage.xdf;
import defpackage.zy11;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCP.tools.HexString;
import ru.yandex.taxi.tariffs.model.PriceUpdate$PriceLoadingState;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lmi31;", "verticalTariff", "Lru/yandex/taxi/tariffs/model/PriceUpdate$PriceLoadingState;", "loadingState", "Lzy11;", "<unused var>", "Lde3;", "<anonymous>", "(Lru/yandex/taxi/tariffs/model/verticals/VerticalTariff;Lru/yandex/taxi/tariffs/model/PriceUpdate$PriceLoadingState;V)Lcom/yandex/go/taxi/auction/ui/state/AuctionCardUiState;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.auction.domain.AuctionStateRepositoryImpl$auctionUiStateFlow$2", f = "AuctionStateRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class AuctionStateRepositoryImpl$auctionUiStateFlow$2 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ ge3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuctionStateRepositoryImpl$auctionUiStateFlow$2(ge3 ge3Var, Continuation continuation) {
        super(4, continuation);
        this.this$0 = ge3Var;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        AuctionStateRepositoryImpl$auctionUiStateFlow$2 auctionStateRepositoryImpl$auctionUiStateFlow$2 = new AuctionStateRepositoryImpl$auctionUiStateFlow$2(this.this$0, (Continuation) obj4);
        auctionStateRepositoryImpl$auctionUiStateFlow$2.L$0 = (mi31) obj;
        auctionStateRepositoryImpl$auctionUiStateFlow$2.L$1 = (PriceUpdate$PriceLoadingState) obj2;
        return auctionStateRepositoryImpl$auctionUiStateFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AuctionSliderSettings auctionSliderSettings;
        mi31 mi31Var = (mi31) this.L$0;
        PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState = (PriceUpdate$PriceLoadingState) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        ge3 ge3Var = this.this$0;
        fe3 c = ge3Var.c(mi31Var);
        pex0 pex0Var = mi31Var.a;
        PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState2 = PriceUpdate$PriceLoadingState.LOADED;
        if (priceUpdate$PriceLoadingState == priceUpdate$PriceLoadingState2) {
            AuctionInfo auctionInfo = pex0Var.C0;
            AuctionInfo.Companion.getClass();
            if (!jl40.l(auctionInfo, AuctionInfo.f)) {
                AuctionInfo auctionInfo2 = c.a;
                double d = c.b;
                AuctionDisplaySettings auctionDisplaySettings = auctionInfo2.e;
                Iterator it = auctionDisplaySettings.b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        auctionSliderSettings = auctionDisplaySettings.a;
                        break;
                    }
                    AuctionConditionalSliderSettings auctionConditionalSliderSettings = (AuctionConditionalSliderSettings) it.next();
                    if (d >= auctionConditionalSliderSettings.a) {
                        auctionSliderSettings = auctionConditionalSliderSettings.b;
                        break;
                    }
                }
                fef c2 = pex0Var.c();
                int i = auctionDisplaySettings.c;
                xdf xdfVar = ge3Var.d;
                int max = Math.max(0, i);
                String format = String.format(oyr.j(max, "%.", "f"), Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
                if (max != 0) {
                    format = evu0.n0(evu0.n0(format, MoneyInputEditView.DEFAULT_VALUE), '.', HexString.CHAR_COMMA);
                }
                String c3 = xdfVar.c(c2, format, true);
                String str = auctionSliderSettings.b;
                sd3 b = ge3Var.b(auctionSliderSettings.a);
                double d2 = auctionInfo2.c;
                double d3 = auctionInfo2.b;
                return new be3(b, new ae3(d2 <= d - d3), new ae3(auctionInfo2.d >= d + d3), c3, str, new h0w(14, ge3Var, mi31Var), false);
            }
        }
        if (priceUpdate$PriceLoadingState != priceUpdate$PriceLoadingState2) {
            AuctionInfo auctionInfo3 = c.a;
            AuctionInfo.Companion.getClass();
            if (!jl40.l(auctionInfo3, AuctionInfo.f)) {
                return new be3(ge3Var.b(null), new ae3(false), new ae3(false), "", "", null, true);
            }
        }
        return ce3.a;
    }
}
