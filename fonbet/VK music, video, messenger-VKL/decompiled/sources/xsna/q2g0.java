package xsna;

import com.vk.dto.common.id.UserId;
import xsna.t2g0;

/* compiled from: RepliesViewAdapter.kt */
/* loaded from: classes18.dex */
public final class q2g0 implements h780 {
    public final /* synthetic */ m2g0 a;

    public q2g0(m2g0 m2g0Var) {
        this.a = m2g0Var;
    }

    @Override // xsna.h780
    public final void a(UserId userId) {
        this.a.a(new t2g0.d(userId));
    }

    @Override // xsna.h780
    public final void b(int i, long j) {
        this.a.a(z2g0.a);
    }

    @Override // xsna.h780
    public final void d(UserId userId, long j, int i) {
        this.a.a(new t2g0.c(null, Integer.valueOf(i), userId, new e210(j)));
    }

    @Override // xsna.h780
    public final void e() {
        this.a.a(t2g0.a.a);
    }

    @Override // xsna.h780
    public final void f(int i) {
        this.a.a(x2g0.a);
    }

    @Override // xsna.h780
    public final void g(int i, int i2) {
        this.a.a(new y2g0(i));
    }

    @Override // xsna.h780
    public final void c(f210 f210Var) {
    }
}
