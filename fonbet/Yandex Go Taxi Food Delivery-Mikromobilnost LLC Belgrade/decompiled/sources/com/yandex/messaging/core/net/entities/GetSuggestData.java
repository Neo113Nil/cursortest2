package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import ru.cprocsp.ACSP.tools.common.CSPDirectoryConstants;

/* loaded from: classes15.dex */
public class GetSuggestData {

    @Json(name = CSPDirectoryConstants.SUBDIRECTORY_USERS)
    public UserData[] users;
}
