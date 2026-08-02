package defpackage;

import android.os.Handler;
import android.os.Looper;
import kotlin.Pair;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes15.dex */
public final class bw41 {
    public static final /* synthetic */ kgx[] g;
    public static final long h;
    public final sw50 a;
    public final ew2 b;
    public final zdb c;
    public final Handler d = new Handler(Looper.getMainLooper());
    public final Handler e = new Handler(Looper.getMainLooper());
    public final pp3 f = new pp3();

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl("networkSubscription", 0, "getNetworkSubscription()Ljava/io/Closeable;", bw41.class);
        qoi0.a.getClass();
        g = new kgx[]{mutablePropertyReference1Impl};
        h = 10000L;
    }

    public bw41(sw50 sw50Var, ew2 ew2Var, zdb zdbVar) {
        this.a = sw50Var;
        this.b = ew2Var;
        this.c = zdbVar;
    }

    public final void a() {
        pw50 pw50Var;
        b();
        sw50 sw50Var = this.a;
        boolean a = sw50Var.a();
        this.b.c("wm_messenger_retry_loading", gw00.e(new Pair("netAvailable", String.valueOf(a))));
        if (a) {
            this.c.invoke();
            return;
        }
        c();
        ec31 ec31Var = new ec31(22, this);
        Handler handler = sw50Var.x;
        if (jl40.f && !jl40.l(handler.getLooper(), Looper.myLooper())) {
            dy31.h(handler.getLooper().getThread());
            return;
        }
        if (sw50Var.a()) {
            ec31Var.invoke();
            pw50Var = null;
        } else {
            rw50 rw50Var = new rw50(sw50Var, ec31Var);
            if (jl40.f && !jl40.l(handler.getLooper(), Looper.myLooper())) {
                dy31.h(handler.getLooper().getThread());
                return;
            } else {
                sw50Var.b.add(rw50Var);
                pw50Var = new pw50(0, sw50Var, rw50Var);
            }
        }
        this.f.setValue(this, g[0], pw50Var);
    }

    public final void b() {
        this.f.setValue(this, g[0], null);
        this.e.removeCallbacksAndMessages(null);
        this.d.removeCallbacksAndMessages(null);
    }

    public final void c() {
        this.e.postDelayed(new zv41(this, 1), h);
    }
}
