package com.ybsdk.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/network/dto/ChatMetadata;", "", "ticketSubject", "", "newMessages", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getTicketSubject", "()Ljava/lang/String;", "getNewMessages", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/ybsdk/network/dto/ChatMetadata;", "equals", "", "other", "hashCode", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ChatMetadata {
    private final Integer newMessages;
    private final String ticketSubject;

    public ChatMetadata(@Json(name = "ticket_subject") String str, @Json(name = "new_messages") Integer num) {
        this.ticketSubject = str;
        this.newMessages = num;
    }

    public static /* synthetic */ ChatMetadata copy$default(ChatMetadata chatMetadata, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatMetadata.ticketSubject;
        }
        if ((i & 2) != 0) {
            num = chatMetadata.newMessages;
        }
        return chatMetadata.copy(str, num);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTicketSubject() {
        return this.ticketSubject;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getNewMessages() {
        return this.newMessages;
    }

    public final ChatMetadata copy(@Json(name = "ticket_subject") String ticketSubject, @Json(name = "new_messages") Integer newMessages) {
        return new ChatMetadata(ticketSubject, newMessages);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatMetadata)) {
            return false;
        }
        ChatMetadata chatMetadata = (ChatMetadata) other;
        return jl40.l(this.ticketSubject, chatMetadata.ticketSubject) && jl40.l(this.newMessages, chatMetadata.newMessages);
    }

    public final Integer getNewMessages() {
        return this.newMessages;
    }

    public final String getTicketSubject() {
        return this.ticketSubject;
    }

    public int hashCode() {
        String str = this.ticketSubject;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.newMessages;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "ChatMetadata(ticketSubject=" + this.ticketSubject + ", newMessages=" + this.newMessages + Extension.C_BRAKE;
    }
}
