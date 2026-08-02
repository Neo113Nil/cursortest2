package ru.rustore.sdk.metrics.internal;

import java.net.URI;
import java.net.URL;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;
import xsna.icz0;

/* loaded from: classes11.dex */
public final class p extends Lambda implements gzs<URL> {
    public final /* synthetic */ icz0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(icz0 icz0Var) {
        super(0);
        this.a = icz0Var;
    }

    @Override // xsna.gzs
    public final URL invoke() {
        this.a.a.getClass();
        return new URI("https://stats.rustore.ru").resolve("/v1/send_custom_event_batch").toURL();
    }
}
