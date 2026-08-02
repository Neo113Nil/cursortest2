package xsna;

import android.content.Context;
import android.os.Parcelable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import com.vk.clips.viewer.impl.grid.lists.ClipsGridTabData;
import com.vk.clips.viewer.impl.grid.lists.fragments.AbstractClipsGridListFragment;
import com.vk.core.fragments.FragmentImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* compiled from: ClipsGridListsPagerAdapter.kt */
/* loaded from: classes17.dex */
public final class tde extends com.vk.core.fragments.h {
    public List<? extends Pair<? extends ClipsGridTabData, ? extends gzs<? extends FragmentImpl>>> k;
    public final gcd0 l;
    public boolean m;
    public Integer n;
    public boolean o;

    /* compiled from: ClipsGridListsPagerAdapter.kt */
    public static final class a implements FragmentImpl.c {
        public final /* synthetic */ FragmentImpl a;
        public final /* synthetic */ tde b;

        public a(FragmentImpl fragmentImpl, tde tdeVar) {
            this.a = fragmentImpl;
            this.b = tdeVar;
        }

        @Override // com.vk.core.fragments.FragmentImpl.c
        public final void d() {
            ((AbstractClipsGridListFragment) this.a).oo(this.b.m);
        }
    }

    public tde(List<? extends Pair<? extends ClipsGridTabData, ? extends gzs<? extends FragmentImpl>>> list, vbs vbsVar, gcd0 gcd0Var) {
        super(vbsVar, false);
        this.k = list;
        this.l = gcd0Var;
    }

    @Override // com.vk.core.fragments.h
    public final FragmentImpl c(int i) {
        FragmentImpl invoke = this.k.get(i).j().invoke();
        AbstractClipsGridListFragment abstractClipsGridListFragment = invoke instanceof AbstractClipsGridListFragment ? (AbstractClipsGridListFragment) invoke : null;
        if (abstractClipsGridListFragment != null) {
            a aVar = new a(invoke, this);
            if (abstractClipsGridListFragment.getView() != null) {
                aVar.d();
                return invoke;
            }
            abstractClipsGridListFragment.E = aVar;
        }
        return invoke;
    }

    public final FragmentImpl g() {
        Integer num = this.n;
        if (num != null) {
            return (FragmentImpl) j5g.b0(num.intValue(), this.i);
        }
        return null;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.k.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getItemPosition(Object obj) {
        if (!(obj instanceof AbstractClipsGridListFragment)) {
            return -2;
        }
        Iterator<? extends Pair<? extends ClipsGridTabData, ? extends gzs<? extends FragmentImpl>>> it = this.k.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (it.next().i() == ((AbstractClipsGridListFragment) obj).S) {
                break;
            }
            i++;
        }
        Integer valueOf = Integer.valueOf(i);
        if (valueOf.intValue() < 0) {
            valueOf = null;
        }
        return this.i.indexOf(obj) == (valueOf != null ? valueOf.intValue() : -2) ? -1 : -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence getPageTitle(int i) {
        ClipsGridTabData i2 = this.k.get(i).i();
        this.l.getClass();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ylw ylwVar = new ylw(i2.h());
        ylwVar.c = 2;
        ylwVar.e = 1.0f;
        ylwVar.d = true;
        int y = (int) iah0.y(20);
        ylwVar.a = y;
        ylwVar.b = y;
        ylwVar.f = 0;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        Spannable b = ylwVar.b(context);
        spannableStringBuilder.append((CharSequence) rik0.b(8.0f));
        spannableStringBuilder.append((CharSequence) b);
        spannableStringBuilder.append((CharSequence) rik0.b(6.0f));
        Context context2 = e43.a;
        spannableStringBuilder.append((CharSequence) (context2 != null ? context2 : null).getString(i2.i()));
        spannableStringBuilder.append((CharSequence) rik0.b(8.0f));
        return spannableStringBuilder;
    }

    public final AbstractClipsGridListFragment h(int i) {
        Object b0 = j5g.b0(i, this.i);
        if (b0 instanceof AbstractClipsGridListFragment) {
            return (AbstractClipsGridListFragment) b0;
        }
        return null;
    }

    public final List<Pair<ClipsGridTabData, gzs<FragmentImpl>>> j() {
        return this.k;
    }

    public final void k(List<? extends Pair<? extends ClipsGridTabData, ? extends gzs<? extends FragmentImpl>>> list) {
        this.k = list;
    }

    public final void l(boolean z) {
        this.m = z;
        int size = this.k.size();
        for (int i = 0; i < size; i++) {
            AbstractClipsGridListFragment h = h(i);
            if (h != null) {
                h.oo(z);
            }
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        if (this.o) {
            ArrayList<FragmentImpl> arrayList = this.i;
            int i = 0;
            for (Object obj : j5g.O0(arrayList)) {
                int i2 = i + 1;
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                FragmentImpl fragmentImpl = (FragmentImpl) obj;
                AbstractClipsGridListFragment abstractClipsGridListFragment = fragmentImpl instanceof AbstractClipsGridListFragment ? (AbstractClipsGridListFragment) fragmentImpl : null;
                ClipsGridTabData clipsGridTabData = abstractClipsGridListFragment != null ? abstractClipsGridListFragment.S : null;
                Pair pair = (Pair) j5g.b0(i, this.k);
                if (clipsGridTabData != (pair != null ? (ClipsGridTabData) pair.i() : null)) {
                    arrayList.set(i, null);
                }
                i = i2;
            }
            this.o = false;
        }
    }

    @Override // com.vk.core.fragments.h, androidx.viewpager.widget.PagerAdapter
    public final void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        super.restoreState(parcelable, classLoader);
        this.o = true;
    }

    @Override // com.vk.core.fragments.h, xsna.s1q0, androidx.viewpager.widget.PagerAdapter
    public final void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        this.n = Integer.valueOf(i);
        super.setPrimaryItem(viewGroup, i, obj);
    }
}
