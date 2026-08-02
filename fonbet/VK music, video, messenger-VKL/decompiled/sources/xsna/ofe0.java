package xsna;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.pullfromtopofrecycler.PullFromTopMode;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import xsna.vtm;

/* compiled from: PullFromTopOfRecyclerController.kt */
/* loaded from: classes5.dex */
public final class ofe0 {
    public final int a;
    public final bpn0 b;
    public final bpn0 c;
    public final bpn0 d;
    public final bpn0 e;
    public ttm f;
    public RecyclerView g;
    public LinearLayoutManager h;
    public RecyclerView.Adapter<?> i;
    public boolean j;
    public int k;
    public boolean l;
    public final LinkedHashMap m;
    public final LinkedHashMap<pfe0, PullFromTopMode> n;

    /* compiled from: PullFromTopOfRecyclerController.kt */
    public final class a implements RecyclerView.q {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public final void g(View view) {
            RecyclerView.e0 childViewHolder;
            ofe0 ofe0Var = ofe0.this;
            xd40 xd40Var = new xd40(ofe0Var, 13);
            RecyclerView recyclerView = ofe0Var.g;
            if (recyclerView == null || (childViewHolder = recyclerView.getChildViewHolder(view)) == null || !(childViewHolder instanceof pfe0)) {
                return;
            }
            xd40Var.invoke(childViewHolder);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public final void k(View view) {
            Object childViewHolder;
            ofe0 ofe0Var = ofe0.this;
            RecyclerView recyclerView = ofe0Var.g;
            if (recyclerView == null || (childViewHolder = recyclerView.getChildViewHolder(view)) == null || !(childViewHolder instanceof pfe0)) {
                return;
            }
            pfe0 pfe0Var = (pfe0) childViewHolder;
            ofe0Var.n.put(pfe0Var, pfe0Var.u());
            ofe0Var.a(pfe0Var.getView(), ofe0Var.l || pfe0Var.u() == PullFromTopMode.ALWAYS_VISIBLE);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    /* compiled from: PullFromTopOfRecyclerController.kt */
    public static final class b implements ViewTreeObserver.OnPreDrawListener {
        public final WeakReference<ofe0> b;

        public b(ofe0 ofe0Var) {
            this.b = new WeakReference<>(ofe0Var);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            boolean z;
            ViewTreeObserver viewTreeObserver;
            ofe0 ofe0Var = this.b.get();
            if (ofe0Var == null) {
                return true;
            }
            LinkedHashMap<pfe0, PullFromTopMode> linkedHashMap = ofe0Var.n;
            if (!linkedHashMap.isEmpty()) {
                for (Map.Entry<pfe0, PullFromTopMode> entry : linkedHashMap.entrySet()) {
                    if (entry.getKey().u() != entry.getValue()) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                RecyclerView recyclerView = ofe0Var.g;
                if (recyclerView != null) {
                    recyclerView.scrollToPosition(0);
                }
                ofe0Var.d();
            }
            RecyclerView recyclerView2 = ofe0Var.g;
            if (recyclerView2 != null && (viewTreeObserver = recyclerView2.getViewTreeObserver()) != null) {
                if (!viewTreeObserver.isAlive()) {
                    viewTreeObserver = null;
                }
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnPreDrawListener(this);
                }
            }
            return !z;
        }
    }

    /* compiled from: PullFromTopOfRecyclerController.kt */
    public static final class c extends RecyclerView.i {
        public final WeakReference<ofe0> a;
        public final b b;

        public c(ofe0 ofe0Var) {
            this.a = new WeakReference<>(ofe0Var);
            this.b = new b(ofe0Var);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void b() {
            ViewTreeObserver i = i();
            if (i != null) {
                i.addOnPreDrawListener(this.b);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void c(int i, int i2) {
            ViewTreeObserver i3;
            LinkedHashMap<pfe0, PullFromTopMode> linkedHashMap;
            ofe0 ofe0Var = this.a.get();
            if (i >= ((ofe0Var == null || (linkedHashMap = ofe0Var.n) == null) ? 0 : linkedHashMap.size()) || (i3 = i()) == null) {
                return;
            }
            i3.addOnPreDrawListener(this.b);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void e(int i, int i2) {
            ViewTreeObserver i3;
            LinkedHashMap<pfe0, PullFromTopMode> linkedHashMap;
            ofe0 ofe0Var = this.a.get();
            if (i >= ((ofe0Var == null || (linkedHashMap = ofe0Var.n) == null) ? 0 : linkedHashMap.size()) || (i3 = i()) == null) {
                return;
            }
            i3.addOnPreDrawListener(this.b);
        }

        public final ViewTreeObserver i() {
            RecyclerView recyclerView;
            ViewTreeObserver viewTreeObserver;
            ofe0 ofe0Var = this.a.get();
            if (ofe0Var == null || (recyclerView = ofe0Var.g) == null || (viewTreeObserver = recyclerView.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
                return null;
            }
            return viewTreeObserver;
        }
    }

    /* compiled from: PullFromTopOfRecyclerController.kt */
    public static final class d {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final boolean e;
        public final boolean f;

        public d(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i - i2;
            boolean z = i - i3 == i2;
            this.e = z;
            this.f = !z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && this.b == dVar.b && this.c == dVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MetaCounters(attachedViewHolders=");
            sb.append(this.a);
            sb.append(", visibleViewHolders=");
            sb.append(this.b);
            sb.append(", pullableViewHolders=");
            return vu5.b(sb, this.c, ')');
        }
    }

    /* compiled from: PullFromTopOfRecyclerController.kt */
    public static final class e implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
        public final View b;
        public final nfe0 c;
        public ViewTreeObserver d;

        public e(View view, nfe0 nfe0Var) {
            this.b = view;
            this.c = nfe0Var;
            this.d = view.getViewTreeObserver();
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            boolean isAlive = this.d.isAlive();
            View view = this.b;
            if (isAlive) {
                this.d.removeOnPreDrawListener(this);
            } else {
                view.getViewTreeObserver().removeOnPreDrawListener(this);
            }
            view.removeOnAttachStateChangeListener(this);
            this.c.invoke();
            return Boolean.TRUE.booleanValue();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            this.d = view.getViewTreeObserver();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            boolean isAlive = this.d.isAlive();
            View view2 = this.b;
            if (isAlive) {
                this.d.removeOnPreDrawListener(this);
            } else {
                view2.getViewTreeObserver().removeOnPreDrawListener(this);
            }
            view2.removeOnAttachStateChangeListener(this);
        }
    }

    /* compiled from: PullFromTopOfRecyclerController.kt */
    public final class f extends RecyclerView.y {
        public int b;

        public f() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public final boolean j(RecyclerView recyclerView, MotionEvent motionEvent) {
            boolean z;
            RecyclerView recyclerView2;
            int actionMasked = motionEvent.getActionMasked();
            int rawY = (int) motionEvent.getRawY();
            ofe0 ofe0Var = ofe0.this;
            if (actionMasked == 0) {
                this.b = rawY;
                ofe0Var.j = false;
                ofe0Var.k = 0;
            }
            if (actionMasked == 2) {
                int i = this.b - rawY;
                LinkedHashMap<pfe0, PullFromTopMode> linkedHashMap = ofe0Var.n;
                if (!ofe0Var.j) {
                    if (ofe0Var.g != null && !linkedHashMap.isEmpty()) {
                        Iterator<Map.Entry<pfe0, PullFromTopMode>> it = linkedHashMap.entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            pfe0 key = it.next().getKey();
                            if (key.u() == PullFromTopMode.DEFAULT && !ofe0.c(key.getView())) {
                                if (i <= 0) {
                                    z = true;
                                }
                            }
                        }
                    }
                    z = false;
                    if (z) {
                        ofe0Var.k = Math.abs(i) + ofe0Var.k;
                    } else {
                        ofe0Var.k = 0;
                    }
                    boolean z2 = ofe0Var.k >= ofe0Var.a;
                    boolean z3 = z && ofe0Var.b().f;
                    if (z2 || z3) {
                        ofe0Var.j = true;
                        LinearLayoutManager linearLayoutManager = ofe0Var.h;
                        if (linearLayoutManager != null) {
                            d b = ofe0Var.b();
                            int i2 = b.d;
                            if (b.e && (recyclerView2 = ofe0Var.g) != null) {
                                recyclerView2.performHapticFeedback(0, 2);
                            }
                            Iterator<Map.Entry<pfe0, PullFromTopMode>> it2 = linkedHashMap.entrySet().iterator();
                            while (it2.hasNext()) {
                                ofe0Var.a(it2.next().getKey().getView(), true);
                            }
                            int v = linearLayoutManager.v();
                            RecyclerView recyclerView3 = ofe0Var.g;
                            if (recyclerView3 != null) {
                                e eVar = new e(recyclerView3, new nfe0(ofe0Var, linearLayoutManager, v, i2));
                                recyclerView3.getViewTreeObserver().addOnPreDrawListener(eVar);
                                recyclerView3.addOnAttachStateChangeListener(eVar);
                            }
                            ofe0Var.l = true;
                        }
                    }
                }
                this.b = rawY;
            }
            if (actionMasked == 1 || actionMasked == 3) {
                this.b = 0;
                ofe0Var.k = 0;
                if (ofe0Var.j) {
                    ofe0Var.j = false;
                    ofe0Var.l = false;
                }
            }
            return false;
        }
    }

    /* compiled from: PullFromTopOfRecyclerController.kt */
    public static final /* synthetic */ class g {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PullFromTopMode.values().length];
            try {
                iArr[PullFromTopMode.ALWAYS_VISIBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PullFromTopMode.ALWAYS_HIDDEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ofe0() {
        int b2 = an10.b(72 * Resources.getSystem().getDisplayMetrics().density);
        this.a = b2;
        this.b = new bpn0(new akd0(this, 5));
        this.c = new bpn0(new n7w(this, 28));
        this.d = new bpn0(new xsw(this, 26));
        this.e = new bpn0(new o2a0(5));
        this.m = new LinkedHashMap();
        this.n = new LinkedHashMap<>();
        if (b2 < 0) {
            throw new IllegalArgumentException(lhg.a(b2, "Illegal pullActivateThresholdPx value: ").toString());
        }
    }

    public static boolean c(View view) {
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (viewGroup.getChildAt(i).getVisibility() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a(View view, boolean z) {
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            int i = z ? 0 : 8;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                viewGroup.getChildAt(i2).setVisibility(i);
            }
        }
        e(view);
    }

    public final d b() {
        LinkedHashMap<pfe0, PullFromTopMode> linkedHashMap = this.n;
        int size = linkedHashMap.size();
        int i = 0;
        int i2 = 0;
        for (Map.Entry<pfe0, PullFromTopMode> entry : linkedHashMap.entrySet()) {
            pfe0 key = entry.getKey();
            if (entry.getValue() == PullFromTopMode.DEFAULT) {
                i2++;
            }
            if (epx.f(this.m.get(key.getView()), Boolean.TRUE)) {
                i++;
            }
        }
        return new d(size, i, i2);
    }

    public final void d() {
        LinkedHashMap<pfe0, PullFromTopMode> linkedHashMap = this.n;
        for (pfe0 pfe0Var : linkedHashMap.keySet()) {
            View view = pfe0Var.getView();
            Boolean bool = (Boolean) this.m.get(view);
            boolean z = false;
            if ((bool != null ? bool.booleanValue() : false) || pfe0Var.u() == PullFromTopMode.ALWAYS_VISIBLE) {
                z = true;
            }
            a(view, z);
            linkedHashMap.put(pfe0Var, pfe0Var.u());
        }
    }

    public final void e(View view) {
        ttm ttmVar;
        ViewTreeObserver viewTreeObserver;
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        RecyclerView recyclerView = this.g;
        Object childViewHolder = recyclerView != null ? recyclerView.getChildViewHolder(view) : null;
        pfe0 pfe0Var = childViewHolder instanceof pfe0 ? (pfe0) childViewHolder : null;
        PullFromTopMode u = pfe0Var != null ? pfe0Var.u() : null;
        int i = u == null ? -1 : g.$EnumSwitchMapping$0[u.ordinal()];
        boolean z = false;
        if (i == 1 ? viewGroup != null : !(i == 2 || viewGroup == null || ((view.getBottom() <= viewGroup.getPaddingTop() && !this.j) || !c(view)))) {
            z = true;
        }
        LinkedHashMap linkedHashMap = this.m;
        if (epx.f(linkedHashMap.get(view), Boolean.valueOf(z))) {
            return;
        }
        linkedHashMap.put(view, Boolean.valueOf(z));
        if (pfe0Var == null || (ttmVar = this.f) == null) {
            return;
        }
        vtm vtmVar = ttmVar.a;
        WeakHashMap weakHashMap = ttmVar.b;
        trn trnVar = ttmVar.c;
        vtm.d dVar = ttmVar.d;
        if (z) {
            weakHashMap.put(pfe0Var, s3q0.a);
        } else {
            weakHashMap.remove(pfe0Var);
        }
        trnVar.a = !weakHashMap.isEmpty();
        RecyclerView recyclerView2 = vtmVar.n;
        if (recyclerView2 != null) {
            WeakReference<ViewTreeObserver> weakReference = dVar.c;
            if (weakReference != null && (viewTreeObserver = weakReference.get()) != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(dVar);
            }
            dVar.b = new WeakReference<>(recyclerView2);
            ViewTreeObserver viewTreeObserver2 = recyclerView2.getViewTreeObserver();
            if (viewTreeObserver2 == null || !viewTreeObserver2.isAlive()) {
                return;
            }
            dVar.c = new WeakReference<>(viewTreeObserver2);
            viewTreeObserver2.addOnPreDrawListener(dVar);
        }
    }
}
