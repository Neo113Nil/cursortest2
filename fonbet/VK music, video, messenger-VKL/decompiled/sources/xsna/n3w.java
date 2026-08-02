package xsna;

import android.content.Context;
import android.os.SystemClock;
import android.os.Trace;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.ImEnvironmentNotReadyException;
import com.vk.im.engine.LifecycleState;
import com.vk.im.engine.exceptions.ImEngineException;
import com.vk.im.engine.exceptions.ImproperExecutionThreadException;
import com.vk.im.engine.exceptions.stacktrace.StackTraceInfoException;
import com.vk.im.engine.models.ImBgSyncLaunchState;
import com.vk.im.engine.models.LongPollType;
import com.vk.im.engine.models.credentials.UserCredentials;
import com.vk.im.engine.models.sync.ImBgSyncMode;
import com.vk.log.L;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.random.XorWowRandom;
import xsna.h5o0;

/* compiled from: ImEnvironmentImpl.kt */
/* loaded from: classes.dex */
public final class n3w implements wbw {
    public final pzv a;
    public final Object b = new Object();
    public volatile LifecycleState c;
    public final io.reactivex.rxjava3.subjects.d<LifecycleState> d;
    public volatile StackTraceInfoException e;
    public volatile ImBgSyncLaunchState f;
    public volatile fil0 g;
    public volatile eil0 h;
    public volatile ngl0 i;
    public volatile bhl0 j;
    public volatile a1a0 k;
    public volatile yki0 l;
    public volatile q5o0 m;
    public volatile dsi n;
    public volatile x6x o;
    public volatile u8w p;
    public volatile czp q;
    public volatile fxv r;
    public volatile zpk s;
    public volatile ay5 t;
    public volatile ixv u;
    public volatile zxp v;
    public volatile agx w;
    public volatile Object x;
    public final Object y;
    public static final f9w z = e9w.b("ImEnvironmentImpl");
    public static final XorWowRandom A = qz9.b(System.currentTimeMillis());

    /* compiled from: ImEnvironmentImpl.kt */
    public final class a {
        public a() {
        }
    }

    public n3w(pzv pzvVar) {
        this.a = pzvVar;
        LifecycleState lifecycleState = LifecycleState.IDLE;
        this.d = io.reactivex.rxjava3.subjects.d.O0(lifecycleState);
        this.f = ImBgSyncLaunchState.IDLE;
        this.u = ixv.c;
        this.x = EmptyList.b;
        this.y = msy.a(LazyThreadSafetyMode.NONE, new zkv(this, 1));
        i(lifecycleState);
    }

    public static void n(h5o0 h5o0Var, String str, long j, wzs wzsVar) {
        np10 a2 = h5o0Var.a();
        c3w c3wVar = new c3w();
        StringBuilder sb = new StringBuilder();
        j5g.e0(a2, sb, ",\n", str, "\n]", -1, "...", c3wVar);
        z.debug(new jhg(sb.toString(), 2));
        mp10 mp10Var = (mp10) j5g.h0(h5o0Var.a());
        long millis = mp10Var.d.toMillis(mp10Var.c);
        if (millis > j) {
            wzsVar.invoke(mp10Var.b, Long.valueOf(millis));
        }
    }

    @Override // xsna.w2w
    public final Peer H0() {
        UserCredentials m = this.a.m();
        if (m == null) {
            Serializer.c<Peer> cVar = Peer.CREATOR;
            return Peer.Unknown.e;
        }
        Serializer.c<Peer> cVar2 = Peer.CREATOR;
        return new Peer.User(m.g());
    }

    @Override // xsna.w2w
    public final xgl0 I0() {
        e();
        if (!X0()) {
            x19.N(com.vk.metrics.eventtracking.b.a, new IllegalStateException("Unauthorized access to a StorageManager"));
        }
        return this.j;
    }

