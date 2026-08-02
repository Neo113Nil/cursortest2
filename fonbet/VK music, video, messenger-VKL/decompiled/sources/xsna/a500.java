package xsna;

import android.database.sqlite.SQLiteException;
import com.vk.api.internal.utils.NetworkBroadcastReceiver;
import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.im.engine.exceptions.ApiLongPollException;
import com.vk.im.engine.exceptions.ImEngineDbUnrecoverableException;
import com.vk.im.engine.exceptions.LongPollInconsistentChannelsStateException;
import com.vk.im.engine.exceptions.LongPollInconsistentStateException;
import com.vk.im.engine.internal.longpoll.LongPollSqliteException;
import com.vk.im.engine.internal.longpoll.polling_tasks.channels.ChannelsLongPollUnsupportedException;
import com.vk.im.engine.internal.longpoll.polling_tasks.sse.SseInvalidUrlException;
import com.vk.im.engine.internal.sync.longpoll.LongPollSyncManager$InitialSyncState;
import com.vk.im.engine.models.ImBgSyncState;
import com.vk.im.engine.models.LongPollType;
import com.vk.im.engine.models.credentials.UserCredentials;
import com.vk.im.log.LogLevel;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.network.eventhub.api.exception.EventHubServiceException;
import com.vk.network.sse.SseFailureException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import org.json.JSONException;
import xsna.a400;
import xsna.fxv;
import xsna.v400;
import xsna.whc;

/* compiled from: LongPollSyncThread.kt */
/* loaded from: classes2.dex */
public final class a500 extends Thread {
    public final LongPollType b;
    public final w2w c;
    public final py6 d;
    public final w400 e;
    public final bis f;
    public final gzs<Boolean> g;
    public final xis h;
    public final f9w i;
    public final fxv.a j;
    public final m1y k;
    public final CountDownLatch l = new CountDownLatch(1);
    public final io.reactivex.rxjava3.subjects.d<LongPollSyncManager$InitialSyncState> m = io.reactivex.rxjava3.subjects.d.O0(LongPollSyncManager$InitialSyncState.STOPPED);
    public final Object n = new Object();
    public final AtomicBoolean o = new AtomicBoolean(false);
    public final a p;
    public final bpn0 q;
    public final bpn0 r;
    public final t6o0 s;
    public final c7o0 t;
    public final b7o0 u;
    public final laq v;
    public final laq w;
    public a400 x;
    public int y;
    public static final List<Integer> z = e43.l(907, 908);
    public static final long A = TimeUnit.SECONDS.toMillis(2);

    /* compiled from: LongPollSyncThread.kt */
    public final class a implements aox {
        public a() {
        }

        @Override // xsna.aox
        public final void b() {
            a500 a500Var = a500.this;
            if (a500Var.isInterrupted() || a500Var.o.get()) {
                Thread.interrupted();
                throw new InterruptedException("long-poll thread interrupted");
            }
        }
    }

    public a500(LongPollType longPollType, w2w w2wVar, py6 py6Var, w400 w400Var, c500 c500Var, bis bisVar, gzs gzsVar, xis xisVar, f9w f9wVar, String str, fxv.a aVar, m1y m1yVar) {
        this.b = longPollType;
        this.c = w2wVar;
        this.d = py6Var;
        this.e = w400Var;
        this.f = bisVar;
        this.g = gzsVar;
        this.h = xisVar;
        this.i = f9wVar;
        this.j = aVar;
        this.k = m1yVar;
        a aVar2 = new a();
        this.p = aVar2;
        this.q = new bpn0(new i4(c500Var, str, this));
        this.r = new bpn0(new ks2(c500Var, str, this));
        this.s = c500Var.a(str, longPollType, w2wVar, aVar2);
        this.t = c500Var.f(longPollType, w2wVar, aVar2);
        this.u = c500Var.d(aVar2);
        this.v = new laq(24, 500L, 2.0f, 600000L);
        this.w = new laq(24, 500L, 1.5f, 60000L);
    }

