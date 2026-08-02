package xsna;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.m;
import androidx.viewpager2.widget.ViewPager2;
import com.vk.clips.viewer.impl.grid.ClipsGridFragment;
import com.vk.clips.viewer.impl.owner.ui.fragment.ClipsOwnerSwipeFragment;
import com.vk.core.fragments.FragmentImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: ClipsOwnerSwipePagerAdapter.kt */
/* loaded from: classes17.dex */
public final class yoe extends k1q0 {
    public final h20 s;
    public final FragmentManager t;
    public final c u;
    public final androidx.recyclerview.widget.d<mme> v;

    /* compiled from: ClipsOwnerSwipePagerAdapter.kt */
    public final class a implements ggz {
        public a() {
        }

        public final void a(int i, int i2, int i3) {
            int i4 = i3 - 1;
            if (i2 > i4) {
                return;
            }
            while (true) {
                yoe yoeVar = yoe.this;
                yoeVar.G0(yoeVar.F0(i4), i4 + i);
                if (i4 == i2) {
                    return;
                } else {
                    i4--;
                }
            }
        }

        @Override // xsna.ggz
        public final void onChanged(int i, int i2, Object obj) {
            int i3 = i + i2;
            int i4 = i;
            while (true) {
                yoe yoeVar = yoe.this;
                if (i4 >= i3) {
                    yoeVar.notifyItemRangeChanged(i, i2, obj);
                    return;
                }
                Fragment invoke = yoeVar.v.f.get(i4).a().a.invoke();
                yoeVar.G0(invoke, i4);
                yoeVar.J0(invoke, i4);
                i4++;
            }
        }

        @Override // xsna.ggz
        public final void onInserted(int i, int i2) {
            Map map;
            Long e;
            yoe yoeVar = yoe.this;
            FragmentManager fragmentManager = yoeVar.t;
            androidx.recyclerview.widget.d<mme> dVar = yoeVar.v;
            if (i2 == dVar.f.size()) {
                List<Fragment> f = fragmentManager.c.f();
                ArrayList arrayList = new ArrayList();
                for (Fragment fragment : f) {
                    FragmentImpl fragmentImpl = fragment instanceof FragmentImpl ? (FragmentImpl) fragment : null;
                    if (fragmentImpl != null) {
                        arrayList.add(fragmentImpl);
                    }
                }
                int e2 = on00.e(c5g.u(arrayList, 10));
                if (e2 < 16) {
                    e2 = 16;
                }
                map = new LinkedHashMap(e2);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    Bundle arguments = ((FragmentImpl) next).getArguments();
                    map.put(Long.valueOf((arguments == null || (e = bo8.e(arguments, "ADAPTER_ITEM_ID_ARG")) == null) ? -1L : e.longValue()), next);
                }
            } else {
                map = jgp.b;
            }
            a(i2, i, dVar.f.size());
            androidx.fragment.app.a b = map.isEmpty() ? null : tk5.b(fragmentManager, fragmentManager);
            int i3 = i + i2;
            for (int i4 = i; i4 < i3; i4++) {
                mme mmeVar = dVar.f.get(i4);
                Fragment fragment2 = (FragmentImpl) map.get(Long.valueOf(mmeVar.getId()));
                if (fragment2 == null) {
                    fragment2 = mmeVar.a().a.invoke();
                } else if (fragment2.isAdded()) {
                    if (b != null) {
                        b.q(fragment2);
                    }
                    fragment2 = mmeVar.a().a.invoke();
                }
                yoeVar.G0(fragment2, i4);
                yoeVar.J0(fragment2, i4);
            }
            if (b != null) {
                b.l();
            }
            yoeVar.notifyItemRangeInserted(i, i2);
        }

        @Override // xsna.ggz
        public final void onMoved(int i, int i2) {
            yoe yoeVar = yoe.this;
            Fragment F0 = yoeVar.F0(i);
            if (i < i2) {
                yoeVar.removeItem(i);
                a(1, i2, yoeVar.v.f.size() - 1);
                yoeVar.G0(F0, i2);
            } else if (i2 < i) {
                a(1, i2, i);
                yoeVar.G0(F0, i2);
            }
            yoeVar.notifyItemMoved(i, i2);
        }

