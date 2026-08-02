package defpackage;

import com.yandex.go.chargers.feedback.data.ChargersFinishedOrderDto;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class nz9 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ChargersFinishedOrderDto.FinishingStage.values().length];
        try {
            iArr[ChargersFinishedOrderDto.FinishingStage.FREE_CHECK_PERIOD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ChargersFinishedOrderDto.FinishingStage.DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
