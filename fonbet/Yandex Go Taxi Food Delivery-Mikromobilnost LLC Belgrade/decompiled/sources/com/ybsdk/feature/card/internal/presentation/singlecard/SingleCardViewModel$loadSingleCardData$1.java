package com.ybsdk.feature.card.internal.presentation.singlecard;

import com.ybsdk.core.analytics.generated.delegates.CardMainScreenEvents$CardMainScreenCardDetailsShowProductId;
import com.ybsdk.core.analytics.generated.delegates.CardMainScreenEvents$CardMainScreenCardDetailsShowType;
import com.ybsdk.core.analytics.generated.delegates.CardMainScreenEvents$CardMainScreenLoadedProductId;
import com.ybsdk.core.analytics.generated.delegates.CardMainScreenEvents$CardMainScreenLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.CardMainScreenEvents$CardMainScreenLoadedStatus;
import com.ybsdk.core.analytics.generated.delegates.CardMainScreenEvents$CardMainScreenLoadedType;
import com.ybsdk.core.utils.ui.RequestStatus$Data$Source;
import com.ybsdk.feature.card.api.entities.YbCardStatusEntity;
import com.ybsdk.feature.card.internal.entities.CardProductTypeEntity;
import com.ybsdk.feature.card.internal.interactors.l;
import com.ybsdk.feature.card.internal.network.dto.YbCardTypeResponse;
import defpackage.ggs0;
import defpackage.hgs0;
import defpackage.m04;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.qq7;
import defpackage.r8j0;
import defpackage.rcc;
import defpackage.rgs0;
import defpackage.s8j0;
import defpackage.t8j0;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.card.internal.presentation.singlecard.SingleCardViewModel$loadSingleCardData$1", f = "SingleCardViewModel.kt", l = {HProv.PP_CIPHEROID}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SingleCardViewModel$loadSingleCardData$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $showShimmer;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleCardViewModel$loadSingleCardData$1(boolean z, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$showShimmer = z;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SingleCardViewModel$loadSingleCardData$1(this.$showShimmer, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SingleCardViewModel$loadSingleCardData$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        CardMainScreenEvents$CardMainScreenLoadedProductId cardMainScreenEvents$CardMainScreenLoadedProductId;
        CardMainScreenEvents$CardMainScreenLoadedType cardMainScreenEvents$CardMainScreenLoadedType;
        CardMainScreenEvents$CardMainScreenLoadedStatus cardMainScreenEvents$CardMainScreenLoadedStatus;
        CardMainScreenEvents$CardMainScreenCardDetailsShowProductId cardMainScreenEvents$CardMainScreenCardDetailsShowProductId;
        CardMainScreenEvents$CardMainScreenCardDetailsShowType cardMainScreenEvents$CardMainScreenCardDetailsShowType;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            if (this.$showShimmer) {
                pz40 Y = this.this$0.Y();
                do {
                    r0Var = (r0) Y;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, rgs0.a((rgs0) value, new t8j0(), false, null, false, null, null, false, 1022)));
            }
            a aVar = this.this$0;
            l lVar = aVar.D;
            String cardId = aVar.B.getCardId();
            String productId = this.this$0.B.getProductId();
            this.label = 1;
            Object a = lVar.a(cardId, productId, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj2 = a;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            obj2 = ((Result) obj).getValue();
        }
        a aVar2 = this.this$0;
        if (!(obj2 instanceof Result.Failure)) {
            hgs0 hgs0Var = (hgs0) obj2;
            m04 m04Var = aVar2.L;
            CardProductTypeEntity cardProductTypeEntity = hgs0Var.g;
            qq7 qq7Var = m04Var.a.l;
            CardMainScreenEvents$CardMainScreenLoadedResult cardMainScreenEvents$CardMainScreenLoadedResult = CardMainScreenEvents$CardMainScreenLoadedResult.OK;
            int[] iArr = ggs0.b;
            int i2 = iArr[cardProductTypeEntity.ordinal()];
            if (i2 == 1) {
                cardMainScreenEvents$CardMainScreenLoadedProductId = CardMainScreenEvents$CardMainScreenLoadedProductId.WALLET;
            } else if (i2 == 2) {
                cardMainScreenEvents$CardMainScreenLoadedProductId = CardMainScreenEvents$CardMainScreenLoadedProductId.PRO;
            } else if (i2 == 3) {
                cardMainScreenEvents$CardMainScreenLoadedProductId = CardMainScreenEvents$CardMainScreenLoadedProductId.CREDLIM;
            } else if (i2 == 4) {
                cardMainScreenEvents$CardMainScreenLoadedProductId = CardMainScreenEvents$CardMainScreenLoadedProductId.UNKNOWN;
            } else {
                if (i2 != 5) {
                    w511.b();
                    return null;
                }
                cardMainScreenEvents$CardMainScreenLoadedProductId = CardMainScreenEvents$CardMainScreenLoadedProductId.SPLIT;
            }
            YbCardTypeResponse ybCardTypeResponse = hgs0Var.h;
            int[] iArr2 = ggs0.a;
            int i3 = iArr2[ybCardTypeResponse.ordinal()];
            if (i3 == 1) {
                cardMainScreenEvents$CardMainScreenLoadedType = CardMainScreenEvents$CardMainScreenLoadedType.CARD_DIGITAL;
            } else {
                if (i3 != 2) {
                    w511.b();
                    return null;
                }
                cardMainScreenEvents$CardMainScreenLoadedType = CardMainScreenEvents$CardMainScreenLoadedType.CARD_PLASTIC;
            }
            switch (ggs0.c[hgs0Var.b.c.ordinal()]) {
                case 1:
                    cardMainScreenEvents$CardMainScreenLoadedStatus = CardMainScreenEvents$CardMainScreenLoadedStatus.FROZEN;
                    break;
                case 2:
                    cardMainScreenEvents$CardMainScreenLoadedStatus = CardMainScreenEvents$CardMainScreenLoadedStatus.ACTIVE;
                    break;
                case 3:
                    cardMainScreenEvents$CardMainScreenLoadedStatus = CardMainScreenEvents$CardMainScreenLoadedStatus.DELETED;
                    break;
                case 4:
                    cardMainScreenEvents$CardMainScreenLoadedStatus = CardMainScreenEvents$CardMainScreenLoadedStatus.BLOCKED;
                    break;
                case 5:
                    cardMainScreenEvents$CardMainScreenLoadedStatus = CardMainScreenEvents$CardMainScreenLoadedStatus.REISSUE;
                    break;
                case 6:
                    cardMainScreenEvents$CardMainScreenLoadedStatus = null;
                    break;
                default:
                    w511.b();
                    return null;
            }
            RequestStatus$Data$Source requestStatus$Data$Source = null;
            qq7.d(qq7Var, cardMainScreenEvents$CardMainScreenLoadedResult, null, cardMainScreenEvents$CardMainScreenLoadedProductId, cardMainScreenEvents$CardMainScreenLoadedStatus, cardMainScreenEvents$CardMainScreenLoadedType, 2);
            qq7 qq7Var2 = aVar2.L.a.l;
            int i4 = iArr[cardProductTypeEntity.ordinal()];
            if (i4 == 1) {
                cardMainScreenEvents$CardMainScreenCardDetailsShowProductId = CardMainScreenEvents$CardMainScreenCardDetailsShowProductId.WALLET;
            } else if (i4 == 2) {
                cardMainScreenEvents$CardMainScreenCardDetailsShowProductId = CardMainScreenEvents$CardMainScreenCardDetailsShowProductId.PRO;
            } else if (i4 == 3) {
                cardMainScreenEvents$CardMainScreenCardDetailsShowProductId = CardMainScreenEvents$CardMainScreenCardDetailsShowProductId.CREDLIM;
            } else if (i4 == 4) {
                cardMainScreenEvents$CardMainScreenCardDetailsShowProductId = CardMainScreenEvents$CardMainScreenCardDetailsShowProductId.UNKNOWN;
            } else {
                if (i4 != 5) {
                    w511.b();
                    return null;
                }
                cardMainScreenEvents$CardMainScreenCardDetailsShowProductId = CardMainScreenEvents$CardMainScreenCardDetailsShowProductId.SPLIT;
            }
            int i5 = iArr2[hgs0Var.h.ordinal()];
            if (i5 == 1) {
                cardMainScreenEvents$CardMainScreenCardDetailsShowType = CardMainScreenEvents$CardMainScreenCardDetailsShowType.CARD_DIGITAL;
            } else {
                if (i5 != 2) {
                    w511.b();
                    return null;
                }
                cardMainScreenEvents$CardMainScreenCardDetailsShowType = CardMainScreenEvents$CardMainScreenCardDetailsShowType.CARD_PLASTIC;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(2);
            linkedHashMap.put("product_id", cardMainScreenEvents$CardMainScreenCardDetailsShowProductId.getOriginalValue());
            linkedHashMap.put("type", cardMainScreenEvents$CardMainScreenCardDetailsShowType.getOriginalValue());
            qq7Var2.a.a("card.main_screen.card_details.show", linkedHashMap);
            ListBuilder a2 = rcc.a();
            a2.add(YbCardStatusEntity.FROZEN);
            a2.add(YbCardStatusEntity.ACTIVE);
            if (cardProductTypeEntity == CardProductTypeEntity.CREDIT_LIMIT || cardProductTypeEntity == CardProductTypeEntity.SPLIT) {
                a2.add(YbCardStatusEntity.BLOCKED);
            }
            if (a2.j().contains(hgs0Var.b.c)) {
                pz40 Y2 = aVar2.Y();
                while (true) {
                    r0 r0Var3 = (r0) Y2;
                    Object value3 = r0Var3.getValue();
                    RequestStatus$Data$Source requestStatus$Data$Source2 = requestStatus$Data$Source;
                    if (!r0Var3.k(value3, rgs0.a((rgs0) value3, new r8j0(hgs0Var, requestStatus$Data$Source2, 14), false, null, false, null, null, false, 1022))) {
                        requestStatus$Data$Source = requestStatus$Data$Source2;
                    }
                }
            } else {
                aVar2.E.e();
            }
        }
        a aVar3 = this.this$0;
        Throwable a3 = Result.a(obj2);
        if (a3 != null) {
            qq7.d(aVar3.L.a.l, CardMainScreenEvents$CardMainScreenLoadedResult.ERROR, a3.getMessage(), null, null, null, 28);
            pz40 Y3 = aVar3.Y();
            do {
                r0Var2 = (r0) Y3;
                value2 = r0Var2.getValue();
            } while (!r0Var2.k(value2, rgs0.a((rgs0) value2, new s8j0(a3), false, null, false, null, null, false, 1022)));
        }
        return zy11.a;
    }
}
