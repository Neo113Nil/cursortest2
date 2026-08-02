package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes8.dex */
public final class Yi {
    public final Revenue a;
    public final C4816en b;
    public final C5049nn c;
    public final C5049nn d;
    public final PublicLogger e;

    public Yi(Revenue revenue, PublicLogger publicLogger) {
        this.e = publicLogger;
        this.a = revenue;
        this.b = new C4816en(30720, "revenue payload", publicLogger);
        this.c = new C5049nn(new C4816en(184320, "receipt data", publicLogger), "<truncated data was not sent, exceeded the limit of 180kb>");
        this.d = new C5049nn(new C4894hn(1000, "receipt signature", publicLogger), "<truncated data was not sent, exceeded the limit of 180kb>");
    }
}
