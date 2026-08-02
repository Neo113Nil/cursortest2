package xsna;

import com.mbridge.msdk.foundation.tools.SameMD5;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.log.L;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.text.Regex;
import okhttp3.Protocol;
import okhttp3.TlsVersion;
import okhttp3.k;
import okhttp3.l;
import okhttp3.m;
import okio.ByteString;
import xsna.nbn;
import xsna.uzk0;
import xsna.vl8.a;

/* compiled from: HttpCache.kt */
/* loaded from: classes2.dex */
public final class giv implements Closeable, Flushable {
    public final ax8 b;
    public final nbn c;

    /* compiled from: HttpCache.kt */
    public static final class a extends okhttp3.v {
        public final nbn.e d;
        public final String e;
        public final String f;
        public final e8f0 g;

        /* compiled from: HttpCache.kt */
        /* renamed from: xsna.giv$a$a, reason: collision with other inner class name */
        public static final class C2946a extends cas {
            public final /* synthetic */ a b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2946a(i3x i3xVar, a aVar) {
                super(i3xVar);
                this.b = aVar;
            }

            @Override // xsna.cas, java.io.Closeable, java.lang.AutoCloseable
            public final void close() throws IOException {
                this.b.d.close();
                super.close();
            }
        }

        public a(nbn.e eVar, String str, String str2) {
            this.d = eVar;
            this.e = str;
            this.f = str2;
            this.g = new e8f0(new C2946a(mq9.d(eVar.e[1]), this));
        }

        @Override // okhttp3.v
        public final long contentLength() {
            String str = this.f;
            if (str == null) {
                return -1L;
            }
            byte[] bArr = x2r0.a;
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException unused) {
                return -1L;
            }
        }

