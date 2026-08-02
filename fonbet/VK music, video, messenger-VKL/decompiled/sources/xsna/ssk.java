package xsna;

import android.net.Uri;
import android.util.Log;
import androidx.media3.datasource.a;
import androidx.media3.datasource.g;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* compiled from: DashManifestCacheRefresher.kt */
/* loaded from: classes8.dex */
public final class ssk {
    public final g.a a;
    public final van b;
    public final int c;
    public final com.vk.movika.sdk.base.logic.interactor.l d;
    public androidx.media3.datasource.a e;
    public androidx.media3.datasource.cache.a f;

    /* compiled from: DashManifestCacheRefresher.kt */
    public static final class b implements a.InterfaceC0045a {
        public final byte[] a;

        public b(byte[] bArr) {
            this.a = bArr;
        }

        @Override // androidx.media3.datasource.a.InterfaceC0045a
        public final androidx.media3.datasource.a createDataSource() {
            return new a(this.a);
        }
    }

    public ssk(g.a aVar, van vanVar) {
        com.vk.movika.sdk.base.logic.interactor.l lVar = new com.vk.movika.sdk.base.logic.interactor.l(17);
        this.a = aVar;
        this.b = vanVar;
        this.c = 8192;
        this.d = lVar;
    }

    public static void f(byte[] bArr, Uri uri) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                new usk(false).a(uri, byteArrayInputStream);
                byteArrayInputStream.close();
                Objects.toString(uri);
            } finally {
            }
        } catch (Exception e) {
            Log.e("DashManifestRefresher", "Failed to parse DASH MPD uri=" + uri, e);
            throw new IOException("Failed to parse DASH MPD", e);
        }
    }

    public final void a() {
        try {
            androidx.media3.datasource.cache.a aVar = this.f;
            if (aVar != null) {
                aVar.close();
            }
        } catch (Exception e) {
            Log.e("DashManifestRefresher", "close data source exception", e);
        } finally {
            this.f = null;
        }
    }

    public final void b() {
        try {
            androidx.media3.datasource.a aVar = this.e;
            if (aVar != null) {
                aVar.close();
            }
        } catch (Exception e) {
            Log.e("DashManifestRefresher", "close data source exception", e);
        } finally {
            this.e = null;
        }
    }

    public final byte[] c(Uri uri) throws IOException {
        androidx.media3.datasource.g createDataSource = this.a.createDataSource();
        this.e = createDataSource;
        Map map = Collections.EMPTY_MAP;
        fxc0.t(uri, "The uri must be set.");
        evk evkVar = new evk(uri, 0L, 1, null, map, 0L, -1L, null, 1, null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = this.c;
        byte[] bArr = new byte[i];
        try {
            try {
                Objects.toString(uri);
                createDataSource.open(evkVar);
                while (true) {
                    int read = createDataSource.a.read(bArr, 0, i);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                b();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                if (byteArray.length != 0) {
                    Objects.toString(uri);
                    return byteArray;
                }
                Log.e("DashManifestRefresher", "Downloaded manifest is empty uri=" + uri);
                throw new IOException("Downloaded DASH manifest is empty (uri=" + uri + ")");
            } catch (Exception e) {
                Log.e("DashManifestRefresher", "Failed to download manifest uri=" + uri, e);
                throw new IOException("Failed to download DASH manifest (uri=" + uri + ")", e);
            }
        } catch (Throwable th) {
            b();
            throw th;
        }
    }

    public final void d(String str) {
        long longValue = ((Number) this.d.invoke()).longValue();
        dij dijVar = new dij();
        dijVar.a(Long.valueOf(longValue), "onevideo_dash_manifest_last_refresh_success_at_ms");
        this.b.d.f(str, dijVar);
    }

    public final synchronized void e(Uri uri) throws IOException {
        bhs0 bhs0Var = this.b.a;
        String uri2 = uri.toString();
        long j = ((adl) this.b.d.getContentMetadata(uri2)).get("onevideo_dash_manifest_last_refresh_success_at_ms");
        if (j != -1 && ((Number) this.d.invoke()).longValue() - j < 1800000) {
            uri.toString();
            return;
        }
        uri.toString();
        byte[] c = c(uri);
        f(c, uri);
        try {
            this.b.d.c(uri2);
            g(uri, uri2, c);
            d(uri2);
            uri.toString();
        } catch (Exception e) {
            Log.e("DashManifestRefresher", "Failed to refresh manifest uri=" + uri + " key=" + uri2, e);
            throw new IOException("Failed to refresh manifest cache (uri=" + uri + ", key=" + uri2 + ")", e);
        }
    }

    public final void g(Uri uri, String str, byte[] bArr) {
        androidx.media3.datasource.cache.a createDataSource = this.b.b(new b(bArr), false, null).createDataSource();
        this.f = createDataSource;
        try {
            Map map = Collections.EMPTY_MAP;
            long length = bArr.length;
            fxc0.t(uri, "The uri must be set.");
            new dy8(createDataSource, new evk(uri, 0L, 1, null, map, 0L, length, str, 0, null), null, null).a();
        } finally {
            a();
        }
    }

    /* compiled from: DashManifestCacheRefresher.kt */
    public static final class a implements androidx.media3.datasource.a {
        public final byte[] a;
        public int b;
        public int c;
        public boolean d;
        public Uri e;

        public a(byte[] bArr) {
            this.a = bArr;
        }

        @Override // androidx.media3.datasource.a
        public final void close() {
            this.d = false;
            this.e = null;
        }

        @Override // androidx.media3.datasource.a
        public final Uri getUri() {
            return this.e;
        }

        @Override // androidx.media3.datasource.a
        public final long open(evk evkVar) {
            this.e = evkVar.a;
            int i = (int) evkVar.g;
            if (i >= 0) {
                byte[] bArr = this.a;
                if (i <= bArr.length) {
                    this.b = i;
                    int length = bArr.length - i;
                    this.c = length;
                    long j = evkVar.h;
                    if (j != -1) {
                        this.c = Math.min(length, (int) j);
                    }
                    this.d = true;
                    return this.c;
                }
            }
            throw new IOException(lhg.a(i, "Invalid start position: "));
        }

        @Override // xsna.suk
        public final int read(byte[] bArr, int i, int i2) {
            if (!this.d) {
                throw new IOException("DataSource not opened");
            }
            int i3 = this.c;
            if (i3 == 0) {
                return -1;
            }
            int min = Math.min(i2, i3);
            int i4 = this.b;
            jw5.f(this.a, i, i4, bArr, i4 + min);
            this.b += min;
            this.c -= min;
            return min;
        }

        @Override // androidx.media3.datasource.a
        public final void addTransferListener(mjp0 mjp0Var) {
        }
    }
}
