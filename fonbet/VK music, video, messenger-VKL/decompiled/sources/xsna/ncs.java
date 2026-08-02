package xsna;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.l;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager.widget.PagerAdapter;
import com.vk.debug.ui.DebugTabsFragment;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* compiled from: FragmentPagerAdapter.java */
@Deprecated
/* loaded from: classes12.dex */
public abstract class ncs extends PagerAdapter {
    public final FragmentManager b;
    public boolean f;
    public androidx.fragment.app.a d = null;
    public Fragment e = null;
    public final int c = 1;

    public ncs(@NonNull FragmentManager fragmentManager) {
        this.b = fragmentManager;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.d == null) {
            FragmentManager fragmentManager = this.b;
            this.d = tk5.b(fragmentManager, fragmentManager);
        }
        this.d.n(fragment);
        if (fragment.equals(this.e)) {
            this.e = null;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void finishUpdate(@NonNull ViewGroup viewGroup) {
        androidx.fragment.app.a aVar = this.d;
        if (aVar != null) {
            if (!this.f) {
                try {
                    this.f = true;
                    aVar.m();
                } finally {
                    this.f = false;
                }
            }
            this.d = null;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @NonNull
    public final Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
        androidx.fragment.app.a aVar = this.d;
        FragmentManager fragmentManager = this.b;
        if (aVar == null) {
            this.d = tk5.b(fragmentManager, fragmentManager);
        }
        long j = i;
        Fragment H = fragmentManager.H("android:switcher:" + viewGroup.getId() + StringUtils.PROCESS_POSTFIX_DELIMITER + j);
        if (H != null) {
            androidx.fragment.app.a aVar2 = this.d;
            aVar2.getClass();
            aVar2.b(new l.a(H, 7));
        } else {
            H = new oz50(((DebugTabsFragment.b) DebugTabsFragment.S.get(i)).b, null, null).f();
            this.d.f(viewGroup.getId(), H, "android:switcher:" + viewGroup.getId() + StringUtils.PROCESS_POSTFIX_DELIMITER + j, 1);
        }
        if (H != this.e) {
            H.setMenuVisibility(false);
            if (this.c == 1) {
                this.d.r(H, Lifecycle.State.STARTED);
                return H;
            }
            H.setUserVisibleHint(false);
        }
        return H;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @Nullable
    public final Parcelable saveState() {
        return null;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void setPrimaryItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.e;
        if (fragment != fragment2) {
            FragmentManager fragmentManager = this.b;
            int i2 = this.c;
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (i2 == 1) {
                    if (this.d == null) {
                        this.d = tk5.b(fragmentManager, fragmentManager);
                    }
                    this.d.r(this.e, Lifecycle.State.STARTED);
                } else {
                    this.e.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (i2 == 1) {
                if (this.d == null) {
                    this.d = tk5.b(fragmentManager, fragmentManager);
                }
                this.d.r(fragment, Lifecycle.State.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.e = fragment;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void startUpdate(@NonNull ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void restoreState(@Nullable Parcelable parcelable, @Nullable ClassLoader classLoader) {
    }
}
