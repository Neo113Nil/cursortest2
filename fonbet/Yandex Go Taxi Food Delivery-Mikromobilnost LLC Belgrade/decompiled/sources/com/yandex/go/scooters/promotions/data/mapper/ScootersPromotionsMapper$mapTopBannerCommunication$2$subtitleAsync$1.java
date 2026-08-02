package com.yandex.go.scooters.promotions.data.mapper;

import com.yandex.go.scooters.promotions.data.model.ScootersPromoblockResponse;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.utils.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/CharSequence;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.promotions.data.mapper.ScootersPromotionsMapper$mapTopBannerCommunication$2$subtitleAsync$1", f = "ScootersPromotionsMapper.kt", l = {56}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPromotionsMapper$mapTopBannerCommunication$2$subtitleAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ ScootersPromoblockResponse.ScootersTopBanner $topBanner;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPromotionsMapper$mapTopBannerCommunication$2$subtitleAsync$1(a aVar, ScootersPromoblockResponse.ScootersTopBanner scootersTopBanner, Continuation continuation) {
        super(2, continuation);
        this.$topBanner = scootersTopBanner;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersPromotionsMapper$mapTopBannerCommunication$2$subtitleAsync$1(this.this$0, this.$topBanner, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPromotionsMapper$mapTopBannerCommunication$2$subtitleAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            FormattedText formattedText = this.$topBanner.b.b;
            if (formattedText == null) {
                return null;
            }
            e eVar = this.this$0.b;
            this.L$0 = null;
            this.label = 1;
            obj = eVar.t(formattedText, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return (CharSequence) obj;
    }
}
