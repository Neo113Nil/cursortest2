package yads;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes10.dex */
public final class jx2 implements e93 {
    public final ga2 a;
    public final jo2 b;
    public final o61 c;
    public final xd2 d;

    public jx2(ux1 ux1Var, jo2 jo2Var, o61 o61Var, xd2 xd2Var) {
        this.a = ux1Var;
        this.b = jo2Var;
        this.c = o61Var;
        this.d = xd2Var;
    }

    @Override // yads.e93
    public final void a(m22 m22Var) {
        o61 o61Var = this.c;
        o61Var.b.removeCallbacksAndMessages(null);
        View a = m22Var.c.a();
        if (a instanceof FrameLayout) {
            FrameLayout frameLayout = (FrameLayout) a;
            q61 q61Var = o61Var.a.a;
            WeakReference weakReference = (WeakReference) q61Var.d.get(frameLayout);
            mq mqVar = weakReference != null ? (mq) weakReference.get() : null;
            if (mqVar != null) {
                q61Var.d.remove(frameLayout);
                frameLayout.removeView(mqVar);
            }
            WeakReference weakReference2 = (WeakReference) q61Var.e.get(frameLayout);
            s61 s61Var = weakReference2 != null ? (s61) weakReference2.get() : null;
            if (s61Var != null) {
                q61Var.e.remove(frameLayout);
                frameLayout.removeView(s61Var);
            }
        }
    }

    @Override // yads.e93
    public final void a(g61 g61Var) {
        ((ux1) this.a).j = g61Var;
    }

    @Override // yads.e93
    public final void a(n52 n52Var) {
        this.b.d.c.g = n52Var;
    }

    @Override // yads.e93
    public final void a(Context context, n42 n42Var, m22 m22Var) {
        boolean z;
        jo2 jo2Var = this.b;
        if (!jo2Var.f) {
            jo2Var.f = true;
            go2 go2Var = jo2Var.e;
            go2Var.c.post(new fo2(go2Var, go2Var.a));
        }
        ((ux1) this.a).a();
        this.d.a(n42Var);
        if (m22Var != null) {
            o61 o61Var = this.c;
            o61Var.c.getClass();
            hx2 a = gx2.a();
            qu2 a2 = a.a(context);
            Boolean bool = a2 != null ? a2.Q : null;
            synchronized (hx2.j) {
                z = a.d;
            }
            boolean c = a.c();
            if (bool != null) {
                if (!bool.booleanValue()) {
                    return;
                }
            } else if ((!z || !ub.a(context)) && !c) {
                return;
            }
            o61Var.b.post(new n61(o61Var, m22Var));
        }
    }

    @Override // yads.e93
    public final void a(n42 n42Var) {
        jo2 jo2Var = this.b;
        jo2Var.f = false;
        jo2Var.e.c.removeCallbacksAndMessages(null);
        ((ux1) this.a).b();
        this.d.b(n42Var);
        this.c.b.removeCallbacksAndMessages(null);
    }

    @Override // yads.e93
    public final void a(v9 v9Var, List list) {
        ((ux1) this.a).a(v9Var, list);
    }
}
