package yads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.c5g;
import xsna.j5g;

/* loaded from: classes10.dex */
public final class o83 extends Handler {
    public final da2 a;

    public o83(da2 da2Var, Looper looper) {
        super(looper);
        this.a = da2Var;
    }

    public final boolean a() {
        return hasMessages(2);
    }

    public final void b() {
        removeMessages(2);
        removeMessages(1);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        ux1 ux1Var;
        int i = message.what;
        if (i != 1) {
            if (i == 2 && (ux1Var = (ux1) ((WeakReference) message.obj).get()) != null) {
                List<g93> O0 = j5g.O0(ux1Var.m);
                O0.size();
                int i2 = Integer.MIN_VALUE;
                for (g93 g93Var : O0) {
                    if (g93Var.c > i2) {
                        xc3 b = ux1Var.b(g93Var);
                        if (b instanceof vc3) {
                            i2 = g93Var.c;
                            a(g93Var, ux1Var, (vc3) b);
                        } else if (b instanceof uc3) {
                            g93Var.e = null;
                            this.a.a(g93Var.d, (uc3) b);
                        }
                    } else {
                        a(g93Var, ux1Var, new vc3(EmptyList.b));
                    }
                }
                if (O0.isEmpty()) {
                    return;
                }
                sendMessageDelayed(Message.obtain(this, 2, new WeakReference(ux1Var)), 200L);
                return;
            }
            return;
        }
        n83 n83Var = (n83) message.obj;
        ux1 ux1Var2 = (ux1) n83Var.a.get();
        if (ux1Var2 != null) {
            g93 g93Var2 = n83Var.b;
            za.a(ux1Var2.f, g93Var2.a, o93.h);
            ux1Var2.m.remove(g93Var2);
            if (!ux1Var2.l && ux1Var2.m.isEmpty()) {
                ux1Var2.l = true;
                g61 g61Var = ux1Var2.j;
                if (g61Var != null) {
                    g61Var.g();
                }
            }
            da2 da2Var = this.a;
            uz2 uz2Var = n83Var.b.d;
            List O02 = j5g.O0(ux1Var2.m);
            ArrayList arrayList = new ArrayList(c5g.u(O02, 10));
            Iterator it = O02.iterator();
            while (it.hasNext()) {
                arrayList.add(((g93) it.next()).d);
            }
            da2Var.a(uz2Var, arrayList, n83Var.c);
        }
    }

    public final void a(g93 g93Var, ux1 ux1Var, vc3 vc3Var) {
        long elapsedRealtime;
        Long l = g93Var.e;
        if (l != null) {
            elapsedRealtime = l.longValue();
        } else {
            elapsedRealtime = SystemClock.elapsedRealtime();
            g93Var.e = Long.valueOf(elapsedRealtime);
        }
        if (SystemClock.elapsedRealtime() - elapsedRealtime >= g93Var.b) {
            sendMessage(Message.obtain(this, 1, new n83(new WeakReference(ux1Var), g93Var, vc3Var)));
        }
        if (!ux1Var.k) {
            ux1Var.k = true;
            g61 g61Var = ux1Var.j;
            if (g61Var != null) {
                g61Var.c();
            }
        }
        this.a.a(g93Var.d, vc3Var);
    }

    public final void a(ga2 ga2Var) {
        sendMessage(Message.obtain(this, 2, new WeakReference(ga2Var)));
    }
}
