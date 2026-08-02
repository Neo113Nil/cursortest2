package xsna;

import androidx.annotation.Nullable;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.l;

/* compiled from: NetworkRequestMetricBuilder.java */
/* loaded from: classes13.dex */
public final class e560 extends y93 implements wsi0 {
    public static final ra2 i = ra2.d();
    public final List<PerfSession> b;
    public final GaugeManager c;
    public final xop0 d;
    public final NetworkRequestMetric.b e;
    public final WeakReference<wsi0> f;

    @Nullable
    public String g;
    public boolean h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e560(xop0 xop0Var) {
        super(r0);
        u93 a = u93.a();
        GaugeManager gaugeManager = GaugeManager.getInstance();
        this.e = NetworkRequestMetric.M();
        this.f = new WeakReference<>(this);
        this.d = xop0Var;
        this.c = gaugeManager;
        this.b = dez0.b();
        registerForAppState();
    }

    @Override // xsna.wsi0
    public final void a(PerfSession perfSession) {
        if (perfSession == null) {
            i.h();
            return;
        }
        NetworkRequestMetric.b bVar = this.e;
        if (!bVar.o() || bVar.q()) {
            return;
        }
        this.b.add(perfSession);
    }

    public final void d() {
        List unmodifiableList;
        SessionManager.getInstance().unregisterForSessionUpdates(this.f);
        unregisterForAppState();
        synchronized (this.b) {
            try {
                ArrayList arrayList = new ArrayList();
                for (PerfSession perfSession : this.b) {
                    if (perfSession != null) {
                        arrayList.add(perfSession);
                    }
                }
                unmodifiableList = Collections.unmodifiableList(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.firebase.perf.v1.h[] e = PerfSession.e(unmodifiableList);
        if (e != null) {
            this.e.b(Arrays.asList(e));
        }
        NetworkRequestMetric build = this.e.build();
        String str = this.g;
        if (str == null) {
            Pattern pattern = f560.a;
        } else if (f560.a.matcher(str).matches()) {
            i.a();
            return;
        }
        if (this.h) {
            return;
        }
        xop0 xop0Var = this.d;
        xop0Var.j.execute(new wop0(xop0Var, build, getAppState(), 0));
        this.h = true;
    }

    public final void e(@Nullable String str) {
        NetworkRequestMetric.HttpMethod httpMethod;
        if (str != null) {
            String upperCase = str.toUpperCase();
            upperCase.getClass();
            switch (upperCase) {
                case "OPTIONS":
                    httpMethod = NetworkRequestMetric.HttpMethod.OPTIONS;
                    break;
                case "GET":
                    httpMethod = NetworkRequestMetric.HttpMethod.GET;
                    break;
                case "PUT":
                    httpMethod = NetworkRequestMetric.HttpMethod.PUT;
                    break;
                case "HEAD":
                    httpMethod = NetworkRequestMetric.HttpMethod.HEAD;
                    break;
                case "POST":
                    httpMethod = NetworkRequestMetric.HttpMethod.POST;
                    break;
                case "PATCH":
                    httpMethod = NetworkRequestMetric.HttpMethod.PATCH;
                    break;
                case "TRACE":
                    httpMethod = NetworkRequestMetric.HttpMethod.TRACE;
                    break;
                case "CONNECT":
                    httpMethod = NetworkRequestMetric.HttpMethod.CONNECT;
                    break;
                case "DELETE":
                    httpMethod = NetworkRequestMetric.HttpMethod.DELETE;
                    break;
                default:
                    httpMethod = NetworkRequestMetric.HttpMethod.HTTP_METHOD_UNKNOWN;
                    break;
            }
            this.e.s(httpMethod);
        }
    }

    public final void f(int i2) {
        this.e.t(i2);
    }

    public final void g(long j) {
        this.e.v(j);
    }

    public final void i(long j) {
        PerfSession perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.f);
        this.e.r(j);
        a(perfSession);
        if (perfSession.d) {
            this.c.collectGaugeMetricOnce(perfSession.c);
        }
    }

    public final void j(@Nullable String str) {
        int i2;
        NetworkRequestMetric.b bVar = this.e;
        if (str == null) {
            bVar.m();
            return;
        }
        if (str.length() <= 128) {
            while (i2 < str.length()) {
                char charAt = str.charAt(i2);
                i2 = (charAt > 31 && charAt <= 127) ? i2 + 1 : 0;
            }
            bVar.w(str);
            return;
        }
        "The content type of the response is not a valid content-type:".concat(str);
        i.h();
    }

    public final void k(long j) {
        this.e.x(j);
    }

    public final void l(long j) {
        this.e.z(j);
        if (SessionManager.getInstance().perfSession().d) {
            this.c.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().c);
        }
    }

    public final void n(@Nullable String str) {
        okhttp3.l lVar;
        int lastIndexOf;
        if (str != null) {
            okhttp3.l lVar2 = null;
            try {
                l.a aVar = new l.a();
                aVar.e(null, str);
                lVar = aVar.b();
            } catch (IllegalArgumentException unused) {
                lVar = null;
            }
            if (lVar != null) {
                l.a f = lVar.f();
                f.b = l.b.a("", 0, " \"':;<=>@[]^`{}|/\\?#", 0, 251, false);
                f.c = l.b.a("", 0, " \"':;<=>@[]^`{}|/\\?#", 0, 251, false);
                f.g = null;
                f.h = null;
                str = f.toString();
            }
            if (str.length() > 2000) {
                if (str.charAt(2000) == '/') {
                    str = str.substring(0, 2000);
                } else {
                    try {
                        l.a aVar2 = new l.a();
                        aVar2.e(null, str);
                        lVar2 = aVar2.b();
                    } catch (IllegalArgumentException unused2) {
                    }
                    str = lVar2 == null ? str.substring(0, 2000) : (lVar2.b().lastIndexOf(47) < 0 || (lastIndexOf = str.lastIndexOf(47, 1999)) < 0) ? str.substring(0, 2000) : str.substring(0, lastIndexOf);
                }
            }
            this.e.B(str);
        }
    }
}
