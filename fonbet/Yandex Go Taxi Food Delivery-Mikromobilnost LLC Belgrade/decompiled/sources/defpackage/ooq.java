package defpackage;

import com.yandex.go.image.api.domain.models.ImageSource;

/* loaded from: classes.dex */
public abstract /* synthetic */ class ooq {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ImageSource.values().length];
        try {
            iArr[ImageSource.MEMORY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ImageSource.DISK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ImageSource.NETWORK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
