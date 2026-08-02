package com.yandex.go.overdraft.api.domain.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/overdraft/api/domain/model/OverdraftContext;", "", "SUMMARY", "MAIN_SCREEN", "ACTIVE_ORDER", "ORDER_PAY_CASH", "ORDER_WITH_DEBT", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OverdraftContext {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OverdraftContext[] $VALUES;
    public static final OverdraftContext ACTIVE_ORDER;
    public static final OverdraftContext MAIN_SCREEN;
    public static final OverdraftContext ORDER_PAY_CASH;
    public static final OverdraftContext ORDER_WITH_DEBT;
    public static final OverdraftContext SUMMARY;

    static {
        OverdraftContext overdraftContext = new OverdraftContext("SUMMARY", 0);
        SUMMARY = overdraftContext;
        OverdraftContext overdraftContext2 = new OverdraftContext("MAIN_SCREEN", 1);
        MAIN_SCREEN = overdraftContext2;
        OverdraftContext overdraftContext3 = new OverdraftContext("ACTIVE_ORDER", 2);
        ACTIVE_ORDER = overdraftContext3;
        OverdraftContext overdraftContext4 = new OverdraftContext("ORDER_PAY_CASH", 3);
        ORDER_PAY_CASH = overdraftContext4;
        OverdraftContext overdraftContext5 = new OverdraftContext("ORDER_WITH_DEBT", 4);
        ORDER_WITH_DEBT = overdraftContext5;
        OverdraftContext[] overdraftContextArr = {overdraftContext, overdraftContext2, overdraftContext3, overdraftContext4, overdraftContext5};
        $VALUES = overdraftContextArr;
        $ENTRIES = a.a(overdraftContextArr);
    }

    public static OverdraftContext valueOf(String str) {
        return (OverdraftContext) Enum.valueOf(OverdraftContext.class, str);
    }

    public static OverdraftContext[] values() {
        return (OverdraftContext[]) $VALUES.clone();
    }
}
