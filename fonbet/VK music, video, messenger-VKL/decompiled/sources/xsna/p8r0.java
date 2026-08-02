package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.core.view.AppBarShadowView;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;
import com.vk.superapp.api.dto.app.catalog.CustomItem;
import com.vk.superapp.api.dto.menu.BadgeInfo;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.miniapps.impl.AppsCatalogFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import xsna.q8r0;
import xsna.tlo0;
import xsna.x7a;

/* compiled from: VKAppsCatalogDelegate.kt */
/* loaded from: classes6.dex */
public final class p8r0<F extends Fragment & q8r0> implements l8r0 {
    public static final int l = iah0.a(8);
    public final AppsCatalogFragment a;
    public final u8r0 b;
    public final boolean c;
    public AppBarLayout d;
    public VkTopBar e;
    public RecyclerView f;
    public RecyclerPaginatedView g;
    public gpu0 h;
    public VkSimpleButton i;
    public final c8r0<? extends e9r0<x7a.c>> j;
    public final b8r0 k;

    /* JADX WARN: Multi-variable type inference failed */
    public p8r0(AppsCatalogFragment appsCatalogFragment) {
        f9r0 f9r0Var;
        pq3 a;
        this.a = appsCatalogFragment;
        u8r0 u8r0Var = new u8r0(this);
        this.b = u8r0Var;
        dex0 dex0Var = e370.s;
        boolean z = false;
        if (dex0Var != null && (a = dex0Var.a()) != null && a.g()) {
            z = true;
        }
        this.c = z;
        if (z) {
            x8r0 x8r0Var = new x8r0();
            x8r0Var.c = x8r0.d;
            f9r0Var = x8r0Var;
        } else {
            f9r0 f9r0Var2 = new f9r0();
            f9r0Var2.c = f9r0.d;
            f9r0Var = f9r0Var2;
        }
        this.j = f9r0Var;
        this.k = z ? new w8r0(u8r0Var) : new d8r0(u8r0Var);
    }

    @Override // xsna.l8r0
    public final void a(String str, boolean z, BadgeInfo badgeInfo) {
        this.b.p(str, Boolean.valueOf(z), badgeInfo);
    }

