package defpackage;

import ru.yandex.taxi.linked_order.models.data.IconType;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class hj00 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[IconType.values().length];
        try {
            iArr[IconType.C2C.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[IconType.B2C.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[IconType.AMBULANCE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
