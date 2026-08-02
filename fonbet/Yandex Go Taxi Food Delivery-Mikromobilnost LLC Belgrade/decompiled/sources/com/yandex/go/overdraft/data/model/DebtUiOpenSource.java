package com.yandex.go.overdraft.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.iug;
import defpackage.k4o;
import defpackage.rsf;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/overdraft/data/model/DebtUiOpenSource;", "", "Companion", "iug", "SUMMARY", "MAIN_SCREEN", "ORDER_BUTTON", "ACTIVE_ORDER", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DebtUiOpenSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DebtUiOpenSource[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final DebtUiOpenSource ACTIVE_ORDER;
    public static final iug Companion;
    public static final DebtUiOpenSource MAIN_SCREEN;
    public static final DebtUiOpenSource ORDER_BUTTON;
    public static final DebtUiOpenSource SUMMARY;
    public static final DebtUiOpenSource UNKNOWN;

    static {
        DebtUiOpenSource debtUiOpenSource = new DebtUiOpenSource("SUMMARY", 0);
        SUMMARY = debtUiOpenSource;
        DebtUiOpenSource debtUiOpenSource2 = new DebtUiOpenSource("MAIN_SCREEN", 1);
        MAIN_SCREEN = debtUiOpenSource2;
        DebtUiOpenSource debtUiOpenSource3 = new DebtUiOpenSource("ORDER_BUTTON", 2);
        ORDER_BUTTON = debtUiOpenSource3;
        DebtUiOpenSource debtUiOpenSource4 = new DebtUiOpenSource("ACTIVE_ORDER", 3);
        ACTIVE_ORDER = debtUiOpenSource4;
        DebtUiOpenSource debtUiOpenSource5 = new DebtUiOpenSource("UNKNOWN", 4);
        UNKNOWN = debtUiOpenSource5;
        DebtUiOpenSource[] debtUiOpenSourceArr = {debtUiOpenSource, debtUiOpenSource2, debtUiOpenSource3, debtUiOpenSource4, debtUiOpenSource5};
        $VALUES = debtUiOpenSourceArr;
        $ENTRIES = kotlin.enums.a.a(debtUiOpenSourceArr);
        Companion = new iug();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new rsf(27));
    }

    public static DebtUiOpenSource valueOf(String str) {
        return (DebtUiOpenSource) Enum.valueOf(DebtUiOpenSource.class, str);
    }

    public static DebtUiOpenSource[] values() {
        return (DebtUiOpenSource[]) $VALUES.clone();
    }
}
