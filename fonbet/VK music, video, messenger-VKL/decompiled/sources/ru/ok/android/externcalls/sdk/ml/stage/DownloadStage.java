package ru.ok.android.externcalls.sdk.ml.stage;

import java.io.File;

/* compiled from: DownloadStage.kt */
/* loaded from: classes9.dex */
public final class DownloadStage {
    private final long downloadDurationMs;
    private final File file;

    public DownloadStage(File file, long j) {
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
