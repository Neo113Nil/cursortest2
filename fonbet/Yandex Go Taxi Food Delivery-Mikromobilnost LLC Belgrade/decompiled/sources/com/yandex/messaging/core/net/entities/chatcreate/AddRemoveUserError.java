package com.yandex.messaging.core.net.entities.chatcreate;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/yandex/messaging/core/net/entities/chatcreate/AddRemoveUserError;", "", "guid", "", AuthSdkActivity.RESPONSE_TYPE_CODE, "groupIds", "", "", "departmentIds", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getGuid", "()Ljava/lang/String;", "getCode", "getGroupIds", "()Ljava/util/List;", "getDepartmentIds", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AddRemoveUserError {

    @Json(name = AuthSdkActivity.RESPONSE_TYPE_CODE)
    private final String code;

    @Json(name = "department_ids")
    private final List<Long> departmentIds;

    @Json(name = "group_ids")
    private final List<Long> groupIds;

    @Json(name = "guid")
    private final String guid;

    public /* synthetic */ AddRemoveUserError(String str, String str2, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2);
    }

    public final String getCode() {
        return this.code;
    }

    public final List<Long> getDepartmentIds() {
        return this.departmentIds;
    }

    public final List<Long> getGroupIds() {
        return this.groupIds;
    }

    public final String getGuid() {
        return this.guid;
    }

    public AddRemoveUserError(String str, String str2, List<Long> list, List<Long> list2) {
        this.guid = str;
        this.code = str2;
        this.groupIds = list;
        this.departmentIds = list2;
    }

    public AddRemoveUserError() {
        this(null, null, null, null, 15, null);
    }
}
