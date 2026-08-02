package defpackage;

import com.ybsdk.feature.savings.internal.network.dto.FundOperationRequestStatusDto;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class ips {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[FundOperationRequestStatusDto.values().length];
        try {
            iArr[FundOperationRequestStatusDto.IN_PROGRESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FundOperationRequestStatusDto.NEED_CONFIRMATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[FundOperationRequestStatusDto.SUCCESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[FundOperationRequestStatusDto.RESULT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
