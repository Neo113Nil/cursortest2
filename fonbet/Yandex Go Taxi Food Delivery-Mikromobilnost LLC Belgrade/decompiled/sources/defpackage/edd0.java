package defpackage;

import com.yandex.plus.pay.repository.api.model.invoice.Invoice$Payment$ErrorStatusCode;
import com.yandex.plus.pay.repository.api.model.invoice.Invoice$Status;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class edd0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[Invoice$Status.values().length];
        try {
            iArr[Invoice$Status.CANCELLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Invoice$Status.CREATED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Invoice$Status.CREATED_LEGACY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Invoice$Status.FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[Invoice$Status.PROVISION_SCHEDULED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[Invoice$Status.SCHEDULED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[Invoice$Status.STARTED.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[Invoice$Status.SUCCESS.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[Invoice$Status.WAIT_FOR_3DS.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[Invoice$Status.WAIT_FOR_NOTIFICATION.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[Invoice$Status.UNKNOWN.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        a = iArr;
        int[] iArr2 = new int[Invoice$Payment$ErrorStatusCode.values().length];
        try {
            iArr2[Invoice$Payment$ErrorStatusCode.PAYMENT_TIMEOUT.ordinal()] = 1;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[Invoice$Payment$ErrorStatusCode.BLACKLISTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[Invoice$Payment$ErrorStatusCode.EXPIRED_CARD.ordinal()] = 3;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[Invoice$Payment$ErrorStatusCode.USER_CANCELLED.ordinal()] = 4;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[Invoice$Payment$ErrorStatusCode.RESTRICTED_CARD.ordinal()] = 5;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[Invoice$Payment$ErrorStatusCode.FAIL_3DS.ordinal()] = 6;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[Invoice$Payment$ErrorStatusCode.NOT_ENOUGH_FUNDS.ordinal()] = 7;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr2[Invoice$Payment$ErrorStatusCode.INVALID_XRF_TOKEN.ordinal()] = 8;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr2[Invoice$Payment$ErrorStatusCode.OPERATION_CANCELLED.ordinal()] = 9;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr2[Invoice$Payment$ErrorStatusCode.AUTH_REJECT.ordinal()] = 10;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr2[Invoice$Payment$ErrorStatusCode.TIMEOUT_NO_SUCCESS.ordinal()] = 11;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr2[Invoice$Payment$ErrorStatusCode.TRANSACTION_NOT_PERMITTED.ordinal()] = 12;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr2[Invoice$Payment$ErrorStatusCode.LIMIT_EXCEEDED.ordinal()] = 13;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr2[Invoice$Payment$ErrorStatusCode.UNEXPECTED.ordinal()] = 14;
        } catch (NoSuchFieldError unused25) {
        }
        b = iArr2;
    }
}
