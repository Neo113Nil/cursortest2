package defpackage;

import ru.yandex.taxi.battery.BatteryStateProvider$State;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class e1t {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[DriveState.values().length];
        try {
            iArr[DriveState.PREORDER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DriveState.SEARCH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DriveState.DRIVING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DriveState.WAITING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[DriveState.CANCELLED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[DriveState.COMPLETE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[DriveState.TRANSPORTING.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
        int[] iArr2 = new int[BatteryStateProvider$State.values().length];
        try {
            iArr2[BatteryStateProvider$State.FULL.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[BatteryStateProvider$State.HALF.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        b = iArr2;
    }
}
