package com.vungle.ads.internal.downloader;

import xsna.oq;

/* loaded from: classes7.dex */
public final class b {
    public final int a;
    public final Throwable b;
    public final int c;

    public b(int i, Exception exc, int i2) {
        this.a = i;
        this.b = exc;
        this.c = i2;
    }

    public final Throwable a() {
        return this.b;
    }

    public final int b() {
        return this.c;
    }

    public final int c() {
        return this.a;
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("DownloadError(serverCode=");
        a.append(this.a);
        a.append(", reason=");
        a.append(this.c);
        a.append(", cause=");
        return oq.c(a, this.b, ')');
    }
}
