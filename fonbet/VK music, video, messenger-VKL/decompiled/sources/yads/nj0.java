package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import xsna.epx;
import xsna.h5s;
import xsna.j630;
import xsna.qcy;

/* loaded from: classes10.dex */
public final class nj0 {
    public static final nq2 h = new nq2(1);
    public final kj0 a;
    public final CopyOnWriteArraySet b;
    public int c;
    public boolean d;
    public int e;
    public boolean f;
    public List g;

    public nj0(Context context, rc0 rc0Var, sc0 sc0Var) {
        context.getApplicationContext();
        this.d = true;
        this.g = Collections.EMPTY_LIST;
        this.b = new CopyOnWriteArraySet();
        kj0 kj0Var = new kj0(h5s.a("ExoPlayer:DownloadManager"), rc0Var, sc0Var, mc3.b(new Handler.Callback() { // from class: xsna.f7z0
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return yads.nj0.this.a(message);
            }
        }), this.d);
        this.a = kj0Var;
        int c = new rq2(context, new j630(this, 26)).c();
        this.e = c;
        this.c = 1;
        kj0Var.obtainMessage(0, c, 0).sendToTarget();
    }

    public final boolean a(Message message) {
        int i = message.what;
        if (i == 0) {
            this.g = Collections.unmodifiableList((List) message.obj);
            boolean a = a();
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((lj0) it.next()).getClass();
            }
            if (a) {
                Iterator it2 = this.b.iterator();
                while (it2.hasNext()) {
                    ((lj0) it2.next()).getClass();
                }
            }
        } else if (i == 1) {
            int i2 = message.arg1;
            int i3 = message.arg2;
            int i4 = this.c - i2;
            this.c = i4;
            if (i3 == 0 && i4 == 0) {
                Iterator it3 = this.b.iterator();
                while (it3.hasNext()) {
                    ((lj0) it3.next()).getClass();
                }
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException();
            }
            jj0 jj0Var = (jj0) message.obj;
            this.g = Collections.unmodifiableList(jj0Var.c);
            hj0 hj0Var = jj0Var.a;
            boolean a2 = a();
            if (jj0Var.b) {
                Iterator it4 = this.b.iterator();
                while (it4.hasNext()) {
                    ((lj0) it4.next()).getClass();
                }
            } else {
                Iterator it5 = this.b.iterator();
                while (it5.hasNext()) {
                    vo3 vo3Var = (vo3) ((lj0) it5.next());
                    vo3Var.getClass();
                    if (epx.f(hj0Var.a.b, vo3Var.a)) {
                        if (vo3.d.contains(Integer.valueOf(hj0Var.b))) {
                            mn2 mn2Var = vo3Var.b;
                            qcy qcyVar = vo3.c[0];
                            di3 di3Var = (di3) mn2Var.a.get();
                            if (di3Var != null) {
                                di3Var.a();
                            }
                        }
                        if (vo3.e.contains(Integer.valueOf(hj0Var.b))) {
                            mn2 mn2Var2 = vo3Var.b;
                            qcy qcyVar2 = vo3.c[0];
                            di3 di3Var2 = (di3) mn2Var2.a.get();
                            if (di3Var2 != null) {
                                di3Var2.c();
                            }
                        }
                        if (vo3.f.contains(Integer.valueOf(hj0Var.b))) {
                            this.b.remove(vo3Var);
                        }
                    }
                }
            }
            if (a2) {
                Iterator it6 = this.b.iterator();
                while (it6.hasNext()) {
                    ((lj0) it6.next()).getClass();
                }
            }
        }
        return true;
    }

    public final void a(rq2 rq2Var, int i) {
        nq2 nq2Var = rq2Var.c;
        if (this.e != i) {
            this.e = i;
            this.c++;
            this.a.obtainMessage(2, i, 0).sendToTarget();
        }
        boolean a = a();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((lj0) it.next()).getClass();
        }
        if (a) {
            Iterator it2 = this.b.iterator();
            while (it2.hasNext()) {
                ((lj0) it2.next()).getClass();
            }
        }
    }

    public final boolean a() {
        boolean z;
        if (!this.d && this.e != 0) {
            for (int i = 0; i < this.g.size(); i++) {
                if (((hj0) this.g.get(i)).b == 0) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        boolean z2 = this.f != z;
        this.f = z;
        return z2;
    }
}
