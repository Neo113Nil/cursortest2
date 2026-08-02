package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.smw0;
import defpackage.unr0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/yandex/messaging/core/net/entities/GetChatInfoDataWithJoinWall;", "", "JoinWallRequired", "ChatInfoData", "Lcom/yandex/messaging/core/net/entities/GetChatInfoDataWithJoinWall$ChatInfoData;", "Lcom/yandex/messaging/core/net/entities/GetChatInfoDataWithJoinWall$JoinWallRequired;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface GetChatInfoDataWithJoinWall {

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/messaging/core/net/entities/GetChatInfoDataWithJoinWall$ChatInfoData;", "Lcom/yandex/messaging/core/net/entities/GetChatInfoDataWithJoinWall;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ChatInfoData implements GetChatInfoDataWithJoinWall {
        public final GetChatInfoData a;

        public ChatInfoData(GetChatInfoData getChatInfoData) {
            this.a = getChatInfoData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChatInfoData) && this.a.equals(((ChatInfoData) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ChatInfoData(data=" + this.a + Extension.C_BRAKE;
        }
    }

    @JsonClass(generateAdapter = true)
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0019B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/yandex/messaging/core/net/entities/GetChatInfoDataWithJoinWall$JoinWallRequired;", "Lcom/yandex/messaging/core/net/entities/GetChatInfoDataWithJoinWall;", "text", "", AuthSdkActivity.RESPONSE_TYPE_CODE, "chatInfo", "Lcom/yandex/messaging/core/net/entities/GetChatInfoDataWithJoinWall$JoinWallRequired$JoinWallChatInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/messaging/core/net/entities/GetChatInfoDataWithJoinWall$JoinWallRequired$JoinWallChatInfo;)V", "getText", "()Ljava/lang/String;", "getCode", "getChatInfo", "()Lcom/yandex/messaging/core/net/entities/GetChatInfoDataWithJoinWall$JoinWallRequired$JoinWallChatInfo;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "JoinWallChatInfo", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class JoinWallRequired implements GetChatInfoDataWithJoinWall {

        @Json(name = "chat_info")
        private final JoinWallChatInfo chatInfo;
        private final String code;
        private final String text;

        public JoinWallRequired(String str, String str2, JoinWallChatInfo joinWallChatInfo) {
            this.text = str;
            this.code = str2;
            this.chatInfo = joinWallChatInfo;
        }

        public static /* synthetic */ JoinWallRequired copy$default(JoinWallRequired joinWallRequired, String str, String str2, JoinWallChatInfo joinWallChatInfo, int i, Object obj) {
            if ((i & 1) != 0) {
                str = joinWallRequired.text;
            }
            if ((i & 2) != 0) {
                str2 = joinWallRequired.code;
            }
            if ((i & 4) != 0) {
                joinWallChatInfo = joinWallRequired.chatInfo;
            }
            return joinWallRequired.copy(str, str2, joinWallChatInfo);
        }

        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        /* renamed from: component3, reason: from getter */
        public final JoinWallChatInfo getChatInfo() {
            return this.chatInfo;
        }

        public final JoinWallRequired copy(String text, String code, JoinWallChatInfo chatInfo) {
            return new JoinWallRequired(text, code, chatInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof JoinWallRequired)) {
                return false;
            }
            JoinWallRequired joinWallRequired = (JoinWallRequired) other;
            return jl40.l(this.text, joinWallRequired.text) && jl40.l(this.code, joinWallRequired.code) && jl40.l(this.chatInfo, joinWallRequired.chatInfo);
        }

        public final JoinWallChatInfo getChatInfo() {
            return this.chatInfo;
        }

        public final String getCode() {
            return this.code;
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.chatInfo.hashCode() + unr0.b(this.text.hashCode() * 31, 31, this.code);
        }

        public String toString() {
            String str = this.text;
            String str2 = this.code;
            JoinWallChatInfo joinWallChatInfo = this.chatInfo;
            StringBuilder v = b64.v("JoinWallRequired(text=", str, ", code=", str2, ", chatInfo=");
            v.append(joinWallChatInfo);
            v.append(Extension.C_BRAKE);
            return v.toString();
        }

        @JsonClass(generateAdapter = true)
        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J?\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/yandex/messaging/core/net/entities/GetChatInfoDataWithJoinWall$JoinWallRequired$JoinWallChatInfo;", "", "title", "", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "membersCount", "", "avatarId", "chatId", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getMembersCount", "()I", "getAvatarId", "getChatId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class JoinWallChatInfo {

            @Json(name = "avatar_id")
            private final String avatarId;

            @Json(name = "chat_id")
            private final String chatId;
            private final String description;

            @Json(name = "members_count")
            private final int membersCount;
            private final String title;

            public /* synthetic */ JoinWallChatInfo(String str, String str2, int i, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i2 & 2) != 0 ? null : str2, i, (i2 & 8) != 0 ? null : str3, str4);
            }

            public static /* synthetic */ JoinWallChatInfo copy$default(JoinWallChatInfo joinWallChatInfo, String str, String str2, int i, String str3, String str4, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = joinWallChatInfo.title;
                }
                if ((i2 & 2) != 0) {
                    str2 = joinWallChatInfo.description;
                }
                if ((i2 & 4) != 0) {
                    i = joinWallChatInfo.membersCount;
                }
                if ((i2 & 8) != 0) {
                    str3 = joinWallChatInfo.avatarId;
                }
                if ((i2 & 16) != 0) {
                    str4 = joinWallChatInfo.chatId;
                }
                String str5 = str4;
                int i3 = i;
                return joinWallChatInfo.copy(str, str2, i3, str3, str5);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* renamed from: component2, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            /* renamed from: component3, reason: from getter */
            public final int getMembersCount() {
                return this.membersCount;
            }

            /* renamed from: component4, reason: from getter */
            public final String getAvatarId() {
                return this.avatarId;
            }

            /* renamed from: component5, reason: from getter */
            public final String getChatId() {
                return this.chatId;
            }

            public final JoinWallChatInfo copy(String title, String description, int membersCount, String avatarId, String chatId) {
                return new JoinWallChatInfo(title, description, membersCount, avatarId, chatId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof JoinWallChatInfo)) {
                    return false;
                }
                JoinWallChatInfo joinWallChatInfo = (JoinWallChatInfo) other;
                return jl40.l(this.title, joinWallChatInfo.title) && jl40.l(this.description, joinWallChatInfo.description) && this.membersCount == joinWallChatInfo.membersCount && jl40.l(this.avatarId, joinWallChatInfo.avatarId) && jl40.l(this.chatId, joinWallChatInfo.chatId);
            }

            public final String getAvatarId() {
                return this.avatarId;
            }

            public final String getChatId() {
                return this.chatId;
            }

            public final String getDescription() {
                return this.description;
            }

            public final int getMembersCount() {
                return this.membersCount;
            }

            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                int hashCode = this.title.hashCode() * 31;
                String str = this.description;
                int b = oyr.b(this.membersCount, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
                String str2 = this.avatarId;
                return this.chatId.hashCode() + ((b + (str2 != null ? str2.hashCode() : 0)) * 31);
            }

            public String toString() {
                String str = this.title;
                String str2 = this.description;
                int i = this.membersCount;
                String str3 = this.avatarId;
                String str4 = this.chatId;
                StringBuilder v = b64.v("JoinWallChatInfo(title=", str, ", description=", str2, ", membersCount=");
                smw0.t(i, ", avatarId=", str3, ", chatId=", v);
                return oyr.t(v, str4, Extension.C_BRAKE);
            }

            public JoinWallChatInfo(String str, String str2, int i, String str3, String str4) {
                this.title = str;
                this.description = str2;
                this.membersCount = i;
                this.avatarId = str3;
                this.chatId = str4;
            }
        }
    }
}
