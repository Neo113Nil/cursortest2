package defpackage;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.feature.partnerselection.internal.network.dto.check.PartnerCheckResultDto;
import com.ybsdk.feature.partnerselection.internal.network.dto.crossborder.CrossBorderCheckUserPartnerResultDto;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class di90 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[DataWithStatusResponse.Status.values().length];
        try {
            iArr[DataWithStatusResponse.Status.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DataWithStatusResponse.Status.FAIL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DataWithStatusResponse.Status.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[CrossBorderCheckUserPartnerResultDto.Status.values().length];
        try {
            iArr2[CrossBorderCheckUserPartnerResultDto.Status.FOUND.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[CrossBorderCheckUserPartnerResultDto.Status.SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[CrossBorderCheckUserPartnerResultDto.Status.NOT_FOUND.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[CrossBorderCheckUserPartnerResultDto.Status.PENDING.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
        int[] iArr3 = new int[PartnerCheckResultDto.Status.values().length];
        try {
            iArr3[PartnerCheckResultDto.Status.FOUND.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[PartnerCheckResultDto.Status.NOT_FOUND.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[PartnerCheckResultDto.Status.PENDING.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        c = iArr3;
    }
}
