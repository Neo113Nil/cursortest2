package xsna;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.superapp.api.dto.app.catalog.section.AppsCatalogSection;
import com.vk.superapp.catalog.impl.v2.catalog.cache.StreamParcelableCatalogData;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import xsna.u8r0;
import xsna.v2a;
import xsna.x7a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class t8r0 implements izs {
    public final /* synthetic */ u8r0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ com.vk.lists.c d;

    public /* synthetic */ t8r0(u8r0 u8r0Var, boolean z, com.vk.lists.c cVar) {
        this.b = u8r0Var;
        this.c = z;
        this.d = cVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        u8r0 u8r0Var = this.b;
        boolean z = this.c;
        com.vk.lists.c cVar = this.d;
        u8r0.a aVar = (u8r0.a) obj;
        if (aVar instanceof u8r0.a.b.C3792a) {
            u8r0Var.k((u8r0.a.b.C3792a) aVar);
            bpn0 bpn0Var = qro0.a;
            qro0.a(new rrn0(u8r0Var, 7));
        } else if (aVar instanceof u8r0.a.b.C3793b) {
            u8r0.a.b.C3793b c3793b = (u8r0.a.b.C3793b) aVar;
            ArrayList l = u8r0.l(c3793b.a);
            u8r0Var.a.l(l, z, false);
            AppsCatalogSection appsCatalogSection = (AppsCatalogSection) j5g.k0(c3793b.a.a);
            cVar.s(appsCatalogSection != null ? Integer.valueOf(appsCatalogSection.getId()).toString() : null);
            u8r0Var.g.addAll(l);
            s7n0 b = bbq.b();
            if (b != null && b.b()) {
                s7n0 b2 = bbq.b();
                String e = b2 != null ? b2.e() : null;
                Iterator<x7a> it = u8r0Var.g.iterator();
                final int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    x7a next = it.next();
                    if ((next instanceof x7a.b) && epx.f(((x7a.b) next).f, "messenger_apps_with_action")) {
                        break;
                    }
                    i++;
                }
                if (!u8r0Var.k && e != null && i >= 0) {
                    u8r0Var.k = true;
                    final p8r0 p8r0Var = u8r0Var.a;
                    VkSimpleButton vkSimpleButton = p8r0Var.i;
                    VkSimpleButton vkSimpleButton2 = vkSimpleButton != null ? vkSimpleButton : null;
                    vkSimpleButton2.setVisibility(0);
                    vkSimpleButton2.setText(e);
                    vkSimpleButton2.setOnClickListener(new View.OnClickListener() { // from class: xsna.o8r0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            f4m.j(view);
                            p8r0 p8r0Var2 = p8r0.this;
                            RecyclerPaginatedView recyclerPaginatedView = p8r0Var2.g;
                            if (recyclerPaginatedView == null) {
                                recyclerPaginatedView = null;
                            }
                            RecyclerView.o layoutManager = recyclerPaginatedView.getRecyclerView().getLayoutManager();
                            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                            int s = linearLayoutManager != null ? linearLayoutManager.s() : 0;
                            int i2 = i;
                            if (s <= i2) {
                                RecyclerPaginatedView recyclerPaginatedView2 = p8r0Var2.g;
                                (recyclerPaginatedView2 != null ? recyclerPaginatedView2 : null).getRecyclerView().smoothScrollToPosition(i2 + 1);
                            } else {
                                RecyclerPaginatedView recyclerPaginatedView3 = p8r0Var2.g;
                                (recyclerPaginatedView3 != null ? recyclerPaginatedView3 : null).getRecyclerView().smoothScrollToPosition(i2 - 1);
                            }
                        }
                    });
                }
            }
            u8r0Var.h();
            bpn0 bpn0Var2 = qro0.a;
            qro0.a(new kcj0(u8r0Var, 10));
            if (z) {
                ke3 ke3Var = c3793b.a;
                v2a v2aVar = v2a.a;
                ?? r1 = ke3Var.b;
                v2aVar.getClass();
                wmi0.a.a("key_mini_apps_catalog_first_page_cache_serialization", new StreamParcelableCatalogData(ke3Var));
                v2a.a.b bVar = new v2a.a.b(l, r1);
                if (!epx.f(v2a.b, bVar)) {
                    v2a.b = bVar;
                }
            }
        } else {
            if (!(aVar instanceof u8r0.a.C3791a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (u8r0Var.i) {
                xgx0 xgx0Var = xgx0.a;
                Throwable th = ((u8r0.a.C3791a) aVar).a;
                xgx0Var.getClass();
                xgx0.d(th);
            } else {
                u8r0Var.a.k();
            }
        }
        return s3q0.a;
    }
}
