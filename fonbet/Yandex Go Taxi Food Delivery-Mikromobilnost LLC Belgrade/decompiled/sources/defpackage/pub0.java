package defpackage;

import ru.yandex.yandexmaps.multiplatform.pin.war.internal.util.PlacemarkType;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class pub0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PlacemarkType.values().length];
        try {
            iArr[PlacemarkType.LABEL_S.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlacemarkType.LABEL_M.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
