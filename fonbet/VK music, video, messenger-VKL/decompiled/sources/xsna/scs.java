package xsna;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import xsna.el3;

/* compiled from: FragmentStateAdapter.java */
/* loaded from: classes12.dex */
public abstract class scs extends RecyclerView.Adapter<mds> implements yuk0 {
    public final Lifecycle c;
    public final FragmentManager d;
    public final x500<Fragment> e;
    public final x500<Fragment.SavedState> f;
    public final x500<Integer> g;
    public d h;
    public final c i;
    public boolean j;
    public boolean k;

    /* compiled from: FragmentStateAdapter.java */
    public class a implements androidx.lifecycle.l {
        public final /* synthetic */ mds b;

        public a(mds mdsVar) {
            this.b = mdsVar;
        }

        @Override // androidx.lifecycle.l
        public final void onStateChanged(@NonNull f5z f5zVar, @NonNull Lifecycle.Event event) {
            scs scsVar = scs.this;
            if (scsVar.d.T()) {
                return;
            }
            f5zVar.getLifecycle().removeObserver(this);
            mds mdsVar = this.b;
            if (((FrameLayout) mdsVar.itemView).isAttachedToWindow()) {
                scsVar.C0(mdsVar);
            }
        }
    }

    /* compiled from: FragmentStateAdapter.java */
    public static abstract class b extends RecyclerView.i {
        @Override // androidx.recyclerview.widget.RecyclerView.i
        public abstract void b();

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void c(int i, int i2) {
            b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void d(int i, int i2, @Nullable Object obj) {
            b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void e(int i, int i2) {
            b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void f(int i, int i2) {
            b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void g(int i, int i2) {
            b();
        }
    }

    /* compiled from: FragmentStateAdapter.java */
    public static class c {
        public CopyOnWriteArrayList a;

        public static void b(List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((e.b) it.next()).getClass();
            }
        }

        public final ArrayList a() {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((e) it.next()).getClass();
                arrayList.add(e.a);
            }
            return arrayList;
        }
    }

    /* compiled from: FragmentStateAdapter.java */
    public class d {
        public wcs a;
        public xcs b;
        public ycs c;
        public ViewPager2 d;
        public long e = -1;

        public d() {
        }

        @NonNull
        public static ViewPager2 a(@NonNull RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        public final void b(boolean z) {
            int currentItem;
            Fragment fragment;
            scs scsVar = scs.this;
            x500<Fragment> x500Var = scsVar.e;
            FragmentManager fragmentManager = scsVar.d;
            if (fragmentManager.T() || this.d.getScrollState() != 0 || x500Var.isEmpty() || scsVar.getItemCount() == 0 || (currentItem = this.d.getCurrentItem()) >= scsVar.getItemCount()) {
                return;
            }
            long itemId = scsVar.getItemId(currentItem);
            if ((itemId != this.e || z) && (fragment = x500Var.get(itemId)) != null && fragment.isAdded()) {
                this.e = itemId;
                androidx.fragment.app.a b = tk5.b(fragmentManager, fragmentManager);
                ArrayList arrayList = new ArrayList();
                Fragment fragment2 = null;
                for (int i = 0; i < x500Var.size(); i++) {
                    long keyAt = x500Var.keyAt(i);
                    Fragment valueAt = x500Var.valueAt(i);
                    if (valueAt.isAdded()) {
                        if (keyAt != this.e) {
                            b.r(valueAt, Lifecycle.State.STARTED);
                            arrayList.add(scsVar.i.a());
                        } else {
                            fragment2 = valueAt;
                        }
                        valueAt.setMenuVisibility(keyAt == this.e);
                    }
                }
                if (fragment2 != null) {
                    b.r(fragment2, Lifecycle.State.RESUMED);
                    arrayList.add(scsVar.i.a());
                }
                if (b.c.isEmpty()) {
                    return;
                }
                b.l();
                Collections.reverse(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    List list = (List) it.next();
                    scsVar.i.getClass();
                    c.b(list);
                }
            }
        }
    }

    /* compiled from: FragmentStateAdapter.java */
    public static abstract class e {

        @NonNull
        public static final a a = new a();

        /* compiled from: FragmentStateAdapter.java */
        public class a implements b {
        }

        /* compiled from: FragmentStateAdapter.java */
        public interface b {
        }
    }

    public scs(@NonNull FragmentActivity fragmentActivity) {
        this(fragmentActivity.getSupportFragmentManager(), fragmentActivity.getLifecycle());
    }

    public static void x0(@NonNull View view, @NonNull FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0() {
        x500<Fragment> x500Var;
        x500<Integer> x500Var2;
        Fragment fragment;
        View view;
        if (!this.k || this.d.T()) {
            return;
        }
        el3 el3Var = new el3();
        int i = 0;
        while (true) {
            x500Var = this.e;
            int size = x500Var.size();
            x500Var2 = this.g;
            if (i >= size) {
                break;
            }
            long keyAt = x500Var.keyAt(i);
            if (!y0(keyAt)) {
                el3Var.add(Long.valueOf(keyAt));
                x500Var2.remove(keyAt);
            }
            i++;
        }
        if (!this.j) {
            this.k = false;
            for (int i2 = 0; i2 < x500Var.size(); i2++) {
                long keyAt2 = x500Var.keyAt(i2);
                if (!x500Var2.containsKey(keyAt2) && ((fragment = x500Var.get(keyAt2)) == null || (view = fragment.getView()) == null || view.getParent() == null)) {
                    el3Var.add(Long.valueOf(keyAt2));
                }
            }
        }
        el3.a aVar = new el3.a();
        while (aVar.hasNext()) {
            D0(((Long) aVar.next()).longValue());
        }
    }

    public final Long B0(int i) {
        Long l = null;
        int i2 = 0;
        while (true) {
            x500<Integer> x500Var = this.g;
            if (i2 >= x500Var.size()) {
                return l;
            }
            if (x500Var.valueAt(i2).intValue() == i) {
                if (l != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                l = Long.valueOf(x500Var.keyAt(i2));
            }
            i2++;
        }
    }

    public final void C0(@NonNull mds mdsVar) {
        Fragment fragment = this.e.get(mdsVar.getItemId());
        if (fragment == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        FrameLayout frameLayout = (FrameLayout) mdsVar.itemView;
        View view = fragment.getView();
        if (!fragment.isAdded() && view != null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        boolean isAdded = fragment.isAdded();
        FragmentManager fragmentManager = this.d;
        if (isAdded && view == null) {
            fragmentManager.c0(new tcs(this, fragment, frameLayout), false);
            return;
        }
        if (fragment.isAdded() && view.getParent() != null) {
            if (view.getParent() != frameLayout) {
                x0(view, frameLayout);
                return;
            }
            return;
        }
        if (fragment.isAdded()) {
            x0(view, frameLayout);
            return;
        }
        if (fragmentManager.T()) {
            if (fragmentManager.J) {
                return;
            }
            this.c.addObserver(new a(mdsVar));
            return;
        }
        fragmentManager.c0(new tcs(this, fragment, frameLayout), false);
        c cVar = this.i;
        cVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = cVar.a.iterator();
        while (it.hasNext()) {
            ((e) it.next()).getClass();
            arrayList.add(e.a);
        }
        try {
            fragment.setMenuVisibility(false);
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
            aVar.f(0, fragment, InneractiveMediationDefs.GENDER_FEMALE + mdsVar.getItemId(), 1);
            aVar.r(fragment, Lifecycle.State.STARTED);
            aVar.l();
            this.h.b(false);
        } finally {
            c.b(arrayList);
        }
    }

    public final void D0(long j) {
        ViewParent parent;
        x500<Fragment> x500Var = this.e;
        Fragment fragment = x500Var.get(j);
        if (fragment == null) {
            return;
        }
        if (fragment.getView() != null && (parent = fragment.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        boolean y0 = y0(j);
        x500<Fragment.SavedState> x500Var2 = this.f;
        if (!y0) {
            x500Var2.remove(j);
        }
        if (!fragment.isAdded()) {
            x500Var.remove(j);
            return;
        }
        FragmentManager fragmentManager = this.d;
        if (fragmentManager.T()) {
            this.k = true;
            return;
        }
        boolean isAdded = fragment.isAdded();
        e.a aVar = e.a;
        c cVar = this.i;
        if (isAdded && y0(j)) {
            cVar.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it = cVar.a.iterator();
            while (it.hasNext()) {
                ((e) it.next()).getClass();
                arrayList.add(aVar);
            }
            Fragment.SavedState h0 = fragmentManager.h0(fragment);
            c.b(arrayList);
            x500Var2.put(j, h0);
        }
        cVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = cVar.a.iterator();
        while (it2.hasNext()) {
            ((e) it2.next()).getClass();
            arrayList2.add(aVar);
        }
        try {
            androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(fragmentManager);
            aVar2.q(fragment);
            aVar2.l();
            x500Var.remove(j);
        } finally {
            c.b(arrayList2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // xsna.yuk0
    public final void h(@NonNull Parcelable parcelable) {
        x500<Fragment.SavedState> x500Var = this.f;
        if (x500Var.isEmpty()) {
            x500<Fragment> x500Var2 = this.e;
            if (x500Var2.isEmpty()) {
                Bundle bundle = (Bundle) parcelable;
                if (bundle.getClassLoader() == null) {
                    bundle.setClassLoader(getClass().getClassLoader());
                }
                for (String str : bundle.keySet()) {
                    if (str.startsWith("f#") && str.length() > 2) {
                        x500Var2.put(Long.parseLong(str.substring(2)), this.d.L(bundle, str));
                    } else {
                        if (!str.startsWith("s#") || str.length() <= 2) {
                            throw new IllegalArgumentException("Unexpected key in savedState: ".concat(str));
                        }
                        long parseLong = Long.parseLong(str.substring(2));
                        Fragment.SavedState savedState = (Fragment.SavedState) bundle.getParcelable(str);
                        if (y0(parseLong)) {
                            x500Var.put(parseLong, savedState);
                        }
                    }
                }
                if (x500Var2.isEmpty()) {
                    return;
                }
                this.k = true;
                this.j = true;
                A0();
                Handler handler = new Handler(Looper.getMainLooper());
                ucs ucsVar = new ucs(this, 0);
                this.c.addObserver(new vcs(handler, ucsVar));
                handler.postDelayed(ucsVar, 10000L);
                return;
            }
        }
        throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        obr.b(this.h == null);
        d dVar = new d();
        this.h = dVar;
        dVar.d = d.a(recyclerView);
        wcs wcsVar = new wcs(dVar);
        dVar.a = wcsVar;
        dVar.d.b(wcsVar);
        xcs xcsVar = new xcs(dVar);
        dVar.b = xcsVar;
        registerAdapterDataObserver(xcsVar);
        ycs ycsVar = new ycs(dVar);
        dVar.c = ycsVar;
        this.c.addObserver(ycsVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NonNull mds mdsVar, int i) {
        mds mdsVar2 = mdsVar;
        long itemId = mdsVar2.getItemId();
        int id = ((FrameLayout) mdsVar2.itemView).getId();
        Long B0 = B0(id);
        x500<Integer> x500Var = this.g;
        if (B0 != null && B0.longValue() != itemId) {
            D0(B0.longValue());
            x500Var.remove(B0.longValue());
        }
        x500Var.put(itemId, Integer.valueOf(id));
        long itemId2 = getItemId(i);
        x500<Fragment> x500Var2 = this.e;
        if (!x500Var2.containsKey(itemId2)) {
            Fragment z0 = z0(i);
            z0.setInitialSavedState(this.f.get(itemId2));
            x500Var2.put(itemId2, z0);
        }
        if (((FrameLayout) mdsVar2.itemView).isAttachedToWindow()) {
            C0(mdsVar2);
        }
        A0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public final mds onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        int i2 = mds.l;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(View.generateViewId());
        frameLayout.setSaveEnabled(false);
        return new mds(frameLayout);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        d dVar = this.h;
        dVar.getClass();
        d.a(recyclerView).g(dVar.a);
        scs scsVar = scs.this;
        scsVar.unregisterAdapterDataObserver(dVar.b);
        scsVar.c.removeObserver(dVar.c);
        dVar.d = null;
        this.h = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ boolean onFailedToRecycleView(@NonNull mds mdsVar) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(@NonNull mds mdsVar) {
        C0(mdsVar);
        A0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(@NonNull mds mdsVar) {
        Long B0 = B0(((FrameLayout) mdsVar.itemView).getId());
        if (B0 != null) {
            D0(B0.longValue());
            this.g.remove(B0.longValue());
        }
    }

    @Override // xsna.yuk0
    @NonNull
    public final Parcelable r() {
        x500<Fragment> x500Var = this.e;
        int size = x500Var.size();
        x500<Fragment.SavedState> x500Var2 = this.f;
        Bundle bundle = new Bundle(x500Var2.size() + size);
        for (int i = 0; i < x500Var.size(); i++) {
            long keyAt = x500Var.keyAt(i);
            Fragment fragment = x500Var.get(keyAt);
            if (fragment != null && fragment.isAdded()) {
                this.d.b0(bundle, defpackage.k0.a(keyAt, "f#"), fragment);
            }
        }
        for (int i2 = 0; i2 < x500Var2.size(); i2++) {
            long keyAt2 = x500Var2.keyAt(i2);
            if (y0(keyAt2)) {
                bundle.putParcelable(defpackage.k0.a(keyAt2, "s#"), x500Var2.get(keyAt2));
            }
        }
        return bundle;
    }

    public boolean y0(long j) {
        return j >= 0 && j < ((long) getItemCount());
    }

    @NonNull
    public abstract Fragment z0(int i);

    public scs(@NonNull androidx.fragment.app.d dVar) {
        this(dVar.getChildFragmentManager(), dVar.getLifecycle());
    }

    public scs(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        this.e = new x500<>();
        this.f = new x500<>();
        this.g = new x500<>();
        c cVar = new c();
        cVar.a = new CopyOnWriteArrayList();
        this.i = cVar;
        this.j = false;
        this.k = false;
        this.d = fragmentManager;
        this.c = lifecycle;
        setHasStableIds(true);
    }
}
