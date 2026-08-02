package defpackage;

import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.webview.newtab.NewTabPolicy;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class e660 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[NewTabPolicy.values().length];
        try {
            iArr[NewTabPolicy.Disabled.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NewTabPolicy.CustomTabs.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[NewTabPolicy.ExternalBrowser.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
