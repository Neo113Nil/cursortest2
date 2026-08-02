package defpackage;

import com.yandex.go.walking.navigation.impl.guidance.interactor.FocusAction;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class p341 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[FocusAction.values().length];
        try {
            iArr[FocusAction.FOCUS_USER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FocusAction.FOCUS_ROUTE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
