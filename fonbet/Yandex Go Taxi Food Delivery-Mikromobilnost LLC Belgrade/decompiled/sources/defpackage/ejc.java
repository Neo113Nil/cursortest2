package defpackage;

import com.yandex.plus.webview.internal.security.CombinedWebViewRequestSecurityChecker$Strategy;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class ejc {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CombinedWebViewRequestSecurityChecker$Strategy.values().length];
        try {
            iArr[CombinedWebViewRequestSecurityChecker$Strategy.ALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CombinedWebViewRequestSecurityChecker$Strategy.ANY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
