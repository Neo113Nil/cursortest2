package xsna;

import android.location.Location;
import com.vk.api.base.VkPaginationList;
import com.vk.core.view.components.paging.list.VkRecyclerPaginatedView;
import com.vk.dto.geo.GeoLocation;
import com.vk.lists.ListDataSet;
import com.vk.lists.c;
import io.reactivex.rxjava3.internal.functions.a;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: StoryGeoPickPresenter.kt */
/* loaded from: classes16.dex */
public final class r3m0 implements o3m0, c.l<VkPaginationList<GeoLocation>> {
    public final t3m0 b;
    public Location c;
    public boolean d;
    public String e = "";
    public final ListDataSet<zif0> f;
    public final com.vk.lists.c g;
    public io.reactivex.rxjava3.disposables.c h;

    public r3m0(t3m0 t3m0Var, Location location) {
        this.b = t3m0Var;
        this.c = location;
        ListDataSet<zif0> listDataSet = new ListDataSet<>();
        this.f = listDataSet;
        listDataSet.s(new y3m0());
        c.h hVar = new c.h(this);
        hVar.i = 30;
        n3m0 n3m0Var = new n3m0(listDataSet, t3m0Var);
        t3m0Var.d = n3m0Var;
        VkRecyclerPaginatedView vkRecyclerPaginatedView = t3m0Var.e;
        vkRecyclerPaginatedView.setAdapter(n3m0Var);
        this.g = com.vk.lists.f.a(hVar, vkRecyclerPaginatedView);
    }

    public static io.reactivex.rxjava3.internal.operators.observable.m1 b(com.vk.lists.c cVar, Location location, String str, int i) {
        double d = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        double latitude = location != null ? location.getLatitude() : 0.0d;
        if (location != null) {
            d = location.getLongitude();
        }
        return rsg0.y0(new usa0(latitude, d, str, i, cVar.k()), null, null, 3);
    }

    @Override // xsna.o3m0
    public final void C6(String str) {
        this.e = str;
        this.g.p(false);
    }

    @Override // xsna.o3m0
    public final void Z0(boolean z) {
        boolean z2 = !this.d && z;
        this.d = z;
        if (z2) {
            this.g.p(false);
            this.b.e.getRecyclerView().scrollToPosition(0);
        }
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<VkPaginationList<GeoLocation>> hj(com.vk.lists.c cVar, boolean z) {
        ListDataSet<zif0> listDataSet = this.f;
        if (listDataSet.c(1) instanceof k3m0) {
            listDataSet.A(1);
        }
        return ui(0, cVar);
    }

    @Override // xsna.o3m0
    public final String i() {
        return this.e;
    }

    @Override // xsna.cc6
    public final void onDestroy() {
        io.reactivex.rxjava3.disposables.c cVar = this.h;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // xsna.cc6
    public final void onPause() {
        throw null;
    }

    @Override // xsna.cc6
    public final void onResume() {
        throw null;
    }

    @Override // com.vk.lists.c.l
    public final io.reactivex.rxjava3.core.q<VkPaginationList<GeoLocation>> ui(int i, com.vk.lists.c cVar) {
        Location location = this.c;
        if (location != null) {
            return b(cVar, location, this.e, i);
        }
        if (!this.d && this.e.length() == 0) {
            return io.reactivex.rxjava3.core.q.T(new VkPaginationList(null, 0, false, 0, 15, null));
        }
        if (!this.d && this.e.length() > 0) {
            return b(cVar, null, this.e, i);
        }
        io.reactivex.rxjava3.internal.operators.observable.o1 c = kzz.c(5000L, this.b.getContext());
        c120 c120Var = new c120(new zb60(this, 27), 28);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return c.E(c120Var, lVar, kVar, kVar).L(new did0(new q3m0(this, cVar, i), 7), false);
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<VkPaginationList<GeoLocation>> qVar, boolean z, com.vk.lists.c cVar) {
        this.h = qVar.subscribe(new hu50(new p3m0(this, z), 21), new eeh0(new ye40(17), 4));
    }
}
