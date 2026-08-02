package com.yandex.plus.core.graphql.type;

import defpackage.k4o;
import defpackage.p4o;
import defpackage.q490;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/plus/core/graphql/type/PLAQUE_SEEN_STATUS;", "", "", "rawValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Companion", "q490", "OK", "UNKNOWN__", "plus-shared-data-graphql-queries_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PLAQUE_SEEN_STATUS {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PLAQUE_SEEN_STATUS[] $VALUES;
    public static final q490 Companion;
    public static final PLAQUE_SEEN_STATUS OK;
    public static final PLAQUE_SEEN_STATUS UNKNOWN__;
    private static final p4o type;
    private final String rawValue;

    static {
        PLAQUE_SEEN_STATUS plaque_seen_status = new PLAQUE_SEEN_STATUS("OK", 0, "OK");
        OK = plaque_seen_status;
        PLAQUE_SEEN_STATUS plaque_seen_status2 = new PLAQUE_SEEN_STATUS("UNKNOWN__", 1, "UNKNOWN__");
        UNKNOWN__ = plaque_seen_status2;
        PLAQUE_SEEN_STATUS[] plaque_seen_statusArr = {plaque_seen_status, plaque_seen_status2};
        $VALUES = plaque_seen_statusArr;
        $ENTRIES = a.a(plaque_seen_statusArr);
        Companion = new q490();
        Collections.singletonList("OK");
        type = new p4o("PLAQUE_SEEN_STATUS");
    }

    public PLAQUE_SEEN_STATUS(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static PLAQUE_SEEN_STATUS valueOf(String str) {
        return (PLAQUE_SEEN_STATUS) Enum.valueOf(PLAQUE_SEEN_STATUS.class, str);
    }

    public static PLAQUE_SEEN_STATUS[] values() {
        return (PLAQUE_SEEN_STATUS[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getRawValue() {
        return this.rawValue;
    }
}
