package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes8.dex */
public final class Oc {
    public final C4894hn a;
    public final C4894hn b;
    public final C5311y4 c;
    public final PublicLogger d;
    public final String e;

    public Oc(String str, PublicLogger publicLogger) {
        this(new C5311y4(30), new C4894hn(50, str.concat("map key"), publicLogger), new C4894hn(4000, str.concat("map value"), publicLogger), str, publicLogger);
    }

    public Oc(C5311y4 c5311y4, C4894hn c4894hn, C4894hn c4894hn2, String str, PublicLogger publicLogger) {
        this.c = c5311y4;
        this.a = c4894hn;
        this.b = c4894hn2;
        this.e = str;
        this.d = publicLogger;
    }
}
