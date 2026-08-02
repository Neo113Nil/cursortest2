package defpackage;

import ru.yandex.taxi.preorder.tollroad.data.TollRoadDialogExperimentProvider$PaymentMode;
import ru.yandex.taxi.preorder.tollroad.data.TollRoadDialogExperimentProvider$RoadMode;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class npz0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[TollRoadDialogExperimentProvider$RoadMode.values().length];
        try {
            iArr[TollRoadDialogExperimentProvider$RoadMode.SINGLE_ROAD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TollRoadDialogExperimentProvider$RoadMode.MULTIPLE_ROAD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[TollRoadDialogExperimentProvider$PaymentMode.values().length];
        try {
            iArr2[TollRoadDialogExperimentProvider$PaymentMode.MANUAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[TollRoadDialogExperimentProvider$PaymentMode.MANUAL_WITH_FEE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[TollRoadDialogExperimentProvider$PaymentMode.AUTO.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[TollRoadDialogExperimentProvider$PaymentMode.AUTO_WITH_FEE.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[TollRoadDialogExperimentProvider$PaymentMode.AUTO_WITH_FEE_DISCOUNT.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[TollRoadDialogExperimentProvider$PaymentMode.UNKNOWN.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        b = iArr2;
    }
}
