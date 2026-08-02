package xsna;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.search.BaseVkSearchView;
import com.vk.core.view.components.search.VkSearchView;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: SearchDatabaseViewController.kt */
/* loaded from: classes5.dex */
public final class bqh0 {
    public final View a;
    public final gph0 b;
    public final VkSearchView c;
    public final RecyclerView d;
    public final View e;
    public final View f;
    public final View g;
    public final Guideline h;
    public View i;
    public final List<View> j;
    public final Rect k;
    public int l;
    public boolean m;

    /* compiled from: SearchDatabaseViewController.kt */
    public static final class a extends RecyclerView.t {
        public final ac b;
        public int c = -1;

        public a(ac acVar) {
            this.b = acVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            int x;
            RecyclerView.o layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager == null || this.c == (x = linearLayoutManager.x())) {
                return;
            }
            this.c = x;
            if (x > linearLayoutManager.getItemCount() - 10) {
                this.b.invoke();
            }
        }
    }

    public bqh0(View view, gph0 gph0Var, vph0 vph0Var, e5 e5Var, ac acVar, f5 f5Var) {
        this.a = view;
        this.b = gph0Var;
        VkSearchView vkSearchView = (VkSearchView) view.findViewById(R.id.search_params_search_view);
        this.c = vkSearchView;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.search_params_items);
        this.d = recyclerView;
        View findViewById = view.findViewById(R.id.search_params_empty_placeholder);
        this.e = findViewById;
        View findViewById2 = view.findViewById(R.id.search_params_error_placeholder);
        this.f = findViewById2;
        View findViewById3 = view.findViewById(R.id.search_params_loading_placeholder);
        this.g = findViewById3;
        this.h = (Guideline) view.findViewById(R.id.search_params_dynamic_height_guideline);
        this.j = e43.l(recyclerView, findViewById, findViewById2, findViewById3);
        this.k = new Rect();
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        recyclerView.setAdapter(gph0Var);
        recyclerView.addOnScrollListener(new a(acVar));
        float f = 16;
        float f2 = 4;
        recyclerView.addItemDecoration(new ddv(R.attr.vk_ui_separator_primary, iah0.a(1), iah0.a(f), iah0.a(f2), iah0.a(f), iah0.a(f2), new cqh0(this), new dqh0()));
        vkSearchView.getEditView().addTextChangedListener(new eqh0(this, e5Var));
        vkSearchView.X4(false);
        int a2 = iah0.a(f) - vkSearchView.getSelfMargin();
        BaseVkSearchView.d5(vkSearchView, a2, a2, 10);
        vkSearchView.setHint(vph0Var.b);
        view.findViewById(R.id.search_params_retry_button).setOnClickListener(new qa6(f5Var, 8));
        view.addOnLayoutChangeListener(new s390(this, 1));
    }

    public final void a() {
        View view = this.a;
        if (view.isInLayout()) {
            if (this.l != view.getHeight()) {
                this.l = view.getHeight();
                view.post(new nu4(this, 9));
                return;
            }
            return;
        }
        this.l = view.getHeight();
        View view2 = this.i;
        VkSearchView vkSearchView = this.c;
        if (view2 != null) {
            int height = view2.getHeight() + vkSearchView.getBottom();
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            int i = height + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            r3 = (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0) + i;
        }
        view.getGlobalVisibleRect(this.k);
        this.h.setGuidelinePercent(Math.max(r1.height(), Math.max(r3, (view.getHeight() - vkSearchView.getBottom()) / 2)) / view.getHeight());
    }

    public final void b(View view) {
        if (view == this.i) {
            return;
        }
        for (View view2 : this.j) {
            int i = 0;
            if (!(view2 == view)) {
                i = 8;
            }
            view2.setVisibility(i);
        }
        this.i = view;
        a();
    }
}
