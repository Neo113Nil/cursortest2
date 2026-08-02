package com.yandex.plus.core.graphql.type;

import defpackage.k4o;
import defpackage.l1v0;
import defpackage.p4o;
import defpackage.scc;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/plus/core/graphql/type/SubscriptionPaymentMethod;", "", "", "rawValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Companion", "l1v0", "inApp", "trust", "UNKNOWN__", "plus-shared-data-graphql-queries_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SubscriptionPaymentMethod {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SubscriptionPaymentMethod[] $VALUES;
    public static final l1v0 Companion;
    public static final SubscriptionPaymentMethod UNKNOWN__;
    public static final SubscriptionPaymentMethod inApp;
    public static final SubscriptionPaymentMethod trust;
    private static final p4o type;
    private final String rawValue;

    static {
        SubscriptionPaymentMethod subscriptionPaymentMethod = new SubscriptionPaymentMethod("inApp", 0, "inApp");
        inApp = subscriptionPaymentMethod;
        SubscriptionPaymentMethod subscriptionPaymentMethod2 = new SubscriptionPaymentMethod("trust", 1, "trust");
        trust = subscriptionPaymentMethod2;
        SubscriptionPaymentMethod subscriptionPaymentMethod3 = new SubscriptionPaymentMethod("UNKNOWN__", 2, "UNKNOWN__");
        UNKNOWN__ = subscriptionPaymentMethod3;
        SubscriptionPaymentMethod[] subscriptionPaymentMethodArr = {subscriptionPaymentMethod, subscriptionPaymentMethod2, subscriptionPaymentMethod3};
        $VALUES = subscriptionPaymentMethodArr;
        $ENTRIES = a.a(subscriptionPaymentMethodArr);
        Companion = new l1v0();
        scc.g("inApp", "trust");
        type = new p4o("SubscriptionPaymentMethod");
    }

    public SubscriptionPaymentMethod(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static SubscriptionPaymentMethod valueOf(String str) {
        return (SubscriptionPaymentMethod) Enum.valueOf(SubscriptionPaymentMethod.class, str);
    }

    public static SubscriptionPaymentMethod[] values() {
        return (SubscriptionPaymentMethod[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getRawValue() {
        return this.rawValue;
    }
}
