package xsna;

import android.os.Bundle;
import android.support.v4.media.session.PlaybackStateCompat;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.core.preference.Preference;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Flags;
import com.vk.dto.newsfeed.WallGetMode;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.libvideo.api.VideoAutoPlayDelayType;
import com.vk.lists.c;
import com.vk.newsfeed.impl.presenters.EntriesListPresenter;
import com.vk.newsfeed.impl.requests.WallWithCounters;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;

/* compiled from: UserProfileWallPresenterImpl.kt */
/* loaded from: classes4.dex */
public final class zwq0 extends EntriesListPresenter implements c.m<WallWithCounters>, otq0 {
    public final pxq0 d0;
    public final b25 e0;
    public final sa30 f0;
    public UserId g0;
    public Boolean h0;
    public WallGetMode i0;
    public WallGetMode j0;
    public Integer k0;
    public int l0;
    public boolean m0;
    public int n0;
    public int o0;
    public Boolean p0;
    public io.reactivex.rxjava3.internal.operators.observable.k q0;
    public io.reactivex.rxjava3.disposables.c r0;

    /* compiled from: UserProfileWallPresenterImpl.kt */
    public static final class a<V> implements Callable {
        public final /* synthetic */ NewsEntry c;

        public a(NewsEntry newsEntry) {
            this.c = newsEntry;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            zwq0 zwq0Var = zwq0.this;
            ArrayList<NewsEntry> arrayList = zwq0Var.d;
            sa30 sa30Var = zwq0Var.f0;
            Post post = (Post) this.c;
            Post d0 = zwq0Var.d0();
            Flags flags = post.l;
            int i = post.n;
            boolean zb = flags.zb(PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID);
            if (zb && d0 != null) {
                zwq0Var.k0 = null;
                sa30Var.getClass();
                ArrayList S = sa30.S(d0, arrayList);
                zwq0Var.k0 = Integer.valueOf(i);
                sa30Var.getClass();
                return sa30.H(post, S);
            }
            if (zb) {
                zwq0Var.k0 = Integer.valueOf(i);
                sa30Var.getClass();
                return sa30.H(post, arrayList);
            }
            zwq0Var.k0 = null;
            sa30Var.getClass();
            return sa30.S(post, arrayList);
        }
    }

    /* compiled from: UserProfileWallPresenterImpl.kt */
    public static final class b<V> implements Callable {
        public b() {
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            zwq0 zwq0Var = zwq0.this;
            ArrayList<NewsEntry> arrayList = zwq0Var.d;
            Post d0 = zwq0Var.d0();
            if (d0 == null) {
                return arrayList;
            }
            zwq0Var.k0 = Integer.valueOf(d0.n);
            zwq0Var.f0.getClass();
            return sa30.H(d0, arrayList);
        }
    }

    /* compiled from: UserProfileWallPresenterImpl.kt */
    public static final class c implements io.reactivex.rxjava3.functions.f {
        public final /* synthetic */ axq0 b;

        public c(axq0 axq0Var) {
            this.b = axq0Var;
        }

        @Override // io.reactivex.rxjava3.functions.f
        public final /* synthetic */ void accept(Object obj) {
            this.b.invoke(obj);
        }
    }

