package com.yandex.plus.core.graphql.type;

import defpackage.hrs;
import defpackage.k4o;
import defpackage.p4o;
import defpackage.scc;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/plus/core/graphql/type/GOOGLE_OFFER_REPLACE_STRATEGY;", "", "", "rawValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Companion", "hrs", "CHARGE_FULL_PRICE", "DEFERRED", "UNKNOWN__", "plus-shared-data-graphql-queries_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GOOGLE_OFFER_REPLACE_STRATEGY {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ GOOGLE_OFFER_REPLACE_STRATEGY[] $VALUES;
    public static final GOOGLE_OFFER_REPLACE_STRATEGY CHARGE_FULL_PRICE;
    public static final hrs Companion;
    public static final GOOGLE_OFFER_REPLACE_STRATEGY DEFERRED;
    public static final GOOGLE_OFFER_REPLACE_STRATEGY UNKNOWN__;
    private static final p4o type;
    private final String rawValue;

    static {
        GOOGLE_OFFER_REPLACE_STRATEGY google_offer_replace_strategy = new GOOGLE_OFFER_REPLACE_STRATEGY("CHARGE_FULL_PRICE", 0, "CHARGE_FULL_PRICE");
        CHARGE_FULL_PRICE = google_offer_replace_strategy;
        GOOGLE_OFFER_REPLACE_STRATEGY google_offer_replace_strategy2 = new GOOGLE_OFFER_REPLACE_STRATEGY("DEFERRED", 1, "DEFERRED");
        DEFERRED = google_offer_replace_strategy2;
        GOOGLE_OFFER_REPLACE_STRATEGY google_offer_replace_strategy3 = new GOOGLE_OFFER_REPLACE_STRATEGY("UNKNOWN__", 2, "UNKNOWN__");
        UNKNOWN__ = google_offer_replace_strategy3;
        GOOGLE_OFFER_REPLACE_STRATEGY[] google_offer_replace_strategyArr = {google_offer_replace_strategy, google_offer_replace_strategy2, google_offer_replace_strategy3};
        $VALUES = google_offer_replace_strategyArr;
        $ENTRIES = a.a(google_offer_replace_strategyArr);
        Companion = new hrs();
        scc.g("CHARGE_FULL_PRICE", "DEFERRED");
        type = new p4o("GOOGLE_OFFER_REPLACE_STRATEGY");
    }

    public GOOGLE_OFFER_REPLACE_STRATEGY(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static GOOGLE_OFFER_REPLACE_STRATEGY valueOf(String str) {
        return (GOOGLE_OFFER_REPLACE_STRATEGY) Enum.valueOf(GOOGLE_OFFER_REPLACE_STRATEGY.class, str);
    }

    public static GOOGLE_OFFER_REPLACE_STRATEGY[] values() {
        return (GOOGLE_OFFER_REPLACE_STRATEGY[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getRawValue() {
        return this.rawValue;
    }
}
