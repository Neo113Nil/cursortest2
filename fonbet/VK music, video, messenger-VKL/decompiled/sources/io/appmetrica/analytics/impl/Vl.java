package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.StartupParamsCallback;
import java.util.HashMap;

/* loaded from: classes8.dex */
public final class Vl extends HashMap {
    public Vl() {
        put(Tl.UNKNOWN, StartupParamsCallback.Reason.UNKNOWN);
        put(Tl.NETWORK, StartupParamsCallback.Reason.NETWORK);
        put(Tl.PARSE, StartupParamsCallback.Reason.INVALID_RESPONSE);
    }
}
