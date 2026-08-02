package defpackage;

import com.yandex.go.places.models.data.entities.network.CategoryFilterType;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class h6c0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CategoryFilterType.values().length];
        try {
            iArr[CategoryFilterType.SEARCH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CategoryFilterType.CATEGORY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
