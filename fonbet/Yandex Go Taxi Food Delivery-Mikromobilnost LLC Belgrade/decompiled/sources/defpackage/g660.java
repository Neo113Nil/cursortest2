package defpackage;

import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.webview.model.AllowNewTabType;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class g660 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AllowNewTabType.values().length];
        try {
            iArr[AllowNewTabType.BROWSER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AllowNewTabType.SYSTEM_TAB.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AllowNewTabType.INPLACE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
