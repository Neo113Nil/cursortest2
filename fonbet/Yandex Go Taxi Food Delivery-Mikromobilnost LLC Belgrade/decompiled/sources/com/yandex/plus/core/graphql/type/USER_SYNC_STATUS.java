package com.yandex.plus.core.graphql.type;

import defpackage.k4o;
import defpackage.or11;
import defpackage.p4o;
import defpackage.scc;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/plus/core/graphql/type/USER_SYNC_STATUS;", "", "", "rawValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Companion", "or11", "SYNCHRONIZATION_IN_PROGRESS", "SYNCHRONIZED", "UNKNOWN__", "plus-shared-data-graphql-queries_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class USER_SYNC_STATUS {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ USER_SYNC_STATUS[] $VALUES;
    public static final or11 Companion;
    public static final USER_SYNC_STATUS SYNCHRONIZATION_IN_PROGRESS;
    public static final USER_SYNC_STATUS SYNCHRONIZED;
    public static final USER_SYNC_STATUS UNKNOWN__;
    private static final p4o type;
    private final String rawValue;

    static {
        USER_SYNC_STATUS user_sync_status = new USER_SYNC_STATUS("SYNCHRONIZATION_IN_PROGRESS", 0, "SYNCHRONIZATION_IN_PROGRESS");
        SYNCHRONIZATION_IN_PROGRESS = user_sync_status;
        USER_SYNC_STATUS user_sync_status2 = new USER_SYNC_STATUS("SYNCHRONIZED", 1, "SYNCHRONIZED");
        SYNCHRONIZED = user_sync_status2;
        USER_SYNC_STATUS user_sync_status3 = new USER_SYNC_STATUS("UNKNOWN__", 2, "UNKNOWN__");
        UNKNOWN__ = user_sync_status3;
        USER_SYNC_STATUS[] user_sync_statusArr = {user_sync_status, user_sync_status2, user_sync_status3};
        $VALUES = user_sync_statusArr;
        $ENTRIES = a.a(user_sync_statusArr);
        Companion = new or11();
        scc.g("SYNCHRONIZATION_IN_PROGRESS", "SYNCHRONIZED");
        type = new p4o("USER_SYNC_STATUS");
    }

    public USER_SYNC_STATUS(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static USER_SYNC_STATUS valueOf(String str) {
        return (USER_SYNC_STATUS) Enum.valueOf(USER_SYNC_STATUS.class, str);
    }

    public static USER_SYNC_STATUS[] values() {
        return (USER_SYNC_STATUS[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getRawValue() {
        return this.rawValue;
    }
}
