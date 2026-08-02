package com.yandex.messaging.internal.view.timeline;

import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"com/yandex/messaging/internal/view/timeline/MessageImageLoader$GifCompressStrategy", "", "Lcom/yandex/messaging/internal/view/timeline/MessageImageLoader$GifCompressStrategy;", "", "maxGifSizeBytes", "J", "b", "()J", "", "badGifRatio", CA20Status.STATUS_USER_I, "a", "()I", "NOT_LOAD", "TIMELINE", "IMAGE_VIEWER", "ORIGINAL", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MessageImageLoader$GifCompressStrategy {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MessageImageLoader$GifCompressStrategy[] $VALUES;
    public static final MessageImageLoader$GifCompressStrategy IMAGE_VIEWER;
    public static final MessageImageLoader$GifCompressStrategy NOT_LOAD;
    public static final MessageImageLoader$GifCompressStrategy ORIGINAL;
    public static final MessageImageLoader$GifCompressStrategy TIMELINE;
    private final int badGifRatio;
    private final long maxGifSizeBytes;

    static {
        MessageImageLoader$GifCompressStrategy messageImageLoader$GifCompressStrategy = new MessageImageLoader$GifCompressStrategy("NOT_LOAD", 0, 0L, 0);
        NOT_LOAD = messageImageLoader$GifCompressStrategy;
        MessageImageLoader$GifCompressStrategy messageImageLoader$GifCompressStrategy2 = new MessageImageLoader$GifCompressStrategy("TIMELINE", 1, 8388608L, 3);
        TIMELINE = messageImageLoader$GifCompressStrategy2;
        MessageImageLoader$GifCompressStrategy messageImageLoader$GifCompressStrategy3 = new MessageImageLoader$GifCompressStrategy("IMAGE_VIEWER", 2, 67108864L, 100);
        IMAGE_VIEWER = messageImageLoader$GifCompressStrategy3;
        MessageImageLoader$GifCompressStrategy messageImageLoader$GifCompressStrategy4 = new MessageImageLoader$GifCompressStrategy("ORIGINAL", 3, ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED, 1000);
        ORIGINAL = messageImageLoader$GifCompressStrategy4;
        MessageImageLoader$GifCompressStrategy[] messageImageLoader$GifCompressStrategyArr = {messageImageLoader$GifCompressStrategy, messageImageLoader$GifCompressStrategy2, messageImageLoader$GifCompressStrategy3, messageImageLoader$GifCompressStrategy4};
        $VALUES = messageImageLoader$GifCompressStrategyArr;
        $ENTRIES = kotlin.enums.a.a(messageImageLoader$GifCompressStrategyArr);
    }

    public MessageImageLoader$GifCompressStrategy(String str, int i, long j, int i2) {
        this.maxGifSizeBytes = j;
        this.badGifRatio = i2;
    }

    public static MessageImageLoader$GifCompressStrategy valueOf(String str) {
        return (MessageImageLoader$GifCompressStrategy) Enum.valueOf(MessageImageLoader$GifCompressStrategy.class, str);
    }

    public static MessageImageLoader$GifCompressStrategy[] values() {
        return (MessageImageLoader$GifCompressStrategy[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getBadGifRatio() {
        return this.badGifRatio;
    }

    /* renamed from: b, reason: from getter */
    public final long getMaxGifSizeBytes() {
        return this.maxGifSizeBytes;
    }
}
