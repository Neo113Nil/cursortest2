package ru.ok.android.externcalls.sdk.ml.stage;

import java.io.File;

/* compiled from: SaveNewModelInfoStage.kt */
/* loaded from: classes9.dex */
public final class SaveNewModelInfoStage {
    private final long downloadDurationMs;
    private final File file;

    public SaveNewModelInfoStage(File file, long j) {
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
