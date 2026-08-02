package ru.ok.tracer.session;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import ru.ok.tracer.Severity;
import ru.ok.tracer.SystemState;
import ru.ok.tracer.base.io.FileUtils;
import ru.ok.tracer.session.SessionState;
import ru.ok.tracer.utils.SimpleFileKeyValueStorage;
import ru.ok.tracer.utils.TracerFiles;
import xsna.erm0;
import xsna.gzs;
import xsna.j5g;
import xsna.nbr;
import xsna.on00;
import xsna.ozl;
import xsna.s3q0;
import xsna.zcl;

/* compiled from: SessionStateStorage.kt */
/* loaded from: classes11.dex */
public final class SessionStateStorage {
    public static final Companion Companion = new Companion(null);
    private static final int MAX_CUSTOM_PROPERTY_KEY_LENGTH = 32;
    private static final int MAX_CUSTOM_PROPERTY_VALUE_LENGTH = 64;
    private static final int MAX_SESSIONS = 50;
    private static final String SESSION_START_TS = "session_start_ts";
    private static final String SESSION_STATES = "session_states";
    private static final String SESSION_STATE_UPLOAD_TS = "session_state_upload_ts";
    private static final String SESSION_SYSTEM_STATE = "session_system_state";
    private final Context context;
    private volatile SessionState currentSessionStateData;
    private SystemState currentSystemStateData;
    private volatile boolean loaded;
    private volatile SessionState prevLaunchSessionStateData;
    private SystemState prevLaunchSystemStateData;
    private final Object lock = new Object();
    private final SimpleFileKeyValueStorage fileStorage = new SimpleFileKeyValueStorage(new gzs<File>() { // from class: ru.ok.tracer.session.SessionStateStorage$fileStorage$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // xsna.gzs
        public final File invoke() {
            Context context;
            TracerFiles tracerFiles = TracerFiles.INSTANCE;
            context = SessionStateStorage.this.context;
            return nbr.t(FileUtils.mkdirsChecked(tracerFiles.getTracerDir(context)), "session.data");
        }
    });
    private final long currentStartTs = System.currentTimeMillis();
    private long prevLaunchTsData = Long.MIN_VALUE;
    private long sessionStatesUploadTsData = Long.MIN_VALUE;
    private List<SessionState> sessionStatesData = EmptyList.b;

    /* compiled from: SessionStateStorage.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public SessionStateStorage(Context context) {
        this.context = context;
    }

    private final void ensureLoaded() {
        SystemState systemState;
        List<SessionState> sessionStates;
        SystemState withPrevProperties;
        if (this.loaded) {
            return;
        }
        synchronized (this.lock) {
            try {
                if (!this.loaded) {
                    Long l = this.fileStorage.getLong(SESSION_START_TS);
                    this.prevLaunchTsData = l != null ? l.longValue() : Long.MIN_VALUE;
                    systemState = SessionStateStorageKt.getSystemState(this.fileStorage, SESSION_SYSTEM_STATE);
                    this.prevLaunchSystemStateData = systemState;
                    Long l2 = this.fileStorage.getLong(SESSION_STATE_UPLOAD_TS);
                    this.sessionStatesUploadTsData = l2 != null ? l2.longValue() : Long.MIN_VALUE;
                    sessionStates = SessionStateStorageKt.getSessionStates(this.fileStorage, SESSION_STATES);
                    this.sessionStatesData = sessionStates;
                    this.prevLaunchSessionStateData = (SessionState) j5g.k0(sessionStates);
                    SessionState sessionState = this.prevLaunchSessionStateData;
                    if (sessionState != null && sessionState.getStatus() == SessionState.Status.RUNNING) {
                        this.sessionStatesData = j5g.v0(SessionState.copy$default(sessionState, 0L, null, null, null, null, SessionState.Status.BLANK, null, 95, null), j5g.T(1, this.sessionStatesData));
                    }
                    SystemState createSystemState = SystemStateUtils.createSystemState(this.context);
                    SystemState systemState2 = this.prevLaunchSystemStateData;
                    SystemState systemState3 = null;
                    withPrevProperties = SessionStateStorageKt.withPrevProperties(createSystemState, systemState2 != null ? systemState2.getProperties() : null);
                    this.currentSystemStateData = withPrevProperties;
                    List<SessionState> list = this.sessionStatesData;
                    SessionState.Companion companion = SessionState.Companion;
                    if (withPrevProperties == null) {
                        withPrevProperties = null;
                    }
                    List<SessionState> I0 = j5g.I0(50, j5g.v0(companion.invoke$tracer_commons_release(withPrevProperties), list));
                    this.sessionStatesData = I0;
                    this.currentSessionStateData = (SessionState) j5g.i0(I0);
                    this.fileStorage.putLong(SESSION_START_TS, Long.valueOf(this.currentStartTs));
                    SimpleFileKeyValueStorage simpleFileKeyValueStorage = this.fileStorage;
                    SystemState systemState4 = this.currentSystemStateData;
                    if (systemState4 != null) {
                        systemState3 = systemState4;
                    }
                    SessionStateStorageKt.putSystemState(simpleFileKeyValueStorage, SESSION_SYSTEM_STATE, systemState3);
                    SessionStateStorageKt.putSessionStates(this.fileStorage, SESSION_STATES, this.sessionStatesData);
                    this.fileStorage.save();
                    this.loaded = true;
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void setCurrentSessionState(SessionState.Status status, Severity severity) {
        synchronized (this.lock) {
            ensureLoaded();
            SessionState sessionState = this.currentSessionStateData;
            SessionState sessionState2 = null;
            this.currentSessionStateData = SessionState.copy$default(sessionState == null ? null : sessionState, 0L, null, null, null, null, status, severity, 31, null);
            List T = j5g.T(1, this.sessionStatesData);
            SessionState sessionState3 = this.currentSessionStateData;
            if (sessionState3 != null) {
                sessionState2 = sessionState3;
            }
            ArrayList v0 = j5g.v0(sessionState2, T);
            this.sessionStatesData = v0;
            SessionStateStorageKt.putSessionStates(this.fileStorage, SESSION_STATES, v0);
            this.fileStorage.save();
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public static /* synthetic */ void setCurrentSessionState$default(SessionStateStorage sessionStateStorage, SessionState.Status status, Severity severity, int i, Object obj) {
        if ((i & 1) != 0) {
            SessionState sessionState = sessionStateStorage.currentSessionStateData;
            if (sessionState == null) {
                sessionState = null;
            }
            status = sessionState.getStatus();
        }
        if ((i & 2) != 0) {
            SessionState sessionState2 = sessionStateStorage.currentSessionStateData;
            severity = (sessionState2 != null ? sessionState2 : null).getMaxSeverity();
        }
        sessionStateStorage.setCurrentSessionState(status, severity);
    }

