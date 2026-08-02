package ru.ok.tracer.lite.upload;

import android.content.Context;
import kotlin.Lazy;
import ru.ok.tracer.base.http.HttpClient;
import ru.ok.tracer.base.http.TracerHttpClientKt;
import ru.ok.tracer.lite.TracerLite;
import xsna.bpn0;
import xsna.gzs;
import xsna.zcl;

/* compiled from: TracerLiteHttpClientHolder.kt */
/* loaded from: classes11.dex */
public final class TracerLiteHttpClientHolder {
    public static final Companion Companion = new Companion(null);
    private final Context context;
    private final Lazy httpClient$delegate;
    private final String libraryPackageName;
    private final int trafficStatsTag;

    /* compiled from: TracerLiteHttpClientHolder.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final TracerLiteHttpClientHolder get(TracerLite tracerLite) {
            return tracerLite.getHttpClientHolder$tracer_lite_commons_release();
        }

        private Companion() {
        }
    }

    public TracerLiteHttpClientHolder(Context context, String str, int i) {
        this.context = context;
        this.libraryPackageName = str;
        this.trafficStatsTag = i;
        this.httpClient$delegate = new bpn0(new gzs<HttpClient>() { // from class: ru.ok.tracer.lite.upload.TracerLiteHttpClientHolder$httpClient$2
            {
                super(0);
            }

            @Override // xsna.gzs
            public final HttpClient invoke() {
                Context context2;
                String str2;
                int i2;
                context2 = TracerLiteHttpClientHolder.this.context;
                str2 = TracerLiteHttpClientHolder.this.libraryPackageName;
                i2 = TracerLiteHttpClientHolder.this.trafficStatsTag;
                return TracerHttpClientKt.createTracerLiteHttpClient(context2, str2, i2);
            }
        });
    }

    public final HttpClient getHttpClient() {
        return (HttpClient) this.httpClient$delegate.getValue();
    }

    public /* synthetic */ TracerLiteHttpClientHolder(Context context, String str, int i, int i2, zcl zclVar) {
        this(context, str, (i2 & 4) != 0 ? -1 : i);
    }
}
