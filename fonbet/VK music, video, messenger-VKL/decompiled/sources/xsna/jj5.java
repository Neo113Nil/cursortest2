package xsna;

import android.view.MotionEvent;
import android.widget.HorizontalScrollView;

/* compiled from: AutoScrollDelegate.kt */
/* loaded from: classes18.dex */
public final class jj5 {
    public final m3r a;
    public final HorizontalScrollView b;
    public a c;
    public boolean d;

    /* compiled from: AutoScrollDelegate.kt */
    public final class a implements Runnable {
        public final HorizontalScrollView b;
        public final int c;

        public a(HorizontalScrollView horizontalScrollView, int i) {
            this.b = horizontalScrollView;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            jj5 jj5Var = jj5.this;
            if (jj5Var.d) {
                jj5Var.a();
                return;
            }
            HorizontalScrollView horizontalScrollView = this.b;
            int i = this.c;
            if (!horizontalScrollView.canScrollHorizontally(i)) {
                jj5Var.a();
            } else {
                horizontalScrollView.smoothScrollBy(i, 0);
                jj5Var.b.postDelayed(this, 250L);
            }
        }
    }

    public jj5(m3r m3rVar, k6f0 k6f0Var) {
        this.a = m3rVar;
        this.b = k6f0Var;
    }

    public final void a() {
        this.d = true;
        a aVar = this.c;
        if (aVar != null) {
            this.b.removeCallbacks(aVar);
        }
        this.c = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0036, code lost:
    
        if (r8 <= (r0.getMeasuredWidth() + r3[0])) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(MotionEvent motionEvent) {
        a aVar;
        float rawX = motionEvent.getRawX();
        m3r m3rVar = this.a;
        int i = m3rVar.m;
        int i2 = m3rVar.h;
        if (m3rVar.M.getLocation()[0] > rawX || rawX > r5 + i2) {
            if ((r0.getMeasuredWidth() + r5) - i2 <= rawX) {
            }
            i = 0;
        } else {
            i = -i;
        }
        if (i == 0 || ((aVar = this.c) != null && aVar.c == i)) {
            if (i == 0) {
                a();
                return;
            }
            return;
        }
        a();
        HorizontalScrollView horizontalScrollView = this.b;
        if (!horizontalScrollView.canScrollHorizontally(i)) {
            this.d = true;
            return;
        }
        this.d = false;
        a aVar2 = new a(horizontalScrollView, i);
        horizontalScrollView.post(aVar2);
        this.c = aVar2;
    }
}