    @Override // xsna.w2w
    public final gz3 J0(Object obj, e1w e1wVar) {
        e1wVar.d(obj);
        mla mlaVar = e1wVar.a;
        if (mlaVar == null) {
            mlaVar = null;
        }
        ArrayList n = ad0.n(mlaVar);
        mla mlaVar2 = e1wVar.a;
        return hz3.c(mlaVar2 != null ? mlaVar2 : null, d(e1wVar), sv1.o(e1wVar), n);
    }

    @Override // xsna.w2w
    public final pbw K() {
        return this.a.O;
    }

    @Override // xsna.w2w
    public final void K0(boolean z2) {
        this.g.b = z2;
    }

    @Override // xsna.w2w
    public final <V> V L0(Object obj, e1w<V> e1wVar) throws Exception {
        return (V) m(obj, e1wVar);
    }

    @Override // xsna.w2w
    public final u8w M0() {
        e();
        return this.p;
    }

    @Override // xsna.w2w
    public final String N0() {
        return UUID.randomUUID().toString();
    }

    @Override // xsna.w2w
    public final x6x O0() {
        e();
        return this.o;
    }

    @Override // xsna.w2w
    public final exv P0() {
        e();
        return this.r;
    }

    @Override // xsna.w2w
    public final Peer Q0() {
        return this.a.a.c;
    }

    @Override // xsna.w2w
    public final int R0() {
        return A.l(0, 2147483646) + 1;
    }

    @Override // xsna.w2w
    public final bzp S0() {
        e();
        return this.q;
    }

