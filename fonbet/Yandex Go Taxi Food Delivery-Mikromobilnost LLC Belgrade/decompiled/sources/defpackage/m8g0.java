package defpackage;

import com.ybsdk.feature.qr.payments.internal.network.common.QrcTypeDto;
import com.ybsdk.feature.qr.payments.internal.network.dto.info.QrcSystemType;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class m8g0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[QrcSystemType.values().length];
        try {
            iArr[QrcSystemType.SBER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[QrcSystemType.SBP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[QrcSystemType.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[QrcTypeDto.values().length];
        try {
            iArr2[QrcTypeDto.PAYMENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[QrcTypeDto.SUBSCRIPTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
