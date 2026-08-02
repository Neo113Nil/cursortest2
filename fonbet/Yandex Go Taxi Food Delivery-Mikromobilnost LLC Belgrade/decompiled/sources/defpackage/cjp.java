package defpackage;

import com.yandex.go.address.models.FavoriteAddressDatumType;
import com.yandex.go.address.models.PlaceType;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class cjp {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[FavoriteAddressDatumType.values().length];
        try {
            iArr[FavoriteAddressDatumType.REGULAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FavoriteAddressDatumType.GEO_POINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[PlaceType.values().length];
        try {
            iArr2[PlaceType.HOME.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[PlaceType.WORK.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
    }
}
