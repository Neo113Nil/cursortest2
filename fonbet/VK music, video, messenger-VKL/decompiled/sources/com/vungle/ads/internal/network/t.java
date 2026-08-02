package com.vungle.ads.internal.network;

import xsna.an8;
import xsna.vl8;

/* loaded from: classes7.dex */
public final class t extends okhttp3.t {
    public final /* synthetic */ okhttp3.t a;
    public final /* synthetic */ vl8 b;

    public t(okhttp3.t tVar, vl8 vl8Var) {
        this.a = tVar;
        this.b = vl8Var;
    }

    @Override // okhttp3.t
    public final long contentLength() {
        return this.b.c;
    }

    @Override // okhttp3.t
    public final okhttp3.m contentType() {
        return this.a.contentType();
    }

    @Override // okhttp3.t
    public final void writeTo(an8 an8Var) {
        an8Var.P0(this.b.z());
    }
}