    @Override // xsna.l8r0
    public final void b(View view, Context context, ay1 ay1Var) {
        this.b.h = ay1Var;
        d(context, view);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.l8r0
    public final void c(f1a f1aVar) {
        u8r0 u8r0Var = this.b;
        if (u8r0Var.g.isEmpty()) {
            return;
        }
        ?? r2 = f1aVar.a;
        ArrayList<x7a> arrayList = u8r0Var.g;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        for (x7a x7aVar : arrayList) {
            if (x7aVar instanceof x7a.d.C3981d) {
                x7a.d.C3981d c3981d = (x7a.d.C3981d) x7aVar;
                List<CustomItem> list = c3981d.g;
                ArrayList arrayList3 = new ArrayList(c5g.u(list, 10));
                for (CustomItem customItem : list) {
                    if (r2.containsKey(customItem.c)) {
                        int intValue = ((Number) r2.get(customItem.c)).intValue();
                        BadgeInfo badgeInfo = customItem.k;
                        customItem = CustomItem.a(customItem, badgeInfo != null ? BadgeInfo.a(badgeInfo, null, false, false, intValue, false, 55) : new BadgeInfo(null, false, false, intValue, false, false, 55, null));
                    }
                    arrayList3.add(customItem);
                }
                x7a.d.C3981d c3981d2 = new x7a.d.C3981d(c3981d.e, c3981d.f, arrayList3, c3981d.d);
                c3981d2.c = x7aVar.c;
                c3981d2.b = x7aVar.b;
                x7aVar = c3981d2;
            }
            arrayList2.add(x7aVar);
        }
        ArrayList<x7a> q = p4g.q(arrayList2);
        u8r0Var.a.m(q);
        u8r0Var.g = q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.e8r0
    public final void d(Context context, View view) {
        pq3 a;
        this.d = (AppBarLayout) view.findViewById(R.id.app_bar_layout);
        VkTopBar vkTopBar = (VkTopBar) view.findViewById(R.id.toolbar);
        HashSet hashSet = iah0.a;
        if (!fnj.d(context)) {
            vkTopBar.setBack(new VkTopBar.b(new acp0(this, 2), tq.h(tlo0.Companion, R.string.accessibility_toolbar_back), null, null, null, 28));
        }
        vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(tq.h(tlo0.Companion, this.c ? R.string.vk_new_catalog_title : R.string.vk_catalog_title), null, null, null, null, 30), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 14));
        jjc.g(vkTopBar, new z6f0(this, 25));
        vkTopBar.setAfter(VkTopBar.a.C0875a.a(new VkTopBar.a.c.f(new gko(R.drawable.vk_icon_search_outline_28), new tlo0.f(R.string.vk_search), new prq0(this, 3), 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 56), null, 6));
        awt0.o(vkTopBar, new vlc0(context, 24));
        this.e = vkTopBar;
        boolean z = false;
        ((AppBarShadowView) view.findViewById(R.id.shadow)).setSeparatorAllowed(false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.stub_recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        gpu0 g = g(recyclerView.getContext());
        g.g = l;
        c8r0<? extends e9r0<x7a.c>> c8r0Var = this.j;
        g.j = c8r0Var;
        recyclerView.addItemDecoration(g);
        recyclerView.setAdapter(c8r0Var);
        recyclerView.setOnTouchListener(new m8r0());
        this.f = recyclerView;
        this.h = g(context);
        RecyclerPaginatedView recyclerPaginatedView = (RecyclerPaginatedView) view.findViewById(R.id.catalog_list);
        RecyclerView recyclerView2 = recyclerPaginatedView.getRecyclerView();
        gpu0 gpu0Var = this.h;
        if (gpu0Var == null) {
            gpu0Var = null;
        }
        recyclerView2.addItemDecoration(gpu0Var);
        ee errorView = recyclerPaginatedView.getErrorView();
        if (errorView != null) {
            errorView.setRetryClickListener(new xa80() { // from class: xsna.n8r0
                @Override // xsna.xa80
                public final void b() {
                    p8r0.this.b.m();
                }
            });
        }
        recyclerPaginatedView.setFooterErrorViewProvider(new m6s(new uho0(this, 4)));
        new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.LINEAR, recyclerPaginatedView).a();
        recyclerPaginatedView.setAdapter(this.k);
        recyclerPaginatedView.setSwipeRefreshEnabled(false);
        RecyclerView recyclerView3 = recyclerPaginatedView.getRecyclerView();
        xvj0 xvj0Var = new xvj0();
        recyclerView3.addOnItemTouchListener(xvj0Var);
        recyclerView3.addOnScrollListener(xvj0Var);
        this.g = recyclerPaginatedView;
        this.i = (VkSimpleButton) view.findViewById(R.id.something_new_button);
        u8r0 u8r0Var = this.b;
        p8r0 p8r0Var = u8r0Var.a;
        c.h hVar = new c.h((c.m) u8r0Var.c.getValue());
        hVar.i = ((Number) u8r0Var.j.getValue()).intValue();
        hVar.l = false;
        hVar.m = false;
        dex0 dex0Var = e370.s;
        if (dex0Var != null && (a = dex0Var.a()) != null && a.g()) {
            z = true;
        }
        if (!z) {
            hVar.n = new xe8(6);
        }
        RecyclerPaginatedView recyclerPaginatedView2 = p8r0Var.g;
        if (recyclerPaginatedView2 == null) {
            recyclerPaginatedView2 = null;
        }
        u8r0Var.d = com.vk.lists.f.a(hVar, recyclerPaginatedView2);
        RecyclerPaginatedView recyclerPaginatedView3 = p8r0Var.g;
        if (recyclerPaginatedView3 == null) {
            recyclerPaginatedView3 = null;
        }
        recyclerPaginatedView3.setOnReloadRetryClickListener(new rjd(0, u8r0Var, u8r0.class, "reloadCatalog", "reloadCatalog()V", 0, 6));
        ay1 ay1Var = u8r0Var.h;
        if (ay1Var != null) {
            RecyclerPaginatedView recyclerPaginatedView4 = p8r0Var.g;
            ay1Var.c((recyclerPaginatedView4 != null ? recyclerPaginatedView4 : null).getRecyclerView());
        }
        u8r0Var.j().b(((t9u0) u8r0Var.l.getValue()).a.subscribe(new vk40(new e9i0(u8r0Var, 16), 27)));
        u8r0Var.m();
    }

