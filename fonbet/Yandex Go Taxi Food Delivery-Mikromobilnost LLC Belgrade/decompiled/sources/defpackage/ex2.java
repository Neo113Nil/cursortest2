package defpackage;

import com.yandex.go.settings.presentation.models.AppSettingsTransitionMode;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class ex2 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AppSettingsTransitionMode.values().length];
        try {
            iArr[AppSettingsTransitionMode.Forward.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AppSettingsTransitionMode.Reverse.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AppSettingsTransitionMode.None.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
