package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.zzao;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.internal.cast.zzfk;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import xsna.dz9;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
@SuppressLint({"UseSparseArrays"})
/* loaded from: classes12.dex */
public final class a401 extends com.google.android.gms.common.api.b implements ho01 {
    public static final o100 w = new o100("CastClient", null);
    public static final com.google.android.gms.common.api.a x = new com.google.android.gms.common.api.a("Cast.API_CXLESS", new fzz0(), qxz0.b);
    public final y301 a;
    public zzfk b;
    public boolean c;
    public boolean d;

    @Nullable
    public TaskCompletionSource e;

    @Nullable
    public TaskCompletionSource f;
    public final AtomicLong g;
    public final Object h;
    public final Object i;

    @Nullable
    public ApplicationMetadata j;

    @Nullable
    public String k;
    public double l;
    public boolean m;
    public int n;
    public int o;

    @Nullable
    public zzao p;
    public final CastDevice q;
    public final HashMap r;
    public final HashMap s;
    public final vr01 t;
    public final List u;
    public int v;

    public a401(Context context, dz9.b bVar) {
        super(context, (com.google.android.gms.common.api.a<dz9.b>) x, bVar, b.a.c);
        this.a = new y301(this);
        this.h = new Object();
        this.i = new Object();
        this.u = dez0.b();
        exc0.j(context, "context cannot be null");
        this.t = bVar.c;
        this.q = bVar.b;
        this.r = new HashMap();
        this.s = new HashMap();
        this.g = new AtomicLong(0L);
        this.v = 1;
        g();
    }

    public final void a(int i) {
        synchronized (this.i) {
            try {
                TaskCompletionSource taskCompletionSource = this.f;
                if (taskCompletionSource == null) {
                    return;
                }
                if (i == 0) {
                    taskCompletionSource.setResult(new Status(0));
                } else {
                    taskCompletionSource.setException(ey2.g(new Status(i)));
                }
                this.f = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(int i, long j) {
        TaskCompletionSource taskCompletionSource;
        HashMap hashMap = this.r;
        synchronized (hashMap) {
            Long valueOf = Long.valueOf(j);
            taskCompletionSource = (TaskCompletionSource) hashMap.get(valueOf);
            hashMap.remove(valueOf);
        }
        if (taskCompletionSource != null) {
            if (i == 0) {
                taskCompletionSource.setResult(null);
            } else {
                taskCompletionSource.setException(ey2.g(new Status(i)));
            }
        }
    }

    public final /* synthetic */ Handler c() {
        if (this.b == null) {
            this.b = new zzfk(getLooper());
        }
        return this.b;
    }

    public final void d() {
        w.a("removing all MessageReceivedCallbacks", new Object[0]);
        HashMap hashMap = this.s;
        synchronized (hashMap) {
            hashMap.clear();
        }
    }

    public final boolean e() {
        return this.v == 3;
    }

    public final void f(int i) {
        synchronized (this.h) {
            try {
                TaskCompletionSource taskCompletionSource = this.e;
                if (taskCompletionSource != null) {
                    taskCompletionSource.setException(ey2.g(new Status(i)));
                }
                this.e = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        CastDevice castDevice = this.q;
        in01 in01Var = castDevice.j;
        if (in01Var.a(2048) || !in01Var.a(4) || in01Var.a(1)) {
            return;
        }
        "Chromecast Audio".equals(castDevice.f);
    }
}
