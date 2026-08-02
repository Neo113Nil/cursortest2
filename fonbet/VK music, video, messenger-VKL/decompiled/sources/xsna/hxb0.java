package xsna;

import android.animation.AnimatorSet;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewConfiguration;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: PopupReactionSelector.kt */
/* loaded from: classes18.dex */
public final class hxb0 {
    public final m3r a;
    public final x7d b;
    public final z5f0 c;
    public final a6f0 d;
    public final long e = ViewConfiguration.getTapTimeout();
    public final Handler f = new Handler(Looper.getMainLooper());
    public boolean g = true;
    public a h;
    public boolean i;

    /* compiled from: PopupReactionSelector.kt */
    public final class a implements Runnable {
        public int b;

        public a(int i) {
            this.b = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            hxb0 hxb0Var = hxb0.this;
            hxb0Var.a.setSelectedPosition$design_release(this.b);
            hxb0Var.h = null;
            hxb0Var.c.n = false;
        }
    }

    public hxb0(m3r m3rVar, x7d x7dVar, z5f0 z5f0Var, a6f0 a6f0Var) {
        this.a = m3rVar;
        this.b = x7dVar;
        this.c = z5f0Var;
        this.d = a6f0Var;
    }

    public final void a() {
        a aVar = this.h;
        if (aVar != null) {
            this.f.removeCallbacks(aVar);
        }
        this.h = null;
    }

    public final void b() {
        a();
        this.a.setSelectedPosition$design_release(-1);
    }

    public final void c(int i) {
        m3r m3rVar = this.a;
        m3rVar.setSelectedPosition$design_release(i);
        f2f0 f2f0Var = (f2f0) j5g.b0(i, m3rVar.getReactions());
        z5f0 z5f0Var = this.c;
        if (f2f0Var == null) {
            z5f0Var.b();
            z5f0Var.o = true;
            return;
        }
        a6f0 a6f0Var = this.d;
        a6f0Var.b();
        p6f0 p6f0Var = a6f0Var.c;
        m6f0 m6f0Var = p6f0Var.f;
        m3r m3rVar2 = p6f0Var.a;
        k6f0 k6f0Var = p6f0Var.b;
        bwt0.p0(m3rVar2, true);
        p6f0Var.i = (i < 0 || i >= k6f0Var.getReactionViews().length) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : k6f0Var.getReactionViews()[i].getTranslationY();
        p6f0Var.j = m6f0Var.m + p6f0.r;
        p6f0Var.k = (i < 0 || i >= k6f0Var.getReactionViews().length) ? 1.0f : k6f0Var.getReactionViews()[i].getScale();
        m3rVar2.setSelectedReactionPosition(i);
        p6f0Var.h = i;
        for (f3r f3rVar : k6f0Var.getReactionViews()) {
            f3rVar.a();
        }
        m3rVar2.h(Integer.valueOf(m6f0Var.n));
        m3rVar2.setPopupVisibility$design_release(false);
        m3rVar2.setPopupHideInProgress$design_release(true);
        int length = k6f0Var.getReactionViews().length;
        int i2 = p6f0Var.h;
        if (i2 >= 0 && i2 < length) {
            m3rVar2.g(k6f0Var.getReactionViews()[p6f0Var.h], k6f0Var.getReactionContainerViews()[p6f0Var.h], true);
        }
        ((AnimatorSet) p6f0Var.q.getValue()).start();
        m3rVar2.postOnAnimationDelayed(p6f0Var.p, 283L);
        this.b.invoke(m3rVar.getContext(), f2f0Var);
        z5f0Var.a();
        z5f0Var.o = true;
        a();
    }

    public final void d(float f, float f2) {
        m3r m3rVar = this.a;
        int d = m3rVar.d(f, f2);
        a aVar = this.h;
        int selectedPosition$design_release = m3rVar.getSelectedPosition$design_release();
        if (aVar == null && selectedPosition$design_release < 0 && d >= 0) {
            if (this.i) {
                m3rVar.setSelectedPosition$design_release(d);
                this.i = false;
                return;
            } else {
                a aVar2 = new a(d);
                this.f.postDelayed(aVar2, this.e);
                this.h = aVar2;
                return;
            }
        }
        if (aVar == null && d >= 0) {
            m3rVar.setSelectedPosition$design_release(d);
            return;
        }
        if (aVar == null || d < 0) {
            if (d < 0) {
                b();
            }
        } else if (this.i) {
            a();
            m3rVar.setSelectedPosition$design_release(d);
            this.i = false;
        } else {
            a aVar3 = this.h;
            if (aVar3 != null) {
                aVar3.b = d;
            }
        }
    }
}
