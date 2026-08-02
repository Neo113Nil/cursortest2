package defpackage;

import com.yandex.go.scooters.ble.domain.model.ScootersBleCommandType;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class n1n0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ScootersBleCommandType.values().length];
        try {
            iArr[ScootersBleCommandType.AUTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScootersBleCommandType.LOCK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScootersBleCommandType.UNLOCK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ScootersBleCommandType.SOUND.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ScootersBleCommandType.CABLE_UNLOCK.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ScootersBleCommandType.UNLOCK_BATTERY_COVER.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}
