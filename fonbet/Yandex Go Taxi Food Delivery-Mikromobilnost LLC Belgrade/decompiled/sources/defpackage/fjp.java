package defpackage;

import com.yandex.go.address.models.FavoritesInputParams$Intention;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class fjp {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[FavoritesInputParams$Intention.values().length];
        try {
            iArr[FavoritesInputParams$Intention.CREATE_SUGGESTED_ADDRESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FavoritesInputParams$Intention.CREATE_ADDRESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
