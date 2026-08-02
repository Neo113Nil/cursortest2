package ru.ok.tracer.base.http;

import android.content.Context;
import ru.ok.tracer.base.useragent.UserAgentUtils;

/* compiled from: TracerHttpClient.kt */
/* loaded from: classes9.dex */
public final class TracerHttpClientKt {
    public static final int NO_TRAFFIC_STATS_TAG = -1;

    public static final HttpClient createTracerHttpClient(Context context, int i) {
        return new HttpUrlConnectionHttpClient(context, UserAgentUtils.createTracerUserAgentString(context.getPackageName(), "1.3.3"), i, 0, 0, 24, null);
    }

    public static /* synthetic */ HttpClient createTracerHttpClient$default(Context context, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = -1;
        }
        return createTracerHttpClient(context, i);
    }

    public static final HttpClient createTracerLiteHttpClient(Context context, String str, int i) {
        return new HttpUrlConnectionHttpClient(context, UserAgentUtils.createTracerLiteUserAgentString(context.getPackageName(), str, "1.3.3"), i, 0, 0, 24, null);
    }

    public static /* synthetic */ HttpClient createTracerLiteHttpClient$default(Context context, String str, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = -1;
        }
        return createTracerLiteHttpClient(context, str, i);
    }
}