    public final void consumePrevSessionStates() {
        synchronized (this.lock) {
            ensureLoaded();
            this.sessionStatesUploadTsData = this.currentStartTs;
            this.sessionStatesData = Collections.singletonList(j5g.i0(this.sessionStatesData));
            this.fileStorage.putLong(SESSION_STATE_UPLOAD_TS, Long.valueOf(this.sessionStatesUploadTsData));
            SessionStateStorageKt.putSessionStates(this.fileStorage, SESSION_STATES, this.sessionStatesData);
            this.fileStorage.save();
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public final void ensureCurrentSessionMaxSeverity(Severity severity) {
        int compareToNullLast;
        synchronized (this.lock) {
            try {
                ensureLoaded();
                SessionState sessionState = this.currentSessionStateData;
                if (sessionState == null) {
                    sessionState = null;
                }
                compareToNullLast = SessionStateStorageKt.compareToNullLast(severity, sessionState.getMaxSeverity());
                if (compareToNullLast > 0) {
                    setCurrentSessionState$default(this, null, severity, 1, null);
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final SessionState.Status getCurrentSessionStatus() {
        ensureLoaded();
        SessionState sessionState = this.currentSessionStateData;
        if (sessionState == null) {
            sessionState = null;
        }
        return sessionState.getStatus();
    }

    public final SystemState getCurrentSystemState() {
        ensureLoaded();
        SystemState systemState = this.currentSystemStateData;
        if (systemState == null) {
            return null;
        }
        return systemState;
    }

    public final SessionState getPrevLaunchSessionState() {
        ensureLoaded();
        return this.prevLaunchSessionStateData;
    }

    public final SessionState.Status getPrevLaunchSessionStatus() {
        SessionState.Status status;
        SessionState prevLaunchSessionState = getPrevLaunchSessionState();
        return (prevLaunchSessionState == null || (status = prevLaunchSessionState.getStatus()) == null) ? SessionState.Status.BLANK : status;
    }

    public final SystemState getPrevLaunchSystemState() {
        ensureLoaded();
        return this.prevLaunchSystemStateData;
    }

    public final long getPrevLaunchTs() {
        ensureLoaded();
        return this.prevLaunchTsData;
    }

    public final SessionState getPrevSessionState() {
        return getPrevLaunchSessionState();
    }

    public final List<SessionState> getPrevSessionStates() {
        ensureLoaded();
        return j5g.T(1, this.sessionStatesData);
    }

    public final SessionState.Status getPrevSessionStatus() {
        return getPrevLaunchSessionStatus();
    }

    public final long getPrevStartTs() {
        return getPrevLaunchTs();
    }

    public final SystemState getPrevSystemState() {
        return getPrevLaunchSystemState();
    }

    public final boolean getSampled$tracer_commons_release() {
        ensureLoaded();
        SystemState systemState = this.currentSystemStateData;
        if (systemState == null) {
            systemState = null;
        }
        return systemState.getSampled();
    }

    public final long getSessionStateUploadTs() {
        ensureLoaded();
        return this.sessionStatesUploadTsData;
    }

    public final List<SessionState> getSessionStates() {
        ensureLoaded();
        return this.sessionStatesData;
    }

    public final String getUserId$tracer_commons_release() {
        ensureLoaded();
        SystemState systemState = this.currentSystemStateData;
        if (systemState == null) {
            systemState = null;
        }
        return systemState.getUserId();
    }

    public final boolean isCurrentlyInBackground$tracer_commons_release() {
        ensureLoaded();
        SystemState systemState = this.currentSystemStateData;
        if (systemState == null) {
            systemState = null;
        }
        return systemState.isInBackground();
    }

    public final void setCurrentSessionStatus(SessionState.Status status) {
        setCurrentSessionState$default(this, status, null, 2, null);
    }

    public final void setCurrentlyInBackground$tracer_commons_release(boolean z) {
        synchronized (this.lock) {
            ensureLoaded();
            SystemState systemState = this.currentSystemStateData;
            SystemState systemState2 = null;
            if (systemState == null) {
                systemState = null;
            }
            if (systemState.isInBackground() == z) {
                return;
            }
            SystemState systemState3 = this.currentSystemStateData;
            if (systemState3 == null) {
                systemState3 = null;
            }
            SystemState copy$default = SystemState.copy$default(systemState3, null, 0L, null, null, null, null, null, null, null, null, z, null, false, null, null, 31743, null);
            this.currentSystemStateData = copy$default;
            SimpleFileKeyValueStorage simpleFileKeyValueStorage = this.fileStorage;
            if (copy$default != null) {
                systemState2 = copy$default;
            }
            SessionStateStorageKt.putSystemState(simpleFileKeyValueStorage, SESSION_SYSTEM_STATE, systemState2);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public final void setCustomProperties$tracer_commons_release(Map<String, String> map) {
        synchronized (this.lock) {
            try {
                ensureLoaded();
                SystemState systemState = this.currentSystemStateData;
                SystemState systemState2 = null;
                if (systemState == null) {
                    systemState = null;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(systemState.getProperties());
                boolean z = false;
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    z = SessionStateStorageKt.update(linkedHashMap, erm0.D0(32, key), value != null ? erm0.D0(64, value) : null);
                }
                if (z) {
                    SystemState systemState3 = this.currentSystemStateData;
                    if (systemState3 == null) {
                        systemState3 = null;
                    }
                    SystemState copy$default = SystemState.copy$default(systemState3, null, 0L, null, null, null, null, null, null, null, null, false, null, false, linkedHashMap, null, 24575, null);
                    this.currentSystemStateData = copy$default;
                    SimpleFileKeyValueStorage simpleFileKeyValueStorage = this.fileStorage;
                    if (copy$default != null) {
                        systemState2 = copy$default;
                    }
                    SessionStateStorageKt.putSystemState(simpleFileKeyValueStorage, SESSION_SYSTEM_STATE, systemState2);
                    this.fileStorage.save();
                    s3q0 s3q0Var = s3q0.a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void setPrevLaunchSessionStatus(SessionState.Status status) {
        ensureLoaded();
        SessionState sessionState = this.prevLaunchSessionStateData;
        if (sessionState != null) {
            synchronized (this.lock) {
                ensureLoaded();
                SessionState copy$default = SessionState.copy$default(sessionState, 0L, null, null, null, null, status, null, 95, null);
                this.prevLaunchSessionStateData = copy$default;
                if (this.sessionStatesData.size() <= 1) {
                    return;
                }
                ArrayList v0 = j5g.v0(j5g.i0(this.sessionStatesData), j5g.v0(copy$default, j5g.T(2, this.sessionStatesData)));
                this.sessionStatesData = v0;
                SessionStateStorageKt.putSessionStates(this.fileStorage, SESSION_STATES, v0);
                this.fileStorage.save();
                s3q0 s3q0Var = s3q0.a;
            }
        }
    }

    public final void setPrevSessionStatus(SessionState.Status status) {
        setPrevLaunchSessionStatus(status);
    }

    public final void setSampled$tracer_commons_release(boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        if (!z) {
            valueOf = null;
        }
        setCustomProperties$tracer_commons_release(on00.f(new Pair(SystemState.PROPERTY_KEY_SAMPLED, valueOf != null ? valueOf.toString() : null)));
    }

    public final void setUserId$tracer_commons_release(String str) {
        setCustomProperties$tracer_commons_release(on00.f(new Pair("userId", str)));
    }

    @ozl
    public static /* synthetic */ void getPrevSessionState$annotations() {
    }

    @ozl
    public static /* synthetic */ void getPrevSessionStates$annotations() {
    }

    @ozl
    public static /* synthetic */ void getPrevSessionStatus$annotations() {
    }

    @ozl
    public static /* synthetic */ void getPrevStartTs$annotations() {
    }

    @ozl
    public static /* synthetic */ void getPrevSystemState$annotations() {
    }
}
