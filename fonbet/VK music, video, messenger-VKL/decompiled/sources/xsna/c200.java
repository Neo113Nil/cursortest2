package xsna;

import android.support.v4.media.session.PlaybackStateCompat;
import com.vk.api.sdk.utils.log.Logger;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.Pair;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.text.Regex;
import okhttp3.Interceptor;
import okhttp3.logging.HttpLoggingInterceptor;
import xsna.p2i0;
import xsna.ulp0;

/* compiled from: LoggingInterceptor.kt */
/* loaded from: classes.dex */
public class c200 implements Interceptor {
    public static final a k;
    public static final /* synthetic */ qcy<Object>[] l;
    public static final Object m;
    public static final Regex n;
    public final boolean a;
    public final Collection<String> b;
    public final Logger c;
    public final h200 d;
    public final bpn0 e;
    public final bpn0 f;
    public final bpn0 g;
    public final bpn0 h;
    public final ThreadLocal<String> i;
    public final zqo0 j;

    /* compiled from: LoggingInterceptor.kt */
    public static final class a {
    }

    /* compiled from: LoggingInterceptor.kt */
    public static final class b implements HttpLoggingInterceptor.a {
        public b() {
        }

        @Override // okhttp3.logging.HttpLoggingInterceptor.a
        public final void a(String str) {
            p2i0 a;
            String b;
            c200 c200Var = c200.this;
            String str2 = c200Var.i.get();
            if (str2 != null && (b = pzl.b(str2, " ", str)) != null) {
                str = b;
            }
            List<String> list = p2i0.b;
            a = p2i0.a.a(p2i0.b);
            c200.k.getClass();
            a.a.add(new p2i0.b.C3486b(c200.n, Matcher.quoteReplacement("Bearer <HIDE> ")));
            if (c200Var.a) {
                str = ((Regex) c200Var.g.getValue()).h(((p2i0) c200Var.e.getValue()).a(str), new com.vk.movika.sdk.base.logic.interactor.i(18, c200Var, new ulp0.a(new ulp0(Regex.d((Regex) c200Var.f.getValue(), str), new l8k(14)))));
            }
            String a2 = a.a(str);
            Logger logger = c200Var.c;
            logger.a(logger.getLogLevel().getValue(), a2, null);
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(c200.class, "delegate", "getDelegate()Lokhttp3/logging/HttpLoggingInterceptor;", 0);
        fpf0.a.getClass();
        l = new qcy[]{propertyReference1Impl};
        k = new a();
        Logger.LogLevel logLevel = Logger.LogLevel.NONE;
        Integer valueOf = Integer.valueOf(logLevel.h());
        HttpLoggingInterceptor.Level level = HttpLoggingInterceptor.Level.NONE;
        m = pn00.k(new Pair(valueOf, level), new Pair(Integer.valueOf(Logger.LogLevel.ERROR.h()), level), new Pair(Integer.valueOf(Logger.LogLevel.WARNING.h()), HttpLoggingInterceptor.Level.BASIC), new Pair(Integer.valueOf(Logger.LogLevel.DEBUG.h()), HttpLoggingInterceptor.Level.HEADERS), new Pair(Integer.valueOf(Logger.LogLevel.VERBOSE.h()), HttpLoggingInterceptor.Level.BODY), new Pair(Integer.valueOf(logLevel.h()), level));
        n = new Regex("Bearer [a-zA-Z0-9._%-]+");
    }

    public c200() {
        throw null;
    }

    public c200(boolean z, Collection<String> collection, Logger logger, h200 h200Var) {
        this.a = z;
        this.b = collection;
        this.c = logger;
        this.d = h200Var;
        this.e = new bpn0(new oxv(this, 3));
        this.f = new bpn0(new sw1(10));
        this.g = new bpn0(new lu2(7));
        this.h = new bpn0(new dr6(4));
        this.i = new ThreadLocal<>();
        this.j = new zqo0(new gb3(this, 7));
    }

    public okhttp3.u a(Interceptor.a aVar, HttpLoggingInterceptor httpLoggingInterceptor) {
        return httpLoggingInterceptor.intercept(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Map] */
    @Override // okhttp3.Interceptor
    public final okhttp3.u intercept(Interceptor.a aVar) {
        Logger.LogLevel value;
        okhttp3.p request = aVar.request();
        okhttp3.t tVar = request.d;
        long contentLength = tVar != null ? tVar.contentLength() : 0L;
        k000 k000Var = (k000) request.c(k000.class);
        if (k000Var == null || (value = k000Var.a) == null) {
            value = this.c.getLogLevel().getValue();
        }
        zqo0 zqo0Var = this.j;
        qcy<Object>[] qcyVarArr = l;
        qcy<Object> qcyVar = qcyVarArr[0];
        ((HttpLoggingInterceptor) zqo0Var.b.get()).b = (contentLength > PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM || contentLength <= 0) ? (HttpLoggingInterceptor.Level) m.get(Integer.valueOf(Math.min(Logger.LogLevel.WARNING.h(), value.h()))) : (HttpLoggingInterceptor.Level) m.get(Integer.valueOf(value.h()));
        this.i.set(this.d.getPrefix());
        zqo0 zqo0Var2 = this.j;
        qcy<Object> qcyVar2 = qcyVarArr[0];
        return a(aVar, (HttpLoggingInterceptor) zqo0Var2.b.get());
    }
}
