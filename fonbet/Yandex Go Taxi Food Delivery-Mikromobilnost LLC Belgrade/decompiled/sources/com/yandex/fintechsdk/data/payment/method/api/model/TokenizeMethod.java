package com.yandex.fintechsdk.data.payment.method.api.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/fintechsdk/data/payment/method/api/model/TokenizeMethod;", "", "CARD", "api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TokenizeMethod {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TokenizeMethod[] $VALUES;
    public static final TokenizeMethod CARD;

    static {
        TokenizeMethod tokenizeMethod = new TokenizeMethod("CARD", 0);
        CARD = tokenizeMethod;
        TokenizeMethod[] tokenizeMethodArr = {tokenizeMethod};
        $VALUES = tokenizeMethodArr;
        $ENTRIES = a.a(tokenizeMethodArr);
    }

    public static TokenizeMethod valueOf(String str) {
        return (TokenizeMethod) Enum.valueOf(TokenizeMethod.class, str);
    }

    public static TokenizeMethod[] values() {
        return (TokenizeMethod[]) $VALUES.clone();
    }
}
