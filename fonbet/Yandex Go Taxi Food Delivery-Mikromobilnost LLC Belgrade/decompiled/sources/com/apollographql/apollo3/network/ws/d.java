package com.apollographql.apollo3.network.ws;

import defpackage.tls;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d {
    public tls a;
    public final ArrayList b = new ArrayList();

    public final void a(String str) {
        this.a = new WebSocketNetworkTransport$Builder$serverUrl$1$1(str, null);
    }
}
