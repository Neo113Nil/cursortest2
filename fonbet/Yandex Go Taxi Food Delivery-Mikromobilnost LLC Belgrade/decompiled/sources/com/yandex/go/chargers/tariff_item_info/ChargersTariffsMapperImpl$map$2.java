package com.yandex.go.chargers.tariff_item_info;

import com.yandex.go.chargers.data.model.ChargersAttributeDto;
import com.yandex.go.chargers.tariff_item_info.api.data.model.ChargersTariffDto;
import defpackage.hwa;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.swa;
import defpackage.tje;
import defpackage.tn9;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lswa;", "<anonymous>", "(Ltse;)Lswa;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.tariff_item_info.ChargersTariffsMapperImpl$map$2", f = "ChargersTariffsMapperImpl.kt", l = {37, 38, 39}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersTariffsMapperImpl$map$2 extends SuspendLambda implements wls {
    final /* synthetic */ ChargersTariffDto $override;
    final /* synthetic */ hwa $surgeModal;
    final /* synthetic */ ChargersTariffDto $tariff;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersTariffsMapperImpl$map$2(ChargersTariffDto chargersTariffDto, ChargersTariffDto chargersTariffDto2, b bVar, hwa hwaVar, Continuation continuation) {
        super(2, continuation);
        this.$override = chargersTariffDto;
        this.$tariff = chargersTariffDto2;
        this.this$0 = bVar;
        this.$surgeModal = hwaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChargersTariffsMapperImpl$map$2 chargersTariffsMapperImpl$map$2 = new ChargersTariffsMapperImpl$map$2(this.$override, this.$tariff, this.this$0, this.$surgeModal, continuation);
        chargersTariffsMapperImpl$map$2.L$0 = obj;
        return chargersTariffsMapperImpl$map$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersTariffsMapperImpl$map$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0108  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FormattedText formattedText;
        List list;
        noh nohVar;
        noh nohVar2;
        CharSequence charSequence;
        Object k;
        CharSequence charSequence2;
        tn9 tn9Var;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ChargersTariffDto chargersTariffDto = this.$override;
            if (chargersTariffDto == null || (formattedText = chargersTariffDto.a) == null) {
                formattedText = this.$tariff.a;
            }
            if (chargersTariffDto == null || (list = chargersTariffDto.b) == null) {
                list = this.$tariff.b;
            }
            ChargersAttributeDto chargersAttributeDto = list != null ? (ChargersAttributeDto) kotlin.collections.a.R(list) : null;
            qoh h = tje.h(tseVar, null, null, new ChargersTariffsMapperImpl$map$2$blocks$1(this.this$0, this.$tariff, this.$surgeModal, null), 3);
            qoh h2 = tje.h(tseVar, null, null, new ChargersTariffsMapperImpl$map$2$badgeFormatted$1(chargersAttributeDto, this.this$0, null), 3);
            qoh h3 = tje.h(tseVar, null, null, new ChargersTariffsMapperImpl$map$2$titleFormatted$1(formattedText, this.this$0, null), 3);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = h;
            this.L$4 = h2;
            this.L$5 = null;
            this.label = 1;
            Object s = h3.s(this);
            if (s != coroutineSingletons) {
                nohVar = h2;
                obj = s;
                nohVar2 = h;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tn9Var = (tn9) this.L$7;
                charSequence2 = (CharSequence) this.L$6;
                kotlin.b.b(obj);
                return new swa(charSequence2, tn9Var, (List) obj);
            }
            charSequence = (CharSequence) this.L$6;
            nohVar2 = (noh) this.L$3;
            kotlin.b.b(obj);
            tn9 tn9Var2 = (tn9) obj;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = charSequence;
            this.L$7 = tn9Var2;
            this.label = 3;
            k = nohVar2.k(this);
            if (k != coroutineSingletons) {
                charSequence2 = charSequence;
                tn9Var = tn9Var2;
                obj = k;
                return new swa(charSequence2, tn9Var, (List) obj);
            }
            return coroutineSingletons;
        }
        nohVar = (noh) this.L$4;
        nohVar2 = (noh) this.L$3;
        kotlin.b.b(obj);
        CharSequence charSequence3 = (CharSequence) obj;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = nohVar2;
        this.L$4 = null;
        this.L$5 = null;
        this.L$6 = charSequence3;
        this.label = 2;
        Object k2 = nohVar.k(this);
        if (k2 != coroutineSingletons) {
            charSequence = charSequence3;
            obj = k2;
            tn9 tn9Var22 = (tn9) obj;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = charSequence;
            this.L$7 = tn9Var22;
            this.label = 3;
            k = nohVar2.k(this);
            if (k != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}
