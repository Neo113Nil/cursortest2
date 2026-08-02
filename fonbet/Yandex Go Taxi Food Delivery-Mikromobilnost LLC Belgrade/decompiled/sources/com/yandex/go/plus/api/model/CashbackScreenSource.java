package com.yandex.go.plus.api.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/plus/api/model/CashbackScreenSource;", "", "CHARGERS", "SCOOTERS", "SUPER_APP_MAIN", "SUPER_APP_VERTICAL_CARD", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CashbackScreenSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CashbackScreenSource[] $VALUES;
    public static final CashbackScreenSource CHARGERS;
    public static final CashbackScreenSource SCOOTERS;
    public static final CashbackScreenSource SUPER_APP_MAIN;
    public static final CashbackScreenSource SUPER_APP_VERTICAL_CARD;

    static {
        CashbackScreenSource cashbackScreenSource = new CashbackScreenSource("CHARGERS", 0);
        CHARGERS = cashbackScreenSource;
        CashbackScreenSource cashbackScreenSource2 = new CashbackScreenSource("SCOOTERS", 1);
        SCOOTERS = cashbackScreenSource2;
        CashbackScreenSource cashbackScreenSource3 = new CashbackScreenSource("SUPER_APP_MAIN", 2);
        SUPER_APP_MAIN = cashbackScreenSource3;
        CashbackScreenSource cashbackScreenSource4 = new CashbackScreenSource("SUPER_APP_VERTICAL_CARD", 3);
        SUPER_APP_VERTICAL_CARD = cashbackScreenSource4;
        CashbackScreenSource[] cashbackScreenSourceArr = {cashbackScreenSource, cashbackScreenSource2, cashbackScreenSource3, cashbackScreenSource4};
        $VALUES = cashbackScreenSourceArr;
        $ENTRIES = a.a(cashbackScreenSourceArr);
    }

    public static CashbackScreenSource valueOf(String str) {
        return (CashbackScreenSource) Enum.valueOf(CashbackScreenSource.class, str);
    }

    public static CashbackScreenSource[] values() {
        return (CashbackScreenSource[]) $VALUES.clone();
    }
}
