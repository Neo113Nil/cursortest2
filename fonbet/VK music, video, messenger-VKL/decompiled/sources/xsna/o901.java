package xsna;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import ru.ok.android.commons.http.Http;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes13.dex */
public final class o901 implements Runnable {
    public final URL b;
    public final byte[] c;
    public final m901 d;
    public final String e;
    public final Map f;
    public final /* synthetic */ p901 g;

    public o901(p901 p901Var, String str, URL url, byte[] bArr, zk3 zk3Var, m901 m901Var) {
        this.g = p901Var;
        exc0.f(str);
        this.b = url;
        this.c = bArr;
        this.d = m901Var;
        this.e = str;
        this.f = zk3Var;
    }

    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0105: MOVE (r11 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:262), block:B:76:0x0103 */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0108: MOVE (r12 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:265), block:B:73:0x0107 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0160 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        HttpURLConnection httpURLConnection;
        Map map;
        IOException iOException;
        int i2;
        Map map2;
        Throwable th;
        Map map3;
        Map map4;
        InputStream inputStream;
        String str = this.e;
        p901 p901Var = this.g;
        mb01 mb01Var = (mb01) p901Var.b;
        mb01 mb01Var2 = (mb01) p901Var.b;
        kb01 kb01Var = mb01Var.k;
        mb01.k(kb01Var);
        kb01Var.o();
        OutputStream outputStream = null;
        try {
            URLConnection openConnection = this.b.openConnection();
            if (!(openConnection instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            mb01Var2.getClass();
            httpURLConnection.setConnectTimeout(60000);
            mb01Var2.getClass();
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            try {
                Map map5 = this.f;
                if (map5 != null) {
                    for (Map.Entry entry : map5.entrySet()) {
                        httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                byte[] bArr = this.c;
                if (bArr != null) {
                    sj01 sj01Var = p901Var.e.h;
                    qj01.I(sj01Var);
                    byte[] O = sj01Var.O(bArr);
                    k901 k901Var = mb01Var2.j;
                    mb01.k(k901Var);
                    i901 i901Var = k901Var.q;
                    int length = O.length;
                    i901Var.b(Integer.valueOf(length), "Uploading data. size");
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.addRequestProperty(Http.Header.CONTENT_ENCODING, Http.ContentEncoding.GZIP);
                    httpURLConnection.setFixedLengthStreamingMode(length);
                    httpURLConnection.connect();
                    OutputStream outputStream2 = httpURLConnection.getOutputStream();
                    try {
                        outputStream2.write(O);
                        outputStream2.close();
                    } catch (IOException e) {
                        iOException = e;
                        i2 = 0;
                        map2 = null;
                        outputStream = outputStream2;
                        if (outputStream != null) {
                        }
                        if (httpURLConnection != null) {
                        }
                        kb01 kb01Var2 = mb01Var2.k;
                        mb01.k(kb01Var2);
                        kb01Var2.s(new n901(this.e, this.d, i2, iOException, null, map2));
                    } catch (Throwable th2) {
                        th = th2;
                        i = 0;
                        map = null;
                        outputStream = outputStream2;
                        th = th;
                        if (outputStream != null) {
                        }
                        if (httpURLConnection != null) {
                        }
                        kb01 kb01Var3 = mb01Var2.k;
                        mb01.k(kb01Var3);
                        kb01Var3.s(new n901(this.e, this.d, i, null, null, map));
                        throw th;
                    }
                }
                int responseCode = httpURLConnection.getResponseCode();
                try {
                    try {
                        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            inputStream = httpURLConnection.getInputStream();
                            try {
                                byte[] bArr2 = new byte[1024];
                                while (true) {
                                    int read = inputStream.read(bArr2);
                                    if (read <= 0) {
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        inputStream.close();
                                        httpURLConnection.disconnect();
                                        kb01 kb01Var4 = mb01Var2.k;
                                        mb01.k(kb01Var4);
                                        kb01Var4.s(new n901(this.e, this.d, responseCode, null, byteArray, headerFields));
                                        return;
                                    }
                                    byteArrayOutputStream.write(bArr2, 0, read);
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            inputStream = null;
                        }
                    } catch (IOException e2) {
                        e = e2;
                        i2 = responseCode;
                        map2 = map4;
                        iOException = e;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException e3) {
                                k901 k901Var2 = mb01Var2.j;
                                mb01.k(k901Var2);
                                k901Var2.i.c("Error closing HTTP compressed POST connection output stream. appId", k901.r(str), e3);
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        kb01 kb01Var22 = mb01Var2.k;
                        mb01.k(kb01Var22);
                        kb01Var22.s(new n901(this.e, this.d, i2, iOException, null, map2));
                    } catch (Throwable th5) {
                        th = th5;
                        i = responseCode;
                        map = map3;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException e4) {
                                k901 k901Var3 = mb01Var2.j;
                                mb01.k(k901Var3);
                                k901Var3.i.c("Error closing HTTP compressed POST connection output stream. appId", k901.r(str), e4);
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        kb01 kb01Var32 = mb01Var2.k;
                        mb01.k(kb01Var32);
                        kb01Var32.s(new n901(this.e, this.d, i, null, null, map));
                        throw th;
                    }
                } catch (IOException e5) {
                    e = e5;
                    map2 = null;
                    i2 = responseCode;
                    iOException = e;
                    if (outputStream != null) {
                    }
                    if (httpURLConnection != null) {
                    }
                    kb01 kb01Var222 = mb01Var2.k;
                    mb01.k(kb01Var222);
                    kb01Var222.s(new n901(this.e, this.d, i2, iOException, null, map2));
                } catch (Throwable th6) {
                    th = th6;
                    map = null;
                    i = responseCode;
                    if (outputStream != null) {
                    }
                    if (httpURLConnection != null) {
                    }
                    kb01 kb01Var322 = mb01Var2.k;
                    mb01.k(kb01Var322);
                    kb01Var322.s(new n901(this.e, this.d, i, null, null, map));
                    throw th;
                }
            } catch (IOException e6) {
                iOException = e6;
                i2 = 0;
                map2 = null;
            } catch (Throwable th7) {
                th = th7;
                i = 0;
                map = null;
            }
        } catch (IOException e7) {
            iOException = e7;
            i2 = 0;
            httpURLConnection = null;
            map2 = null;
        } catch (Throwable th8) {
            th = th8;
            i = 0;
            httpURLConnection = null;
            map = null;
        }
    }
}
