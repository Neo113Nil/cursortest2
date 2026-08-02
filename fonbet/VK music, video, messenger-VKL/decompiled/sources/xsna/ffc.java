package xsna;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.search.BaseVkSearchView;
import com.vk.core.view.components.search.VkSearchView;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: CityParameterViewController.kt */
/* loaded from: classes5.dex */
public final class ffc {
    public final View a;
    public final VkSearchView b;
    public final RecyclerView c;
    public final View d;
    public final View e;
    public final View f;
    public final Guideline g;
    public View h;
    public final List<View> i;
    public final Rect j;
    public int k;
    public final qec l;
    public boolean m;

    public ffc(View view, l5 l5Var, po1 po1Var, com.vk.movika.sdk.base.presenter.b bVar) {
        this.a = view;
        VkSearchView vkSearchView = (VkSearchView) view.findViewById(R.id.search_params_search_view);
        this.b = vkSearchView;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.search_params_items);
        this.c = recyclerView;
        View findViewById = view.findViewById(R.id.search_params_empty_placeholder);
        this.d = findViewById;
        View findViewById2 = view.findViewById(R.id.search_params_error_placeholder);
        this.e = findViewById2;
        View findViewById3 = view.findViewById(R.id.search_params_loading_placeholder);
        this.f = findViewById3;
        this.g = (Guideline) view.findViewById(R.id.search_params_dynamic_height_guideline);
        this.i = e43.l(recyclerView, findViewById, findViewById2, findViewById3);
        this.j = new Rect();
        qec qecVar = new qec(po1Var);
        this.l = qecVar;
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        recyclerView.setAdapter(qecVar);
        vkSearchView.getEditView().addTextChangedListener(new efc(this, l5Var));
        vkSearchView.X4(false);
        int a = iah0.a(16) - vkSearchView.getSelfMargin();
        BaseVkSearchView.d5(vkSearchView, a, a, 10);
        orl.a(vkSearchView);
        view.findViewById(R.id.search_params_retry_button).setOnClickListener(new en9(bVar, 1));
        view.addOnLayoutChangeListener(new dfc(this, 0));
    }

    public final void a() {
        View view = this.a;
        if (view.isInLayout()) {
            if (this.k != view.getHeight()) {
                this.k = view.getHeight();
                view.post(new oo6(this, 1));
                return;
            }
            return;
        }
        this.k = view.getHeight();
        View view2 = this.h;
        VkSearchView vkSearchView = this.b;
        if (view2 != null) {
            int height = view2.getHeight() + vkSearchView.getBottom();
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            int i = height + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            r3 = (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0) + i;
        }
        view.getGlobalVisibleRect(this.j);
        this.g.setGuidelinePercent(Math.max(r1.height(), Math.max(r3, (view.getHeight() - vkSearchView.getBottom()) / 2)) / view.getHeight());
    }

    public final void b(View view) {
        if (view == this.h) {
            return;
        }
        for (View view2 : this.i) {
            int i = 0;
            if (!(view2 == view)) {
                i = 8;
            }
            view2.setVisibility(i);
        }
        this.h = view;
        a();
    }
}
