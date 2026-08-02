package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.Json;
import defpackage.xuf0;
import defpackage.zuf0;
import java.util.Map;

/* loaded from: classes15.dex */
public class CustomFromUserInfo {

    @Json(name = "AvatarId")
    @xuf0(tag = 1)
    public String avatarId;

    @Json(name = "DisplayName")
    @xuf0(tag = 2)
    public String displayName;

    @Json(name = "IsDisplayRestricted")
    @xuf0(tag = 14)
    public Boolean isDisplayRestricted;

    @Json(name = "IsRobot")
    @xuf0(tag = 11)
    public Boolean isRobot;

    @Json(name = "LocalizationDescriptor")
    @xuf0(tag = 23)
    public LocalizationDescriptor localizationDescriptor;

    @zuf0
    @Json(name = "Localization")
    @xuf0(tag = 24)
    public Map<String, LocalizedData> localizationMap;

    @Json(name = "RobotInfo")
    @xuf0(tag = 15)
    public RobotInfo robotInfo;

    @Json(name = "Guid")
    @xuf0(tag = 3)
    public String userId;
}