    public static long e(a400 a400Var) {
        if (a400Var instanceof a400.a) {
            ((a400.a) a400Var).getClass();
            throw null;
        }
        if (a400Var instanceof a400.b) {
            return ((a400.b) a400Var).a.a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void a() {
        if (this.b == LongPollType.MESSAGES) {
            f900 f900Var = f900.a;
            f900Var.getClass();
            int i = f900.c;
            f900Var.getClass();
            f900.c = i + 1;
            if (i >= 2) {
                f900Var.getClass();
                f900.b.setLength(0);
                f900Var.getClass();
                f900.c = 0;
            }
        }
    }

    public final void b() {
        ImBgSyncState imBgSyncState = ImBgSyncState.CONNECTING;
        l(imBgSyncState);
        this.i.debug(new tj2(14));
        a400 a2 = ((o6o0) this.q.getValue()).a(this.c, null, null);
        this.x = a2;
        this.e.b(a2.a());
        l(imBgSyncState);
    }

    public final void c(String str) {
        if (this.b == LongPollType.MESSAGES) {
            f900.a.a(str);
        }
    }

    public final void d(Exception exc) {
        c("Error InterruptedException LongPoll time= " + System.currentTimeMillis());
        x84 x84Var = new x84(18);
        boolean t = sv1.t(exc);
        f9w f9wVar = this.i;
        if (t) {
            f9wVar.debug(x84Var);
        } else {
            f9wVar.b(exc, x84Var);
        }
        io.reactivex.rxjava3.subjects.d<LongPollSyncManager$InitialSyncState> dVar = this.m;
        if (dVar.P0() != LongPollSyncManager$InitialSyncState.SYNCED) {
            dVar.onNext(LongPollSyncManager$InitialSyncState.INTERRUPTED);
        }
    }

    public final void f(v400 v400Var) {
        l(ImBgSyncState.REFRESHING);
        this.i.debug(new nd1(22));
        a400 a2 = ((o6o0) this.r.getValue()).a(this.c, v400Var, null);
        this.x = a2;
        this.e.b(a2.a());
        l(ImBgSyncState.REFRESHED);
    }

    public final void g() {
        boolean d = this.w.d();
        w2w w2wVar = this.c;
        long j = A;
        if (!d && !this.v.d()) {
            j = w2wVar.getConfig().f0;
        }
        StringBuilder sb = new StringBuilder("Start LongPollLive pts = ");
        a400 a400Var = this.x;
        if (a400Var == null) {
            a400Var = null;
        }
        sb.append(e(a400Var));
        sb.append(" time= ");
        sb.append(System.currentTimeMillis());
        c(sb.toString());
        f9w f9wVar = this.i;
        f9wVar.getClass();
        if (!f9wVar.d(LogLevel.VERBOSE)) {
            String str = f9wVar.a;
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.v, new Object[]{str, defpackage.k0.a(j, "request long poll live with timeout ")});
            }
        }
        ImBgSyncState imBgSyncState = ImBgSyncState.CONNECTED;
        l(imBgSyncState);
        a400 a400Var2 = this.x;
        if (a400Var2 == null) {
            a400Var2 = null;
        }
        a400 a2 = this.s.a(w2wVar, a400Var2, j);
        this.x = a2;
        this.e.b(a2.a());
        l(imBgSyncState);
        StringBuilder sb2 = new StringBuilder("Stop LongPollLive pts = ");
        a400 a400Var3 = this.x;
        sb2.append(e(a400Var3 != null ? a400Var3 : null));
        sb2.append(" time= ");
        sb2.append(System.currentTimeMillis());
        c(sb2.toString());
    }

