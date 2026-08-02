package xsna;

import android.app.Application;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.api.sdk.utils.log.Logger;
import java.io.File;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.collections.EmptyList;
import okhttp3.Interceptor;
import okhttp3.l;

/* compiled from: SuperappConfig.kt */
/* loaded from: classes11.dex */
public final class mgn0 {
    public final Application a;
    public final File b;
    public final c c;
    public final vz2 d;
    public final f e;
    public final d f;
    public final String g;
    public final qhn0 h;
    public final b i;
    public final Object j;
    public final Object k;
    public final boolean l;

    /* compiled from: SuperappConfig.kt */
    public static final class a {
        public static final /* synthetic */ int b = 0;
        public final okhttp3.l a;

        static {
            l.a aVar = new l.a();
            aVar.i(HttpRequest.DEFAULT_SCHEME);
            aVar.d("ad.mail.ru");
            aVar.f(0, 6, "mobile", false, false);
            aVar.f(0, 6, "548887", false, false);
            aVar.b();
        }

        public a(okhttp3.l lVar) {
            this.a = lVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.i.hashCode();
        }

        public final String toString() {
            return "AdConfig(url=" + this.a + ')';
        }
    }

    /* compiled from: SuperappConfig.kt */
    public static final class b {
        public final boolean a;
        public final boolean b;
        public final b1v c;
        public final gzs<Boolean> d;
        public final bpn0 e;

        /* compiled from: SuperappConfig.kt */
        public static final class a {
            public boolean b;
            public boolean a = true;
            public final b1v c = new b1v(4);
            public gzs<Boolean> d = new c24(0);
        }

        public b() {
            throw null;
        }

        public b(boolean z, boolean z2, b1v b1vVar, gzs gzsVar) {
            this.a = z;
            this.b = z2;
            this.c = b1vVar;
            this.d = gzsVar;
            this.e = new bpn0(new c5o(this, 8));
        }
    }

    /* compiled from: SuperappConfig.kt */
    public static final class c {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;

