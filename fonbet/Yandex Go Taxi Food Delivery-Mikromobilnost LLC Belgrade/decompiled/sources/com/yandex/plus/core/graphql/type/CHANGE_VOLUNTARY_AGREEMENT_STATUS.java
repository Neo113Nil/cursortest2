package com.yandex.plus.core.graphql.type;

import defpackage.e87;
import defpackage.k4o;
import defpackage.p4o;
import defpackage.scc;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/plus/core/graphql/type/CHANGE_VOLUNTARY_AGREEMENT_STATUS;", "", "", "rawValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Companion", "e87", "failed", "success", "UNKNOWN__", "plus-shared-data-graphql-queries_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CHANGE_VOLUNTARY_AGREEMENT_STATUS {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CHANGE_VOLUNTARY_AGREEMENT_STATUS[] $VALUES;
    public static final e87 Companion;
    public static final CHANGE_VOLUNTARY_AGREEMENT_STATUS UNKNOWN__;
    public static final CHANGE_VOLUNTARY_AGREEMENT_STATUS failed;
    public static final CHANGE_VOLUNTARY_AGREEMENT_STATUS success;
    private static final p4o type;
    private final String rawValue;

    static {
        CHANGE_VOLUNTARY_AGREEMENT_STATUS change_voluntary_agreement_status = new CHANGE_VOLUNTARY_AGREEMENT_STATUS("failed", 0, "failed");
        failed = change_voluntary_agreement_status;
        CHANGE_VOLUNTARY_AGREEMENT_STATUS change_voluntary_agreement_status2 = new CHANGE_VOLUNTARY_AGREEMENT_STATUS("success", 1, "success");
        success = change_voluntary_agreement_status2;
        CHANGE_VOLUNTARY_AGREEMENT_STATUS change_voluntary_agreement_status3 = new CHANGE_VOLUNTARY_AGREEMENT_STATUS("UNKNOWN__", 2, "UNKNOWN__");
        UNKNOWN__ = change_voluntary_agreement_status3;
        CHANGE_VOLUNTARY_AGREEMENT_STATUS[] change_voluntary_agreement_statusArr = {change_voluntary_agreement_status, change_voluntary_agreement_status2, change_voluntary_agreement_status3};
        $VALUES = change_voluntary_agreement_statusArr;
        $ENTRIES = a.a(change_voluntary_agreement_statusArr);
        Companion = new e87();
        scc.g("failed", "success");
        type = new p4o("CHANGE_VOLUNTARY_AGREEMENT_STATUS");
    }

    public CHANGE_VOLUNTARY_AGREEMENT_STATUS(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static CHANGE_VOLUNTARY_AGREEMENT_STATUS valueOf(String str) {
        return (CHANGE_VOLUNTARY_AGREEMENT_STATUS) Enum.valueOf(CHANGE_VOLUNTARY_AGREEMENT_STATUS.class, str);
    }

    public static CHANGE_VOLUNTARY_AGREEMENT_STATUS[] values() {
        return (CHANGE_VOLUNTARY_AGREEMENT_STATUS[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getRawValue() {
        return this.rawValue;
    }
}