    @Override // xsna.e8r0
    public final View e(Context context, ViewGroup viewGroup) {
        return LayoutInflater.from(context).inflate(this.c ? R.layout.vk_apps_catalog_fragment_redesign : R.layout.vk_apps_catalog_fragment, viewGroup, false);
    }

    @Override // xsna.l8r0
    public final RecyclerPaginatedView f() {
        RecyclerPaginatedView recyclerPaginatedView = this.g;
        if (recyclerPaginatedView != null) {
            return recyclerPaginatedView;
        }
        return null;
    }

    public final gpu0 g(Context context) {
        gpu0 gpu0Var = new gpu0(context);
        gpu0Var.i = iah0.a(16);
        gpu0Var.g = l;
        gpu0Var.e = e3m.a(R.dimen.vk_catalog_miniapp_item_padding, context);
        gpu0Var.j = this.k;
        return gpu0Var;
    }

    public final void h(WebApiApplication webApiApplication, String str) {
        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
        if (superappUiRouterBridge == null) {
            superappUiRouterBridge = null;
        }
        SuperappUiRouterBridge.b.b(superappUiRouterBridge, this.a.requireContext(), webApiApplication, new nex0(str, str), null, null, null, null, 248);
    }

    public final void i(String str, String str2) {
        this.a.mc(str, str2);
    }

    public final void j() {
        RecyclerPaginatedView recyclerPaginatedView = this.g;
        if (recyclerPaginatedView == null) {
            recyclerPaginatedView = null;
        }
        RecyclerView.o layoutManager = recyclerPaginatedView.getRecyclerView().getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null || linearLayoutManager.s() != 0) {
            RecyclerPaginatedView recyclerPaginatedView2 = this.g;
            if (recyclerPaginatedView2 == null) {
                recyclerPaginatedView2 = null;
            }
            recyclerPaginatedView2.getRecyclerView().scrollToPosition(0);
            AppBarLayout appBarLayout = this.d;
            (appBarLayout != null ? appBarLayout : null).g(true, true, true);
        }
    }

    public final void k() {
        if (this.k.getItemCount() <= 0) {
            RecyclerPaginatedView recyclerPaginatedView = this.g;
            if (recyclerPaginatedView == null) {
                recyclerPaginatedView = null;
            }
            recyclerPaginatedView.g0();
        } else {
            RecyclerPaginatedView recyclerPaginatedView2 = this.g;
            if (recyclerPaginatedView2 == null) {
                recyclerPaginatedView2 = null;
            }
            recyclerPaginatedView2.Fe();
        }
        this.j.y0();
        RecyclerView recyclerView = this.f;
        f4m.j(recyclerView != null ? recyclerView : null);
    }

    public final void l(List<? extends x7a> list, boolean z, boolean z2) {
        this.a.c(z2);
        b8r0 b8r0Var = this.k;
        if (z) {
            b8r0Var.setItems(list);
            VkTopBar vkTopBar = this.e;
            if (vkTopBar == null) {
                vkTopBar = null;
            }
            awt0.q(vkTopBar);
        } else {
            b8r0Var.h0(list);
        }
        this.j.y0();
        RecyclerView recyclerView = this.f;
        f4m.j(recyclerView != null ? recyclerView : null);
    }

    public final void m(List<? extends x7a> list) {
        this.k.setItems(list);
    }

    @Override // xsna.e8r0
    public final void onDestroyView() {
        u8r0 u8r0Var = this.b;
        u8r0Var.j().e();
        ay1 ay1Var = u8r0Var.h;
        if (ay1Var != null) {
            ay1Var.b();
        }
        u8r0Var.h = null;
        com.vk.lists.c cVar = u8r0Var.d;
        if (cVar == null) {
            cVar = null;
        }
        cVar.v();
        io.reactivex.rxjava3.disposables.c cVar2 = z8r0.b;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        z8r0.b = null;
    }
}