    public zwq0(pxq0 pxq0Var, b25 b25Var, WallGetMode wallGetMode) {
        super(pxq0Var);
        this.d0 = pxq0Var;
        this.e0 = b25Var;
        this.f0 = new sa30();
        this.g0 = UserId.d;
        this.h0 = Boolean.FALSE;
        this.i0 = wallGetMode;
        this.r0 = EmptyDisposable.INSTANCE;
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter
    public final void A(NewsEntry newsEntry) {
        super.A(newsEntry);
        boolean z = newsEntry instanceof Post;
        Post post = z ? (Post) newsEntry : null;
        Flags flags = post != null ? post.l : null;
        pxq0 pxq0Var = this.d0;
        if (flags != null && !flags.zb(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) && !flags.zb(PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) && !flags.zb(PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)) {
            int i = this.l0 + 1;
            this.l0 = i;
            pxq0Var.v0(i);
        }
        if (flags != null && !flags.zb(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) && !flags.zb(PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) && e0() && ((Post) newsEntry).Fb()) {
            pxq0Var.j();
            pxq0Var.i();
        }
        g0();
        if (z) {
            Post post2 = (Post) newsEntry;
            if (post2.oc()) {
                int i2 = post2.r;
                h6m0 h6m0Var = new h6m0(this, 8);
                this.f0.getClass();
                pxq0Var.a(sa30.O(i2, h6m0Var));
            }
        }
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter
    public final void B(NewsEntry newsEntry) {
        if ((newsEntry instanceof Post) && this.i0 != WallGetMode.ARCHIVED && e0()) {
            boolean b2 = this.u.b(newsEntry, false);
            pxq0 pxq0Var = this.d0;
            if (b2) {
                int i = this.l0 - 1;
                this.l0 = i;
                pxq0Var.v0(i);
            }
            pxq0Var.U9(true, false);
            g0();
        }
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter
    public final void D(NewsEntry newsEntry, boolean z) {
        super.D(newsEntry, z);
        if (newsEntry instanceof Post) {
            Flags flags = ((Post) newsEntry).l;
            if (flags.zb(PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH)) {
                int i = this.n0 - 1;
                this.n0 = i;
                h0(i);
            }
            boolean zb = flags.zb(PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
            pxq0 pxq0Var = this.d0;
            if (zb) {
                int i2 = this.o0 - 1;
                this.o0 = i2;
                pxq0Var.a8(i2);
            }
            if (e0() && (!flags.zb(PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) || flags.zb(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM))) {
                int i3 = this.l0 - 1;
                this.l0 = i3;
                pxq0Var.v0(i3);
                if (this.i0 == WallGetMode.ARCHIVED && this.l0 == 0) {
                    pxq0Var.U9(false, false);
                }
            }
        }
        g0();
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter, xsna.dqp
    public final void D0(Bundle bundle) {
        UserId c2;
        String string;
        if (bundle == null || (c2 = (UserId) bundle.getParcelable("id")) == null) {
            c2 = this.e0.c();
        }
        k(c2);
        if (bundle != null) {
            bundle.getString("access_key");
        }
        if (bundle != null) {
            bundle.getString("referrer", "");
        }
        WallGetMode wallGetMode = null;
        if (bundle != null) {
            bundle.getString("track_code", null);
        }
        if (bundle != null && (string = bundle.getString("wall_mode", null)) != null) {
            try {
                wallGetMode = WallGetMode.valueOf(string);
            } catch (Exception e) {
                com.vk.metrics.eventtracking.b.a.a(e);
            }
        }
        this.j0 = wallGetMode;
        super.D0(bundle);
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter
    public final void G(NewsEntry newsEntry) {
        if ((newsEntry instanceof Post) && this.i0 == WallGetMode.ARCHIVED && e0()) {
            if (this.u.b(newsEntry, false)) {
                int i = this.l0 - 1;
                this.l0 = i;
                pxq0 pxq0Var = this.d0;
                pxq0Var.v0(i);
                if (this.l0 == 0) {
                    pxq0Var.U9(false, true);
                }
            }
            g0();
        }
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter
    public final void O(NewsfeedExternalAction.c.w wVar) {
        super.O(wVar);
        boolean z = wVar.c;
        if (z) {
            int i = this.n0 - 1;
            this.n0 = i;
            h0(i);
        }
        boolean z2 = wVar.e;
        pxq0 pxq0Var = this.d0;
        if (z2) {
            int i2 = this.o0 - 1;
            this.o0 = i2;
            pxq0Var.a8(i2);
        }
        if (e0() && (!z || wVar.d)) {
            int i3 = this.l0 - 1;
            this.l0 = i3;
            pxq0Var.v0(i3);
            if (this.i0 == WallGetMode.ARCHIVED && this.l0 == 0) {
                pxq0Var.U9(false, false);
            }
        }
        g0();
    }

    @Override // com.vk.lists.c.m
    public final io.reactivex.rxjava3.core.q<WallWithCounters> O9(String str, com.vk.lists.c cVar) {
        if (!epx.f(this.p0, Boolean.TRUE)) {
            return io.reactivex.rxjava3.core.q.T(WallWithCounters.b);
        }
        UserId userId = this.g0;
        int k = cVar.k();
        WallGetMode wallGetMode = this.i0;
        UserId userId2 = this.g0;
        this.f0.getClass();
        return rsg0.y0(new gxt(userId, str, k, wallGetMode, sa30.C(userId2), false).a(this.e0.a(this.g0)), null, null, 3);
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter
    public final void P(NewsEntry newsEntry) {
        F(newsEntry, newsEntry);
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter
    public final void Q(NewsEntry newsEntry) {
        if (newsEntry instanceof Post) {
            io.reactivex.rxjava3.internal.operators.single.b0 m = io.reactivex.rxjava3.subjects.c.b(asu0.a, new io.reactivex.rxjava3.internal.operators.single.v(new a(newsEntry))).m(io.reactivex.rxjava3.android.schedulers.a.b());
            c cVar = new c(new axq0(this));
            int i = kwg0.a;
            this.d0.a(m.subscribe(cVar, new iwg0()));
            super.Q(newsEntry);
        }
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter
    public final void U(List<? extends NewsEntry> list, boolean z) {
        super.U(list, true);
        if (this.k0 != null) {
            io.reactivex.rxjava3.internal.operators.single.b0 m = io.reactivex.rxjava3.subjects.c.b(asu0.a, new io.reactivex.rxjava3.internal.operators.single.v(new b())).m(io.reactivex.rxjava3.android.schedulers.a.b());
            c cVar = new c(new axq0(this));
            int i = kwg0.a;
            this.d0.a(m.subscribe(cVar, new iwg0()));
        }
    }

    @Override // xsna.dqp
    public final String a() {
        StringBuilder sb = new StringBuilder();
        sb.append(fkq0.b(this.g0) ? "club" : CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE);
        sb.append(this.g0.b);
        return sb.toString();
    }

    @Override // xsna.otq0
    public final void b(Boolean bool) {
        com.vk.lists.c cVar = this.g;
        if (cVar != null) {
            cVar.r(bool.booleanValue());
        }
        this.p0 = bool;
    }

    public final Post d0() {
        Object obj;
        Iterator<T> it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            NewsEntry newsEntry = (NewsEntry) obj;
            if (newsEntry instanceof Post) {
                int i = ((Post) newsEntry).n;
                Integer num = this.k0;
                if (num != null && i == num.intValue()) {
                    break;
                }
            }
        }
        if (obj instanceof Post) {
            return (Post) obj;
        }
        return null;
    }

    @Override // xsna.otq0
    public final void e(WallGetMode wallGetMode) {
        if (this.i0 == wallGetMode) {
            this.d0.g3();
        } else {
            this.i0 = wallGetMode;
            f0(true);
        }
    }

    public final boolean e0() {
        b25 b25Var = this.e0;
        return b25Var.b() && b25Var.a(this.g0);
    }

    @Override // xsna.otq0
    public final void f(boolean z) {
        f0(z);
    }

    public final void f0(boolean z) {
        com.vk.lists.c cVar = this.g;
        if (cVar != null) {
            cVar.r(true);
            io.reactivex.rxjava3.internal.operators.observable.k kVar = this.q0;
            a.k kVar2 = io.reactivex.rxjava3.internal.functions.a.c;
            a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
            io.reactivex.rxjava3.core.q<WallWithCounters> E = (z || kVar == null) ? O9(null, cVar).E(new onm0(new q8i0(this, 15), 3), lVar, kVar2, kVar2) : kVar.a0(asu0.a.d()).E(new pmu(new mdm0(this, 9), 27), lVar, kVar2, kVar2);
            io.reactivex.rxjava3.core.q<WallWithCounters> g = cVar.g(E, false, false);
            if (g != null) {
                E = g;
            }
            wd(E, true, cVar);
            this.q0 = null;
        }
    }

    @Override // xsna.otq0
    public final Boolean g() {
        return this.h0;
    }

    public final void g0() {
        WallGetMode wallGetMode = this.i0;
        WallGetMode wallGetMode2 = WallGetMode.ALL;
        pxq0 pxq0Var = this.d0;
        if ((wallGetMode == wallGetMode2 || wallGetMode == WallGetMode.OWNER) && e0() && this.l0 <= 0 && this.m0) {
            pxq0Var.hf();
        } else if (this.l0 <= 0) {
            pxq0Var.H1();
        } else {
            pxq0Var.w2();
        }
    }

    @Override // xsna.dqp, xsna.kvh
    public final String getRef() {
        return fkq0.d(this.g0) ? "wall_user" : "wall_group";
    }

    @Override // xsna.otq0
    public final UserId getUid() {
        return this.g0;
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter, xsna.dqp
    public final VideoAutoPlayDelayType getVideoAutoPlayDelayType() {
        return VideoAutoPlayDelayType.WALL;
    }

    public final void h0(int i) {
        if (e0()) {
            Preference.l().edit().putInt("postponed_count", i).commit();
        }
        this.d0.Rj(i);
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<WallWithCounters> hj(com.vk.lists.c cVar, boolean z) {
        return O9(null, cVar);
    }

    @Override // xsna.otq0
    public final void k(UserId userId) {
        UserId userId2;
        if (userId.equals(this.g0)) {
            userId2 = userId;
        } else {
            this.d0.M0().x = userId;
            this.r0.dispose();
            WallGetMode wallGetMode = this.i0;
            this.f0.getClass();
            userId2 = userId;
            io.reactivex.rxjava3.internal.operators.observable.k e = rsg0.T(new gxt(userId2, null, 10, wallGetMode, sa30.C(userId), false).a(this.e0.a(userId2))).e();
            this.r0 = e.A(50L, TimeUnit.MILLISECONDS).subscribe(new o9w(new d230(19)), new knd(new wx30(17), 3));
            this.q0 = e;
        }
        this.g0 = userId2;
    }

    @Override // xsna.otq0
    public final Boolean l() {
        return this.p0;
    }

    @Override // xsna.otq0
    public final void m(Boolean bool) {
        this.h0 = bool;
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter, xsna.dqp
    public final void onDestroy() {
        this.r0.dispose();
        super.onDestroy();
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter
    public final boolean r(NewsEntry newsEntry) {
        if (newsEntry instanceof Post) {
            Post post = (Post) newsEntry;
            Flags flags = post.l;
            if (!epx.f(post.m, this.g0) || this.i0 == WallGetMode.ARCHIVED) {
                return false;
            }
            if (flags.zb(PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH)) {
                int i = this.n0 + 1;
                this.n0 = i;
                h0(i);
                return false;
            }
            if (!flags.zb(PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)) {
                return this.i0 != WallGetMode.OWNER || epx.f(post.o.b, this.g0);
            }
            int i2 = this.o0 + 1;
            this.o0 = i2;
            this.d0.a8(i2);
            return false;
        }
        return false;
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<WallWithCounters> qVar, boolean z, com.vk.lists.c cVar) {
        this.d0.a(qVar.subscribe(new o3y(new ovc0(cVar, this, z), 29), new h8l0(new wgm0(this, 7), 5)));
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter, xsna.dqp
    public final MobileOfficialAppsCoreNavStat$EventScreen x0() {
        if (fkq0.b(this.g0)) {
            return MobileOfficialAppsCoreNavStat$EventScreen.GROUP;
        }
        UiTracker uiTracker = UiTracker.a;
        return UiTracker.c();
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
        hVar.i = 10;
        return this.d0.fn(hVar);
    }

    @Override // xsna.otq0
    public final void i(Pair<String, String> pair) {
    }
}
