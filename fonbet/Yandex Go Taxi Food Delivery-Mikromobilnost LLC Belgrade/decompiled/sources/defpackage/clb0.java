package defpackage;

import ru.yandex.taxi.logistics.sdk.photocomments.PhotocommentsMode;
import ru.yandex.taxi.logistics.sdk.photocomments.data.PhotoModel$Type;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class clb0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[PhotoModel$Type.values().length];
        try {
            iArr[PhotoModel$Type.LOCAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PhotoModel$Type.REMOTE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[PhotocommentsMode.values().length];
        try {
            iArr2[PhotocommentsMode.IMMUTABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[PhotocommentsMode.MUTABLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
    }
}
