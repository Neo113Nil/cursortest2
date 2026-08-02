package org.chromium.base.metrics;

import android.os.Trace;
import com.vungle.ads.internal.protos.Sdk;
import xsna.fo8;

/* loaded from: classes11.dex */
public class ScopedSysTraceEvent implements AutoCloseable {
    public static final int MAX_SECTION_NAME_LEN = 127;

    private ScopedSysTraceEvent(String str) {
        Trace.beginSection(str.length() > 127 ? fo8.a(str.substring(0, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE), "...") : str);
    }

    public static ScopedSysTraceEvent scoped(String str) {
        return new ScopedSysTraceEvent(str);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        Trace.endSection();
    }
}
