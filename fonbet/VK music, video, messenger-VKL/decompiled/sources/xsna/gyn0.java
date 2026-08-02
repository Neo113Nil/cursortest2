package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.vk.core.view.VKTabLayout;
import com.vk.im.ui.fragments.ChatAttachmentHistoryFragment;
import java.util.ArrayList;
import java.util.List;

/* compiled from: TabsHistoryAttachesVC.kt */
/* loaded from: classes2.dex */
public final class gyn0 {
    public final List<c8v> a;
    public final okr0 b;
    public ViewPager c;
    public VKTabLayout d;
    public Toolbar e;

    /* compiled from: TabsHistoryAttachesVC.kt */
    public final class a extends PagerAdapter {
        public a() {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            gyn0 gyn0Var = gyn0.this;
            View view = gyn0Var.a.get(i).g;
            if (view != null) {
                viewGroup.removeView(view);
            }
            gyn0Var.a.get(i).H0();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getCount() {
            return gyn0.this.a.size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final CharSequence getPageTitle(int i) {
            return gyn0.this.a.get(i).Y0();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final Object instantiateItem(ViewGroup viewGroup, int i) {
            View F0 = gyn0.this.a.get(i).F0(viewGroup, null);
            viewGroup.addView(F0);
            return F0;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final boolean isViewFromObject(View view, Object obj) {
            return view.equals(obj);
        }
    }

    public gyn0(ArrayList arrayList, ChatAttachmentHistoryFragment.b bVar) {
        this.a = arrayList;
        this.b = bVar;
    }
}
