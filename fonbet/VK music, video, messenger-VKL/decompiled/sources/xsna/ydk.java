package xsna;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import com.vk.knet.cornet.CronetDisabledException;
import com.vk.knet.cornet.CronetHttpLogger$DebugType;
import java.io.File;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.UrlResponseInfo;
import ru.ok.android.commons.http.Http;
import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;
import xsna.uek;
import xsna.wdk;

/* compiled from: CronetClient.kt */
/* loaded from: classes.dex */
public final class ydk {
    public final fek a;
    public final wvb0 b;
    public final wjv c;
    public final gkv d;
    public final Executor e;
    public final AtomicBoolean f = new AtomicBoolean(false);
    public final AtomicBoolean g = new AtomicBoolean(false);
    public final ConcurrentHashMap<Long, k7g0> h = new ConcurrentHashMap<>();
    public final gek i;
    public final oek j;
    public final lll k;
    public final eek l;

    /* compiled from: CronetClient.kt */
    public static final class a {
        public final Context a;
        public yek b;
        public v1v c;
        public uek.a e;
        public boolean o;
        public boolean r;
        public boolean s;
        public wdk d = wdk.b.a;
        public boolean f = true;
        public long g = ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS;
        public long h = ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS;
        public long i = ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS;
        public int j = 64;
        public int k = 16;
        public boolean l = true;
        public boolean m = true;
        public boolean n = true;
        public final ArrayList p = new ArrayList();
        public final ArrayList q = new ArrayList();
        public Executor t = new ddk();
        public long u = 100;
        public long v = 1000;

        public a(Context context) {
            this.a = context;
            this.e = new uek.a(new File(context.getFilesDir() + "/cronet_netlog"));
        }
    }

    public ydk(ExperimentalCronetEngine experimentalCronetEngine, fek fekVar, wvb0 wvb0Var, uek uekVar, xdk xdkVar, gti gtiVar, boolean z, Executor executor) {
        this.a = fekVar;
        this.b = wvb0Var;
        this.c = xdkVar;
        this.d = gtiVar;
        this.e = executor;
        this.i = new gek(fekVar.g, fekVar.h);
        this.j = new oek(fekVar.g, fekVar.m, fekVar.n);
        this.k = new lll(fekVar.i, fekVar.j);
        this.l = new eek(experimentalCronetEngine, xdkVar, z, executor);
    }

    public static String b(String str, Map map) {
        String g0;
        List list = (List) map.get(str);
        if (list != null && (g0 = j5g.g0(list, null, null, null, 0, null, 63)) != null) {
            return g0;
        }
        List list2 = (List) map.get(str.toLowerCase(Locale.ROOT));
        if (list2 != null) {
            return j5g.g0(list2, null, null, null, 0, null, 63);
        }
        return null;
    }

    public final void a(ckv ckvVar, jek jekVar) {
        boolean z;
        long f = ckvVar.f();
        synchronized (this) {
            z = this.h.remove(Long.valueOf(f)) != null;
        }
        if (z) {
            gek gekVar = this.i;
            skv i = ckvVar.i();
            gekVar.getClass();
            String b = i.b();
            j8g0 j8g0Var = (j8g0) gekVar.b;
            j8g0Var.b.a.release();
            CronetHttpLogger$DebugType cronetHttpLogger$DebugType = CronetHttpLogger$DebugType.CLIENT_QUEUE;
            Object[] objArr = {cronetHttpLogger$DebugType, "[cronet] Release common queue"};
            qek qekVar = vek.a;
            if (qekVar != null) {
                qekVar.c(Arrays.copyOf(objArr, 2));
            }
            j8g0Var.b(b).a.release();
            Object[] objArr2 = {cronetHttpLogger$DebugType, "[cronet] Release host queue - ".concat(b)};
            qek qekVar2 = vek.a;
            if (qekVar2 != null) {
                qekVar2.c(Arrays.copyOf(objArr2, 2));
            }
            oek oekVar = this.j;
            oekVar.d.execute(new nek(0, oekVar, jekVar));
            gkv gkvVar = this.d;
            if (gkvVar != null) {
                gkvVar.g(ckvVar);
            }
        }
    }

