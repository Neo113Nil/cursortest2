package xsna;

import android.content.Context;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.superapp.ui.HorizontalExpandableMenuBehavior;
import com.vkontakte.android.R;

/* compiled from: HorizontalExpandableMenu.kt */
/* loaded from: classes6.dex */
public final class fdv extends RecyclerView {
    public final float b;
    public final int c;
    public l8q d;

    public fdv(Context context, int i) {
        super(context, null);
        float f = -context.getResources().getDimensionPixelSize(R.dimen.vk_expandable_menu_dialog_hidden_height);
        this.b = f;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.vk_expandable_menu_dialog_height);
        this.c = dimensionPixelSize;
        setLayoutParams(new CoordinatorLayout.f(-1, dimensionPixelSize));
        setElevation(cn70.c(2));
        setNestedScrollingEnabled(false);
        setTranslationY(f);
        setClipChildren(false);
        setClipToOutline(false);
        bwt0.Z(R.attr.vk_ui_background_content, this);
    }

    public final void a() {
        setTranslationY(this.b);
    }

    public final void c(u7n0 u7n0Var, LinearLayoutManager linearLayoutManager, boolean z) {
        l8q l8qVar = new l8q(u7n0Var);
        this.d = l8qVar;
        setAdapter(l8qVar);
        addItemDecoration(new a1x(0, getContext().getResources().getDimensionPixelSize(R.dimen.vk_expandable_menu_list_outer_offset)));
        getContext();
        setLayoutManager(new LinearLayoutManager(0, false));
        if (z) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            int a = fnj.a(getContext()) + this.c;
            layoutParams.height = a;
            setTranslationY(-a);
            f4m.y(fnj.a(getContext()), this);
            setLayoutParams(layoutParams);
        }
        ((CoordinatorLayout.f) getLayoutParams()).c(new HorizontalExpandableMenuBehavior(getContext(), linearLayoutManager));
    }
}
