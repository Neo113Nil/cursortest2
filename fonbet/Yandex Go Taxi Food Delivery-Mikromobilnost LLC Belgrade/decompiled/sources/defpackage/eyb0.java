package defpackage;

import ru.yandex.yandexmaps.multiplatform.pin.war.internal.util.PlacemarkType;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class eyb0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PlacemarkType.values().length];
        try {
            iArr[PlacemarkType.ICON_OVERLAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
