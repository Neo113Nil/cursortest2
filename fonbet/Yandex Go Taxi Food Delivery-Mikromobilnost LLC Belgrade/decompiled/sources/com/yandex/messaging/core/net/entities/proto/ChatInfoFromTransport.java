package com.yandex.messaging.core.net.entities.proto;

import com.squareup.moshi.Json;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.xuf0;
import ru.CryptoPro.XAdES.cl_63;

/* loaded from: classes15.dex */
public class ChatInfoFromTransport {

    @Json(name = "Alias")
    @xuf0(tag = 10)
    public String alias;

    @Json(name = "AvatarUrl")
    @xuf0(tag = 3)
    public String avatarUrl;

    @Json(name = "IsPublic")
    @xuf0(tag = 9)
    public boolean channelPublicity;

    @Json(name = cl_63.t)
    @xuf0(tag = 2)
    public String description;

    @Json(name = "Federative")
    @xuf0(tag = 12)
    public boolean federative = false;

    @Json(name = "HasGuests")
    @xuf0(tag = 13)
    public boolean hasGuests = false;

    @Json(name = "InviteHash")
    @xuf0(tag = 8)
    public String inviteHash;

    @Json(name = "IsPrivate")
    @xuf0(tag = 4)
    public boolean isPrivate;

    @Json(name = PlusAcquisitionSmartOffer.Texts.NAME)
    @xuf0(tag = 1)
    public String name;

    @Json(name = "OrganizationIds")
    @xuf0(tag = 11)
    public long[] organizationIds;

    @Json(name = "MemberCount")
    @xuf0(tag = 6)
    public long participantsCount;

    @Json(name = "Version")
    @xuf0(tag = 7)
    public long version;
}
