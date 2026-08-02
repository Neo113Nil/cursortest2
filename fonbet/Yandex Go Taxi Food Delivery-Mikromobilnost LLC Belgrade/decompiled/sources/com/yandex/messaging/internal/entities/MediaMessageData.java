package com.yandex.messaging.internal.entities;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yandex/messaging/internal/entities/MediaMessageData;", "Lcom/yandex/messaging/internal/entities/MessageData;", "<init>", "()V", "MessageHandler", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class MediaMessageData extends MessageData {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lcom/yandex/messaging/internal/entities/MediaMessageData$MessageHandler;", "T", "", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface MessageHandler<T> {
        Object a(ImageMessageData imageMessageData);

        Object b(VoiceMessageData voiceMessageData);

        Object c(StickerMessageData stickerMessageData);

        Object d(DivMessageData divMessageData);

        Object e(GalleryMessageData galleryMessageData);

        Object f(VideoMessageData videoMessageData);

        Object g(FileMessageData fileMessageData);
    }

    public abstract Object a(MessageHandler messageHandler);
}
