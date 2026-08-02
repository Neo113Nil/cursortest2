package com.vungle.ads.internal.network;

import xsna.bn8;

/* loaded from: classes7.dex */
public final class k extends okhttp3.v {
    public final okhttp3.m a;
    public final long b;

    public k(okhttp3.m mVar, long j) {
        this.a = mVar;
        this.b = j;
    }

    @Override // okhttp3.v
    public final long contentLength() {
        return this.b;
    }

    @Override // okhttp3.v
    public final okhttp3.m contentType() {
        return this.a;
    }

    @Override // okhttp3.v
    public final bn8 source() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }
}
