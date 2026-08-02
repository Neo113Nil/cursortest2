package xsna;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ViewPropertyAnimatorCompatSet.java */
/* loaded from: classes11.dex */
public final class c0u0 {
    public Interpolator c;
    public e0u0 d;
    public boolean e;
    public long b = -1;
    public final a f = new a();
    public final ArrayList<b0u0> a = new ArrayList<>();

    /* compiled from: ViewPropertyAnimatorCompatSet.java */
    public class a extends f0u0 {
        public boolean a = false;
        public int b = 0;

        public a() {
        }

        @Override // xsna.f0u0, xsna.e0u0
        public final void a() {
            if (this.a) {
                return;
            }
            this.a = true;
            e0u0 e0u0Var = c0u0.this.d;
            if (e0u0Var != null) {
                e0u0Var.a();
            }
        }

        @Override // xsna.e0u0
        public final void b() {
            int i = this.b + 1;
            this.b = i;
            c0u0 c0u0Var = c0u0.this;
            if (i == c0u0Var.a.size()) {
                e0u0 e0u0Var = c0u0Var.d;
                if (e0u0Var != null) {
                    e0u0Var.b();
                }
                this.b = 0;
                this.a = false;
                c0u0Var.e = false;
            }
        }
    }

    public final void a() {
        if (this.e) {
            Iterator<b0u0> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.e = false;
        }
    }

    public final void b() {
        View view;
        if (this.e) {
            return;
        }
        Iterator<b0u0> it = this.a.iterator();
        while (it.hasNext()) {
            b0u0 next = it.next();
            long j = this.b;
            if (j >= 0) {
                next.c(j);
            }
            Interpolator interpolator = this.c;
            if (interpolator != null && (view = next.a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.d != null) {
                next.d(this.f);
            }
            View view2 = next.a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.e = true;
    }
}
