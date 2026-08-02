package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.cprocsp.ACSP.tools.common.CSPDirectoryConstants;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0010\u0011\u0012B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/yandex/messaging/core/net/entities/ChangeChatRolesParams;", "", "chatId", "", "roles", "Lcom/yandex/messaging/core/net/entities/ChangeChatRolesParams$Roles;", "version", "", "<init>", "(Ljava/lang/String;Lcom/yandex/messaging/core/net/entities/ChangeChatRolesParams$Roles;J)V", "getChatId", "()Ljava/lang/String;", "getRoles", "()Lcom/yandex/messaging/core/net/entities/ChangeChatRolesParams$Roles;", "getVersion", "()J", "Roles", "Admin", "Users", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ChangeChatRolesParams {

    @Json(name = "chat_id")
    private final String chatId;

    @Json(name = "roles")
    private final Roles roles;

    @Json(name = "version")
    private final long version;

    @JsonClass(generateAdapter = true)
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/messaging/core/net/entities/ChangeChatRolesParams$Admin;", "", CSPDirectoryConstants.SUBDIRECTORY_USERS, "Lcom/yandex/messaging/core/net/entities/ChangeChatRolesParams$Users;", "<init>", "(Lcom/yandex/messaging/core/net/entities/ChangeChatRolesParams$Users;)V", "getUsers", "()Lcom/yandex/messaging/core/net/entities/ChangeChatRolesParams$Users;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Admin {

        @Json(name = CSPDirectoryConstants.SUBDIRECTORY_USERS)
        private final Users users;

        public Admin(Users users) {
            this.users = users;
        }

        public final Users getUsers() {
            return this.users;
        }
    }

    @JsonClass(generateAdapter = true)
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/messaging/core/net/entities/ChangeChatRolesParams$Roles;", "", "admin", "Lcom/yandex/messaging/core/net/entities/ChangeChatRolesParams$Admin;", "<init>", "(Lcom/yandex/messaging/core/net/entities/ChangeChatRolesParams$Admin;)V", "getAdmin", "()Lcom/yandex/messaging/core/net/entities/ChangeChatRolesParams$Admin;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Roles {

        @Json(name = "admin")
        private final Admin admin;

        public Roles(Admin admin) {
            this.admin = admin;
        }

        public final Admin getAdmin() {
            return this.admin;
        }
    }

    public ChangeChatRolesParams(String str, Roles roles, long j) {
        this.chatId = str;
        this.roles = roles;
        this.version = j;
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final Roles getRoles() {
        return this.roles;
    }

    public final long getVersion() {
        return this.version;
    }

    @JsonClass(generateAdapter = true)
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR \u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/yandex/messaging/core/net/entities/ChangeChatRolesParams$Users;", "", "add", "", "", "remove", "<init>", "([Ljava/lang/String;[Ljava/lang/String;)V", "getAdd", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getRemove", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Users {

        @Json(name = "add")
        private final String[] add;

        @Json(name = "remove")
        private final String[] remove;

        public /* synthetic */ Users(String[] strArr, String[] strArr2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : strArr, (i & 2) != 0 ? null : strArr2);
        }

        public final String[] getAdd() {
            return this.add;
        }

        public final String[] getRemove() {
            return this.remove;
        }

        public Users(String[] strArr, String[] strArr2) {
            this.add = strArr;
            this.remove = strArr2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Users() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }
}
