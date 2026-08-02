package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.places.analytics.generated.DiscoveryAnalytics$OrganizationListScrollDirection;
import com.yandex.go.places.impl.ui.organizations.OrganizationsModalView;
import com.yandex.go.places.impl.ui.organizations.OrganizationsModalView$linearLayoutManager$1;
import com.yandex.go.places.impl.ui.organizations.d;
import com.yandex.go.places.impl.ui.organizations.e;
import java.util.HashMap;
import kotlin.collections.builders.MapBuilder;

/* loaded from: classes13.dex */
public final class ko80 extends RecyclerView.g {
    public k65 a;
    public int b;
    public int c;
    public final /* synthetic */ OrganizationsModalView d;

    public ko80(OrganizationsModalView organizationsModalView) {
        this.d = organizationsModalView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        OrganizationsModalView$linearLayoutManager$1 organizationsModalView$linearLayoutManager$1;
        OrganizationsModalView$linearLayoutManager$1 organizationsModalView$linearLayoutManager$12;
        zm80 adapter;
        zm80 adapter2;
        pzt0 pzt0Var;
        zm80 adapter3;
        OrganizationsModalView organizationsModalView = this.d;
        organizationsModalView.processRecyclerViewScrollState();
        organizationsModalView$linearLayoutManager$1 = organizationsModalView.linearLayoutManager;
        int M1 = organizationsModalView$linearLayoutManager$1.M1();
        if (M1 != -1) {
            adapter = organizationsModalView.getAdapter();
            k65 k65Var = (k65) adapter.getItem(M1);
            if (i2 != 0 && !jl40.l(k65Var, this.a)) {
                this.a = k65Var;
                d presenter = organizationsModalView.getPresenter();
                adapter3 = organizationsModalView.getAdapter();
                k65 k65Var2 = (k65) adapter3.getItem(M1);
                jdj jdjVar = presenter.P;
                bn80 bn80Var = (bn80) presenter.Q.a.getValue();
                String str = bn80Var != null ? bn80Var.a : null;
                ((c65) jdjVar.w).getClass();
                lwj lwjVar = k65Var2 instanceof a65 ? new lwj(((a65) k65Var2).a) : null;
                DiscoveryAnalytics$OrganizationListScrollDirection discoveryAnalytics$OrganizationListScrollDirection = i2 > 0 ? DiscoveryAnalytics$OrganizationListScrollDirection.Down : DiscoveryAnalytics$OrganizationListScrollDirection.Up;
                if (lwjVar != null) {
                    jio jioVar = (jio) jdjVar.c;
                    MapBuilder y = qv10.y("type", "organization_card");
                    String str2 = lwjVar.a;
                    if (str2 != null) {
                        y.put("oid", str2);
                    }
                    MapBuilder j = y.j();
                    hsj hsjVar = jioVar.b;
                    String i3 = jioVar.i();
                    hsjVar.getClass();
                    HashMap hashMap = new HashMap();
                    if (str != null) {
                        hashMap.put("geosearch_context", str);
                    }
                    hashMap.put("scroll_direction", discoveryAnalytics$OrganizationListScrollDirection.getEventValue());
                    hashMap.put("last_visible_item", j);
                    hsjVar.a.a("Discovery.OrganisationList.Scrolled", hashMap, 2, tse0.r("source", hashMap, i3));
                }
            }
            adapter2 = organizationsModalView.getAdapter();
            if (scc.f(adapter2.x.f) - M1 < 3 && i2 >= 0) {
                d presenter2 = organizationsModalView.getPresenter();
                e eVar = presenter2.L;
                ip80 a = eVar.a();
                a.getClass();
                cp80 cp80Var = a instanceof cp80 ? (cp80) a : null;
                if (cp80Var != null) {
                    presenter2.Rg(cp80Var.a);
                } else {
                    ip80 a2 = eVar.a();
                    a2.getClass();
                    if (!(a2 instanceof hp80) && (pzt0Var = presenter2.Z) != null) {
                        pzt0Var.w(new ub60(27, presenter2));
                    }
                }
            }
        }
        if (this.c * i2 < 0) {
            organizationsModalView.amountScrollY = 0;
        }
        organizationsModalView$linearLayoutManager$12 = organizationsModalView.linearLayoutManager;
        organizationsModalView.animateHeader(organizationsModalView$linearLayoutManager$12.K1(), i2);
        if (M1 != this.b) {
            organizationsModalView.animateUpButton(M1);
        }
        this.b = M1;
        this.c = i2;
    }
}
