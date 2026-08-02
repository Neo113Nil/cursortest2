package okhttp3.logging;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptySet;
import okhttp3.Interceptor;
import okhttp3.k;
import okhttp3.m;
import okhttp3.p;
import okhttp3.t;
import okhttp3.u;
import okhttp3.v;
import ru.ok.android.commons.http.Http;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.bn8;
import xsna.dsu;
import xsna.ho8;
import xsna.ine0;
import xsna.njv;
import xsna.u3j;
import xsna.vl8;
import xsna.zr;

/* compiled from: HttpLoggingInterceptor.kt */
/* loaded from: classes11.dex */
public final class HttpLoggingInterceptor implements Interceptor {
    public volatile EmptySet a;
    public volatile Level b;
    public final a c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: HttpLoggingInterceptor.kt */
    public static final class Level {
        private static final /* synthetic */ Level[] $VALUES;
        public static final Level BASIC;
        public static final Level BODY;
        public static final Level HEADERS;
        public static final Level NONE;

        static {
            Level level = new Level("NONE", 0);
            NONE = level;
            Level level2 = new Level("BASIC", 1);
            BASIC = level2;
            Level level3 = new Level("HEADERS", 2);
            HEADERS = level3;
            Level level4 = new Level("BODY", 3);
            BODY = level4;
            $VALUES = new Level[]{level, level2, level3, level4};
        }

        public Level() {
            throw null;
        }

        public static Level valueOf(String str) {
            return (Level) Enum.valueOf(Level.class, str);
        }

        public static Level[] values() {
            return (Level[]) $VALUES.clone();
        }
    }

    /* compiled from: HttpLoggingInterceptor.kt */
    public interface a {
        public static final okhttp3.logging.a a = new okhttp3.logging.a();

        void a(String str);
    }

    public HttpLoggingInterceptor(a aVar) {
        this.c = aVar;
        this.a = EmptySet.b;
        this.b = Level.NONE;
    }

    public final void a(k kVar, int i) {
        EmptySet emptySet = this.a;
        kVar.c(i);
        emptySet.getClass();
        String f = kVar.f(i);
        this.c.a(kVar.c(i) + ": " + f);
    }

