package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.unr0;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.common.clid.ClidProvider;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\fHÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, d2 = {"Lcom/yandex/messaging/core/net/entities/UrlPreviewMessageDto;", "", "chat", "Lcom/yandex/messaging/core/net/entities/UrlPreviewChatDto;", "text", "", ClidProvider.TIMESTAMP, "", "mentionedUsers", "", "Lcom/yandex/messaging/core/net/entities/MentionedUserDto;", "user", "Lcom/yandex/messaging/core/net/entities/UrlPreviewUserDto;", "<init>", "(Lcom/yandex/messaging/core/net/entities/UrlPreviewChatDto;Ljava/lang/String;JLjava/util/List;Lcom/yandex/messaging/core/net/entities/UrlPreviewUserDto;)V", "getChat", "()Lcom/yandex/messaging/core/net/entities/UrlPreviewChatDto;", "getText", "()Ljava/lang/String;", "getTimestamp", "()J", "getMentionedUsers", "()Ljava/util/List;", "getUser", "()Lcom/yandex/messaging/core/net/entities/UrlPreviewUserDto;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class UrlPreviewMessageDto {
    private final UrlPreviewChatDto chat;
    private final List<MentionedUserDto> mentionedUsers;
    private final String text;
    private final long timestamp;
    private final UrlPreviewUserDto user;

    public UrlPreviewMessageDto(@Json(name = "chat") UrlPreviewChatDto urlPreviewChatDto, @Json(name = "text") String str, @Json(name = "timestamp") long j, @Json(name = "mentioned_users") List<MentionedUserDto> list, @Json(name = "user") UrlPreviewUserDto urlPreviewUserDto) {
        this.chat = urlPreviewChatDto;
        this.text = str;
        this.timestamp = j;
        this.mentionedUsers = list;
        this.user = urlPreviewUserDto;
    }

    public static /* synthetic */ UrlPreviewMessageDto copy$default(UrlPreviewMessageDto urlPreviewMessageDto, UrlPreviewChatDto urlPreviewChatDto, String str, long j, List list, UrlPreviewUserDto urlPreviewUserDto, int i, Object obj) {
        if ((i & 1) != 0) {
            urlPreviewChatDto = urlPreviewMessageDto.chat;
        }
        if ((i & 2) != 0) {
            str = urlPreviewMessageDto.text;
        }
        if ((i & 4) != 0) {
            j = urlPreviewMessageDto.timestamp;
        }
        if ((i & 8) != 0) {
            list = urlPreviewMessageDto.mentionedUsers;
        }
        if ((i & 16) != 0) {
            urlPreviewUserDto = urlPreviewMessageDto.user;
        }
        long j2 = j;
        return urlPreviewMessageDto.copy(urlPreviewChatDto, str, j2, list, urlPreviewUserDto);
    }

    /* renamed from: component1, reason: from getter */
    public final UrlPreviewChatDto getChat() {
        return this.chat;
    }

    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component3, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public final List<MentionedUserDto> component4() {
        return this.mentionedUsers;
    }

    /* renamed from: component5, reason: from getter */
    public final UrlPreviewUserDto getUser() {
        return this.user;
    }

    public final UrlPreviewMessageDto copy(@Json(name = "chat") UrlPreviewChatDto chat, @Json(name = "text") String text, @Json(name = "timestamp") long timestamp, @Json(name = "mentioned_users") List<MentionedUserDto> mentionedUsers, @Json(name = "user") UrlPreviewUserDto user) {
        return new UrlPreviewMessageDto(chat, text, timestamp, mentionedUsers, user);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UrlPreviewMessageDto)) {
            return false;
        }
        UrlPreviewMessageDto urlPreviewMessageDto = (UrlPreviewMessageDto) other;
        return jl40.l(this.chat, urlPreviewMessageDto.chat) && jl40.l(this.text, urlPreviewMessageDto.text) && this.timestamp == urlPreviewMessageDto.timestamp && jl40.l(this.mentionedUsers, urlPreviewMessageDto.mentionedUsers) && jl40.l(this.user, urlPreviewMessageDto.user);
    }

    public final UrlPreviewChatDto getChat() {
        return this.chat;
    }

    public final List<MentionedUserDto> getMentionedUsers() {
        return this.mentionedUsers;
    }

    public final String getText() {
        return this.text;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final UrlPreviewUserDto getUser() {
        return this.user;
    }

    public int hashCode() {
        int c = qv10.c(unr0.b(this.chat.hashCode() * 31, 31, this.text), 31, this.timestamp);
        List<MentionedUserDto> list = this.mentionedUsers;
        int hashCode = (c + (list == null ? 0 : list.hashCode())) * 31;
        UrlPreviewUserDto urlPreviewUserDto = this.user;
        return hashCode + (urlPreviewUserDto != null ? urlPreviewUserDto.hashCode() : 0);
    }

    public String toString() {
        return "UrlPreviewMessageDto(chat=" + this.chat + ", text=" + this.text + ", timestamp=" + this.timestamp + ", mentionedUsers=" + this.mentionedUsers + ", user=" + this.user + Extension.C_BRAKE;
    }
}
