package com.yandex.go.chargers.offer.data.mappers;

import com.yandex.go.chargers.offer.data.api.ChargersOfferResponseDto;
import defpackage.d9s;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.z7a;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.utils.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lz7a;", "<anonymous>", "(Ltse;)Lz7a;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.offer.data.mappers.ChargersOfferUiStateMapper$prepareChargersOfferContent$2$pricing$1$1", f = "ChargersOfferUiStateMapper.kt", l = {250, 251, 252}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersOfferUiStateMapper$prepareChargersOfferContent$2$pricing$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ ChargersOfferResponseDto.Pricing.PlanItem $it;
    final /* synthetic */ ChargersOfferResponseDto $response;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersOfferUiStateMapper$prepareChargersOfferContent$2$pricing$1$1(ChargersOfferResponseDto.Pricing.PlanItem planItem, b bVar, ChargersOfferResponseDto chargersOfferResponseDto, Continuation continuation) {
        super(2, continuation);
        this.$it = planItem;
        this.this$0 = bVar;
        this.$response = chargersOfferResponseDto;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersOfferUiStateMapper$prepareChargersOfferContent$2$pricing$1$1(this.$it, this.this$0, this.$response, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersOfferUiStateMapper$prepareChargersOfferContent$2$pricing$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00bb  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FormattedText d;
        FormattedText formattedText;
        FormattedText formattedText2;
        CharSequence charSequence;
        FormattedText formattedText3;
        Object x;
        CharSequence charSequence2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            FormattedText d2 = d9s.d(this.$it.b, this.this$0.e, this.$response.m);
            ChargersOfferResponseDto.Pricing.PlanItem.Hint hint = this.$it.c;
            d = (hint == null || (formattedText2 = hint.a) == null) ? null : d9s.d(formattedText2, this.this$0.e, this.$response.m);
            e eVar = this.this$0.f;
            FormattedText formattedText4 = this.$it.a;
            this.L$0 = d2;
            this.L$1 = d;
            this.label = 1;
            Object t = eVar.t(formattedText4, this);
            if (t != coroutineSingletons) {
                formattedText = d2;
                obj = t;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                charSequence2 = (CharSequence) this.L$3;
                charSequence = (CharSequence) this.L$2;
                kotlin.b.b(obj);
                return new z7a(charSequence, charSequence2, (CharSequence) obj);
            }
            charSequence = (CharSequence) this.L$2;
            formattedText3 = (FormattedText) this.L$1;
            kotlin.b.b(obj);
            CharSequence charSequence3 = (CharSequence) obj;
            e eVar2 = this.this$0.f;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = charSequence;
            this.L$3 = charSequence3;
            this.label = 3;
            x = eVar2.x(formattedText3, this);
            if (x != coroutineSingletons) {
                charSequence2 = charSequence3;
                obj = x;
                return new z7a(charSequence, charSequence2, (CharSequence) obj);
            }
            return coroutineSingletons;
        }
        d = (FormattedText) this.L$1;
        formattedText = (FormattedText) this.L$0;
        kotlin.b.b(obj);
        CharSequence charSequence4 = (CharSequence) obj;
        e eVar3 = this.this$0.f;
        this.L$0 = null;
        this.L$1 = d;
        this.L$2 = charSequence4;
        this.label = 2;
        Object t2 = eVar3.t(formattedText, this);
        if (t2 != coroutineSingletons) {
            FormattedText formattedText5 = d;
            charSequence = charSequence4;
            obj = t2;
            formattedText3 = formattedText5;
            CharSequence charSequence32 = (CharSequence) obj;
            e eVar22 = this.this$0.f;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = charSequence;
            this.L$3 = charSequence32;
            this.label = 3;
            x = eVar22.x(formattedText3, this);
            if (x != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}
