package defpackage;

import com.yandex.messaging.internal.auth.AuthorizationObservable$AuthState;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class gn3 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AuthorizationObservable$AuthState.values().length];
        try {
            iArr[AuthorizationObservable$AuthState.Syncing.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AuthorizationObservable$AuthState.LimitedAnonymous.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AuthorizationObservable$AuthState.Upgrading.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[AuthorizationObservable$AuthState.LimitedPassport.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[AuthorizationObservable$AuthState.AuthorizedPassport.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
