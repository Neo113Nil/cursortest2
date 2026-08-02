package com.yandex.go.chargers.offer.data.mappers;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import com.yandex.go.chargers.data.model.ChargersStationInfoDto;
import com.yandex.go.chargers.offer.data.api.ChargersOfferResponseDto;
import defpackage.b8a;
import defpackage.m7x0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qje;
import defpackage.tje;
import defpackage.tsa;
import defpackage.tse;
import defpackage.wls;
import defpackage.xng0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.utils.AbsoluteSizeSpanFix;
import ru.yandex.taxi.utils.ForegroundColorSpanFix;
import ru.yandex.taxi.widget.utils.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lb8a;", "<anonymous>", "(Ltse;)Lb8a;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.offer.data.mappers.ChargersOfferUiStateMapper$prepareChargersOfferContent$2$station$1", f = "ChargersOfferUiStateMapper.kt", l = {145}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersOfferUiStateMapper$prepareChargersOfferContent$2$station$1 extends SuspendLambda implements wls {
    final /* synthetic */ ChargersOfferResponseDto $response;
    final /* synthetic */ tsa $stationNumber;
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersOfferUiStateMapper$prepareChargersOfferContent$2$station$1(b bVar, ChargersOfferResponseDto chargersOfferResponseDto, tsa tsaVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$response = chargersOfferResponseDto;
        this.$stationNumber = tsaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersOfferUiStateMapper$prepareChargersOfferContent$2$station$1(this.this$0, this.$response, this.$stationNumber, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersOfferUiStateMapper$prepareChargersOfferContent$2$station$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        CharSequence charSequence;
        String str2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            ChargersStationInfoDto chargersStationInfoDto = this.$response.c;
            if (chargersStationInfoDto == null || (str = chargersStationInfoDto.a) == null) {
                str = this.$stationNumber.a;
            }
            bVar.getClass();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) str);
            Context context = bVar.a;
            spannableStringBuilder.setSpan(new ForegroundColorSpanFix(qje.t(xng0.textMain, context)), 0, str.length(), 33);
            spannableStringBuilder.setSpan(new AbsoluteSizeSpanFix(tje.u(50, context), false), 0, str.length(), 33);
            SpannedString spannedString = new SpannedString(spannableStringBuilder);
            e eVar = this.this$0.f;
            ChargersStationInfoDto chargersStationInfoDto2 = this.$response.c;
            FormattedText formattedText = chargersStationInfoDto2 != null ? chargersStationInfoDto2.b : null;
            this.L$0 = spannedString;
            this.label = 1;
            Object x = eVar.x(formattedText, this);
            if (x == coroutineSingletons) {
                return coroutineSingletons;
            }
            charSequence = spannedString;
            obj = x;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            charSequence = (CharSequence) this.L$0;
            kotlin.b.b(obj);
        }
        CharSequence charSequence2 = (CharSequence) obj;
        ChargersStationInfoDto chargersStationInfoDto3 = this.$response.c;
        String a = (chargersStationInfoDto3 == null || (str2 = chargersStationInfoDto3.c) == null) ? null : ((m7x0) this.this$0.d).a(str2);
        ChargersStationInfoDto chargersStationInfoDto4 = this.$response.c;
        return new b8a(charSequence, charSequence2, a, chargersStationInfoDto4 != null ? chargersStationInfoDto4.c : null);
    }
}
