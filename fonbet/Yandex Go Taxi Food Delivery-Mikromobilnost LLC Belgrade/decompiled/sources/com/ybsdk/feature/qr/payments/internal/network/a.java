package com.ybsdk.feature.qr.payments.internal.network;

import com.ybsdk.core.utils.dto.SecondAuthorizationResponse;
import com.ybsdk.feature.qr.payments.internal.network.dto.QrPaymentsTwoFactorAuthResponse;
import defpackage.gbg0;
import defpackage.hbg0;
import defpackage.ibg0;
import defpackage.kbg0;
import defpackage.ny61;
import defpackage.w511;
import defpackage.wls;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(QrPaymentsTwoFactorAuthResponse qrPaymentsTwoFactorAuthResponse, wls wlsVar, ContinuationImpl continuationImpl) {
        QrPaymentsTwoFactorAuthEntityKt$toQrPaymentsEntity$1 qrPaymentsTwoFactorAuthEntityKt$toQrPaymentsEntity$1;
        int i;
        String trackId;
        if (continuationImpl instanceof QrPaymentsTwoFactorAuthEntityKt$toQrPaymentsEntity$1) {
            qrPaymentsTwoFactorAuthEntityKt$toQrPaymentsEntity$1 = (QrPaymentsTwoFactorAuthEntityKt$toQrPaymentsEntity$1) continuationImpl;
            int i2 = qrPaymentsTwoFactorAuthEntityKt$toQrPaymentsEntity$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qrPaymentsTwoFactorAuthEntityKt$toQrPaymentsEntity$1.label = i2 - Integer.MIN_VALUE;
                Object obj = qrPaymentsTwoFactorAuthEntityKt$toQrPaymentsEntity$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = qrPaymentsTwoFactorAuthEntityKt$toQrPaymentsEntity$1.label;
                if (i != 0) {
                    b.b(obj);
                    int i3 = kbg0.a[qrPaymentsTwoFactorAuthResponse.getResultStatus().ordinal()];
                    if (i3 != 1) {
                        if (i3 == 2) {
                            QrPaymentsTwoFactorAuthResponse.AuthorizationTrackInfo authorizationInfo = qrPaymentsTwoFactorAuthResponse.getAuthorizationInfo();
                            return (authorizationInfo == null || (trackId = authorizationInfo.getTrackId()) == null) ? new Result.Failure(new Exception("authorizationInfo null")) : new gbg0(trackId, qrPaymentsTwoFactorAuthResponse.getAuthorizationInfo().getOperationId());
                        }
                        if (i3 == 3) {
                            SecondAuthorizationResponse.FailData failData = qrPaymentsTwoFactorAuthResponse.getFailData();
                            return new hbg0(failData != null ? failData.getSupportUrl() : null);
                        }
                        w511.b();
                        return null;
                    }
                    Object successData = qrPaymentsTwoFactorAuthResponse.getSuccessData();
                    if (successData == null) {
                        return new Result.Failure(new Exception("successData null"));
                    }
                    qrPaymentsTwoFactorAuthEntityKt$toQrPaymentsEntity$1.label = 1;
                    obj = wlsVar.invoke(successData, qrPaymentsTwoFactorAuthEntityKt$toQrPaymentsEntity$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return new ibg0(obj);
            }
        }
        qrPaymentsTwoFactorAuthEntityKt$toQrPaymentsEntity$1 = new QrPaymentsTwoFactorAuthEntityKt$toQrPaymentsEntity$1(continuationImpl);
        Object obj3 = qrPaymentsTwoFactorAuthEntityKt$toQrPaymentsEntity$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = qrPaymentsTwoFactorAuthEntityKt$toQrPaymentsEntity$1.label;
        if (i != 0) {
        }
        return new ibg0(obj3);
    }
}
