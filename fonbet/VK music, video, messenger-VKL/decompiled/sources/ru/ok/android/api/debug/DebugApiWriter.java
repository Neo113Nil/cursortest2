package ru.ok.android.api.debug;

import java.io.IOException;

/* compiled from: DebugApiWriter.kt */
/* loaded from: classes9.dex */
public interface DebugApiWriter {
    boolean isDebug();

    void omitValue() throws IOException, UnsupportedOperationException;
}
