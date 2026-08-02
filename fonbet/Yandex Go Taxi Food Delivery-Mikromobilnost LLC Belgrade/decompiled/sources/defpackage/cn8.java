package defpackage;

import com.ybsdk.feature.card.internal.network.dto.CorpCardResponseStatus;
import com.ybsdk.feature.card.internal.network.dto.GetApplicationStatusResponse;
import com.ybsdk.feature.card.internal.network.dto.GetPreparedYandexDataV2ResponseStatus;
import com.ybsdk.feature.card.internal.network.dto.SetCardStatusSuccessData$SetResultState;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class cn8 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[CorpCardResponseStatus.values().length];
        try {
            iArr[CorpCardResponseStatus.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CorpCardResponseStatus.FAILURE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[GetPreparedYandexDataV2ResponseStatus.values().length];
        try {
            iArr2[GetPreparedYandexDataV2ResponseStatus.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[GetPreparedYandexDataV2ResponseStatus.FAILURE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr3 = new int[GetApplicationStatusResponse.Status.values().length];
        try {
            iArr3[GetApplicationStatusResponse.Status.PROCESSING.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[GetApplicationStatusResponse.Status.SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[GetApplicationStatusResponse.Status.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr3;
        int[] iArr4 = new int[SetCardStatusSuccessData$SetResultState.StateType.values().length];
        try {
            iArr4[SetCardStatusSuccessData$SetResultState.StateType.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr4[SetCardStatusSuccessData$SetResultState.StateType.FAIL.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        b = iArr4;
    }
}
