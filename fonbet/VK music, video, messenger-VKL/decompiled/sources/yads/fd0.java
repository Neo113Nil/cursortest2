package yads;

import android.os.Handler;
import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes10.dex */
public final class fd0 implements uc0 {
    public final /* synthetic */ gd0 a;

    public fd0(gd0 gd0Var) {
        this.a = gd0Var;
    }

    public final void a(zc0 zc0Var, int i) {
        gd0 gd0Var;
        if (i == 1) {
            gd0 gd0Var2 = this.a;
            if (gd0Var2.p > 0 && gd0Var2.l != C.TIME_UNSET) {
                gd0Var2.o.add(zc0Var);
                Handler handler = this.a.u;
                handler.getClass();
                handler.postAtTime(new xsna.kv2(zc0Var, 21), zc0Var, SystemClock.uptimeMillis() + this.a.l);
                gd0Var = this.a;
                if (gd0Var.q == null && gd0Var.p == 0 && gd0Var.m.isEmpty() && gd0Var.n.isEmpty()) {
                    pn0 pn0Var = gd0Var.q;
                    pn0Var.getClass();
                    pn0Var.release();
                    gd0Var.q = null;
                    return;
                }
                return;
            }
        }
        if (i == 0) {
            this.a.m.remove(zc0Var);
            gd0 gd0Var3 = this.a;
            if (gd0Var3.r == zc0Var) {
                gd0Var3.r = null;
            }
            if (gd0Var3.s == zc0Var) {
                gd0Var3.s = null;
            }
            ed0 ed0Var = gd0Var3.i;
            ed0Var.a.remove(zc0Var);
            if (ed0Var.b == zc0Var) {
                ed0Var.b = null;
                if (!ed0Var.a.isEmpty()) {
                    zc0 zc0Var2 = (zc0) ed0Var.a.iterator().next();
                    ed0Var.b = zc0Var2;
                    on0 a = zc0Var2.b.a();
                    zc0Var2.x = a;
                    vc0 vc0Var = zc0Var2.r;
                    int i2 = mc3.a;
                    a.getClass();
                    vc0Var.getClass();
                    vc0Var.obtainMessage(0, new wc0(wg1.a.getAndIncrement(), true, SystemClock.elapsedRealtime(), a)).sendToTarget();
                }
            }
            gd0 gd0Var4 = this.a;
            if (gd0Var4.l != C.TIME_UNSET) {
                Handler handler2 = gd0Var4.u;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(zc0Var);
                this.a.o.remove(zc0Var);
            }
        }
        gd0Var = this.a;
        if (gd0Var.q == null) {
        }
    }
}
