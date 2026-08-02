package com.yandex.plus.core.graphql.type;

import defpackage.e3v;
import defpackage.k4o;
import defpackage.p4o;
import defpackage.scc;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/plus/core/graphql/type/INVITE_CANCELLATION_REASON;", "", "", "rawValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Companion", "e3v", "MAX_FAMILY_MEMBERS", "NO_REASONS", "UNKNOWN_REASON", "USER_HAS_NO_FAMILY", "USER_IS_A_FAMILY_CHILD", "USER_REGION_IS_NOT_SUPPORTED", "UNKNOWN__", "plus-shared-data-graphql-queries_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class INVITE_CANCELLATION_REASON {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ INVITE_CANCELLATION_REASON[] $VALUES;
    public static final e3v Companion;
    public static final INVITE_CANCELLATION_REASON MAX_FAMILY_MEMBERS;
    public static final INVITE_CANCELLATION_REASON NO_REASONS;
    public static final INVITE_CANCELLATION_REASON UNKNOWN_REASON;
    public static final INVITE_CANCELLATION_REASON UNKNOWN__;
    public static final INVITE_CANCELLATION_REASON USER_HAS_NO_FAMILY;
    public static final INVITE_CANCELLATION_REASON USER_IS_A_FAMILY_CHILD;
    public static final INVITE_CANCELLATION_REASON USER_REGION_IS_NOT_SUPPORTED;
    private static final p4o type;
    private final String rawValue;

    static {
        INVITE_CANCELLATION_REASON invite_cancellation_reason = new INVITE_CANCELLATION_REASON("MAX_FAMILY_MEMBERS", 0, "MAX_FAMILY_MEMBERS");
        MAX_FAMILY_MEMBERS = invite_cancellation_reason;
        INVITE_CANCELLATION_REASON invite_cancellation_reason2 = new INVITE_CANCELLATION_REASON("NO_REASONS", 1, "NO_REASONS");
        NO_REASONS = invite_cancellation_reason2;
        INVITE_CANCELLATION_REASON invite_cancellation_reason3 = new INVITE_CANCELLATION_REASON("UNKNOWN_REASON", 2, "UNKNOWN_REASON");
        UNKNOWN_REASON = invite_cancellation_reason3;
        INVITE_CANCELLATION_REASON invite_cancellation_reason4 = new INVITE_CANCELLATION_REASON("USER_HAS_NO_FAMILY", 3, "USER_HAS_NO_FAMILY");
        USER_HAS_NO_FAMILY = invite_cancellation_reason4;
        INVITE_CANCELLATION_REASON invite_cancellation_reason5 = new INVITE_CANCELLATION_REASON("USER_IS_A_FAMILY_CHILD", 4, "USER_IS_A_FAMILY_CHILD");
        USER_IS_A_FAMILY_CHILD = invite_cancellation_reason5;
        INVITE_CANCELLATION_REASON invite_cancellation_reason6 = new INVITE_CANCELLATION_REASON("USER_REGION_IS_NOT_SUPPORTED", 5, "USER_REGION_IS_NOT_SUPPORTED");
        USER_REGION_IS_NOT_SUPPORTED = invite_cancellation_reason6;
        INVITE_CANCELLATION_REASON invite_cancellation_reason7 = new INVITE_CANCELLATION_REASON("UNKNOWN__", 6, "UNKNOWN__");
        UNKNOWN__ = invite_cancellation_reason7;
        INVITE_CANCELLATION_REASON[] invite_cancellation_reasonArr = {invite_cancellation_reason, invite_cancellation_reason2, invite_cancellation_reason3, invite_cancellation_reason4, invite_cancellation_reason5, invite_cancellation_reason6, invite_cancellation_reason7};
        $VALUES = invite_cancellation_reasonArr;
        $ENTRIES = a.a(invite_cancellation_reasonArr);
        Companion = new e3v();
        scc.g("MAX_FAMILY_MEMBERS", "NO_REASONS", "UNKNOWN_REASON", "USER_HAS_NO_FAMILY", "USER_IS_A_FAMILY_CHILD", "USER_REGION_IS_NOT_SUPPORTED");
        type = new p4o("INVITE_CANCELLATION_REASON");
    }

    public INVITE_CANCELLATION_REASON(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static INVITE_CANCELLATION_REASON valueOf(String str) {
        return (INVITE_CANCELLATION_REASON) Enum.valueOf(INVITE_CANCELLATION_REASON.class, str);
    }

    public static INVITE_CANCELLATION_REASON[] values() {
        return (INVITE_CANCELLATION_REASON[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getRawValue() {
        return this.rawValue;
    }
}
