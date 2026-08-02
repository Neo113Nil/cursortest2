package defpackage;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes10.dex */
public final class bw60 extends nz4 implements xuu {
    public boolean A;
    public long B;
    public long C;
    public final xf7 a;
    public final wuu b;
    public final za7 c;
    public final wuu w;
    public npg x;
    public kvj0 y;
    public InputStream z;

    static {
        ge10.a("media3.datasource.okhttp");
    }

    public bw60(xf7 xf7Var, za7 za7Var, wuu wuuVar) {
        super(true);
        xf7Var.getClass();
        this.a = xf7Var;
        this.c = za7Var;
        this.w = wuuVar;
        this.b = new wuu();
    }

    public final void a() {
        kvj0 kvj0Var = this.y;
        if (kvj0Var != null) {
            rvj0 rvj0Var = kvj0Var.z;
            rvj0Var.getClass();
            rvj0Var.close();
        }
        this.z = null;
    }

    public final void b(long j, npg npgVar) {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            try {
                int min = (int) Math.min(j, PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
                InputStream inputStream = this.z;
                int i = tw21.a;
                int read = inputStream.read(bArr, 0, min);
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedIOException();
                }
                if (read == -1) {
                    throw new HttpDataSource$HttpDataSourceException(npgVar, 2008);
                }
                j -= read;
                bytesTransferred(read);
            } catch (IOException e) {
                if (!(e instanceof HttpDataSource$HttpDataSourceException)) {
                    throw new HttpDataSource$HttpDataSourceException(npgVar, 2000);
                }
                throw ((HttpDataSource$HttpDataSourceException) e);
            }
        }
    }

    @Override // defpackage.xuu
    public final void clearAllRequestProperties() {
        this.b.a();
    }

    @Override // defpackage.xuu
    public final void clearRequestProperty(String str) {
        str.getClass();
        this.b.d(str);
    }

    @Override // defpackage.kpg
    public final void close() {
        if (this.A) {
            this.A = false;
            transferEnded();
            a();
        }
        this.y = null;
        this.x = null;
    }

    @Override // defpackage.xuu
    public final int getResponseCode() {
        kvj0 kvj0Var = this.y;
        if (kvj0Var == null) {
            return -1;
        }
        return kvj0Var.w;
    }

    @Override // defpackage.kpg
    public final Map getResponseHeaders() {
        kvj0 kvj0Var = this.y;
        return kvj0Var == null ? Collections.EMPTY_MAP : kvj0Var.y.e();
    }

    @Override // defpackage.kpg
    /* renamed from: getUri */
    public final Uri getInflatedUri() {
        kvj0 kvj0Var = this.y;
        if (kvj0Var != null) {
            return Uri.parse(kvj0Var.a.a.i);
        }
        npg npgVar = this.x;
        if (npgVar != null) {
            return npgVar.a;
        }
        return null;
    }

    @Override // defpackage.kpg
    public final long open(npg npgVar) {
        l5j0 l5j0Var;
        byte[] bArr;
        this.x = npgVar;
        this.C = 0L;
        this.B = 0L;
        transferInitializing(npgVar);
        long j = npgVar.f;
        int i = npgVar.c;
        long j2 = npgVar.g;
        kwu h = kwu.h(npgVar.a.toString());
        if (h == null) {
            throw new HttpDataSource$HttpDataSourceException("Malformed URL", npgVar, 1004);
        }
        t4j0 t4j0Var = new t4j0();
        t4j0Var.a = h;
        za7 za7Var = this.c;
        if (za7Var != null) {
            t4j0Var.b(za7Var);
        }
        HashMap hashMap = new HashMap();
        wuu wuuVar = this.w;
        if (wuuVar != null) {
            hashMap.putAll(wuuVar.c());
        }
        hashMap.putAll(this.b.c());
        hashMap.putAll(npgVar.e);
        for (Map.Entry entry : hashMap.entrySet()) {
            t4j0Var.d((String) entry.getKey(), (String) entry.getValue());
        }
        String a = pwu.a(j, j2);
        if (a != null) {
            t4j0Var.a("Range", a);
        }
        if (!npgVar.c(1)) {
            t4j0Var.a("Accept-Encoding", ClidProvider.IDENTITY);
        }
        byte[] bArr2 = npgVar.d;
        if (bArr2 != null) {
            int i2 = m5j0.a;
            l5j0Var = wms.b(7, null, bArr2);
        } else if (i == 2) {
            byte[] bArr3 = tw21.c;
            int i3 = m5j0.a;
            l5j0Var = wms.b(7, null, bArr3);
        } else {
            l5j0Var = null;
        }
        t4j0Var.e(npg.b(i), l5j0Var);
        yf7 newCall = this.a.newCall(new d5j0(t4j0Var));
        try {
            w4r0 w4r0Var = new w4r0();
            newCall.I(new fl10(w4r0Var));
            try {
                kvj0 kvj0Var = (kvj0) w4r0Var.get();
                this.y = kvj0Var;
                rvj0 rvj0Var = kvj0Var.z;
                rvj0Var.getClass();
                this.z = rvj0Var.byteStream();
                int i4 = kvj0Var.w;
                if (kvj0Var.J) {
                    rvj0Var.contentType();
                    long j3 = (i4 != 200 || j == 0) ? 0L : j;
                    if (j2 != -1) {
                        this.B = j2;
                    } else {
                        long contentLength = rvj0Var.contentLength();
                        this.B = contentLength != -1 ? contentLength - j3 : -1L;
                    }
                    this.A = true;
                    transferStarted(npgVar);
                    try {
                        b(j3, npgVar);
                        return this.B;
                    } catch (HttpDataSource$HttpDataSourceException e) {
                        a();
                        throw e;
                    }
                }
                if (i4 == 416 && j == pwu.c(kvj0Var.y.a("Content-Range"))) {
                    this.A = true;
                    transferStarted(npgVar);
                    if (j2 != -1) {
                        return j2;
                    }
                    return 0L;
                }
                try {
                    InputStream inputStream = this.z;
                    inputStream.getClass();
                    bArr = p77.b(inputStream);
                } catch (IOException unused) {
                    bArr = tw21.c;
                }
                byte[] bArr4 = bArr;
                TreeMap e2 = kvj0Var.y.e();
                a();
                throw new HttpDataSource$InvalidResponseCodeException(i4, kvj0Var.c, i4 == 416 ? new DataSourceException(2008) : null, e2, npgVar, bArr4);
            } catch (InterruptedException unused2) {
                newCall.cancel();
                throw new InterruptedIOException();
            } catch (ExecutionException e3) {
                throw new IOException(e3);
            }
        } catch (IOException e4) {
            throw HttpDataSource$HttpDataSourceException.a(e4, npgVar, 1);
        }
    }

    @Override // defpackage.apg
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.B;
            if (j != -1) {
                long j2 = j - this.C;
                if (j2 == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j2);
            }
            InputStream inputStream = this.z;
            int i3 = tw21.a;
            int read = inputStream.read(bArr, i, i2);
            if (read != -1) {
                this.C += read;
                bytesTransferred(read);
                return read;
            }
            return -1;
        } catch (IOException e) {
            npg npgVar = this.x;
            int i4 = tw21.a;
            throw HttpDataSource$HttpDataSourceException.a(e, npgVar, 2);
        }
    }

    @Override // defpackage.xuu
    public final void setRequestProperty(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.b.e(str, str2);
    }
}