        @Override // okhttp3.v
        public final okhttp3.m contentType() {
            String str = this.e;
            if (str == null) {
                return null;
            }
            Pattern pattern = okhttp3.m.e;
            try {
                return m.a.a(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @Override // okhttp3.v
        public final bn8 source() {
            return this.g;
        }
    }

    /* compiled from: HttpCache.kt */
    public static final class b {
        public static int a(e8f0 e8f0Var) throws IOException {
            try {
                long m = e8f0Var.m();
                String s1 = e8f0Var.s1(Long.MAX_VALUE);
                if (m >= 0 && m <= 2147483647L && s1.length() <= 0) {
                    return (int) m;
                }
                throw new IOException("expected an int but was \"" + m + s1 + '\"');
            } catch (NumberFormatException e) {
                L.j(e, "HttpCache");
                throw new IOException(e.getMessage());
            }
        }

        public static Set b(okhttp3.k kVar) {
            int size = kVar.size();
            TreeSet treeSet = null;
            for (int i = 0; i < size; i++) {
                if ("Vary".equalsIgnoreCase(kVar.c(i))) {
                    String f = kVar.f(i);
                    if (treeSet == null) {
                        treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                    }
                    Iterator it = drm0.b0(f, new char[]{','}, 0, 6).iterator();
                    while (it.hasNext()) {
                        treeSet.add(drm0.p0((String) it.next()).toString());
                    }
                }
            }
            return treeSet == null ? EmptySet.b : treeSet;
        }
    }

    /* compiled from: HttpCache.kt */
    public final class d {
        public final nbn.c a;
        public final p190 b;
        public final a c;
        public boolean d;

        /* compiled from: HttpCache.kt */
        public static final class a extends bas {
            public final /* synthetic */ giv c;
            public final /* synthetic */ d d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(giv givVar, d dVar, p190 p190Var) {
                super(p190Var);
                this.c = givVar;
                this.d = dVar;
            }

            @Override // xsna.bas, xsna.qwj0, java.io.Closeable, java.lang.AutoCloseable
            public final void close() throws IOException {
                giv givVar = this.c;
                d dVar = this.d;
                synchronized (givVar) {
                    if (dVar.d) {
                        return;
                    }
                    dVar.d = true;
                    s3q0 s3q0Var = s3q0.a;
                    super.close();
                    this.d.a.b();
                }
            }
        }

        public d(nbn.c cVar) {
            this.a = cVar;
            p190 b = mq9.b(cVar.c(1));
            this.b = b;
            this.c = new a(giv.this, this, b);
        }

        public final void a() {
            synchronized (giv.this) {
                if (this.d) {
                    return;
                }
                this.d = true;
                s3q0 s3q0Var = s3q0.a;
                x2r0.c(this.b);
                try {
                    this.a.a();
                } catch (IOException e) {
                    L.j(e, "HttpCache");
                }
            }
        }
    }

    public giv(File file, long j, ax8 ax8Var) {
        this.b = ax8Var;
        this.c = nbn.n(file, 2, j);
    }

    public final String b(okhttp3.p pVar) {
        vl8 vl8Var = new vl8();
        okhttp3.l lVar = pVar.a;
        okhttp3.t tVar = pVar.d;
        String str = lVar.i;
        vl8Var.Q(0, str.length(), str);
        if (epx.f(pVar.b, "POST")) {
            zw8 a2 = this.b.a(lVar.b());
            if (a2 != null) {
                vl8 vl8Var2 = new vl8();
                if (tVar != null) {
                    tVar.writeTo(vl8Var2);
                }
                String x = vl8Var2.x();
                Regex regex = a2.c;
                if (regex != null) {
                    String g = regex.g(x, "");
                    if (brm0.B(g, "&", false)) {
                        g = g.substring(1);
                    }
                    x = brm0.v(g, "&", false) ? qoy.c(1, 0, g) : g;
                }
                vl8Var.S(x);
            } else if (tVar != null) {
                tVar.writeTo(vl8Var);
            }
        }
        MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
        m4i0 m4i0Var = vl8Var.b;
        if (m4i0Var != null) {
            byte[] bArr = m4i0Var.a;
            int i = m4i0Var.b;
            messageDigest.update(bArr, i, m4i0Var.c - i);
            for (m4i0 m4i0Var2 = m4i0Var.f; m4i0Var2 != m4i0Var; m4i0Var2 = m4i0Var2.f) {
                byte[] bArr2 = m4i0Var2.a;
                int i2 = m4i0Var2.b;
                messageDigest.update(bArr2, i2, m4i0Var2.c - i2);
            }
        }
        String o = new ByteString(messageDigest.digest()).o();
        L.e("HttpCache", "For " + lVar + " cache key is \"" + o + "\".");
        return o;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.c.close();
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        nbn nbnVar = this.c;
        synchronized (nbnVar) {
            if (nbnVar.j == null) {
                throw new IllegalStateException("cache is closed");
            }
            nbnVar.v();
            nbnVar.j.flush();
        }
    }

    /* compiled from: HttpCache.kt */
    public static final class c {
        public static final String k;
        public static final String l;
        public final okhttp3.l a;
        public final okhttp3.k b;
        public final String c;
        public final Protocol d;
        public final int e;
        public final String f;
        public final okhttp3.k g;
        public final okhttp3.j h;
        public final long i;
        public final long j;

        static {
            fta0 fta0Var = fta0.a;
            fta0.a.getClass();
            k = "OkHttp-Sent-Millis";
            fta0.a.getClass();
            l = "OkHttp-Received-Millis";
        }

        public c(i3x i3xVar) throws IOException {
            okhttp3.l lVar;
            TlsVersion tlsVersion;
            try {
                e8f0 e8f0Var = new e8f0(i3xVar);
                String s1 = e8f0Var.s1(Long.MAX_VALUE);
                try {
                    l.a aVar = new l.a();
                    aVar.e(null, s1);
                    lVar = aVar.b();
                } catch (IllegalArgumentException unused) {
                    lVar = null;
                }
                if (lVar == null) {
                    IOException iOException = new IOException("Cache corruption for ".concat(s1));
                    fta0 fta0Var = fta0.a;
                    fta0.a.getClass();
                    fta0.i(5, "cache corruption", iOException);
                    throw iOException;
                }
                this.a = lVar;
                this.c = e8f0Var.s1(Long.MAX_VALUE);
                k.a aVar2 = new k.a();
                int a = b.a(e8f0Var);
                for (int i = 0; i < a; i++) {
                    aVar2.a(e8f0Var.s1(Long.MAX_VALUE));
                }
                this.b = aVar2.e();
                uzk0 a2 = uzk0.a.a(e8f0Var.s1(Long.MAX_VALUE));
                this.d = a2.a;
                this.e = a2.b;
                this.f = a2.c;
                k.a aVar3 = new k.a();
                int a3 = b.a(e8f0Var);
                for (int i2 = 0; i2 < a3; i2++) {
                    aVar3.a(e8f0Var.s1(Long.MAX_VALUE));
                }
                String str = k;
                String f = aVar3.f(str);
                String str2 = l;
                String f2 = aVar3.f(str2);
                aVar3.g(str);
                aVar3.g(str2);
                this.i = f != null ? Long.parseLong(f) : 0L;
                this.j = f2 != null ? Long.parseLong(f2) : 0L;
                this.g = aVar3.e();
                if (epx.f(this.a.a, HttpRequest.DEFAULT_SCHEME)) {
                    String s12 = e8f0Var.s1(Long.MAX_VALUE);
                    if (s12.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + s12 + '\"');
                    }
                    String s13 = e8f0Var.s1(Long.MAX_VALUE);
                    if (s13.equals("EMPTY_HANDSHAKE_INFO")) {
                        this.h = null;
                    } else {
                        okhttp3.e b = okhttp3.e.b.b(s13);
                        List a4 = a(e8f0Var);
                        List a5 = a(e8f0Var);
                        if (e8f0Var.W1()) {
                            tlsVersion = TlsVersion.SSL_3_0;
                        } else {
                            TlsVersion.a aVar4 = TlsVersion.Companion;
                            String s14 = e8f0Var.s1(Long.MAX_VALUE);
                            aVar4.getClass();
                            tlsVersion = TlsVersion.a.a(s14);
                        }
                        this.h = new okhttp3.j(tlsVersion, b, x2r0.w(a5), new okhttp3.i(x2r0.w(a4)));
                    }
                } else {
                    this.h = null;
                }
                s3q0 s3q0Var = s3q0.a;
                i3xVar.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ro.e(i3xVar, th);
                    throw th2;
                }
            }
        }

        public static List a(e8f0 e8f0Var) throws IOException {
            int a = b.a(e8f0Var);
            if (a == -1) {
                return EmptyList.b;
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
                ArrayList arrayList = new ArrayList(a);
                for (int i = 0; i < a; i++) {
                    String s1 = e8f0Var.s1(Long.MAX_VALUE);
                    vl8 vl8Var = new vl8();
                    byte[] a2 = okio.a.a(s1);
                    vl8Var.H(a2 != null ? new ByteString(a2) : null);
                    arrayList.add(certificateFactory.generateCertificate(vl8Var.new a()));
                }
                return arrayList;
            } catch (CertificateException e) {
                L.j(e, "HttpCache");
                throw new IOException(e.getMessage());
            }
        }

        public static void b(d8f0 d8f0Var, List list) throws IOException {
            try {
                d8f0Var.v0(list.size());
                d8f0Var.writeByte(10);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    d8f0Var.y1(ByteString.a.c(((Certificate) it.next()).getEncoded()).h());
                    d8f0Var.writeByte(10);
                }
            } catch (CertificateEncodingException e) {
                L.j(e, "HttpCache");
                throw new IOException(e.getMessage());
            }
        }

