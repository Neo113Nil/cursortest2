package xsna;

import android.location.Location;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.vk.core.view.components.paging.list.VkRecyclerPaginatedView;
import com.vk.dto.geo.GeoLocation;
import com.vk.lists.AbstractPaginatedView;
import com.vkontakte.android.R;
import xsna.l3m0;
import xsna.u3m0;
import xsna.x3m0;

/* compiled from: StoryGeoPickView.kt */
/* loaded from: classes6.dex */
public final class t3m0 extends FrameLayout implements dc6, u3m0.a, x3m0.a, l3m0.a {
    public static final int g = iah0.a(56);
    public o3m0 b;
    public a c;
    public n3m0 d;
    public final VkRecyclerPaginatedView e;
    public final View f;

    /* compiled from: StoryGeoPickView.kt */
    public interface a {
        void b();

        void c();

        void d(GeoLocation geoLocation);
    }

    public t3m0(l7s l7sVar, Location location) {
        super(l7sVar);
        LayoutInflater.from(l7sVar).inflate(R.layout.story_pick_geo_view, this);
        this.f = findViewById(R.id.header_shadow);
        VkRecyclerPaginatedView vkRecyclerPaginatedView = (VkRecyclerPaginatedView) findViewById(R.id.list);
        this.e = vkRecyclerPaginatedView;
        new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.LINEAR, vkRecyclerPaginatedView).a();
        vkRecyclerPaginatedView.setSwipeRefreshEnabled(false);
        vkRecyclerPaginatedView.Om(new s3m0(this));
        setPresenter((o3m0) new r3m0(this, location));
    }

    @Override // xsna.x3m0.a
    public final void b() {
        a aVar = this.c;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // xsna.l3m0.a
    public final void c() {
        a aVar = this.c;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // xsna.x3m0.a
    public final void d(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        n3m0 n3m0Var = this.d;
        if (n3m0Var == null) {
            n3m0Var = null;
        }
        x3m0 x3m0Var = n3m0Var.f;
        if (x3m0Var != null) {
            x3m0Var.n.setQuery(str);
        }
    }

    @Override // xsna.u3m0.a
    public final void f(GeoLocation geoLocation) {
        a aVar = this.c;
        if (aVar != null) {
            aVar.d(geoLocation);
        }
    }

    public final a getCallback() {
        return this.c;
    }

    @Override // xsna.x3m0.a
    public final void h(String str) {
        o3m0 presenter = getPresenter();
        if (epx.f(presenter != null ? presenter.i() : null, str)) {
            return;
        }
        this.e.getRecyclerView().scrollToPosition(0);
        o3m0 presenter2 = getPresenter();
        if (presenter2 != null) {
            presenter2.C6(str);
        }
    }

    public final void setCallback(a aVar) {
        this.c = aVar;
    }

    @Override // xsna.dc6
    public o3m0 getPresenter() {
        return this.b;
    }

    @Override // xsna.dc6
    public void setPresenter(o3m0 o3m0Var) {
        this.b = o3m0Var;
    }
}
