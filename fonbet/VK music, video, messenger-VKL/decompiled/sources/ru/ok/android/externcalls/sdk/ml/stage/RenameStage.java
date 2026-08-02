package ru.ok.android.externcalls.sdk.ml.stage;

import java.io.File;

/* compiled from: RenameStage.kt */
/* loaded from: classes9.dex */
public final class RenameStage {
    private final long downloadDurationMs;
    private final File modelDir;

    public RenameStage(File file, long j) {
        this.modelDir = file;
        this.downloadDurationMs = j;
    }

    public final long getDownloadDurationMs() {
        return this.downloadDurationMs;
    }

    public final File getModelDir() {
        return this.modelDir;
    }
}
