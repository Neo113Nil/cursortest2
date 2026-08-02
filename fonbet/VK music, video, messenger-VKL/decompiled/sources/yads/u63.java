package yads;

import android.net.Uri;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

/* loaded from: classes10.dex */
public final class u63 implements p30 {
    public final p30 a;
    public final n30 b;
    public boolean c;
    public long d;

    public u63(p30 p30Var, pr prVar) {
        this.a = (p30) ni.a(p30Var);
        this.b = (n30) ni.a(prVar);
    }

    @Override // yads.p30
    public final void a(v93 v93Var) {
        v93Var.getClass();
        this.a.a(v93Var);
    }

    @Override // yads.p30
    public final void close() {
        try {
            this.a.close();
            if (this.c) {
                this.c = false;
                pr prVar = (pr) this.b;
                if (prVar.d == null) {
                    return;
                }
                try {
                    prVar.a();
                } catch (IOException e) {
                    throw new or(e);
                }
            }
        } catch (Throwable th) {
            if (this.c) {
                this.c = false;
                pr prVar2 = (pr) this.b;
                if (prVar2.d != null) {
                    try {
                        prVar2.a();
                    } catch (IOException e2) {
                        throw new or(e2);
                    }
                }
            }
            throw th;
        }
    }

    @Override // yads.p30
    public final Map getResponseHeaders() {
        return this.a.getResponseHeaders();
    }

    @Override // yads.p30
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i, int i2) {
        if (this.d == 0) {
            return -1;
        }
        int read = this.a.read(bArr, i, i2);
        if (read > 0) {
            pr prVar = (pr) this.b;
            u30 u30Var = prVar.d;
            if (u30Var != null) {
                int i3 = 0;
                while (i3 < read) {
                    try {
                        if (prVar.h == prVar.e) {
                            prVar.a();
                            prVar.a(u30Var);
                        }
                        int min = (int) Math.min(read - i3, prVar.e - prVar.h);
                        OutputStream outputStream = prVar.g;
                        int i4 = mc3.a;
                        outputStream.write(bArr, i + i3, min);
                        i3 += min;
                        long j = min;
                        prVar.h += j;
                        prVar.i += j;
                    } catch (IOException e) {
                        throw new or(e);
                    }
                }
            }
            long j2 = this.d;
            if (j2 != -1) {
                this.d = j2 - read;
            }
        }
        return read;
    }

    @Override // yads.p30
    public final long a(u30 u30Var) {
        long a = this.a.a(u30Var);
        this.d = a;
        if (a == 0) {
            return 0L;
        }
        if (u30Var.g == -1 && a != -1) {
            u30Var = u30Var.a(0L, a);
        }
        this.c = true;
        pr prVar = (pr) this.b;
        prVar.getClass();
        u30Var.h.getClass();
        if (u30Var.g == -1 && (u30Var.i & 2) == 2) {
            prVar.d = null;
        } else {
            prVar.d = u30Var;
            prVar.e = (u30Var.i & 4) == 4 ? prVar.b : Long.MAX_VALUE;
            prVar.i = 0L;
            try {
                prVar.a(u30Var);
            } catch (IOException e) {
                throw new or(e);
            }
        }
        return this.d;
    }
}
