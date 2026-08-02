package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0007\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR \u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR \u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001f\u0010\u001d¨\u0006 "}, d2 = {"Lcom/yandex/messaging/core/net/entities/OrganizationChatSuggestParams;", "", "chatId", "", "limit", "", "roles", "", "guidOffset", "expandGroups", "", "groupsOnly", "groupFilter", "", "departmentFilter", "<init>", "(Ljava/lang/String;I[Ljava/lang/String;Ljava/lang/String;ZZ[Ljava/lang/Long;[Ljava/lang/Long;)V", "getChatId", "()Ljava/lang/String;", "getLimit", "()I", "getRoles", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getGuidOffset", "getExpandGroups", "()Z", "getGroupsOnly", "getGroupFilter", "()[Ljava/lang/Long;", "[Ljava/lang/Long;", "getDepartmentFilter", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class OrganizationChatSuggestParams {

    @Json(name = "chat_id")
    private final String chatId;

    @Json(name = "department_filter")
    private final Long[] departmentFilter;

    @Json(name = "expand_groups")
    private final boolean expandGroups;

    @Json(name = "group_filter")
    private final Long[] groupFilter;

    @Json(name = "groups_only")
    private final boolean groupsOnly;

    @Json(name = "guid_offset")
    private final String guidOffset;

    @Json(name = "limit")
    private final int limit;

    @Json(name = "roles")
    private final String[] roles;

    public OrganizationChatSuggestParams(String str, int i, String[] strArr, String str2, boolean z, boolean z2, Long[] lArr, Long[] lArr2) {
        this.chatId = str;
        this.limit = i;
        this.roles = strArr;
        this.guidOffset = str2;
        this.expandGroups = z;
        this.groupsOnly = z2;
        this.groupFilter = lArr;
        this.departmentFilter = lArr2;
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final Long[] getDepartmentFilter() {
        return this.departmentFilter;
    }

    public final boolean getExpandGroups() {
        return this.expandGroups;
    }

    public final Long[] getGroupFilter() {
        return this.groupFilter;
    }

    public final boolean getGroupsOnly() {
        return this.groupsOnly;
    }

    public final String getGuidOffset() {
        return this.guidOffset;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final String[] getRoles() {
        return this.roles;
    }
}
