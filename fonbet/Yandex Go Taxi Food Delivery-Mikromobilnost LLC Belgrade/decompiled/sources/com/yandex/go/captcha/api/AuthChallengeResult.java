package com.yandex.go.captcha.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/captcha/api/AuthChallengeResult;", "", "Success", "Failure", "AlreadyDone", "go-client-android.features.captcha:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AuthChallengeResult {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AuthChallengeResult[] $VALUES;
    public static final AuthChallengeResult AlreadyDone;
    public static final AuthChallengeResult Failure;
    public static final AuthChallengeResult Success;

    static {
        AuthChallengeResult authChallengeResult = new AuthChallengeResult("Success", 0);
        Success = authChallengeResult;
        AuthChallengeResult authChallengeResult2 = new AuthChallengeResult("Failure", 1);
        Failure = authChallengeResult2;
        AuthChallengeResult authChallengeResult3 = new AuthChallengeResult("AlreadyDone", 2);
        AlreadyDone = authChallengeResult3;
        AuthChallengeResult[] authChallengeResultArr = {authChallengeResult, authChallengeResult2, authChallengeResult3};
        $VALUES = authChallengeResultArr;
        $ENTRIES = a.a(authChallengeResultArr);
    }

    public static AuthChallengeResult valueOf(String str) {
        return (AuthChallengeResult) Enum.valueOf(AuthChallengeResult.class, str);
    }

    public static AuthChallengeResult[] values() {
        return (AuthChallengeResult[]) $VALUES.clone();
    }
}
