package defpackage;

import ru.yandex.taxi.favorites.list.ViewType;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class mjr0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ViewType.values().length];
        try {
            iArr[ViewType.FAVORITE_ADDRESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ViewType.SUGGESTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
