package yads;

import android.os.Handler;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import xsna.c5h;
import xsna.lhi0;
import xsna.rky;
import xsna.usx;

/* loaded from: classes10.dex */
public final class co1 {
    public final int a;
    public final zn1 b;
    public final CopyOnWriteArrayList c;
    public final long d;

    public co1() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }

    public final void a(Handler handler, do1 do1Var) {
        do1Var.getClass();
        this.c.add(new bo1(handler, do1Var));
    }

    public final /* synthetic */ void b(do1 do1Var, wg1 wg1Var, in1 in1Var) {
        do1Var.a(this.a, this.b, wg1Var, in1Var);
    }

    public final /* synthetic */ void c(do1 do1Var, wg1 wg1Var, in1 in1Var) {
        do1Var.b(this.a, this.b, wg1Var, in1Var);
    }

    public co1(CopyOnWriteArrayList copyOnWriteArrayList, int i, zn1 zn1Var, long j) {
        this.c = copyOnWriteArrayList;
        this.a = i;
        this.b = zn1Var;
        this.d = j;
    }

    public final void b(final wg1 wg1Var, final in1 in1Var) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            bo1 bo1Var = (bo1) it.next();
            final do1 do1Var = bo1Var.b;
            mc3.a(bo1Var.a, new Runnable() { // from class: xsna.umy0
                @Override // java.lang.Runnable
                public final void run() {
                    yads.co1.this.b(do1Var, wg1Var, in1Var);
                }
            });
        }
    }

    public final void c(wg1 wg1Var, in1 in1Var) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            bo1 bo1Var = (bo1) it.next();
            mc3.a(bo1Var.a, (Runnable) new lhi0(this, bo1Var.b, wg1Var, in1Var, 2));
        }
    }

    public final long a(long j) {
        long b = mc3.b(j);
        return b == C.TIME_UNSET ? C.TIME_UNSET : this.d + b;
    }

    public final void a(in1 in1Var) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            bo1 bo1Var = (bo1) it.next();
            mc3.a(bo1Var.a, (Runnable) new c5h(this, bo1Var.b, in1Var, 2));
        }
    }

    public final void b(in1 in1Var) {
        zn1 zn1Var = this.b;
        zn1Var.getClass();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            bo1 bo1Var = (bo1) it.next();
            mc3.a(bo1Var.a, (Runnable) new rky(this, bo1Var.b, zn1Var, in1Var, 1));
        }
    }

    public final /* synthetic */ void a(do1 do1Var, in1 in1Var) {
        do1Var.b(this.a, this.b, in1Var);
    }

    public final /* synthetic */ void a(do1 do1Var, wg1 wg1Var, in1 in1Var) {
        do1Var.c(this.a, this.b, wg1Var, in1Var);
    }

    public final /* synthetic */ void a(do1 do1Var, wg1 wg1Var, in1 in1Var, IOException iOException, boolean z) {
        do1Var.a(this.a, this.b, wg1Var, in1Var, iOException, z);
    }

    public final /* synthetic */ void a(do1 do1Var, zn1 zn1Var, in1 in1Var) {
        do1Var.a(this.a, zn1Var, in1Var);
    }

    public final void a(wg1 wg1Var, in1 in1Var) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            bo1 bo1Var = (bo1) it.next();
            mc3.a(bo1Var.a, (Runnable) new usx(this, bo1Var.b, wg1Var, in1Var, 2));
        }
    }

    public final void a(final wg1 wg1Var, final in1 in1Var, final IOException iOException, final boolean z) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            bo1 bo1Var = (bo1) it.next();
            final do1 do1Var = bo1Var.b;
            mc3.a(bo1Var.a, new Runnable() { // from class: xsna.tmy0
                @Override // java.lang.Runnable
                public final void run() {
                    yads.co1.this.a(do1Var, wg1Var, in1Var, iOException, z);
                }
            });
        }
    }
}
