package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.yandex.messaging.internal.authorized.sync.g;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.time.DurationUnit;
import org.msgpack.core.buffer.MessageBuffer;

/* loaded from: classes15.dex */
public final class je51 {
    public final c820 a;
    public final kwu b;
    public final Handler c = new Handler();
    public final pnt0 d = new pnt0((Object) null);
    public final ArrayList e = new ArrayList();
    public int f = 1;
    public xd51 g;
    public zj41 h;
    public boolean i;
    public final /* synthetic */ ke51 j;

    public je51(ke51 ke51Var, c820 c820Var, kwu kwuVar) {
        this.j = ke51Var;
        this.a = c820Var;
        this.b = kwuVar;
    }

    public static void d(zj41 zj41Var, int i, String str, yp6 yp6Var) {
        yp6 yp6Var2 = new yp6();
        yp6Var2.e0(1);
        xp6 xp6Var = new xp6(yp6Var2);
        av10 av10Var = cv10.b;
        int i2 = av10Var.c;
        py80 py80Var = new py80();
        py80Var.a = xp6Var;
        py80Var.b = MessageBuffer.a(i2);
        dv10 dv10Var = new dv10(py80Var, av10Var);
        try {
            dv10Var.o((byte) -109);
            dv10Var.o((byte) 0);
            if (i < -32) {
                if (i < -32768) {
                    dv10Var.w((byte) -46, i);
                } else if (i < -128) {
                    dv10Var.B((byte) -47, (short) i);
                } else {
                    dv10Var.v((byte) -48, (byte) i);
                }
            } else if (i < 128) {
                dv10Var.o((byte) i);
            } else if (i < 256) {
                dv10Var.v((byte) -52, (byte) i);
            } else if (i < 65536) {
                dv10Var.B((byte) -51, (short) i);
            } else {
                dv10Var.w((byte) -50, i);
            }
            dv10Var.k(str);
            dv10Var.close();
            yp6Var2.N1(yp6Var);
            ((ydi0) zj41Var).h(2, yp6Var2.W());
        } finally {
        }
    }

    public final boolean a() {
        z83.g(null, this.c.getLooper(), Looper.myLooper());
        c820 c820Var = this.a;
        z83.g(null, c820Var.w.getLooper(), Looper.myLooper());
        z83.c(null, c820Var.F);
        return c820Var.a.g();
    }

    public final void b(zj41 zj41Var) {
        z83.g(null, this.c.getLooper(), Looper.myLooper());
        z83.g(null, this.h, zj41Var);
        z83.c(null, this.i);
        if (ydz.a.a()) {
            ydz.a();
        }
        this.h = null;
        wd51 wd51Var = this.j.e;
        boolean a = a();
        kse.a(wd51Var.b);
        if (wd51Var.c.a()) {
            long a2 = f8z0.a(wd51Var.d);
            if (e3n.c(a2, wd51.e) <= 0 && a) {
                doc docVar = wd51Var.a;
                long o = e3n.o(a2, DurationUnit.SECONDS);
                docVar.getClass();
                docVar.a.a("unstable_connection", gw00.e(new Pair("connectionAliveTimeSeconds", Long.valueOf(o))));
            }
        }
        c820 c820Var = this.a;
        Handler handler = c820Var.w;
        z83.g(null, handler.getLooper(), Looper.myLooper());
        z83.c(null, c820Var.F);
        handler.removeCallbacksAndMessages(c820Var.c);
        n420 n420Var = c820Var.a;
        z83.g(null, n420Var.w.a, Looper.myLooper());
        g gVar = n420Var.a;
        gVar.P.reportEvent("tech_sync_socket_disconnected");
        z83.g(null, gVar.S, Looper.myLooper());
        gVar.a();
        pzt0 pzt0Var = (pzt0) gVar.R.x;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        r4e r4eVar = gVar.E;
        z83.g(null, r4eVar.a, Looper.myLooper());
        if (r4eVar.y != 0 && r4eVar.x != 0) {
            long j = r4eVar.z;
            r4eVar.b.getClass();
            r4eVar.z = (SystemClock.elapsedRealtime() - Math.max(r4eVar.x, r4eVar.y)) + j;
        }
        r4eVar.y = 0L;
        gVar.C.a = false;
        gVar.H.a = false;
        fzg fzgVar = gVar.I;
        op3 op3Var = fzgVar.e;
        kgx[] kgxVarArr = fzg.g;
        kgx kgxVar = kgxVarArr[0];
        op3Var.b(null);
        op3 op3Var2 = fzgVar.f;
        kgx kgxVar2 = kgxVarArr[1];
        op3Var2.b(null);
        py10 py10Var = gVar.J;
        py10Var.a.getLooper();
        Looper.myLooper();
        z83.i();
        oy10 oy10Var = py10Var.g;
        op3 op3Var3 = oy10Var.b;
        kgx[] kgxVarArr2 = oy10.e;
        kgx kgxVar3 = kgxVarArr2[0];
        op3Var3.b(null);
        oy10Var.c.removeCallbacksAndMessages(null);
        oy10 oy10Var2 = py10Var.h;
        op3 op3Var4 = oy10Var2.b;
        kgx kgxVar4 = kgxVarArr2[0];
        op3Var4.b(null);
        oy10Var2.c.removeCallbacksAndMessages(null);
        jh10 jh10Var = gVar.Q;
        kse.a(jh10Var.b);
        qp3 qp3Var = jh10Var.c;
        kgx kgxVar5 = jh10.d[0];
        qp3Var.b(null);
        gVar.y.b(null);
        c820Var.z = null;
    }

    public final void c(String str) {
        z83.g(null, this.c.getLooper(), Looper.myLooper());
        xd51 xd51Var = this.g;
        if (xd51Var != null) {
            je51 je51Var = xd51Var.a;
            Handler handler = xd51Var.w;
            z83.g(null, handler.getLooper(), Looper.myLooper());
            handler.removeCallbacksAndMessages(null);
            c18 c18Var = xd51Var.z;
            if (c18Var != null) {
                c18Var.cancel();
            }
            xd51Var.z = null;
            ydi0 ydi0Var = xd51Var.A;
            if (ydi0Var != null) {
                ydi0Var.a();
            }
            xd51Var.A = null;
            zj41 zj41Var = xd51Var.C;
            if (zj41Var != null) {
                ((ydi0) zj41Var).c(1000, str);
                xd51Var.C = null;
                je51Var.b(zj41Var);
            }
            g gVar = je51Var.a.a.a;
            gVar.P.reportEvent("tech_sync_connection_started");
            n5e n5eVar = gVar.A;
            n5eVar.A = true;
            n5eVar.e();
            xd51Var.h();
        }
    }

    public final void e() {
        z83.g(null, this.c.getLooper(), Looper.myLooper());
        if (this.g == null) {
            s421 s421Var = this.j.a;
            s421Var.getClass();
            this.g = new xd51(s421Var, this);
        }
        xd51 xd51Var = this.g;
        if (xd51Var != null) {
            z83.g(null, xd51Var.w.getLooper(), Looper.myLooper());
            if (xd51Var.C == null && xd51Var.A == null) {
                g gVar = xd51Var.a.a.a.a;
                gVar.P.reportEvent("tech_sync_connection_started");
                n5e n5eVar = gVar.A;
                n5eVar.A = true;
                n5eVar.e();
                xd51Var.h();
            }
        }
    }
}
