package com.yandex.fintechsdk.data.auth.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/fintechsdk/data/auth/api/TokenSource;", "", "", "analyticsValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "HOST_PASSPORT", "PASSPORT", "LOGIN_SDK", "api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TokenSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TokenSource[] $VALUES;
    public static final TokenSource HOST_PASSPORT;
    public static final TokenSource LOGIN_SDK;
    public static final TokenSource PASSPORT;
    private final String analyticsValue;

    static {
        TokenSource tokenSource = new TokenSource("HOST_PASSPORT", 0, "HOST_PASSPORT");
        HOST_PASSPORT = tokenSource;
        TokenSource tokenSource2 = new TokenSource("PASSPORT", 1, "PASSPORT");
        PASSPORT = tokenSource2;
        TokenSource tokenSource3 = new TokenSource("LOGIN_SDK", 2, "LOGIN_SDK");
        LOGIN_SDK = tokenSource3;
        TokenSource[] tokenSourceArr = {tokenSource, tokenSource2, tokenSource3};
        $VALUES = tokenSourceArr;
        $ENTRIES = a.a(tokenSourceArr);
    }

    public TokenSource(String str, int i, String str2) {
        this.analyticsValue = str2;
    }

    public static TokenSource valueOf(String str) {
        return (TokenSource) Enum.valueOf(TokenSource.class, str);
    }

    public static TokenSource[] values() {
        return (TokenSource[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getAnalyticsValue() {
        return this.analyticsValue;
    }
}
