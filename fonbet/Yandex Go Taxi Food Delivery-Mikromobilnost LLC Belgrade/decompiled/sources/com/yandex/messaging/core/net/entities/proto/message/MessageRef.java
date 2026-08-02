package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.Json;
import defpackage.cex;
import defpackage.xuf0;

/* loaded from: classes15.dex */
public final class MessageRef {

    @cex
    @Json(name = "ChatId")
    @xuf0(tag = 1)
    public String chatId;

    @Json(name = "Timestamp")
    @xuf0(tag = 2)
    public long timestamp;

    public static MessageRef a(long j, String str) {
        MessageRef messageRef = new MessageRef();
        messageRef.chatId = str;
        messageRef.timestamp = j;
        return messageRef;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof MessageRef) {
            MessageRef messageRef = (MessageRef) obj;
            if (messageRef.chatId.equals(this.chatId) && messageRef.timestamp == this.timestamp) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.timestamp;
        return this.chatId.hashCode() ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "messageRef chatId:" + this.chatId + " ts: " + this.timestamp;
    }
}
