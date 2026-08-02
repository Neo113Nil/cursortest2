package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.yandex.auth.LegacyAccountType;

/* loaded from: classes15.dex */
public class UserGaps {

    @Json(name = "gaps")
    public UserGap[] gaps;

    @Json(name = LegacyAccountType.STRING_LOGIN)
    public String login;
}
