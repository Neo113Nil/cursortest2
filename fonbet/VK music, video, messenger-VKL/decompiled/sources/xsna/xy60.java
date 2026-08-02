package xsna;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.ViewGroup;
import com.vk.core.fragments.FragmentEntry;
import com.vk.core.fragments.FragmentImpl;
import java.util.ArrayList;
import ru.ok.android.utils.Logger;

/* compiled from: NewsfeedSectionAdapter.kt */
/* loaded from: classes4.dex */
public final class xy60 extends com.vk.core.fragments.h {
    public final vbs k;
    public final a l;
    public FragmentImpl m;
    public int n;
    public final ArrayList<FragmentImpl> o;
    public Object p;

    /* compiled from: NewsfeedSectionAdapter.kt */
    public interface a {
        String a(int i);

        void d(Bundle bundle);

        Bundle r();
    }

    public xy60(vbs vbsVar, a aVar) {
        super(vbsVar, true);
        this.k = vbsVar;
        this.l = aVar;
        this.n = -1;
        this.o = new ArrayList<>();
    }

    @Override // com.vk.core.fragments.h
    public final FragmentImpl c(int i) {
        return this.o.get(i);
    }

    @Override // com.vk.core.fragments.h, xsna.s1q0, androidx.viewpager.widget.PagerAdapter
    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (i != 0) {
            super.destroyItem(viewGroup, i, obj);
        }
    }

    public final void g(ViewGroup viewGroup) {
        ArrayList<FragmentImpl> arrayList = this.o;
        FragmentImpl fragmentImpl = (FragmentImpl) j5g.a0(arrayList);
        if (fragmentImpl != null && viewGroup != null) {
            this.k.q().b(fragmentImpl);
            if (!this.i.isEmpty()) {
                super.destroyItem(viewGroup, 0, (Object) fragmentImpl);
            }
            finishUpdate(viewGroup);
        }
        this.b = null;
        this.j = null;
        arrayList.clear();
        notifyDataSetChanged();
        this.p = null;
        this.m = null;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.o.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence getPageTitle(int i) {
        return this.l.a(i);
    }

    @Override // com.vk.core.fragments.h, androidx.viewpager.widget.PagerAdapter
    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        if (i != 0) {
            return super.instantiateItem(viewGroup, i);
        }
        Object obj = this.p;
        if (obj == null) {
            obj = super.instantiateItem(viewGroup, i);
        }
        this.p = obj;
        return obj;
    }

    @Override // com.vk.core.fragments.h, androidx.viewpager.widget.PagerAdapter
    public final void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        super.restoreState(parcelable, classLoader);
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.l.d(bundle.getBundle("titles"));
            ArrayList<FragmentImpl> arrayList = this.o;
            arrayList.clear();
            int i = bundle.getInt("count");
            for (int i2 = 0; i2 < i; i2++) {
                FragmentImpl b = b(i2);
                if (b == null) {
                    FragmentEntry fragmentEntry = (FragmentEntry) bundle.getParcelable(Logger.METHOD_E + i2);
                    b = fragmentEntry != null ? fragmentEntry.Ab() : null;
                }
                if (b != null) {
                    arrayList.add(b);
                }
            }
            notifyDataSetChanged();
        }
    }

    @Override // com.vk.core.fragments.h, androidx.viewpager.widget.PagerAdapter
    public final Parcelable saveState() {
        Parcelable saveState = super.saveState();
        Bundle bundle = saveState != null ? (Bundle) saveState : new Bundle();
        ArrayList<FragmentImpl> arrayList = this.o;
        bundle.putInt("count", arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            FragmentEntry Kn = arrayList.get(i).Kn();
            if (Kn != null) {
                bundle.putParcelable(Logger.METHOD_E + i, Kn);
            }
        }
        bundle.putBundle("titles", this.l.r());
        return bundle;
    }

    @Override // com.vk.core.fragments.h, xsna.s1q0, androidx.viewpager.widget.PagerAdapter
    public final void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        super.setPrimaryItem(viewGroup, i, obj);
        int i2 = this.n;
        androidx.lifecycle.f fVar = this.m;
        FragmentImpl fragmentImpl = obj instanceof FragmentImpl ? (FragmentImpl) obj : null;
        this.m = fragmentImpl;
        this.n = i;
        if (i2 != i) {
            if (fVar instanceof pds) {
                ((pds) fVar).J0();
            }
            if (fragmentImpl instanceof pds) {
                ((pds) fragmentImpl).i5(new v3n(fragmentImpl, 28));
            }
        }
    }
}
