package defpackage;

import com.yandex.go.account.api.superapp.CookieInjectionEvent;
import com.yandex.go.account.api.superapp.CookieInjectionResult$Failure$Reason;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class cne {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[CookieInjectionEvent.values().length];
        try {
            iArr[CookieInjectionEvent.ALREADY_INJECTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CookieInjectionEvent.UPDATE_STARTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CookieInjectionEvent.UPDATE_FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CookieInjectionEvent.UPDATE_COMPLETED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[CookieInjectionResult$Failure$Reason.values().length];
        try {
            iArr2[CookieInjectionResult$Failure$Reason.MALFORMED_URL.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[CookieInjectionResult$Failure$Reason.UNSUPPORTED_ACCOUNT_TYPE.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[CookieInjectionResult$Failure$Reason.ATTEMPTS_LIMIT_REACHED.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
    }
}
