package xsna;

import android.os.Bundle;
import android.support.v4.media.session.PlaybackStateCompat;
import com.vk.dto.common.id.UserId;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import com.vk.dto.newsfeed.Flags;
import com.vk.dto.newsfeed.WallGetMode;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.libvideo.api.VideoAutoPlayDelayType;
import com.vk.lists.c;
import com.vk.newsfeed.impl.presenters.EntriesListPresenter;
import com.vk.newsfeed.impl.requests.WallGetMain;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import org.json.JSONObject;

/* compiled from: UserProfileMainWallPresenterImpl.kt */
/* loaded from: classes4.dex */
public final class lsq0 extends EntriesListPresenter implements c.m<WallGetMain.Result>, otq0 {
    public final pxq0 d0;
    public final b25 e0;
    public final wrq0 f0;
    public final sa30 g0;
    public UserId h0;
    public Boolean i0;
    public Pair<String, String> j0;
    public Boolean k0;
    public WallGetMode l0;
    public Integer m0;
    public int n0;
    public String o0;
    public boolean p0;
    public final a q0;
    public final Object r0;
    public final Object s0;
    public final Object t0;
    public final Object u0;

    /* compiled from: UserProfileMainWallPresenterImpl.kt */
    public final class a implements bd70<Object> {
        public a() {
        }

        @Override // xsna.bd70
        public final void x0(int i, int i2, Object obj) {
            if (i == 159) {
                lsq0.this.e0();
            }
        }
    }

    /* compiled from: UserProfileMainWallPresenterImpl.kt */
    public static final class b<V> implements Callable {
        public final /* synthetic */ NewsEntry c;

