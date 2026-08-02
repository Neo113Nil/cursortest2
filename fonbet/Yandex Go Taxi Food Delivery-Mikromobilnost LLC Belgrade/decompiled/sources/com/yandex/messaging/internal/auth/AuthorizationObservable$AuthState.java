package com.yandex.messaging.internal.auth;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"com/yandex/messaging/internal/auth/AuthorizationObservable$AuthState", "", "Lcom/yandex/messaging/internal/auth/AuthorizationObservable$AuthState;", "", "reportName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "", "transient", "Z", "getTransient", "()Z", "Syncing", "LimitedAnonymous", "Upgrading", "LimitedPassport", "AuthorizedPassport", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AuthorizationObservable$AuthState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AuthorizationObservable$AuthState[] $VALUES;
    public static final AuthorizationObservable$AuthState AuthorizedPassport;
    public static final AuthorizationObservable$AuthState LimitedAnonymous;
    public static final AuthorizationObservable$AuthState LimitedPassport;
    public static final AuthorizationObservable$AuthState Syncing;
    public static final AuthorizationObservable$AuthState Upgrading;
    private final String reportName;
    private final boolean transient;

    static {
        AuthorizationObservable$AuthState authorizationObservable$AuthState = new AuthorizationObservable$AuthState("Syncing", 0, "syncing", true);
        Syncing = authorizationObservable$AuthState;
        AuthorizationObservable$AuthState authorizationObservable$AuthState2 = new AuthorizationObservable$AuthState("LimitedAnonymous", 1, "l", false);
        LimitedAnonymous = authorizationObservable$AuthState2;
        AuthorizationObservable$AuthState authorizationObservable$AuthState3 = new AuthorizationObservable$AuthState("Upgrading", 2, "upgradingToPassport", true);
        Upgrading = authorizationObservable$AuthState3;
        AuthorizationObservable$AuthState authorizationObservable$AuthState4 = new AuthorizationObservable$AuthState("LimitedPassport", 3, "lu", false);
        LimitedPassport = authorizationObservable$AuthState4;
        AuthorizationObservable$AuthState authorizationObservable$AuthState5 = new AuthorizationObservable$AuthState("AuthorizedPassport", 4, "u", false);
        AuthorizedPassport = authorizationObservable$AuthState5;
        AuthorizationObservable$AuthState[] authorizationObservable$AuthStateArr = {authorizationObservable$AuthState, authorizationObservable$AuthState2, authorizationObservable$AuthState3, authorizationObservable$AuthState4, authorizationObservable$AuthState5};
        $VALUES = authorizationObservable$AuthStateArr;
        $ENTRIES = a.a(authorizationObservable$AuthStateArr);
    }

    public AuthorizationObservable$AuthState(String str, int i, String str2, boolean z) {
        this.reportName = str2;
        this.transient = z;
    }

    public static AuthorizationObservable$AuthState valueOf(String str) {
        return (AuthorizationObservable$AuthState) Enum.valueOf(AuthorizationObservable$AuthState.class, str);
    }

    public static AuthorizationObservable$AuthState[] values() {
        return (AuthorizationObservable$AuthState[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getReportName() {
        return this.reportName;
    }
}
