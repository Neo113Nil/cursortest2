package xsna;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.vk.im.engine.models.sync.ImBgSyncMode;
import com.vk.im.engine.models.sync.SyncStartCause;
import com.vk.im.engine.models.sync.SyncStopCause;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ImEngineSyncHelperImpl.kt */
/* loaded from: classes.dex */
public final class s2w implements r2w {
    public static final long n = TimeUnit.SECONDS.toMillis(50);
    public static final long o = TimeUnit.HOURS.toMillis(6);
    public static final /* synthetic */ int p = 0;
    public final Context a;
    public final jxv b;
    public final w0i0 c;
    public final h9w d;
    public final com.vk.im.engine.models.c e;
    public final xzv f;
    public final s2n0 g;
    public final Object h = new Object();
    public final Handler i = new Handler(Looper.getMainLooper());
    public final bpn0 j = new bpn0(new gat(this, 2));
    public final bpn0 k = new bpn0(new qy8(this, 4));
    public ImBgSyncMode l = ImBgSyncMode.FULL;
    public boolean m;

    /* compiled from: ImEngineSyncHelperImpl.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Boolean, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            s2w s2wVar = (s2w) this.receiver;
            int i = s2w.p;
            if (booleanValue) {
                s2wVar.b.e(s2wVar.l, "ImEngineSyncHelper: restore after invalidate (changeConfig)");
                s2wVar.m = true;
            } else {
                s2wVar.b.c("ImEngineSyncHelper: no credentials are provided");
                s2wVar.m = false;
            }
            return s3q0.a;
        }
    }

    public s2w(Context context, jxv jxvVar, w0i0 w0i0Var, h9w h9wVar, com.vk.im.engine.models.c cVar, xzv xzvVar, s2n0 s2n0Var) {
        this.a = context;
        this.b = jxvVar;
        this.c = w0i0Var;
        this.d = h9wVar;
        this.e = cVar;
        this.f = xzvVar;
        this.g = s2n0Var;
    }

    @Override // xsna.r2w
    public final synchronized void a() {
        SyncStartCause syncStartCause = SyncStartCause.DEFERRED_SYNC;
        SyncStopCause syncStopCause = SyncStopCause.DEFERRED_SYNC;
        synchronized (this) {
            if (!b()) {
                this.g.b();
                e(ImBgSyncMode.LITE, syncStartCause);
                this.e.getClass();
                h(8000L, syncStopCause);
            }
        }
        ((lsl) this.k.getValue()).a("DEFERRED_SYNC");
    }

    @Override // xsna.r2w
    public final synchronized boolean b() {
        return this.m;
    }

    @Override // xsna.r2w
    public final synchronized void c(Long l) {
        synchronized (this) {
            if (!b()) {
                this.d.a(l);
            }
        }
    }

    public final synchronized void d() {
        this.i.removeCallbacksAndMessages(this.h);
    }

    public final synchronized void e(ImBgSyncMode imBgSyncMode, SyncStartCause syncStartCause) {
        d();
        synchronized (this) {
            this.l = imBgSyncMode;
            f(syncStartCause);
        }
    }

    public final synchronized void f(SyncStartCause syncStartCause) {
        try {
            p1w p1wVar = (p1w) this.j.getValue();
            if (p1wVar.d == null) {
                p1wVar.d = myc0.h(p1wVar.c, null, null, new o1w(p1wVar, null), 3);
            }
            if (this.b.f()) {
                this.b.e(this.l, syncStartCause.getId());
                this.m = true;
            }
            this.c.b(this.l, syncStartCause);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void g(SyncStopCause syncStopCause) {
        d();
        synchronized (this) {
            i(syncStopCause);
        }
    }

    public final synchronized void h(long j, SyncStopCause syncStopCause) {
        try {
            d();
            if (j <= 0) {
                g(syncStopCause);
            } else {
                synchronized (this) {
                    d();
                    this.i.postAtTime(new wq8(2, this, syncStopCause), this.h, SystemClock.uptimeMillis() + j);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void i(SyncStopCause syncStopCause) {
        try {
            p1w p1wVar = (p1w) this.j.getValue();
            yok0 yok0Var = p1wVar.d;
            if (yok0Var != null) {
                yok0Var.b(null);
            }
            p1wVar.d = null;
            this.b.c(syncStopCause.getId());
            this.m = false;
            this.c.a(syncStopCause);
        } catch (IllegalStateException e) {
            Log.e("ImEngineSynchronizer", "failed to stop bg sync", e);
        }
    }

    @Override // xsna.r2w
    public final void init() {
        c63 c63Var = c63.a;
        c63.a(new t2w(this));
    }
}
