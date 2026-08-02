package okhttp3;

import com.mbridge.msdk.foundation.tools.SameMD5;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.text.Regex;
import okhttp3.TlsVersion;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.k;
import okhttp3.l;
import okhttp3.m;
import okhttp3.p;
import okhttp3.u;
import okio.ByteString;
import ru.ok.android.commons.http.Http;
import xsna.agk0;
import xsna.bas;
import xsna.bn8;
import xsna.cas;
import xsna.d8f0;
import xsna.drm0;
import xsna.e8f0;
import xsna.emb;
import xsna.epx;
import xsna.fta0;
import xsna.jbn;
import xsna.qwj0;
import xsna.ro;
import xsna.rx8;
import xsna.s3q0;
import xsna.uzk0;
import xsna.vl8;
import xsna.vl8.a;
import xsna.x2r0;

/* compiled from: Cache.kt */
/* loaded from: classes8.dex */
public final class b implements Closeable, Flushable {
    public final jbn b;

    /* compiled from: Cache.kt */
    public static final class a extends v {
        public final jbn.c d;
        public final String e;
        public final String f;
        public final e8f0 g;

        /* compiled from: Cache.kt */
        /* renamed from: okhttp3.b$a$a, reason: collision with other inner class name */
        public static final class C2164a extends cas {
            public final /* synthetic */ a b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2164a(agk0 agk0Var, a aVar) {
                super(agk0Var);
                this.b = aVar;
            }

            @Override // xsna.cas, java.io.Closeable, java.lang.AutoCloseable
            public final void close() throws IOException {
                this.b.d.close();
                super.close();
            }
        }

