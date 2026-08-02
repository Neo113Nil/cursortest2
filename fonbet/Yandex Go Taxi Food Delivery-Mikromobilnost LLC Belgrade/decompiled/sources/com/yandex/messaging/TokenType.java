package com.yandex.messaging;

import defpackage.k4o;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/messaging/TokenType;", "", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Fcm", "Hms", "RuStore", "messaging-core-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TokenType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TokenType[] $VALUES;
    public static final TokenType Fcm;
    public static final TokenType Hms;
    public static final TokenType RuStore;
    private final String value;

    static {
        TokenType tokenType = new TokenType("Fcm", 0, ConstantDeviceInfo.APP_PLATFORM);
        Fcm = tokenType;
        TokenType tokenType2 = new TokenType("Hms", 1, "android_hms");
        Hms = tokenType2;
        TokenType tokenType3 = new TokenType("RuStore", 2, "android_rustore");
        RuStore = tokenType3;
        TokenType[] tokenTypeArr = {tokenType, tokenType2, tokenType3};
        $VALUES = tokenTypeArr;
        $ENTRIES = kotlin.enums.a.a(tokenTypeArr);
    }

    public TokenType(String str, int i, String str2) {
        this.value = str2;
    }

    public static TokenType valueOf(String str) {
        return (TokenType) Enum.valueOf(TokenType.class, str);
    }

    public static TokenType[] values() {
        return (TokenType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
