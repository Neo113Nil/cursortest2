package defpackage;

import com.yandex.go.app.icon.api.AppIcon;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class o5h {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AppIcon.values().length];
        try {
            iArr[AppIcon.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AppIcon.CUSTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
