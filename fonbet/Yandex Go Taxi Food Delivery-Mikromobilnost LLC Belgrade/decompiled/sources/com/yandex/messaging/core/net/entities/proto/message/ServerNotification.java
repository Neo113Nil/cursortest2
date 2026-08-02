package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.xuf0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/ServerNotification;", "", "text", "Lcom/yandex/messaging/core/net/entities/proto/message/ServerNotification$Text;", "chatId", "", "toGuid", "payloadId", "<init>", "(Lcom/yandex/messaging/core/net/entities/proto/message/ServerNotification$Text;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Lcom/yandex/messaging/core/net/entities/proto/message/ServerNotification$Text;", "getChatId", "()Ljava/lang/String;", "getToGuid", "getPayloadId", "timestampMs", "", "getTimestampMs", "()Ljava/lang/Long;", "setTimestampMs", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "Text", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ServerNotification {

    @Json(name = "ChatId")
    @xuf0(tag = 101)
    private final String chatId;

    @Json(name = "PayloadId")
    @xuf0(tag = 103)
    private final String payloadId;

    @Json(name = "Text")
    @xuf0(tag = 1)
    private final Text text;
    private Long timestampMs;

    @Json(name = "ToGuid")
    @xuf0(tag = 102)
    private final String toGuid;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/ServerNotification$Text;", "", "notificationText", "", "<init>", "(Ljava/lang/String;)V", "getNotificationText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Text {

        @xuf0(tag = 1)
        private final String notificationText;

        public Text(@Json(name = "NotificationText") String str) {
            this.notificationText = str;
        }

        public static /* synthetic */ Text copy$default(Text text, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = text.notificationText;
            }
            return text.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getNotificationText() {
            return this.notificationText;
        }

        public final Text copy(@Json(name = "NotificationText") String notificationText) {
            return new Text(notificationText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Text) && jl40.l(this.notificationText, ((Text) other).notificationText);
        }

        public final String getNotificationText() {
            return this.notificationText;
        }

        public int hashCode() {
            return this.notificationText.hashCode();
        }

        public String toString() {
            return oyr.p("Text(notificationText=", this.notificationText, Extension.C_BRAKE);
        }
    }

    public ServerNotification(Text text, String str, String str2, String str3) {
        this.text = text;
        this.chatId = str;
        this.toGuid = str2;
        this.payloadId = str3;
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final String getPayloadId() {
        return this.payloadId;
    }

    public final Text getText() {
        return this.text;
    }

    public final Long getTimestampMs() {
        return this.timestampMs;
    }

    public final String getToGuid() {
        return this.toGuid;
    }

    public final void setTimestampMs(Long l) {
        this.timestampMs = l;
    }
}
