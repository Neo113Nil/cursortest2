package defpackage;

import ru.yandex.taxi.model.FavoritesCategoryModel$Category;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class i0m0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[FavoritesCategoryModel$Category.values().length];
        try {
            iArr[FavoritesCategoryModel$Category.HOME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FavoritesCategoryModel$Category.WORK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[FavoritesCategoryModel$Category.NEW.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