        @Override // xsna.ggz
        public final void onRemoved(int i, int i2) {
            int i3 = 0;
            while (true) {
                yoe yoeVar = yoe.this;
                if (i3 >= i2) {
                    yoeVar.notifyItemRangeRemoved(i, i2);
                    return;
                } else {
                    yoeVar.removeItem(i);
                    i3++;
                }
            }
        }
    }

    /* compiled from: ClipsOwnerSwipePagerAdapter.kt */
    public static final class b extends m.e<mme> {
        public static final b a = new b();

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(mme mmeVar, mme mmeVar2) {
            return mmeVar.equals(mmeVar2);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(mme mmeVar, mme mmeVar2) {
            return mmeVar.getId() == mmeVar2.getId();
        }
    }

    /* compiled from: ClipsOwnerSwipePagerAdapter.kt */
    public final class c implements androidx.lifecycle.l {

        /* compiled from: ClipsOwnerSwipePagerAdapter.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Lifecycle.Event.values().length];
                try {
                    iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Override // androidx.lifecycle.l
        public final void onStateChanged(f5z f5zVar, Lifecycle.Event event) {
            int i = a.$EnumSwitchMapping$0[event.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                f5zVar.getLifecycle().removeObserver(this);
                return;
            }
            boolean z = f5zVar instanceof FragmentImpl;
            FragmentImpl fragmentImpl = z ? (FragmentImpl) f5zVar : null;
            if (fragmentImpl != null) {
                fragmentImpl.o = false;
            }
            FragmentImpl fragmentImpl2 = z ? (FragmentImpl) f5zVar : null;
            if (fragmentImpl2 != null) {
                fragmentImpl2.In();
            }
        }
    }

    public yoe(ClipsOwnerSwipeFragment clipsOwnerSwipeFragment, ViewPager2 viewPager2, mbs mbsVar, h20 h20Var, FragmentManager fragmentManager) {
        super(clipsOwnerSwipeFragment, viewPager2, mbsVar, fragmentManager);
        this.s = h20Var;
        this.t = fragmentManager;
        this.u = new c();
        a aVar = new a();
        b bVar = b.a;
        synchronized (c.a.a) {
            try {
                if (c.a.b == null) {
                    asu0.a.getClass();
                    ExecutorService D = asu0.D();
                    c.a.b = D == null ? Executors.newFixedThreadPool(2) : D;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.v = new androidx.recyclerview.widget.d<>(aVar, new androidx.recyclerview.widget.c(null, c.a.b, bVar));
    }

    public final void J0(Fragment fragment, int i) {
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putLong("ADAPTER_ITEM_ID_ARG", getItemId(i));
        fragment.setArguments(arguments);
        Lifecycle lifecycle = fragment.getLifecycle();
        c cVar = this.u;
        lifecycle.removeObserver(cVar);
        fragment.getLifecycle().addObserver(cVar);
        ClipsGridFragment clipsGridFragment = fragment instanceof ClipsGridFragment ? (ClipsGridFragment) fragment : null;
        if (clipsGridFragment != null) {
            clipsGridFragment.S = this.s;
        }
    }

    public final void K0(List list, pk pkVar) {
        this.v.b(list, new ja6(pkVar, 2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.v.f.size();
    }

    @Override // xsna.scs, androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return this.v.f.get(i).getId();
    }

    @Override // xsna.scs
    public final boolean y0(long j) {
        List<mme> list = this.v.f;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((mme) it.next()).getId() == j) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.scs
    public final Fragment z0(int i) {
        Fragment F0 = F0(i);
        if (F0 != null) {
            return F0;
        }
        Fragment invoke = this.v.f.get(i).a().a.invoke();
        G0(invoke, i);
        J0(invoke, i);
        return invoke;
    }
}
