package xsna;

import android.os.Bundle;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.photo.Photo;
import com.vk.feedlikes.fragments.FeedLikesFragment;
import com.vk.lists.ListDataSet;
import com.vk.lists.c;
import com.vk.newsfeed.impl.feedlikes.FeedLikesFilter;
import com.vk.newsfeed.impl.presenters.EntriesListPresenter;
import com.vungle.ads.internal.protos.Sdk;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Iterator;
import java.util.List;

/* compiled from: FeedLikesPresenter.kt */
/* loaded from: classes18.dex */
public final class p1r extends EntriesListPresenter implements c.m {
    public static final String k0 = j5g.g0(e43.l("id", "first_name", "first_name_dat", "first_name_gen", "last_name", "last_name_dat", "last_name_gen", "sex", "screen_name", "photo_base", "online_info", "video_files", "verified", "trending", "is_verified", "is_member", "friend_status", "has_unseen_stories"), StringUtils.COMMA, null, null, 0, null, 62);
    public final FeedLikesFragment d0;
    public FeedLikesFilter e0;
    public final ListDataSet<List<Photo>> f0;
    public final io.reactivex.rxjava3.disposables.g g0;
    public final o1r h0;
    public final String i0;
    public final String j0;

    /* JADX WARN: Type inference failed for: r1v4, types: [xsna.o1r] */
    public p1r(FeedLikesFragment feedLikesFragment) {
        super(feedLikesFragment);
        this.d0 = feedLikesFragment;
        this.e0 = FeedLikesFilter.ALL;
        this.f0 = new ListDataSet<>();
        this.g0 = new io.reactivex.rxjava3.disposables.g();
        this.h0 = new bd70() { // from class: xsna.o1r
            @Override // xsna.bd70
            public final void x0(int i, int i2, Object obj) {
                if (i == 118 && (obj instanceof FeedLikesFilter)) {
                    FeedLikesFilter feedLikesFilter = (FeedLikesFilter) obj;
                    FeedLikesFilter.Companion.getClass();
                    int indexOf = FeedLikesFilter.a.a().indexOf(feedLikesFilter);
                    if (indexOf > 0) {
                        com.vk.newsfeed.impl.feedlikes.a.g = indexOf;
                    } else {
                        com.vk.newsfeed.impl.feedlikes.a.g = 0;
                    }
                    p1r p1rVar = p1r.this;
                    p1rVar.e0 = feedLikesFilter;
                    p1rVar.d0.so(true);
                    io.reactivex.rxjava3.disposables.c a = p1rVar.g0.a();
                    if (a != null && !a.h()) {
                        a.dispose();
                    }
                    com.vk.lists.c cVar = p1rVar.g;
                    if (cVar != null) {
                        cVar.p(true);
                    }
                }
            }
        };
        this.i0 = "FEED_LIKES";
        this.j0 = "FEED_LIKES";
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter, xsna.dqp
    public final void D0(Bundle bundle) {
        super.D0(bundle);
        ce60.b.getClass();
        p870.f().b(Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, this.h0);
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter
    public final void L(Photo photo) {
        boolean z;
        super.L(photo);
        ListDataSet<List<Photo>> listDataSet = this.f0;
        List<Photo> list = (List) j5g.a0(listDataSet.d);
        if (list != null) {
            z = false;
            for (Photo photo2 : list) {
                if (epx.f(photo2.e, photo.e)) {
                    photo2.L = null;
                    z = true;
                }
            }
        } else {
            z = false;
        }
        if (z) {
            listDataSet.d(0);
        }
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter
    public final void M(Photo photo) {
        Photo photo2;
        Object obj;
        super.M(photo);
        ListDataSet<List<Photo>> listDataSet = this.f0;
        List list = (List) j5g.a0(listDataSet.d);
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (epx.f((Photo) obj, photo)) {
                        break;
                    }
                }
            }
            photo2 = (Photo) obj;
        } else {
            photo2 = null;
        }
        if (photo2 != null) {
            photo2.L = null;
            listDataSet.d(0);
        }
    }

    @Override // com.vk.lists.c.m
    public final io.reactivex.rxjava3.core.q<krt> O9(String str, com.vk.lists.c cVar) {
        String i;
        if (str == null) {
            str = "0";
        }
        FeedLikesFilter feedLikesFilter = this.e0;
        if (feedLikesFilter == FeedLikesFilter.ALL) {
            FeedLikesFilter.Companion.getClass();
            i = rli0.r(rli0.m(new ulp0(new i5g(FeedLikesFilter.a.a()), new x90(18))), StringUtils.COMMA, null, 62);
        } else {
            i = feedLikesFilter.i();
        }
        return rsg0.y0(new jrt(str, i, k0), null, null, 3);
    }

    @Override // xsna.dqp
    public final String a() {
        return this.j0;
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter, xsna.dqp
    public final boolean a0() {
        UiTracker uiTracker = UiTracker.a;
        UiTracker.i.g();
        return false;
    }

    @Override // xsna.dqp, xsna.kvh
    public final String getRef() {
        return this.i0;
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<krt> hj(com.vk.lists.c cVar, boolean z) {
        cVar.r(true);
        return O9("0", cVar);
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter, xsna.dqp
    public final void onDestroy() {
        ce60.b.getClass();
        p870.f().g(this.h0);
        super.onDestroy();
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter, xsna.dqp
    public final void onDestroyView() {
        io.reactivex.rxjava3.disposables.c a = this.g0.a();
        if (a != null && !a.h()) {
            a.dispose();
        }
        super.onDestroyView();
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<krt> qVar, boolean z, com.vk.lists.c cVar) {
        io.reactivex.rxjava3.disposables.c subscribe = qVar.subscribe(new m1r(new l1r(cVar, this, z, 0), 0), new n1r(new dxh(this, 16), 0));
        if (subscribe != null) {
            this.g0.b(subscribe);
        }
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
