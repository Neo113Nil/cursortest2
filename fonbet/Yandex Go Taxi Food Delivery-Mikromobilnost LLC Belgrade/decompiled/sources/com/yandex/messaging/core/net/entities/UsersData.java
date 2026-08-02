package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import defpackage.cex;
import ru.cprocsp.ACSP.tools.common.CSPDirectoryConstants;

/* loaded from: classes15.dex */
public class UsersData {

    @cex
    @Json(name = CSPDirectoryConstants.SUBDIRECTORY_USERS)
    public UserData[] users;
}
