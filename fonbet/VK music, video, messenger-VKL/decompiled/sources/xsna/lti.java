package xsna;

import android.os.SystemClock;
import com.vk.httpexecutor.api.exceptions.NetworkFallbackCountException;
import com.vk.knet.core.exceptions.QuicException;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.net.SocketTimeoutException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.text.Regex;
import xsna.wjy;

/* compiled from: CompositeKnetEngine.kt */
/* loaded from: classes.dex */
public final class lti implements kjy {
    public final fky b;
    public volatile kjy c = null;
    public final kjy d;
    public final bpn0 e;
    public final kjv f;
    public final b8g0 g;
    public final wjy.b h;
    public final g3o i;
    public final uia j;
    public final qy8 k;
    public final wdp0 l;
    public final wbd0 m;
    public final ReentrantReadWriteLock n;
    public final String o;

    public lti(fky fkyVar, kjy kjyVar, bpn0 bpn0Var, kjv kjvVar, ikv ikvVar, wjy.b bVar, g3o g3oVar, uia uiaVar, qy8 qy8Var, zbd0 zbd0Var, wdp0 wdp0Var) {
        this.b = fkyVar;
        this.d = kjyVar;
        this.e = bpn0Var;
        this.f = kjvVar;
        this.g = ikvVar;
        this.h = bVar;
        this.i = g3oVar;
        this.j = uiaVar;
        this.k = qy8Var;
        this.l = wdp0Var;
        this.m = zbd0Var != null ? new wbd0(zbd0Var) : null;
        this.n = new ReentrantReadWriteLock();
        this.o = "CronetWithOkHTTP";
    }

    @Override // xsna.kjy
    public final mkv a(ckv ckvVar, yjv yjvVar) {
        return (mkv) vhk0.h(this.l, "KnetEngine", new fd5(this, ckvVar, yjvVar, 2), 4);
    }

    public final mkv b(yjv yjvVar, ckv ckvVar, kjy kjyVar, boolean z) {
        wjy.b bVar = this.h;
        fky fkyVar = this.b;
        qek qekVar = this.f.b;
        String str = this.o;
        b8g0 b8g0Var = this.g;
        ckv a = b8g0Var.a(ckvVar);
        if (kjyVar == null) {
            return d(this.d, a, yjvVar);
        }
        if (!z) {
            return d(kjyVar, a, yjvVar);
        }
        ckv d = b8g0Var.d(ckvVar);
        if (d == null) {
            return d(kjyVar, a, yjvVar);
        }
        ckv b = b8g0Var.b(d, d);
        if (b != null) {
            return d(kjyVar, b, yjvVar);
        }
        try {
            return d(kjyVar, d, yjvVar);
        } catch (QuicException e) {
            qekVar.d(e);
            fkyVar.c(str, "[compat] Request " + d.j() + " has protocol quic error!");
            b8g0Var.c(((Number) bVar.invoke()).longValue(), d.i().b(), ckvVar.i().b());
            L.e(str, "[compat] Repeat sending request " + ckvVar.j() + '!');
            return a(ckv.a(ckvVar, null, null, null, null, 31), yjvVar);
        } catch (SocketTimeoutException e2) {
            if (!((y260) this.e.getValue()).a()) {
                fkyVar.c(str, "[compat] Request " + d.j() + " out of time!");
                yjvVar.a().a(e2);
                throw e2;
            }
            qekVar.d(e2);
            fkyVar.c(str, "[compat] Request " + d.j() + " out of time with network!");
            qekVar.getClass();
            wjy wjyVar = wjy.a;
            if (Boolean.FALSE.booleanValue() && ((AtomicBoolean) qekVar.b).get()) {
                b8g0Var.c(((Number) bVar.invoke()).longValue(), d.i().b(), ckvVar.i().b());
            }
            L.e(str, "[compat] Repeat sending request " + ckvVar.j() + '!');
            return a(ckv.a(ckvVar, null, null, null, null, 31), yjvVar);
        }
    }

    public final boolean c(ckv ckvVar) {
        if (!((Boolean) this.k.invoke()).booleanValue()) {
            return false;
        }
        List<Regex> list = n460.i;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((Regex) it.next()).f(ckvVar.i().b())) {
                return true;
            }
        }
        return false;
    }

    public final mkv d(kjy kjyVar, ckv ckvVar, yjv yjvVar) {
        kjv kjvVar = this.f;
        try {
            mkv a = kjyVar.a(ckvVar, yjvVar);
            t6j t6jVar = kjvVar.a;
            synchronized (t6jVar) {
                if (((AtomicInteger) t6jVar.c).get() < 8) {
                    ((AtomicInteger) t6jVar.c).set(0);
                }
            }
            return a;
        } catch (Exception e) {
            boolean a2 = ((y260) this.e.getValue()).a();
            boolean f = epx.f(kjyVar.getId(), "CRONET");
            String str = this.o;
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{str, zy60.c("[compat] Got exception while executing request! hasNetwork=", "; isCronet: ", a2, f)});
            }
            if (a2) {
                if (c(ckvVar)) {
                    L l2 = L.a;
                    l2.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l2, L.LogType.d, new Object[]{str, "[compat] Ignored request to fallback. Skip conditions notifying"});
                    }
                } else {
                    L l3 = L.a;
                    l3.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l3, L.LogType.d, new Object[]{str, zhy0.a("[compat] Increment fallback condition for network engine selection. isCronet: ", f)});
                    }
                    t6j t6jVar2 = kjvVar.a;
                    if (((AtomicInteger) t6jVar2.c).incrementAndGet() == 8) {
                        L l4 = L.a;
                        l4.getClass();
                        if (!L.m(LoggerOutputTarget.NONE)) {
                            L.u(l4, L.LogType.d, new Object[]{"FallbackCondition reached max of failure requests in row - 8!"});
                        }
                        ((wjy.c) t6jVar2.b).invoke(new NetworkFallbackCountException("FallbackCondition reached max of failure requests in row - 8!"));
                    }
                    qkv qkvVar = kjvVar.c;
                    synchronized (qkvVar) {
                        try {
                            if (qkvVar.a.invoke().booleanValue() && qkvVar.e.size() < qkvVar.b.invoke().intValue()) {
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                while (!qkvVar.e.isEmpty() && elapsedRealtime - ((Number) j5g.X(qkvVar.e)).longValue() > qkvVar.c.invoke().longValue()) {
                                    qkvVar.e.removeFirst();
                                }
                                qkvVar.e.addLast(Long.valueOf(elapsedRealtime));
                                if (qkvVar.e.size() == qkvVar.b.invoke().intValue()) {
                                    String str2 = "FallbackCondition reached max of failure requests in time window. Count=" + qkvVar.b.invoke().intValue() + " Window:" + qkvVar.c.invoke().longValue() + " ms!";
                                    L l5 = L.a;
                                    l5.getClass();
                                    if (!L.m(LoggerOutputTarget.NONE)) {
                                        L.u(l5, L.LogType.d, new Object[]{str2});
                                    }
                                    qkvVar.d.invoke(new NetworkFallbackCountException(str2));
                                }
                            }
                            if (f) {
                                kjv kjvVar2 = this.f;
                                if (kjvVar2.a.a() || kjvVar2.c.a()) {
                                    sek sekVar = kjyVar instanceof sek ? (sek) kjyVar : null;
                                    if (sekVar != null) {
                                        sekVar.b.f.set(true);
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
            yjvVar.a().a(e);
            throw e;
        }
    }

    @Override // xsna.kjy
    public final String getId() {
        return this.o;
    }
}
