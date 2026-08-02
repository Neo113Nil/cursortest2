package com.yandex.plus.core.graphql.type;

import defpackage.f0v0;
import defpackage.k4o;
import defpackage.p4o;
import defpackage.scc;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/plus/core/graphql/type/SubscriptionButtonType;", "", "", "rawValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Companion", "f0v0", "native", "web", "UNKNOWN__", "plus-shared-data-graphql-queries_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SubscriptionButtonType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SubscriptionButtonType[] $VALUES;
    public static final f0v0 Companion;
    public static final SubscriptionButtonType UNKNOWN__;

    /* renamed from: native, reason: not valid java name */
    public static final SubscriptionButtonType f20native;
    private static final p4o type;
    public static final SubscriptionButtonType web;
    private final String rawValue;

    static {
        SubscriptionButtonType subscriptionButtonType = new SubscriptionButtonType("native", 0, "native");
        f20native = subscriptionButtonType;
        SubscriptionButtonType subscriptionButtonType2 = new SubscriptionButtonType("web", 1, "web");
        web = subscriptionButtonType2;
        SubscriptionButtonType subscriptionButtonType3 = new SubscriptionButtonType("UNKNOWN__", 2, "UNKNOWN__");
        UNKNOWN__ = subscriptionButtonType3;
        SubscriptionButtonType[] subscriptionButtonTypeArr = {subscriptionButtonType, subscriptionButtonType2, subscriptionButtonType3};
        $VALUES = subscriptionButtonTypeArr;
        $ENTRIES = a.a(subscriptionButtonTypeArr);
        Companion = new f0v0();
        scc.g("native", "web");
        type = new p4o("SubscriptionButtonType");
    }

    public SubscriptionButtonType(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static SubscriptionButtonType valueOf(String str) {
        return (SubscriptionButtonType) Enum.valueOf(SubscriptionButtonType.class, str);
    }

    public static SubscriptionButtonType[] values() {
        return (SubscriptionButtonType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getRawValue() {
        return this.rawValue;
    }
}
