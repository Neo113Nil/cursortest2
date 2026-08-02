package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.vk.api.base.Document;
import com.vk.core.view.components.paging.list.VkRecyclerPaginatedView;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: AttachDocumentsFragment.kt */
/* loaded from: classes18.dex */
public final class nun extends PagerAdapter {
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();

    public final void b(Document document) {
        int i;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            com.vk.documents.impl.ui.fragments.a aVar = ((run) it.next()).e;
            Iterator it2 = ((ArrayList) aVar.y0()).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    i = -1;
                    break;
                } else {
                    Document document2 = (Document) it2.next();
                    i = (document2.b == document.b && epx.f(document2.h, document.h)) ? 0 : i + 1;
                }
            }
            aVar.notifyItemChanged(i);
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.b.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence getPageTitle(int i) {
        return (CharSequence) this.c.get(i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        run runVar = (run) j5g.b0(i, this.b);
        VkRecyclerPaginatedView vkRecyclerPaginatedView = runVar != null ? runVar.f : null;
        if (vkRecyclerPaginatedView != null) {
            viewGroup.addView(vkRecyclerPaginatedView);
        }
        return vkRecyclerPaginatedView;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }
}
