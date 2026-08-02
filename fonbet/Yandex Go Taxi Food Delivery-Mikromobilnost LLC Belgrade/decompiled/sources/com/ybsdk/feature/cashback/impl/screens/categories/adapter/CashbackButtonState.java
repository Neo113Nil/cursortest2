package com.ybsdk.feature.cashback.impl.screens.categories.adapter;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/cashback/impl/screens/categories/adapter/CashbackButtonState;", "", "<init>", "(Ljava/lang/String;I)V", "DISABLED", "ENABLED", "feature-cashback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CashbackButtonState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CashbackButtonState[] $VALUES;
    public static final CashbackButtonState DISABLED = new CashbackButtonState("DISABLED", 0);
    public static final CashbackButtonState ENABLED = new CashbackButtonState("ENABLED", 1);

    private static final /* synthetic */ CashbackButtonState[] $values() {
        return new CashbackButtonState[]{DISABLED, ENABLED};
    }

    static {
        CashbackButtonState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private CashbackButtonState(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static CashbackButtonState valueOf(String str) {
        return (CashbackButtonState) Enum.valueOf(CashbackButtonState.class, str);
    }

    public static CashbackButtonState[] values() {
        return (CashbackButtonState[]) $VALUES.clone();
    }
}
