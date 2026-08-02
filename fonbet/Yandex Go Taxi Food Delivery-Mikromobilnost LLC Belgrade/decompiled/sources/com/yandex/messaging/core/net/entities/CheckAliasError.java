package com.yandex.messaging.core.net.entities;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.k4o;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/messaging/core/net/entities/CheckAliasError;", "", "", AuthSdkActivity.RESPONSE_TYPE_CODE, "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "Companion", "ALIAS_IS_OCCUPIED", "INVALID_ALIAS_FORMAT", "ALIAS_IS_TOO_LONG", "ALIAS_IS_TOO_SHORT", "ALIAS_NUMBER_LIMIT", "UNKNOWN", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CheckAliasError {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CheckAliasError[] $VALUES;
    public static final CheckAliasError ALIAS_IS_OCCUPIED;
    public static final CheckAliasError ALIAS_IS_TOO_LONG;
    public static final CheckAliasError ALIAS_IS_TOO_SHORT;
    public static final CheckAliasError ALIAS_NUMBER_LIMIT;
    public static final CheckAliasError INVALID_ALIAS_FORMAT;
    public static final CheckAliasError UNKNOWN;
    private final String code;

    static {
        CheckAliasError checkAliasError = new CheckAliasError("ALIAS_IS_OCCUPIED", 0, "alias_is_occupied");
        ALIAS_IS_OCCUPIED = checkAliasError;
        CheckAliasError checkAliasError2 = new CheckAliasError("INVALID_ALIAS_FORMAT", 1, "invalid_alias_format");
        INVALID_ALIAS_FORMAT = checkAliasError2;
        CheckAliasError checkAliasError3 = new CheckAliasError("ALIAS_IS_TOO_LONG", 2, "alias_is_too_long");
        ALIAS_IS_TOO_LONG = checkAliasError3;
        CheckAliasError checkAliasError4 = new CheckAliasError("ALIAS_IS_TOO_SHORT", 3, "alias_is_too_short");
        ALIAS_IS_TOO_SHORT = checkAliasError4;
        CheckAliasError checkAliasError5 = new CheckAliasError("ALIAS_NUMBER_LIMIT", 4, "alias_number_limit");
        ALIAS_NUMBER_LIMIT = checkAliasError5;
        CheckAliasError checkAliasError6 = new CheckAliasError("UNKNOWN", 5, "unknown");
        UNKNOWN = checkAliasError6;
        CheckAliasError[] checkAliasErrorArr = {checkAliasError, checkAliasError2, checkAliasError3, checkAliasError4, checkAliasError5, checkAliasError6};
        $VALUES = checkAliasErrorArr;
        $ENTRIES = a.a(checkAliasErrorArr);
        INSTANCE = new Companion();
    }

    public CheckAliasError(String str, int i, String str2) {
        this.code = str2;
    }

    public static CheckAliasError valueOf(String str) {
        return (CheckAliasError) Enum.valueOf(CheckAliasError.class, str);
    }

    public static CheckAliasError[] values() {
        return (CheckAliasError[]) $VALUES.clone();
    }
}
