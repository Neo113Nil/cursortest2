package com.ybsdk.feature.qr.payments.internal.data;

import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.transfer.utils.domain.entities.PageHeaderEntity;
import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.feature.qr.payments.api.data.PaymentInfoEntityType$SbpV3$Type;
import com.ybsdk.feature.qr.payments.internal.network.QrPaymentsApi;
import com.ybsdk.feature.qr.payments.internal.network.common.AgreementDto;
import com.ybsdk.feature.qr.payments.internal.network.dto.info.QrPaymentInfoDto;
import com.ybsdk.feature.qr.payments.internal.network.dto.info.QrcSystemType;
import defpackage.bob1;
import defpackage.m4m0;
import defpackage.m8g0;
import defpackage.ny61;
import defpackage.qxy0;
import defpackage.tcc;
import defpackage.vpa1;
import defpackage.w511;
import defpackage.w530;
import defpackage.x1a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final QrPaymentsApi a;
    public final w530 b;
    public final String c;

    public a(QrPaymentsApi qrPaymentsApi, w530 w530Var, String str) {
        this.a = qrPaymentsApi;
        this.b = w530Var;
        this.c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, DataWithStatusResponse dataWithStatusResponse, String str, ContinuationImpl continuationImpl) {
        QrPaymentsInfoRepository$toEntity$3 qrPaymentsInfoRepository$toEntity$3;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof QrPaymentsInfoRepository$toEntity$3) {
            qrPaymentsInfoRepository$toEntity$3 = (QrPaymentsInfoRepository$toEntity$3) continuationImpl;
            int i2 = qrPaymentsInfoRepository$toEntity$3.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qrPaymentsInfoRepository$toEntity$3.label = i2 - Integer.MIN_VALUE;
                Object obj = qrPaymentsInfoRepository$toEntity$3.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = qrPaymentsInfoRepository$toEntity$3.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                QrPaymentsInfoRepository$toEntity$4 qrPaymentsInfoRepository$toEntity$4 = new QrPaymentsInfoRepository$toEntity$4(aVar, str, null);
                qrPaymentsInfoRepository$toEntity$3.label = 1;
                Object b = com.ybsdk.core.utils.dto.b.b(dataWithStatusResponse, qrPaymentsInfoRepository$toEntity$4, qrPaymentsInfoRepository$toEntity$3);
                return b == coroutineSingletons ? coroutineSingletons : b;
            }
        }
        qrPaymentsInfoRepository$toEntity$3 = new QrPaymentsInfoRepository$toEntity$3(aVar, continuationImpl);
        Object obj2 = qrPaymentsInfoRepository$toEntity$3.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = qrPaymentsInfoRepository$toEntity$3.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(int i, String str, String str2, ContinuationImpl continuationImpl) {
        QrPaymentsInfoRepository$getQrPaymentsInfo$1 qrPaymentsInfoRepository$getQrPaymentsInfo$1;
        int i2;
        if (continuationImpl instanceof QrPaymentsInfoRepository$getQrPaymentsInfo$1) {
            qrPaymentsInfoRepository$getQrPaymentsInfo$1 = (QrPaymentsInfoRepository$getQrPaymentsInfo$1) continuationImpl;
            int i3 = qrPaymentsInfoRepository$getQrPaymentsInfo$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                qrPaymentsInfoRepository$getQrPaymentsInfo$1.label = i3 - Integer.MIN_VALUE;
                Object obj = qrPaymentsInfoRepository$getQrPaymentsInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = qrPaymentsInfoRepository$getQrPaymentsInfo$1.label;
                if (i2 == 0) {
                    if (i2 == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                QrPaymentsInfoRepository$getQrPaymentsInfo$2 qrPaymentsInfoRepository$getQrPaymentsInfo$2 = new QrPaymentsInfoRepository$getQrPaymentsInfo$2(this, str, str2, i, null);
                qrPaymentsInfoRepository$getQrPaymentsInfo$1.label = 1;
                Object c = c.c(qrPaymentsInfoRepository$getQrPaymentsInfo$2, qrPaymentsInfoRepository$getQrPaymentsInfo$1);
                return c == coroutineSingletons ? coroutineSingletons : c;
            }
        }
        qrPaymentsInfoRepository$getQrPaymentsInfo$1 = new QrPaymentsInfoRepository$getQrPaymentsInfo$1(this, continuationImpl);
        Object obj2 = qrPaymentsInfoRepository$getQrPaymentsInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = qrPaymentsInfoRepository$getQrPaymentsInfo$1.label;
        if (i2 == 0) {
        }
    }

    public final x1a0 c(QrPaymentInfoDto qrPaymentInfoDto, String str, QrcSystemType qrcSystemType) {
        PaymentInfoEntityType$SbpV3$Type paymentInfoEntityType$SbpV3$Type;
        Money money = qrPaymentInfoDto.getMoney();
        MoneyEntity g = money != null ? bob1.g(money, this.b) : null;
        String message = qrPaymentInfoDto.getMessage();
        String title = qrPaymentInfoDto.getMerchant().getTitle();
        String description = qrPaymentInfoDto.getMerchant().getDescription();
        ThemedImageUrlEntity c = qxy0.c(qrPaymentInfoDto.getMerchant().getThemedLogo(), qrPaymentInfoDto.getMerchant().getLogo());
        List<AgreementDto> agreements = qrPaymentInfoDto.getAgreements();
        ArrayList arrayList = new ArrayList(tcc.n(agreements, 10));
        Iterator<T> it = agreements.iterator();
        while (it.hasNext()) {
            arrayList.add(vpa1.c((AgreementDto) it.next()));
        }
        PageHeaderEntity k = m4m0.k(qrPaymentInfoDto.getHeader());
        String agreementsSheetTitle = qrPaymentInfoDto.getAgreementsSheetTitle();
        int i = m8g0.a[qrcSystemType.ordinal()];
        if (i == 1) {
            paymentInfoEntityType$SbpV3$Type = PaymentInfoEntityType$SbpV3$Type.SBER;
        } else {
            if (i != 2) {
                if (i == 3) {
                    return null;
                }
                w511.b();
                return null;
            }
            paymentInfoEntityType$SbpV3$Type = PaymentInfoEntityType$SbpV3$Type.SBP;
        }
        return new x1a0(g, message, title, description, c, arrayList, agreementsSheetTitle, str, k, paymentInfoEntityType$SbpV3$Type);
    }
}
