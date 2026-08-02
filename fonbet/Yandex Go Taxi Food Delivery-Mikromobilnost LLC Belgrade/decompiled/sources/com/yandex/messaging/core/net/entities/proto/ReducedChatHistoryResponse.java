package com.yandex.messaging.core.net.entities.proto;

import com.squareup.moshi.Json;
import com.yandex.messaging.core.net.entities.proto.message.ThreadState;
import com.yandex.messaging.core.net.entities.proto.message.Translation;
import com.yandex.messaging.core.net.entities.proto.message.TranslationMessage;
import defpackage.cex;
import defpackage.xuf0;

/* loaded from: classes15.dex */
public class ReducedChatHistoryResponse {

    @cex
    @Json(name = "ChatId")
    @xuf0(tag = 1)
    public String chatId;

    @Json(name = "Messages")
    @xuf0(tag = 2)
    public ReducedOutMessage[] messages;

    public static class ReducedClientMessage {

        @Json(name = "Plain")
        @xuf0(tag = 4)
        public ReducedPlainMessage plain;

        @Json(name = "TranslationMessage")
        @xuf0(tag = 25)
        public TranslationMessage translationMessage;
    }

    public static class ReducedForwardedMessageInfo {

        @Json(name = "Payload")
        @xuf0(tag = 1)
        public ReducedPlainMessage plain;

        @cex
        @Json(name = "ServerMessageInfo")
        @xuf0(tag = 3)
        public ReducedServerMessageInfo serverMessageInfo;
    }

    public static class ReducedOutMessage {

        @cex
        @Json(name = "ServerMessage")
        @xuf0(tag = 101)
        public ReducedServerMessage serverMessage;
    }

    public static class ReducedPlainMessage {

        @cex
        @Json(name = "ChatId")
        @xuf0(tag = 101)
        public String chatId;
    }

    public static class ReducedServerMessageInfo {

        @Json(name = "ForwardCount")
        @xuf0(tag = 14)
        public long forwardCount;

        @Json(name = "SupportedEvents")
        @xuf0(tag = 28)
        public ChatEventTypes supportedEvents;

        @Json(name = "ThreadState")
        @xuf0(tag = 17)
        public ThreadState threadState;

        @Json(name = "Timestamp")
        @xuf0(tag = 1)
        public long timestamp;

        @Json(name = "Translation")
        @xuf0(tag = 18)
        public Translation translation;

        @Json(name = "Version")
        @xuf0(tag = 5)
        public long version;

        @Json(name = "Views")
        @xuf0(tag = 11)
        public long views;
    }
}
