package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import defpackage.cex;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes15.dex */
public class TogglePushTokenParams {

    @Json(name = ClidProvider.APP_ACTIVE)
    public final boolean active;

    @cex
    @Json(name = "logout_token")
    public final String logoutToken;

    public TogglePushTokenParams(String str, boolean z) {
        this.logoutToken = str;
        this.active = z;
    }
}
