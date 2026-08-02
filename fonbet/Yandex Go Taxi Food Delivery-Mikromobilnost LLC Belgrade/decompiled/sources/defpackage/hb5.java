package defpackage;

import com.yandex.go.image.api.domain.models.ImageModel$Tag$Theme;

/* loaded from: classes.dex */
public abstract /* synthetic */ class hb5 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ImageModel$Tag$Theme.values().length];
        try {
            iArr[ImageModel$Tag$Theme.Light.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ImageModel$Tag$Theme.Dark.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
