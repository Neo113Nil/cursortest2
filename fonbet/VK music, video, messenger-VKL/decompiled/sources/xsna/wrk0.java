package xsna;

import android.net.Uri;
import com.vk.knet.core.http.HttpProtocol;
import com.vk.knet.core.http.metric.HttpMetrics;
import com.vk.net.stat.metric.NetStatSource;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: StatHttpMetricsListener.kt */
/* loaded from: classes.dex */
public final class wrk0 implements wjv {
    public final py70 a;

    /* compiled from: StatHttpMetricsListener.kt */
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HttpMetrics.Source.values().length];
            try {
                iArr[HttpMetrics.Source.CRONET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HttpMetrics.Source.OKHTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public wrk0(py70 py70Var) {
        this.a = py70Var;
    }

    @Override // xsna.wjv
    public final void a(HttpMetrics httpMetrics, ckv ckvVar, pkv pkvVar) {
        NetStatSource netStatSource;
        Integer m;
        Map<String, List<String>> c;
        List<String> list;
        Long a2;
        HttpProtocol d;
        Uri parse = Uri.parse(ckvVar.j());
        jkv jkvVar = new jkv();
        String str = jkvVar.o;
        jkvVar.p = Integer.valueOf((int) httpMetrics.b().b());
        jkvVar.C = httpMetrics.d();
        jkvVar.a = (int) httpMetrics.b().a();
        jkvVar.q = Integer.valueOf((int) httpMetrics.b().d());
        jkvVar.t = Integer.valueOf((int) httpMetrics.b().e());
        jkvVar.b = (int) httpMetrics.b().f();
        jkvVar.s = Integer.valueOf((int) httpMetrics.b().c());
        long c2 = httpMetrics.c();
        py70 py70Var = this.a;
        jkvVar.c = (int) (c2 - py70Var.a());
        jkvVar.u = httpMetrics.g();
        String str2 = null;
        jkvVar.f = (pkvVar == null || (d = pkvVar.d()) == null) ? null : jjv.a(d);
        int i = a.$EnumSwitchMapping$0[httpMetrics.f().ordinal()];
        if (i == 1) {
            netStatSource = NetStatSource.CRONET;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            netStatSource = NetStatSource.OKHTTP_EXECUTOR;
        }
        jkvVar.g = netStatSource;
        String str3 = "unknown";
        if (zjy.d(ckvVar)) {
            str3 = "longpoll";
        } else if (zjy.e(ckvVar)) {
            str3 = "sse";
        } else {
            try {
                String lastPathSegment = parse.getLastPathSegment();
                if (lastPathSegment != null) {
                    str3 = lastPathSegment;
                }
            } catch (Throwable unused) {
            }
        }
        jkvVar.h = str3;
        String host = parse.getHost();
        if (host == null) {
            host = "";
        }
        jkvVar.i = host;
        jkvVar.j = ckvVar.g().i();
        jkvVar.k = pkvVar != null ? pkvVar.e() : 0;
        jkvVar.r = ckvVar.j();
        ckv a3 = zjy.a(ckvVar);
        jkvVar.z = a3 != null ? a3.j() : null;
        jkvVar.l = pkvVar != null ? pkvVar.b() : null;
        String c3 = ckvVar.c("X-Stat-Key");
        if (c3 == null || (m = arm0.m(10, c3)) == null) {
            String queryParameter = parse.getQueryParameter("stat_key");
            m = queryParameter != null ? arm0.m(10, queryParameter) : null;
        }
        jkvVar.m = m;
        dkv b = ckvVar.b();
        jkvVar.w = b != null ? Integer.valueOf(b.getContentLength()) : 0;
        jkvVar.d = (pkvVar == null || (a2 = pkvVar.a()) == null) ? 0 : (int) a2.longValue();
        jkvVar.x = httpMetrics.i();
        jkvVar.O = httpMetrics.h();
        jkvVar.y = httpMetrics.a();
        jkvVar.e = httpMetrics.e();
        jkvVar.n = !(str == null || drm0.N(str));
        jkvVar.o = str;
        List<String> d2 = ckvVar.d("Connection");
        jkvVar.v = d2 != null ? Boolean.valueOf(d2.contains("Keep-Alive")) : Boolean.FALSE;
        if (pkvVar != null && (c = pkvVar.c()) != null && (list = c.get("X-Trace-Id")) != null) {
            str2 = (String) j5g.a0(list);
        }
        jkvVar.P = str2 != null ? str2 : "";
        py70Var.b(jkvVar);
    }
}
