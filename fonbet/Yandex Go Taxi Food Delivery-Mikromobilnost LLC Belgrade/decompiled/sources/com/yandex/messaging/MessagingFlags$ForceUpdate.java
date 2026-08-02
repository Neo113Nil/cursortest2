package com.yandex.messaging;

import com.yandex.messaging.core.net.entities.BackendConfig;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes8.dex */
public enum MessagingFlags$ForceUpdate {
    CONFIG(ConfigConstants.CONFIG),
    FORCE_TYPE_MOCK("force"),
    SOFT_TYPE_MOCK("soft"),
    DISABLED(BackendConfig.Restrictions.DISABLED);

    public final String name;

    MessagingFlags$ForceUpdate(String str) {
        this.name = str;
    }
}
