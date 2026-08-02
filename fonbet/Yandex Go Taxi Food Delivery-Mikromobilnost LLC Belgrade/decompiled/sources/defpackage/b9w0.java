package defpackage;

import com.yandex.go.account.api.superapp.CookieInjectionEvent;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class b9w0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CookieInjectionEvent.values().length];
        try {
            iArr[CookieInjectionEvent.UPDATE_STARTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CookieInjectionEvent.UPDATE_COMPLETED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CookieInjectionEvent.UPDATE_FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CookieInjectionEvent.ALREADY_INJECTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