        public c(String str, String str2, String str3, String str4, String str5) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d) && epx.f(this.e, cVar.e);
        }

        public final int hashCode() {
            int a = urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
            String str = this.d;
            int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.e;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AppInfo(appName=");
            sb.append(this.a);
            sb.append(", appId=");
            sb.append(this.b);
            sb.append(", appVersion=");
            sb.append(this.c);
            sb.append(", buildVersion=");
            sb.append(this.d);
            sb.append(", installReferrer=");
            return ho8.a(sb, this.e, ')');
        }
    }

    /* compiled from: SuperappConfig.kt */
    public static final class d {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            ((d) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "BrowserConfig(excludeMiniAppsMenu=null)";
        }
    }

    /* compiled from: SuperappConfig.kt */
    public interface e {
        boolean a(String str);

        String b(String str, boolean z);
    }

    /* compiled from: SuperappConfig.kt */
    public static final class f {
        public final boolean a;
        public final gzs<String> b;
        public final gzs<String> c;
        public final gzs<String> d;
        public final gzs<String> e;
        public final Logger f;
        public final boolean g;
        public final gzs<String> h;
        public final long i;
        public final int j;
        public final boolean k;
        public final boolean l;
        public final e m;
        public final List<Interceptor> n;
        public final gzs<Long> o;

        public f() {
            this(false, null, null, null, null, null, 0L, null, 131071);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.a == fVar.a && epx.f(this.b, fVar.b) && epx.f(this.c, fVar.c) && epx.f(this.d, fVar.d) && epx.f(this.e, fVar.e) && epx.f(this.f, fVar.f) && this.g == fVar.g && epx.f(this.h, fVar.h) && this.i == fVar.i && this.j == fVar.j && this.k == fVar.k && this.l == fVar.l && epx.f(this.m, fVar.m) && epx.f(this.n, fVar.n) && epx.f(this.o, fVar.o);
        }

        public final int hashCode() {
            int a = sf3.a(sf3.a(sf3.a(sf3.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
            Logger logger = this.f;
            int b = qoy.b(qoy.b(qoy.b(shy.a(this.j, bh10.a(sf3.a(qoy.b((a + (logger == null ? 0 : logger.hashCode())) * 31, 31, this.g), 31, this.h), 31, this.i), 31), 31, this.k), 31, false), 31, this.l);
            e eVar = this.m;
            return this.o.hashCode() + fw3.a(qoy.b((b + (eVar == null ? 0 : eVar.hashCode())) * 31, 31, false), 31, this.n);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DebugConfig(enableLogging=");
            sb.append(this.a);
            sb.append(", debugApiHost=");
            sb.append(this.b);
            sb.append(", debugOAuthHost=");
            sb.append(this.c);
            sb.append(", debugOAuthTokenHost=");
            sb.append(this.d);
            sb.append(", staticHost=");
            sb.append(this.e);
            sb.append(", externalLogger=");
            sb.append(this.f);
            sb.append(", addDebugCountry=");
            sb.append(this.g);
            sb.append(", debugVkUiApiHost=");
            sb.append(this.h);
            sb.append(", authTimeout=");
            sb.append(this.i);
            sb.append(", authRetryCount=");
            sb.append(this.j);
            sb.append(", enableVKCLogs=");
            sb.append(this.k);
            sb.append(", denyEncryptedPrefsCreateOnMainThread=false, debugCrashes=");
            sb.append(this.l);
            sb.append(", browserUrlOverrider=");
            sb.append(this.m);
            sb.append(", statInstantSend=false, debugInterceptors=");
            sb.append(this.n);
            sb.append(", debugAutologinIpcTimeout=");
            return uf3.d(sb, this.o, ')');
        }

        public f(boolean z, er6 er6Var, fr6 fr6Var, fr6 fr6Var2, d13 d13Var, er6 er6Var2, long j, iex0 iex0Var, int i) {
            z = (i & 1) != 0 ? false : z;
            gzs qn6Var = (i & 2) != 0 ? new qn6(7) : er6Var;
            gzs t0fVar = (i & 4) != 0 ? new t0f(10) : fr6Var;
            gzs ps0Var = (i & 8) != 0 ? new ps0(8) : fr6Var2;
            d13Var = (i & 32) != 0 ? null : d13Var;
            gzs u0fVar = (i & 128) != 0 ? new u0f(8) : er6Var2;
            j = (i & 256) != 0 ? TimeUnit.SECONDS.toMillis(15L) : j;
            iex0Var = (i & 8192) != 0 ? null : iex0Var;
            EmptyList emptyList = EmptyList.b;
            this.a = z;
            this.b = qn6Var;
            this.c = t0fVar;
            this.d = ps0Var;
            this.e = ngn0.b;
            this.f = d13Var;
            this.g = false;
            this.h = u0fVar;
            this.i = j;
            this.j = 1;
            this.k = true;
            this.l = false;
            this.m = iex0Var;
            this.n = emptyList;
            this.o = ogn0.b;
        }
    }

    /* compiled from: SuperappConfig.kt */
    public interface g {
        ovj getDefault();

        ovj getIo();

        ge00 getMain();
    }

    /* compiled from: SuperappConfig.kt */
    public interface h {

        /* compiled from: SuperappConfig.kt */
        public static final class a {
            public static /* synthetic */ ExecutorService a(h hVar, String str, int i, int i2) {
                if ((i2 & 2) != 0) {
                    i = 1;
                }
                return hVar.b(i, str);
            }
        }

        ExecutorService a();

        ExecutorService b(int i, String str);

        ExecutorService c();
    }

    public mgn0() {
        throw null;
    }

    public mgn0(Application application, File file, c cVar, vz2 vz2Var, f fVar, d dVar, String str, qhn0 qhn0Var, b bVar, Lazy lazy, Lazy lazy2, boolean z) {
        this.a = application;
        this.b = file;
        this.c = cVar;
        this.d = vz2Var;
        this.e = fVar;
        this.f = dVar;
        this.g = str;
        this.h = qhn0Var;
        this.i = bVar;
        this.j = lazy;
        this.k = lazy2;
        this.l = z;
    }
}
