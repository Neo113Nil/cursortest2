package com.vungle.ads.internal.network;

import java.io.IOException;
import xsna.bn8;
import xsna.e8f0;

/* loaded from: classes7.dex */
public final class j extends okhttp3.v {
    public final okhttp3.v a;
    public final bn8 b;
    public IOException c;

    public j(okhttp3.v vVar) {
        this.a = vVar;
        this.b = new e8f0(new i(this, vVar.source()));
    }

    public final void a(IOException iOException) {
        this.c = iOException;
    }

    @Override // okhttp3.v, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // okhttp3.v
    public final long contentLength() {
        return this.a.contentLength();
    }

    @Override // okhttp3.v
    public final okhttp3.m contentType() {
        return this.a.contentType();
    }

    @Override // okhttp3.v
    public final bn8 source() {
        return this.b;
    }

    public final void a() {
        IOException iOException = this.c;
        if (iOException != null) {
            throw iOException;
        }
    }
}
