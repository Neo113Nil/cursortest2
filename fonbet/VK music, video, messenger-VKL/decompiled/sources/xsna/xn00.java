package xsna;

import android.os.SystemClock;
import com.vk.im.engine.commands.messages.f;
import java.util.concurrent.TimeUnit;

/* compiled from: MarkMsgAsListenedPlugin.kt */
/* loaded from: classes.dex */
public final class xn00 extends o56 implements pr4 {
    public final gzs<a1w> a;
    public final long b = TimeUnit.SECONDS.toMillis(1);
    public long c = -1;
    public boolean d;

    public xn00(gzs<a1w> gzsVar) {
        this.a = gzsVar;
    }

    @Override // xsna.o56, xsna.kr4
    public final void a(ir4 ir4Var, bgk0 bgk0Var, ur4 ur4Var) {
        this.c = -1L;
        this.d = false;
    }

    @Override // xsna.o56, xsna.kr4
    public final void c(ir4 ir4Var, bgk0 bgk0Var, ur4 ur4Var) {
        this.c = -1L;
        this.d = false;
    }

    @Override // xsna.o56, xsna.kr4
    public final void e(ir4 ir4Var, bgk0 bgk0Var, ur4 ur4Var) {
        this.c = -1L;
        this.d = false;
    }

    @Override // xsna.o56, xsna.kr4
    public final void i(ir4 ir4Var, ur4 ur4Var) {
        if (!this.d) {
            this.a.invoke().D(this, f.a.a(ur4Var.a()));
        }
        this.c = -1L;
        this.d = false;
    }

    @Override // xsna.o56, xsna.kr4
    public final void m(ir4 ir4Var, ur4 ur4Var, Throwable th) {
        this.c = -1L;
        this.d = false;
    }

    @Override // xsna.o56, xsna.kr4
    public final void r(ir4 ir4Var, bgk0 bgk0Var, ur4 ur4Var, float f) {
        if (this.c < 0) {
            this.c = SystemClock.elapsedRealtime();
            this.d = false;
        }
        if (this.d || SystemClock.elapsedRealtime() - this.c < this.b) {
            return;
        }
        this.a.invoke().D(this, f.a.a(ur4Var.a()));
        this.d = true;
    }

    @Override // xsna.o56, xsna.kr4
    public final void s(ir4 ir4Var, bgk0 bgk0Var, ur4 ur4Var) {
        this.c = -1L;
        this.d = false;
    }

    @Override // xsna.pr4
    public final void u(ir4 ir4Var) {
        ir4Var.v(this);
    }
}
