package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheDataSink;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.regex.Pattern;

/* loaded from: classes10.dex */
public final class pr implements n30 {
    public final nr a;
    public final long b = 5242880;
    public final int c = CacheDataSink.DEFAULT_BUFFER_SIZE;
    public u30 d;
    public long e;
    public File f;
    public OutputStream g;
    public long h;
    public long i;
    public jr2 j;

    public pr(nr nrVar) {
        this.a = (nr) ni.a(nrVar);
    }

    public final void a() {
        OutputStream outputStream = this.g;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            mc3.a((Closeable) this.g);
            this.g = null;
            File file = this.f;
            this.f = null;
            nr nrVar = this.a;
            long j = this.h;
            zz2 zz2Var = (zz2) nrVar;
            synchronized (zz2Var) {
                if (file.exists()) {
                    if (j == 0) {
                        file.delete();
                        return;
                    }
                    c03 a = c03.a(file, j, C.TIME_UNSET, zz2Var.c);
                    a.getClass();
                    ls lsVar = zz2Var.c;
                    hs hsVar = (hs) lsVar.a.get(a.b);
                    hsVar.getClass();
                    if (!hsVar.c(a.c, a.d)) {
                        throw new IllegalStateException();
                    }
                    long a2 = qz.a(hsVar.e);
                    if (a2 != -1 && a.c + a.d > a2) {
                        throw new IllegalStateException();
                    }
                    if (zz2Var.d != null) {
                        try {
                            zz2Var.d.a(file.getName(), a.d, a.g);
                        } catch (IOException e) {
                            throw new kr(e);
                        }
                    }
                    zz2Var.a(a);
                    try {
                        zz2Var.c.a();
                        zz2Var.notifyAll();
                    } finally {
                        kr krVar = new kr(e);
                    }
                }
            }
        } catch (Throwable th) {
            mc3.a((Closeable) this.g);
            this.g = null;
            File file2 = this.f;
            this.f = null;
            file2.delete();
            throw th;
        }
    }

    public final void a(u30 u30Var) {
        File file;
        long j = u30Var.g;
        long min = j == -1 ? -1L : Math.min(j - this.i, this.e);
        nr nrVar = this.a;
        String str = u30Var.h;
        int i = mc3.a;
        long j2 = u30Var.f + this.i;
        zz2 zz2Var = (zz2) nrVar;
        synchronized (zz2Var) {
            try {
                zz2Var.a();
                hs hsVar = (hs) zz2Var.c.a.get(str);
                hsVar.getClass();
                if (hsVar.c(j2, min)) {
                    if (!zz2Var.a.exists()) {
                        zz2.a(zz2Var.a);
                        zz2Var.c();
                    }
                    ef1 ef1Var = (ef1) zz2Var.b;
                    if (min != -1) {
                        ef1Var.a(zz2Var, min);
                    } else {
                        ef1Var.getClass();
                    }
                    File file2 = new File(zz2Var.a, Integer.toString(zz2Var.f.nextInt(10)));
                    if (!file2.exists()) {
                        zz2.a(file2);
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    int i2 = hsVar.a;
                    Pattern pattern = c03.h;
                    file = new File(file2, i2 + "." + j2 + "." + currentTimeMillis + ".v3.exo");
                } else {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f = file;
        FileOutputStream fileOutputStream = new FileOutputStream(this.f);
        if (this.c > 0) {
            jr2 jr2Var = this.j;
            if (jr2Var == null) {
                this.j = new jr2(fileOutputStream, this.c);
            } else {
                jr2Var.a(fileOutputStream);
            }
            this.g = this.j;
        } else {
            this.g = fileOutputStream;
        }
        this.h = 0L;
    }
}
