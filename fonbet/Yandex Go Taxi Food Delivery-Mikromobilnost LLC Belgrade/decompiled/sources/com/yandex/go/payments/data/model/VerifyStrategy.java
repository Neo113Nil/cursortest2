package com.yandex.go.payments.data.model;

import defpackage.b931;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.x931;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/payments/data/model/VerifyStrategy;", "", "Companion", "x931", "ANTIFRAUD", "STANDARD", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class VerifyStrategy {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ VerifyStrategy[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final VerifyStrategy ANTIFRAUD;
    public static final x931 Companion;
    public static final VerifyStrategy STANDARD;

    static {
        VerifyStrategy verifyStrategy = new VerifyStrategy("ANTIFRAUD", 0);
        ANTIFRAUD = verifyStrategy;
        VerifyStrategy verifyStrategy2 = new VerifyStrategy("STANDARD", 1);
        STANDARD = verifyStrategy2;
        VerifyStrategy[] verifyStrategyArr = {verifyStrategy, verifyStrategy2};
        $VALUES = verifyStrategyArr;
        $ENTRIES = kotlin.enums.a.a(verifyStrategyArr);
        Companion = new x931();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new b931(4));
    }

    public static VerifyStrategy valueOf(String str) {
        return (VerifyStrategy) Enum.valueOf(VerifyStrategy.class, str);
    }

    public static VerifyStrategy[] values() {
        return (VerifyStrategy[]) $VALUES.clone();
    }
}
