package xsna;

import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.vk.core.view.components.counter.VkCounter;
import com.vk.core.view.components.tabs.VkTabs;
import com.vk.core.view.components.tabs.c;
import com.vk.core.view.components.tabs.e;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: GoodReviewsAndCommentsViewHolder.kt */
/* loaded from: classes18.dex */
public final class f8u extends vif0<q310> {
    public final a8u n;
    public final p310 o;
    public final a p;
    public final bpn0 q;
    public final ViewPager2 r;
    public final com.vk.core.view.components.tabs.e s;

    /* compiled from: GoodReviewsAndCommentsViewHolder.kt */
    public final class a extends ViewPager2.g {
        public a() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void onPageScrolled(int i, float f, int i2) {
            ((ivd0) f8u.this.q.getValue()).a(f, i);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void onPageSelected(int i) {
            f8u.this.q6();
        }
    }

    public f8u(ViewGroup viewGroup, e4u e4uVar, i780 i780Var, h780 h780Var, a4u a4uVar, a8u a8uVar, cr20 cr20Var) {
        super(viewGroup, R.layout.good_comments_and_reviews_view, 0);
        this.n = a8uVar;
        this.p = new a();
        this.q = new bpn0(new m1o(this, 8));
        ViewPager2 viewPager2 = (ViewPager2) this.itemView.findViewById(R.id.vp_content);
        this.r = viewPager2;
        this.s = new com.vk.core.view.components.tabs.e((VkTabs) this.itemView.findViewById(R.id.product_card_reviews_comments_tabs), viewPager2, false, new e.d() { // from class: xsna.d8u
            @Override // com.vk.core.view.components.tabs.e.d
            public final void a(VkTabs.c cVar, int i) {
                c8u c8uVar;
                com.vk.core.view.components.tabs.d dVar = cVar.a;
                f8u f8uVar = f8u.this;
                p310 p310Var = f8uVar.o;
                if (p310Var == null || (c8uVar = p310Var.getCurrentList().get(i)) == null) {
                    return;
                }
                dVar.Y4(f8uVar.itemView.getContext().getString(c8uVar.a), null);
                int i2 = c8uVar instanceof h8u ? ((h8u) c8uVar).h : c8uVar instanceof i010 ? ((i010) c8uVar).d : 0;
                if (i2 > 0) {
                    dVar.setCounterAppearance(VkCounter.CounterAppearance.Appearance.Neutral);
                    dVar.setCounterMode(VkCounter.Mode.Tertiary);
                    dVar.setIndicator(new c.b(i2));
                }
            }
        });
        this.o = new p310(e4uVar, i780Var, h780Var, a4uVar, a8uVar, cr20Var);
        a4uVar.g = new btm(this, 10);
        viewPager2.setOffscreenPageLimit(1);
        viewPager2.setAdapter(this.o);
        this.itemView.addOnAttachStateChangeListener(new e8u(this));
    }

    @Override // xsna.vif0
    public final void i6(q310 q310Var) {
        List<c8u> list = q310Var.a;
        p310 p310Var = this.o;
        if (p310Var != null) {
            p310Var.submitList(list);
        }
        q6();
    }

    public final void q6() {
        this.itemView.postDelayed(new z27(this, 5), 300L);
    }
}
