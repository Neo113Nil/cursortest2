package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.squareup.moshi.Moshi;
import com.yandex.messaging.core.net.entities.proto.ClientTransportId;
import com.yandex.messaging.core.net.entities.proto.ClientTransportMessage;

/* loaded from: classes15.dex */
public final class ie51 implements x08, Runnable {
    public final int a;
    public final lg b;
    public final t1k0 c;
    public final Handler w = new Handler();
    public int x;
    public boolean y;
    public final /* synthetic */ je51 z;

    public ie51(je51 je51Var, int i, lg lgVar, t1k0 t1k0Var) {
        this.z = je51Var;
        this.a = i;
        this.b = lgVar;
        this.c = t1k0Var;
    }

    public final Object a(yp6 yp6Var) {
        lg lgVar = this.b;
        fn6 fn6Var = (fn6) lgVar.c;
        o5t0 o5t0Var = (o5t0) lgVar.b;
        o5t0Var.d();
        if (yp6Var.d2() != 4) {
            ((c370) fn6Var.i).b(7, "UNKNOWN_HEADER_VERSION", null);
            if (ydz.a.a()) {
                o5t0Var.k();
                ydz.a();
                return null;
            }
        } else {
            long X = yp6Var.X();
            byte[] v = yp6Var.W().v();
            if (drb1.e(v.length, v) == X) {
                Object decode = ((ouf0) fn6Var.j).a(o5t0Var.e()).decode(yp6Var);
                o5t0Var.a();
                return decode;
            }
            ((c370) fn6Var.i).b(7, "CHECKSUM_MISMATCH", null);
            if (ydz.a.a()) {
                o5t0Var.k();
                ydz.a();
            }
        }
        return null;
    }

    public final void b(zj41 zj41Var) {
        Handler handler = this.w;
        z83.g(null, handler.getLooper(), Looper.myLooper());
        z83.c(null, this.y);
        lg lgVar = this.b;
        o5t0 o5t0Var = (o5t0) lgVar.b;
        String k = o5t0Var.k();
        fn6 fn6Var = (fn6) lgVar.c;
        Object c = o5t0Var.c(((rz10) fn6Var.g).b, lgVar.a);
        lgVar.a++;
        c820 c820Var = (c820) lgVar.d;
        String str = c820Var.z;
        if (str != null) {
            ClientTransportMessage clientTransportMessage = c instanceof ClientTransportMessage ? (ClientTransportMessage) c : null;
            if (clientTransportMessage != null) {
                clientTransportMessage.setClientTransportId(new ClientTransportId(str));
            }
        }
        Object i = c820Var.i(c);
        if (ydz.a.a()) {
            o5t0Var.k();
            ((Moshi) fn6Var.k).adapter((Class) i.getClass()).indent("  ").toJson(i);
            ydz.a();
        }
        byte[] encode = ((ouf0) fn6Var.j).a(i.getClass()).encode(i);
        long e = drb1.e(encode.length, encode);
        yp6 yp6Var = new yp6();
        yp6Var.n0(j.c(4));
        yp6Var.q0(j.d(e));
        yp6Var.m968write(encode);
        this.z.getClass();
        je51.d(zj41Var, this.a, k, yp6Var);
        int i2 = this.x + 1;
        this.x = i2;
        if (i2 < 3) {
            handler.postDelayed(this, 10000L);
        }
    }

    public final void c() {
        this.y = true;
        this.w.removeCallbacksAndMessages(null);
        je51 je51Var = this.z;
        synchronized (je51Var.d) {
            pnt0 pnt0Var = je51Var.d;
            int c = cvw.c(pnt0Var.b, pnt0Var.w, this.a);
            if (c >= 0) {
                Object[] objArr = pnt0Var.c;
                Object obj = objArr[c];
                Object obj2 = kp50.b;
                if (obj != obj2) {
                    objArr[c] = obj2;
                    pnt0Var.a = true;
                }
            }
        }
    }

    @Override // defpackage.x08
    public final void cancel() {
        z83.g(null, this.w.getLooper(), Looper.myLooper());
        c();
    }

    @Override // java.lang.Runnable
    public final void run() {
        z83.g(null, this.w.getLooper(), Looper.myLooper());
        z83.c(null, this.y);
        zj41 zj41Var = this.z.h;
        if (zj41Var != null) {
            b(zj41Var);
        }
    }
}
