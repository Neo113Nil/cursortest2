package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.yandex.pulse.mvi.longtasks.a;
import io.appmetrica.analytics.impl.Uf;
import io.appmetrica.analytics.impl.Wf;
import java.util.concurrent.Executor;

/* loaded from: classes8.dex */
public final class ev20 {
    public final Uf a;
    public final lwa0 b;
    public lwa0 c;
    public lwa0 d;
    public final Handler e;
    public final Executor f;
    public final ioz g;
    public final boolean h;
    public final boolean i;
    public final thw0 j;
    public final thw0 k;
    public final thw0 l;
    public final thw0 m;
    public final thw0 n;
    public final thw0 o;
    public final k5g p;
    public final ms5 q;
    public final Wf r;
    public final qc20 s = new qc20(this);
    public final dcb1 t = new dcb1(this);

    public ev20(Wf wf, ph1 ph1Var, fv20 fv20Var) {
        this.r = wf;
        this.a = fv20Var.a;
        lwa0 lwa0Var = fv20Var.b;
        this.b = lwa0Var;
        this.c = lwa0Var;
        this.d = lwa0Var;
        this.j = fv20Var.e;
        this.k = fv20Var.f;
        this.l = fv20Var.g;
        this.m = fv20Var.h;
        this.n = fv20Var.i;
        this.o = fv20Var.j;
        long j = fv20Var.c;
        long j2 = fv20Var.d;
        long j3 = fv20Var.n;
        this.e = new Handler(Looper.getMainLooper());
        this.f = fv20Var.r;
        this.g = fv20Var.p ? new gsb(j) : new a(Looper.getMainLooper(), j);
        this.h = fv20Var.o;
        boolean z = fv20Var.q;
        this.i = z;
        String str = ph1Var.b;
        ph1Var.b = "warm";
        ms5 ms5Var = new ms5();
        ms5Var.b = str;
        this.q = ms5Var;
        this.p = new k5g(new zu20(this, 0), new dv20(this, j, j2, fv20Var), new zu20(this, 1), new zu20(this, 2), z ? new e89(5, this, fv20Var) : null, new com.yandex.pulse.mvi.a(this, fv20Var, j3));
    }

    public final void a(String str, long j, String str2, thw0 thw0Var) {
        String str3 = this.q.b;
        boolean z = this.i;
        obp0 obp0Var = new obp0(j, thw0Var, new bv20(this, str, j, str2, str3, z));
        if (z) {
            obp0Var.run();
        } else {
            this.f.execute(obp0Var);
        }
    }

    public final lwa0 b() {
        switch (this.q.b) {
            case "hot":
                return this.d;
            case "cold":
                return this.b;
            case "warm":
                return this.c;
            default:
                ny61.f("Not reached");
                return null;
        }
    }
}
