package defpackage;

import ru.yandex.taxi.ui.routing.DriverFullNameCopyRouter$CopySource;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class kim {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DriverFullNameCopyRouter$CopySource.values().length];
        try {
            iArr[DriverFullNameCopyRouter$CopySource.DETAIL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DriverFullNameCopyRouter$CopySource.PROFILE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
