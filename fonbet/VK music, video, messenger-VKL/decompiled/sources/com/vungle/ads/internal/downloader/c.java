package com.vungle.ads.internal.downloader;

import xsna.vu5;

/* loaded from: classes7.dex */
public final class c {
    public int a;
    public int b;
    public long c;
    public long d;
    public long e;

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public final void c(long j) {
        this.c = j;
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("Progress(status=");
        a.append(this.a);
        a.append(", percent=");
        a.append(this.b);
        a.append(", startAt=");
        a.append(this.c);
        a.append(", readed=");
        a.append(this.d);
        a.append(", total=");
        return vu5.a(')', this.e, a);
    }

    public final void a(int i) {
        this.b = i;
    }

    public final void b(int i) {
        this.a = i;
    }

    public final void a(long j) {
        this.d = j;
    }

    public final void b(long j) {
        this.e = j;
    }
}