    @Override // xsna.w2w
    public final void T0(Object obj, ArrayList arrayList) {
        zxp zxpVar = this.v;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sxp sxpVar = (sxp) it.next();
            if (sxpVar instanceof q490) {
                ((q490) sxpVar).b = mq9.a(this);
            }
        }
        if (zxpVar != null) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                sxp sxpVar2 = (sxp) it2.next();
                sxpVar2.getClass();
                sxpVar2.a = pla.g(4, obj);
                ((io.reactivex.rxjava3.subjects.h) zxpVar.a).onNext(sxpVar2);
            }
        }
    }

    @Override // xsna.w2w
    public final csi U0() {
        e();
        return this.n;
    }

    @Override // xsna.w2w
    public final a1a0 V0() {
        e();
        return this.k;
    }

    @Override // xsna.w2w
    public final UserCredentials W0() {
        return this.a.m();
    }

    @Override // xsna.w2w
    public final boolean X0() {
        return this.a.m() != null;
    }

    @Override // xsna.w2w
    public final void Y0(ixv ixvVar) {
        synchronized (this.b) {
            try {
                e();
                if (!epx.f(this.u, ixvVar)) {
                    this.u = ixvVar;
                    e1(this, new u180(ixvVar));
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.w2w
    public final w8w Z0() {
        return this.a.e;
    }

    @Override // xsna.w2w
    public final io.reactivex.rxjava3.internal.operators.observable.m1 a() {
        return this.v.a();
    }

    @Override // xsna.w2w
    public final b0p0 a1() {
        this.a.getClass();
        return vdw.a;
    }

    @Override // xsna.w2w
    public final ixv b() {
        ixv ixvVar;
        synchronized (this.b) {
            ixvVar = ixv.c;
            if (this.c == LifecycleState.READY) {
                ixvVar = this.u;
            }
        }
        return ixvVar;
    }

    @Override // xsna.w2w
    public final <V> V b1(Object obj, xl6<V> xl6Var) throws Exception {
        if (xl6Var.a() != null && !drm0.D(Thread.currentThread().getName(), xl6Var.a(), false)) {
            z.c(new m1o(xl6Var, 14));
            com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
            String name = Thread.currentThread().getName();
            String a2 = xl6Var.a();
            mla mlaVar = xl6Var.a;
            if (mlaVar == null) {
                mlaVar = null;
            }
            x19.N(bVar, new ImproperExecutionThreadException(name, a2, mlaVar));
        }
        return (V) m(obj, xl6Var);
    }

    @Override // xsna.w2w
    public final String c() {
        e();
        this.a.getClass();
        return ply.a();
    }

    @Override // xsna.w2w
    public final void c1(boolean z2, LongPollType longPollType) throws InterruptedException, IOException {
        f840 c;
        e();
        e();
        fxv fxvVar = this.r;
        fxvVar.getClass();
        L.e("ImBgSyncManager", "awaitLongPollSynced " + longPollType + " isAwaitConnection " + z2);
        synchronized (fxvVar) {
            c = fxvVar.c();
        }
        c.a(z2, longPollType);
        L.e("ImBgSyncManager", "awaitLongPollSynced " + longPollType + " DONE");
        e();
    }

    @Override // xsna.wbw
    public final <V> io.reactivex.rxjava3.core.x<V> d(e1w<V> e1wVar) {
        try {
            e();
            g(e1wVar);
            return wp80.l(this.m.i(e1wVar), e1wVar, new xyh(this, 21));
        } catch (Exception e) {
            return io.reactivex.rxjava3.core.x.i(e);
        }
    }

    @Override // xsna.w2w
    public final int d1() {
        e();
        if (!X0()) {
            x19.N(com.vk.metrics.eventtracking.b.a, new IllegalStateException("Unauthorized access to a StorageManager"));
        }
        return this.l.a.system().v();
    }

    public final void e() {
        LifecycleState lifecycleState = this.c;
        StackTraceInfoException stackTraceInfoException = this.e;
        if (lifecycleState == LifecycleState.READY || lifecycleState == LifecycleState.SHUTTING_DOWN) {
            return;
        }
        throw new IllegalArgumentException("Instance is not alive (not ready or shutting down state). Current state: " + lifecycleState, stackTraceInfoException);
    }

    @Override // xsna.w2w
    public final void e1(Object obj, sxp sxpVar) {
        zxp zxpVar = this.v;
        if (sxpVar instanceof q490) {
            ((q490) sxpVar).b = mq9.a(this);
        }
        if (zxpVar != null) {
            sxpVar.getClass();
            sxpVar.a = pla.g(4, obj);
            ((io.reactivex.rxjava3.subjects.h) zxpVar.a).onNext(sxpVar);
        }
    }

    public final void f() {
        LifecycleState lifecycleState = this.c;
        StackTraceInfoException stackTraceInfoException = this.e;
        if (lifecycleState == LifecycleState.READY) {
            return;
        }
        throw new ImEnvironmentNotReadyException("Instance is not in ready state. Current state: " + lifecycleState, stackTraceInfoException);
    }

    @Override // xsna.w2w
    public final long f1() {
        xuo0.a.getClass();
        return xuo0.a();
    }

    public final void g(e1w<?> e1wVar) {
        mla mlaVar = e1wVar.a;
        if (mlaVar == null) {
            mlaVar = null;
        }
        try {
            zpk zpkVar = this.s;
            zpkVar.a().clear();
            int i = 0;
            for (mla mlaVar2 = mlaVar; mlaVar2 != null; mlaVar2 = mlaVar2.a()) {
                i++;
                if (zpkVar.a().get(mlaVar2.b) != null) {
                    if (zpk.d) {
                        return;
                    }
                    zpk.d = true;
                    zpkVar.b(e1wVar, mlaVar);
                    return;
                }
                zpkVar.a().put(mlaVar2.b, mlaVar2);
            }
            if (i > 60) {
                zpkVar.b(e1wVar, mlaVar);
            }
        } catch (ImEngineException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // xsna.w2w
    public final pzv getConfig() {
        return this.a;
    }

    @Override // xsna.w2w
    public final Context getContext() {
        e();
        return this.a.a.a;
    }

    @Override // xsna.w2w
    public final String getDeviceId() {
        e();
        return b6m.b((Context) this.a.b.c);
    }

    @Override // xsna.w2w
    public final com.vk.im.engine.models.c getExperiments() {
        return this.a.h;
    }

    public final ImBgSyncMode h() {
        ImBgSyncMode imBgSyncMode;
        synchronized (this.b) {
            fxv fxvVar = this.r;
            if (fxvVar != null) {
                synchronized (fxvVar) {
                    imBgSyncMode = fxvVar.c;
                }
            } else {
                imBgSyncMode = null;
            }
        }
        return imBgSyncMode;
    }

    public final void i(LifecycleState lifecycleState) {
        this.e = new StackTraceInfoException("Set state " + lifecycleState + " on thread '" + Thread.currentThread().getName() + '\'');
        this.c = lifecycleState;
        this.d.onNext(lifecycleState);
    }

    @Override // xsna.w2w
    public final vre0 i0() {
        e();
        return (vre0) this.a.d.invoke();
    }

    public final void j() throws InterruptedException, ImEngineException {
        Trace.beginSection(ndp0.f("ImEnvironmentImpl.shutdownServicesAndAwaitTermination"));
        try {
            z.debug(new nm0(18));
            a8s a8sVar = new a8s();
            long uptimeMillis = SystemClock.uptimeMillis();
            int i = 7;
            io.reactivex.rxjava3.android.a aVar = new io.reactivex.rxjava3.android.a(this, i);
            EmptyList emptyList = EmptyList.b;
            h5o0.a c = a8sVar.c("StorageTriggerHandler", emptyList, aVar);
            h5o0.a c2 = a8sVar.c("ImBgSyncManager", emptyList, new cs2(this, 10));
            h5o0.a c3 = a8sVar.c("TaskExecutor", Collections.singletonList(a8sVar.c("DataBaseCancellation", emptyList, new yh9(this, 4))), new kv2(this, 3));
            List l = e43.l(c, c2, a8sVar.c("ComposingManager", emptyList, new fs2(this, 8)), c3, a8sVar.c("JobManager", Collections.singletonList(c3), new w29(this, 6)));
            a8sVar.c("StorageManager", l, new gs2(this, 10));
            a8sVar.c("SettingsStorageManager", l, new nx3(this, i));
            a8sVar.d();
            long e = a8sVar.e();
            final long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
            n(a8sVar, "#shutdownServicesAndAwaitTermination done for " + uptimeMillis2 + "ms, but might take " + e + "ms [\n", 5000L, new wzs() { // from class: xsna.x2w
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    long longValue = ((Long) obj2).longValue();
                    n3w.this.a.O.g().h(longValue, uptimeMillis2, (String) obj);
                    return s3q0.a;
                }
            });
            s3q0 s3q0Var = s3q0.a;
        } finally {
            Trace.endSection();
        }
    }

    public final void k(ImBgSyncMode imBgSyncMode, String str) {
        try {
            Trace.beginSection("ImEnvironmentImpl.startBgSync");
            if (h() == imBgSyncMode) {
                return;
            }
            synchronized (this.b) {
                f();
                if (!X0()) {
                    throw new IllegalStateException("Credentials are invalid");
                }
                this.f = ImBgSyncLaunchState.LAUNCHING;
                s3q0 s3q0Var = s3q0.a;
            }
            this.r.f(imBgSyncMode, str);
            e9w.a.set(this.a.P);
            this.f = ImBgSyncLaunchState.ACTIVE;
        } finally {
            Trace.endSection();
        }
    }

    public final a540 l() {
        a540 g;
        try {
            Trace.beginSection("ImEnvironmentImpl.stopBgSync");
            synchronized (this.b) {
                f();
                if (this.f != ImBgSyncLaunchState.ACTIVE) {
                    throw new IllegalStateException("BgSync is not in active state");
                }
                this.f = ImBgSyncLaunchState.IDLE;
                g = this.r.g("stopAll", false);
            }
            return g;
        } finally {
            Trace.endSection();
        }
    }

    public final <V> V m(Object obj, e1w<V> e1wVar) throws Exception {
        e1wVar.d(obj);
        e();
        g(e1wVar);
        q5o0 q5o0Var = this.m;
        q5o0Var.getClass();
        mla mlaVar = e1wVar.a;
        if (mlaVar == null) {
            mlaVar = null;
        }
        return (V) new l5o0(q5o0Var, new km1(19, e1wVar, q5o0Var), e1wVar, mlaVar).call();
    }
}
