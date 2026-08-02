package defpackage;

import com.ybsdk.feature.autotopup.api.AutoTopupSwitchStatus;
import com.ybsdk.feature.autotopup.api.AutoTopupType;
import com.ybsdk.feature.autotopup.internal.network.dto.AutoFundSettingFieldTypeDto;
import com.ybsdk.feature.autotopup.internal.network.dto.AutoTopupSettingFieldTypeDto;
import com.ybsdk.feature.autotopup.internal.network.dto.AutoTopupSwitchStatusRequestDto;
import com.ybsdk.feature.autotopup.internal.network.dto.AutoTopupTypeRequestDto;
import com.ybsdk.feature.autotopup.internal.network.dto.AutotopupRetryPaymentResponse;
import com.ybsdk.feature.autotopup.internal.network.dto.GetAutoTopupStatusSuccessData;
import com.ybsdk.feature.autotopup.internal.network.dto.StatusDataDto;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class h04 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;
    public static final /* synthetic */ int[] f;
    public static final /* synthetic */ int[] g;
    public static final /* synthetic */ int[] h;
    public static final /* synthetic */ int[] i;

    static {
        int[] iArr = new int[AutotopupRetryPaymentResponse.Status.values().length];
        try {
            iArr[AutotopupRetryPaymentResponse.Status.INITIATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AutotopupRetryPaymentResponse.Status.FAIL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[StatusDataDto.Status.values().length];
        try {
            iArr2[StatusDataDto.Status.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[StatusDataDto.Status.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
        int[] iArr3 = new int[GetAutoTopupStatusSuccessData.Status.values().length];
        try {
            iArr3[GetAutoTopupStatusSuccessData.Status.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[GetAutoTopupStatusSuccessData.Status.IN_PROGRESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        c = iArr3;
        int[] iArr4 = new int[AutoTopupType.values().length];
        try {
            iArr4[AutoTopupType.BALANCE_THRESHOLD.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr4[AutoTopupType.UP_TO_BALANCE.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        d = iArr4;
        int[] iArr5 = new int[AutoTopupSwitchStatus.values().length];
        try {
            iArr5[AutoTopupSwitchStatus.ENABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr5[AutoTopupSwitchStatus.DISABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        e = iArr5;
        int[] iArr6 = new int[AutoFundSettingFieldTypeDto.values().length];
        try {
            iArr6[AutoFundSettingFieldTypeDto.AUTOFUND_MONEY.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        f = iArr6;
        int[] iArr7 = new int[AutoTopupSettingFieldTypeDto.values().length];
        try {
            iArr7[AutoTopupSettingFieldTypeDto.AMOUNT.ordinal()] = 1;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr7[AutoTopupSettingFieldTypeDto.THRESHOLD.ordinal()] = 2;
        } catch (NoSuchFieldError unused13) {
        }
        g = iArr7;
        int[] iArr8 = new int[AutoTopupTypeRequestDto.values().length];
        try {
            iArr8[AutoTopupTypeRequestDto.BALANCE_THRESHOLD.ordinal()] = 1;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr8[AutoTopupTypeRequestDto.UP_TO_BALANCE.ordinal()] = 2;
        } catch (NoSuchFieldError unused15) {
        }
        h = iArr8;
        int[] iArr9 = new int[AutoTopupSwitchStatusRequestDto.values().length];
        try {
            iArr9[AutoTopupSwitchStatusRequestDto.ENABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr9[AutoTopupSwitchStatusRequestDto.DISABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused17) {
        }
        i = iArr9;
    }
}
