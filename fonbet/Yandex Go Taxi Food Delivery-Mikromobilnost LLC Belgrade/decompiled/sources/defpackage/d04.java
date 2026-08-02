package defpackage;

import com.ybsdk.feature.autotopup.internal.network.dto.AutoFundSettingFieldTypeDto;
import com.ybsdk.feature.autotopup.internal.network.dto.AutoTopupSettingFieldTypeDto;
import com.ybsdk.feature.autotopup.internal.network.dto.AutoTopupTypeDto;
import com.ybsdk.feature.autotopup.internal.network.dto.AutotopupPaymentStatusResultData;
import com.ybsdk.feature.autotopup.internal.network.dto.AutotopupPaymentStatusSuccessResponse;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class d04 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;

    static {
        int[] iArr = new int[AutotopupPaymentStatusSuccessResponse.Status.values().length];
        try {
            iArr[AutotopupPaymentStatusSuccessResponse.Status.DONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AutotopupPaymentStatusSuccessResponse.Status.IN_PROGRESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[AutoTopupTypeDto.values().length];
        try {
            iArr2[AutoTopupTypeDto.BALANCE_THRESHOLD.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[AutoTopupTypeDto.UP_TO_BALANCE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[AutoTopupTypeDto.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
        int[] iArr3 = new int[AutoTopupSettingFieldTypeDto.values().length];
        try {
            iArr3[AutoTopupSettingFieldTypeDto.AMOUNT.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[AutoTopupSettingFieldTypeDto.THRESHOLD.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        c = iArr3;
        int[] iArr4 = new int[AutoFundSettingFieldTypeDto.values().length];
        try {
            iArr4[AutoFundSettingFieldTypeDto.AUTOFUND_MONEY.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        d = iArr4;
        int[] iArr5 = new int[AutotopupPaymentStatusResultData.Status.values().length];
        try {
            iArr5[AutotopupPaymentStatusResultData.Status.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr5[AutotopupPaymentStatusResultData.Status.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr5[AutotopupPaymentStatusResultData.Status.TIMEOUT.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        e = iArr5;
    }
}
