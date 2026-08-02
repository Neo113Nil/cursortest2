package xsna;

import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import com.mbridge.msdk.foundation.download.Command;
import com.vk.api.sdk.exceptions.VKLocalIOException;
import com.vk.api.sdk.utils.log.Logger;
import com.vk.knet.core.http.HttpMethod;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.builders.MapBuilder;
import okhttp3.p;
import ru.ok.android.commons.http.Http;
import xsna.mkx;

/* compiled from: DownloadFileChainCall.kt */
/* loaded from: classes15.dex */
public final class p8o extends ara<File> {
    public final mkx b;
    public final o8o c;
    public final long d;
    public final m7r0 e;
    public final ConcurrentHashMap<File, mkx.a> f;

    public p8o(wy2 wy2Var, mkx mkxVar, o8o o8oVar, long j, m7r0 m7r0Var) {
        super(wy2Var);
        this.b = mkxVar;
        this.c = o8oVar;
        this.d = j;
        this.e = m7r0Var;
        this.f = new ConcurrentHashMap<>();
    }

    @Override // xsna.ara
    public final File a(zqa zqaVar) {
        File file = this.c.b;
        ConcurrentHashMap<File, mkx.a> concurrentHashMap = this.f;
        mkx.a aVar = concurrentHashMap.get(file);
        boolean z = false;
        if (aVar != null && aVar.c) {
            z = true;
        }
        m63.j(m63.c(), new Pair("download.resumed", Boolean.valueOf(z)), new Pair("download.size_bytes", Long.valueOf(aVar != null ? aVar.b : -1L)));
        if (z) {
            c(file, file.length(), Long.valueOf(aVar.b));
        } else {
            c(file, 0L, null);
        }
        if (aVar != null) {
            long j = aVar.b;
            if (j > 0 && file.length() != j) {
                throw new VKLocalIOException(new IOException("File was corrupted. (file length=" + file.length() + ", but expected " + j + ')'));
            }
        }
        concurrentHashMap.remove(file);
        return file;
    }

    public final void c(File file, long j, Long l) {
        mkx.a aVar;
        boolean z;
        long j2 = j;
        mkx mkxVar = this.b;
        String str = this.c.a;
        long j3 = this.d;
        long longValue = l != null ? l.longValue() : Long.MAX_VALUE;
        boolean z2 = this.c.d;
        mkxVar.getClass();
        jjy a = yjy.a();
        if (a != null) {
            MapBuilder mapBuilder = new MapBuilder();
            mapBuilder.put(Command.HTTP_HEADER_RANGE, Collections.singletonList("bytes=" + j2 + '-' + longValue));
            if (z2 && i7r0.a(mkxVar.e.getValue()).length() > 0) {
                mapBuilder.put(Http.Header.AUTHORIZATION, Collections.singletonList("Bearer ".concat(i7r0.a(mkxVar.e.getValue()))));
            }
            ckv ckvVar = new ckv(HttpMethod.GET, str, mapBuilder.h(), (ekv) null, 24);
            mkv c = zjv.a(new som0(a.b), a.a, ckvVar, a.c).c(ckvVar);
            okv okvVar = c.g;
            long contentLength = c.getContentLength();
            List<String> p = c.p("accept-ranges");
            if (!epx.f(p != null ? (String) j5g.a0(p) : null, "bytes")) {
                List<String> p2 = c.p("content-range");
                if ((p2 != null ? (String) j5g.a0(p2) : null) == null) {
                    z = false;
                    aVar = new mkx.a(okvVar.n(), contentLength, z);
                }
            }
            z = true;
            aVar = new mkx.a(okvVar.n(), contentLength, z);
        } else {
            p.a aVar2 = new p.a();
            aVar2.d();
            aVar2.i(str);
            aVar2.h(k000.class, new k000(Logger.LogLevel.ERROR));
            aVar2.c.b(Command.HTTP_HEADER_RANGE, "bytes=" + j2 + '-' + longValue);
            if (z2 && i7r0.a(mkxVar.e.getValue()).length() > 0) {
                aVar2.c.b(Http.Header.AUTHORIZATION, "Bearer ".concat(i7r0.a(mkxVar.e.getValue())));
            }
            aVar2.c(okhttp3.c.n);
            m8g0.a(aVar2, j3);
            okhttp3.u g = mkxVar.g(aVar2.b());
            okhttp3.v vVar = g.h;
            if (vVar == null) {
                throw new IOException("Empty body");
            }
            aVar = new mkx.a(vVar.byteStream(), vVar.contentLength(), epx.f(g.g.a("accept-ranges"), "bytes") || g.g.a("content-range") != null);
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file, j2 != 0);
        this.f.put(file, aVar);
        InputStream inputStream = aVar.a;
        BufferedInputStream bufferedInputStream = inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, 8192);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream, 8192);
        long j4 = aVar.b;
        m7r0 m7r0Var = this.e;
        if (bufferedInputStream == null || j4 == 0) {
            return;
        }
        try {
            try {
                byte[] bArr = new byte[4096];
                boolean z3 = j4 == -1;
                if (z3) {
                    j4 = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
                }
                boolean z4 = j4 > 2147483647L;
                double d = Integer.MAX_VALUE / j4;
                if (d > 1.0d) {
                    d = 1.0d;
                }
                long j5 = 0;
                while (true) {
                    int read = bufferedInputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    bufferedOutputStream.write(bArr, 0, read);
                    boolean z5 = z4;
                    j2 += read;
                    if (z3 && j2 > j4) {
                        j4 *= 2;
                    }
                    if (SystemClock.uptimeMillis() - j5 > 500) {
                        if (z5) {
                            if (m7r0Var != null) {
                                m7r0Var.onProgress((int) (j2 * d), (int) (j4 > 2147483647L ? 2147483647L : j4));
                            }
                        } else if (m7r0Var != null) {
                            m7r0Var.onProgress((int) j2, (int) j4);
                        }
                        j5 = SystemClock.uptimeMillis();
                    }
                    z4 = z5;
                }
                if (z4) {
                    if (m7r0Var != null) {
                        int i = (int) (j2 * d);
                        m7r0Var.onProgress(i, i);
                    }
                } else if (m7r0Var != null) {
                    int i2 = (int) j2;
                    m7r0Var.onProgress(i2, i2);
                }
                bufferedOutputStream.flush();
                x2r0.c(bufferedInputStream);
                x2r0.c(bufferedOutputStream);
            } catch (Exception e) {
                throw e;
            }
        } catch (Throwable th) {
            x2r0.c(bufferedInputStream);
            x2r0.c(bufferedOutputStream);
            throw th;
        }
    }
}