    public final void h() {
        f9w f9wVar = this.i;
        f9wVar.getClass();
        if (!f9wVar.d(LogLevel.VERBOSE)) {
            String str = f9wVar.a;
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.v, new Object[]{str, "request socket live"});
            }
        }
        try {
            c("Start socket pts, time= " + System.currentTimeMillis());
            this.u.b(this.c, new x3i(this, 21));
        } catch (EventHubServiceException e) {
            c("Stop socket MasterServiceException time= " + System.currentTimeMillis());
            Throwable cause = e.getCause();
            if (cause != null) {
                throw cause;
            }
        } catch (IOException e2) {
            c("Stop socket IOException time= " + System.currentTimeMillis());
            Throwable cause2 = e2.getCause();
            if (cause2 != null) {
                throw cause2;
            }
        } catch (Exception e3) {
            c("Stop Socket " + qjg.a(e3) + " time= " + System.currentTimeMillis());
            throw e3;
        }
    }

    public final void i() {
        f9w f9wVar = this.i;
        f9wVar.getClass();
        if (!f9wVar.d(LogLevel.VERBOSE)) {
            String str = f9wVar.a;
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.v, new Object[]{str, "request sse live"});
            }
        }
        try {
            StringBuilder sb = new StringBuilder("Start Sse pts = ");
            a400 a400Var = this.x;
            a400 a400Var2 = null;
            if (a400Var == null) {
                a400Var = null;
            }
            sb.append(e(a400Var));
            sb.append(" time= ");
            sb.append(System.currentTimeMillis());
            c(sb.toString());
            l(ImBgSyncState.CONNECTED);
            c7o0 c7o0Var = this.t;
            w2w w2wVar = this.c;
            a400 a400Var3 = this.x;
            if (a400Var3 != null) {
                a400Var2 = a400Var3;
            }
            c7o0Var.a(w2wVar, a400Var2, new zkh(this, 28));
        } catch (SseInvalidUrlException e) {
            c("Stop Sse SseInvalidUrlException time= " + System.currentTimeMillis());
            this.y = 4;
            Throwable cause = e.getCause();
            if (cause != null) {
                throw cause;
            }
        } catch (SseFailureException e2) {
            c("Stop Sse SseFailureException time= " + System.currentTimeMillis());
            this.y = this.y + 1;
            Throwable cause2 = e2.getCause();
            if (cause2 != null) {
                throw cause2;
            }
        } catch (Exception e3) {
            c("Stop Sse " + qjg.a(e3) + " time= " + System.currentTimeMillis());
            throw e3;
        }
    }

    @Override // java.lang.Thread
    public final void interrupt() {
        this.o.set(true);
        this.t.cancel();
        this.u.a();
        super.interrupt();
    }

    public final void j() {
        this.w.c();
        this.v.c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0160, code lost:
    
        java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x016a, code lost:
    
        throw new java.lang.InterruptedException("long-poll thread interrupted");
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02d4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0275  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k() {
        AtomicBoolean atomicBoolean;
        laq laqVar;
        laq laqVar2;
        JSONException jSONException;
        Pair pair;
        boolean booleanValue;
        Throwable longPollInconsistentStateException;
        fxv.a aVar;
        LongPollType longPollType;
        VKApiExecutionException vKApiExecutionException;
        boolean z2;
        boolean z3;
        boolean z4;
        AtomicBoolean atomicBoolean2 = this.o;
        f9w f9wVar = this.i;
        laq laqVar3 = this.w;
        laq laqVar4 = this.v;
        L l = L.a;
        l.getClass();
        boolean m = L.m(LoggerOutputTarget.NONE);
        LongPollType longPollType2 = this.b;
        if (!m) {
            L.u(l, L.LogType.d, new Object[]{"LongPollSyncThread", "Started sync thread with type " + longPollType2});
        }
        LongPollSyncManager$InitialSyncState longPollSyncManager$InitialSyncState = LongPollSyncManager$InitialSyncState.STARTED;
        io.reactivex.rxjava3.subjects.d<LongPollSyncManager$InitialSyncState> dVar = this.m;
        dVar.onNext(longPollSyncManager$InitialSyncState);
        l(ImBgSyncState.CONNECTING);
        NetworkBroadcastReceiver.a(this.n);
        v400 a2 = this.e.a();
        xis xisVar = this.h;
        boolean booleanValue2 = ((Boolean) xisVar.invoke()).booleanValue();
        boolean z5 = !booleanValue2;
        boolean z6 = a2 == null && !booleanValue2;
        boolean z7 = (z6 || booleanValue2) ? false : true;
        if (longPollType2 == LongPollType.CHANNELS && ((Boolean) xisVar.invoke()).booleanValue()) {
            ((yzp) this.k.invoke()).b();
        }
        String h = o25.a().h();
        boolean z8 = z6;
        String str = "";
        boolean z9 = z7;
        while (true) {
            try {
                a();
                c("Start LongPoll time=" + System.currentTimeMillis());
            } catch (ChannelsLongPollUnsupportedException e) {
                com.vk.metrics.eventtracking.b.a.a(e);
                return;
            } catch (IOException e2) {
                atomicBoolean = atomicBoolean2;
                laqVar = laqVar3;
                laqVar2 = laqVar4;
                io.reactivex.rxjava3.subjects.d<LongPollSyncManager$InitialSyncState> dVar2 = dVar;
                longPollType = longPollType2;
                if ((e2 instanceof InterruptedIOException) && (isInterrupted() || atomicBoolean.get())) {
                    d(e2);
                    return;
                }
                c("Error IOException " + e2 + " LongPoll time= " + System.currentTimeMillis());
                f9wVar.f(new s6y(e2, 1));
                laqVar.b();
                laqVar2.c();
                dVar = dVar2;
                atomicBoolean2 = atomicBoolean;
                laqVar3 = laqVar;
                laqVar4 = laqVar2;
                longPollType2 = longPollType;
            } catch (InterruptedException e3) {
                d(e3);
                return;
            } catch (Throwable th) {
                atomicBoolean = atomicBoolean2;
                boolean z10 = z8;
                String str2 = str;
                laqVar = laqVar3;
                StringBuilder sb = new StringBuilder("Error Throwable ");
                sb.append(th);
                sb.append(" LongPoll time= ");
                laqVar2 = laqVar4;
                sb.append(System.currentTimeMillis());
                c(sb.toString());
                if (th instanceof VKApiIllegalResponseException) {
                    com.vk.metrics.eventtracking.b.a.a(th);
                } else {
                    for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                        if (th2.getClass().equals(JSONException.class)) {
                            jSONException = (JSONException) th2;
                            break;
                        } else {
                            if (th2.equals(th2.getCause())) {
                                break;
                            }
                        }
                    }
                    jSONException = null;
                    if (jSONException != null) {
                        com.vk.metrics.eventtracking.b.a.a(th);
                    } else if (th instanceof VKApiException) {
                        cj4 cj4Var = new cj4(25);
                        Exception exc = th;
                        if (sv1.t(exc)) {
                            f9wVar.debug(cj4Var);
                        } else {
                            f9wVar.b(exc, cj4Var);
                        }
                    } else {
                        com.vk.metrics.eventtracking.b.a.a(th);
                    }
                }
                if (th instanceof VKApiExecutionException) {
                    VKApiExecutionException vKApiExecutionException2 = (VKApiExecutionException) th;
                    Integer valueOf = Integer.valueOf(vKApiExecutionException2.s());
                    List<Integer> list = z;
                    if (list.contains(valueOf)) {
                        vKApiExecutionException = vKApiExecutionException2;
                    } else {
                        List<VKApiExecutionException> v = vKApiExecutionException2.v();
                        if (v != null) {
                            List<VKApiExecutionException> list2 = v;
                            vKApiExecutionException = vKApiExecutionException2;
                            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                Iterator<T> it = list2.iterator();
                                while (it.hasNext()) {
                                    if (list.contains(Integer.valueOf(((VKApiExecutionException) it.next()).s()))) {
                                    }
                                }
                            }
                        } else {
                            vKApiExecutionException = vKApiExecutionException2;
                        }
                        z2 = false;
                        if (vKApiExecutionException.s() == 990) {
                            List<VKApiExecutionException> v2 = vKApiExecutionException.v();
                            if (v2 != null) {
                                List<VKApiExecutionException> list3 = v2;
                                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                                    Iterator<T> it2 = list3.iterator();
                                    while (it2.hasNext()) {
                                        z3 = z2;
                                        if (((VKApiExecutionException) it2.next()).s() != 990) {
                                            z2 = z3;
                                        }
                                    }
                                }
                            }
                            z3 = z2;
                            z4 = false;
                            if (z3) {
                                pair = new Pair(Boolean.TRUE, whc.b.c);
                            } else if (z4) {
                                pair = new Pair(Boolean.TRUE, whc.b.c);
                            } else {
                                pair = new Pair(Boolean.FALSE, null);
                                booleanValue = ((Boolean) pair.d()).booleanValue();
                                whc whcVar = (whc) pair.g();
                                boolean z11 = !(th instanceof ApiLongPollException) && ((ApiLongPollException) th).d();
                                if (!booleanValue) {
                                    f9wVar.c(new gu0(23));
                                    a400 a400Var = this.x;
                                    if (a400Var != null) {
                                        a2 = a400Var.a();
                                    }
                                    boolean equals = h.equals(o25.a().h());
                                    boolean f = epx.f(str2, o25.a().h());
                                    boolean z12 = dVar.P0() != LongPollSyncManager$InitialSyncState.SYNCED;
                                    w2w w2wVar = this.c;
                                    String g = w2wVar.I0().g();
                                    if (g == null) {
                                        g = "";
                                    }
                                    UserCredentials W0 = w2wVar.W0();
                                    long g2 = W0 != null ? W0.g() : 0L;
                                    long j = o25.a().c().b;
                                    int i = b400.$EnumSwitchMapping$0[longPollType2.ordinal()];
                                    if (i == 1) {
                                        v400.b bVar = a2 instanceof v400.b ? (v400.b) a2 : null;
                                        StringBuilder sb2 = new StringBuilder();
                                        StringBuilder sb3 = new StringBuilder("ts = ");
                                        long j2 = g2;
                                        sb3.append(bVar != null ? bVar.b : -1L);
                                        sb3.append(", ");
                                        sb2.append(sb3.toString());
                                        StringBuilder sb4 = new StringBuilder("pts = ");
                                        sb4.append(bVar != null ? bVar.a : -1L);
                                        sb4.append(", ");
                                        sb2.append(sb4.toString());
                                        sb2.append("shouldInitLpServer = " + z10 + ", ");
                                        sb2.append("shouldRequestLpHistory = " + z9 + ", ");
                                        sb2.append("isInitialSync = " + z12 + ", ");
                                        sb2.append("storageManagerFileName = " + g + ", ");
                                        sb2.append("envUserId = " + j2 + ", ");
                                        sb2.append("authBridgeUserId = " + j + ", ");
                                        sb2.append("isInitialTokenTheSame = " + equals + ", ");
                                        StringBuilder sb5 = new StringBuilder("isRequestTokenTheSame = ");
                                        sb5.append(f);
                                        sb2.append(sb5.toString());
                                        longPollInconsistentStateException = new LongPollInconsistentStateException(sb2.toString() + ' ' + th);
                                    } else {
                                        if (i != 2) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        v400.a aVar2 = a2 instanceof v400.a ? (v400.a) a2 : null;
                                        StringBuilder sb6 = new StringBuilder();
                                        StringBuilder sb7 = new StringBuilder("ts = ");
                                        sb7.append(aVar2 != null ? aVar2.a : -1L);
                                        sb7.append(", ");
                                        sb6.append(sb7.toString());
                                        sb6.append("shouldInitLpServer = " + z10 + ", ");
                                        sb6.append("shouldRequestLpHistory = " + z9 + ", ");
                                        StringBuilder sb8 = new StringBuilder("isInitialSync = ");
                                        sb8.append(z12);
                                        sb6.append(sb8.toString());
                                        longPollInconsistentStateException = new LongPollInconsistentChannelsStateException(sb6.toString() + ' ' + th);
                                    }
                                    com.vk.metrics.eventtracking.b.a.a(longPollInconsistentStateException);
                                    if (whcVar == null || (aVar = this.j) == null) {
                                        return;
                                    }
                                    aVar.a(whcVar);
                                    return;
                                }
                                io.reactivex.rxjava3.subjects.d<LongPollSyncManager$InitialSyncState> dVar3 = dVar;
                                longPollType = longPollType2;
                                if (z11) {
                                    laqVar2.c();
                                } else {
                                    laqVar2.b();
                                }
                                laqVar.c();
                                dVar = dVar3;
                                z9 = z5;
                                z8 = z10;
                                str = str2;
                                atomicBoolean2 = atomicBoolean;
                                laqVar3 = laqVar;
                                laqVar4 = laqVar2;
                                longPollType2 = longPollType;
                            }
                            booleanValue = ((Boolean) pair.d()).booleanValue();
                            whc whcVar2 = (whc) pair.g();
                            if (th instanceof ApiLongPollException) {
                            }
                            if (!booleanValue) {
                            }
                        } else {
                            z3 = z2;
                        }
                        z4 = true;
                        if (z3) {
                        }
                        booleanValue = ((Boolean) pair.d()).booleanValue();
                        whc whcVar22 = (whc) pair.g();
                        if (th instanceof ApiLongPollException) {
                        }
                        if (!booleanValue) {
                        }
                    }
                    z2 = true;
                    if (vKApiExecutionException.s() == 990) {
                    }
                    z4 = true;
                    if (z3) {
                    }
                    booleanValue = ((Boolean) pair.d()).booleanValue();
                    whc whcVar222 = (whc) pair.g();
                    if (th instanceof ApiLongPollException) {
                    }
                    if (!booleanValue) {
                    }
                } else if (th instanceof ImEngineDbUnrecoverableException) {
                    pair = new Pair(Boolean.TRUE, whc.b.c);
                    booleanValue = ((Boolean) pair.d()).booleanValue();
                    whc whcVar2222 = (whc) pair.g();
                    if (th instanceof ApiLongPollException) {
                    }
                    if (!booleanValue) {
                    }
                } else {
                    pair = new Pair(Boolean.FALSE, null);
                    booleanValue = ((Boolean) pair.d()).booleanValue();
                    whc whcVar22222 = (whc) pair.g();
                    if (th instanceof ApiLongPollException) {
                    }
                    if (!booleanValue) {
                    }
                }
            }
            if (isInterrupted() || atomicBoolean2.get()) {
                break;
            }
            n();
            if (laqVar3.d()) {
                p();
            }
            if (laqVar4.d()) {
                o();
            }
            if (z8) {
                b();
                z8 = false;
            }
            str = o25.a().h();
            if (z9) {
                a400 a400Var2 = this.x;
                f(a400Var2 != null ? a400Var2.a() : a2);
                z9 = false;
            }
            dVar.onNext(LongPollSyncManager$InitialSyncState.SYNCED);
            this.f.q();
            a400 a400Var3 = this.x;
            if (a400Var3 != null && a400Var3.b()) {
                throw new ApiLongPollException(5);
            }
            if (((Boolean) xisVar.invoke()).booleanValue()) {
                h();
            } else if (m()) {
                i();
            } else {
                g();
            }
            j();
            c("Stop LongPoll time=" + System.currentTimeMillis());
        }
    }

    public final void l(ImBgSyncState imBgSyncState) {
        this.d.getState().onNext(imBgSyncState);
    }

    public final boolean m() {
        return this.g.invoke().booleanValue() && this.y < 4;
    }

    public final void n() {
        if (this.d.getState().P0() != ImBgSyncState.CONNECTED) {
            l(ImBgSyncState.CONNECTING);
        }
    }

    public final void o() {
        l(ImBgSyncState.CONNECTING);
        this.i.debug(new ocg(this, 29));
        Thread.sleep(this.v.g);
    }

    public final void p() {
        l(ImBgSyncState.CONNECTING);
        synchronized (this.n) {
            this.i.debug(new p5y(this, 4));
            this.n.wait(this.w.g);
            this.i.debug(new xu0(20));
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch = this.l;
        io.reactivex.rxjava3.subjects.d<LongPollSyncManager$InitialSyncState> dVar = this.m;
        c7o0 c7o0Var = this.t;
        try {
            try {
                try {
                    k();
                } catch (SQLiteException e) {
                    com.vk.metrics.eventtracking.b.a.a(new LongPollSqliteException(e));
                    fxv.a aVar = this.j;
                    if (aVar != null) {
                        aVar.a(new whc.a(nlp.d(e), e));
                    }
                }
            } catch (InterruptedException e2) {
                d(e2);
            }
        } finally {
            c7o0Var.cancel();
            l(ImBgSyncState.DISCONNECTED);
            dVar.onNext(LongPollSyncManager$InitialSyncState.STOPPED);
            countDownLatch.countDown();
        }
    }
}
