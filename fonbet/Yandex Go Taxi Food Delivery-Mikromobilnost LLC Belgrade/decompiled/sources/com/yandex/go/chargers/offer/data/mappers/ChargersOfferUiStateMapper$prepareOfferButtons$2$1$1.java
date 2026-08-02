package com.yandex.go.chargers.offer.data.mappers;

import com.yandex.go.chargers.data.model.ChargersOfferButtonDto;
import defpackage.a7a;
import defpackage.b7a;
import defpackage.c7a;
import defpackage.g7a;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.u6a;
import defpackage.uo9;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.utils.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Luo9;", "<anonymous>", "(Ltse;)Luo9;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.offer.data.mappers.ChargersOfferUiStateMapper$prepareOfferButtons$2$1$1", f = "ChargersOfferUiStateMapper.kt", l = {427, 428}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersOfferUiStateMapper$prepareOfferButtons$2$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ ChargersOfferButtonDto $button;
    final /* synthetic */ boolean $isMainButtonLoading;
    final /* synthetic */ String $offerId;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersOfferUiStateMapper$prepareOfferButtons$2$1$1(b bVar, ChargersOfferButtonDto chargersOfferButtonDto, String str, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$button = chargersOfferButtonDto;
        this.$offerId = str;
        this.$isMainButtonLoading = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersOfferUiStateMapper$prepareOfferButtons$2$1$1(this.this$0, this.$button, this.$offerId, this.$isMainButtonLoading, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersOfferUiStateMapper$prepareOfferButtons$2$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x003c, code lost:
    
        if (r2 == r1) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0066  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object w;
        CharSequence charSequence;
        CharSequence charSequence2;
        Object t;
        CharSequence charSequence3;
        ChargersOfferButtonDto.Action action;
        g7a b7aVar;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        g7a g7aVar = null;
        if (i == 0) {
            kotlin.b.b(obj);
            e eVar = this.this$0.f;
            FormattedText formattedText = this.$button.a;
            int i2 = kyh0.common_continue;
            this.label = 1;
            w = eVar.w(formattedText, i2, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                charSequence3 = (CharSequence) this.L$0;
                kotlin.b.b(obj);
                t = obj;
                charSequence = charSequence3;
                charSequence2 = (CharSequence) t;
                Boolean bool = this.$button.c;
                boolean booleanValue = bool != null ? bool.booleanValue() : true;
                ChargersOfferButtonDto chargersOfferButtonDto = this.$button;
                action = chargersOfferButtonDto.e;
                if (action == ChargersOfferButtonDto.Action.CREATE_ORDER) {
                    g7aVar = new u6a(this.$offerId);
                } else if (action == ChargersOfferButtonDto.Action.RETURN_CHARGER) {
                    g7aVar = new c7a(chargersOfferButtonDto.d);
                } else {
                    ChargersOfferButtonDto.Action action2 = ChargersOfferButtonDto.Action.BUY_SHARING_SUBSCRIPTION_THEN_CREATE_ORDER;
                    if (action == action2 && (str = chargersOfferButtonDto.f) != null) {
                        g7aVar = new a7a(str, this.$offerId);
                    } else if (action == action2) {
                        g7aVar = new u6a(this.$offerId);
                    } else if (action == ChargersOfferButtonDto.Action.BUY_PLUS_DVIZH_SUBSCRIPTION_THEN_CREATE_ORDER) {
                        ChargersOfferButtonDto.PurchaseParamsDto purchaseParamsDto = chargersOfferButtonDto.g;
                        kotlinx.serialization.json.b bVar = purchaseParamsDto != null ? purchaseParamsDto.a : null;
                        String str2 = purchaseParamsDto != null ? purchaseParamsDto.b : null;
                        if (bVar != null && str2 != null) {
                            b7aVar = new b7a(this.$offerId, str2, bVar);
                            return new uo9(charSequence, charSequence2, booleanValue, b7aVar, true, null, false, this.$isMainButtonLoading, 96);
                        }
                        g7aVar = new u6a(this.$offerId);
                    }
                }
                b7aVar = g7aVar;
                return new uo9(charSequence, charSequence2, booleanValue, b7aVar, true, null, false, this.$isMainButtonLoading, 96);
            }
            kotlin.b.b(obj);
            w = obj;
        }
        CharSequence charSequence4 = (CharSequence) w;
        FormattedText formattedText2 = this.$button.b;
        if (formattedText2 == null) {
            charSequence = charSequence4;
            charSequence2 = null;
            Boolean bool2 = this.$button.c;
            boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : true;
            ChargersOfferButtonDto chargersOfferButtonDto2 = this.$button;
            action = chargersOfferButtonDto2.e;
            if (action == ChargersOfferButtonDto.Action.CREATE_ORDER) {
            }
            b7aVar = g7aVar;
            return new uo9(charSequence, charSequence2, booleanValue2, b7aVar, true, null, false, this.$isMainButtonLoading, 96);
        }
        e eVar2 = this.this$0.f;
        this.L$0 = charSequence4;
        this.L$1 = null;
        this.label = 2;
        t = eVar2.t(formattedText2, this);
        if (t != coroutineSingletons) {
            charSequence3 = charSequence4;
            charSequence = charSequence3;
            charSequence2 = (CharSequence) t;
            Boolean bool22 = this.$button.c;
            boolean booleanValue22 = bool22 != null ? bool22.booleanValue() : true;
            ChargersOfferButtonDto chargersOfferButtonDto22 = this.$button;
            action = chargersOfferButtonDto22.e;
            if (action == ChargersOfferButtonDto.Action.CREATE_ORDER) {
            }
            b7aVar = g7aVar;
            return new uo9(charSequence, charSequence2, booleanValue22, b7aVar, true, null, false, this.$isMainButtonLoading, 96);
        }
        return coroutineSingletons;
    }
}
