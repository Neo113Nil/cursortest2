package defpackage;

import ru.yandex.taxi.scooters.data.model.PassItemType;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class nco0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PassItemType.values().length];
        try {
            iArr[PassItemType.TARIFF.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PassItemType.PACKAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PassItemType.SUPER_PASS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
