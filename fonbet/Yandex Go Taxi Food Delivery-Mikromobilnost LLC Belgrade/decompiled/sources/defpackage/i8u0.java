package defpackage;

import com.yandex.go.design.compose.toolbar.StatusBarType;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class i8u0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[StatusBarType.values().length];
        try {
            iArr[StatusBarType.SyncWithTheme.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[StatusBarType.InvertedByTheme.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[StatusBarType.ForceDark.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[StatusBarType.ForceLight.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
