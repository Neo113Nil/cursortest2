package com.yandex.plus.core.graphql.type;

import defpackage.f3v;
import defpackage.k4o;
import defpackage.p4o;
import defpackage.scc;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/plus/core/graphql/type/INVOICE_STATUS;", "", "", "rawValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Companion", "f3v", "CANCELLED", "CREATED", "CREATED_LEGACY", "FAILED", "PROVISION_SCHEDULED", "SCHEDULED", "STARTED", "SUCCESS", "WAIT_FOR_3DS", "WAIT_FOR_NOTIFICATION", "WAIT_FOR_SBP", "WAIT_FOR_UZUM", "UNKNOWN__", "plus-shared-data-graphql-queries_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class INVOICE_STATUS {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ INVOICE_STATUS[] $VALUES;
    public static final INVOICE_STATUS CANCELLED;
    public static final INVOICE_STATUS CREATED;
    public static final INVOICE_STATUS CREATED_LEGACY;
    public static final f3v Companion;
    public static final INVOICE_STATUS FAILED;
    public static final INVOICE_STATUS PROVISION_SCHEDULED;
    public static final INVOICE_STATUS SCHEDULED;
    public static final INVOICE_STATUS STARTED;
    public static final INVOICE_STATUS SUCCESS;
    public static final INVOICE_STATUS UNKNOWN__;
    public static final INVOICE_STATUS WAIT_FOR_3DS;
    public static final INVOICE_STATUS WAIT_FOR_NOTIFICATION;
    public static final INVOICE_STATUS WAIT_FOR_SBP;
    public static final INVOICE_STATUS WAIT_FOR_UZUM;
    private static final p4o type;
    private final String rawValue;

    static {
        INVOICE_STATUS invoice_status = new INVOICE_STATUS("CANCELLED", 0, "CANCELLED");
        CANCELLED = invoice_status;
        INVOICE_STATUS invoice_status2 = new INVOICE_STATUS("CREATED", 1, "CREATED");
        CREATED = invoice_status2;
        INVOICE_STATUS invoice_status3 = new INVOICE_STATUS("CREATED_LEGACY", 2, "CREATED_LEGACY");
        CREATED_LEGACY = invoice_status3;
        INVOICE_STATUS invoice_status4 = new INVOICE_STATUS("FAILED", 3, "FAILED");
        FAILED = invoice_status4;
        INVOICE_STATUS invoice_status5 = new INVOICE_STATUS("PROVISION_SCHEDULED", 4, "PROVISION_SCHEDULED");
        PROVISION_SCHEDULED = invoice_status5;
        INVOICE_STATUS invoice_status6 = new INVOICE_STATUS("SCHEDULED", 5, "SCHEDULED");
        SCHEDULED = invoice_status6;
        INVOICE_STATUS invoice_status7 = new INVOICE_STATUS("STARTED", 6, "STARTED");
        STARTED = invoice_status7;
        INVOICE_STATUS invoice_status8 = new INVOICE_STATUS("SUCCESS", 7, "SUCCESS");
        SUCCESS = invoice_status8;
        INVOICE_STATUS invoice_status9 = new INVOICE_STATUS("WAIT_FOR_3DS", 8, "WAIT_FOR_3DS");
        WAIT_FOR_3DS = invoice_status9;
        INVOICE_STATUS invoice_status10 = new INVOICE_STATUS("WAIT_FOR_NOTIFICATION", 9, "WAIT_FOR_NOTIFICATION");
        WAIT_FOR_NOTIFICATION = invoice_status10;
        INVOICE_STATUS invoice_status11 = new INVOICE_STATUS("WAIT_FOR_SBP", 10, "WAIT_FOR_SBP");
        WAIT_FOR_SBP = invoice_status11;
        INVOICE_STATUS invoice_status12 = new INVOICE_STATUS("WAIT_FOR_UZUM", 11, "WAIT_FOR_UZUM");
        WAIT_FOR_UZUM = invoice_status12;
        INVOICE_STATUS invoice_status13 = new INVOICE_STATUS("UNKNOWN__", 12, "UNKNOWN__");
        UNKNOWN__ = invoice_status13;
        INVOICE_STATUS[] invoice_statusArr = {invoice_status, invoice_status2, invoice_status3, invoice_status4, invoice_status5, invoice_status6, invoice_status7, invoice_status8, invoice_status9, invoice_status10, invoice_status11, invoice_status12, invoice_status13};
        $VALUES = invoice_statusArr;
        $ENTRIES = a.a(invoice_statusArr);
        Companion = new f3v();
        scc.g("CANCELLED", "CREATED", "CREATED_LEGACY", "FAILED", "PROVISION_SCHEDULED", "SCHEDULED", "STARTED", "SUCCESS", "WAIT_FOR_3DS", "WAIT_FOR_NOTIFICATION", "WAIT_FOR_SBP", "WAIT_FOR_UZUM");
        type = new p4o("INVOICE_STATUS");
    }

    public INVOICE_STATUS(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static INVOICE_STATUS valueOf(String str) {
        return (INVOICE_STATUS) Enum.valueOf(INVOICE_STATUS.class, str);
    }

    public static INVOICE_STATUS[] values() {
        return (INVOICE_STATUS[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getRawValue() {
        return this.rawValue;
    }
}
