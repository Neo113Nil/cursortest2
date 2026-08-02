package com.yandex.go.address.models.add;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/address/models/add/BackNavigationStrategy;", "", JCP.RAW_PREFIX, "ORDER_DETAILS", "SUGGESTS", "go-client-android.features.address.dto:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BackNavigationStrategy {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BackNavigationStrategy[] $VALUES;
    public static final BackNavigationStrategy NONE;
    public static final BackNavigationStrategy ORDER_DETAILS;
    public static final BackNavigationStrategy SUGGESTS;

    static {
        BackNavigationStrategy backNavigationStrategy = new BackNavigationStrategy(JCP.RAW_PREFIX, 0);
        NONE = backNavigationStrategy;
        BackNavigationStrategy backNavigationStrategy2 = new BackNavigationStrategy("ORDER_DETAILS", 1);
        ORDER_DETAILS = backNavigationStrategy2;
        BackNavigationStrategy backNavigationStrategy3 = new BackNavigationStrategy("SUGGESTS", 2);
        SUGGESTS = backNavigationStrategy3;
        BackNavigationStrategy[] backNavigationStrategyArr = {backNavigationStrategy, backNavigationStrategy2, backNavigationStrategy3};
        $VALUES = backNavigationStrategyArr;
        $ENTRIES = a.a(backNavigationStrategyArr);
    }

    public static BackNavigationStrategy valueOf(String str) {
        return (BackNavigationStrategy) Enum.valueOf(BackNavigationStrategy.class, str);
    }

    public static BackNavigationStrategy[] values() {
        return (BackNavigationStrategy[]) $VALUES.clone();
    }
}
