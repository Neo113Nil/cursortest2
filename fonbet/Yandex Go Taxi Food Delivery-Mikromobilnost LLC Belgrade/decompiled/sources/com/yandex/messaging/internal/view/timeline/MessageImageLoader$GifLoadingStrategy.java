package com.yandex.messaging.internal.view.timeline;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/messaging/internal/view/timeline/MessageImageLoader$GifLoadingStrategy", "", "Lcom/yandex/messaging/internal/view/timeline/MessageImageLoader$GifLoadingStrategy;", "NEVER", "ONLY_TINY", "ALL", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MessageImageLoader$GifLoadingStrategy {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MessageImageLoader$GifLoadingStrategy[] $VALUES;
    public static final MessageImageLoader$GifLoadingStrategy ALL;
    public static final MessageImageLoader$GifLoadingStrategy NEVER;
    public static final MessageImageLoader$GifLoadingStrategy ONLY_TINY;

    static {
        MessageImageLoader$GifLoadingStrategy messageImageLoader$GifLoadingStrategy = new MessageImageLoader$GifLoadingStrategy("NEVER", 0);
        NEVER = messageImageLoader$GifLoadingStrategy;
        MessageImageLoader$GifLoadingStrategy messageImageLoader$GifLoadingStrategy2 = new MessageImageLoader$GifLoadingStrategy("ONLY_TINY", 1);
        ONLY_TINY = messageImageLoader$GifLoadingStrategy2;
        MessageImageLoader$GifLoadingStrategy messageImageLoader$GifLoadingStrategy3 = new MessageImageLoader$GifLoadingStrategy("ALL", 2);
        ALL = messageImageLoader$GifLoadingStrategy3;
        MessageImageLoader$GifLoadingStrategy[] messageImageLoader$GifLoadingStrategyArr = {messageImageLoader$GifLoadingStrategy, messageImageLoader$GifLoadingStrategy2, messageImageLoader$GifLoadingStrategy3};
        $VALUES = messageImageLoader$GifLoadingStrategyArr;
        $ENTRIES = kotlin.enums.a.a(messageImageLoader$GifLoadingStrategyArr);
    }

    public static MessageImageLoader$GifLoadingStrategy valueOf(String str) {
        return (MessageImageLoader$GifLoadingStrategy) Enum.valueOf(MessageImageLoader$GifLoadingStrategy.class, str);
    }

    public static MessageImageLoader$GifLoadingStrategy[] values() {
        return (MessageImageLoader$GifLoadingStrategy[]) $VALUES.clone();
    }
}
