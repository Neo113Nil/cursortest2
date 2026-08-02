package defpackage;

import com.yandex.go.scooters.ble.api.ScootersBleProtocol;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class i1n0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ScootersBleProtocol.values().length];
        try {
            iArr[ScootersBleProtocol.NINEBOT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScootersBleProtocol.WIND.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
