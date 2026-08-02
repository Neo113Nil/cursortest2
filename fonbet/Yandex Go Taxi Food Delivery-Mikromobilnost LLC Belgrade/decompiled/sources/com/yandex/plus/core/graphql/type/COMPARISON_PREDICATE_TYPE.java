package com.yandex.plus.core.graphql.type;

import com.samsung.android.sdk.samsungpay.v2.card.AddCardInfo;
import defpackage.d97;
import defpackage.k4o;
import defpackage.p4o;
import defpackage.scc;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/yandex/plus/core/graphql/type/COMPARISON_PREDICATE_TYPE;", "", "", "rawValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Companion", "d97", "EQ", AddCardInfo.PROVIDER_GEMALTO, "GTE", "LT", "LTE", "UNKNOWN__", "plus-shared-data-graphql-queries_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class COMPARISON_PREDICATE_TYPE {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ COMPARISON_PREDICATE_TYPE[] $VALUES;
    public static final d97 Companion;
    public static final COMPARISON_PREDICATE_TYPE EQ;
    public static final COMPARISON_PREDICATE_TYPE GT;
    public static final COMPARISON_PREDICATE_TYPE GTE;
    public static final COMPARISON_PREDICATE_TYPE LT;
    public static final COMPARISON_PREDICATE_TYPE LTE;
    public static final COMPARISON_PREDICATE_TYPE UNKNOWN__;
    private static final p4o type;
    private final String rawValue;

    static {
        COMPARISON_PREDICATE_TYPE comparison_predicate_type = new COMPARISON_PREDICATE_TYPE("EQ", 0, "EQ");
        EQ = comparison_predicate_type;
        COMPARISON_PREDICATE_TYPE comparison_predicate_type2 = new COMPARISON_PREDICATE_TYPE(AddCardInfo.PROVIDER_GEMALTO, 1, AddCardInfo.PROVIDER_GEMALTO);
        GT = comparison_predicate_type2;
        COMPARISON_PREDICATE_TYPE comparison_predicate_type3 = new COMPARISON_PREDICATE_TYPE("GTE", 2, "GTE");
        GTE = comparison_predicate_type3;
        COMPARISON_PREDICATE_TYPE comparison_predicate_type4 = new COMPARISON_PREDICATE_TYPE("LT", 3, "LT");
        LT = comparison_predicate_type4;
        COMPARISON_PREDICATE_TYPE comparison_predicate_type5 = new COMPARISON_PREDICATE_TYPE("LTE", 4, "LTE");
        LTE = comparison_predicate_type5;
        COMPARISON_PREDICATE_TYPE comparison_predicate_type6 = new COMPARISON_PREDICATE_TYPE("UNKNOWN__", 5, "UNKNOWN__");
        UNKNOWN__ = comparison_predicate_type6;
        COMPARISON_PREDICATE_TYPE[] comparison_predicate_typeArr = {comparison_predicate_type, comparison_predicate_type2, comparison_predicate_type3, comparison_predicate_type4, comparison_predicate_type5, comparison_predicate_type6};
        $VALUES = comparison_predicate_typeArr;
        $ENTRIES = a.a(comparison_predicate_typeArr);
        Companion = new d97();
        scc.g("EQ", AddCardInfo.PROVIDER_GEMALTO, "GTE", "LT", "LTE");
        type = new p4o("COMPARISON_PREDICATE_TYPE");
    }

    public COMPARISON_PREDICATE_TYPE(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static COMPARISON_PREDICATE_TYPE valueOf(String str) {
        return (COMPARISON_PREDICATE_TYPE) Enum.valueOf(COMPARISON_PREDICATE_TYPE.class, str);
    }

    public static COMPARISON_PREDICATE_TYPE[] values() {
        return (COMPARISON_PREDICATE_TYPE[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getRawValue() {
        return this.rawValue;
    }
}
