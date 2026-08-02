package com.yandex.go.chargers.station.data.mapper;

import com.yandex.go.chargers.station.data.model.ChargersStationDetailsResponse;
import defpackage.cra;
import defpackage.m7x0;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcra;", "<anonymous>", "(Ltse;)Lcra;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.station.data.mapper.ChargersStationDetailsMapper$preparePartnerInformation$2", f = "ChargersStationDetailsMapper.kt", l = {206, 207, 208}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersStationDetailsMapper$preparePartnerInformation$2 extends SuspendLambda implements wls {
    final /* synthetic */ ChargersStationDetailsResponse.PartnerInformationDto $dto;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersStationDetailsMapper$preparePartnerInformation$2(a aVar, ChargersStationDetailsResponse.PartnerInformationDto partnerInformationDto, Continuation continuation) {
        super(2, continuation);
        this.$dto = partnerInformationDto;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChargersStationDetailsMapper$preparePartnerInformation$2 chargersStationDetailsMapper$preparePartnerInformation$2 = new ChargersStationDetailsMapper$preparePartnerInformation$2(this.this$0, this.$dto, continuation);
        chargersStationDetailsMapper$preparePartnerInformation$2.L$0 = obj;
        return chargersStationDetailsMapper$preparePartnerInformation$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersStationDetailsMapper$preparePartnerInformation$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0117  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FormattedText formattedText;
        String str;
        noh nohVar;
        noh nohVar2;
        CharSequence charSequence;
        noh nohVar3;
        String str2;
        Object k;
        CharSequence charSequence2;
        CharSequence charSequence3;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ChargersStationDetailsResponse.PartnerInformationDto partnerInformationDto = this.$dto;
            if (partnerInformationDto == null || (formattedText = partnerInformationDto.b) == null) {
                return null;
            }
            String str3 = partnerInformationDto.a;
            String a = str3 != null ? ((m7x0) this.this$0.a).a(str3) : null;
            qoh h = tje.h(tseVar, null, null, new ChargersStationDetailsMapper$preparePartnerInformation$2$title$1(this.this$0, formattedText, null), 3);
            qoh h2 = tje.h(tseVar, null, null, new ChargersStationDetailsMapper$preparePartnerInformation$2$modalTitle$1(this.this$0, this.$dto, null), 3);
            qoh h3 = tje.h(tseVar, null, null, new ChargersStationDetailsMapper$preparePartnerInformation$2$modalText$1(this.this$0, this.$dto, null), 3);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = h2;
            this.L$5 = h3;
            this.L$6 = a;
            this.label = 1;
            Object s = h.s(this);
            if (s != coroutineSingletons) {
                str = a;
                obj = s;
                nohVar = h3;
                nohVar2 = h2;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                charSequence3 = (CharSequence) this.L$8;
                charSequence2 = (CharSequence) this.L$7;
                str2 = (String) this.L$6;
                kotlin.b.b(obj);
                return new cra(charSequence2, charSequence3, (CharSequence) obj, str2);
            }
            charSequence = (CharSequence) this.L$7;
            str2 = (String) this.L$6;
            nohVar3 = (noh) this.L$5;
            kotlin.b.b(obj);
            CharSequence charSequence4 = (CharSequence) obj;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = str2;
            this.L$7 = charSequence;
            this.L$8 = charSequence4;
            this.label = 3;
            k = nohVar3.k(this);
            if (k != coroutineSingletons) {
                charSequence2 = charSequence;
                charSequence3 = charSequence4;
                obj = k;
                return new cra(charSequence2, charSequence3, (CharSequence) obj, str2);
            }
            return coroutineSingletons;
        }
        str = (String) this.L$6;
        nohVar = (noh) this.L$5;
        nohVar2 = (noh) this.L$4;
        kotlin.b.b(obj);
        CharSequence charSequence5 = (CharSequence) obj;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.L$5 = nohVar;
        this.L$6 = str;
        this.L$7 = charSequence5;
        this.label = 2;
        Object k2 = nohVar2.k(this);
        if (k2 != coroutineSingletons) {
            String str4 = str;
            charSequence = charSequence5;
            obj = k2;
            nohVar3 = nohVar;
            str2 = str4;
            CharSequence charSequence42 = (CharSequence) obj;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = str2;
            this.L$7 = charSequence;
            this.L$8 = charSequence42;
            this.label = 3;
            k = nohVar3.k(this);
            if (k != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}
