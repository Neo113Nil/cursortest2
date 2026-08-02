package defpackage;

import ru.yandex.taxi.logistics.sdk.photocomments.api.PhotocommentsSource;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class ij0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PhotocommentsSource.values().length];
        try {
            iArr[PhotocommentsSource.CAMERA.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PhotocommentsSource.GALLERY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PhotocommentsSource.SOURCE_CHOOSER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
