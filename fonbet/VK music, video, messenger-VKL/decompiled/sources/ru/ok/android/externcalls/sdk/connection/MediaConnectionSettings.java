package ru.ok.android.externcalls.sdk.connection;

import xsna.zcl;

/* compiled from: MediaConnectionSettings.kt */
/* loaded from: classes9.dex */
public final class MediaConnectionSettings {
    private final long noIceConnectionReportTimeoutMs;
    private final long noMediaReportTimeoutMs;

    public MediaConnectionSettings() {
        this(0L, 0L, 3, null);
    }

    public final long getNoIceConnectionReportTimeoutMs() {
        return this.noIceConnectionReportTimeoutMs;
    }

    public final long getNoMediaReportTimeoutMs() {
        return this.noMediaReportTimeoutMs;
    }

    public MediaConnectionSettings(long j, long j2) {
        this.noMediaReportTimeoutMs = j;
        this.noIceConnectionReportTimeoutMs = j2;
    }

    public /* synthetic */ MediaConnectionSettings(long j, long j2, int i, zcl zclVar) {
        this((i & 1) != 0 ? 3000L : j, (i & 2) != 0 ? 3000L : j2);
    }
}
