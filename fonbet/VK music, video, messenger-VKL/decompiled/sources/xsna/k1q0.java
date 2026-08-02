package xsna;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.tracking.UiTracker;
import java.util.ArrayList;
import java.util.Stack;

/* compiled from: UiTrackingFragmentStateAdapter.kt */
/* loaded from: classes17.dex */
public abstract class k1q0 extends scs {
    public final ViewPager2 l;
    public final mbs m;
    public int n;
    public final tzb0 o;
    public final ArrayList p;
    public boolean q;
    public final h1q0 r;

    @ozl
    public k1q0(FragmentImpl fragmentImpl, ViewPager2 viewPager2, mbs mbsVar) {
        super(fragmentImpl);
        this.n = -1;
        this.o = new tzb0();
        this.p = new ArrayList();
        this.r = new h1q0(this);
        this.l = viewPager2;
        this.m = mbsVar;
        viewPager2.b(new g1q0(this));
    }

    public static final void E0(k1q0 k1q0Var, int i) {
        ViewPager2 viewPager2 = k1q0Var.l;
        tzb0 tzb0Var = k1q0Var.o;
        if (k1q0Var.n == i || i <= -1) {
            return;
        }
        final boolean a = tzb0Var.a(i);
        Stack<Integer> stack = tzb0Var.a;
        if (tzb0Var.a(i)) {
            stack.push(Integer.valueOf(i));
        } else {
            stack.pop();
        }
        final Fragment F0 = k1q0Var.F0(k1q0Var.n);
        try {
            final Fragment F02 = k1q0Var.F0(i);
            if (F02 == null) {
                F02 = k1q0Var.z0(i);
            }
            k1q0Var.n = i;
            if (!(F02 instanceof o0q0)) {
                viewPager2.post(new Runnable() { // from class: xsna.d1q0
                    @Override // java.lang.Runnable
                    public final void run() {
                        UiTracker.i.i(Fragment.this, F02, a);
                    }
                });
            } else if (F02.getLifecycle().getCurrentState().a(Lifecycle.State.CREATED)) {
                viewPager2.post(new Runnable() { // from class: xsna.e1q0
                    @Override // java.lang.Runnable
                    public final void run() {
                        UiTracker.i.i(Fragment.this, F02, a);
                    }
                });
            } else {
                F02.getLifecycle().addObserver(new j1q0(k1q0Var, F02, F0, a));
            }
        } catch (IllegalArgumentException | IllegalStateException | IndexOutOfBoundsException unused) {
        }
    }

    public final Fragment F0(int i) {
        ArrayList arrayList = this.p;
        if (arrayList.isEmpty() || i < 0 || i >= arrayList.size() || arrayList.get(i) == null) {
            return null;
        }
        return (Fragment) arrayList.get(i);
    }

    public final void G0(Fragment fragment, int i) {
        ArrayList arrayList = this.p;
        if (i == arrayList.size()) {
            arrayList.add(fragment);
            return;
        }
        if (i < arrayList.size()) {
            arrayList.set(i, fragment);
            return;
        }
        for (int size = arrayList.size(); size < i; size++) {
            arrayList.add(size, null);
        }
        arrayList.add(i, fragment);
    }

    public boolean H0() {
        return !(this instanceof ahc0);
    }

    @Override // xsna.scs, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.m.a(this.r);
    }

    @Override // xsna.scs, androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.m.d(this.r);
    }

    public final void removeItem(int i) {
        this.p.remove(i);
    }

    public k1q0(Fragment fragment, ViewPager2 viewPager2, mbs mbsVar, FragmentManager fragmentManager) {
        super(fragmentManager, fragment.getLifecycle());
        this.n = -1;
        this.o = new tzb0();
        this.p = new ArrayList();
        this.r = new h1q0(this);
        this.l = viewPager2;
        this.m = mbsVar;
        viewPager2.b(new g1q0(this));
    }
}
