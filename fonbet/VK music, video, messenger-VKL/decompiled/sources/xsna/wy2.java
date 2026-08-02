package xsna;

import com.vk.api.internal.LongPollCall;
import com.vk.api.sdk.VKApiConfig;
import com.vk.api.sdk.exceptions.VKApiException;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.channels.ClosedByInterruptException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.k7r0;
import xsna.n2p0;
import xsna.nkx;

/* compiled from: ApiManager.kt */
/* loaded from: classes.dex */
public final class wy2 extends ydq {
    public static final AtomicLong q = new AtomicLong();
    public final v6l j;
    public final v03 k;
    public cpl l;
    public uz2 m;
    public final a n;
    public final bpn0 o;
    public final bpn0 p;

    /* compiled from: ApiManager.kt */
    public static final class a {
        public boolean a;
        public String b;
    }

    /* compiled from: ApiManager.kt */
    /* loaded from: classes15.dex */
    public static final class b<Result> implements k7r0 {
        public static final b<Result> b = new b<>();

        @Override // xsna.k7r0
        public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
            return s3q0.a;
        }

        @Override // xsna.k7r0
        public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
            return k7r0.a.a(this, qrj0Var2);
        }
    }

    public wy2(VKApiConfig vKApiConfig, v6l v6lVar, v03 v03Var) {
        super(vKApiConfig);
        new bpn0(new v62(vKApiConfig, 2));
        this.j = v6lVar;
        this.k = v03Var;
        this.n = new a();
        this.o = new bpn0(new uy2(this, 0));
        this.p = new bpn0(new vy2(0, vKApiConfig, this));
    }

    @Override // xsna.l7r0
    public final <T> ara<T> a(com.vk.api.sdk.a aVar, k7r0<T> k7r0Var) {
        Set<String> set = zp6.a;
        v6l v6lVar = this.j;
        List<String> list = v6lVar != null ? v6lVar.e : null;
        VKApiConfig vKApiConfig = this.a;
        vKApiConfig.G.invoke();
        zp6.a(aVar, list);
        long incrementAndGet = q.incrementAndGet();
        if (aVar instanceof ij20) {
            ((ij20) aVar).x = Long.valueOf(incrementAndGet);
        }
        nkx.a aVar2 = new nkx.a();
        aVar2.n(aVar);
        ara<T> i = iyx.i(new d4y0(this, iyx.i(new shx(this, i(), aVar2, vKApiConfig.f.getValue(), vKApiConfig.b(), k7r0Var, incrementAndGet, v6lVar != null ? v6lVar.e : null), r(), "Method", aVar.c)), r(), "XRetry", null);
        return ((Boolean) vKApiConfig.n.getValue()).booleanValue() ? iyx.i(new ugs(this, aVar, i), r(), "FrequentMethod", null) : i;
    }

    @Override // xsna.l7r0
    public final <T> bkv<T> b(xbr0 xbr0Var, m7r0 m7r0Var, k7r0<T> k7r0Var) {
        if (xbr0Var instanceof akv) {
            ((akv) xbr0Var).e(Long.valueOf(q.incrementAndGet()));
        }
        skx skxVar = new skx(this, i(), xbr0Var, m7r0Var, k7r0Var);
        wdp0 r = r();
        return r == null ? skxVar : new wz80(r, skxVar);
    }

    @Override // xsna.l7r0
    public final n2p0 c(com.vk.api.sdk.a aVar, jpx jpxVar) {
        int i = aVar.g;
        VKApiConfig vKApiConfig = this.a;
        return new n2p0(this, i, new n2p0.a(vKApiConfig.H, vKApiConfig.I), z4g.e, jpxVar);
    }

    @Override // xsna.l7r0
    public final <T> T e(nx2<T> nx2Var) throws InterruptedException, IOException, VKApiException {
        return nx2Var.f(this);
    }

    @Override // xsna.l7r0
    public final <T> T h(ara<? extends T> araVar) throws InterruptedException, IOException, VKApiException {
        Long l;
        VKApiConfig vKApiConfig = this.a;
        vtk0 vtk0Var = vKApiConfig.d;
        if (araVar instanceof rsk0) {
            rsk0 rsk0Var = (rsk0) araVar;
            long j = rsk0Var.c;
            l = Long.valueOf(j);
            vtk0Var.e(j, rsk0Var.b);
        } else if (araVar instanceof jz80) {
            jz80 jz80Var = (jz80) araVar;
            long j2 = jz80Var.d;
            l = Long.valueOf(j2);
            vtk0Var.e(j2, jz80Var.c);
        } else {
            l = null;
        }
        try {
            zqa zqaVar = new zqa();
            zqaVar.f = "https://" + vKApiConfig.p.invoke();
            T a2 = araVar.a(zqaVar);
            if (l == null) {
                return a2;
            }
            ((kui) gjv.a()).a(l.longValue());
            return a2;
        } catch (Exception e) {
            if (l != null) {
                ((kui) gjv.a()).b(l.longValue(), e);
            }
            if (e instanceof InterruptedException) {
                throw e;
            }
            if (e instanceof InterruptedIOException) {
                boolean interrupted = Thread.interrupted();
                if (interrupted) {
                    throw new InterruptedException("request interrupted");
                }
                if (interrupted) {
                    throw new NoWhenBranchMatchedException();
                }
                throw e;
            }
            if (e instanceof ClosedByInterruptException) {
                Thread.interrupted();
                InterruptedException interruptedException = new InterruptedException("request interrupted [cause:ClosedByInterruptException]");
                interruptedException.initCause(e);
                throw interruptedException;
            }
            if (e instanceof IOException) {
                throw e;
            }
            if (e instanceof VKApiException) {
                throw e;
            }
            if (e instanceof IllegalArgumentException) {
                com.vk.metrics.eventtracking.b.a.a(e);
                throw e;
            }
            StringBuilder sb = new StringBuilder("Internal module error, cause = ");
            sb.append(qjg.a(e));
            sb.append(' ');
            String message = e.getMessage();
            sb.append(message != null ? message : null);
            throw new VKApiException(sb.toString(), e);
        }
    }

    @Override // xsna.ydq, xsna.l7r0
    public final <T> ara<T> k(com.vk.api.sdk.a aVar, ara<? extends T> araVar) {
        Long l;
        ara<? extends T> i = iyx.i(new cv2(this, iyx.i(new u1p0(this, aVar.g, super.k(aVar, araVar)), r(), "TConfirm", null)), r(), "AnonymTSign", null);
        if (aVar instanceof ij20) {
            ij20 ij20Var = (ij20) aVar;
            i = iyx.i(new d0g(this, ij20Var.c, this.k, i), r(), "ColdStart", null);
            if (aVar.i) {
                i = iyx.i(new g260(this, i), r(), "NetworkAwait", null);
            }
            l = ij20Var.x;
        } else {
            l = null;
        }
        ara<T> s = s(aVar.c, i);
        long longValue = l != null ? l.longValue() : q.incrementAndGet();
        return new jz80(this, r(), aVar.c, longValue, aVar instanceof har0 ? "batch" : "method", iyx.i(new rsk0(this, aVar.c, longValue, s), r(), "Stat", null));
    }

    @Override // xsna.ydq, xsna.l7r0
    public final <T> ara<T> l(xbr0 xbr0Var, ara<? extends T> araVar) {
        Long l;
        ara<? extends T> i = iyx.i(new u1p0(this, xbr0Var.a(), super.l(xbr0Var, araVar)), r(), "TConfirm", null);
        if (xbr0Var instanceof akv) {
            akv akvVar = (akv) xbr0Var;
            i = iyx.i(new d0g(this, akvVar.b(), this.k, i), r(), "ColdStart", null);
            if (xbr0Var.c()) {
                i = iyx.i(new g260(this, i), r(), "NetworkAwait", null);
            }
            l = akvVar.d();
        } else {
            l = null;
        }
        ara<T> s = s(xbr0Var.b(), i);
        long longValue = l != null ? l.longValue() : q.incrementAndGet();
        return new jz80(this, r(), xbr0Var.b(), longValue, "http_post", iyx.i(new rsk0(this, xbr0Var.b(), longValue, s), r(), "Stat", null));
    }

    public final File m(o8o o8oVar, m7r0 m7r0Var) throws InterruptedException, IOException, VKApiException {
        long incrementAndGet = q.incrementAndGet();
        p8o p8oVar = new p8o(this, i(), o8oVar, incrementAndGet, m7r0Var);
        ara i = iyx.i(new d0g(this, o8oVar.b(), this.k, p8oVar), r(), "ColdStart", null);
        if (o8oVar.c()) {
            i = iyx.i(new g260(this, i), r(), "NetworkAwait", null);
        }
        return (File) h(new jz80(this, r(), o8oVar.b(), incrementAndGet, "download", iyx.i(new rsk0(this, o8oVar.b(), incrementAndGet, s(o8oVar.b(), i)), r(), "Stat", null)));
    }

    public final <T> T n(LongPollCall longPollCall, k7r0<T> k7r0Var) throws InterruptedException, IOException, VKApiException {
        long incrementAndGet = q.incrementAndGet();
        ara i = iyx.i(new y300(this, i(), longPollCall, incrementAndGet, k7r0Var), r(), "LongPoll", null);
        return (T) h(new jz80(this, r(), longPollCall.a(), incrementAndGet, "longpoll", iyx.i(new rsk0(this, longPollCall.a(), incrementAndGet, s(longPollCall.a(), iyx.i(new d0g(this, longPollCall.a(), this.k, i), r(), "ColdStart", null))), r(), "Stat", null)));
    }

    public final <T> T o(tkv tkvVar, k7r0<T> k7r0Var) throws InterruptedException, IOException, VKApiException {
        long incrementAndGet = q.incrementAndGet();
        ara i = iyx.i(new fjr0(this, 0, iyx.i(new ukv(this, i(), tkvVar, k7r0Var, incrementAndGet), r(), "HttpUrl", null), this.d), r(), "Validation", null);
        ara<? extends T> i2 = iyx.i(new d0g(this, tkvVar.a(), this.k, i), r(), "ColdStart", null);
        if (tkvVar.b()) {
            i2 = iyx.i(new g260(this, i2), r(), "NetworkAwait", null);
        }
        return (T) h(new jz80(this, r(), tkvVar.a(), incrementAndGet, "http_url", iyx.i(new rsk0(this, tkvVar.a(), incrementAndGet, s(tkvVar.a(), i2)), r(), "Stat", null)));
    }

    public final void p(tkv tkvVar) {
        o(tkvVar, b.b);
    }

    @Override // xsna.l7r0
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final mkx i() {
        return (mkx) this.p.getValue();
    }

    public final wdp0 r() {
        return (wdp0) this.o.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> ara<T> s(String str, ara<? extends T> araVar) {
        v6l v6lVar = this.j;
        return (v6lVar != null ? v6lVar.c : null) != null ? iyx.i(new rjq(this, str, v6lVar.c, v6lVar.d, araVar), r(), "FakeNetwork", null) : araVar;
    }
}
