package com.ybsdk.di.modules.features;

import com.ybsdk.core.common.data.network.dto.CardInfoDto;
import com.ybsdk.core.common.data.network.dto.PaymentMethodDto;
import com.ybsdk.core.common.data.network.dto.PaymentMethodTypeDto;
import com.ybsdk.core.common.data.network.dto.PaymentMethodsListDto;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.network.Api;
import defpackage.iyd0;
import defpackage.ny61;
import defpackage.uc8;
import defpackage.uu01;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class u {
    public final /* synthetic */ Api a;

    public u(Api api, uu01 uu01Var) {
        this.a = api;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(int i, ContinuationImpl continuationImpl) {
        TransferVersion2FeatureModule$cardDataProvider$1$getCardData$1 transferVersion2FeatureModule$cardDataProvider$1$getCardData$1;
        int i2;
        Object c;
        uc8 uc8Var;
        String logo;
        if (continuationImpl instanceof TransferVersion2FeatureModule$cardDataProvider$1$getCardData$1) {
            transferVersion2FeatureModule$cardDataProvider$1$getCardData$1 = (TransferVersion2FeatureModule$cardDataProvider$1$getCardData$1) continuationImpl;
            int i3 = transferVersion2FeatureModule$cardDataProvider$1$getCardData$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                transferVersion2FeatureModule$cardDataProvider$1$getCardData$1.label = i3 - Integer.MIN_VALUE;
                Object obj = transferVersion2FeatureModule$cardDataProvider$1$getCardData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = transferVersion2FeatureModule$cardDataProvider$1$getCardData$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    TransferVersion2FeatureModule$cardDataProvider$1$getCardData$2 transferVersion2FeatureModule$cardDataProvider$1$getCardData$2 = new TransferVersion2FeatureModule$cardDataProvider$1$getCardData$2(this.a, i, null);
                    transferVersion2FeatureModule$cardDataProvider$1$getCardData$1.label = 1;
                    c = com.ybsdk.core.utils.ext.c.c(transferVersion2FeatureModule$cardDataProvider$1$getCardData$2, transferVersion2FeatureModule$cardDataProvider$1$getCardData$1);
                    if (c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                if (!(c instanceof Result.Failure)) {
                    return c;
                }
                iyd0 iyd0Var = (iyd0) c;
                List<PaymentMethodDto> paymentMethods = ((PaymentMethodsListDto) iyd0Var.a).getPaymentMethods();
                ArrayList arrayList = new ArrayList();
                for (PaymentMethodDto paymentMethodDto : paymentMethods) {
                    CardInfoDto cardInfo = paymentMethodDto.getCardInfo();
                    if (cardInfo != null) {
                        if (paymentMethodDto.getType() != PaymentMethodTypeDto.CARD) {
                            cardInfo = null;
                        }
                        if (cardInfo != null) {
                            String id = cardInfo.getId();
                            String cardId = cardInfo.getCardId();
                            String partnerId = cardInfo.getPartnerId();
                            String title = paymentMethodDto.getTitle();
                            String description = paymentMethodDto.getDescription();
                            Themes<String> themedLogo = paymentMethodDto.getThemedLogo();
                            if (themedLogo == null || (logo = themedLogo.getLight()) == null) {
                                logo = paymentMethodDto.getLogo();
                            }
                            Themes<String> themedLogo2 = paymentMethodDto.getThemedLogo();
                            uc8Var = new uc8(id, cardId, new ThemedImageUrlEntity(logo, themedLogo2 != null ? themedLogo2.getDark() : null), partnerId, title, description);
                            if (uc8Var == null) {
                                arrayList.add(uc8Var);
                            }
                        }
                    }
                    uc8Var = null;
                    if (uc8Var == null) {
                    }
                }
                return new iyd0(iyd0Var.b, arrayList);
            }
        }
        transferVersion2FeatureModule$cardDataProvider$1$getCardData$1 = new TransferVersion2FeatureModule$cardDataProvider$1$getCardData$1(this, continuationImpl);
        Object obj2 = transferVersion2FeatureModule$cardDataProvider$1$getCardData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = transferVersion2FeatureModule$cardDataProvider$1$getCardData$1.label;
        if (i2 != 0) {
        }
        if (!(c instanceof Result.Failure)) {
        }
    }
}
