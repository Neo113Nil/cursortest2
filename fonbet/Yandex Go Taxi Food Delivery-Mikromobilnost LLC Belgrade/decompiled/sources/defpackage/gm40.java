package defpackage;

import ru.yandex.taxi.multiorder.multi.ServiceType;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class gm40 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ServiceType.values().length];
        try {
            iArr[ServiceType.DRIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ServiceType.LINKED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ServiceType.TAXI.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ServiceType.LOGISTICS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ServiceType.SCOOTERS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ServiceType.CHARGERS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[ServiceType.NAVIGATION.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[ServiceType.MULTIMODAL.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        a = iArr;
    }
}
