package defpackage;

import ru.yandex.taxi.main.map.autoupdatelocationthrottle.AutoUpdateUserLocationStrategyExperiment;
import ru.yandex.taxi.persuggest.repository.AutoFsSessionPhase;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class nc00 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[AutoUpdateUserLocationStrategyExperiment.AutoUpdateUserLocationStrategyType.values().length];
        try {
            iArr[AutoUpdateUserLocationStrategyExperiment.AutoUpdateUserLocationStrategyType.THROTTLE_STRATEGY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AutoUpdateUserLocationStrategyExperiment.AutoUpdateUserLocationStrategyType.TIME_INTERVAL_STRATEGY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AutoUpdateUserLocationStrategyExperiment.AutoUpdateUserLocationStrategyType.WARMUP_COOLDOWN_STRATEGY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[AutoFsSessionPhase.values().length];
        try {
            iArr2[AutoFsSessionPhase.Silent.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[AutoFsSessionPhase.AwaitingCycleStart.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[AutoFsSessionPhase.WarmUp.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[AutoFsSessionPhase.ReadyForAutoFs.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
    }
}
