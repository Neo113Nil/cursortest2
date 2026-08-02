package xsna;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import xsna.h9e0;
import xsna.wpj;

/* compiled from: RaiseToEarDetector.kt */
/* loaded from: classes.dex */
public final class bwe0 {
    public final h9e0 a;
    public final wpj c;
    public boolean f;
    public final c b = new c();
    public final a d = new a();
    public final CopyOnWriteArrayList<b> e = new CopyOnWriteArrayList<>();

    /* compiled from: RaiseToEarDetector.kt */
    public final class a implements wpj.b {
        public a() {
        }

        @Override // xsna.wpj.b
        public final void a() {
            bwe0.a(bwe0.this);
        }
    }

    /* compiled from: RaiseToEarDetector.kt */
    /* loaded from: classes17.dex */
    public interface b {
        void a();
    }

    /* compiled from: RaiseToEarDetector.kt */
    public final class c implements h9e0.a {
        public c() {
        }

        @Override // xsna.h9e0.a
        public final void a() {
            bwe0.a(bwe0.this);
        }
    }

    public bwe0(Context context) {
        this.a = new h9e0(context);
        this.c = new wpj(context);
    }

    public static final void a(bwe0 bwe0Var) {
        synchronized (bwe0Var) {
            boolean z = bwe0Var.f;
            boolean z2 = bwe0Var.a.h;
            wpj wpjVar = bwe0Var.c;
            wpjVar.getClass();
            boolean z3 = false;
            boolean z4 = SystemClock.elapsedRealtime() - wpjVar.i <= 1000;
            if (z2 && z) {
                z4 = true;
            }
            if (z4 && z2) {
                z3 = true;
            }
            bwe0Var.f = z3;
            if (z != z3) {
                Iterator<b> it = bwe0Var.e.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
            }
        }
    }

    public final void b() {
        h9e0 h9e0Var = this.a;
        c cVar = this.b;
        synchronized (h9e0Var) {
            int size = h9e0Var.g.size();
            h9e0Var.g.add(cVar);
            int size2 = h9e0Var.g.size();
            if (size == 0 && size2 > 0 && ((Sensor) h9e0Var.d.getValue()) != null) {
                ((SensorManager) h9e0Var.c.getValue()).registerListener(h9e0Var.f, (Sensor) h9e0Var.d.getValue(), 3, h9e0Var.b);
            }
        }
        wpj wpjVar = this.c;
        a aVar = this.d;
        synchronized (wpjVar) {
            int size3 = wpjVar.f.size();
            wpjVar.f.add(aVar);
            int size4 = wpjVar.f.size();
            if (size3 == 0 && size4 > 0 && ((Sensor) wpjVar.d.getValue()) != null) {
                ((SensorManager) wpjVar.c.getValue()).registerListener(wpjVar.e, (Sensor) wpjVar.d.getValue(), 2, wpjVar.b);
            }
        }
    }

    public final void c() {
        h9e0 h9e0Var = this.a;
        c cVar = this.b;
        synchronized (h9e0Var) {
            int size = h9e0Var.g.size();
            h9e0Var.g.remove(cVar);
            int size2 = h9e0Var.g.size();
            if (size > 0 && size2 == 0 && ((Sensor) h9e0Var.d.getValue()) != null) {
                ((SensorManager) h9e0Var.c.getValue()).unregisterListener(h9e0Var.f);
                h9e0Var.h = false;
            }
        }
        wpj wpjVar = this.c;
        a aVar = this.d;
        synchronized (wpjVar) {
            int size3 = wpjVar.f.size();
            wpjVar.f.remove(aVar);
            int size4 = wpjVar.f.size();
            if (size3 > 0 && size4 == 0 && ((Sensor) wpjVar.d.getValue()) != null) {
                ((SensorManager) wpjVar.c.getValue()).unregisterListener(wpjVar.e);
                wpjVar.g = 0;
                wpjVar.h = false;
                wpjVar.i = 0L;
            }
        }
        this.f = false;
    }
}
