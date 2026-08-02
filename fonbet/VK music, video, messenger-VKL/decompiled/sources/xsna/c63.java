package xsna;

import android.app.Activity;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: AppLifecycleDispatcher.kt */
/* loaded from: classes.dex */
public final class c63 {
    public static int c;
    public static int d;
    public static int e;
    public static volatile boolean f;
    public static volatile boolean g;
    public static volatile boolean k;
    public static volatile boolean l;
    public static final c63 a = new c63();
    public static final bpn0 b = new bpn0(new b63(0));
    public static WeakReference<Activity> h = new WeakReference<>(null);
    public static final CopyOnWriteArrayList<b> i = new CopyOnWriteArrayList<>();
    public static final b0g j = b0g.a;

    /* compiled from: AppLifecycleDispatcher.kt */
    public static abstract class a extends b {
    }

    public static void a(b bVar) {
        CopyOnWriteArrayList<b> copyOnWriteArrayList = i;
        if (copyOnWriteArrayList.contains(bVar)) {
            return;
        }
        copyOnWriteArrayList.add(bVar);
        if (f && h.isEnqueued()) {
            bVar.x(h.get());
        }
        if (!f && l) {
            bVar.A();
        }
        if (g && h.isEnqueued()) {
            bVar.y(h.get());
        }
    }

    public static Activity b() {
        return h.get();
    }

    public static void c(b bVar) {
        i.remove(bVar);
    }

    /* compiled from: AppLifecycleDispatcher.kt */
    public static abstract class b {
        public void A() {
        }

        public void C() {
        }

        public void s() {
        }

        public void t() {
        }

        public void u() {
        }

        public void v() {
        }

        public void w() {
        }

        public void B(Configuration configuration) {
        }

        public void m(Activity activity) {
        }

        public void n(Activity activity) {
        }

        public void o(Activity activity) {
        }

        public void p(Activity activity) {
        }

        public void x(Activity activity) {
        }

        public void y(Activity activity) {
        }

        public void z(boolean z) {
        }

        public void q(Activity activity, boolean z) {
        }

        public void r(Activity activity, boolean z) {
        }
    }
}
