package com.yandex.go.order.tariffs_suggest.mapper;

import com.yandex.go.taxi.order.cancel.paid.ui.CancelledOrderCostModalView;
import com.yandex.go.taxi.order.models.api.response.TariffsSuggestDto;
import defpackage.avj0;
import defpackage.cvu0;
import defpackage.evu0;
import defpackage.fef;
import defpackage.g8e;
import defpackage.gp8;
import defpackage.hp8;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.qv10;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Set;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.design.utils.DividerType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lhp8;", "<anonymous>", "(Ltse;)Lhp8;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.order.tariffs_suggest.mapper.OrderWithTariffSuggestMapper$mapTariffDetailsUiState$2", f = "OrderWithTariffSuggestMapper.kt", l = {HProv.PP_FAST_CODE, HProv.PP_CONTAINER_EXTENSION, HProv.PP_ENUM_CONTAINER_EXTENSION, HProv.PP_VERSION_EX}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class OrderWithTariffSuggestMapper$mapTariffDetailsUiState$2 extends SuspendLambda implements wls {
    final /* synthetic */ fef $currencyRules;
    final /* synthetic */ boolean $isAnySelected;
    final /* synthetic */ boolean $isFirstElement;
    final /* synthetic */ boolean $isLoading;
    final /* synthetic */ boolean $isMultichoice;
    final /* synthetic */ Set<String> $selectedTariffs;
    final /* synthetic */ TariffsSuggestDto.TariffDetailsDto $tariffDetailsDto;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderWithTariffSuggestMapper$mapTariffDetailsUiState$2(TariffsSuggestDto.TariffDetailsDto tariffDetailsDto, boolean z, Set set, boolean z2, boolean z3, boolean z4, a aVar, fef fefVar, Continuation continuation) {
        super(2, continuation);
        this.$tariffDetailsDto = tariffDetailsDto;
        this.$isMultichoice = z;
        this.$selectedTariffs = set;
        this.$isAnySelected = z2;
        this.$isLoading = z3;
        this.$isFirstElement = z4;
        this.this$0 = aVar;
        this.$currencyRules = fefVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OrderWithTariffSuggestMapper$mapTariffDetailsUiState$2 orderWithTariffSuggestMapper$mapTariffDetailsUiState$2 = new OrderWithTariffSuggestMapper$mapTariffDetailsUiState$2(this.$tariffDetailsDto, this.$isMultichoice, this.$selectedTariffs, this.$isAnySelected, this.$isLoading, this.$isFirstElement, this.this$0, this.$currencyRules, continuation);
        orderWithTariffSuggestMapper$mapTariffDetailsUiState$2.L$0 = obj;
        return orderWithTariffSuggestMapper$mapTariffDetailsUiState$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderWithTariffSuggestMapper$mapTariffDetailsUiState$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01f1  */
    /* JADX WARN: Type inference failed for: r14v8, types: [noh] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        int i;
        Object s;
        noh nohVar;
        int i2;
        String str;
        qoh qohVar;
        String str2;
        DividerType dividerType;
        Object k;
        noh nohVar2;
        CharSequence charSequence;
        int i3;
        CharSequence charSequence2;
        Object k2;
        noh nohVar3;
        CharSequence charSequence3;
        Object k3;
        int i4;
        CharSequence charSequence4;
        String str3;
        String str4;
        String str5;
        avj0 avj0Var;
        StringBuilder t;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = this.label;
        if (i5 == 0) {
            b.b(obj);
            TariffsSuggestDto.TariffDetailsDto tariffDetailsDto = this.$tariffDetailsDto;
            String str6 = tariffDetailsDto.a;
            qoh h2 = tje.h(tseVar, null, null, new OrderWithTariffSuggestMapper$mapTariffDetailsUiState$2$suggestTariffIcon$1(this.this$0, tariffDetailsDto, null), 3);
            qoh h3 = tje.h(tseVar, null, null, new OrderWithTariffSuggestMapper$mapTariffDetailsUiState$2$title$1(this.this$0, this.$tariffDetailsDto, null), 3);
            h = tje.h(tseVar, null, null, new OrderWithTariffSuggestMapper$mapTariffDetailsUiState$2$subtitle$1(this.this$0, this.$tariffDetailsDto, null), 3);
            qoh h4 = tje.h(tseVar, null, null, new OrderWithTariffSuggestMapper$mapTariffDetailsUiState$2$price$1(this.this$0, this.$tariffDetailsDto, this.$currencyRules, null), 3);
            i = (!this.$isMultichoice ? !(this.$isAnySelected || !((this.$tariffDetailsDto.g && this.$selectedTariffs.isEmpty()) || this.$selectedTariffs.contains(str6))) : this.$tariffDetailsDto.g || this.$selectedTariffs.contains(str6)) ? 0 : 1;
            TariffsSuggestDto.TariffDetailsDto tariffDetailsDto2 = this.$tariffDetailsDto;
            int i6 = (!tariffDetailsDto2.h || this.$isLoading) ? 0 : 1;
            DividerType dividerType2 = this.$isFirstElement ? DividerType.NONE : DividerType.MARGIN_0_75;
            String str7 = tariffDetailsDto2.f;
            String o = (str7 == null || evu0.J(str7)) ? null : g8e.o("+", this.$tariffDetailsDto.f);
            this.L$0 = null;
            this.L$1 = str6;
            this.L$2 = h2;
            this.L$3 = null;
            this.L$4 = h;
            this.L$5 = h4;
            this.L$6 = dividerType2;
            this.L$7 = o;
            this.I$0 = i;
            this.I$1 = i6;
            this.label = 1;
            s = h3.s(this);
            if (s != coroutineSingletons) {
                int i7 = i6;
                nohVar = h4;
                i2 = i7;
                str = o;
                qohVar = h2;
                str2 = str6;
                dividerType = dividerType2;
            }
            return coroutineSingletons;
        }
        if (i5 != 1) {
            if (i5 == 2) {
                i2 = this.I$1;
                i3 = this.I$0;
                CharSequence charSequence5 = (CharSequence) this.L$8;
                str = (String) this.L$7;
                dividerType = (DividerType) this.L$6;
                nohVar = (noh) this.L$5;
                nohVar2 = (noh) this.L$2;
                str2 = (String) this.L$1;
                b.b(obj);
                charSequence = charSequence5;
                k = obj;
                charSequence2 = (CharSequence) k;
                this.L$0 = null;
                this.L$1 = str2;
                this.L$2 = nohVar2;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = dividerType;
                this.L$7 = str;
                this.L$8 = charSequence;
                this.L$9 = charSequence2;
                this.I$0 = i3;
                this.I$1 = i2;
                this.label = 3;
                k2 = nohVar.k(this);
                if (k2 != coroutineSingletons) {
                    nohVar3 = nohVar2;
                    charSequence3 = (CharSequence) k2;
                    String str8 = this.$tariffDetailsDto.i;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = dividerType;
                    this.L$7 = str;
                    this.L$8 = charSequence;
                    this.L$9 = charSequence2;
                    this.L$10 = charSequence3;
                    this.L$11 = str8;
                    this.L$12 = str2;
                    this.I$0 = i3;
                    this.I$1 = i2;
                    this.label = 4;
                    k3 = nohVar3.k(this);
                    if (k3 != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
            if (i5 != 3) {
                if (i5 != 4) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 = this.I$1;
                i4 = this.I$0;
                String str9 = (String) this.L$12;
                str3 = (String) this.L$11;
                charSequence3 = (CharSequence) this.L$10;
                charSequence2 = (CharSequence) this.L$9;
                CharSequence charSequence6 = (CharSequence) this.L$8;
                str = (String) this.L$7;
                dividerType = (DividerType) this.L$6;
                b.b(obj);
                str4 = str9;
                charSequence4 = charSequence6;
                k3 = obj;
                str5 = str;
                DividerType dividerType3 = dividerType;
                gp8 gp8Var = (gp8) k3;
                String str10 = this.$tariffDetailsDto.k;
                avj0Var = (avj0) this.this$0.c;
                t = qv10.t(cvu0.v(avj0Var.h(kyh0.pool_tariff_title), CancelledOrderCostModalView.PLACEHOLDER_TARIFF_NAME, charSequence4.toString(), false));
                if (!evu0.J(charSequence2)) {
                    t.append(Extension.FIX_SPACE + ((Object) charSequence2));
                }
                if (str3 != null && !evu0.J(str3)) {
                    t.append(Extension.FIX_SPACE + avj0Var.i(kyh0.summary_accessibility_tariff_eta, str3));
                }
                if (!evu0.J(charSequence3)) {
                    t.append(Extension.FIX_SPACE + ((Object) charSequence3));
                }
                if (str5 != null && !evu0.J(str5)) {
                    t.append(Extension.FIX_SPACE + avj0Var.i(kyh0.summary_accessibility_tariff_plus_amount_fractional, str5));
                }
                return new hp8(str4, gp8Var, charSequence4, charSequence2, charSequence3, str5, i4 == 0, i2 == 0, dividerType3, str10, t.toString(), this.$isMultichoice);
            }
            i2 = this.I$1;
            i3 = this.I$0;
            CharSequence charSequence7 = (CharSequence) this.L$9;
            CharSequence charSequence8 = (CharSequence) this.L$8;
            str = (String) this.L$7;
            dividerType = (DividerType) this.L$6;
            nohVar3 = (noh) this.L$2;
            String str11 = (String) this.L$1;
            b.b(obj);
            charSequence = charSequence8;
            str2 = str11;
            charSequence2 = charSequence7;
            k2 = obj;
            charSequence3 = (CharSequence) k2;
            String str82 = this.$tariffDetailsDto.i;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = dividerType;
            this.L$7 = str;
            this.L$8 = charSequence;
            this.L$9 = charSequence2;
            this.L$10 = charSequence3;
            this.L$11 = str82;
            this.L$12 = str2;
            this.I$0 = i3;
            this.I$1 = i2;
            this.label = 4;
            k3 = nohVar3.k(this);
            if (k3 != coroutineSingletons) {
                i4 = i3;
                charSequence4 = charSequence;
                str3 = str82;
                str4 = str2;
                str5 = str;
                DividerType dividerType32 = dividerType;
                gp8 gp8Var2 = (gp8) k3;
                String str102 = this.$tariffDetailsDto.k;
                avj0Var = (avj0) this.this$0.c;
                t = qv10.t(cvu0.v(avj0Var.h(kyh0.pool_tariff_title), CancelledOrderCostModalView.PLACEHOLDER_TARIFF_NAME, charSequence4.toString(), false));
                if (!evu0.J(charSequence2)) {
                }
                if (str3 != null) {
                    t.append(Extension.FIX_SPACE + avj0Var.i(kyh0.summary_accessibility_tariff_eta, str3));
                }
                if (!evu0.J(charSequence3)) {
                }
                if (str5 != null) {
                    t.append(Extension.FIX_SPACE + avj0Var.i(kyh0.summary_accessibility_tariff_plus_amount_fractional, str5));
                }
                return new hp8(str4, gp8Var2, charSequence4, charSequence2, charSequence3, str5, i4 == 0, i2 == 0, dividerType32, str102, t.toString(), this.$isMultichoice);
            }
            return coroutineSingletons;
        }
        i2 = this.I$1;
        int i8 = this.I$0;
        str = (String) this.L$7;
        dividerType = (DividerType) this.L$6;
        nohVar = (noh) this.L$5;
        h = (noh) this.L$4;
        ?? r14 = (noh) this.L$2;
        String str12 = (String) this.L$1;
        b.b(obj);
        i = i8;
        qohVar = r14;
        str2 = str12;
        s = obj;
        CharSequence charSequence9 = (CharSequence) s;
        this.L$0 = null;
        this.L$1 = str2;
        this.L$2 = qohVar;
        this.L$3 = null;
        this.L$4 = null;
        this.L$5 = nohVar;
        this.L$6 = dividerType;
        this.L$7 = str;
        this.L$8 = charSequence9;
        this.I$0 = i;
        this.I$1 = i2;
        this.label = 2;
        k = h.k(this);
        if (k != coroutineSingletons) {
            nohVar2 = qohVar;
            charSequence = charSequence9;
            i3 = i;
            charSequence2 = (CharSequence) k;
            this.L$0 = null;
            this.L$1 = str2;
            this.L$2 = nohVar2;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = dividerType;
            this.L$7 = str;
            this.L$8 = charSequence;
            this.L$9 = charSequence2;
            this.I$0 = i3;
            this.I$1 = i2;
            this.label = 3;
            k2 = nohVar.k(this);
            if (k2 != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}
