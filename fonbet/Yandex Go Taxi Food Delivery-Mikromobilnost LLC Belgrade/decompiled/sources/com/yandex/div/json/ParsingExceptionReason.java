package com.yandex.div.json;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/div/json/ParsingExceptionReason;", "", "MISSING_TEMPLATE", "MISSING_VALUE", "MISSING_VARIABLE", "TYPE_MISMATCH", "INVALID_VALUE", "DEPENDENCY_FAILED", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ParsingExceptionReason {
    private static final /* synthetic */ ParsingExceptionReason[] $VALUES;
    public static final ParsingExceptionReason DEPENDENCY_FAILED;
    public static final ParsingExceptionReason INVALID_VALUE;
    public static final ParsingExceptionReason MISSING_TEMPLATE;
    public static final ParsingExceptionReason MISSING_VALUE;
    public static final ParsingExceptionReason MISSING_VARIABLE;
    public static final ParsingExceptionReason TYPE_MISMATCH;

    static {
        ParsingExceptionReason parsingExceptionReason = new ParsingExceptionReason("MISSING_TEMPLATE", 0);
        MISSING_TEMPLATE = parsingExceptionReason;
        ParsingExceptionReason parsingExceptionReason2 = new ParsingExceptionReason("MISSING_VALUE", 1);
        MISSING_VALUE = parsingExceptionReason2;
        ParsingExceptionReason parsingExceptionReason3 = new ParsingExceptionReason("MISSING_VARIABLE", 2);
        MISSING_VARIABLE = parsingExceptionReason3;
        ParsingExceptionReason parsingExceptionReason4 = new ParsingExceptionReason("TYPE_MISMATCH", 3);
        TYPE_MISMATCH = parsingExceptionReason4;
        ParsingExceptionReason parsingExceptionReason5 = new ParsingExceptionReason("INVALID_VALUE", 4);
        INVALID_VALUE = parsingExceptionReason5;
        ParsingExceptionReason parsingExceptionReason6 = new ParsingExceptionReason("DEPENDENCY_FAILED", 5);
        DEPENDENCY_FAILED = parsingExceptionReason6;
        $VALUES = new ParsingExceptionReason[]{parsingExceptionReason, parsingExceptionReason2, parsingExceptionReason3, parsingExceptionReason4, parsingExceptionReason5, parsingExceptionReason6};
    }

    public static ParsingExceptionReason valueOf(String str) {
        return (ParsingExceptionReason) Enum.valueOf(ParsingExceptionReason.class, str);
    }

    public static ParsingExceptionReason[] values() {
        return (ParsingExceptionReason[]) $VALUES.clone();
    }
}
