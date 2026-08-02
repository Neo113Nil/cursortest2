package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.cprocsp.ACSP.tools.common.CSPDirectoryConstants;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001:\u0003\"#$B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u0006%"}, d2 = {"Lcom/yandex/messaging/core/net/entities/ChangeChatMembersParams;", "", "chatId", "", CSPDirectoryConstants.SUBDIRECTORY_USERS, "Lcom/yandex/messaging/core/net/entities/ChangeChatMembersParams$AddRemove;", "groups", "Lcom/yandex/messaging/core/net/entities/ChangeChatMembersParams$AddRemoveLong;", "departments", "groupsRef", "Lcom/yandex/messaging/core/net/entities/ChangeChatMembersParams$AddRemoveGroupDepartmentRef;", "departmentsRef", "version", "", "role", "forceUpdateRole", "", "<init>", "(Ljava/lang/String;Lcom/yandex/messaging/core/net/entities/ChangeChatMembersParams$AddRemove;Lcom/yandex/messaging/core/net/entities/ChangeChatMembersParams$AddRemoveLong;Lcom/yandex/messaging/core/net/entities/ChangeChatMembersParams$AddRemoveLong;Lcom/yandex/messaging/core/net/entities/ChangeChatMembersParams$AddRemoveGroupDepartmentRef;Lcom/yandex/messaging/core/net/entities/ChangeChatMembersParams$AddRemoveGroupDepartmentRef;JLjava/lang/String;Z)V", "getChatId", "()Ljava/lang/String;", "getUsers", "()Lcom/yandex/messaging/core/net/entities/ChangeChatMembersParams$AddRemove;", "getGroups", "()Lcom/yandex/messaging/core/net/entities/ChangeChatMembersParams$AddRemoveLong;", "getDepartments", "getGroupsRef", "()Lcom/yandex/messaging/core/net/entities/ChangeChatMembersParams$AddRemoveGroupDepartmentRef;", "getDepartmentsRef", "getVersion", "()J", "getRole", "getForceUpdateRole", "()Z", "AddRemove", "AddRemoveLong", "AddRemoveGroupDepartmentRef", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ChangeChatMembersParams {

    @Json(name = "chat_id")
    private final String chatId;

    @Json(name = "departments")
    private final AddRemoveLong departments;

    @Json(name = "department_refs")
    private final AddRemoveGroupDepartmentRef departmentsRef;

    @Json(name = "force_update_role")
    private final boolean forceUpdateRole;

    @Json(name = "groups")
    private final AddRemoveLong groups;

    @Json(name = "group_refs")
    private final AddRemoveGroupDepartmentRef groupsRef;

    @Json(name = "role")
    private final String role;

    @Json(name = CSPDirectoryConstants.SUBDIRECTORY_USERS)
    private final AddRemove users;

    @Json(name = "version")
    private final long version;

    public ChangeChatMembersParams(String str, AddRemove addRemove, AddRemoveLong addRemoveLong, AddRemoveLong addRemoveLong2, AddRemoveGroupDepartmentRef addRemoveGroupDepartmentRef, AddRemoveGroupDepartmentRef addRemoveGroupDepartmentRef2, long j, String str2, boolean z) {
        this.chatId = str;
        this.users = addRemove;
        this.groups = addRemoveLong;
        this.departments = addRemoveLong2;
        this.groupsRef = addRemoveGroupDepartmentRef;
        this.departmentsRef = addRemoveGroupDepartmentRef2;
        this.version = j;
        this.role = str2;
        this.forceUpdateRole = z;
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final AddRemoveLong getDepartments() {
        return this.departments;
    }

    public final AddRemoveGroupDepartmentRef getDepartmentsRef() {
        return this.departmentsRef;
    }

    public final boolean getForceUpdateRole() {
        return this.forceUpdateRole;
    }

    public final AddRemoveLong getGroups() {
        return this.groups;
    }

    public final AddRemoveGroupDepartmentRef getGroupsRef() {
        return this.groupsRef;
    }

    public final String getRole() {
        return this.role;
    }

    public final AddRemove getUsers() {
        return this.users;
    }

    public final long getVersion() {
        return this.version;
    }

    @JsonClass(generateAdapter = true)
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR \u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/yandex/messaging/core/net/entities/ChangeChatMembersParams$AddRemove;", "", "add", "", "", "remove", "<init>", "([Ljava/lang/String;[Ljava/lang/String;)V", "getAdd", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getRemove", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AddRemove {

        @Json(name = "add")
        private final String[] add;

        @Json(name = "remove")
        private final String[] remove;

        public /* synthetic */ AddRemove(String[] strArr, String[] strArr2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : strArr, (i & 2) != 0 ? null : strArr2);
        }

        public final String[] getAdd() {
            return this.add;
        }

        public final String[] getRemove() {
            return this.remove;
        }

        public AddRemove(String[] strArr, String[] strArr2) {
            this.add = strArr;
            this.remove = strArr2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AddRemove() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @JsonClass(generateAdapter = true)
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR \u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/yandex/messaging/core/net/entities/ChangeChatMembersParams$AddRemoveGroupDepartmentRef;", "", "add", "", "Lcom/yandex/messaging/core/net/entities/GroupDepartmentRef;", "remove", "<init>", "([Lcom/yandex/messaging/core/net/entities/GroupDepartmentRef;[Lcom/yandex/messaging/core/net/entities/GroupDepartmentRef;)V", "getAdd", "()[Lcom/yandex/messaging/core/net/entities/GroupDepartmentRef;", "[Lcom/yandex/messaging/core/net/entities/GroupDepartmentRef;", "getRemove", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AddRemoveGroupDepartmentRef {

        @Json(name = "add")
        private final GroupDepartmentRef[] add;

        @Json(name = "remove")
        private final GroupDepartmentRef[] remove;

        public /* synthetic */ AddRemoveGroupDepartmentRef(GroupDepartmentRef[] groupDepartmentRefArr, GroupDepartmentRef[] groupDepartmentRefArr2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : groupDepartmentRefArr, (i & 2) != 0 ? null : groupDepartmentRefArr2);
        }

        public final GroupDepartmentRef[] getAdd() {
            return this.add;
        }

        public final GroupDepartmentRef[] getRemove() {
            return this.remove;
        }

        public AddRemoveGroupDepartmentRef(GroupDepartmentRef[] groupDepartmentRefArr, GroupDepartmentRef[] groupDepartmentRefArr2) {
            this.add = groupDepartmentRefArr;
            this.remove = groupDepartmentRefArr2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AddRemoveGroupDepartmentRef() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @JsonClass(generateAdapter = true)
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR \u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/yandex/messaging/core/net/entities/ChangeChatMembersParams$AddRemoveLong;", "", "add", "", "", "remove", "<init>", "([Ljava/lang/Long;[Ljava/lang/Long;)V", "getAdd", "()[Ljava/lang/Long;", "[Ljava/lang/Long;", "getRemove", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AddRemoveLong {

        @Json(name = "add")
        private final Long[] add;

        @Json(name = "remove")
        private final Long[] remove;

        public /* synthetic */ AddRemoveLong(Long[] lArr, Long[] lArr2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : lArr, (i & 2) != 0 ? null : lArr2);
        }

        public final Long[] getAdd() {
            return this.add;
        }

        public final Long[] getRemove() {
            return this.remove;
        }

        public AddRemoveLong(Long[] lArr, Long[] lArr2) {
            this.add = lArr;
            this.remove = lArr2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AddRemoveLong() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    public /* synthetic */ ChangeChatMembersParams(String str, AddRemove addRemove, AddRemoveLong addRemoveLong, AddRemoveLong addRemoveLong2, AddRemoveGroupDepartmentRef addRemoveGroupDepartmentRef, AddRemoveGroupDepartmentRef addRemoveGroupDepartmentRef2, long j, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, addRemove, (i & 4) != 0 ? null : addRemoveLong, (i & 8) != 0 ? null : addRemoveLong2, addRemoveGroupDepartmentRef, addRemoveGroupDepartmentRef2, j, str2, (i & 256) != 0 ? false : z);
    }
}
