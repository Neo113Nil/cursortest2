package ru.ok.tracer.base.sessionuuuid;

/* compiled from: SessionUuidUtils.kt */
/* loaded from: classes11.dex */
final class SessionUuidHolder {
    public static final SessionUuidHolder INSTANCE = new SessionUuidHolder();
    private static String sessionUuid = SessionUuidUtils.createSessionUuid();

    private SessionUuidHolder() {
    }

    public final String getSessionUuid() {
        return sessionUuid;
    }

    public final void setSessionUuid(String str) {
        sessionUuid = str;
    }
}
