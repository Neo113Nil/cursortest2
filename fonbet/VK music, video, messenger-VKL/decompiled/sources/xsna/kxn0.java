package xsna;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.tabs.VkTabLayout;
import com.vk.core.view.disableable.DisableableViewPager;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import me.grishka.appkit.fragments.AppKitFragment;
import me.grishka.appkit.fragments.LoaderFragment;

/* compiled from: TabbedScreen.java */
/* loaded from: classes8.dex */
public class kxn0 {
    public DisableableViewPager a;
    public TabLayout b;
    public View c;
    public final AppKitFragment k;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public boolean g = true;
    public int h = R.layout.appkit_tabs;
    public final boolean i = true;
    public final a j = new a();
    public boolean l = true;

    /* compiled from: TabbedScreen.java */
    public class b extends com.vk.core.fragments.h {
        public b() {
            super(kxn0.this.k.In(), true);
        }

        @Override // com.vk.core.fragments.h
        public final FragmentImpl c(int i) {
            return (FragmentImpl) kxn0.this.d.get(i);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getCount() {
            return kxn0.this.d.size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final CharSequence getPageTitle(int i) {
            return (CharSequence) kxn0.this.e.get(i);
        }
    }

    public kxn0(AppKitFragment appKitFragment) {
        this.k = appKitFragment;
    }

    public final void a(int i, FragmentImpl fragmentImpl, CharSequence charSequence) {
        this.d.add(i, fragmentImpl);
        this.e.add(i, charSequence);
        boolean z = fragmentImpl instanceof LoaderFragment;
        ArrayList arrayList = this.f;
        if (z) {
            arrayList.add(Boolean.valueOf(((LoaderFragment) fragmentImpl).f0));
        } else {
            arrayList.add(Boolean.TRUE);
        }
        Bundle arguments = fragmentImpl.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putBoolean("__is_tab", true);
        fragmentImpl.setArguments(arguments);
        g();
    }

    public b b() {
        return new b();
    }

    public final View c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(this.h, (ViewGroup) null);
        this.c = inflate;
        this.a = (DisableableViewPager) inflate.findViewById(R.id.viewpager);
        TabLayout tabLayout = (TabLayout) viewGroup.findViewById(R.id.tabs);
        this.b = tabLayout;
        if (tabLayout instanceof VkTabLayout) {
            ((VkTabLayout) tabLayout).setCustomTabContent(new r8a0(this, 29));
        }
        this.a.setAdapter(b());
        this.b.setupWithViewPager(this.a);
        this.b.g(this.j);
        this.b.setVisibility(this.l ? 0 : 8);
        return this.c;
    }

    public final void d() {
        this.a = null;
        this.c = null;
        this.b = null;
    }

    public final int e() {
        return this.a.getCurrentItem();
    }

    public final TabLayout f() {
        return this.b;
    }

    public final void g() {
        DisableableViewPager disableableViewPager = this.a;
        if (disableableViewPager != null) {
            disableableViewPager.getAdapter().notifyDataSetChanged();
            TabLayout tabLayout = this.b;
            if (tabLayout != null) {
                tabLayout.setupWithViewPager(this.a);
                this.b.g(this.j);
            }
        }
        p(this.d.size() > 1);
    }

    public void h() {
        throw null;
    }

    public final void i(Menu menu, MenuInflater menuInflater) {
        ArrayList arrayList = this.d;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ((FragmentImpl) arrayList.get(this.a.getCurrentItem())).onCreateOptionsMenu(menu, menuInflater);
    }

    public final boolean j(MenuItem menuItem) {
        return ((FragmentImpl) this.d.get(this.a.getCurrentItem())).onOptionsItemSelected(menuItem);
    }

    public void l(int i) {
        throw null;
    }

    public final void m(FragmentImpl fragmentImpl) {
        ArrayList arrayList = this.d;
        int indexOf = arrayList.indexOf(fragmentImpl);
        arrayList.remove(indexOf);
        this.e.remove(indexOf);
        this.f.remove(indexOf);
        g();
    }

    public final void n(boolean z) {
        this.a.setTouchEnabled(z);
    }

    public final void o(List<? extends FragmentImpl> list, List<? extends CharSequence> list2) {
        if (list2.size() != list.size()) {
            throw new IllegalArgumentException("Fragments and titles arrays must be the same size");
        }
        ArrayList arrayList = this.d;
        arrayList.clear();
        arrayList.addAll(list);
        ArrayList arrayList2 = this.e;
        arrayList2.clear();
        arrayList2.addAll(list2);
        ArrayList arrayList3 = this.f;
        arrayList3.clear();
        for (FragmentImpl fragmentImpl : list) {
            if (fragmentImpl instanceof LoaderFragment) {
                arrayList3.add(Boolean.valueOf(((LoaderFragment) fragmentImpl).f0));
            } else {
                arrayList3.add(Boolean.TRUE);
            }
            if ((!fragmentImpl.isAdded() && (fragmentImpl.getView() == null || !fragmentImpl.getView().isShown())) || fragmentImpl.isDetached() || fragmentImpl.isRemoving()) {
                Bundle arguments = fragmentImpl.getArguments();
                if (arguments == null) {
                    arguments = new Bundle();
                }
                arguments.putBoolean("__is_tab", true);
                fragmentImpl.setArguments(arguments);
            }
        }
        g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r2.d.size() > 1) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(boolean z) {
        boolean z2;
        if (z) {
            z2 = true;
        }
        z2 = false;
        if (this.l != z2) {
            this.l = z2;
            TabLayout tabLayout = this.b;
            if (tabLayout != null) {
                tabLayout.setVisibility(z2 ? 0 : 8);
            }
        }
    }

    public void k() {
    }

    /* compiled from: TabbedScreen.java */
    public class a extends z1q0 {
        public a() {
        }

        @Override // xsna.z1q0, com.google.android.material.tabs.TabLayout.c
        public final void Wd(TabLayout.g gVar) {
            kxn0 kxn0Var = kxn0.this;
            usn0.a(kxn0Var.b);
            if (kxn0Var.i) {
                super.Wd(gVar);
            }
            int i = gVar.e;
            kxn0Var.a.setCurrentItem(i);
            FragmentImpl fragmentImpl = (FragmentImpl) kxn0Var.d.get(i);
            if (kxn0Var.g && (fragmentImpl instanceof LoaderFragment) && !((Boolean) kxn0Var.f.get(i)).booleanValue()) {
                LoaderFragment loaderFragment = (LoaderFragment) fragmentImpl;
                if (!loaderFragment.f0) {
                    loaderFragment.qo();
                    kxn0Var.f.set(i, Boolean.TRUE);
                }
            }
            kxn0Var.l(i);
            kxn0Var.h();
        }

        @Override // xsna.z1q0, com.google.android.material.tabs.TabLayout.c
        public final void hl(TabLayout.g gVar) {
            kxn0.this.k();
        }

        @Override // xsna.z1q0, com.google.android.material.tabs.TabLayout.c
        public final void za(TabLayout.g gVar) {
        }
    }
}
