package defpackage;

import ru.yandex.taxi.masstransit.model.EssentialPoint$Type;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class ef30 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[EssentialPoint$Type.values().length];
        try {
            iArr[EssentialPoint$Type.SOURCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EssentialPoint$Type.DESTINATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
