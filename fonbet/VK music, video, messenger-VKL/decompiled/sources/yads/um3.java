package yads;

import android.os.SystemClock;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class um3 implements ug3, wg3 {
    public final nf3 a;
    public final nh3 b;
    public final cl3 c;
    public final eg3 d;
    public final kl3 e;
    public Long f;
    public boolean g;

    public um3(nf3 nf3Var, nh3 nh3Var, dl3 dl3Var, eg3 eg3Var, kl3 kl3Var) {
        this.a = nf3Var;
        this.b = nh3Var;
        this.c = dl3Var;
        this.d = eg3Var;
        this.e = kl3Var;
    }

    @Override // yads.ug3
    public final void a(long j, long j2) {
        if (this.g) {
            return;
        }
        s3q0 s3q0Var = null;
        if (!this.e.a() || this.b.a() != lh3.e) {
            this.f = null;
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Long l = this.f;
        if (l != null) {
            if (elapsedRealtime - l.longValue() >= 2000) {
                this.g = true;
                this.d.i(this.a);
                this.c.n();
            }
            s3q0Var = s3q0.a;
        }
        if (s3q0Var == null) {
            this.f = Long.valueOf(elapsedRealtime);
            this.d.a(this.a);
        }
    }

    @Override // yads.wg3
    public final void b() {
        this.f = null;
    }

    public /* synthetic */ um3(nf3 nf3Var, il3 il3Var, nh3 nh3Var, dl3 dl3Var, eg3 eg3Var) {
        this(nf3Var, nh3Var, dl3Var, eg3Var, new kl3(il3Var));
    }

    @Override // yads.wg3
    public final void a() {
        this.f = null;
    }
}
