package defpackage;

import ru.yandex.taxi.am.SupportedPushPlatform;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class io90 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SupportedPushPlatform.values().length];
        try {
            iArr[SupportedPushPlatform.FCM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SupportedPushPlatform.HMS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
