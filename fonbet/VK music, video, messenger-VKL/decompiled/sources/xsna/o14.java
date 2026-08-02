package xsna;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.vk.core.view.components.paging.list.VkRecyclerPaginatedView;
import com.vk.documents.impl.ui.fragments.AttachDocumentsFragment;
import java.util.Iterator;

/* compiled from: AttachDocumentsFragment.kt */
/* loaded from: classes18.dex */
public final class o14 implements ViewPager.j {
    public final /* synthetic */ AttachDocumentsFragment b;

    public o14(AttachDocumentsFragment attachDocumentsFragment) {
        this.b = attachDocumentsFragment;
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageSelected(int i) {
        RecyclerView recyclerView;
        nun nunVar = this.b.E0;
        if (nunVar != null) {
            Iterator it = nunVar.b.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i3 = i2 + 1;
                if (i2 < 0) {
                    e43.t();
                    throw null;
                }
                VkRecyclerPaginatedView vkRecyclerPaginatedView = ((run) next).f;
                VkRecyclerPaginatedView vkRecyclerPaginatedView2 = vkRecyclerPaginatedView != null ? vkRecyclerPaginatedView : null;
                if (vkRecyclerPaginatedView2 != null && (recyclerView = vkRecyclerPaginatedView2.getRecyclerView()) != null) {
                    recyclerView.setNestedScrollingEnabled(i2 == i);
                }
                i2 = i3;
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageScrolled(int i, float f, int i2) {
    }
}
