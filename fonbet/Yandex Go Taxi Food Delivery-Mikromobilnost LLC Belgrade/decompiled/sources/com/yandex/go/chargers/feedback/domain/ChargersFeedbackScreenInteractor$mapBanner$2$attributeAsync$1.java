package com.yandex.go.chargers.feedback.domain;

import com.yandex.go.chargers.data.model.ChargersAttributeDto;
import com.yandex.go.chargers.feedback.data.ChargersFeedbackScreenBannerDto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tn9;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ltn9;", "<anonymous>", "(Ltse;)Ltn9;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.feedback.domain.ChargersFeedbackScreenInteractor$mapBanner$2$attributeAsync$1", f = "ChargersFeedbackScreenInteractor.kt", l = {HProv.ALG_SID_SHA3_384}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersFeedbackScreenInteractor$mapBanner$2$attributeAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ ChargersFeedbackScreenBannerDto $bannerDto;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersFeedbackScreenInteractor$mapBanner$2$attributeAsync$1(ChargersFeedbackScreenBannerDto chargersFeedbackScreenBannerDto, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$bannerDto = chargersFeedbackScreenBannerDto;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersFeedbackScreenInteractor$mapBanner$2$attributeAsync$1(this.$bannerDto, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersFeedbackScreenInteractor$mapBanner$2$attributeAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ChargersAttributeDto chargersAttributeDto = (ChargersAttributeDto) kotlin.collections.a.R(this.$bannerDto.d);
            if (chargersAttributeDto == null) {
                return null;
            }
            com.yandex.go.chargers.domain.mapper.a aVar = this.this$0.b;
            this.L$0 = null;
            this.label = 1;
            obj = aVar.a(chargersAttributeDto, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return (tn9) obj;
    }
}
