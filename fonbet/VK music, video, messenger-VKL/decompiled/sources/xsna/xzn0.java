package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.vk.stickers.keyboard.StickersView;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TabsShower.kt */
/* loaded from: classes6.dex */
public final class xzn0 extends RecyclerView.t implements ViewPager.j {
    public final StickersView.a b;
    public final ViewGroup c;
    public final View d;
    public final RecyclerView e;
    public final ral0 f;
    public final com.vk.stickers.keyboard.navigation.a g;
    public final ArrayList h;
    public final cck0 i;
    public boolean j = true;
    public final int k = iah0.a(2);
    public boolean l;
    public boolean m;

    /* compiled from: TabsShower.kt */
    public static final class a implements ViewTreeObserver.OnPreDrawListener {
        public final /* synthetic */ boolean c;

        public a(boolean z) {
            this.c = z;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            xzn0 xzn0Var = xzn0.this;
            ViewTreeObserver viewTreeObserver = xzn0Var.c.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
            xzn0Var.l(this.c, true);
            return true;
        }
    }

    public xzn0(StickersView.a aVar, FrameLayout frameLayout, View view, RecyclerView recyclerView, ral0 ral0Var, com.vk.stickers.keyboard.navigation.a aVar2, ArrayList arrayList, cck0 cck0Var) {
        this.b = aVar;
        this.c = frameLayout;
        this.d = view;
        this.e = recyclerView;
        this.f = ral0Var;
        this.g = aVar2;
        this.h = arrayList;
        this.i = cck0Var;
    }

    public final void l(boolean z, boolean z2) {
        if (this.j != z || z2) {
            this.j = z;
            ViewGroup viewGroup = this.c;
            int height = viewGroup.getHeight();
            if (height == 0 && !z2) {
                ViewTreeObserver viewTreeObserver = viewGroup.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnPreDrawListener(new a(z));
                    return;
                }
            }
            if (z) {
                height = 0;
            }
            if (((Number) this.i.invoke()).intValue() == 48) {
                height *= -1;
            }
            viewGroup.animate().setInterpolator(StickersView.O).setDuration(200L).translationY(height);
            Iterator it = this.h.iterator();
            while (it.hasNext()) {
                ((wdl0) it.next()).b(z);
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageScrollStateChanged(int i) {
        sal0 sal0Var;
        if (i == 0 && this.b.getCurrentItem() > 0 && (sal0Var = this.f.c) != null) {
            sal0Var.a();
        }
        if (i == 1) {
            this.m = true;
        }
        this.l = false;
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageScrolled(int i, float f, int i2) {
        if (this.m && !this.l && i2 == 0) {
            this.l = true;
            this.m = false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageSelected(int i) {
        Object obj;
        l(true, true);
        wdl0 wdl0Var = (wdl0) this.h.get(i);
        boolean z = wdl0Var instanceof e4l0;
        RecyclerView recyclerView = this.e;
        View view = this.d;
        com.vk.stickers.keyboard.navigation.a aVar = this.g;
        if (z) {
            aVar.N0();
            view.setVisibility(0);
            recyclerView.setPadding(0, 0, iah0.a(48), 0);
            if (this.m) {
                this.m = false;
                return;
            }
            return;
        }
        if (wdl0Var instanceof xdl0) {
            view.setVisibility(8);
            recyclerView.setPadding(0, 0, 0, 0);
            com.vk.stickers.keyboard.navigation.a.O0(aVar, -4);
            return;
        }
        if (wdl0Var instanceof w7l0) {
            view.setVisibility(8);
            recyclerView.setPadding(0, 0, 0, 0);
            com.vk.stickers.keyboard.navigation.a.O0(aVar, -6);
            return;
        }
        if (wdl0Var instanceof ral0) {
            int i2 = aVar.l;
            if (i2 == -4) {
                Iterator<T> it = aVar.h.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    hfz hfzVar = (hfz) obj;
                    if ((hfzVar instanceof jgy) && ((jgy) hfzVar).getId() == -4) {
                        break;
                    }
                }
                jgy jgyVar = (jgy) (obj instanceof jgy ? obj : null);
                i2 = -1;
                if (jgyVar != null) {
                    Iterator<? extends hfz> it2 = aVar.h.iterator();
                    int i3 = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            i3 = -1;
                            break;
                        }
                        hfz next = it2.next();
                        if ((next instanceof jgy) && next.equals(jgyVar)) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    if (i3 >= 0) {
                        hfz hfzVar2 = aVar.h.get(i3);
                        if (hfzVar2 instanceof jgy) {
                            ArrayList arrayList = new ArrayList(aVar.h);
                            arrayList.set(i3, ((jgy) hfzVar2).a(false));
                            aVar.setItems(arrayList);
                        }
                    }
                }
                if (aVar.m) {
                    i2 = -3;
                }
            }
            aVar.L0(i2, false);
            aVar.P0(i2);
            view.setVisibility(8);
            recyclerView.setPadding(0, 0, 0, 0);
            if (this.m) {
                this.m = false;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        if (Math.abs(i2) > this.k || (i2 > 0 && ((Number) this.i.invoke()).intValue() == 48)) {
            l(i2 < 0, false);
        } else if (i2 == 0 && recyclerView.computeVerticalScrollOffset() == 0) {
            l(true, false);
        }
    }
}
