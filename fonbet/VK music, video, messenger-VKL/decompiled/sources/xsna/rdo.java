package xsna;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.lists.c;
import com.vk.newsfeed.impl.drafts.DraftsFeedFragment;
import com.vk.newsfeed.impl.presenters.EntriesListPresenter;
import com.vk.newsfeed.impl.requests.WallWithCounters;
import io.reactivex.rxjava3.internal.functions.a;
import xsna.i6k0;

/* compiled from: DraftsFeedPresenter.kt */
/* loaded from: classes4.dex */
public final class rdo extends EntriesListPresenter implements c.l<WallWithCounters> {
    public final DraftsFeedFragment d0;
    public UserId e0;
    public final String f0;
    public final String g0;

    public rdo(DraftsFeedFragment draftsFeedFragment) {
        super(draftsFeedFragment);
        this.d0 = draftsFeedFragment;
        this.e0 = UserId.d;
        this.f0 = "drafts";
        this.g0 = "";
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter
    public final void A(NewsEntry newsEntry) {
        c0(newsEntry);
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter
    public final void D(NewsEntry newsEntry, boolean z) {
        if (newsEntry instanceof Post) {
            Post post = (Post) newsEntry;
            bqp.c(this.u, post.m, post.n);
        }
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter, xsna.dqp
    public final void D0(Bundle bundle) {
        UserId userId;
        if (bundle == null || (userId = (UserId) bundle.getParcelable("owner_id")) == null) {
            userId = UserId.d;
        }
        this.e0 = userId;
        super.D0(bundle);
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter
    public final void E(NewsEntry newsEntry) {
        c0(newsEntry);
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter
    public final void H(NewsEntry newsEntry, Integer num) {
        c0(newsEntry);
    }

    @Override // xsna.dqp
    public final String a() {
        return this.g0;
    }

    public final void c0(NewsEntry newsEntry) {
        if (newsEntry instanceof Post) {
            Post post = (Post) newsEntry;
            bqp.c(this.u, post.m, post.n);
            if (di60.C(newsEntry)) {
                super.A(newsEntry);
                i6k0 i6k0Var = this.d0.d0.y.e;
                if (i6k0Var != null) {
                    i6k0.a aVar = i6k0Var.c;
                    if (i6k0Var.b.get()) {
                        return;
                    }
                    RecyclerView.o layoutManager = i6k0Var.a.getLayoutManager();
                    LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                    if (linearLayoutManager == null) {
                        return;
                    }
                    aVar.setTargetPosition(0);
                    linearLayoutManager.startSmoothScroll(aVar);
                }
            }
        }
    }

    @Override // xsna.dqp, xsna.kvh
    public final String getRef() {
        return this.f0;
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<WallWithCounters> hj(com.vk.lists.c cVar, boolean z) {
        cVar.r(true);
        io.reactivex.rxjava3.core.q<WallWithCounters> ui = ui(0, cVar);
        p41 p41Var = new p41(new arf(this, 11), 18);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return ui.E(p41Var, lVar, kVar, kVar);
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter
    public final boolean r(NewsEntry newsEntry) {
        return di60.C(newsEntry);
    }

    @Override // com.vk.lists.c.l
    public final io.reactivex.rxjava3.core.q<WallWithCounters> ui(int i, com.vk.lists.c cVar) {
        return rsg0.y0(new a0u(this.e0, i, cVar.k()), null, null, 3);
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<WallWithCounters> qVar, boolean z, com.vk.lists.c cVar) {
        this.d0.eo(qVar.subscribe(new wn(new mh4(10, cVar, this), 24)));
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter
    public final com.vk.lists.c z() {
        c.h hVar = new c.h(this);
        hVar.c = 25;
        hVar.s = this.w;
        hVar.t = v();
        return this.d0.fn(hVar);
    }
}
