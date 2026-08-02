package xsna;

import android.os.Bundle;
import android.os.Parcelable;
import com.vk.core.fragments.FragmentEntry;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.Image;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.reactions.fragments.BaseReactionsTabFragment;
import com.vk.reactions.fragments.ReactionsFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: ReactionsTabAdapter.kt */
/* loaded from: classes5.dex */
public final class r6f0 extends com.vk.core.fragments.h {
    public static final int m = cn70.b(20);
    public final ArrayList<i990> k;
    public boolean l;

    public r6f0(ReactionsFragment reactionsFragment, vbs vbsVar) {
        super(vbsVar, true);
        this.k = new ArrayList<>();
        this.l = true;
    }

    @Override // com.vk.core.fragments.h
    public final FragmentImpl c(int i) {
        return this.k.get(i).b;
    }

    public final i990 g(String str) {
        Object obj;
        Iterator<T> it = this.k.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((i990) obj).a, str)) {
                break;
            }
        }
        return (i990) obj;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.k.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getItemPosition(Object obj) {
        int indexOf = this.k.indexOf(obj);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence getPageTitle(int i) {
        i990 i990Var = (i990) j5g.b0(i, this.k);
        if (i990Var != null) {
            return i990Var.d;
        }
        return null;
    }

    public final i990 h(int i) {
        return (i990) j5g.b0(i, this.k);
    }

    public final void j(List<i990> list) {
        ArrayList<i990> arrayList = this.k;
        arrayList.clear();
        arrayList.addAll(list);
        notifyDataSetChanged();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            FragmentImpl fragmentImpl = ((i990) it.next()).b;
            if (fragmentImpl instanceof BaseReactionsTabFragment) {
                BaseReactionsTabFragment baseReactionsTabFragment = (BaseReactionsTabFragment) fragmentImpl;
                boolean z = this.l;
                baseReactionsTabFragment.V = z;
                RecyclerPaginatedView recyclerPaginatedView = baseReactionsTabFragment.T;
                if (recyclerPaginatedView != null) {
                    recyclerPaginatedView.setSwipeRefreshEnabled(z);
                }
            }
        }
    }

    @Override // com.vk.core.fragments.h, androidx.viewpager.widget.PagerAdapter
    public final void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        super.restoreState(parcelable, classLoader);
        if (parcelable instanceof Bundle) {
            Bundle bundle = ((Bundle) parcelable).getBundle("titles");
            if (bundle != null) {
                int i = bundle.getInt("count");
                ArrayList<i990> arrayList = this.k;
                arrayList.clear();
                for (int i2 = 0; i2 < i; i2++) {
                    FragmentEntry fragmentEntry = (FragmentEntry) bundle.getParcelable("fragment" + i2);
                    if (fragmentEntry != null) {
                        FragmentImpl Ab = fragmentEntry.Ab();
                        String string = bundle.getString("fragmentId" + i2, "");
                        int i3 = bundle.getInt("fragmentViewId" + i2, -1);
                        Image image = (Image) bundle.getParcelable("fragmentImage" + i2);
                        String string2 = bundle.getString("fragmentTitle" + i2, "");
                        if (Ab instanceof BaseReactionsTabFragment) {
                            BaseReactionsTabFragment baseReactionsTabFragment = (BaseReactionsTabFragment) Ab;
                            boolean z = this.l;
                            baseReactionsTabFragment.V = z;
                            RecyclerPaginatedView recyclerPaginatedView = baseReactionsTabFragment.T;
                            if (recyclerPaginatedView != null) {
                                recyclerPaginatedView.setSwipeRefreshEnabled(z);
                            }
                        }
                        arrayList.add(new i990(string, Ab, i3, string2, image));
                    }
                }
            }
            notifyDataSetChanged();
        }
    }

    @Override // com.vk.core.fragments.h, androidx.viewpager.widget.PagerAdapter
    public final Parcelable saveState() {
        Parcelable saveState = super.saveState();
        Bundle bundle = saveState != null ? (Bundle) saveState : new Bundle();
        Bundle bundle2 = new Bundle();
        ArrayList<i990> arrayList = this.k;
        bundle2.putInt("count", arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            i990 i990Var = arrayList.get(i);
            FragmentEntry Kn = i990Var.b.Kn();
            if (Kn != null) {
                bundle2.putParcelable("fragment" + i, Kn);
                bundle2.putString("fragmentId" + i, i990Var.a);
                bundle2.putInt("fragmentViewId" + i, i990Var.c);
                bundle2.putParcelable("fragmentImage" + i, i990Var.e);
                bundle2.putString("fragmentTitle" + i, i990Var.d);
            }
        }
        bundle.putBundle("titles", bundle2);
        return bundle;
    }
}