    public final mkv c(ckv ckvVar) {
        okv okvVar;
        if (this.f.get()) {
            throw CronetDisabledException.b;
        }
        if (this.a.l && epx.f(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            new Handler(Looper.getMainLooper()).post(new q86(new NetworkOnMainThreadException(), 4));
        }
        wek wekVar = (wek) this.b.a;
        wekVar.getClass();
        dg3 dg3Var = new dg3(wekVar);
        oek oekVar = this.j;
        oekVar.getClass();
        CronetHttpLogger$DebugType cronetHttpLogger$DebugType = CronetHttpLogger$DebugType.EXEC_POOL;
        Object[] objArr = {lhg.a(oekVar.c.size(), "obtain ")};
        qek qekVar = vek.a;
        if (qekVar != null) {
            qekVar.a(cronetHttpLogger$DebugType, Arrays.copyOf(objArr, 1));
        }
        jek takeLast = oekVar.c.takeLast();
        k7g0 k7g0Var = new k7g0(new zdk(this, ckvVar, takeLast, dg3Var), this.k, this.l);
        gkv gkvVar = this.d;
        if (gkvVar != null) {
            gkvVar.d(ckvVar);
        }
        try {
            k7g0Var.f(ckvVar, takeLast);
            gkv gkvVar2 = this.d;
            if (gkvVar2 != null) {
                gkvVar2.l(ckvVar);
            }
            try {
                d(ckvVar, k7g0Var);
                gkv gkvVar3 = this.d;
                if (gkvVar3 != null) {
                    gkvVar3.b(ckvVar);
                }
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    gkv gkvVar4 = this.d;
                    if (gkvVar4 != null) {
                        gkvVar4.j(ckvVar);
                    }
                    k7g0Var.g();
                    dg3Var.a();
                    k7g0Var.a(ckvVar, this.a.d);
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    gkv gkvVar5 = this.d;
                    if (gkvVar5 != null) {
                        gkvVar5.h(ckvVar, currentTimeMillis2);
                    }
                    CronetHttpLogger$DebugType cronetHttpLogger$DebugType2 = CronetHttpLogger$DebugType.CLIENT_TIMEOUTS;
                    Object[] objArr2 = {"[cronet] Connection time  " + currentTimeMillis2 + " ms to " + ckvVar.j()};
                    qek qekVar2 = vek.a;
                    if (qekVar2 != null) {
                        qekVar2.a(cronetHttpLogger$DebugType2, Arrays.copyOf(objArr2, 1));
                    }
                    try {
                        fek fekVar = this.a;
                        UrlResponseInfo b = k7g0Var.b(fekVar.d, fekVar.f, fekVar.e);
                        gkv gkvVar6 = this.d;
                        if (gkvVar6 != null) {
                            gkvVar6.c(ckvVar);
                        }
                        Map<String, List<String>> allHeaders = b.getAllHeaders();
                        String b2 = b("Content-Type", allHeaders);
                        String b3 = b(Http.Header.CONTENT_LENGTH, allHeaders);
                        Long n = b3 != null ? arm0.n(b3) : null;
                        if (n == null || !n.equals(0L)) {
                            pj7 pj7Var = new pj7(new aek(k7g0Var, dg3Var.a(), this));
                            rt8 rt8Var = (rt8) this.b.b;
                            rt8Var.getClass();
                            okvVar = new okv(pj7Var, new p8v(rt8Var), n, b2);
                        } else {
                            k7g0Var.e();
                            okvVar = null;
                        }
                        mkv mkvVar = new mkv(pek.b(b.getNegotiatedProtocol()), b.getUrl(), b.getHttpStatusCode(), b.getHttpStatusText(), allHeaders, okvVar);
                        if (mkvVar.s() == 0) {
                            Object[] objArr3 = {"Cronet", go9.b("[cronet] Can't determine http status code. Code=0; Text=", mkvVar.t())};
                            qek qekVar3 = vek.a;
                            if (qekVar3 != null) {
                                qekVar3.b(Arrays.copyOf(objArr3, 2));
                            }
                            k7g0Var.e();
                            throw new ProtocolException(go9.b("Unexpected status code 0 from status line: ", mkvVar.t()));
                        }
                        okv n2 = mkvVar.n();
                        long q = n2 != null ? n2.q() : -1L;
                        if ((mkvVar.s() != 204 && mkvVar.s() != 205) || q <= 0) {
                            return mkvVar;
                        }
                        int s = mkvVar.s();
                        okv n3 = mkvVar.n();
                        String str = "HTTP " + s + " had non-zero Content-Length: " + (n3 != null ? Long.valueOf(n3.q()) : null);
                        Object[] objArr4 = {"Cronet", go9.b("[cronet] ", str)};
                        qek qekVar4 = vek.a;
                        if (qekVar4 != null) {
                            qekVar4.b(Arrays.copyOf(objArr4, 2));
                        }
                        k7g0Var.e();
                        throw new ProtocolException(str);
                    } catch (Throwable th) {
                        gkv gkvVar7 = this.d;
                        if (gkvVar7 != null) {
                            gkvVar7.i(ckvVar, th);
                        }
                        Object[] objArr5 = {"Cronet", zr.a("[cronet] Error while await of ", ckvVar.j(), " response!")};
                        qek qekVar5 = vek.a;
                        if (qekVar5 != null) {
                            qekVar5.b(Arrays.copyOf(objArr5, 2));
                        }
                        k7g0Var.e();
                        throw th;
                    }
                } catch (Throwable th2) {
                    Object[] objArr6 = {"Cronet", zr.a("[cronet] Error while await of ", ckvVar.j(), " connection!")};
                    qek qekVar6 = vek.a;
                    if (qekVar6 != null) {
                        qekVar6.b(Arrays.copyOf(objArr6, 2));
                    }
                    gkv gkvVar8 = this.d;
                    if (gkvVar8 != null) {
                        gkvVar8.a(ckvVar, th2);
                    }
                    k7g0Var.e();
                    throw th2;
                }
            } catch (Throwable th3) {
                Object[] objArr7 = {"Cronet", zr.a("[cronet] Error while start session ", ckvVar.j(), "!")};
                qek qekVar7 = vek.a;
                if (qekVar7 != null) {
                    qekVar7.b(Arrays.copyOf(objArr7, 2));
                }
                gkv gkvVar9 = this.d;
                if (gkvVar9 != null) {
                    gkvVar9.f(ckvVar, th3);
                }
                a(ckvVar, takeLast);
                throw th3;
            }
        } catch (Throwable th4) {
            Object[] objArr8 = {"Cronet", zr.a("[cronet] Error while create request ", ckvVar.j(), "!")};
            qek qekVar8 = vek.a;
            if (qekVar8 != null) {
                qekVar8.b(Arrays.copyOf(objArr8, 2));
            }
            oek oekVar2 = this.j;
            oekVar2.d.execute(new nek(0, oekVar2, takeLast));
            gkv gkvVar10 = this.d;
            if (gkvVar10 != null) {
                gkvVar10.e(ckvVar, th4);
            }
            throw th4;
        }
    }

