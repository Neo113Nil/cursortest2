package xsna;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.datasource.a;
import com.mbridge.msdk.foundation.download.Command;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;
import okhttp3.d;
import okhttp3.l;
import okhttp3.p;
import ru.ok.android.commons.http.Http;

/* compiled from: OkHttpDataSource.java */
/* loaded from: classes12.dex */
public final class ux70 extends gc6 {
    public long A;
    public final d.a r;
    public final xiv s;

    @Nullable
    public final String t;

    @Nullable
    public final xiv u;

    @Nullable
    public evk v;

    @Nullable
    public okhttp3.u w;

    @Nullable
    public InputStream x;
    public boolean y;
    public long z;

    /* compiled from: OkHttpDataSource.java */
    /* loaded from: classes.dex */
    public static final class a implements a.InterfaceC0045a {
        public final xiv a = new xiv();
        public final d.a b;

        @Nullable
        public String c;

        @Nullable
        public mjp0 d;

        public a(d.a aVar) {
            this.b = aVar;
        }

        @Override // androidx.media3.datasource.a.InterfaceC0045a
        public final androidx.media3.datasource.a createDataSource() {
            ux70 ux70Var = new ux70(this.b, this.c, this.a);
            mjp0 mjp0Var = this.d;
            if (mjp0Var != null) {
                ux70Var.addTransferListener(mjp0Var);
            }
            return ux70Var;
        }
    }

    static {
        nr10.a("media3.datasource.okhttp");
    }

    public ux70(d.a aVar, String str, xiv xivVar) {
        super(true);
        aVar.getClass();
        this.r = aVar;
        this.t = str;
        this.u = xivVar;
        this.s = new xiv();
    }

    public final void b() {
        okhttp3.u uVar = this.w;
        if (uVar != null) {
            okhttp3.v vVar = uVar.h;
            vVar.getClass();
            vVar.close();
        }
        this.x = null;
    }

