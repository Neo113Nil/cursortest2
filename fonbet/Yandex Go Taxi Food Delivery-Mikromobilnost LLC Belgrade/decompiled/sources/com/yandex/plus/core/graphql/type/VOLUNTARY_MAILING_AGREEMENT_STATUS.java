package com.yandex.plus.core.graphql.type;

import defpackage.k4o;
import defpackage.p4o;
import defpackage.scc;
import defpackage.sy21;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/plus/core/graphql/type/VOLUNTARY_MAILING_AGREEMENT_STATUS;", "", "", "rawValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Companion", "sy21", "ALLOW", "REFUSE", "UNKNOWN__", "plus-shared-data-graphql-queries_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VOLUNTARY_MAILING_AGREEMENT_STATUS {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ VOLUNTARY_MAILING_AGREEMENT_STATUS[] $VALUES;
    public static final VOLUNTARY_MAILING_AGREEMENT_STATUS ALLOW;
    public static final sy21 Companion;
    public static final VOLUNTARY_MAILING_AGREEMENT_STATUS REFUSE;
    public static final VOLUNTARY_MAILING_AGREEMENT_STATUS UNKNOWN__;
    private static final p4o type;
    private final String rawValue;

    static {
        VOLUNTARY_MAILING_AGREEMENT_STATUS voluntary_mailing_agreement_status = new VOLUNTARY_MAILING_AGREEMENT_STATUS("ALLOW", 0, "ALLOW");
        ALLOW = voluntary_mailing_agreement_status;
        VOLUNTARY_MAILING_AGREEMENT_STATUS voluntary_mailing_agreement_status2 = new VOLUNTARY_MAILING_AGREEMENT_STATUS("REFUSE", 1, "REFUSE");
        REFUSE = voluntary_mailing_agreement_status2;
        VOLUNTARY_MAILING_AGREEMENT_STATUS voluntary_mailing_agreement_status3 = new VOLUNTARY_MAILING_AGREEMENT_STATUS("UNKNOWN__", 2, "UNKNOWN__");
        UNKNOWN__ = voluntary_mailing_agreement_status3;
        VOLUNTARY_MAILING_AGREEMENT_STATUS[] voluntary_mailing_agreement_statusArr = {voluntary_mailing_agreement_status, voluntary_mailing_agreement_status2, voluntary_mailing_agreement_status3};
        $VALUES = voluntary_mailing_agreement_statusArr;
        $ENTRIES = a.a(voluntary_mailing_agreement_statusArr);
        Companion = new sy21();
        scc.g("ALLOW", "REFUSE");
        type = new p4o("VOLUNTARY_MAILING_AGREEMENT_STATUS");
    }

    public VOLUNTARY_MAILING_AGREEMENT_STATUS(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static VOLUNTARY_MAILING_AGREEMENT_STATUS valueOf(String str) {
        return (VOLUNTARY_MAILING_AGREEMENT_STATUS) Enum.valueOf(VOLUNTARY_MAILING_AGREEMENT_STATUS.class, str);
    }

    public static VOLUNTARY_MAILING_AGREEMENT_STATUS[] values() {
        return (VOLUNTARY_MAILING_AGREEMENT_STATUS[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getRawValue() {
        return this.rawValue;
    }
}
