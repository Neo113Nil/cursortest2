package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.tabs.a;
import com.yandex.div.core.view2.divs.widgets.ReleaseUtils$releaseAndRemoveChildren$$inlined$executeOnMainThreadBlocking$1;
import com.yandex.div.internal.widget.tabs.ScrollableViewPager;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class e05 extends e890 {
    public SparseArray c;
    public final /* synthetic */ a d;

    public e05(a aVar) {
        this.d = aVar;
    }

    @Override // defpackage.e890
    public final void a(ViewPager viewPager, int i, Object obj) {
        a aVar = this.d;
        if (ffx.W(aVar.d)) {
            i = (b() - i) - 1;
        }
        ViewGroup viewGroup = (ViewGroup) obj;
        i05 i05Var = (i05) aVar.g.remove(viewGroup);
        ViewGroup viewGroup2 = i05Var.d;
        if (viewGroup2 != null) {
            a aVar2 = i05Var.e;
            aVar2.x.remove(viewGroup2);
            Div2View div2View = aVar2.q.a;
            ngd0.G.p();
            if (fu11.a.a()) {
                int i2 = 0;
                while (i2 < viewGroup2.getChildCount()) {
                    int i3 = i2 + 1;
                    View childAt = viewGroup2.getChildAt(i2);
                    if (childAt == null) {
                        ny61.s();
                        return;
                    } else {
                        wwg.Y(div2View.getReleaseViewVisitor$div_release(), childAt);
                        i2 = i3;
                    }
                }
                viewGroup2.removeAllViews();
            } else {
                sjh sjhVar = uyj.a;
                tje.Y(o400.a, new ReleaseUtils$releaseAndRemoveChildren$$inlined$executeOnMainThreadBlocking$1(null, viewGroup2, div2View));
            }
            i05Var.d = null;
        }
        aVar.h.remove(Integer.valueOf(i));
        viewPager.removeView(viewGroup);
    }

    @Override // defpackage.e890
    public final int b() {
        j05 j05Var = this.d.m;
        if (j05Var == null) {
            return 0;
        }
        return j05Var.c().size();
    }

    @Override // defpackage.e890
    public final int c(Object obj) {
        return -2;
    }

    @Override // defpackage.e890
    public final Object d(ViewPager viewPager, int i) {
        ViewGroup viewGroup;
        a aVar = this.d;
        ScrollableViewPager scrollableViewPager = aVar.d;
        if (ffx.W(scrollableViewPager)) {
            i = (b() - i) - 1;
        }
        i05 i05Var = (i05) aVar.h.get(Integer.valueOf(i));
        if (i05Var != null) {
            viewGroup = i05Var.a;
            viewGroup.getParent();
        } else {
            viewGroup = (ViewGroup) aVar.a.b(aVar.i);
            i05 i05Var2 = new i05(aVar, viewGroup, (g9l) aVar.m.c().get(i), i);
            aVar.h.put(Integer.valueOf(i), i05Var2);
            i05Var = i05Var2;
        }
        viewPager.addView(viewGroup);
        aVar.g.put(viewGroup, i05Var);
        if (i == scrollableViewPager.getCurrentItem()) {
            i05Var.a();
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
        bundle.setClassLoader(e05.class.getClassLoader());
        this.c = bundle.getSparseParcelableArray("div_tabs_child_states");
    }

    @Override // defpackage.e890
    public final Parcelable i() {
        w53 w53Var = this.d.g;
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
