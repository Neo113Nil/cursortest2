package com.yandex.plus.core.graphql.type;

import defpackage.e97;
import defpackage.k4o;
import defpackage.p4o;
import defpackage.scc;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/yandex/plus/core/graphql/type/COMPOSITE_OFFER_STRUCTURE_TYPE;", "", "", "rawValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Companion", "e97", "COMPOSITE", "OPTION", "TARIFF", "UNKNOWN__", "plus-shared-data-graphql-queries_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class COMPOSITE_OFFER_STRUCTURE_TYPE {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ COMPOSITE_OFFER_STRUCTURE_TYPE[] $VALUES;
    public static final COMPOSITE_OFFER_STRUCTURE_TYPE COMPOSITE;
    public static final e97 Companion;
    public static final COMPOSITE_OFFER_STRUCTURE_TYPE OPTION;
    public static final COMPOSITE_OFFER_STRUCTURE_TYPE TARIFF;
    public static final COMPOSITE_OFFER_STRUCTURE_TYPE UNKNOWN__;
    private static final p4o type;
    private final String rawValue;

    static {
        COMPOSITE_OFFER_STRUCTURE_TYPE composite_offer_structure_type = new COMPOSITE_OFFER_STRUCTURE_TYPE("COMPOSITE", 0, "COMPOSITE");
        COMPOSITE = composite_offer_structure_type;
        COMPOSITE_OFFER_STRUCTURE_TYPE composite_offer_structure_type2 = new COMPOSITE_OFFER_STRUCTURE_TYPE("OPTION", 1, "OPTION");
        OPTION = composite_offer_structure_type2;
        COMPOSITE_OFFER_STRUCTURE_TYPE composite_offer_structure_type3 = new COMPOSITE_OFFER_STRUCTURE_TYPE("TARIFF", 2, "TARIFF");
        TARIFF = composite_offer_structure_type3;
        COMPOSITE_OFFER_STRUCTURE_TYPE composite_offer_structure_type4 = new COMPOSITE_OFFER_STRUCTURE_TYPE("UNKNOWN__", 3, "UNKNOWN__");
        UNKNOWN__ = composite_offer_structure_type4;
        COMPOSITE_OFFER_STRUCTURE_TYPE[] composite_offer_structure_typeArr = {composite_offer_structure_type, composite_offer_structure_type2, composite_offer_structure_type3, composite_offer_structure_type4};
        $VALUES = composite_offer_structure_typeArr;
        $ENTRIES = a.a(composite_offer_structure_typeArr);
        Companion = new e97();
        scc.g("COMPOSITE", "OPTION", "TARIFF");
        type = new p4o("COMPOSITE_OFFER_STRUCTURE_TYPE");
    }

    public COMPOSITE_OFFER_STRUCTURE_TYPE(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static COMPOSITE_OFFER_STRUCTURE_TYPE valueOf(String str) {
        return (COMPOSITE_OFFER_STRUCTURE_TYPE) Enum.valueOf(COMPOSITE_OFFER_STRUCTURE_TYPE.class, str);
    }

    public static COMPOSITE_OFFER_STRUCTURE_TYPE[] values() {
        return (COMPOSITE_OFFER_STRUCTURE_TYPE[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getRawValue() {
        return this.rawValue;
    }
}