        public final void c(nbn.c cVar) throws IOException {
            okhttp3.l lVar = this.a;
            okhttp3.k kVar = this.g;
            okhttp3.k kVar2 = this.b;
            d8f0 d8f0Var = new d8f0(mq9.b(cVar.c(0)));
            try {
                d8f0Var.y1(lVar.i);
                d8f0Var.writeByte(10);
                d8f0Var.y1(this.c);
                d8f0Var.writeByte(10);
                d8f0Var.v0(kVar2.size());
                d8f0Var.writeByte(10);
                int size = kVar2.size();
                for (int i = 0; i < size; i++) {
                    d8f0Var.y1(kVar2.c(i));
                    d8f0Var.y1(": ");
                    d8f0Var.y1(kVar2.f(i));
                    d8f0Var.writeByte(10);
                }
                Protocol protocol = this.d;
                int i2 = this.e;
                String str = this.f;
                StringBuilder sb = new StringBuilder();
                if (protocol == Protocol.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(i2);
                sb.append(' ');
                sb.append(str);
                d8f0Var.y1(sb.toString());
                d8f0Var.writeByte(10);
                d8f0Var.v0(kVar.size() + 2);
                d8f0Var.writeByte(10);
                int size2 = kVar.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    d8f0Var.y1(kVar.c(i3));
                    d8f0Var.y1(": ");
                    d8f0Var.y1(kVar.f(i3));
                    d8f0Var.writeByte(10);
                }
                d8f0Var.y1(k);
                d8f0Var.y1(": ");
                d8f0Var.v0(this.i);
                d8f0Var.writeByte(10);
                d8f0Var.y1(l);
                d8f0Var.y1(": ");
                d8f0Var.v0(this.j);
                d8f0Var.writeByte(10);
                if (epx.f(lVar.a, HttpRequest.DEFAULT_SCHEME)) {
                    d8f0Var.writeByte(10);
                    okhttp3.j jVar = this.h;
                    if (jVar == null) {
                        d8f0Var.y1("EMPTY_HANDSHAKE_INFO");
                        d8f0Var.writeByte(10);
                    } else {
                        d8f0Var.y1(jVar.b.a);
                        d8f0Var.writeByte(10);
                        b(d8f0Var, jVar.c());
                        b(d8f0Var, jVar.c);
                        d8f0Var.y1(jVar.a.h());
                        d8f0Var.writeByte(10);
                    }
                }
                s3q0 s3q0Var = s3q0.a;
                d8f0Var.close();
            } finally {
            }
        }

        public c(okhttp3.u uVar) {
            okhttp3.k e;
            okhttp3.p pVar = uVar.b;
            this.a = pVar.a;
            okhttp3.k kVar = uVar.i.b.c;
            okhttp3.k kVar2 = uVar.g;
            Set b = b.b(kVar2);
            if (b.isEmpty()) {
                e = x2r0.b;
            } else {
                k.a aVar = new k.a();
                int size = kVar.size();
                for (int i = 0; i < size; i++) {
                    String c = kVar.c(i);
                    if (b.contains(c)) {
                        aVar.b(c, kVar.f(i));
                    }
                }
                e = aVar.e();
            }
            this.b = e;
            this.c = pVar.b;
            this.d = uVar.c;
            this.e = uVar.e;
            this.f = uVar.d;
            this.g = kVar2;
            this.h = uVar.f;
            this.i = uVar.l;
            this.j = uVar.m;
        }
    }
}