    public final void d(ckv ckvVar, k7g0 k7g0Var) {
        synchronized (this) {
            if (this.g.get()) {
                k7g0Var.e();
            } else {
                k7g0 k7g0Var2 = this.h.get(Long.valueOf(ckvVar.f()));
                if (k7g0Var2 != null) {
                    Object[] objArr = {"Cronet", "[cronet] Request has been started several times with the same id! " + ckvVar.j()};
                    qek qekVar = vek.a;
                    if (qekVar != null) {
                        qekVar.b(Arrays.copyOf(objArr, 2));
                    }
                    k7g0Var2.e();
                }
                this.h.put(Long.valueOf(ckvVar.f()), k7g0Var);
            }
        }
        gkv gkvVar = this.d;
        if (gkvVar != null) {
            gkvVar.k(ckvVar);
        }
        try {
            this.i.j(ckvVar.i());
            if (this.f.get()) {
                throw CronetDisabledException.b;
            }
        } catch (InterruptedException e) {
            Object[] objArr2 = {"Cronet", zr.a("[cronet] Error while acquire async session ", ckvVar.j(), "!")};
            qek qekVar2 = vek.a;
            if (qekVar2 != null) {
                qekVar2.b(Arrays.copyOf(objArr2, 2));
            }
            InterruptedException interruptedException = new InterruptedException(zr.a("Request acquire interrupted for host - ", ckvVar.i().b(), "!"));
            mnh0.d(interruptedException, e);
            throw interruptedException;
        }
    }
}
