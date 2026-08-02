package com.yandex.plus.core.graphql.type;

import defpackage.k4o;
import defpackage.p4o;
import defpackage.ry21;
import defpackage.scc;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/plus/core/graphql/type/VOLUNTARY_AGREEMENT_TEXT_LOGIC;", "", "", "rawValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Companion", "ry21", "DIRECT", "INVERTED", "UNKNOWN__", "plus-shared-data-graphql-queries_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VOLUNTARY_AGREEMENT_TEXT_LOGIC {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ VOLUNTARY_AGREEMENT_TEXT_LOGIC[] $VALUES;
    public static final ry21 Companion;
    public static final VOLUNTARY_AGREEMENT_TEXT_LOGIC DIRECT;
    public static final VOLUNTARY_AGREEMENT_TEXT_LOGIC INVERTED;
    public static final VOLUNTARY_AGREEMENT_TEXT_LOGIC UNKNOWN__;
    private static final p4o type;
    private final String rawValue;

    static {
        VOLUNTARY_AGREEMENT_TEXT_LOGIC voluntary_agreement_text_logic = new VOLUNTARY_AGREEMENT_TEXT_LOGIC("DIRECT", 0, "DIRECT");
        DIRECT = voluntary_agreement_text_logic;
        VOLUNTARY_AGREEMENT_TEXT_LOGIC voluntary_agreement_text_logic2 = new VOLUNTARY_AGREEMENT_TEXT_LOGIC("INVERTED", 1, "INVERTED");
        INVERTED = voluntary_agreement_text_logic2;
        VOLUNTARY_AGREEMENT_TEXT_LOGIC voluntary_agreement_text_logic3 = new VOLUNTARY_AGREEMENT_TEXT_LOGIC("UNKNOWN__", 2, "UNKNOWN__");
        UNKNOWN__ = voluntary_agreement_text_logic3;
        VOLUNTARY_AGREEMENT_TEXT_LOGIC[] voluntary_agreement_text_logicArr = {voluntary_agreement_text_logic, voluntary_agreement_text_logic2, voluntary_agreement_text_logic3};
        $VALUES = voluntary_agreement_text_logicArr;
        $ENTRIES = a.a(voluntary_agreement_text_logicArr);
        Companion = new ry21();
        scc.g("DIRECT", "INVERTED");
        type = new p4o("VOLUNTARY_AGREEMENT_TEXT_LOGIC");
    }

    public VOLUNTARY_AGREEMENT_TEXT_LOGIC(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static VOLUNTARY_AGREEMENT_TEXT_LOGIC valueOf(String str) {
        return (VOLUNTARY_AGREEMENT_TEXT_LOGIC) Enum.valueOf(VOLUNTARY_AGREEMENT_TEXT_LOGIC.class, str);
    }

    public static VOLUNTARY_AGREEMENT_TEXT_LOGIC[] values() {
        return (VOLUNTARY_AGREEMENT_TEXT_LOGIC[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getRawValue() {
        return this.rawValue;
    }
}
