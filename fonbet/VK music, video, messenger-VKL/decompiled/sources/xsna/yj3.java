package xsna;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import java.util.LinkedHashSet;
import xsna.jsx0;

/* compiled from: AreaTouchListener.kt */
/* loaded from: classes6.dex */
public abstract class yj3<P extends jsx0> implements RecyclerView.s {
    public final RecyclerView b;
    public final Handler c;
    public final Rect d;
    public final int[] e;
    public final int f;
    public final long g;
    public final long h;
    public final sb i;
    public final j0 j;
    public final LinkedHashSet k;
    public boolean l;
    public boolean m;
    public Integer n;
    public Integer o;
    public boolean p;
    public boolean q;
    public P r;
    public RecyclerView.e0 s;
    public MotionEvent t;
    public int u;

    /* compiled from: AreaTouchListener.kt */
    public static final class a extends RecyclerView.t {
        public final /* synthetic */ yj3<P> b;

        public a(yj3<P> yj3Var) {
            this.b = yj3Var;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            this.b.u = i2;
        }
    }

    public yj3(RecyclerView recyclerView, Handler handler) {
        this.b = recyclerView;
        this.c = handler;
        this.d = new Rect();
        this.e = new int[]{0, 0};
        this.f = ViewConfiguration.get(recyclerView.getContext()).getScaledTouchSlop();
        this.g = ViewConfiguration.getLongPressTimeout();
        this.h = ViewConfiguration.getTapTimeout();
        int i = 2;
        this.i = new sb(this, i);
        this.j = new j0(this, i);
        this.k = new LinkedHashSet();
        this.l = true;
        this.m = true;
        recyclerView.addOnScrollListener(new a(this));
    }

    public int a(RecyclerView.e0 e0Var) {
        return e0Var.getAdapterPosition();
    }

    public final void b() {
        View view;
        this.q = false;
        this.n = null;
        this.o = null;
        this.b.getParent().requestDisallowInterceptTouchEvent(false);
        MotionEvent motionEvent = this.t;
        if (motionEvent != null) {
            motionEvent.recycle();
        }
        this.t = null;
        RecyclerView.e0 e0Var = this.s;
        if (e0Var != null && (view = e0Var.itemView) != null) {
            view.setPressed(false);
            view.setLongClickable(true);
        }
        this.s = null;
        this.c.removeCallbacks(this.i);
    }

    public final void c() {
        View view;
        this.c.removeCallbacks(this.j);
        RecyclerView.e0 e0Var = this.s;
        if (e0Var == null || (view = e0Var.itemView) == null) {
            return;
        }
        view.setPressed(false);
    }

