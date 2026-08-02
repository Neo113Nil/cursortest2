package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.core.view.AppBarShadowView;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;
import com.vk.superapp.miniapps.impl.AppsCatalogCategoriesFragment;
import com.vkontakte.android.R;
import java.util.HashSet;
import xsna.q8r0;

/* compiled from: VKAppsCatalogCategoriesDelegate.kt */
/* loaded from: classes6.dex */
public final class g8r0<F extends Fragment & q8r0> implements f8r0 {
    public final AppsCatalogCategoriesFragment a;
    public final j8r0 b;
    public AppBarLayout c;
    public VkTopBar d;
    public RecyclerPaginatedView e;
    public gpu0 f;
    public final hja g;

    public g8r0(AppsCatalogCategoriesFragment appsCatalogCategoriesFragment) {
        this.a = appsCatalogCategoriesFragment;
        j8r0 j8r0Var = new j8r0(this);
        this.b = j8r0Var;
        this.g = new hja(j8r0Var);
    }

    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.e8r0
    public final void d(Context context, View view) {
        this.c = (AppBarLayout) view.findViewById(R.id.app_bar_layout);
        VkTopBar vkTopBar = (VkTopBar) view.findViewById(R.id.toolbar);
        HashSet hashSet = iah0.a;
        if (!fnj.d(context)) {
            vkTopBar.setBack(new VkTopBar.b(new c9m0(this, 7), tq.h(tlo0.Companion, R.string.accessibility_toolbar_back), null, null, null, 28));
        }
        vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(vkTopBar.getContext().getString(R.string.vk_catalog_categories), (e4) null, (VkTopBar.Middle.Text.Title.a) null, (VkTopBar.Middle.Text.Title.Size) null, 14), null, null, null, 14));
        jjc.g(vkTopBar, new qjl0(this, 8));
        awt0.o(vkTopBar, new ece0(context, 18));
        this.d = vkTopBar;
        ((AppBarShadowView) view.findViewById(R.id.shadow)).setSeparatorAllowed(false);
        gpu0 gpu0Var = new gpu0(context);
        gpu0Var.i = iah0.a(16);
        hja hjaVar = this.g;
        gpu0Var.j = hjaVar;
        this.f = gpu0Var;
        RecyclerPaginatedView recyclerPaginatedView = (RecyclerPaginatedView) view.findViewById(R.id.details_list);
        RecyclerView recyclerView = recyclerPaginatedView.getRecyclerView();
        gpu0 gpu0Var2 = this.f;
        if (gpu0Var2 == null) {
            gpu0Var2 = null;
        }
        recyclerView.addItemDecoration(gpu0Var2);
        new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.LINEAR, recyclerPaginatedView).a();
        recyclerPaginatedView.setAdapter(hjaVar);
        recyclerPaginatedView.setSwipeRefreshEnabled(false);
        this.e = recyclerPaginatedView;
        j8r0 j8r0Var = this.b;
        c.h hVar = new c.h((c.m) j8r0Var.c.getValue());
        hVar.n = new xe8(6);
        RecyclerPaginatedView recyclerPaginatedView2 = j8r0Var.a.e;
        com.vk.lists.c a = com.vk.lists.f.a(hVar, recyclerPaginatedView2 != null ? recyclerPaginatedView2 : null);
        j8r0Var.d = a;
        a.p(false);
    }

    @Override // xsna.e8r0
    public final View e(Context context, ViewGroup viewGroup) {
        return LayoutInflater.from(context).inflate(R.layout.vk_apps_catalog_section_details_fragment, viewGroup, false);
    }

    @Override // xsna.e8r0
    public final void onDestroyView() {
        j8r0 j8r0Var = this.b;
        j8r0Var.c().e();
        com.vk.lists.c cVar = j8r0Var.d;
        if (cVar == null) {
            cVar = null;
        }
        cVar.v();
    }
}
