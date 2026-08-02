package defpackage;

import ru.yandex.taxi.favorites.experiment.FavoritesCreateRegularAddressExperiment;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class htu {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[FavoritesCreateRegularAddressExperiment.ButtonAction.values().length];
        try {
            iArr[FavoritesCreateRegularAddressExperiment.ButtonAction.CREATE_GEO_POINT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FavoritesCreateRegularAddressExperiment.ButtonAction.CHANGE_REGULAR_ADDRESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[FavoritesCreateRegularAddressExperiment.ButtonAction.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[FavoritesCreateRegularAddressExperiment.ButtonType.values().length];
        try {
            iArr2[FavoritesCreateRegularAddressExperiment.ButtonType.ACTION.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[FavoritesCreateRegularAddressExperiment.ButtonType.DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
