package xsna;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.vk.log.L;
import com.vk.voip.ui.groupcalls.grid.dots.GridPaginationDotsView;
import java.lang.ref.WeakReference;

/* compiled from: GridPaginationDotsMediator.kt */
/* loaded from: classes7.dex */
public final class agu {
    public final ViewPager2 a;
    public final GridPaginationDotsView b;
    public boolean c;
    public RecyclerView.Adapter<?> d;
    public a e;
    public b f;

    /* compiled from: GridPaginationDotsMediator.kt */
    public static final class a extends ViewPager2.g {
        public final WeakReference<GridPaginationDotsView> d;
        public int e = 0;
        public int f = 0;

        public a(GridPaginationDotsView gridPaginationDotsView) {
            this.d = new WeakReference<>(gridPaginationDotsView);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void onPageScrollStateChanged(int i) {
            this.e = this.f;
            this.f = i;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void onPageScrolled(int i, float f, int i2) {
            GridPaginationDotsView gridPaginationDotsView = this.d.get();
            if (gridPaginationDotsView != null) {
                try {
                    GridPaginationDotsView.a(gridPaginationDotsView.d.a, i);
                    gridPaginationDotsView.c(f, i);
                } catch (IllegalArgumentException e) {
                    L.G("Position is incorrect: " + e.getMessage());
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0019, code lost:
        
            r0.setSelectedPageIndex(r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x001c, code lost:
        
            return;
         */
        @Override // androidx.viewpager2.widget.ViewPager2.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onPageSelected(int i) {
            GridPaginationDotsView gridPaginationDotsView = this.d.get();
            try {
                int i2 = this.f;
                if (i2 != 0 && (i2 != 2 || this.e != 0)) {
                }
            } catch (IllegalArgumentException e) {
                L.G("Position is incorrect: " + e.getMessage());
            }
        }
    }

    /* compiled from: GridPaginationDotsMediator.kt */
    public final class b extends RecyclerView.i {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void b() {
            agu.this.c();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void c(int i, int i2) {
            agu.this.c();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void d(int i, int i2, Object obj) {
            agu.this.c();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void e(int i, int i2) {
            agu.this.c();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void f(int i, int i2) {
            agu.this.c();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void g(int i, int i2) {
            agu.this.c();
        }
    }

    public agu(ViewPager2 viewPager2, GridPaginationDotsView gridPaginationDotsView) {
        this.a = viewPager2;
        this.b = gridPaginationDotsView;
    }

    public final void a() {
        if (this.c) {
            return;
        }
        this.c = true;
        ViewPager2 viewPager2 = this.a;
        RecyclerView.Adapter adapter = viewPager2.getAdapter();
        this.d = adapter;
        if (adapter == null) {
            throw new IllegalStateException("Attached before view pager has an adapter");
        }
        b bVar = new b();
        this.f = bVar;
        adapter.registerAdapterDataObserver(bVar);
        a aVar = new a(this.b);
        this.e = aVar;
        viewPager2.b(aVar);
        c();
    }

    public final void b() {
        RecyclerView.Adapter<?> adapter;
        if (this.c) {
            this.c = false;
            b bVar = this.f;
            if (bVar != null && (adapter = this.d) != null) {
                adapter.unregisterAdapterDataObserver(bVar);
            }
            this.f = null;
            this.d = null;
            a aVar = this.e;
            if (aVar != null) {
                this.a.g(aVar);
            }
            this.e = null;
        }
    }

    public final void c() {
        RecyclerView.Adapter<?> adapter = this.d;
        if (adapter == null) {
            return;
        }
        try {
            int itemCount = adapter.getItemCount();
            this.b.b(itemCount, itemCount == 0 ? 0 : Math.min(this.a.getCurrentItem(), itemCount - 1));
        } catch (IllegalArgumentException e) {
            L.G("Position is incorrect: " + e.getMessage());
        }
    }
}
