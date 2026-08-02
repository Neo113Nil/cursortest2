package ru.ok.tracer.session;

import ru.ok.tracer.Severity;
import ru.ok.tracer.SystemState;
import xsna.epx;
import xsna.n6j;
import xsna.ozl;
import xsna.urd0;
import xsna.zcl;

/* compiled from: SessionState.kt */
/* loaded from: classes11.dex */
public final class SessionState {
    public static final Companion Companion = new Companion(null);
    private final String environment;
    private final Severity maxSeverity;
    private final String processName;
    private final String sessionUuid;
    private final Status status;
    private final long versionCode;
    private final String versionName;

    /* compiled from: SessionState.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final SessionState invoke$tracer_commons_release(SystemState systemState) {
            return new SessionState(systemState.getVersionCode(), systemState.getVersionName(), systemState.getEnvironment(), systemState.getSessionUuid(), systemState.getProcessName$tracer_commons_release(), Status.RUNNING, null);
        }

        private Companion() {
        }
    }

    public SessionState(long j, String str, String str2, String str3, String str4, Status status, Severity severity) {
        this.versionCode = j;
        this.versionName = str;
        this.environment = str2;
        this.sessionUuid = str3;
        this.processName = str4;
        this.status = status;
        this.maxSeverity = severity;
    }

    public static /* synthetic */ SessionState copy$default(SessionState sessionState, long j, String str, String str2, String str3, String str4, Status status, Severity severity, int i, Object obj) {
        if ((i & 1) != 0) {
            j = sessionState.versionCode;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = sessionState.versionName;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = sessionState.environment;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = sessionState.sessionUuid;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = sessionState.processName;
        }
        return sessionState.copy(j2, str5, str6, str7, str4, (i & 32) != 0 ? sessionState.status : status, (i & 64) != 0 ? sessionState.maxSeverity : severity);
    }

    public final long component1() {
        return this.versionCode;
    }

    public final String component2() {
        return this.versionName;
    }

    public final String component3() {
        return this.environment;
    }

    public final String component4() {
        return this.sessionUuid;
    }

    public final String component5() {
        return this.processName;
    }

    public final Status component6() {
        return this.status;
    }

    public final Severity component7() {
        return this.maxSeverity;
    }

    public final SessionState copy(long j, String str, String str2, String str3, String str4, Status status, Severity severity) {
        return new SessionState(j, str, str2, str3, str4, status, severity);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionState)) {
            return false;
        }
        SessionState sessionState = (SessionState) obj;
        return this.versionCode == sessionState.versionCode && epx.f(this.versionName, sessionState.versionName) && epx.f(this.environment, sessionState.environment) && epx.f(this.sessionUuid, sessionState.sessionUuid) && epx.f(this.processName, sessionState.processName) && this.status == sessionState.status && epx.f(this.maxSeverity, sessionState.maxSeverity);
    }

    public final String getEnvironment() {
        return this.environment;
    }

    public final Severity getMaxSeverity() {
        return this.maxSeverity;
    }

    public final String getProcessName() {
        return this.processName;
    }

    public final String getSessionUuid() {
        return this.sessionUuid;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final long getVersionCode() {
        return this.versionCode;
    }

    public final String getVersionName() {
        return this.versionName;
    }

    public int hashCode() {
        int a = urd0.a(Long.hashCode(this.versionCode) * 31, 31, this.versionName);
        String str = this.environment;
        int a2 = urd0.a((a + (str == null ? 0 : str.hashCode())) * 31, 31, this.sessionUuid);
        String str2 = this.processName;
        int hashCode = (this.status.hashCode() + ((a2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        Severity severity = this.maxSeverity;
        return hashCode + (severity != null ? severity.hashCode() : 0);
    }

    public String toString() {
        long j = this.versionCode;
        String str = this.versionName;
        String str2 = this.environment;
        String str3 = this.sessionUuid;
        String str4 = this.processName;
        Status status = this.status;
        Severity severity = this.maxSeverity;
        StringBuilder sb = new StringBuilder("SessionState(versionCode=");
        sb.append(j);
        sb.append(", versionName=");
        sb.append(str);
        n6j.b(sb, ", environment=", str2, ", sessionUuid=", str3);
        sb.append(", processName=");
        sb.append(str4);
        sb.append(", status=");
        sb.append(status);
        sb.append(", maxSeverity=");
        sb.append(severity);
        sb.append(")");
        return sb.toString();
    }

    /* compiled from: SessionState.kt */
    public enum Status {
        RUNNING,
        BLANK,
        CRASH,
        ANR,
        NATIVE;

        public final String getValue() {
            return toString();
        }

        @ozl
        public static /* synthetic */ void getValue$annotations() {
        }
    }
}
