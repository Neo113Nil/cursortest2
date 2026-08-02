package ru.ok.android.externcalls.sdk.id.mapping;

import ru.ok.android.externcalls.sdk.exceptions.IdMappingResolveCalledException;
import ru.ok.android.webrtc.RTCLog;
import xsna.zcl;

/* compiled from: MappingContext.kt */
/* loaded from: classes9.dex */
public final class MappingContext {
    private static final Companion Companion = new Companion(null);
    private static final String LOG_TAG = "MappingContext";
    private final Exception exception;
    private final boolean isIdsMappersLoggingEnabled;
    private final RTCLog rtcLog;

    /* compiled from: MappingContext.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public MappingContext(RTCLog rTCLog, boolean z) {
        this.rtcLog = rTCLog;
        this.isIdsMappersLoggingEnabled = z;
        this.exception = z ? new IdMappingResolveCalledException() : null;
    }

    public final void logContextIfNeeded() {
        Exception exc = this.exception;
        if (exc != null) {
            this.rtcLog.reportException(LOG_TAG, "id mapping resolve called", exc);
        }
    }
}