        public b(NewsEntry newsEntry) {
            this.c = newsEntry;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            NewsEntry newsEntry;
            lsq0 lsq0Var = lsq0.this;
            sa30 sa30Var = lsq0Var.g0;
            ArrayList<NewsEntry> arrayList = lsq0Var.d;
            NewsEntry newsEntry2 = this.c;
            if (!na60.e(newsEntry2)) {
                return arrayList;
            }
            Iterator<NewsEntry> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    newsEntry = null;
                    break;
                }
                newsEntry = it.next();
                NewsEntry newsEntry3 = newsEntry;
                if (na60.e(newsEntry3)) {
                    int u = di60.u(newsEntry3);
                    Integer num = lsq0Var.m0;
                    if (num != null && u == num.intValue()) {
                        break;
                    }
                }
            }
            NewsEntry newsEntry4 = newsEntry;
            boolean f = na60.f(newsEntry2);
            if (f && newsEntry4 != null) {
                lsq0Var.m0 = null;
                sa30Var.getClass();
                ArrayList S = sa30.S(newsEntry4, arrayList);
                lsq0Var.m0 = Integer.valueOf(di60.u(newsEntry2));
                sa30Var.getClass();
                return sa30.H(newsEntry2, S);
            }
            if (f) {
                lsq0Var.m0 = Integer.valueOf(di60.u(newsEntry2));
                sa30Var.getClass();
                return sa30.H(newsEntry2, arrayList);
            }
            lsq0Var.m0 = null;
            sa30Var.getClass();
            return sa30.S(newsEntry2, arrayList);
        }
    }

    /* compiled from: UserProfileMainWallPresenterImpl.kt */
    public static final class c implements io.reactivex.rxjava3.functions.f {
        public final /* synthetic */ msq0 b;

        public c(msq0 msq0Var) {
            this.b = msq0Var;
        }

        @Override // io.reactivex.rxjava3.functions.f
        public final /* synthetic */ void accept(Object obj) {
            this.b.invoke(obj);
        }
    }

    public lsq0(pxq0 pxq0Var, b25 b25Var, wrq0 wrq0Var) {
        super(pxq0Var);
        this.d0 = pxq0Var;
        this.e0 = b25Var;
        this.f0 = wrq0Var;
        this.g0 = new sa30();
        this.h0 = UserId.d;
        this.i0 = Boolean.FALSE;
        WallGetMode wallGetMode = WallGetMode.ALL;
        this.p0 = true;
        this.q0 = new a();
        avj0 avj0Var = new avj0(this, 13);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.r0 = msy.a(lazyThreadSafetyMode, avj0Var);
        this.s0 = msy.a(lazyThreadSafetyMode, new ksq0(this, 0));
        this.t0 = msy.a(lazyThreadSafetyMode, new cck0(this, 12));
        this.u0 = msy.a(lazyThreadSafetyMode, new buc0(12));
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter
    public final void A(NewsEntry newsEntry) {
        super.A(newsEntry);
        Post post = newsEntry instanceof Post ? (Post) newsEntry : null;
        Flags flags = post != null ? post.l : null;
        if (flags != null && !flags.zb(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) && !flags.zb(PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) && !flags.zb(PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)) {
            int i = this.n0 + 1;
            this.n0 = i;
            this.d0.v0(i);
        }
        f0();
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter
    public final void B(NewsEntry newsEntry) {
        if (newsEntry instanceof Post) {
            e0();
        }
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter
    public final void D(NewsEntry newsEntry, boolean z) {
        super.D(newsEntry, z);
        int i = this.n0 - 1;
        this.n0 = i;
        this.d0.v0(i);
        f0();
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter, xsna.dqp
    public final void D0(Bundle bundle) {
        UserId c2;
        String string;
        if (bundle == null || (c2 = (UserId) bundle.getParcelable("id")) == null) {
            c2 = this.e0.c();
        }
        k(c2);
        WallGetMode wallGetMode = null;
        this.o0 = bundle != null ? bundle.getString("track_code", null) : null;
        if (bundle != null && (string = bundle.getString("wall_mode", null)) != null) {
            try {
                wallGetMode = WallGetMode.valueOf(string);
            } catch (Exception e) {
                com.vk.metrics.eventtracking.b.a.a(e);
            }
        }
        this.l0 = wallGetMode;
        super.D0(bundle);
        ce60.b.getClass();
        p870.f().b(159, this.q0);
        io.reactivex.rxjava3.core.q<c5i> a2 = ((a5i) this.s0.getValue()).a();
        asu0 asu0Var = asu0.a;
        asu0Var.getClass();
        this.d0.a(a2.r0(asu0.i()).a0(asu0Var.d()).subscribe(new j7l0(new vlc0(this, 22), 7)));
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter
    public final void G(NewsEntry newsEntry) {
        if (newsEntry instanceof Post) {
            e0();
        }
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter
    public final void N() {
        e0();
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter
    public final void O(NewsfeedExternalAction.c.w wVar) {
        super.O(wVar);
        int i = this.n0 - 1;
        this.n0 = i;
        this.d0.v0(i);
        f0();
    }

    @Override // com.vk.lists.c.m
    public final io.reactivex.rxjava3.core.q<WallGetMain.Result> O9(String str, com.vk.lists.c cVar) {
        UserId userId = this.h0;
        int k = cVar.k();
        UserId userId2 = this.h0;
        this.g0.getClass();
        final WallGetMain wallGetMain = new WallGetMain(userId, k, sa30.C(userId2), str, this.o0, false);
        if (!epx.f(this.k0, Boolean.TRUE)) {
            return io.reactivex.rxjava3.core.q.T(WallGetMain.Result.b);
        }
        if (this.p0) {
            this.p0 = false;
            final JSONObject b2 = this.f0.b(this.h0);
            if (b2 != null) {
                io.reactivex.rxjava3.internal.operators.observable.s0 s0Var = new io.reactivex.rxjava3.internal.operators.observable.s0(new Callable() { // from class: xsna.jsq0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return WallGetMain.this.a(b2);
                    }
                });
                asu0 asu0Var = asu0.a;
                asu0Var.getClass();
                return s0Var.r0(asu0.i()).a0(asu0Var.d()).c0(rsg0.y0(wallGetMain, null, null, 3));
            }
        }
        return rsg0.y0(wallGetMain, null, null, 3);
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter
    public final void P(NewsEntry newsEntry) {
        super.D(newsEntry, false);
        this.n0--;
        f0();
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter
    public final void T(NewsEntry newsEntry) {
        if (na60.e(newsEntry)) {
            io.reactivex.rxjava3.internal.operators.single.b0 m = io.reactivex.rxjava3.subjects.c.b(asu0.a, new io.reactivex.rxjava3.internal.operators.single.v(new b(newsEntry))).m(io.reactivex.rxjava3.android.schedulers.a.b());
            c cVar = new c(new msq0(this));
            int i = kwg0.a;
            this.d0.a(m.subscribe(cVar, new iwg0()));
            HashMap hashMap = new HashMap();
            Iterator<NewsEntry> it = this.d.iterator();
            while (it.hasNext()) {
                NewsEntry next = it.next();
                if (na60.e(next) && epx.f(k9q0.o(next), k9q0.o(newsEntry))) {
                    if (next.equals(newsEntry)) {
                        hashMap.put(next, next);
                    } else if (na60.f(next)) {
                        na60.i(next, false);
                        hashMap.put(next, next);
                    }
                }
            }
            if (hashMap.isEmpty()) {
                return;
            }
            this.c.H(new com.vk.movika.sdk.base.logic.interactor.i(10, Collections.singleton(302), hashMap), new i50(hashMap, 28));
        }
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter
    public final void U(List<? extends NewsEntry> list, boolean z) {
        if (this.m0 != null) {
            e0();
        } else {
            super.U(list, true);
        }
    }

    @Override // xsna.otq0
    public final void b(Boolean bool) {
        com.vk.lists.c cVar = this.g;
        if (cVar != null) {
            cVar.r(bool.booleanValue());
        }
        this.k0 = bool;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final h7v d0() {
        return (h7v) this.t0.getValue();
    }

    public final void e0() {
        com.vk.lists.c cVar = this.g;
        if (cVar != null) {
            cVar.r(true);
            io.reactivex.rxjava3.core.q<WallGetMain.Result> O9 = O9(null, cVar);
            w250 w250Var = new w250(new r6i0(this, 12), 27);
            a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
            a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
            wd(O9.E(w250Var, lVar, kVar, kVar), true, cVar);
        }
    }

    @Override // xsna.otq0
    public final void f(boolean z) {
        com.vk.lists.c cVar = this.g;
        if (cVar != null) {
            io.reactivex.rxjava3.core.q<WallGetMain.Result> O9 = O9(null, cVar);
            nan0 nan0Var = new nan0(new fda0(this, 17), 4);
            a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
            a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
            io.reactivex.rxjava3.internal.operators.observable.b0 E = O9.E(nan0Var, lVar, kVar, kVar);
            cVar.r(true);
            wd(E, z, cVar);
        }
    }

    public final void f0() {
        int i = this.n0;
        pxq0 pxq0Var = this.d0;
        if (i <= 0) {
            pxq0Var.H1();
        } else {
            pxq0Var.w2();
        }
    }

    @Override // xsna.otq0
    public final Boolean g() {
        return this.i0;
    }

    public final void g0() {
        Hint p;
        boolean z = d0().p(HintId.USER_PROFILE_MAIN_WALL_TAB_ONBOARDING.getId()) == null;
        if (d0().n() || !z || !this.e0.a(this.h0) || (p = d0().p(HintId.USER_PROFILE_MAIN_WALL_POST_OPTIONS_ONBOARDING.getId())) == null) {
            return;
        }
        this.d0.Ej(p.c, new z6f0(this, 21), new lb6(27, this, p));
    }

    @Override // xsna.otq0
    public final UserId getUid() {
        return this.h0;
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter, xsna.dqp
    public final VideoAutoPlayDelayType getVideoAutoPlayDelayType() {
        return VideoAutoPlayDelayType.WALL;
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<WallGetMain.Result> hj(com.vk.lists.c cVar, boolean z) {
        return O9(null, cVar);
    }

    @Override // xsna.otq0
    public final void i(Pair<String, String> pair) {
        this.j0 = pair;
    }

    @Override // xsna.otq0
    public final void k(UserId userId) {
        this.h0 = userId;
        this.d0.M0().x = userId;
    }

    @Override // xsna.otq0
    public final Boolean l() {
        return this.k0;
    }

    @Override // xsna.otq0
    public final void m(Boolean bool) {
        this.i0 = bool;
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter, xsna.dqp
    public final void onDestroyView() {
        super.onDestroyView();
        ce60.b.getClass();
        p870.f().g(this.q0);
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter
    public final boolean r(NewsEntry newsEntry) {
        if (!(newsEntry instanceof Post)) {
            return false;
        }
        Post post = (Post) newsEntry;
        Flags flags = post.l;
        return (!epx.f(post.m, this.h0) || flags.zb(PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) || flags.zb(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) || flags.zb(PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)) ? false : true;
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<WallGetMain.Result> qVar, boolean z, com.vk.lists.c cVar) {
        this.d0.a(qVar.subscribe(new zyu(new thu(cVar, this, z, 2), 27), new o060(new m2l0(this, 11), 17)));
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter
    public final com.vk.lists.c z() {
        c.h hVar = new c.h(this);
        hVar.c = 25;
        hVar.s = this.w;
        hVar.t = v();
        hVar.l = false;
        hVar.m = false;
        hVar.g = false;
        return this.d0.fn(hVar);
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter
    public final void Q(NewsEntry newsEntry) {
    }

    @Override // xsna.otq0
    public final void e(WallGetMode wallGetMode) {
    }
}
