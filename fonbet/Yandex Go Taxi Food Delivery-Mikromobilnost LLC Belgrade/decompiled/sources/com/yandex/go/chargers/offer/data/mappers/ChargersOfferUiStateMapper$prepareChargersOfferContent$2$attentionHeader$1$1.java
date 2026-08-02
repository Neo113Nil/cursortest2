package com.yandex.go.chargers.offer.data.mappers;

import com.yandex.go.chargers.data.model.Action$Info;
import com.yandex.go.chargers.data.model.Action$OpenDiscountDetails;
import com.yandex.go.chargers.data.model.ChargersAttentionDto;
import com.yandex.go.chargers.data.model.d;
import com.yandex.go.chargers.data.model.e;
import com.yandex.go.chargers.discounts.api.data.model.ChargersDiscountDto;
import defpackage.gdc;
import defpackage.hm9;
import defpackage.im9;
import defpackage.jm9;
import defpackage.kdc;
import defpackage.km9;
import defpackage.m7x0;
import defpackage.mqg0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.ufu;
import defpackage.vr60;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lvr60;", "<anonymous>", "(Ltse;)Lvr60;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.offer.data.mappers.ChargersOfferUiStateMapper$prepareChargersOfferContent$2$attentionHeader$1$1", f = "ChargersOfferUiStateMapper.kt", l = {211, 212, 229}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersOfferUiStateMapper$prepareChargersOfferContent$2$attentionHeader$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ ChargersAttentionDto $attention;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersOfferUiStateMapper$prepareChargersOfferContent$2$attentionHeader$1$1(ChargersAttentionDto chargersAttentionDto, b bVar, Continuation continuation) {
        super(2, continuation);
        this.$attention = chargersAttentionDto;
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersOfferUiStateMapper$prepareChargersOfferContent$2$attentionHeader$1$1(this.$attention, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersOfferUiStateMapper$prepareChargersOfferContent$2$attentionHeader$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x010f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        b bVar;
        km9 km9Var;
        Object i;
        ChargersAttentionDto chargersAttentionDto;
        e eVar;
        Object i2;
        e eVar2;
        CharSequence charSequence;
        Object i3;
        km9 km9Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = this.label;
        km9 km9Var3 = im9.a;
        if (i4 == 0) {
            kotlin.b.b(obj);
            ChargersAttentionDto chargersAttentionDto2 = this.$attention;
            e eVar3 = chargersAttentionDto2.d;
            if (eVar3 != null) {
                bVar = this.this$0;
                if (eVar3 instanceof Action$Info) {
                    c cVar = bVar.j;
                    FormattedText formattedText = ((Action$Info) eVar3).a.a;
                    this.L$0 = bVar;
                    this.L$1 = chargersAttentionDto2;
                    this.L$2 = eVar3;
                    this.label = 1;
                    i = c.i(cVar, formattedText, null, this, 30);
                    if (i != coroutineSingletons) {
                        chargersAttentionDto = chargersAttentionDto2;
                        eVar = eVar3;
                    }
                    return coroutineSingletons;
                }
                if (eVar3 instanceof Action$OpenDiscountDetails) {
                    ChargersDiscountDto chargersDiscountDto = ((Action$OpenDiscountDetails) eVar3).a;
                    km9Var = chargersDiscountDto != null ? new jm9(chargersDiscountDto.a.name(), chargersDiscountDto.b) : null;
                } else {
                    if (!eVar3.equals(d.INSTANCE)) {
                        w511.b();
                        return null;
                    }
                    km9Var = km9Var3;
                }
                if (km9Var != null) {
                }
            }
            c cVar2 = this.this$0.j;
            FormattedText formattedText2 = this.$attention.a;
            this.L$0 = km9Var3;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 3;
            i3 = c.i(cVar2, formattedText2, null, this, 30);
            if (i3 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                km9 km9Var4 = (km9) this.L$0;
                kotlin.b.b(obj);
                i3 = obj;
                km9Var2 = km9Var4;
                CharSequence charSequence2 = (CharSequence) i3;
                kdc a = ((ufu) this.this$0.b).a(new gdc(mqg0.component_green_normal), this.$attention.c);
                String str = this.$attention.b;
                String a2 = str == null ? ((m7x0) this.this$0.d).a(str) : null;
                ChargersAttentionDto chargersAttentionDto3 = this.$attention;
                String str2 = chargersAttentionDto3.b;
                String str3 = chargersAttentionDto3.e;
                String a3 = str3 != null ? ((m7x0) this.this$0.d).a(str3) : null;
                ChargersAttentionDto chargersAttentionDto4 = this.$attention;
                return new vr60(charSequence2, a, a2, str2, km9Var2, a3, chargersAttentionDto4.e, chargersAttentionDto4.f);
            }
            charSequence = (CharSequence) this.L$2;
            e eVar4 = (e) this.L$1;
            ChargersAttentionDto chargersAttentionDto5 = (ChargersAttentionDto) this.L$0;
            kotlin.b.b(obj);
            chargersAttentionDto = chargersAttentionDto5;
            eVar2 = eVar4;
            i2 = obj;
            String str4 = ((Action$Info) eVar2).a.c;
            String str5 = chargersAttentionDto.f;
            km9Var = new hm9(charSequence, (CharSequence) i2, str4);
            if (km9Var != null) {
                km9Var3 = km9Var;
            }
            c cVar22 = this.this$0.j;
            FormattedText formattedText22 = this.$attention.a;
            this.L$0 = km9Var3;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 3;
            i3 = c.i(cVar22, formattedText22, null, this, 30);
            if (i3 != coroutineSingletons) {
                km9Var2 = km9Var3;
                CharSequence charSequence22 = (CharSequence) i3;
                kdc a4 = ((ufu) this.this$0.b).a(new gdc(mqg0.component_green_normal), this.$attention.c);
                String str6 = this.$attention.b;
                if (str6 == null) {
                }
                ChargersAttentionDto chargersAttentionDto32 = this.$attention;
                String str22 = chargersAttentionDto32.b;
                String str32 = chargersAttentionDto32.e;
                if (str32 != null) {
                }
                ChargersAttentionDto chargersAttentionDto42 = this.$attention;
                return new vr60(charSequence22, a4, a2, str22, km9Var2, a3, chargersAttentionDto42.e, chargersAttentionDto42.f);
            }
            return coroutineSingletons;
        }
        eVar = (e) this.L$2;
        ChargersAttentionDto chargersAttentionDto6 = (ChargersAttentionDto) this.L$1;
        b bVar2 = (b) this.L$0;
        kotlin.b.b(obj);
        bVar = bVar2;
        chargersAttentionDto = chargersAttentionDto6;
        i = obj;
        CharSequence charSequence3 = (CharSequence) i;
        c cVar3 = bVar.j;
        FormattedText formattedText3 = ((Action$Info) eVar).a.b;
        this.L$0 = chargersAttentionDto;
        this.L$1 = eVar;
        this.L$2 = charSequence3;
        this.label = 2;
        i2 = c.i(cVar3, formattedText3, null, this, 30);
        if (i2 != coroutineSingletons) {
            eVar2 = eVar;
            charSequence = charSequence3;
            String str42 = ((Action$Info) eVar2).a.c;
            String str52 = chargersAttentionDto.f;
            km9Var = new hm9(charSequence, (CharSequence) i2, str42);
            if (km9Var != null) {
            }
            c cVar222 = this.this$0.j;
            FormattedText formattedText222 = this.$attention.a;
            this.L$0 = km9Var3;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 3;
            i3 = c.i(cVar222, formattedText222, null, this, 30);
            if (i3 != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}
