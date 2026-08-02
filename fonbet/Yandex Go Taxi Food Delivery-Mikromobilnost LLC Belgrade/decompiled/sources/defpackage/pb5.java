package defpackage;

import com.yandex.go.summary.ui.model.common.basetariffinfo.TariffOrderFlowUiState;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class pb5 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[TariffOrderFlow.values().length];
        try {
            iArr[TariffOrderFlow.DRIVE_FLOW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TariffOrderFlow.TAXI_FLOW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TariffOrderFlow.SHUTTLE_FLOW.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TariffOrderFlow.DELIVERY_FLOW.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[TariffOrderFlow.COPTER_FLOW.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[TariffOrderFlow.COPTER_CITY_TOUR_FLOW.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
        int[] iArr2 = new int[TariffOrderFlowUiState.values().length];
        try {
            iArr2[TariffOrderFlowUiState.DRIVE_FLOW.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[TariffOrderFlowUiState.TAXI_FLOW.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[TariffOrderFlowUiState.SHUTTLE_FLOW.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[TariffOrderFlowUiState.DELIVERY_FLOW.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[TariffOrderFlowUiState.COPTER_FLOW.ordinal()] = 5;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[TariffOrderFlowUiState.COPTER_CITY_TOUR_FLOW.ordinal()] = 6;
        } catch (NoSuchFieldError unused12) {
        }
        b = iArr2;
    }
}
