package defpackage;

import ru.yandex.taxi.logistics.sdk.ui_models.minimap.MapPinType;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class ci20 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MapPinType.values().length];
        try {
            iArr[MapPinType.DESTINATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MapPinType.SOURCE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MapPinType.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[MapPinType.CUSTOM.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