        public a(jbn.c cVar, String str, String str2) {
            this.d = cVar;
            this.e = str;
            this.f = str2;
            this.g = new e8f0(new C2164a((agk0) cVar.d.get(1), this));
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
        public final m contentType() {
            String str = this.e;
            if (str == null) {
                return null;
            }
            Pattern pattern = m.e;
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

    /* compiled from: Cache.kt */
    /* renamed from: okhttp3.b$b, reason: collision with other inner class name */
    public static final class C2165b {
        public static String a(l lVar) {
            String str = lVar.i;
            ByteString byteString = new ByteString(str.getBytes(emb.b));
            byteString.c = str;
            return byteString.l(SameMD5.TAG).o();
        }

        public static int b(e8f0 e8f0Var) throws IOException {
            try {
                long m = e8f0Var.m();
                String s1 = e8f0Var.s1(Long.MAX_VALUE);
                if (m >= 0 && m <= 2147483647L && s1.length() <= 0) {
                    return (int) m;
                }
                throw new IOException("expected an int but was \"" + m + s1 + '\"');
            } catch (NumberFormatException e) {
                throw new IOException(e.getMessage());
            }
        }

        public static Set c(k kVar) {
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

    /* compiled from: Cache.kt */
    public final class d {
        public final jbn.a a;
        public final qwj0 b;
        public final a c;
        public boolean d;

        /* compiled from: Cache.kt */
        public static final class a extends bas {
            public final /* synthetic */ b c;
            public final /* synthetic */ d d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, d dVar, qwj0 qwj0Var) {
                super(qwj0Var);
                this.c = bVar;
                this.d = dVar;
            }

            @Override // xsna.bas, xsna.qwj0, java.io.Closeable, java.lang.AutoCloseable
            public final void close() throws IOException {
                b bVar = this.c;
                d dVar = this.d;
                synchronized (bVar) {
                    if (dVar.d) {
                        return;
                    }
                    dVar.d = true;
                    super.close();
                    this.d.a.b();
                }
            }
        }

        public d(jbn.a aVar) {
            this.a = aVar;
            qwj0 d = aVar.d(1);
            this.b = d;
            this.c = new a(b.this, this, d);
        }

        public final void a() {
            synchronized (b.this) {
                if (this.d) {
                    return;
                }
                this.d = true;
                x2r0.c(this.b);
                try {
                    this.a.a();
                } catch (IOException unused) {
                }
            }
        }

        public final qwj0 b() {
            return this.c;
        }
    }

    public b(File file, long j) {
        this.b = new jbn(file, j, TaskRunner.i);
    }

    public static void o(u uVar, u uVar2) {
        jbn.a aVar;
        c cVar = new c(uVar2);
        jbn.c cVar2 = ((a) uVar.h).d;
        try {
            aVar = jbn.this.o(cVar2.c, cVar2.b);
            if (aVar == null) {
                return;
            }
            try {
                cVar.c(aVar);
                aVar.b();
            } catch (IOException unused) {
                if (aVar != null) {
                    try {
                        aVar.a();
                    } catch (IOException unused2) {
                    }
                }
            }
        } catch (IOException unused3) {
            aVar = null;
        }
    }

    public final u b(p pVar) {
        l lVar = pVar.a;
        try {
            jbn.c p = this.b.p(C2165b.a(lVar));
            if (p != null) {
                try {
                    c cVar = new c((agk0) p.d.get(0));
                    k kVar = cVar.b;
                    String str = cVar.c;
                    l lVar2 = cVar.a;
                    k kVar2 = cVar.g;
                    String a2 = kVar2.a("Content-Type");
                    String a3 = kVar2.a(Http.Header.CONTENT_LENGTH);
                    p.a aVar = new p.a();
                    aVar.a = lVar2;
                    aVar.f(str, null);
                    aVar.c = kVar.d();
                    p b = aVar.b();
                    u.a aVar2 = new u.a();
                    aVar2.a = b;
                    aVar2.b = cVar.d;
                    aVar2.c = cVar.e;
                    aVar2.d = cVar.f;
                    aVar2.f = kVar2.d();
                    aVar2.g = new a(p, a2, a3);
                    aVar2.e = cVar.h;
                    aVar2.k = cVar.i;
                    aVar2.l = cVar.j;
                    u c2 = aVar2.c();
                    if (epx.f(lVar2, lVar) && str.equals(pVar.b)) {
                        Set<String> c3 = C2165b.c(c2.g);
                        if (!(c3 instanceof Collection) || !c3.isEmpty()) {
                            for (String str2 : c3) {
                                if (!epx.f(kVar.g(str2), pVar.c.g(str2))) {
                                }
                            }
                        }
                        return c2;
                    }
                    v vVar = c2.h;
                    if (vVar != null) {
                        x2r0.c(vVar);
                        return null;
                    }
                } catch (IOException unused) {
                    x2r0.c(p);
                }
            }
        } catch (IOException unused2) {
        }
        return null;
    }

    public final d c(u uVar) {
        jbn.a aVar;
        p pVar = uVar.b;
        String str = pVar.b;
        if (str.equals("POST") || str.equals("PATCH") || str.equals("PUT") || str.equals("DELETE") || str.equals("MOVE")) {
            try {
                h(pVar);
            } catch (IOException unused) {
            }
            return null;
        }
        if (str.equals("GET") && !C2165b.c(uVar.g).contains("*")) {
            c cVar = new c(uVar);
            try {
                jbn jbnVar = this.b;
                String a2 = C2165b.a(pVar.a);
                Regex regex = jbn.t;
                aVar = jbnVar.o(-1L, a2);
                if (aVar != null) {
                    try {
                        cVar.c(aVar);
                        return new d(aVar);
                    } catch (IOException unused2) {
                        if (aVar != null) {
                            try {
                                aVar.a();
                            } catch (IOException unused3) {
                            }
                        }
                        return null;
                    }
                }
            } catch (IOException unused4) {
                aVar = null;
            }
        }
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.b.close();
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        this.b.flush();
    }

    public final void h(p pVar) throws IOException {
        jbn jbnVar = this.b;
        String a2 = C2165b.a(pVar.a);
        synchronized (jbnVar) {
            jbnVar.q();
            jbnVar.m();
            jbn.z(a2);
            jbn.b bVar = jbnVar.i.get(a2);
            if (bVar == null) {
                return;
            }
            jbnVar.x(bVar);
            if (jbnVar.g <= jbnVar.c) {
                jbnVar.o = false;
            }
        }
    }

    public final synchronized void m() {
    }

    public final synchronized void n(rx8 rx8Var) {
    }

    /* compiled from: Cache.kt */
    public static final class c {
        public static final String k;
        public static final String l;
        public final l a;
        public final k b;
        public final String c;
        public final Protocol d;
        public final int e;
        public final String f;
        public final k g;
        public final j h;
        public final long i;
        public final long j;

        static {
            fta0 fta0Var = fta0.a;
            fta0.a.getClass();
            k = "OkHttp-Sent-Millis";
            fta0.a.getClass();
            l = "OkHttp-Received-Millis";
        }

        public c(agk0 agk0Var) throws IOException {
            l lVar;
            TlsVersion tlsVersion;
            try {
                e8f0 e8f0Var = new e8f0(agk0Var);
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
                int b = C2165b.b(e8f0Var);
                for (int i = 0; i < b; i++) {
                    aVar2.c(e8f0Var.s1(Long.MAX_VALUE));
                }
                this.b = aVar2.e();
                uzk0 a = uzk0.a.a(e8f0Var.s1(Long.MAX_VALUE));
                this.d = a.a;
                this.e = a.b;
                this.f = a.c;
                k.a aVar3 = new k.a();
                int b2 = C2165b.b(e8f0Var);
                for (int i2 = 0; i2 < b2; i2++) {
                    aVar3.c(e8f0Var.s1(Long.MAX_VALUE));
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
                    e b3 = e.b.b(e8f0Var.s1(Long.MAX_VALUE));
                    List a2 = a(e8f0Var);
                    List a3 = a(e8f0Var);
                    if (e8f0Var.W1()) {
                        tlsVersion = TlsVersion.SSL_3_0;
                    } else {
                        TlsVersion.a aVar4 = TlsVersion.Companion;
                        String s13 = e8f0Var.s1(Long.MAX_VALUE);
                        aVar4.getClass();
                        tlsVersion = TlsVersion.a.a(s13);
                    }
                    this.h = new j(tlsVersion, b3, x2r0.w(a3), new i(x2r0.w(a2)));
                } else {
                    this.h = null;
                }
                s3q0 s3q0Var = s3q0.a;
                agk0Var.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ro.e(agk0Var, th);
                    throw th2;
                }
            }
        }

        public static List a(e8f0 e8f0Var) throws IOException {
            int b = C2165b.b(e8f0Var);
            if (b == -1) {
                return EmptyList.b;
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
                ArrayList arrayList = new ArrayList(b);
                for (int i = 0; i < b; i++) {
                    String s1 = e8f0Var.s1(Long.MAX_VALUE);
                    vl8 vl8Var = new vl8();
                    byte[] a = okio.a.a(s1);
                    ByteString byteString = a != null ? new ByteString(a) : null;
                    if (byteString == null) {
                        throw new IOException("Corrupt certificate in cache entry");
                    }
                    byteString.B(vl8Var, byteString.n());
                    arrayList.add(certificateFactory.generateCertificate(vl8Var.new a()));
                }
                return arrayList;
            } catch (CertificateException e) {
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
                throw new IOException(e.getMessage());
            }
        }

        public final void c(jbn.a aVar) throws IOException {
            l lVar = this.a;
            j jVar = this.h;
            k kVar = this.g;
            k kVar2 = this.b;
            d8f0 d8f0Var = new d8f0(aVar.d(0));
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
                    d8f0Var.y1(jVar.b.a);
                    d8f0Var.writeByte(10);
                    b(d8f0Var, jVar.c());
                    b(d8f0Var, jVar.c);
                    d8f0Var.y1(jVar.a.h());
                    d8f0Var.writeByte(10);
                }
                s3q0 s3q0Var = s3q0.a;
                d8f0Var.close();
            } finally {
            }
        }

        public c(u uVar) {
            k e;
            p pVar = uVar.b;
            this.a = pVar.a;
            k kVar = uVar.i.b.c;
            k kVar2 = uVar.g;
            Set c = C2165b.c(kVar2);
            if (c.isEmpty()) {
                e = x2r0.b;
            } else {
                k.a aVar = new k.a();
                int size = kVar.size();
                for (int i = 0; i < size; i++) {
                    String c2 = kVar.c(i);
                    if (c.contains(c2)) {
                        aVar.b(c2, kVar.f(i));
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
