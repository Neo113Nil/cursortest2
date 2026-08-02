package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.viewpager.widget.ViewPager;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import xsna.fb80;

/* compiled from: UiViewedTimeChecker.kt */
/* loaded from: classes17.dex */
public class c2q0<ItemKey> extends jm6<ItemKey> {
    public final wzs<RecyclerView, Integer, c2q0<ItemKey>> k;
    public final Object l;
    public final d2q0 m;
    public final HashMap<View, c2q0<ItemKey>> n;
    public final HashMap<View, nzt0<ItemKey>> o;
    public final c2q0<ItemKey>.b p;
    public final c2q0<ItemKey>.a q;
    public boolean r;
    public boolean s;
    public final e2q0 t;

    /* compiled from: UiViewedTimeChecker.kt */
    public final class a extends RecyclerView.i {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void b() {
            i();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void c(int i, int i2) {
            i();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void e(int i, int i2) {
            i();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void f(int i, int i2) {
            i();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void g(int i, int i2) {
            i();
        }

        public final void i() {
            c2q0<ItemKey> c2q0Var = c2q0.this;
            c2q0Var.b.post(new m67(this, c2q0Var));
        }
    }

    /* compiled from: UiViewedTimeChecker.kt */
    public final class b extends RecyclerView.t {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            c2q0.this.a();
        }
    }

    @ozl
    public c2q0() {
        throw null;
    }

    public /* synthetic */ c2q0(RecyclerView recyclerView, fb80.b bVar, wzs wzsVar, vtj vtjVar, pvx pvxVar, int i) {
        this(recyclerView, bVar, (i & 4) != 0 ? null : wzsVar, vtjVar, (i & 32) != 0 ? new q5u0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3) : pvxVar);
    }

    @Override // xsna.jm6
    public final void a() {
        this.r = false;
        if (this.s) {
            super.a();
            Iterator<Map.Entry<View, c2q0<ItemKey>>> it = this.n.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().a();
            }
            Iterator<Map.Entry<View, nzt0<ItemKey>>> it2 = this.o.entrySet().iterator();
            while (it2.hasNext()) {
                if (it2.next().getValue().a) {
                    System.currentTimeMillis();
                    throw null;
                }
            }
        }
    }

    @Override // xsna.jm6
    public final void b() {
        if (this.r) {
            return;
        }
        super.b();
        Iterator<Map.Entry<View, c2q0<ItemKey>>> it = this.n.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().b();
        }
        Iterator<Map.Entry<View, nzt0<ItemKey>>> it2 = this.o.entrySet().iterator();
        if (it2.hasNext()) {
            it2.next().getValue().getClass();
            System.currentTimeMillis();
            throw null;
        }
        this.r = true;
        l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.jm6
    public ItemKey c(RecyclerView.e0 e0Var) {
        b2q0 b2q0Var = e0Var instanceof b2q0 ? (b2q0) e0Var : null;
        if (b2q0Var != null) {
            return (ItemKey) b2q0Var.A5();
        }
        return null;
    }

    public boolean i(RecyclerView.o oVar) {
        if ((oVar instanceof LinearLayoutManager) && ((LinearLayoutManager) oVar).b == 0) {
            return true;
        }
        return (oVar instanceof StaggeredGridLayoutManager) && ((StaggeredGridLayoutManager) oVar).getOrientation() == 0;
    }

    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object, xsna.vtj] */
    public final void j(View view, View view2) {
        c2q0<ItemKey> invoke;
        if (k(view2)) {
            return;
        }
        int childAdapterPosition = this.b.getChildAdapterPosition(view2);
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) view;
            HashMap<View, c2q0<ItemKey>> hashMap = this.n;
            if (hashMap.containsKey(recyclerView)) {
                return;
            }
            RecyclerView.o layoutManager = recyclerView.getLayoutManager();
            if (i(layoutManager)) {
                wzs<RecyclerView, Integer, c2q0<ItemKey>> wzsVar = this.k;
                if (wzsVar == null || (invoke = wzsVar.invoke(recyclerView, Integer.valueOf(childAdapterPosition))) == null) {
                    return;
                }
                hashMap.put(view2, invoke);
                invoke.m(this.s);
                i0q0.f(new lew(0, invoke, c2q0.class, "check", "check()V", 0, 2));
                return;
            }
            StringBuilder sb = new StringBuilder("Failed to attach nested recycler: this=");
            sb.append(getClass().getCanonicalName());
            sb.append(" layoutManager=");
            sb.append(layoutManager != null ? layoutManager.getClass().getCanonicalName() : null);
            sb.append(" orientation=");
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            sb.append(linearLayoutManager != null ? Integer.valueOf(linearLayoutManager.b) : null);
            sb.append("rootView=");
            sb.append(view2.getClass().getCanonicalName());
            this.l.a(new IllegalStateException(sb.toString()));
            return;
        }
        if (view instanceof ViewPager) {
            this.o.containsKey((ViewPager) view);
            return;
        }
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = 0;
        while (true) {
            if (!(i < viewGroup.getChildCount())) {
                return;
            }
            int i2 = i + 1;
            View childAt = viewGroup.getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            j(childAt, view2);
            i = i2;
        }
    }

    public boolean k(View view) {
        return false;
    }

    public final void m(boolean z) {
        this.s = z;
        Iterator<T> it = this.n.values().iterator();
        while (it.hasNext()) {
            ((c2q0) it.next()).m(z);
        }
        Iterator<T> it2 = this.o.values().iterator();
        while (it2.hasNext()) {
            ((nzt0) it2.next()).a = z;
        }
    }

    public c2q0(RecyclerView recyclerView, fb80.b bVar, wzs wzsVar, vtj vtjVar, pvx pvxVar) {
        super(recyclerView, bVar, pvxVar);
        this.k = wzsVar;
        this.l = vtjVar;
        d2q0 d2q0Var = wzsVar == null ? null : new d2q0(this);
        this.m = d2q0Var;
        this.n = new HashMap<>();
        this.o = new HashMap<>();
        c2q0<ItemKey>.b bVar2 = new b();
        this.p = bVar2;
        c2q0<ItemKey>.a aVar = new a();
        this.q = aVar;
        this.s = true;
        e2q0 e2q0Var = new e2q0(this);
        this.t = e2q0Var;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.registerAdapterDataObserver(aVar);
        }
        recyclerView.addOnAttachStateChangeListener(e2q0Var);
        recyclerView.addOnScrollListener(bVar2);
        if (d2q0Var != null) {
            recyclerView.addOnChildAttachStateChangeListener(d2q0Var);
        }
    }

    public c2q0(RecyclerView recyclerView, d680 d680Var, boolean z, oac oacVar, vtj vtjVar, int i) {
        this(recyclerView, d680Var, (i & 8) != 0 ? null : oacVar, vtjVar, new mjf0(z, 6));
    }

    public void l() {
    }
}
