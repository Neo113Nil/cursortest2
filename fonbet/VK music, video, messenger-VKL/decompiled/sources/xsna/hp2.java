package xsna;

import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: AnimationHandler.java */
/* loaded from: classes12.dex */
public final class hp2 {
    public static final ThreadLocal<hp2> f = new ThreadLocal<>();
    public d d;
    public final dpj0<b, Long> a = new dpj0<>();
    public final ArrayList<b> b = new ArrayList<>();
    public final a c = new a();
    public boolean e = false;

    /* compiled from: AnimationHandler.java */
    public class a {
        public a() {
        }
    }

    /* compiled from: AnimationHandler.java */
    public interface b {
        boolean a(long j);
    }

    /* compiled from: AnimationHandler.java */
    public static abstract class c {
        public final a a;

        public c(a aVar) {
            this.a = aVar;
        }
    }

    /* compiled from: AnimationHandler.java */
    public static class d extends c {
        public final Choreographer b;
        public final a c;

        /* compiled from: AnimationHandler.java */
        public class a implements Choreographer.FrameCallback {
            public a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                hp2 hp2Var = hp2.this;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList<b> arrayList = hp2Var.b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                for (int i = 0; i < arrayList.size(); i++) {
                    b bVar = arrayList.get(i);
                    if (bVar != null) {
                        dpj0<b, Long> dpj0Var = hp2Var.a;
                        Long l = dpj0Var.get(bVar);
                        if (l != null) {
                            if (l.longValue() < uptimeMillis2) {
                                dpj0Var.remove(bVar);
                            }
                        }
                        bVar.a(uptimeMillis);
                    }
                }
                if (hp2Var.e) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (arrayList.get(size) == null) {
                            arrayList.remove(size);
                        }
                    }
                    hp2Var.e = false;
                }
                if (arrayList.size() > 0) {
                    if (hp2Var.d == null) {
                        hp2Var.d = new d(hp2Var.c);
                    }
                    d dVar = hp2Var.d;
                    dVar.b.postFrameCallback(dVar.c);
                }
            }
        }

        public d(a aVar) {
            super(aVar);
            this.b = Choreographer.getInstance();
            this.c = new a();
        }
    }
}
