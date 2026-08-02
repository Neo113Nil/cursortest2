package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.core.view.AppBarShadowView;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;
import com.vk.superapp.miniapps.impl.AppsCatalogSectionDetailsFragment;
import com.vkontakte.android.R;
import java.util.HashSet;

/* compiled from: VKAppsCatalogSectionDetailsDelegate.kt */
/* loaded from: classes6.dex */
public final class b9r0 implements a9r0 {
    public final AppsCatalogSectionDetailsFragment a;
    public final d9r0 b;
    public AppBarLayout c;
    public VkTopBar d;
    public RecyclerPaginatedView e;
    public gpu0 f;
    public final w1i0 g;

    public b9r0(AppsCatalogSectionDetailsFragment appsCatalogSectionDetailsFragment) {
        this.a = appsCatalogSectionDetailsFragment;
        d9r0 d9r0Var = new d9r0(this, appsCatalogSectionDetailsFragment.requireArguments().getString("section_id"));
        this.b = d9r0Var;
        this.g = new w1i0(d9r0Var);
    }

    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.e8r0
    public final void d(Context context, View view) {
        this.c = (AppBarLayout) view.findViewById(R.id.app_bar_layout);
        VkTopBar vkTopBar = (VkTopBar) view.findViewById(R.id.toolbar);
        HashSet hashSet = iah0.a;
        if (!fnj.d(context)) {
            vkTopBar.setBack(new VkTopBar.b(new z4d0(this, 23), tq.h(tlo0.Companion, R.string.accessibility_toolbar_back), null, null, null, 28));
        }
        String string = this.a.requireArguments().getString("title");
        if (string == null) {
            string = "";
        }
        vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(string, (e4) null, (VkTopBar.Middle.Text.Title.a) null, (VkTopBar.Middle.Text.Title.Size) null, 14), null, null, null, 14));
        jjc.g(vkTopBar, new qyi0(this, 15));
        awt0.o(vkTopBar, new xbv(context, 2));
        this.d = vkTopBar;
        ((AppBarShadowView) view.findViewById(R.id.shadow)).setSeparatorAllowed(false);
        gpu0 gpu0Var = new gpu0(context);
        gpu0Var.i = iah0.a(16);
        w1i0 w1i0Var = this.g;
        gpu0Var.j = w1i0Var;
        this.f = gpu0Var;
        RecyclerPaginatedView recyclerPaginatedView = (RecyclerPaginatedView) view.findViewById(R.id.details_list);
        RecyclerView recyclerView = recyclerPaginatedView.getRecyclerView();
        gpu0 gpu0Var2 = this.f;
        if (gpu0Var2 == null) {
            gpu0Var2 = null;
        }
        recyclerView.addItemDecoration(gpu0Var2);
        new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.LINEAR, recyclerPaginatedView).a();
        recyclerPaginatedView.setAdapter(w1i0Var);
        recyclerPaginatedView.setSwipeRefreshEnabled(false);
        this.e = recyclerPaginatedView;
        d9r0 d9r0Var = this.b;
        c.h hVar = new c.h((c.m) d9r0Var.e.getValue());
        hVar.i = 25;
        hVar.n = new xe8(6);
        RecyclerPaginatedView recyclerPaginatedView2 = d9r0Var.a.e;
        com.vk.lists.c a = com.vk.lists.f.a(hVar, recyclerPaginatedView2 != null ? recyclerPaginatedView2 : null);
        d9r0Var.f = a;
        a.p(false);
    }

    @Override // xsna.e8r0
    public final View e(Context context, ViewGroup viewGroup) {
        return LayoutInflater.from(context).inflate(R.layout.vk_apps_catalog_section_details_fragment, viewGroup, false);
    }

    @Override // xsna.e8r0
    public final void onDestroyView() {
        d9r0 d9r0Var = this.b;
        d9r0Var.g().e();
        com.vk.lists.c cVar = d9r0Var.f;
        if (cVar == null) {
            cVar = null;
        }
        cVar.v();
    }
}
