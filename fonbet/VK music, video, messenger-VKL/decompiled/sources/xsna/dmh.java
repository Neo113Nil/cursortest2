package xsna;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.WallGetMode;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import xsna.nvh;
import xsna.vjh;

/* compiled from: CommunityProfileContentWallViewHolder.kt */
/* loaded from: classes5.dex */
public final class dmh extends wjh<CommunityProfileContentItem> {
    public final vph E;
    public final zvh F;

    public dmh(View view, UserId userId, FragmentImpl fragmentImpl, vph vphVar, WallGetMode wallGetMode, vjh.b bVar, io.reactivex.rxjava3.core.q qVar, ExtendedCommunityProfile extendedCommunityProfile, io.reactivex.rxjava3.core.q qVar2) {
        super(view, userId, fragmentImpl, new cmh(1, bVar, vjh.b.class, "onTabScroll", "onTabScroll(I)V", 0), new cj1(15), new dj1(22), new fj1(18), null, null);
        this.E = vphVar;
        zvw zvwVar = new zvw(null);
        RecyclerPaginatedView recyclerPaginatedView = this.w;
        zvh f0 = hd60.a().f0(this.l, this.m, this.w, wallGetMode, extendedCommunityProfile, qVar2);
        this.F = f0;
        (f0 == null ? null : f0).s6(this);
        lt9 lt9Var = new lt9(new RecyclerView.Adapter[0]);
        lt9Var.K0(zvwVar);
        zvh zvhVar = this.F;
        lt9Var.K0((zvhVar == null ? null : zvhVar).getAdapter());
        recyclerPaginatedView.setAdapter(lt9Var);
        RecyclerView recyclerView = recyclerPaginatedView.getRecyclerView();
        this.itemView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerPaginatedView.getRecyclerView().setItemAnimator(null);
        recyclerPaginatedView.f0();
        zvh zvhVar2 = this.F;
        (zvhVar2 == null ? null : zvhVar2).d();
        if (wallGetMode != WallGetMode.DONUT) {
            zvh zvhVar3 = this.F;
            (zvhVar3 == null ? null : zvhVar3).Jj(qVar);
        }
        zvh zvhVar4 = this.F;
        (zvhVar4 == null ? null : zvhVar4).F1();
        zvh zvhVar5 = this.F;
        (zvhVar5 != null ? zvhVar5 : null).f(false);
        l6(false);
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
    public final void a6() {
        zvh zvhVar = this.F;
        if (zvhVar == null) {
            zvhVar = null;
        }
        zvhVar.ma();
    }

    @Override // xsna.wjh
    public final void h6() {
        this.z.a();
        this.x.setVisibility(0);
        zvh zvhVar = this.F;
        if (zvhVar == null) {
            zvhVar = null;
        }
        zvhVar.f(false);
    }

    @Override // xsna.wjh
    public final void i6(CommunityProfileContentItem communityProfileContentItem) {
        zvh zvhVar = this.F;
        if (zvhVar == null) {
            zvhVar = null;
        }
        zvhVar.f(true);
    }

    @Override // xsna.wjh
    public final void l(int i) {
        zvh zvhVar = this.F;
        if (zvhVar == null) {
            zvhVar = null;
        }
        zvhVar.l(i);
    }

    @Override // xsna.wjh
    public final void l6(boolean z) {
        zvh zvhVar = this.F;
        if (zvhVar == null) {
            zvhVar = null;
        }
        zvhVar.j3(z);
    }

    @Override // xsna.wjh
    public final void m6(CommunityProfileContentItem communityProfileContentItem) {
        this.x.setContent(m4s.e);
    }

    public final void t6(nvh nvhVar) {
        boolean z = nvhVar instanceof nvh.a.g;
        RecyclerPaginatedView recyclerPaginatedView = this.w;
        if (z) {
            ((nvh.a.g) nvhVar).getClass();
            this.x.setVisibility(4);
            recyclerPaginatedView.setVisibility(0);
            recyclerPaginatedView.f0();
            return;
        }
        boolean equals = nvhVar.equals(nvh.a.C3419a.a);
        mkh mkhVar = this.y;
        if (equals) {
            q6(this.t, new CommunityProfileContentItem.c(R.string.community_content_wall_error));
            mkhVar.a();
            recyclerPaginatedView.setVisibility(4);
            return;
        }
        boolean equals2 = nvhVar.equals(nvh.a.b.a);
        mkh mkhVar2 = this.z;
        if (equals2) {
            mkhVar2.a();
            o6(this.t, new CommunityProfileContentItem.b(R.string.wall_empty, null, null, null, null, 30));
            recyclerPaginatedView.setVisibility(4);
            return;
        }
        if (nvhVar.equals(nvh.a.e.a)) {
            mkhVar.a();
            mkhVar2.a();
            recyclerPaginatedView.setVisibility(0);
            recyclerPaginatedView.f0();
            return;
        }
        mph mphVar = this.E.a;
        if (nvhVar instanceof nvh.a.d) {
            mphVar.l.invoke(new CommunityProfileAction.a0.b(((nvh.a.d) nvhVar).a));
            return;
        }
        if (nvhVar instanceof nvh.a.h) {
            nvh.a.h hVar = (nvh.a.h) nvhVar;
            mphVar.l.invoke(new CommunityProfileAction.a0.c(hVar.b, hVar.a, hVar.c));
        } else if (nvhVar instanceof nvh.a.c) {
            mphVar.l.invoke(CommunityProfileAction.a0.a.b);
        }
    }
}
