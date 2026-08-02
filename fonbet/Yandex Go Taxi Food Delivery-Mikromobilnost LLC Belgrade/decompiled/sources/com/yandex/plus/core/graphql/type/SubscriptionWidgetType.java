package com.yandex.plus.core.graphql.type;

import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import defpackage.k4o;
import defpackage.p4o;
import defpackage.scc;
import defpackage.w1v0;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/plus/core/graphql/type/SubscriptionWidgetType;", "", "", "rawValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Companion", "w1v0", "acquisitionPlatform", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, "nativeWidget", "webWidget", "UNKNOWN__", "plus-shared-data-graphql-queries_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SubscriptionWidgetType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SubscriptionWidgetType[] $VALUES;
    public static final w1v0 Companion;
    public static final SubscriptionWidgetType UNKNOWN__;
    public static final SubscriptionWidgetType acquisitionPlatform;
    public static final SubscriptionWidgetType host;
    public static final SubscriptionWidgetType nativeWidget;
    private static final p4o type;
    public static final SubscriptionWidgetType webWidget;
    private final String rawValue;

    static {
        SubscriptionWidgetType subscriptionWidgetType = new SubscriptionWidgetType("acquisitionPlatform", 0, "acquisitionPlatform");
        acquisitionPlatform = subscriptionWidgetType;
        SubscriptionWidgetType subscriptionWidgetType2 = new SubscriptionWidgetType(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, 1, URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST);
        host = subscriptionWidgetType2;
        SubscriptionWidgetType subscriptionWidgetType3 = new SubscriptionWidgetType("nativeWidget", 2, "nativeWidget");
        nativeWidget = subscriptionWidgetType3;
        SubscriptionWidgetType subscriptionWidgetType4 = new SubscriptionWidgetType("webWidget", 3, "webWidget");
        webWidget = subscriptionWidgetType4;
        SubscriptionWidgetType subscriptionWidgetType5 = new SubscriptionWidgetType("UNKNOWN__", 4, "UNKNOWN__");
        UNKNOWN__ = subscriptionWidgetType5;
        SubscriptionWidgetType[] subscriptionWidgetTypeArr = {subscriptionWidgetType, subscriptionWidgetType2, subscriptionWidgetType3, subscriptionWidgetType4, subscriptionWidgetType5};
        $VALUES = subscriptionWidgetTypeArr;
        $ENTRIES = a.a(subscriptionWidgetTypeArr);
        Companion = new w1v0();
        scc.g("acquisitionPlatform", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, "nativeWidget", "webWidget");
        type = new p4o("SubscriptionWidgetType");
    }

    public SubscriptionWidgetType(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static SubscriptionWidgetType valueOf(String str) {
        return (SubscriptionWidgetType) Enum.valueOf(SubscriptionWidgetType.class, str);
    }

    public static SubscriptionWidgetType[] values() {
        return (SubscriptionWidgetType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getRawValue() {
        return this.rawValue;
    }
}
