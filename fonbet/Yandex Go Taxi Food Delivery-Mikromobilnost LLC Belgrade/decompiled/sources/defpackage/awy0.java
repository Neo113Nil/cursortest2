package defpackage;

import com.yandex.messaging.auth.AuthTheme;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class awy0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AuthTheme.values().length];
        try {
            iArr[AuthTheme.Light.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AuthTheme.Dark.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AuthTheme.LightCustom.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[AuthTheme.FollowSystem.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
