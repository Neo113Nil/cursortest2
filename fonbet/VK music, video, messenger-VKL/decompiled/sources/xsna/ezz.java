package xsna;

import android.content.Context;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: LocationUpdateDaemon.kt */
/* loaded from: classes.dex */
public class ezz {
    public static final long k = TimeUnit.HOURS.toMillis(1);
    public static final long l;
    public static final long m;
    public static final int n;
    public final long a;
    public io.reactivex.rxjava3.disposables.c c;
    public gs2 d;
    public Context f;
    public long h;
    public final int j;
    public final AtomicInteger b = new AtomicInteger(0);
    public final Handler e = new Handler(Looper.getMainLooper());
    public final io.reactivex.rxjava3.subjects.f<Location> g = new io.reactivex.rxjava3.subjects.f<>();
    public List<Location> i = new ArrayList();

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        l = timeUnit.toMillis(1L);
        m = timeUnit.toMillis(10L);
        n = 100;
    }

    public ezz(long j, int i) {
        this.a = j;
        this.h = j;
        this.j = i;
    }

    public final void a(long j, long j2) {
        if (this.b.get() != 0 && j >= l && j2 >= 0) {
            if (j == k || j2 <= m) {
                gs2 gs2Var = this.d;
                Handler handler = this.e;
                if (gs2Var != null) {
                    handler.removeCallbacks(gs2Var);
                }
                this.h = j;
                io.reactivex.rxjava3.disposables.c cVar = this.c;
                if (cVar != null) {
                    cVar.dispose();
                }
                b();
                if (j2 > 0) {
                    gs2 gs2Var2 = new gs2(this, 11);
                    this.d = gs2Var2;
                    handler.postDelayed(gs2Var2, j2);
                }
            }
        }
    }

    public final void b() {
        Context context = this.f;
        if (context == null) {
            return;
        }
        cyz cyzVar = new cyz();
        cyzVar.a = "network";
        cyzVar.b = this.h;
        cyzVar.d = 9223372036854775806L;
        io.reactivex.rxjava3.internal.operators.observable.q qVar = new io.reactivex.rxjava3.internal.operators.observable.q(new yxz(context, cyzVar));
        long j = cyzVar.d;
        this.c = ((j <= 0 || j >= Long.MAX_VALUE) ? io.reactivex.rxjava3.core.q.H(new Exception("Unexpected numUpdates")) : qVar.t0(j)).r0(io.reactivex.rxjava3.schedulers.a.b()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new czz(new j67(this, 1), 0), new li6(new dzz(), 1));
    }
}
