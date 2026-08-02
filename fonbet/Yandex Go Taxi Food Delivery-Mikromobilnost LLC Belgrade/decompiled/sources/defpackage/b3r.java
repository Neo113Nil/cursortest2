package defpackage;

import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Pair;
import kotlin.collections.b;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes15.dex */
public final class b3r extends w920 {
    public final /* synthetic */ c3r a;

    public b3r(c3r c3rVar) {
        this.a = c3rVar;
    }

    @Override // defpackage.w920
    public final gg70 d(kvj0 kvj0Var) {
        c3r c3rVar = this.a;
        String str = c3rVar.e;
        b7m b7mVar = c3rVar.j;
        String str2 = c3rVar.d;
        boolean z = kvj0Var.J;
        String str3 = kvj0Var.c;
        int i = kvj0Var.w;
        if (!z) {
            b7mVar.b(str2, str, i + " : " + str3);
            return gg70.b(i, str3);
        }
        rvj0 rvj0Var = kvj0Var.z;
        if (rvj0Var == null) {
            b7mVar.b(str2, str, "empty response body");
            return gg70.b(i, str3);
        }
        kjf0 kjf0Var = new kjf0(rvj0Var, new xen(9, this));
        oyq oyqVar = c3rVar.c;
        InputStream byteStream = kjf0Var.byteStream();
        rvj0 rvj0Var2 = kjf0Var.a;
        wg10 contentType = rvj0Var2.contentType();
        oyqVar.getClass();
        try {
            oyqVar.c(contentType).a(byteStream, str2);
            if (ydz.a.a()) {
                ydz.a();
            }
            long contentLength = rvj0Var2.contentLength();
            wg10 contentType2 = rvj0Var2.contentType();
            x22 x22Var = b7mVar.a;
            Pair pair = new Pair("fileId", str2);
            Pair pair2 = new Pair("size", Long.valueOf(contentLength));
            Long l = (Long) b7mVar.c.get(str2);
            Pair pair3 = new Pair(RemoteBioParameters.TIME, l != null ? Long.valueOf(SystemClock.elapsedRealtime() - l.longValue()) : null);
            Pair pair4 = new Pair("mimeType", contentType2 != null ? contentType2.a : null);
            String f0 = evu0.f0('/', str2, str2);
            x22Var.reportEvent("file_download_succeed", b.i(pair, pair2, pair3, pair4, new Pair("source", evu0.J(f0) ? null : f0), new Pair("file_ext", b7m.a(str))));
            return new dg70(str2);
        } catch (IOException e) {
            if (ydz.a.a()) {
                ydz.c("FileCacheManager", "putSafeResolving to " + str2 + " failed", e);
            }
            b7mVar.b(str2, str, "file was not saved");
            return gg70.b(i, str3);
        }
    }

    @Override // defpackage.w920
    public final boolean e(ngz ngzVar) {
        String str = ngzVar.c;
        Object obj = (str == null || !str.equalsIgnoreCase("Not found")) ? z6m.a : y6m.a;
        c3r c3rVar = this.a;
        c3rVar.f.D(new iyj0(obj));
        c3rVar.i.a(c3rVar.d, new IOException(ngzVar.d));
        return true;
    }

    @Override // defpackage.w920
    public final void g(Object obj) {
        String str = (String) obj;
        c3r c3rVar = this.a;
        c3rVar.f.D(new myj0(str));
        lyq b = c3rVar.c.b(str);
        long a = b != null ? b.a() : 0L;
        c3rVar.i.b(a, a, str);
        a1r a1rVar = c3rVar.i;
        a1rVar.d.post(new v0r(a1rVar, str, 1));
    }

    @Override // defpackage.w920
    public final t4j0 i() {
        c3r c3rVar = this.a;
        b7m b7mVar = c3rVar.j;
        String str = c3rVar.d;
        String str2 = c3rVar.e;
        b7mVar.c.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
        x22 x22Var = b7mVar.a;
        Pair pair = new Pair("fileId", str);
        String f0 = evu0.f0('/', str, str);
        if (evu0.J(f0)) {
            f0 = null;
        }
        x22Var.reportEvent("file_download_start", b.i(pair, new Pair("source", f0), new Pair("file_ext", b7m.a(str2))));
        a1r a1rVar = c3rVar.i;
        a1rVar.d.post(new v0r(a1rVar, str, 2));
        return c3rVar.a.a(str, c3rVar.b);
    }
}
