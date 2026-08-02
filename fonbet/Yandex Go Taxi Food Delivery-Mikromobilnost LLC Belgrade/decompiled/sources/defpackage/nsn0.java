package defpackage;

import com.yandex.go.scooters.ignition.data.model.ScootersIgnitionExperiment;
import ru.yandex.taxi.battery.BatteryStateProvider$PluggedState;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class nsn0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[ScootersIgnitionExperiment.TechnicalLoggingLevel.values().length];
        try {
            iArr[ScootersIgnitionExperiment.TechnicalLoggingLevel.FULL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScootersIgnitionExperiment.TechnicalLoggingLevel.FULL_WITHOUT_EMPTY_SCAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScootersIgnitionExperiment.TechnicalLoggingLevel.FULL_WITHOUT_SCAN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ScootersIgnitionExperiment.TechnicalLoggingLevel.FULL_WITHOUT_EMPTY_SCAN_REQUEST_RESPONSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ScootersIgnitionExperiment.TechnicalLoggingLevel.FULL_WITHOUT_SCAN_REQUEST_RESPONSE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ScootersIgnitionExperiment.TechnicalLoggingLevel.NOTHING.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
        int[] iArr2 = new int[BatteryStateProvider$PluggedState.values().length];
        try {
            iArr2[BatteryStateProvider$PluggedState.PLUGGED.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[BatteryStateProvider$PluggedState.UNPLUGGED.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        b = iArr2;
    }
}
