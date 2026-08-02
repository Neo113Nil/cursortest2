package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.messaging.core.net.entities.MessengerSupportContext;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.xuf0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J3\u0010 \u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0005HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R \u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006&"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/ChatOpen;", "", "chatId", "", "type", "", "clientInfo", "Lcom/yandex/messaging/core/net/entities/proto/message/ClientInfo;", "context", "Lcom/yandex/messaging/core/net/entities/MessengerSupportContext;", "<init>", "(Ljava/lang/String;ILcom/yandex/messaging/core/net/entities/proto/message/ClientInfo;Lcom/yandex/messaging/core/net/entities/MessengerSupportContext;)V", "getChatId", "()Ljava/lang/String;", "setChatId", "(Ljava/lang/String;)V", "getType", "()I", "setType", "(I)V", "getClientInfo", "()Lcom/yandex/messaging/core/net/entities/proto/message/ClientInfo;", "setClientInfo", "(Lcom/yandex/messaging/core/net/entities/proto/message/ClientInfo;)V", "getContext", "()Lcom/yandex/messaging/core/net/entities/MessengerSupportContext;", "setContext", "(Lcom/yandex/messaging/core/net/entities/MessengerSupportContext;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ChatOpen {

    @xuf0(tag = 1)
    private String chatId;

    @xuf0(tag = 3)
    private ClientInfo clientInfo;

    @xuf0(tag = 4)
    private MessengerSupportContext context;

    @xuf0(tag = 2)
    private int type;

    public ChatOpen(@Json(name = "ChatId") String str, @Json(name = "Type") int i, @Json(name = "ClientInfo") ClientInfo clientInfo, @Json(name = "Context") MessengerSupportContext messengerSupportContext) {
        this.chatId = str;
        this.type = i;
        this.clientInfo = clientInfo;
        this.context = messengerSupportContext;
    }

    public static /* synthetic */ ChatOpen copy$default(ChatOpen chatOpen, String str, int i, ClientInfo clientInfo, MessengerSupportContext messengerSupportContext, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = chatOpen.chatId;
        }
        if ((i2 & 2) != 0) {
            i = chatOpen.type;
        }
        if ((i2 & 4) != 0) {
            clientInfo = chatOpen.clientInfo;
        }
        if ((i2 & 8) != 0) {
            messengerSupportContext = chatOpen.context;
        }
        return chatOpen.copy(str, i, clientInfo, messengerSupportContext);
    }

    /* renamed from: component1, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final ClientInfo getClientInfo() {
        return this.clientInfo;
    }

    /* renamed from: component4, reason: from getter */
    public final MessengerSupportContext getContext() {
        return this.context;
    }

    public final ChatOpen copy(@Json(name = "ChatId") String chatId, @Json(name = "Type") int type, @Json(name = "ClientInfo") ClientInfo clientInfo, @Json(name = "Context") MessengerSupportContext context) {
        return new ChatOpen(chatId, type, clientInfo, context);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatOpen)) {
            return false;
        }
        ChatOpen chatOpen = (ChatOpen) other;
        return jl40.l(this.chatId, chatOpen.chatId) && this.type == chatOpen.type && jl40.l(this.clientInfo, chatOpen.clientInfo) && jl40.l(this.context, chatOpen.context);
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final ClientInfo getClientInfo() {
        return this.clientInfo;
    }

    public final MessengerSupportContext getContext() {
        return this.context;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = (this.clientInfo.hashCode() + oyr.b(this.type, this.chatId.hashCode() * 31, 31)) * 31;
        MessengerSupportContext messengerSupportContext = this.context;
        return hashCode + (messengerSupportContext == null ? 0 : messengerSupportContext.hashCode());
    }

    public final void setChatId(String str) {
        this.chatId = str;
    }

    public final void setClientInfo(ClientInfo clientInfo) {
        this.clientInfo = clientInfo;
    }

    public final void setContext(MessengerSupportContext messengerSupportContext) {
        this.context = messengerSupportContext;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public String toString() {
        String str = this.chatId;
        int i = this.type;
        ClientInfo clientInfo = this.clientInfo;
        MessengerSupportContext messengerSupportContext = this.context;
        StringBuilder u = b64.u(i, "ChatOpen(chatId=", str, ", type=", ", clientInfo=");
        u.append(clientInfo);
        u.append(", context=");
        u.append(messengerSupportContext);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
