package xsna;

import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.File;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import ru.ok.proto.rtmp.amf.AmfConstants;
import xsna.nbn;

/* compiled from: FileLruCacheManager.kt */
/* loaded from: classes.dex */
public final class l9r implements a8r {
    public final File a;
    public final long b;
    public nbn c;

    /* compiled from: FileLruCacheManager.kt */
    public static final class a implements kbr {
        public final nbn b;
        public final String c;
        public boolean d;
        public final nbn.c e;

        public a(nbn nbnVar, String str) {
            this.b = nbnVar;
            this.c = str;
            this.e = nbnVar.h(-1L, str);
        }

        @Override // xsna.kbr
        public final synchronized void X3() {
            if (!this.d) {
                this.e.a();
                this.d = true;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() {
            if (!this.d) {
                X3();
            }
        }

        @Override // xsna.kbr
        public final synchronized File commit() {
            File file;
            try {
                if (!this.d) {
                    this.e.b();
                    this.d = true;
                }
                nbn.e i = this.b.i(this.c);
                try {
                    file = i.d[0];
                    i.close();
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
            return file;
        }

        @Override // xsna.kbr
        public final void g(izs<? super OutputStream, s3q0> izsVar) {
            OutputStream c = this.e.c(0);
            try {
                izsVar.invoke(c);
                ro.e(c, null);
            } finally {
            }
        }
    }

    public l9r(File file, long j) {
        this.a = file;
        this.b = j;
        if (j <= 0) {
            throw new IllegalArgumentException(defpackage.k0.a(j, "Illegal filesSizeLimit value: "));
        }
    }

    public static String e(String str) {
        char[] cArr = ub00.a;
        try {
            byte[] digest = MessageDigest.getInstance(SameMD5.TAG).digest(str.getBytes(Charset.forName(C.UTF8_NAME)));
            StringBuilder a2 = ub00.b.a();
            a2.setLength(0);
            for (byte b : digest) {
                char[] cArr2 = ub00.a;
                a2.append(cArr2[(b & 240) >> 4]);
                a2.append(cArr2[b & AmfConstants.TYPE_XML_DOCUMENT_MARKER]);
            }
            return a2.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // xsna.a8r
    public final synchronized kbr a(String str) {
        return new a(d(), e(str));
    }

    @Override // xsna.a8r
    public final synchronized void b() {
        synchronized (this) {
            try {
                nbn nbnVar = this.c;
                if (nbnVar != null) {
                    nbnVar.close();
                }
                this.c = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void c() {
        nbn nbnVar = this.c;
        if (nbnVar != null) {
            nbnVar.close();
            v2r0.a(nbnVar.b);
        }
        this.c = null;
    }

    public final synchronized nbn d() {
        nbn nbnVar;
        nbnVar = this.c;
        if (nbnVar == null) {
            nbnVar = nbn.n(this.a, 1, this.b);
            this.c = nbnVar;
        }
        return nbnVar;
    }

    public final void finalize() {
        nbn nbnVar = this.c;
        if (nbnVar != null) {
            nbnVar.close();
        }
    }

    @Override // xsna.a8r
    public final synchronized File get(String str) {
        File file;
        try {
            nbn.e i = d().i(e(str));
            if (i != null) {
                try {
                    file = i.d[0];
                } finally {
                    i.close();
                }
            } else {
                file = null;
            }
            if (i != null) {
            }
        } catch (Throwable th) {
            throw th;
        }
        return file;
    }

    @Override // xsna.a8r
    public final long u() {
        long j;
        nbn nbnVar = this.c;
        if (nbnVar == null) {
            return 0L;
        }
        synchronized (nbnVar) {
            j = nbnVar.i;
        }
        return j;
    }
}
