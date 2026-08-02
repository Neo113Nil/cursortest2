package com.yandex.messaging.internal.entities;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001a\u001bB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/yandex/messaging/internal/entities/ShareItem;", "", "type", "", "chat", "Lcom/yandex/messaging/internal/entities/ShareItem$Chat;", "user", "Lcom/yandex/messaging/internal/entities/ShareItem$User;", "<init>", "(Ljava/lang/String;Lcom/yandex/messaging/internal/entities/ShareItem$Chat;Lcom/yandex/messaging/internal/entities/ShareItem$User;)V", "getType", "()Ljava/lang/String;", "getChat", "()Lcom/yandex/messaging/internal/entities/ShareItem$Chat;", "getUser", "()Lcom/yandex/messaging/internal/entities/ShareItem$User;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "User", "Chat", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ShareItem {
    public static final int $stable = 0;

    @Json(name = "chat")
    private final Chat chat;

    @Json(name = "type")
    private final String type;

    @Json(name = "user")
    private final User user;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/yandex/messaging/internal/entities/ShareItem$Chat;", "", "chatId", "", "name", "avatarId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChatId", "()Ljava/lang/String;", "getName", "getAvatarId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Chat {
        public static final int $stable = 0;

        @Json(name = "avatar_id")
        private final String avatarId;

        @Json(name = "chat_id")
        private final String chatId;

        @Json(name = "name")
        private final String name;

        public Chat(String str, String str2, String str3) {
            this.chatId = str;
            this.name = str2;
            this.avatarId = str3;
        }

        public static /* synthetic */ Chat copy$default(Chat chat, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = chat.chatId;
            }
            if ((i & 2) != 0) {
                str2 = chat.name;
            }
            if ((i & 4) != 0) {
                str3 = chat.avatarId;
            }
            return chat.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getChatId() {
            return this.chatId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAvatarId() {
            return this.avatarId;
        }

        public final Chat copy(String chatId, String name, String avatarId) {
            return new Chat(chatId, name, avatarId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Chat)) {
                return false;
            }
            Chat chat = (Chat) other;
            return jl40.l(this.chatId, chat.chatId) && jl40.l(this.name, chat.name) && jl40.l(this.avatarId, chat.avatarId);
        }

        public final String getAvatarId() {
            return this.avatarId;
        }

        public final String getChatId() {
            return this.chatId;
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            int hashCode = this.chatId.hashCode() * 31;
            String str = this.name;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.avatarId;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.chatId;
            String str2 = this.name;
            return oyr.t(b64.v("Chat(chatId=", str, ", name=", str2, ", avatarId="), this.avatarId, Extension.C_BRAKE);
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0011JF\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011¨\u0006 "}, d2 = {"Lcom/yandex/messaging/internal/entities/ShareItem$User;", "", "guid", "", "displayName", "avatarId", "phoneId", "lastOnlineTs", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getGuid", "()Ljava/lang/String;", "getDisplayName", "getAvatarId", "getPhoneId", "getLastOnlineTs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/yandex/messaging/internal/entities/ShareItem$User;", "equals", "", "other", "hashCode", "", "toString", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class User {
        public static final int $stable = 0;

        @Json(name = "avatar_id")
        private final String avatarId;

        @Json(name = "display_name")
        private final String displayName;

        @Json(name = "guid")
        private final String guid;

        @Json(name = "last_online_ts")
        private final Long lastOnlineTs;

        @Json(name = "phone_id")
        private final String phoneId;

        public User(String str, String str2, String str3, String str4, Long l) {
            this.guid = str;
            this.displayName = str2;
            this.avatarId = str3;
            this.phoneId = str4;
            this.lastOnlineTs = l;
        }

        public static /* synthetic */ User copy$default(User user, String str, String str2, String str3, String str4, Long l, int i, Object obj) {
            if ((i & 1) != 0) {
                str = user.guid;
            }
            if ((i & 2) != 0) {
                str2 = user.displayName;
            }
            if ((i & 4) != 0) {
                str3 = user.avatarId;
            }
            if ((i & 8) != 0) {
                str4 = user.phoneId;
            }
            if ((i & 16) != 0) {
                l = user.lastOnlineTs;
            }
            Long l2 = l;
            String str5 = str3;
            return user.copy(str, str2, str5, str4, l2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getGuid() {
            return this.guid;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDisplayName() {
            return this.displayName;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAvatarId() {
            return this.avatarId;
        }

        /* renamed from: component4, reason: from getter */
        public final String getPhoneId() {
            return this.phoneId;
        }

        /* renamed from: component5, reason: from getter */
        public final Long getLastOnlineTs() {
            return this.lastOnlineTs;
        }

        public final User copy(String guid, String displayName, String avatarId, String phoneId, Long lastOnlineTs) {
            return new User(guid, displayName, avatarId, phoneId, lastOnlineTs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof User)) {
                return false;
            }
            User user = (User) other;
            return jl40.l(this.guid, user.guid) && jl40.l(this.displayName, user.displayName) && jl40.l(this.avatarId, user.avatarId) && jl40.l(this.phoneId, user.phoneId) && jl40.l(this.lastOnlineTs, user.lastOnlineTs);
        }

        public final String getAvatarId() {
            return this.avatarId;
        }

        public final String getDisplayName() {
            return this.displayName;
        }

        public final String getGuid() {
            return this.guid;
        }

        public final Long getLastOnlineTs() {
            return this.lastOnlineTs;
        }

        public final String getPhoneId() {
            return this.phoneId;
        }

        public int hashCode() {
            int b = unr0.b(this.guid.hashCode() * 31, 31, this.displayName);
            String str = this.avatarId;
            int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.phoneId;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Long l = this.lastOnlineTs;
            return hashCode2 + (l != null ? l.hashCode() : 0);
        }

        public String toString() {
            String str = this.guid;
            String str2 = this.displayName;
            String str3 = this.avatarId;
            String str4 = this.phoneId;
            Long l = this.lastOnlineTs;
            StringBuilder v = b64.v("User(guid=", str, ", displayName=", str2, ", avatarId=");
            g8e.D(v, str3, ", phoneId=", str4, ", lastOnlineTs=");
            v.append(l);
            v.append(Extension.C_BRAKE);
            return v.toString();
        }
    }

    public ShareItem(String str, Chat chat, User user) {
        this.type = str;
        this.chat = chat;
        this.user = user;
    }

    public static /* synthetic */ ShareItem copy$default(ShareItem shareItem, String str, Chat chat, User user, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shareItem.type;
        }
        if ((i & 2) != 0) {
            chat = shareItem.chat;
        }
        if ((i & 4) != 0) {
            user = shareItem.user;
        }
        return shareItem.copy(str, chat, user);
    }

    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final Chat getChat() {
        return this.chat;
    }

    /* renamed from: component3, reason: from getter */
    public final User getUser() {
        return this.user;
    }

    public final ShareItem copy(String type, Chat chat, User user) {
        return new ShareItem(type, chat, user);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShareItem)) {
            return false;
        }
        ShareItem shareItem = (ShareItem) other;
        return jl40.l(this.type, shareItem.type) && jl40.l(this.chat, shareItem.chat) && jl40.l(this.user, shareItem.user);
    }

    public final Chat getChat() {
        return this.chat;
    }

    public final String getType() {
        return this.type;
    }

    public final User getUser() {
        return this.user;
    }

    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        Chat chat = this.chat;
        int hashCode2 = (hashCode + (chat == null ? 0 : chat.hashCode())) * 31;
        User user = this.user;
        return hashCode2 + (user != null ? user.hashCode() : 0);
    }

    public String toString() {
        return "ShareItem(type=" + this.type + ", chat=" + this.chat + ", user=" + this.user + Extension.C_BRAKE;
    }
}
