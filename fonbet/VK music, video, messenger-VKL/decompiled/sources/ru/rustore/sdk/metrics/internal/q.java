package ru.rustore.sdk.metrics.internal;

import java.net.URL;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;
import xsna.xqm0;

/* loaded from: classes9.dex */
public final class q extends Lambda implements gzs<String> {
    public final /* synthetic */ URL a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(URL url, int i, String str, String str2) {
        super(0);
        this.a = url;
        this.b = i;
        this.c = str;
        this.d = str2;
    }

    @Override // xsna.gzs
    public final String invoke() {
        return xqm0.g("\n                    HTTP REQUEST\n                    URL: " + this.a + "\n                    CODE: " + this.b + "\n                    BODY: " + this.c + "\n                    HEADER X-Metrics-Request-Time: " + this.d + "\n                ");
    }
}
