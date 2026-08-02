package xsna;

import android.os.SystemClock;
import com.vk.api.sdk.VKApiConfig;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.api.sdk.exceptions.VKLocalIOException;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.Regex;
import org.json.JSONObject;
import xsna.mkx;
import xsna.nkx;
import xsna.vx70;

/* compiled from: InternalMethodChainCall.kt */
/* loaded from: classes.dex */
public final class shx<T> extends ren0<T> {
    public final long h;
    public final List<String> i;
    public int j;

    public shx(wy2 wy2Var, mkx mkxVar, nkx.a aVar, String str, String str2, k7r0 k7r0Var, long j, List list) {
        super(wy2Var, mkxVar, aVar, str, str2, k7r0Var);
        this.h = j;
        this.i = list;
    }

    @Override // xsna.ren0, xsna.kj20, xsna.ara
    public final T a(zqa zqaVar) {
        this.g = zqaVar;
        this.j = zqaVar.l;
        m63.j(m63.c(), new Pair("api.retry_count", Integer.valueOf(this.j)));
        int i = zqaVar.l;
        if (i > 0) {
            this.c.g.put("X-Retry-Counter", String.valueOf(i));
        }
        return (T) super.a(zqaVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.kj20
    public final T d(final gy70 gy70Var) {
        Exception exc;
        Exception exc2;
        boolean z = ((nkx) gy70Var).u;
        final wy2 wy2Var = (wy2) this.a;
        uz2 uz2Var = wy2Var.m;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String invoke = ((VKApiConfig) this.b.a.b).p.invoke();
        String str = gy70Var.d;
        String k0 = drm0.k0(str, "?", str);
        m63.j(m63.c(), new Pair("api.method", k0));
        k7r0<T> k7r0Var = this.f;
        if (z && uz2Var != null) {
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            try {
                try {
                    try {
                        try {
                            exc2 = null;
                            T t = (T) lom0.a(k7r0Var, new gzs() { // from class: xsna.qhx
                                /* JADX WARN: Type inference failed for: r1v4, types: [T, xsna.mkx$b] */
                                /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object, kotlin.Lazy] */
                                @Override // xsna.gzs
                                public final Object invoke() {
                                    int i;
                                    shx shxVar = shx.this;
                                    final mkx mkxVar = (mkx) shxVar.b;
                                    gy70 gy70Var2 = gy70Var;
                                    final nkx nkxVar = (nkx) gy70Var2;
                                    final long j = shxVar.h;
                                    ?? r1 = (mkx.b) vhk0.h(mkxVar.j, "OkHttpExecutor", new izs() { // from class: xsna.hkx
                                        @Override // xsna.izs
                                        public final Object invoke(Object obj) {
                                            mkx mkxVar2 = mkx.this;
                                            return (mkx.b) vhk0.h(mkxVar2.j, "OkHttpExecutor Method Profile Json", new djb(mkxVar2, nkxVar, j), 6);
                                        }
                                    }, 4);
                                    shxVar.c(((vx70.a) r1.a()).b(), gy70Var2);
                                    Set<String> set = zp6.a;
                                    JSONObject c = ((vx70.a) r1.a()).c();
                                    List<String> list = shxVar.i;
                                    v6l v6lVar = wy2Var.j;
                                    boolean z2 = v6lVar != null && v6lVar.f;
                                    if (list != null && !zp6.a.contains(gy70Var2.d) && !gy70Var2.n) {
                                        String valueOf = String.valueOf(c);
                                        if (z2 && drm0.D(valueOf, "\"sizes\":[{\"", false)) {
                                            List A = rli0.A(new ulp0(Regex.d((Regex) zp6.b.getValue(), valueOf), new qt(7)));
                                            int size = A.size();
                                            if (size != 0) {
                                                List<List> list2 = A;
                                                boolean z3 = list2 instanceof Collection;
                                                if (z3 && list2.isEmpty()) {
                                                    i = 0;
                                                } else {
                                                    i = 0;
                                                    for (List list3 : list2) {
                                                        if (list3.contains("base") && list3.size() == 1 && (i = i + 1) < 0) {
                                                            e43.s();
                                                            throw null;
                                                        }
                                                    }
                                                }
                                                if (size != i) {
                                                    if (!z3 || !list2.isEmpty()) {
                                                        Iterator it = list2.iterator();
                                                        int i2 = 0;
                                                        while (it.hasNext()) {
                                                            if (!((List) it.next()).contains("base") && (i2 = i2 + 1) < 0) {
                                                                e43.s();
                                                                throw null;
                                                            }
                                                        }
                                                    }
                                                    if (!z3 || !list2.isEmpty()) {
                                                        int i3 = 0;
                                                        for (List list4 : list2) {
                                                            if (list4.contains("base") && list4.size() > 1 && (i3 = i3 + 1) < 0) {
                                                                e43.s();
                                                                throw null;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if (drm0.D(valueOf, "photo_", false)) {
                                            ArrayList arrayList = new ArrayList();
                                            for (Object obj : list) {
                                                if (drm0.D(valueOf, (String) obj, false)) {
                                                    arrayList.add(obj);
                                                }
                                            }
                                            if (!arrayList.isEmpty()) {
                                                drm0.D(valueOf, "photo_base", false);
                                                j5g.g0(arrayList, StringUtils.COMMA, null, null, 0, null, 62);
                                            }
                                        }
                                    }
                                    ref$ObjectRef.element = r1;
                                    return (vx70.a) r1.a();
                                }
                            }, new rhx(this, gy70Var, ref$ObjectRef, 0 == true ? 1 : 0), str, ((nkx) gy70Var).v);
                            if (((mkx.b) ref$ObjectRef.element) != null) {
                                SystemClock.elapsedRealtime();
                            }
                            m63.j(m63.c(), new Pair("api.duration_ms", Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime)));
                            uz2Var.b(null, k0);
                            return t;
                        } catch (Throwable th) {
                            th = th;
                            uz2Var.b(exc2, k0);
                            throw th;
                        }
                    } catch (IOException e) {
                        m63.b(m63.c(), "network_error", new Pair[0]);
                        uz2Var.a(k0, invoke);
                        throw e;
                    }
                } catch (VKApiExecutionException e2) {
                    m63.b(m63.c(), "vk_api_error", new Pair[0]);
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    if (((mkx.b) ref$ObjectRef.element) == null) {
                        throw e2;
                    }
                    uz2Var.c(elapsedRealtime2, k0, invoke);
                    throw e2;
                }
            } catch (VKLocalIOException e3) {
                m63.b(m63.c(), "vk_local_io", new Pair[0]);
                throw e3;
            } catch (Throwable th2) {
                th = th2;
                exc2 = null;
                uz2Var.b(exc2, k0);
                throw th;
            }
        }
        try {
            try {
                try {
                    T t2 = (T) lom0.a(k7r0Var, new gzs() { // from class: xsna.ohx
                        /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
                        
                            if (r2 == null) goto L10;
                         */
                        @Override // xsna.gzs
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object invoke() {
                            vx70.a d;
                            shx shxVar = shx.this;
                            vx70 vx70Var = shxVar.b;
                            final mkx mkxVar = vx70Var instanceof mkx ? (mkx) vx70Var : null;
                            final gy70 gy70Var2 = gy70Var;
                            if (mkxVar != null) {
                                final long j = shxVar.h;
                                d = (vx70.a) vhk0.h(mkxVar.j, "OkHttpExecutor", new izs() { // from class: xsna.ikx
                                    @Override // xsna.izs
                                    public final Object invoke(Object obj) {
                                        final mkx mkxVar2 = mkxVar;
                                        wdp0 wdp0Var = mkxVar2.j;
                                        final long j2 = j;
                                        final gy70 gy70Var3 = gy70Var2;
                                        return (vx70.a) vhk0.h(wdp0Var, "OkHttpExecutor Method Json", new izs() { // from class: xsna.jkx
                                            @Override // xsna.izs
                                            public final Object invoke(Object obj2) {
                                                gy70 gy70Var4 = gy70Var3;
                                                boolean z2 = gy70Var4 instanceof nkx;
                                                mkx mkxVar3 = mkxVar2;
                                                if (!z2) {
                                                    return mkxVar3.d(gy70Var4);
                                                }
                                                String i = mkxVar3.i(gy70Var4);
                                                okhttp3.u g = mkxVar3.g(mkxVar3.t((nkx) gy70Var4, j2).b());
                                                return new vx70.a(mkxVar3.o(g), g.s(), i);
                                            }
                                        }, 6);
                                    }
                                }, 4);
                            }
                            d = vx70Var.d(gy70Var2);
                            shxVar.c(d.b(), gy70Var2);
                            return d;
                        }
                    }, new phx(0, this, gy70Var), str, ((nkx) gy70Var).v);
                    if (uz2Var != null) {
                        try {
                            SystemClock.elapsedRealtime();
                        } catch (Throwable th3) {
                            th = th3;
                            exc = null;
                            if (uz2Var != null) {
                                uz2Var.b(exc, k0);
                            }
                            throw th;
                        }
                    }
                    m63.j(m63.c(), new Pair("api.duration_ms", Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime)));
                    if (uz2Var != null) {
                        uz2Var.b(null, k0);
                    }
                    return t2;
                } catch (Throwable th4) {
                    th = th4;
                    exc = null;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (VKLocalIOException e4) {
            m63.b(m63.c(), "vk_local_io", new Pair[0]);
            throw e4;
        } catch (IOException e5) {
            m63.b(m63.c(), "network_error", new Pair[0]);
            if (uz2Var == null) {
                throw e5;
            }
            uz2Var.a(k0, invoke);
            throw e5;
        }
    }
}
