package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.Json;
import defpackage.xuf0;

/* loaded from: classes15.dex */
public class ParticipantsChange {

    @Json(name = "AddedDepartments")
    @xuf0(tag = 5)
    public DepartmentInfo[] addedDepartments;

    @Json(name = "AddedGroups")
    @xuf0(tag = 3)
    public GroupInfo[] addedGroups;

    @Json(name = "AddedUsers")
    @xuf0(tag = 1)
    public ReducedUserInfo[] addedUsers;

    @Json(name = "GuestsGuids")
    @xuf0(tag = 7)
    public String[] guestsGuids;

    @Json(name = "RemovedDepartments")
    @xuf0(tag = 6)
    public DepartmentInfo[] removedDepartments;

    @Json(name = "RemovedGroups")
    @xuf0(tag = 4)
    public GroupInfo[] removedGroups;

    @Json(name = "RemovedUsers")
    @xuf0(tag = 2)
    public ReducedUserInfo[] removedUsers;
}