    public final void c(long j, evk evkVar) throws HttpDataSource$HttpDataSourceException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            try {
                int min = (int) Math.min(j, 4096);
                InputStream inputStream = this.x;
                String str = y2r0.a;
                int read = inputStream.read(bArr, 0, min);
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedIOException();
                }
                if (read == -1) {
                    throw new HttpDataSource$HttpDataSourceException(evkVar, 2008);
                }
                j -= read;
                bytesTransferred(read);
            } catch (IOException e) {
                if (!(e instanceof HttpDataSource$HttpDataSourceException)) {
                    throw new HttpDataSource$HttpDataSourceException(evkVar, 2000);
                }
                throw ((HttpDataSource$HttpDataSourceException) e);
            }
        }
    }

    @Override // androidx.media3.datasource.a
    public final void close() {
        if (this.y) {
            this.y = false;
            transferEnded();
            b();
        }
        this.w = null;
        this.v = null;
    }

    @Override // androidx.media3.datasource.a
    public final Map<String, List<String>> getResponseHeaders() {
        okhttp3.u uVar = this.w;
        return uVar == null ? Collections.EMPTY_MAP : uVar.g.e();
    }

    @Override // androidx.media3.datasource.a
    @Nullable
    public final Uri getUri() {
        okhttp3.u uVar = this.w;
        if (uVar != null) {
            return Uri.parse(uVar.b.a.i);
        }
        evk evkVar = this.v;
        if (evkVar != null) {
            return evkVar.a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.datasource.a
    public final long open(evk evkVar) throws HttpDataSource$HttpDataSourceException {
        okhttp3.l lVar;
        byte[] bArr;
        this.v = evkVar;
        this.A = 0L;
        this.z = 0L;
        transferInitializing(evkVar);
        long j = evkVar.g;
        int i = evkVar.c;
        long j2 = evkVar.h;
        String uri = evkVar.a.toString();
        try {
            l.a aVar = new l.a();
            aVar.e(null, uri);
            lVar = aVar.b();
        } catch (IllegalArgumentException unused) {
            lVar = null;
        }
        if (lVar == null) {
            throw new HttpDataSource$HttpDataSourceException("Malformed URL", evkVar, 1004);
        }
        p.a aVar2 = new p.a();
        aVar2.a = lVar;
        HashMap hashMap = new HashMap();
        xiv xivVar = this.u;
        if (xivVar != null) {
            hashMap.putAll(xivVar.a());
        }
        hashMap.putAll(this.s.a());
        hashMap.putAll(evkVar.e);
        for (Map.Entry entry : hashMap.entrySet()) {
            aVar2.e((String) entry.getKey(), (String) entry.getValue());
        }
        String a2 = blv.a(j, j2);
        if (a2 != null) {
            aVar2.c.b(Command.HTTP_HEADER_RANGE, a2);
        }
        String str = this.t;
        if (str != null) {
            aVar2.c.b("User-Agent", str);
        }
        if (!evkVar.c(1)) {
            aVar2.c.b("Accept-Encoding", "identity");
        }
        byte[] bArr2 = evkVar.d;
        aVar2.f(evk.b(i), bArr2 != null ? okhttp3.t.create(bArr2) : i == 2 ? okhttp3.t.create(y2r0.b) : null);
        okhttp3.d a3 = this.r.a(aVar2.b());
        try {
            lzi0 lzi0Var = new lzi0();
            a3.f9(new mo8(lzi0Var));
            try {
                try {
                    okhttp3.u uVar = (okhttp3.u) lzi0Var.get();
                    this.w = uVar;
                    okhttp3.v vVar = uVar.h;
                    vVar.getClass();
                    this.x = vVar.byteStream();
                    int i2 = uVar.e;
                    if (uVar.t()) {
                        vVar.contentType();
                        long j3 = (i2 != 200 || j == 0) ? 0L : j;
                        if (j2 != -1) {
                            this.z = j2;
                        } else {
                            long contentLength = vVar.contentLength();
                            this.z = contentLength != -1 ? contentLength - j3 : -1L;
                        }
                        this.y = true;
                        transferStarted(evkVar);
                        try {
                            c(j3, evkVar);
                            return this.z;
                        } catch (HttpDataSource$HttpDataSourceException e) {
                            b();
                            throw e;
                        }
                    }
                    if (i2 == 416 && j == blv.c(uVar.g.a(Http.Header.CONTENT_RANGE))) {
                        this.y = true;
                        transferStarted(evkVar);
                        if (j2 != -1) {
                            return j2;
                        }
                        return 0L;
                    }
                    try {
                        InputStream inputStream = this.x;
                        inputStream.getClass();
                        bArr = ku8.b(inputStream);
                    } catch (IOException unused2) {
                        bArr = y2r0.b;
                    }
                    byte[] bArr3 = bArr;
                    TreeMap e2 = uVar.g.e();
                    b();
                    throw new HttpDataSource$InvalidResponseCodeException(i2, uVar.d, i2 == 416 ? new DataSourceException(2008) : null, e2, evkVar, bArr3);
                } catch (InterruptedException unused3) {
                    a3.cancel();
                    throw new InterruptedIOException();
                }
            } catch (ExecutionException e3) {
                throw new IOException(e3);
            }
        } catch (IOException e4) {
            throw HttpDataSource$HttpDataSourceException.a(e4, evkVar, 1);
        }
    }

    @Override // xsna.suk
    public final int read(byte[] bArr, int i, int i2) throws HttpDataSource$HttpDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.z;
            if (j != -1) {
                long j2 = j - this.A;
                if (j2 == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j2);
            }
            InputStream inputStream = this.x;
            String str = y2r0.a;
            int read = inputStream.read(bArr, i, i2);
            if (read != -1) {
                this.A += read;
                bytesTransferred(read);
                return read;
            }
            return -1;
        } catch (IOException e) {
            evk evkVar = this.v;
            String str2 = y2r0.a;
            throw HttpDataSource$HttpDataSourceException.a(e, evkVar, 2);
        }
    }
}
