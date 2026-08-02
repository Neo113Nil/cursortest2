package com.ybsdk.core.utils;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\u000b\u0010\nj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"com/ybsdk/core/utils/NumberFormatUtils$Currencies", "", "Lcom/ybsdk/core/utils/NumberFormatUtils$Currencies;", "", "iso", "symbol", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getIso", "()Ljava/lang/String;", "getSymbol", "RUB", "USD", "EUR", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class NumberFormatUtils$Currencies {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NumberFormatUtils$Currencies[] $VALUES;
    private final String iso;
    private final String symbol;
    public static final NumberFormatUtils$Currencies RUB = new NumberFormatUtils$Currencies("RUB", 0, "RUB", "₽");
    public static final NumberFormatUtils$Currencies USD = new NumberFormatUtils$Currencies("USD", 1, "USD", "$");
    public static final NumberFormatUtils$Currencies EUR = new NumberFormatUtils$Currencies("EUR", 2, "EUR", "€");

    private static final /* synthetic */ NumberFormatUtils$Currencies[] $values() {
        return new NumberFormatUtils$Currencies[]{RUB, USD, EUR};
    }

    static {
        NumberFormatUtils$Currencies[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private NumberFormatUtils$Currencies(String str, int i, String str2, String str3) {
        this.iso = str2;
        this.symbol = str3;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static NumberFormatUtils$Currencies valueOf(String str) {
        return (NumberFormatUtils$Currencies) Enum.valueOf(NumberFormatUtils$Currencies.class, str);
    }

    public static NumberFormatUtils$Currencies[] values() {
        return (NumberFormatUtils$Currencies[]) $VALUES.clone();
    }

    public final String getIso() {
        return this.iso;
    }

    public final String getSymbol() {
        return this.symbol;
    }
}
