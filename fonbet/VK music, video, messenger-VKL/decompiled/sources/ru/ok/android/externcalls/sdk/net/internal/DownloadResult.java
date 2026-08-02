package ru.ok.android.externcalls.sdk.net.internal;

import java.io.File;

/* compiled from: DownloadResult.kt */
/* loaded from: classes9.dex */
public final class DownloadResult {
    private final long downloadDurationMs;
    private final File file;

    public DownloadResult(File file, long j) {
        this.file = file;
        this.downloadDurationMs = j;
    }

    public final long getDownloadDurationMs() {
        return this.downloadDurationMs;
    }

    public final File getFile() {
        return this.file;
    }
}
