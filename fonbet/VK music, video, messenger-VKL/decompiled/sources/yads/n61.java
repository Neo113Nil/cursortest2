package yads;

import android.view.View;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;

/* loaded from: classes10.dex */
public final class n61 implements Runnable {
    public final m22 b;
    public final /* synthetic */ o61 c;

    public n61(o61 o61Var, m22 m22Var) {
        this.c = o61Var;
        this.b = m22Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s61 s61Var;
        View a = this.b.c.a();
        if (a instanceof FrameLayout) {
            rc1 rc1Var = this.c.d;
            FrameLayout frameLayout = (FrameLayout) a;
            xc3 a2 = ((l22) rc1Var.a).a(rc1Var.b, frameLayout.getContext(), false);
            p61 p61Var = this.c.a;
            p61Var.getClass();
            boolean z = a2 instanceof uc3;
            q61 q61Var = p61Var.a;
            WeakReference weakReference = (WeakReference) q61Var.d.get(frameLayout);
            mq mqVar = weakReference != null ? (mq) weakReference.get() : null;
            if (mqVar == null) {
                mqVar = new mq(frameLayout.getContext(), q61Var.c, new yl0());
                q61Var.d.put(frameLayout, new WeakReference(mqVar));
                frameLayout.addView(mqVar);
            }
            q61Var.b.getClass();
            mqVar.setColor(z ? -65536 : -16711936);
            if (z) {
                WeakReference weakReference2 = (WeakReference) q61Var.e.get(frameLayout);
                s61Var = weakReference2 != null ? (s61) weakReference2.get() : null;
                if (s61Var == null) {
                    s61Var = new s61(frameLayout.getContext(), new pg0());
                    q61Var.e.put(frameLayout, new WeakReference(s61Var));
                    frameLayout.addView(s61Var);
                }
                q61Var.a.getClass();
                s61Var.setDescription(xm3.a(a2));
            } else {
                WeakReference weakReference3 = (WeakReference) q61Var.e.get(frameLayout);
                s61Var = weakReference3 != null ? (s61) weakReference3.get() : null;
                if (s61Var != null) {
                    q61Var.e.remove(frameLayout);
                    frameLayout.removeView(s61Var);
                }
            }
            o61 o61Var = this.c;
            o61Var.b.postDelayed(new n61(o61Var, this.b), 300L);
        }
    }
}
