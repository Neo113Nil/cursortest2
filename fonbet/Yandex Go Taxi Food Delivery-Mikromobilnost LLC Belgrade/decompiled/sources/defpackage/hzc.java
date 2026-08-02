package defpackage;

import com.yandex.go.navigator.complete_route.CancelMode;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class hzc {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CancelMode.values().length];
        try {
            iArr[CancelMode.CANCEL_COMPLETION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CancelMode.KEEP_NAVIGATOR_IN_BACKGROUND.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
