package xsna;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.newsfeed.WallGetMode;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.profile.core.tabs.state.CommunityProfileContent;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.profile.user.impl.ui.UserProfileFragment;
import com.vk.toggle.features.FeedFeatures;
import com.vkontakte.android.R;
import xsna.dxq0;
import xsna.vjh;

/* compiled from: UserProfileContentWallViewHolder.kt */
/* loaded from: classes5.dex */
public final class foq0 extends wjh<CommunityProfileContentItem> {
    public static final /* synthetic */ int J = 0;
    public final qqq0 E;
    public final mzp0 F;
    public final yw90 G;
    public final NewsFeedComponent H;
    public final nxq0 I;

    public foq0(View view, UserProfileFragment userProfileFragment, vjh.b bVar, CommunityProfileContent communityProfileContent, WallGetMode wallGetMode, qqq0 qqq0Var, mzp0 mzp0Var, yw90 yw90Var, NewsFeedComponent newsFeedComponent) {
        super(view, communityProfileContent.a, userProfileFragment, new doq0(1, bVar, vjh.b.class, "onTabScroll", "onTabScroll(I)V", 0), new pmp0(2), new wep0(1), new hxm0(5), null, null);
        WallGetMode wallGetMode2;
        oxq0 M;
        this.E = qqq0Var;
        this.F = mzp0Var;
        this.G = yw90Var;
        this.H = newsFeedComponent;
        RecyclerPaginatedView recyclerPaginatedView = this.w;
        FeedFeatures feedFeatures = FeedFeatures.MVI_USER;
        feedFeatures.getClass();
        com.vk.toggle.b bVar2 = com.vk.toggle.b.A;
        if (bVar2.a(feedFeatures)) {
            newsFeedComponent.i5();
            wallGetMode2 = wallGetMode;
            M = new vxq0(this.m, recyclerPaginatedView, new xwq0(wallGetMode2, communityProfileContent.b(), this.l, communityProfileContent.j, communityProfileContent.k, this, this));
        } else {
            wallGetMode2 = wallGetMode;
            M = hd60.a().M(this.m, this.w, wallGetMode2, communityProfileContent.b());
        }
        this.I = M;
        lt9 lt9Var = new lt9(new RecyclerView.Adapter[0]);
        nxq0 nxq0Var = this.I;
        lt9Var.K0((nxq0Var == null ? null : nxq0Var).getAdapter());
        lt9Var.registerAdapterDataObserver(new eoq0(this));
        recyclerPaginatedView.setAdapter(lt9Var);
        RecyclerView recyclerView = recyclerPaginatedView.getRecyclerView();
        this.itemView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerPaginatedView.getRecyclerView().setItemAnimator(null);
        nxq0 nxq0Var2 = this.I;
        (nxq0Var2 == null ? null : nxq0Var2).d();
        recyclerPaginatedView.f0();
        if (!bVar2.a(feedFeatures)) {
            nxq0 nxq0Var3 = this.I;
            (nxq0Var3 == null ? null : nxq0Var3).k(this.l);
            nxq0 nxq0Var4 = this.I;
            (nxq0Var4 == null ? null : nxq0Var4).e(wallGetMode2);
            nxq0 nxq0Var5 = this.I;
            (nxq0Var5 == null ? null : nxq0Var5).F1();
            nxq0 nxq0Var6 = this.I;
            (nxq0Var6 == null ? null : nxq0Var6).h(communityProfileContent.k, communityProfileContent.j);
            nxq0 nxq0Var7 = this.I;
            (nxq0Var7 == null ? null : nxq0Var7).m(this);
            nxq0 nxq0Var8 = this.I;
            (nxq0Var8 != null ? nxq0Var8 : null).g(this);
        }
        l6(false);
        f4m.t(cn70.b(0), this.itemView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wjh
    public final void V5(CommunityProfileContentItem communityProfileContentItem) {
        m6(communityProfileContentItem);
        if (communityProfileContentItem.f() == CommunityProfileContentItem.State.RELOAD) {
            i6(communityProfileContentItem);
        }
        this.t = communityProfileContentItem;
    }

    @Override // xsna.wjh
    public final void h6() {
        this.z.a();
        this.x.setVisibility(0);
        nxq0 nxq0Var = this.I;
        if (nxq0Var == null) {
            nxq0Var = null;
        }
        nxq0Var.f(false);
    }

    @Override // xsna.wjh
    public final void i6(CommunityProfileContentItem communityProfileContentItem) {
        nxq0 nxq0Var = this.I;
        if (nxq0Var == null) {
            nxq0Var = null;
        }
        nxq0Var.f(true);
    }

    @Override // xsna.wjh
    public final void l(int i) {
        nxq0 nxq0Var = this.I;
        if (nxq0Var == null) {
            nxq0Var = null;
        }
        nxq0Var.l(i);
    }

    @Override // xsna.wjh
    public final void l6(boolean z) {
        nxq0 nxq0Var = this.I;
        if (nxq0Var == null) {
            nxq0Var = null;
        }
        nxq0Var.j3(z);
    }

    @Override // xsna.wjh
    public final void m6(CommunityProfileContentItem communityProfileContentItem) {
        this.x.setContent(sdy.g);
    }

    @Override // xsna.wjh
    public final boolean s6() {
        return false;
    }

    public final void t6() {
        mzp0 mzp0Var = this.F;
        if (mzp0Var != null) {
            mzp0Var.d(this.itemView);
        }
        yw90 yw90Var = this.G;
        if (yw90Var != null) {
            yw90Var.a();
        }
    }

    public final void v6(wnq0 wnq0Var) {
        if (this.t != 0) {
            this.E.getClass();
        }
    }

    public final void x6(dxq0 dxq0Var) {
        T t = this.t;
        if (t != 0) {
            nqq0 nqq0Var = this.E.a;
            if (dxq0Var instanceof dxq0.a.d) {
                dxq0.a.d dVar = (dxq0.a.d) dxq0Var;
                nqq0Var.d.a(new UserProfileAction.e0.a(t, dVar.a, dVar.b));
            } else if (dxq0Var instanceof dxq0.a.i) {
                nqq0Var.d.a(new UserProfileAction.e0.b(t, ((dxq0.a.i) dxq0Var).a));
            } else if (dxq0Var instanceof dxq0.a.h) {
                nqq0Var.d.a(new UserProfileAction.d0.d.a(((dxq0.a.h) dxq0Var).a));
            } else if (dxq0Var instanceof dxq0.a.e) {
                nqq0Var.d.a(new UserProfileAction.d0.c.a(((dxq0.a.e) dxq0Var).a));
            }
        }
        boolean equals = dxq0Var.equals(dxq0.a.C2768a.a);
        mkh mkhVar = this.y;
        RecyclerPaginatedView recyclerPaginatedView = this.w;
        if (equals) {
            q6(this.t, new CommunityProfileContentItem.c(R.string.community_content_wall_error));
            mkhVar.a();
            recyclerPaginatedView.setVisibility(4);
            return;
        }
        boolean z = dxq0Var instanceof dxq0.a.b;
        mkh mkhVar2 = this.z;
        if (z) {
            mkhVar2.a();
            o6(this.t, new CommunityProfileContentItem.b(R.string.user_profile_wall_empty, null, null, null, null, 30));
            recyclerPaginatedView.setVisibility(4);
            return;
        }
        if (dxq0Var.equals(dxq0.a.c.a)) {
            mkhVar.a();
            mkhVar2.a();
            recyclerPaginatedView.setVisibility(0);
            recyclerPaginatedView.f0();
            return;
        }
        if (dxq0Var instanceof dxq0.a.f) {
            this.x.setVisibility(4);
            recyclerPaginatedView.setVisibility(0);
            recyclerPaginatedView.f0();
        }
    }

    @Override // xsna.wjh
    public final void a6() {
    }
}