    @Override // okhttp3.Interceptor
    public final u intercept(Interceptor.a aVar) throws IOException {
        boolean z;
        boolean z2;
        char c;
        String str;
        String str2;
        long j;
        long j2;
        String str3;
        Long l;
        Charset charset;
        Charset charset2;
        Level level = this.b;
        p request = aVar.request();
        if (level == Level.NONE) {
            return aVar.a(request);
        }
        boolean z3 = true;
        boolean z4 = level == Level.BODY;
        if (!z4 && level != Level.HEADERS) {
            z3 = false;
        }
        t tVar = request.d;
        u3j b = aVar.b();
        StringBuilder sb = new StringBuilder("--> ");
        sb.append(request.b);
        sb.append(' ');
        sb.append(request.a);
        sb.append(b != null ? " " + b.a() : "");
        String sb2 = sb.toString();
        if (!z3 && tVar != null) {
            StringBuilder b2 = ho8.b(sb2, " (");
            b2.append(tVar.contentLength());
            b2.append("-byte body)");
            sb2 = b2.toString();
        }
        this.c.a(sb2);
        if (z3) {
            k kVar = request.c;
            if (tVar != null) {
                j = -1;
                m contentType = tVar.contentType();
                if (contentType != null) {
                    c = ' ';
                    if (kVar.a("Content-Type") == null) {
                        z = z4;
                        z2 = z3;
                        this.c.a("Content-Type: " + contentType);
                    } else {
                        z = z4;
                        z2 = z3;
                    }
                } else {
                    z = z4;
                    z2 = z3;
                    c = ' ';
                }
                if (tVar.contentLength() == -1 || kVar.a(Http.Header.CONTENT_LENGTH) != null) {
                    str2 = "-byte body omitted)";
                } else {
                    a aVar2 = this.c;
                    StringBuilder sb3 = new StringBuilder("Content-Length: ");
                    str2 = "-byte body omitted)";
                    sb3.append(tVar.contentLength());
                    aVar2.a(sb3.toString());
                }
            } else {
                z = z4;
                z2 = z3;
                c = ' ';
                str2 = "-byte body omitted)";
                j = -1;
            }
            int size = kVar.size();
            for (int i = 0; i < size; i++) {
                a(kVar, i);
            }
            if (!z || tVar == null) {
                str = "";
                this.c.a("--> END " + request.b);
            } else {
                String a2 = request.c.a(Http.Header.CONTENT_ENCODING);
                if (a2 != null && !a2.equalsIgnoreCase("identity") && !a2.equalsIgnoreCase(Http.ContentEncoding.GZIP)) {
                    this.c.a("--> END " + request.b + " (encoded body omitted)");
                } else if (tVar.isDuplex()) {
                    this.c.a("--> END " + request.b + " (duplex request body omitted)");
                } else if (tVar.isOneShot()) {
                    this.c.a("--> END " + request.b + " (one-shot body omitted)");
                } else {
                    vl8 vl8Var = new vl8();
                    tVar.writeTo(vl8Var);
                    m contentType2 = tVar.contentType();
                    if (contentType2 == null || (charset2 = contentType2.a(StandardCharsets.UTF_8)) == null) {
                        charset2 = StandardCharsets.UTF_8;
                    }
                    this.c.a("");
                    if (ine0.l(vl8Var)) {
                        str = "";
                        this.c.a(vl8Var.w(vl8Var.c, charset2));
                        this.c.a("--> END " + request.b + " (" + tVar.contentLength() + "-byte body)");
                        str2 = str2;
                    } else {
                        str = "";
                        a aVar3 = this.c;
                        StringBuilder sb4 = new StringBuilder("--> END ");
                        sb4.append(request.b);
                        sb4.append(" (binary ");
                        sb4.append(tVar.contentLength());
                        str2 = str2;
                        sb4.append(str2);
                        aVar3.a(sb4.toString());
                    }
                }
                str = "";
            }
        } else {
            z = z4;
            z2 = z3;
            c = ' ';
            str = "";
            str2 = "-byte body omitted)";
            j = -1;
        }
        long nanoTime = System.nanoTime();
        try {
            u a3 = aVar.a(request);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            v m = a3.m();
            long contentLength = m.contentLength();
            String str4 = contentLength != j ? contentLength + "-byte" : "unknown-length";
            a aVar4 = this.c;
            StringBuilder sb5 = new StringBuilder("<-- ");
            sb5.append(a3.o());
            if (a3.v().length() == 0) {
                j2 = contentLength;
                str3 = str;
            } else {
                j2 = contentLength;
                str3 = String.valueOf(c) + a3.v();
            }
            sb5.append(str3);
            sb5.append(c);
            sb5.append(a3.A().a);
            sb5.append(" (");
            sb5.append(millis);
            sb5.append(UcumUtils.UCUM_MILLISECODS);
            sb5.append(!z2 ? zr.a(", ", str4, " body") : str);
            sb5.append(')');
            aVar4.a(sb5.toString());
            if (z2) {
                k s = a3.s();
                int size2 = s.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    a(s, i2);
                }
                if (z && njv.a(a3)) {
                    String a4 = a3.s().a(Http.Header.CONTENT_ENCODING);
                    if (a4 != null && !a4.equalsIgnoreCase("identity") && !a4.equalsIgnoreCase(Http.ContentEncoding.GZIP)) {
                        this.c.a("<-- END HTTP (encoded body omitted)");
                        return a3;
                    }
                    bn8 source = m.source();
                    source.o3(Long.MAX_VALUE);
                    vl8 C = source.C();
                    if (Http.ContentEncoding.GZIP.equalsIgnoreCase(s.a(Http.Header.CONTENT_ENCODING))) {
                        l = Long.valueOf(C.c);
                        dsu dsuVar = new dsu(C.clone());
                        try {
                            C = new vl8();
                            C.L2(dsuVar);
                            dsuVar.close();
                        } finally {
                        }
                    } else {
                        l = null;
                    }
                    m contentType3 = m.contentType();
                    if (contentType3 == null || (charset = contentType3.a(StandardCharsets.UTF_8)) == null) {
                        charset = StandardCharsets.UTF_8;
                    }
                    if (!ine0.l(C)) {
                        this.c.a(str);
                        this.c.a("<-- END HTTP (binary " + C.c + str2);
                        return a3;
                    }
                    if (j2 != 0) {
                        this.c.a(str);
                        a aVar5 = this.c;
                        vl8 clone = C.clone();
                        aVar5.a(clone.w(clone.c, charset));
                    }
                    if (l == null) {
                        this.c.a("<-- END HTTP (" + C.c + "-byte body)");
                        return a3;
                    }
                    this.c.a("<-- END HTTP (" + C.c + "-byte, " + l + "-gzipped-byte body)");
                    return a3;
                }
                this.c.a("<-- END HTTP");
            }
            return a3;
        } catch (Exception e) {
            this.c.a("<-- HTTP FAILED: " + e);
            throw e;
        }
    }

    public HttpLoggingInterceptor() {
        this(a.a);
    }
}
