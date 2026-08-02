package xsna;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.vk.core.view.components.pagination.VkPaginationDots;
import java.lang.ref.WeakReference;

/* compiled from: VkPaginationDotsMediator.kt */
/* loaded from: classes17.dex */
public final class sav0 {
    public final VkPaginationDots a;
    public final ViewPager2 b;
    public RecyclerView.Adapter<?> c;
    public boolean d;
    public a e;
    public b f;

    /* compiled from: VkPaginationDotsMediator.kt */
    public final class b extends RecyclerView.i {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void b() {
            sav0.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void c(int i, int i2) {
            sav0.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void d(int i, int i2, Object obj) {
            sav0.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void e(int i, int i2) {
            sav0.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void f(int i, int i2) {
            sav0.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void g(int i, int i2) {
            sav0.this.b();
        }
    }

    public sav0(VkPaginationDots vkPaginationDots, ViewPager2 viewPager2) {
        this.a = vkPaginationDots;
        this.b = viewPager2;
    }

    public final void a() {
        if (this.d) {
            throw new IllegalStateException("VkPaginationDotsMediator is already attached");
        }
        ViewPager2 viewPager2 = this.b;
        RecyclerView.Adapter adapter = viewPager2.getAdapter();
        if (adapter == null) {
            throw new IllegalStateException("VkPaginationDotsMediator attached before ViewPager2 has an adapter");
        }
        this.c = adapter;
        this.d = true;
        VkPaginationDots vkPaginationDots = this.a;
        a aVar = new a(vkPaginationDots);
        viewPager2.b(aVar);
        this.e = aVar;
        b bVar = new b();
        RecyclerView.Adapter<?> adapter2 = this.c;
        if (adapter2 != null) {
            adapter2.registerAdapterDataObserver(bVar);
        }
        this.f = bVar;
        b();
        vkPaginationDots.setCurrentDotIndex(viewPager2.getCurrentItem());
    }

    public final void b() {
        int currentItem = this.b.getCurrentItem();
        VkPaginationDots vkPaginationDots = this.a;
        vkPaginationDots.setCurrentDotIndex(currentItem);
        RecyclerView.Adapter<?> adapter = this.c;
        if (adapter != null) {
            vkPaginationDots.setDotsCount(adapter.getItemCount());
        }
    }

    /* compiled from: VkPaginationDotsMediator.kt */
    public static final class a extends ViewPager2.g {
        public final WeakReference<VkPaginationDots> d;

        public a(VkPaginationDots vkPaginationDots) {
            this.d = new WeakReference<>(vkPaginationDots);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void onPageScrolled(int i, float f, int i2) {
            VkPaginationDots vkPaginationDots = this.d.get();
            if (vkPaginationDots != null) {
                vkPaginationDots.setCurrentDotIndex(an10.b(f) + i);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void onPageSelected(int i) {
            VkPaginationDots vkPaginationDots = this.d.get();
            if (vkPaginationDots == null || vkPaginationDots.getCurrentDotIndex() == i || i >= vkPaginationDots.getDotsCount()) {
                return;
            }
            vkPaginationDots.setCurrentDotIndex(i);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void onPageScrollStateChanged(int i) {
        }
    }
}