    public boolean d(boolean z) {
        LinkedHashSet linkedHashSet = this.k;
        if (linkedHashSet.isEmpty()) {
            return false;
        }
        if (z) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                Object findViewHolderForAdapterPosition = this.b.findViewHolderForAdapterPosition(intValue);
                otx0 otx0Var = null;
                otx0 otx0Var2 = findViewHolderForAdapterPosition instanceof otx0 ? (otx0) findViewHolderForAdapterPosition : null;
                if (otx0Var2 != null) {
                    otx0Var = otx0Var2;
                }
                v(intValue, otx0Var);
            }
        }
        linkedHashSet.clear();
        return true;
    }

    public final float e(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = this.t;
        if ((motionEvent2 != null ? motionEvent2.getRawX() : Float.MAX_VALUE) != Float.MAX_VALUE) {
            MotionEvent motionEvent3 = this.t;
            if ((motionEvent3 != null ? motionEvent3.getRawY() : Float.MAX_VALUE) != Float.MAX_VALUE) {
                MotionEvent motionEvent4 = this.t;
                float rawX = (motionEvent4 != null ? motionEvent4.getRawX() : Float.MAX_VALUE) - motionEvent.getRawX();
                MotionEvent motionEvent5 = this.t;
                float rawY = (motionEvent5 != null ? motionEvent5.getRawY() : Float.MAX_VALUE) - motionEvent.getRawY();
                return (float) Math.sqrt((rawY * rawY) + (rawX * rawX));
            }
        }
        return Float.MAX_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final void f(RecyclerView recyclerView, MotionEvent motionEvent) {
        float rawY;
        int intValue;
        int min;
        int i;
        Integer num;
        P p;
        View findChildViewUnder = recyclerView.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
        RecyclerView.e0 childViewHolder = findChildViewUnder != null ? recyclerView.getChildViewHolder(findChildViewUnder) : null;
        Integer valueOf = childViewHolder != null ? Integer.valueOf(a(childViewHolder)) : null;
        boolean o = mnh0.o(motionEvent);
        LinkedHashSet linkedHashSet = this.k;
        if (!o) {
            if (mnh0.r(motionEvent)) {
                l(motionEvent);
                b();
                if (this.r != null) {
                    p();
                    this.r = null;
                }
                if (this.l) {
                    this.l = false;
                    r(linkedHashSet.size());
                    return;
                }
                return;
            }
            return;
        }
        if (e(motionEvent) > this.f && !this.q) {
            b();
            return;
        }
        MotionEvent motionEvent2 = this.t;
        if ((motionEvent2 != null ? motionEvent2.getRawY() : Float.MAX_VALUE) == Float.MAX_VALUE) {
            rawY = Float.MAX_VALUE;
        } else {
            MotionEvent motionEvent3 = this.t;
            rawY = (motionEvent3 != null ? motionEvent3.getRawY() : Float.MAX_VALUE) - motionEvent.getRawY();
        }
        if (rawY > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (p = this.r) != null) {
            MotionEvent motionEvent4 = this.t;
            if ((motionEvent4 != null ? motionEvent4.getRawY() : Float.MAX_VALUE) != Float.MAX_VALUE) {
                MotionEvent motionEvent5 = this.t;
                r5 = (motionEvent5 != null ? motionEvent5.getRawY() : Float.MAX_VALUE) - motionEvent.getRawY();
            }
            if (w(p, r5)) {
                this.r = null;
                b();
                return;
            }
            return;
        }
        RecyclerView recyclerView2 = this.b;
        if (valueOf == null || !(childViewHolder instanceof otx0) || epx.f(this.o, valueOf) || this.o == null || this.n == null) {
            if (this.r != null) {
                u(motionEvent);
                return;
            }
            int rawY2 = (int) motionEvent.getRawY();
            Rect rect = this.d;
            recyclerView2.getGlobalVisibleRect(rect);
            if (g() + rawY2 > rect.bottom) {
                x(0, (g() + rawY2) - rect.bottom);
                return;
            } else {
                if (rawY2 - g() < rect.top) {
                    x(0, (rawY2 - g()) - rect.top);
                    return;
                }
                return;
            }
        }
        this.l = true;
        a(childViewHolder);
        if (k(linkedHashSet.size()) && !linkedHashSet.contains(valueOf)) {
            int intValue2 = this.n.intValue();
            int min2 = Math.min(intValue2, a(childViewHolder));
            int i2 = new k9x(min2, Math.max(intValue2, a(childViewHolder)), 1).c;
            if (min2 <= i2) {
                while (true) {
                    Object findViewHolderForAdapterPosition = recyclerView2.findViewHolderForAdapterPosition(min2);
                    if (!linkedHashSet.contains(Integer.valueOf(min2)) && k(linkedHashSet.size())) {
                        linkedHashSet.add(Integer.valueOf(min2));
                        s(min2, findViewHolderForAdapterPosition instanceof jsx0 ? (jsx0) findViewHolderForAdapterPosition : null);
                    }
                    if (min2 == i2) {
                        break;
                    } else {
                        min2++;
                    }
                }
            }
        } else if (linkedHashSet.contains(valueOf) && (min = Math.min(a(childViewHolder), (intValue = this.o.intValue()))) <= (i = new k9x(min, Math.max(a(childViewHolder), intValue), 1).c)) {
            while (true) {
                Object findViewHolderForAdapterPosition2 = recyclerView2.findViewHolderForAdapterPosition(min);
                if ((findViewHolderForAdapterPosition2 instanceof otx0) && linkedHashSet.contains(Integer.valueOf(min)) && ((num = this.n) == null || min != num.intValue())) {
                    linkedHashSet.remove(Integer.valueOf(min));
                    v(min, (jsx0) findViewHolderForAdapterPosition2);
                }
                if (min == i) {
                    break;
                } else {
                    min++;
                }
            }
        }
        this.o = valueOf;
    }

    public final int g() {
        return (int) Math.floor(this.b.getContext().getResources().getDisplayMetrics().density * 20);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final void h(boolean z) {
        this.p = z;
        this.c.removeCallbacks(this.i);
        b();
    }

    public final boolean i() {
        RecyclerView recyclerView = this.b;
        if (recyclerView.getScrollState() == 0) {
            return false;
        }
        int i = this.u;
        if (i >= 0) {
            if (i > 0) {
                return recyclerView.canScrollVertically(1);
            }
            return true;
        }
        if (recyclerView.canScrollVertically(-1)) {
            RecyclerView.o layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if ((linearLayoutManager != null ? linearLayoutManager.s() : -1) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final boolean j(RecyclerView recyclerView, MotionEvent motionEvent) {
        View findChildViewUnder = recyclerView.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
        RecyclerView.e0 childViewHolder = findChildViewUnder != null ? recyclerView.getChildViewHolder(findChildViewUnder) : null;
        if (childViewHolder == null || !(childViewHolder instanceof jsx0) || this.p) {
            if (this.r != null) {
                p();
                this.r = null;
            }
            c();
            b();
            return false;
        }
        boolean m = mnh0.m(motionEvent);
        Handler handler = this.c;
        if (!m) {
            boolean r = mnh0.r(motionEvent);
            int i = this.f;
            if (r) {
                if (!mnh0.q(motionEvent) || this.q || e(motionEvent) >= i || i()) {
                    c();
                    b();
                } else {
                    this.p = true;
                    handler.post(new g0(this, 3));
                    handler.postDelayed(new xj3(childViewHolder, this, motionEvent, 0), 16L);
                }
                if (this.r != null) {
                    p();
                    this.r = null;
                    return false;
                }
            } else if (mnh0.o(motionEvent) && e(motionEvent) > i) {
                if (this.q) {
                    return true;
                }
                c();
                b();
            }
        } else if (!i()) {
            if (this.r != null) {
                p();
                this.r = null;
            }
            b();
            this.s = childViewHolder;
            this.t = MotionEvent.obtain(motionEvent);
            handler.postAtTime(this.i, motionEvent.getDownTime() + this.g);
            handler.postAtTime(this.j, motionEvent.getDownTime() + this.h);
            return false;
        }
        return false;
    }

    public boolean k(int i) {
        return true;
    }

    public boolean w(P p, float f) {
        return false;
    }

    public void x(int i, int i2) {
        this.b.scrollBy(0, i2);
    }

    public /* synthetic */ yj3(RecyclerView recyclerView) {
        this(recyclerView, new Handler(Looper.getMainLooper()));
    }

    public void p() {
    }

    public void l(MotionEvent motionEvent) {
    }

    public void m(P p) {
    }

    public void n(P p) {
    }

    public void o(P p) {
    }

    public void q(P p) {
    }

    public void r(int i) {
    }

    public void t(P p) {
    }

    public void u(MotionEvent motionEvent) {
    }

    public void s(int i, P p) {
    }

    public void v(int i, P p) {
    }
}
