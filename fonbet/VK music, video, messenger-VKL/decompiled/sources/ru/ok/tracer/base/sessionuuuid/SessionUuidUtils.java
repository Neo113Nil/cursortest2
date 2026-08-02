package ru.ok.tracer.base.sessionuuuid;

import java.util.UUID;

/* compiled from: SessionUuidUtils.kt */
/* loaded from: classes11.dex */
public final class SessionUuidUtils {
    public static final String createSessionUuid() {
        return UUID.randomUUID().toString();
    }

    public static final String getCurrentSessionUuid() {
        return SessionUuidHolder.INSTANCE.getSessionUuid();
    }
}
