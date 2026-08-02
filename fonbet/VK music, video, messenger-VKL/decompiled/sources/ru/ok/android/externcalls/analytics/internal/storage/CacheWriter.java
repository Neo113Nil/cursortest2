package ru.ok.android.externcalls.analytics.internal.storage;

import java.io.File;
import java.io.IOException;
import ru.ok.android.externcalls.analytics.events.CallAnalyticsEvent;
import xsna.e9e0;

/* compiled from: CacheWriter.kt */
/* loaded from: classes9.dex */
public interface CacheWriter {
    int count();

    void drop() throws IOException;

    void grab(e9e0<File> e9e0Var) throws IOException;

    long length();

    void writeToCache(CallAnalyticsEvent callAnalyticsEvent);
}
