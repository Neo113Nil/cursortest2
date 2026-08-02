package xsna;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import xsna.i360;
import xsna.xkv;

/* compiled from: HttpUrlConnectionNetworkFetcher.java */
/* loaded from: classes12.dex */
public final class vkv implements Runnable {
    public final /* synthetic */ xkv.a b;
    public final /* synthetic */ i360.a c;
    public final /* synthetic */ xkv d;

    public vkv(xkv xkvVar, xkv.a aVar, i360.a aVar2) {
        this.d = xkvVar;
        this.b = aVar;
        this.c = aVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0, types: [xsna.i360$a] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.io.InputStream, java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v5 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        HttpURLConnection httpURLConnection;
        xkv xkvVar = this.d;
        xkv.a aVar = this.b;
        ?? r2 = this.c;
        ?? r3 = 0;
        InputStream inputStream = null;
        r3 = 0;
        try {
            try {
                httpURLConnection = xkvVar.g(5, aVar.b());
                try {
                    aVar.e = xkvVar.c.now();
                    if (httpURLConnection != null) {
                        r3 = httpURLConnection.getInputStream();
                        r2.c(r3, -1);
                        inputStream = r3;
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                        }
                    }
                    if (httpURLConnection == null) {
                        return;
                    }
                } catch (IOException e) {
                    e = e;
                    r2.b(e);
                    if (r3 != 0) {
                        try {
                            r3.close();
                        } catch (IOException unused2) {
                        }
                    }
                    if (httpURLConnection == null) {
                        return;
                    }
                    httpURLConnection.disconnect();
                }
            } catch (Throwable th) {
                th = th;
                if (0 != 0) {
                    try {
                        r3.close();
                    } catch (IOException unused3) {
                    }
                }
                if (0 != 0) {
                    throw th;
                }
                r3.disconnect();
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            httpURLConnection = null;
        } catch (Throwable th2) {
            th = th2;
            if (0 != 0) {
            }
            if (0 != 0) {
            }
        }
        httpURLConnection.disconnect();
    }
}
