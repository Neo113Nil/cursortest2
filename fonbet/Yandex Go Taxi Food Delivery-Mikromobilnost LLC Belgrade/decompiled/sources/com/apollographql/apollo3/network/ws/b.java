package com.apollographql.apollo3.network.ws;

import defpackage.tls;

/* loaded from: classes.dex */
public final class b {
    public final long a;
    public final tls b;
    public final WsFrameType c;

    public b(int i) {
        SubscriptionWsProtocol$Factory$1 subscriptionWsProtocol$Factory$1 = new SubscriptionWsProtocol$Factory$1(1, null);
        WsFrameType wsFrameType = WsFrameType.Text;
        this.a = 10000L;
        this.b = subscriptionWsProtocol$Factory$1;
        this.c = wsFrameType;
    }

    public b() {
        this(0);
    }
}
