package defpackage;

import com.ybsdk.feature.transfer.version2.api.TransferDirection;
import com.ybsdk.feature.transfer.version2.api.TransferPrerequisites;
import com.ybsdk.feature.transfer.version2.internal.network.dto.StatusIconTypeDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.TransferStatusDto;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class pg01 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[TransferStatusDto.values().length];
        try {
            iArr[TransferStatusDto.FAILED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TransferStatusDto.UNKNOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TransferStatusDto.PROCESSING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TransferStatusDto.SUCCESS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[TransferStatusDto.ACCEPTED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[TransferStatusDto.AWAITING_APPROVAL.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
        int[] iArr2 = new int[StatusIconTypeDto.values().length];
        try {
            iArr2[StatusIconTypeDto.ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[StatusIconTypeDto.SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[StatusIconTypeDto.TIMEOUT.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[StatusIconTypeDto.WARNING.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        b = iArr2;
        int[] iArr3 = new int[TransferDirection.values().length];
        try {
            iArr3[TransferDirection.TRANSFER.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[TransferDirection.TOPUP.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        c = iArr3;
        int[] iArr4 = new int[TransferPrerequisites.CommonTopup.AmountType.values().length];
        try {
            iArr4[TransferPrerequisites.CommonTopup.AmountType.EXACT.ordinal()] = 1;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr4[TransferPrerequisites.CommonTopup.AmountType.EXPECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused14) {
        }
        d = iArr4;
    }
}
