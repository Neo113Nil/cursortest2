package defpackage;

import com.ybsdk.network.dto.card.CardDeliveryStatusResponse;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class hd8 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CardDeliveryStatusResponse.CardDeliveryInfo.CardDeliveryApplicationStatus.values().length];
        try {
            iArr[CardDeliveryStatusResponse.CardDeliveryInfo.CardDeliveryApplicationStatus.NEED_DELIVERY_INFO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CardDeliveryStatusResponse.CardDeliveryInfo.CardDeliveryApplicationStatus.CREATED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CardDeliveryStatusResponse.CardDeliveryInfo.CardDeliveryApplicationStatus.LOGISTIC.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CardDeliveryStatusResponse.CardDeliveryInfo.CardDeliveryApplicationStatus.ACTIVATION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[CardDeliveryStatusResponse.CardDeliveryInfo.CardDeliveryApplicationStatus.WAITING_FOR_PICKUP.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[CardDeliveryStatusResponse.CardDeliveryInfo.CardDeliveryApplicationStatus.CANCEL.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[CardDeliveryStatusResponse.CardDeliveryInfo.CardDeliveryApplicationStatus.FAIL.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[CardDeliveryStatusResponse.CardDeliveryInfo.CardDeliveryApplicationStatus.SUCCESS.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[CardDeliveryStatusResponse.CardDeliveryInfo.CardDeliveryApplicationStatus.UNKNOWN.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        a = iArr;
    }
}
