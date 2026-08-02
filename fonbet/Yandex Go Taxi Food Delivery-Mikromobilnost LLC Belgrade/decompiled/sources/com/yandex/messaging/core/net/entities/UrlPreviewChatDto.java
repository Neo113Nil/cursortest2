package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.nzs;
import defpackage.tse0;
import defpackage.unr0;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0014J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0017J\\\u0010 \u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0003\u0010\t\u001a\u00020\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\bHÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\n\u0010\u0017¨\u0006&"}, d2 = {"Lcom/yandex/messaging/core/net/entities/UrlPreviewChatDto;", "", "chatId", "", "chatName", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "avatarId", "memberCount", "", "inviteHash", "isPublic", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;)V", "getChatId", "()Ljava/lang/String;", "getChatName", "getDescription", "getAvatarId", "getMemberCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getInviteHash", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/yandex/messaging/core/net/entities/UrlPreviewChatDto;", "equals", "other", "hashCode", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class UrlPreviewChatDto {
    private final String avatarId;
    private final String chatId;
    private final String chatName;
    private final String description;
    private final String inviteHash;
    private final Boolean isPublic;
    private final Integer memberCount;

    public UrlPreviewChatDto(@Json(name = "chat_id") String str, @Json(name = "name") String str2, @Json(name = "description") String str3, @Json(name = "avatar_id") String str4, @Json(name = "member_count") Integer num, @Json(name = "invite_hash") String str5, @Json(name = "public") Boolean bool) {
        this.chatId = str;
        this.chatName = str2;
        this.description = str3;
        this.avatarId = str4;
        this.memberCount = num;
        this.inviteHash = str5;
        this.isPublic = bool;
    }

    public static /* synthetic */ UrlPreviewChatDto copy$default(UrlPreviewChatDto urlPreviewChatDto, String str, String str2, String str3, String str4, Integer num, String str5, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = urlPreviewChatDto.chatId;
        }
        if ((i & 2) != 0) {
            str2 = urlPreviewChatDto.chatName;
        }
        if ((i & 4) != 0) {
            str3 = urlPreviewChatDto.description;
        }
        if ((i & 8) != 0) {
            str4 = urlPreviewChatDto.avatarId;
        }
        if ((i & 16) != 0) {
            num = urlPreviewChatDto.memberCount;
        }
        if ((i & 32) != 0) {
            str5 = urlPreviewChatDto.inviteHash;
        }
        if ((i & 64) != 0) {
            bool = urlPreviewChatDto.isPublic;
        }
        String str6 = str5;
        Boolean bool2 = bool;
        Integer num2 = num;
        String str7 = str3;
        return urlPreviewChatDto.copy(str, str2, str7, str4, num2, str6, bool2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getChatName() {
        return this.chatName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAvatarId() {
        return this.avatarId;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getMemberCount() {
        return this.memberCount;
    }

    /* renamed from: component6, reason: from getter */
    public final String getInviteHash() {
        return this.inviteHash;
    }

    /* renamed from: component7, reason: from getter */
    public final Boolean getIsPublic() {
        return this.isPublic;
    }

    public final UrlPreviewChatDto copy(@Json(name = "chat_id") String chatId, @Json(name = "name") String chatName, @Json(name = "description") String description, @Json(name = "avatar_id") String avatarId, @Json(name = "member_count") Integer memberCount, @Json(name = "invite_hash") String inviteHash, @Json(name = "public") Boolean isPublic) {
        return new UrlPreviewChatDto(chatId, chatName, description, avatarId, memberCount, inviteHash, isPublic);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UrlPreviewChatDto)) {
            return false;
        }
        UrlPreviewChatDto urlPreviewChatDto = (UrlPreviewChatDto) other;
        return jl40.l(this.chatId, urlPreviewChatDto.chatId) && jl40.l(this.chatName, urlPreviewChatDto.chatName) && jl40.l(this.description, urlPreviewChatDto.description) && jl40.l(this.avatarId, urlPreviewChatDto.avatarId) && jl40.l(this.memberCount, urlPreviewChatDto.memberCount) && jl40.l(this.inviteHash, urlPreviewChatDto.inviteHash) && jl40.l(this.isPublic, urlPreviewChatDto.isPublic);
    }

    public final String getAvatarId() {
        return this.avatarId;
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final String getChatName() {
        return this.chatName;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getInviteHash() {
        return this.inviteHash;
    }

    public final Integer getMemberCount() {
        return this.memberCount;
    }

    public int hashCode() {
        int b = unr0.b(this.chatId.hashCode() * 31, 31, this.chatName);
        String str = this.description;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.avatarId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.memberCount;
        int b2 = unr0.b((hashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.inviteHash);
        Boolean bool = this.isPublic;
        return b2 + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean isPublic() {
        return this.isPublic;
    }

    public String toString() {
        String str = this.chatId;
        String str2 = this.chatName;
        String str3 = this.description;
        String str4 = this.avatarId;
        Integer num = this.memberCount;
        String str5 = this.inviteHash;
        Boolean bool = this.isPublic;
        StringBuilder v = b64.v("UrlPreviewChatDto(chatId=", str, ", chatName=", str2, ", description=");
        g8e.D(v, str3, ", avatarId=", str4, ", memberCount=");
        tse0.w(num, ", inviteHash=", str5, ", isPublic=", v);
        return nzs.d(v, bool, Extension.C_BRAKE);
    }
}
