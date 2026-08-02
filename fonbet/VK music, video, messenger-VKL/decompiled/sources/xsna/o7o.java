package xsna;

import androidx.media3.exoplayer.offline.DownloadRequest;

/* compiled from: Download.java */
/* loaded from: classes12.dex */
public final class o7o {
    public final DownloadRequest a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final int g;
    public final n9o h;

    public o7o(DownloadRequest downloadRequest, int i, long j, long j2, int i2) {
        this(downloadRequest, i, j, j2, -1L, i2, 0, new n9o());
    }

    public final long a() {
        return this.h.a;
    }

    public final float b() {
        return this.h.b;
    }

    public final boolean c() {
        int i = this.b;
        return i == 3 || i == 4;
    }

    public o7o(DownloadRequest downloadRequest, int i, long j, long j2, long j3, int i2, int i3, n9o n9oVar) {
        n9oVar.getClass();
        boolean z = false;
        fxc0.p((i3 == 0) == (i != 4));
        if (i2 != 0) {
            if (i != 2 && i != 0) {
                z = true;
            }
            fxc0.p(z);
        }
        this.a = downloadRequest;
        this.b = i;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = i2;
        this.g = i3;
        this.h = n9oVar;
    }
}
