package com.yandex.go.feed_common.analytics.image_loading;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/go/feed_common/analytics/image_loading/FeedImageLoadErrorType;", "", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "TIMEOUT", "NETWORK", "CANCELLED", "SERVER_ERROR", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FeedImageLoadErrorType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FeedImageLoadErrorType[] $VALUES;
    public static final FeedImageLoadErrorType CANCELLED;
    public static final FeedImageLoadErrorType NETWORK;
    public static final FeedImageLoadErrorType SERVER_ERROR;
    public static final FeedImageLoadErrorType TIMEOUT;
    public static final FeedImageLoadErrorType UNKNOWN;
    private final String value;

    static {
        FeedImageLoadErrorType feedImageLoadErrorType = new FeedImageLoadErrorType("TIMEOUT", 0, "timeout");
        TIMEOUT = feedImageLoadErrorType;
        FeedImageLoadErrorType feedImageLoadErrorType2 = new FeedImageLoadErrorType("NETWORK", 1, "network");
        NETWORK = feedImageLoadErrorType2;
        FeedImageLoadErrorType feedImageLoadErrorType3 = new FeedImageLoadErrorType("CANCELLED", 2, "cancelled");
        CANCELLED = feedImageLoadErrorType3;
        FeedImageLoadErrorType feedImageLoadErrorType4 = new FeedImageLoadErrorType("SERVER_ERROR", 3, "server_error");
        SERVER_ERROR = feedImageLoadErrorType4;
        FeedImageLoadErrorType feedImageLoadErrorType5 = new FeedImageLoadErrorType("UNKNOWN", 4, "unknown");
        UNKNOWN = feedImageLoadErrorType5;
        FeedImageLoadErrorType[] feedImageLoadErrorTypeArr = {feedImageLoadErrorType, feedImageLoadErrorType2, feedImageLoadErrorType3, feedImageLoadErrorType4, feedImageLoadErrorType5};
        $VALUES = feedImageLoadErrorTypeArr;
        $ENTRIES = a.a(feedImageLoadErrorTypeArr);
    }

    public FeedImageLoadErrorType(String str, int i, String str2) {
        this.value = str2;
    }

    public static FeedImageLoadErrorType valueOf(String str) {
        return (FeedImageLoadErrorType) Enum.valueOf(FeedImageLoadErrorType.class, str);
    }

    public static FeedImageLoadErrorType[] values() {
        return (FeedImageLoadErrorType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
