package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.DefaultConstructorMarker;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\b¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R \u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR \u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R \u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010#\u001a\u0004\b$\u0010\"R \u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&R \u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010'\u001a\u0004\b(\u0010&¨\u0006)"}, d2 = {"Lcom/yandex/messaging/core/net/entities/ChatParticipantsParams;", "", "chatId", "", "inviteHash", "limit", "", "roles", "", "guidOffset", "expandGroups", "", "groupsOnly", "groupFilter", "", "departmentFilter", "groupRefFilter", "Lcom/yandex/messaging/core/net/entities/GroupDepartmentRef;", "departmentRefFilter", "<init>", "(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/String;Ljava/lang/String;ZZ[Ljava/lang/Long;[Ljava/lang/Long;[Lcom/yandex/messaging/core/net/entities/GroupDepartmentRef;[Lcom/yandex/messaging/core/net/entities/GroupDepartmentRef;)V", "getChatId", "()Ljava/lang/String;", "getInviteHash", "getLimit", "()I", "getRoles", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getGuidOffset", "getExpandGroups", "()Z", "getGroupsOnly", "getGroupFilter", "()[Ljava/lang/Long;", "[Ljava/lang/Long;", "getDepartmentFilter", "getGroupRefFilter", "()[Lcom/yandex/messaging/core/net/entities/GroupDepartmentRef;", "[Lcom/yandex/messaging/core/net/entities/GroupDepartmentRef;", "getDepartmentRefFilter", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ChatParticipantsParams {

    @Json(name = "chat_id")
    private final String chatId;

    @Json(name = "department_filter")
    private final Long[] departmentFilter;

    @Json(name = "department_ref_filter")
    private final GroupDepartmentRef[] departmentRefFilter;

    @Json(name = "expand_groups")
    private final boolean expandGroups;

    @Json(name = "group_filter")
    private final Long[] groupFilter;

    @Json(name = "group_ref_filter")
    private final GroupDepartmentRef[] groupRefFilter;

    @Json(name = "groups_only")
    private final boolean groupsOnly;

    @Json(name = "guid_offset")
    private final String guidOffset;

    @Json(name = "invite_hash")
    private final String inviteHash;

    @Json(name = "limit")
    private final int limit;

    @Json(name = "roles")
    private final String[] roles;

    public ChatParticipantsParams(String str, String str2, int i, String[] strArr, String str3, boolean z, boolean z2, Long[] lArr, Long[] lArr2, GroupDepartmentRef[] groupDepartmentRefArr, GroupDepartmentRef[] groupDepartmentRefArr2) {
        this.chatId = str;
        this.inviteHash = str2;
        this.limit = i;
        this.roles = strArr;
        this.guidOffset = str3;
        this.expandGroups = z;
        this.groupsOnly = z2;
        this.groupFilter = lArr;
        this.departmentFilter = lArr2;
        this.groupRefFilter = groupDepartmentRefArr;
        this.departmentRefFilter = groupDepartmentRefArr2;
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final Long[] getDepartmentFilter() {
        return this.departmentFilter;
    }

    public final GroupDepartmentRef[] getDepartmentRefFilter() {
        return this.departmentRefFilter;
    }

    public final boolean getExpandGroups() {
        return this.expandGroups;
    }

    public final Long[] getGroupFilter() {
        return this.groupFilter;
    }

    public final GroupDepartmentRef[] getGroupRefFilter() {
        return this.groupRefFilter;
    }

    public final boolean getGroupsOnly() {
        return this.groupsOnly;
    }

    public final String getGuidOffset() {
        return this.guidOffset;
    }

    public final String getInviteHash() {
        return this.inviteHash;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final String[] getRoles() {
        return this.roles;
    }

    public /* synthetic */ ChatParticipantsParams(String str, String str2, int i, String[] strArr, String str3, boolean z, boolean z2, Long[] lArr, Long[] lArr2, GroupDepartmentRef[] groupDepartmentRefArr, GroupDepartmentRef[] groupDepartmentRefArr2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, strArr, str3, z, z2, (i2 & 128) != 0 ? null : lArr, (i2 & 256) != 0 ? null : lArr2, (i2 & 512) != 0 ? null : groupDepartmentRefArr, (i2 & 1024) != 0 ? null : groupDepartmentRefArr2);
    }
}
