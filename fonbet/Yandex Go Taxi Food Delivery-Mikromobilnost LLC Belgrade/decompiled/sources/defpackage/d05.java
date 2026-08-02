package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class d05 extends e890 {
    public SparseArray c;
    public final /* synthetic */ x5x0 d;

    public d05(x5x0 x5x0Var) {
        this.d = x5x0Var;
    }

    @Override // defpackage.e890
    public final void a(ViewPager viewPager, int i, Object obj) {
        ViewGroup viewGroup = (ViewGroup) obj;
        x5x0 x5x0Var = this.d;
        h05 h05Var = (h05) x5x0Var.f.remove(viewGroup);
        ViewGroup viewGroup2 = h05Var.d;
        if (viewGroup2 != null) {
            viewGroup2.removeAllViews();
            h05Var.d = null;
        }
        x5x0Var.g.remove(Integer.valueOf(i));
        ydz.a();
        viewPager.removeView(viewGroup);
    }

    @Override // defpackage.e890
    public final int b() {
        r3k0 r3k0Var = this.d.m;
        if (r3k0Var == null) {
            return 0;
        }
        return r3k0Var.c().size();
    }

    @Override // defpackage.e890
    public final int c(Object obj) {
        return -2;
    }

    @Override // defpackage.e890
    public final Object d(ViewPager viewPager, int i) {
        ViewGroup viewGroup;
        ydz.a();
        x5x0 x5x0Var = this.d;
        h05 h05Var = (h05) x5x0Var.g.get(Integer.valueOf(i));
        if (h05Var != null) {
            viewGroup = h05Var.a;
            z83.f(viewGroup.getParent(), null);
        } else {
            viewGroup = (ViewGroup) x5x0Var.a.b(x5x0Var.i);
            h05 h05Var2 = new h05(x5x0Var, viewGroup, (w5x0) x5x0Var.m.c().get(i), i);
            x5x0Var.g.put(Integer.valueOf(i), h05Var2);
            h05Var = h05Var2;
        }
        viewPager.addView(viewGroup);
        x5x0Var.f.put(viewGroup, h05Var);
        if (i == x5x0Var.c.getCurrentItem()) {
            h05Var.a();
        }
        SparseArray<Parcelable> sparseArray = this.c;
        if (sparseArray != null) {
            viewGroup.restoreHierarchyState(sparseArray);
        }
        return viewGroup;
    }

    @Override // defpackage.e890
    public final boolean e(View view, Object obj) {
        return obj == view;
    }

    @Override // defpackage.e890
    public final void h(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            this.c = null;
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        bundle.setClassLoader(d05.class.getClassLoader());
        this.c = bundle.getSparseParcelableArray("div_tabs_child_states");
    }

    @Override // defpackage.e890
    public final Parcelable i() {
        w53 w53Var = this.d.f;
        SparseArray<Parcelable> sparseArray = new SparseArray<>(w53Var.c);
        Iterator it = ((s53) w53Var.keySet()).iterator();
        while (it.hasNext()) {
            ((ViewGroup) it.next()).saveHierarchyState(sparseArray);
        }
        Bundle bundle = new Bundle();
        bundle.putSparseParcelableArray("div_tabs_child_states", sparseArray);
        return bundle;
    }
}
