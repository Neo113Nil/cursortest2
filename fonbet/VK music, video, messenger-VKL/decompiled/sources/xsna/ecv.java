package xsna;

import android.R;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import com.vk.core.fragments.FragmentEntry;
import com.vk.core.fragments.FragmentImpl;
import com.vkontakte.android.data.b;
import java.util.ArrayList;
import java.util.List;
import ru.ok.android.utils.Logger;

/* compiled from: HomeTabAdapter2.kt */
/* loaded from: classes4.dex */
public final class ecv extends com.vk.core.fragments.h {
    public final vbs k;
    public final a l;
    public FragmentImpl m;
    public int n;
    public final ArrayList<FragmentImpl> o;
    public Object p;
    public Object q;
    public ue7 r;
    public int s;

    /* compiled from: HomeTabAdapter2.kt */
    public interface a {
        String a(int i);

        void d(Bundle bundle);

        String e(int i);

        Bundle r();
    }

    public ecv(vbs vbsVar, a aVar) {
        super(vbsVar, true);
        this.k = vbsVar;
        this.l = aVar;
        this.n = -1;
        this.o = new ArrayList<>();
        this.s = -1;
    }

    @Override // com.vk.core.fragments.h
    public final FragmentImpl c(int i) {
        return this.o.get(i);
    }

    @Override // com.vk.core.fragments.h, xsna.s1q0, androidx.viewpager.widget.PagerAdapter
    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (i == 0 || i == 2) {
            return;
        }
        super.destroyItem(viewGroup, i, obj);
    }

    public final void g(List<? extends FragmentImpl> list) {
        ArrayList<FragmentImpl> arrayList = this.o;
        if (!arrayList.isEmpty()) {
            arrayList.subList(1, arrayList.size()).clear();
        }
        arrayList.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.o.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence getPageTitle(int i) {
        return this.l.a(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0033, code lost:
    
        if (r2 != null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(TabLayout.g gVar, final int i) {
        TextView textView;
        Drawable drawable;
        View view = gVar.f;
        if (view == null || (textView = (TextView) view.findViewById(R.id.text1)) == null) {
            return;
        }
        if (i != 0) {
            drawable = (i == 1 && g620.o != 0) ? dhr0.t.a(com.vkontakte.android.R.drawable.newsfeed_united_tab_dot_14) : null;
        } else {
            if (this.s == dhr0.C().c) {
                ue7 ue7Var = this.r;
                drawable = ue7Var;
            }
            abg0 abg0Var = dhr0.t;
            ue7 ue7Var2 = new ue7(abg0Var.a(com.vkontakte.android.R.drawable.vk_icon_dropdown_16), abg0Var.c(com.vkontakte.android.R.attr.vk_ui_text_secondary), abg0Var.c(com.vkontakte.android.R.attr.vk_ui_text_accent));
            this.r = ue7Var2;
            this.s = dhr0.C().c;
            drawable = ue7Var2;
        }
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        String a2 = this.l.a(i);
        if (!epx.f(gVar.c, a2)) {
            gVar.q(a2);
        }
        final TabLayout tabLayout = gVar.g;
        View b = usn0.b(tabLayout, i);
        if (b != null) {
            b.setOnClickListener(new View.OnClickListener() { // from class: xsna.dcv
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    TabLayout tabLayout2 = TabLayout.this;
                    if (tabLayout2 != null) {
                        this.n(i, tabLayout2.getSelectedTabPosition(), "tap");
                    }
                }
            });
        }
    }

    @Override // com.vk.core.fragments.h, androidx.viewpager.widget.PagerAdapter
    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        if (i == 0) {
            Object obj = this.p;
            if (obj == null) {
                obj = super.instantiateItem(viewGroup, i);
            }
            this.p = obj;
            return obj;
        }
        if (i != 2) {
            return super.instantiateItem(viewGroup, i);
        }
        Object obj2 = this.q;
        if (obj2 == null) {
            obj2 = super.instantiateItem(viewGroup, i);
        }
        this.q = obj2;
        return obj2;
    }

    public final void j(ViewGroup viewGroup) {
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
        this.q = null;
        this.m = null;
    }

    public final FragmentImpl k(int i) {
        return (FragmentImpl) j5g.b0(i, this.o);
    }

    public final void l() {
        ArrayList<FragmentImpl> arrayList = this.o;
        if (!arrayList.isEmpty()) {
            FragmentImpl fragmentImpl = arrayList.get(0);
            arrayList.clear();
            arrayList.add(fragmentImpl);
        }
        notifyDataSetChanged();
    }

    public final void m(List<? extends FragmentImpl> list) {
        ArrayList<FragmentImpl> arrayList = this.o;
        arrayList.clear();
        arrayList.addAll(list);
        notifyDataSetChanged();
    }

    public final void n(int i, int i2, String str) {
        if (i == i2 || i == 0) {
            return;
        }
        if (i2 != 0) {
            String str2 = com.vk.newsfeed.common.util.k.a;
            com.vk.newsfeed.common.util.k.d(i2, i, str, this.l.e(i2), this.l.e(i));
            return;
        }
        if (1 == com.vk.newsfeed.common.util.k.c) {
            return;
        }
        boolean z = g620.o != 0;
        com.vk.newsfeed.common.util.k.c = 1;
        b.d dVar = new b.d("discover_action");
        dVar.b("open", "action");
        dVar.b("discover_categories", "type");
        dVar.b(str, "opening_kind");
        dVar.b(Boolean.valueOf(z), "highlighted");
        dVar.b("discover", "ref");
        dVar.e();
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
                ((pds) fragmentImpl).i5(new tbg(fragmentImpl, 24));
            }
        }
        n(i, i2, "swipe");
    }
}
