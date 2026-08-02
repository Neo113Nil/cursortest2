package defpackage;

import com.google.android.gms.measurement.internal.g;
import com.yandex.div.core.util.binding.a;
import com.yandex.div.core.view2.Div2View;
import defpackage.cw5;
import defpackage.sls;
import defpackage.tls;
import defpackage.zy11;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.zip.GZIPOutputStream;
import kotlin.Pair;
import ru.yandex.common.network.Request;

/* loaded from: classes11.dex */
public final class h3k implements Runnable {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;
    public final Object w;
    public final Object x;
    public final Object y;
    public final /* synthetic */ Object z;

    public h3k(hva1 hva1Var, String str, URL url, byte[] bArr, HashMap hashMap, qua1 qua1Var) {
        Objects.requireNonNull(hva1Var);
        this.z = hva1Var;
        cvw.i(str);
        this.b = url;
        this.c = bArr;
        this.w = qua1Var;
        this.x = str;
        this.y = hashMap;
    }

    public void a(int i, IOException iOException, byte[] bArr, Map map) {
        aaa1 aaa1Var = ((g) ((hva1) this.z).b).z;
        g.g(aaa1Var);
        aaa1Var.Pg(new fes(this, i, iOException, bArr, map));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v17 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean dataInternal;
        Throwable th;
        OutputStream outputStream;
        HttpURLConnection httpURLConnection;
        Map map;
        IOException iOException;
        OutputStream outputStream2;
        Map map2;
        int responseCode;
        InputStream inputStream;
        int i = this.a;
        Object obj = this.y;
        Object obj2 = this.b;
        Object obj3 = this.z;
        int i2 = 0;
        ?? r6 = 1;
        Object obj4 = this.x;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                final a aVar = (a) obj2;
                final bw5 a = aVar.b.a();
                try {
                    try {
                        aVar.d = true;
                        ArrayList arrayList = aVar.e;
                        Div2View div2View = (Div2View) this.w;
                        omk omkVar = (omk) obj4;
                        omk omkVar2 = (omk) obj;
                        if (omkVar2 == null) {
                            omkVar2 = div2View.get_divData();
                        }
                        dataInternal = div2View.setDataInternal(omkVar, omkVar2, new zmk(((zmk) obj3).a));
                        Boolean valueOf = Boolean.valueOf(dataInternal);
                        List J0 = kotlin.collections.a.J0(arrayList);
                        arrayList.clear();
                        Pair pair = new Pair(valueOf, J0);
                        aVar.d = false;
                        final Object first = pair.getFirst();
                        final List list = (List) pair.getSecond();
                        if (list.isEmpty() && ((tls) obj5) == null) {
                            cw5.b(a);
                            return;
                        } else {
                            final tls tlsVar = (tls) obj5;
                            ngd0.G.t(new sls() { // from class: com.yandex.div.core.view2.Div2View$setDataAsync$$inlined$runOnBindingThread$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // defpackage.sls
                                public final Object invoke() {
                                    com.yandex.div.core.util.binding.a.this.b.d();
                                    try {
                                        Iterator it = list.iterator();
                                        while (it.hasNext()) {
                                            ((sls) it.next()).invoke();
                                        }
                                        tls tlsVar2 = tlsVar;
                                        if (tlsVar2 != null) {
                                            tlsVar2.invoke(first);
                                        }
                                        cw5 cw5Var = com.yandex.div.core.util.binding.a.this.b;
                                        cw5.b(a);
                                        return zy11.a;
                                    } catch (Throwable th2) {
                                        cw5 cw5Var2 = com.yandex.div.core.util.binding.a.this.b;
                                        cw5.b(a);
                                        throw th2;
                                    }
                                }
                            });
                            return;
                        }
                    } finally {
                        cw5.b(a);
                    }
                } catch (Throwable th2) {
                    aVar.d = false;
                    throw th2;
                }
            default:
                String str = (String) obj4;
                hva1 hva1Var = (hva1) obj3;
                g gVar = (g) hva1Var.b;
                g gVar2 = (g) hva1Var.b;
                aaa1 aaa1Var = gVar.z;
                g.g(aaa1Var);
                aaa1Var.Kg();
                try {
                    URLConnection openConnection = ((URL) obj2).openConnection();
                    if (!(openConnection instanceof HttpURLConnection)) {
                        throw new IOException("Failed to obtain HTTP connection");
                    }
                    httpURLConnection = (HttpURLConnection) openConnection;
                    httpURLConnection.setDefaultUseCaches(false);
                    gVar2.getClass();
                    httpURLConnection.setConnectTimeout(60000);
                    httpURLConnection.setReadTimeout(61000);
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoInput(true);
                    try {
                        try {
                            Map map3 = (Map) obj;
                            if (map3 != null) {
                                for (Map.Entry entry : map3.entrySet()) {
                                    httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                                }
                            }
                            byte[] bArr = (byte[]) obj5;
                            if (bArr != null) {
                                try {
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                                    gZIPOutputStream.write(bArr);
                                    gZIPOutputStream.close();
                                    byteArrayOutputStream.close();
                                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                                    y1a1 y1a1Var = gVar2.y;
                                    g.g(y1a1Var);
                                    l1a1 l1a1Var = y1a1Var.H;
                                    int length = byteArray.length;
                                    l1a1Var.b(Integer.valueOf(length), "Uploading data. size");
                                    httpURLConnection.setDoOutput(true);
                                    String str2 = Request.PARAM_GZIP;
                                    httpURLConnection.addRequestProperty("Content-Encoding", Request.PARAM_GZIP);
                                    httpURLConnection.setFixedLengthStreamingMode(length);
                                    httpURLConnection.connect();
                                    OutputStream outputStream3 = httpURLConnection.getOutputStream();
                                    try {
                                        outputStream3.write(byteArray);
                                        outputStream3.close();
                                        r6 = str2;
                                    } catch (IOException e) {
                                        iOException = e;
                                        outputStream2 = outputStream3;
                                        map2 = null;
                                        if (outputStream2 != null) {
                                            try {
                                                outputStream2.close();
                                            } catch (IOException e2) {
                                                y1a1 y1a1Var2 = gVar2.y;
                                                g.g(y1a1Var2);
                                                y1a1Var2.z.c("Error closing HTTP compressed POST connection output stream. appId", y1a1.Og(str), e2);
                                            }
                                        }
                                        if (httpURLConnection != null) {
                                            httpURLConnection.disconnect();
                                        }
                                        a(i2, iOException, null, map2);
                                        return;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        outputStream = outputStream3;
                                        map = null;
                                        if (outputStream != null) {
                                            try {
                                                outputStream.close();
                                            } catch (IOException e3) {
                                                y1a1 y1a1Var3 = gVar2.y;
                                                g.g(y1a1Var3);
                                                y1a1Var3.z.c("Error closing HTTP compressed POST connection output stream. appId", y1a1.Og(str), e3);
                                            }
                                        }
                                        if (httpURLConnection != null) {
                                            httpURLConnection.disconnect();
                                        }
                                        a(i2, null, null, map);
                                        throw th;
                                    }
                                } catch (IOException e4) {
                                    y1a1 y1a1Var4 = gVar2.y;
                                    g.g(y1a1Var4);
                                    y1a1Var4.z.b(e4, "Failed to gzip post request content");
                                    throw e4;
                                }
                            }
                            responseCode = httpURLConnection.getResponseCode();
                        } catch (IOException e5) {
                            iOException = e5;
                            outputStream2 = null;
                            map2 = null;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        outputStream = null;
                        map = null;
                    }
                    try {
                        try {
                            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                            try {
                                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                inputStream = httpURLConnection.getInputStream();
                                try {
                                    byte[] bArr2 = new byte[1024];
                                    while (true) {
                                        int read = inputStream.read(bArr2);
                                        if (read <= 0) {
                                            byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                                            inputStream.close();
                                            httpURLConnection.disconnect();
                                            a(responseCode, null, byteArray2, headerFields);
                                            return;
                                        }
                                        byteArrayOutputStream2.write(bArr2, 0, read);
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                inputStream = null;
                            }
                        } catch (IOException e6) {
                            i2 = responseCode;
                            iOException = e6;
                            outputStream2 = null;
                            map2 = r6;
                            if (outputStream2 != null) {
                            }
                            if (httpURLConnection != null) {
                            }
                            a(i2, iOException, null, map2);
                            return;
                        } catch (Throwable th7) {
                            i2 = responseCode;
                            th = th7;
                            outputStream = null;
                            map = r6;
                            if (outputStream != null) {
                            }
                            if (httpURLConnection != null) {
                            }
                            a(i2, null, null, map);
                            throw th;
                        }
                    } catch (IOException e7) {
                        i2 = responseCode;
                        map2 = null;
                        iOException = e7;
                        outputStream2 = null;
                        if (outputStream2 != null) {
                        }
                        if (httpURLConnection != null) {
                        }
                        a(i2, iOException, null, map2);
                        return;
                    } catch (Throwable th8) {
                        i2 = responseCode;
                        map = null;
                        th = th8;
                        outputStream = null;
                        if (outputStream != null) {
                        }
                        if (httpURLConnection != null) {
                        }
                        a(i2, null, null, map);
                        throw th;
                    }
                } catch (IOException e8) {
                    iOException = e8;
                    outputStream2 = null;
                    httpURLConnection = null;
                    map2 = null;
                } catch (Throwable th9) {
                    th = th9;
                    outputStream = null;
                    httpURLConnection = null;
                    map = null;
                }
        }
    }

    public h3k(a aVar, tls tlsVar, Div2View div2View, omk omkVar, omk omkVar2, zmk zmkVar) {
        this.b = aVar;
        this.c = tlsVar;
        this.w = div2View;
        this.x = omkVar;
        this.y = omkVar2;
        this.z = zmkVar;
    }
}
