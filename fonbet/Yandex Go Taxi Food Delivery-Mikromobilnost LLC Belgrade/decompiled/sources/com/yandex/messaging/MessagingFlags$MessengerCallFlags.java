package com.yandex.messaging;

import com.yandex.messaging.core.net.entities.BackendConfig;

/* loaded from: classes8.dex */
public enum MessagingFlags$MessengerCallFlags {
    ENABLED(BackendConfig.Restrictions.ENABLED),
    INCOMING_ONLY("incoming_only"),
    DISABLED(BackendConfig.Restrictions.DISABLED);

    public final String name;

    MessagingFlags$MessengerCallFlags(String str) {
        this.name = str;
    }
}
