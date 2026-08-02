package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TransitionManager.java */
/* loaded from: classes12.dex */
public final class zmp0 {
    public static final mk5 a = new mk5();
    public static final ThreadLocal<WeakReference<zk3<ViewGroup, ArrayList<vlp0>>>> b = new ThreadLocal<>();
    public static final ArrayList<ViewGroup> c = new ArrayList<>();

    public static void a(ViewGroup viewGroup, vlp0 vlp0Var) {
        ArrayList<ViewGroup> arrayList = c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (vlp0Var == null) {
            vlp0Var = a;
        }
        vlp0 clone = vlp0Var.clone();
        f(viewGroup, clone);
        viewGroup.setTag(R.id.transition_current_scene, null);
        e(viewGroup, clone);
    }

    public static void b(ViewGroup viewGroup) {
        c.remove(viewGroup);
        ArrayList<vlp0> arrayList = c().get(viewGroup);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            ((vlp0) arrayList2.get(size)).forceToEnd(viewGroup);
        }
    }

    public static zk3<ViewGroup, ArrayList<vlp0>> c() {
        zk3<ViewGroup, ArrayList<vlp0>> zk3Var;
        ThreadLocal<WeakReference<zk3<ViewGroup, ArrayList<vlp0>>>> threadLocal = b;
        WeakReference<zk3<ViewGroup, ArrayList<vlp0>>> weakReference = threadLocal.get();
        if (weakReference != null && (zk3Var = weakReference.get()) != null) {
            return zk3Var;
        }
        zk3<ViewGroup, ArrayList<vlp0>> zk3Var2 = new zk3<>();
        threadLocal.set(new WeakReference<>(zk3Var2));
        return zk3Var2;
    }

    public static void d(p5h0 p5h0Var, vlp0 vlp0Var) {
        ViewGroup viewGroup = p5h0Var.a;
        ArrayList<ViewGroup> arrayList = c;
        if (arrayList.contains(viewGroup)) {
            return;
        }
        arrayList.add(viewGroup);
        vlp0 clone = vlp0Var.clone();
        f(viewGroup, clone);
        ViewGroup viewGroup2 = p5h0Var.a;
        View view = p5h0Var.b;
        if (view != null) {
            viewGroup2.removeAllViews();
            viewGroup2.addView(view);
        }
        Runnable runnable = p5h0Var.c;
        if (runnable != null) {
            runnable.run();
        }
        viewGroup2.setTag(R.id.transition_current_scene, p5h0Var);
        e(viewGroup, clone);
    }

    public static void e(ViewGroup viewGroup, vlp0 vlp0Var) {
        if (vlp0Var == null || viewGroup == null) {
            return;
        }
        a aVar = new a();
        aVar.b = vlp0Var;
        aVar.c = viewGroup;
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    public static void f(ViewGroup viewGroup, vlp0 vlp0Var) {
        wc2 wc2Var;
        ArrayList<vlp0> arrayList = c().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<vlp0> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().pause(viewGroup);
            }
        }
        if (vlp0Var != null) {
            vlp0Var.captureValues(viewGroup, true);
        }
        p5h0 p5h0Var = (p5h0) viewGroup.getTag(R.id.transition_current_scene);
        if (p5h0Var == null || ((p5h0) p5h0Var.a.getTag(R.id.transition_current_scene)) != p5h0Var || (wc2Var = p5h0Var.d) == null) {
            return;
        }
        wc2Var.run();
    }

    /* compiled from: TransitionManager.java */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
        public vlp0 b;
        public ViewGroup c;

        /* compiled from: TransitionManager.java */
        /* renamed from: xsna.zmp0$a$a, reason: collision with other inner class name */
        public class C4184a extends ymp0 {
            public final /* synthetic */ zk3 b;

            public C4184a(zk3 zk3Var) {
                this.b = zk3Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // xsna.ymp0, xsna.vlp0.i
            public final void onTransitionEnd(vlp0 vlp0Var) {
                ((ArrayList) this.b.get(a.this.c)).remove(vlp0Var);
                vlp0Var.removeListener(this);
            }
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            vlp0 vlp0Var = this.b;
            ViewGroup viewGroup = this.c;
            viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
            viewGroup.removeOnAttachStateChangeListener(this);
            ArrayList<ViewGroup> arrayList = zmp0.c;
            ViewGroup viewGroup2 = this.c;
            if (!arrayList.remove(viewGroup2)) {
                return true;
            }
            zk3<ViewGroup, ArrayList<vlp0>> c = zmp0.c();
            ArrayList<vlp0> arrayList2 = c.get(viewGroup2);
            ArrayList arrayList3 = null;
            if (arrayList2 == null) {
                arrayList2 = new ArrayList<>();
                c.put(viewGroup2, arrayList2);
            } else if (arrayList2.size() > 0) {
                arrayList3 = new ArrayList(arrayList2);
            }
            arrayList2.add(vlp0Var);
            vlp0Var.addListener(new C4184a(c));
            vlp0Var.captureValues(viewGroup2, false);
            if (arrayList3 != null) {
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    ((vlp0) it.next()).resume(viewGroup2);
                }
            }
            vlp0Var.playTransition(viewGroup2);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            ViewGroup viewGroup = this.c;
            viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
            viewGroup.removeOnAttachStateChangeListener(this);
            ArrayList<ViewGroup> arrayList = zmp0.c;
            ViewGroup viewGroup2 = this.c;
            arrayList.remove(viewGroup2);
            ArrayList<vlp0> arrayList2 = zmp0.c().get(viewGroup2);
            if (arrayList2 != null && arrayList2.size() > 0) {
                Iterator<vlp0> it = arrayList2.iterator();
                while (it.hasNext()) {
                    it.next().resume(viewGroup2);
                }
            }
            this.b.clearValues(true);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }
}
