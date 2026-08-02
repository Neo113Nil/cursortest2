package xsna;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* compiled from: ViewPager2ViewHeightCorrector.kt */
/* loaded from: classes6.dex */
public final class hzt0 extends ViewPager2.g {
    public final ViewPager2 d;

    public hzt0(ViewPager2 viewPager2) {
        this.d = viewPager2;
        if (viewPager2.isAttachedToWindow()) {
            viewPager2.b(this);
        } else {
            viewPager2.addOnAttachStateChangeListener(new a(viewPager2, this));
        }
        if (viewPager2.isAttachedToWindow()) {
            viewPager2.addOnAttachStateChangeListener(new b(viewPager2, this));
        } else {
            viewPager2.g(this);
        }
    }

    public final LinearLayoutManager a() {
        View childAt = this.d.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        RecyclerView.o layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        if (layoutManager instanceof LinearLayoutManager) {
            return (LinearLayoutManager) layoutManager;
        }
        return null;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void onPageScrollStateChanged(int i) {
        if (i != 0) {
            return;
        }
        LinearLayoutManager a2 = a();
        int v = a2 != null ? a2.v() : -1;
        if (v != -1) {
            onPageSelected(v);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void onPageSelected(int i) {
        this.d.post(new q6q(this, i, 1));
    }

    /* compiled from: View.kt */
    public static final class a implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View b;
        public final /* synthetic */ hzt0 c;

        public a(ViewPager2 viewPager2, hzt0 hzt0Var) {
            this.b = viewPager2;
            this.c = hzt0Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            this.b.removeOnAttachStateChangeListener(this);
            hzt0 hzt0Var = this.c;
            hzt0Var.d.b(hzt0Var);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    /* compiled from: View.kt */
    public static final class b implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View b;
        public final /* synthetic */ hzt0 c;

        public b(ViewPager2 viewPager2, hzt0 hzt0Var) {
            this.b = viewPager2;
            this.c = hzt0Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            this.b.removeOnAttachStateChangeListener(this);
            hzt0 hzt0Var = this.c;
            hzt0Var.d.g(hzt0Var);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }
}
