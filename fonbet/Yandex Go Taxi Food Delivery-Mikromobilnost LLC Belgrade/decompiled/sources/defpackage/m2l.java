package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import defpackage.m2l;
import java.util.List;

/* loaded from: classes.dex */
public final class m2l extends ViewPager2.a {
    public final List a;
    public final aw5 b;
    public final RecyclerView c;
    public final DivPagerView w;
    public int x = -1;
    public final Div2View y;
    public int z;

    public m2l(t1l t1lVar, u1l u1lVar, aw5 aw5Var, RecyclerView recyclerView, DivPagerView divPagerView) {
        this.a = u1lVar;
        this.b = aw5Var;
        this.c = recyclerView;
        this.w = divPagerView;
        Div2View div2View = aw5Var.a;
        this.y = div2View;
        div2View.getConfig().getClass();
    }

    public final void a() {
        int i = 0;
        while (true) {
            RecyclerView recyclerView = this.c;
            if (!(i < recyclerView.getChildCount())) {
                return;
            }
            int i2 = i + 1;
            View childAt = recyclerView.getChildAt(i);
            if (childAt == null) {
                ny61.s();
                return;
            }
            int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
            if (childAdapterPosition == -1) {
                return;
            }
            cxk cxkVar = (cxk) this.a.get(childAdapterPosition);
            this.y.getDiv2Component().G().h(this.b.a(cxkVar.b), childAt, cxkVar.a);
            i = i2;
        }
    }

    public final void b() {
        RecyclerView recyclerView = this.c;
        h8 h8Var = new h8(3, recyclerView);
        int i = 0;
        while (h8Var.hasNext()) {
            h8Var.next();
            i++;
            if (i < 0) {
                scc.l();
                throw null;
            }
        }
        if (i > 0) {
            a();
        } else if (!ffx.V(recyclerView) || recyclerView.isLayoutRequested()) {
            recyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerPageChangeCallback$trackVisibleViews$$inlined$doOnActualLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    m2l.this.a();
                }
            });
        } else {
            a();
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.a
    public final void onPageScrollStateChanged(int i) {
        super.onPageScrollStateChanged(i);
        if (i == 0) {
            b();
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.a
    public final void onPageScrolled(int i, float f, int i2) {
        super.onPageScrolled(i, f, i2);
        RecyclerView.e layoutManager = this.c.getLayoutManager();
        int i3 = (layoutManager != null ? layoutManager.H : 0) / 20;
        int i4 = this.z + i2;
        this.z = i4;
        if (i4 > i3) {
            this.z = 0;
            b();
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.a
    public final void onPageSelected(int i) {
        super.onPageSelected(i);
        b();
        int i2 = this.x;
        if (i == i2) {
            return;
        }
        DivPagerView divPagerView = this.w;
        Div2View div2View = this.y;
        if (i2 != -1) {
            div2View.unbindViewFromDiv$div_release(divPagerView);
        }
        if (i == -1) {
            this.x = i;
            return;
        }
        int i3 = this.x;
        List list = this.a;
        if (i3 != -1) {
            div2View.getDiv2Component().h();
            rvo rvoVar = ((cxk) list.get(i)).b;
        }
        m3k m3kVar = ((cxk) list.get(i)).a;
        if (uml.g(m3kVar.d())) {
            div2View.bindViewToDiv$div_release(divPagerView, m3kVar);
        }
        this.x = i;
    }
}
