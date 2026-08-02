package xsna;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.RecyclerPaginatedView;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: HorizontalRecyclerPaginationView.kt */
/* loaded from: classes16.dex */
public final class kfv extends RecyclerPaginatedView {
    public static final b N = new b();
    public static final a O = new a();

    /* compiled from: HorizontalRecyclerPaginationView.kt */
    public static final class a extends n6s {
        @Override // xsna.n6s
        public final ee a(Context context, ViewGroup viewGroup) {
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.n6s
        public final RecyclerView.e0 b(Context context, ViewGroup viewGroup, xa80 xa80Var) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new RecyclerView.p(-2, -1));
            c cVar = new c(frameLayout);
            VkPlaceholder vkPlaceholder = new VkPlaceholder(frameLayout.getContext(), null, 6, 0);
            vkPlaceholder.setWrapContent(true);
            vkPlaceholder.setWithPaddings(false);
            vkPlaceholder.setMiddle(new VkPlaceholder.b(new VkPlaceholder.b.c(2, (tlo0) (0 == true ? 1 : 0)), new VkPlaceholder.b.C0859b(14, tq.h(tlo0.Companion, R.string.liblists_err_text))));
            lfv lfvVar = new lfv(0, xa80Var, xa80.class, "onRetryClick", "onRetryClick()V", 0);
            VkButton.Size size = VkButton.Size.Small;
            VkButton.Mode mode = VkButton.Mode.Secondary;
            VkButton.Appearance appearance = VkButton.Appearance.Accent;
            VkPlaceholder.a.C0857a c0857a = null;
            Object[] objArr = 0 == true ? 1 : 0;
            vkPlaceholder.setBottom(new VkPlaceholder.a.b(new VkPlaceholder.a.C0857a((tlo0) new tlo0.f(R.string.liblists_retry), (gzs) lfvVar, (VkPlaceholder.a.C0857a.C0858a) null, (VkPlaceholder.a.C0857a.C0858a) null, size, mode, appearance, false, 284), c0857a, c0857a, objArr, 8));
            frameLayout.addView(vkPlaceholder, new FrameLayout.LayoutParams(-2, -2, 16));
            f4m.s(e3m.a(R.dimen.vk_ui_spacing_size_m, frameLayout.getContext()), vkPlaceholder);
            f4m.r(e3m.a(R.dimen.vk_ui_spacing_size_m, frameLayout.getContext()), vkPlaceholder);
            return cVar;
        }

        @Override // xsna.n6s
        public final int c() {
            return 2147483593;
        }
    }

    /* compiled from: HorizontalRecyclerPaginationView.kt */
    public static final class b extends x6s {

        /* compiled from: HorizontalRecyclerPaginationView.kt */
        public static final class a extends RecyclerView.e0 {
        }

        @Override // xsna.x6s
        public final View a(Context context, ViewGroup viewGroup) {
            return LayoutInflater.from(context).inflate(R.layout.recycler_paginated_horizontal_list_loading, viewGroup, false);
        }

        @Override // xsna.x6s
        public final RecyclerView.e0 b(Context context, ViewGroup viewGroup) {
            return new a(a(context, viewGroup));
        }

        @Override // xsna.x6s
        public final int c() {
            return 2147483594;
        }
    }

    /* compiled from: HorizontalRecyclerPaginationView.kt */
    public static final class c extends RecyclerView.e0 {
    }

    /* compiled from: HorizontalRecyclerPaginationView.kt */
    public static final class d extends AbstractPaginatedView.h {
    }

    @Override // com.vk.lists.RecyclerPaginatedView, com.vk.lists.AbstractPaginatedView
    public final View q(Context context, AttributeSet attributeSet) {
        this.x = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.recycler_paginated_horizontal_view, (ViewGroup) this, false).findViewById(R.id.recycler);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.colorAccent, R.attr.vk_enableItemAnimations});
        if (!obtainStyledAttributes.getBoolean(1, false)) {
            this.x.setItemAnimator(null);
        }
        obtainStyledAttributes.recycle();
        this.w = new d();
        return this.x;
    }
}
