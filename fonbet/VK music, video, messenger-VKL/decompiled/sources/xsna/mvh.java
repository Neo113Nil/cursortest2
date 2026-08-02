package xsna;

import android.os.Bundle;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.vk.ads.yandex.api.di.YandexAdFeatureComponent;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.GroupContentTabSetting;
import com.vk.dto.group.GroupContentTabType;
import com.vk.dto.newsfeed.Flags;
import com.vk.dto.newsfeed.WallGetMode;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.core.models.news.YandexNativeAdEntry;
import com.vk.libvideo.api.VideoAutoPlayDelayType;
import com.vk.lists.c;
import com.vk.newsfeed.impl.presenters.EntriesListPresenter;
import com.vk.newsfeed.impl.requests.WallWithCounters;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.repository.data.api.ExtendedProfilesRepository;
import com.vk.toggle.features.FeedFeatures;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vkontakte.android.api.ExtendedUserProfile;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.LazyThreadSafetyMode;

/* compiled from: CommunityProfileWallPresenterImpl.kt */
/* loaded from: classes4.dex */
public final class mvh extends EntriesListPresenter implements c.m<WallWithCounters>, kvh {
    public final awh d0;
    public final UserId e0;
    public final ExtendedCommunityProfile f0;
    public final ExtendedProfilesRepository g0;
    public final sa30 h0;
    public final Object i0;
    public final Object j0;
    public final String k0;
    public final String l0;
    public int m0;
    public int n0;
    public int o0;
    public int p0;
    public final LinkedHashSet q0;
    public boolean r0;
    public Integer s0;
    public final WallGetMode t0;
    public final boolean u0;
    public Boolean v0;

    /* compiled from: CommunityProfileWallPresenterImpl.kt */
    public static final class a<V> implements Callable {
        public final /* synthetic */ NewsEntry c;

        public a(NewsEntry newsEntry) {
            this.c = newsEntry;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            NewsEntry newsEntry;
            mvh mvhVar = mvh.this;
            sa30 sa30Var = mvhVar.h0;
            Post post = (Post) this.c;
            ArrayList<NewsEntry> arrayList = mvhVar.d;
            Iterator<NewsEntry> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    newsEntry = null;
                    break;
                }
                newsEntry = it.next();
                NewsEntry newsEntry2 = newsEntry;
                if (newsEntry2 instanceof Post) {
                    int i = ((Post) newsEntry2).n;
                    Integer num = mvhVar.s0;
                    if (num != null && i == num.intValue()) {
                        break;
                    }
                }
            }
            Post post2 = newsEntry instanceof Post ? (Post) newsEntry : null;
            boolean mc = post.mc();
            int i2 = post.n;
            if (mc && post2 != null) {
                mvhVar.s0 = null;
                sa30Var.getClass();
                ArrayList S = sa30.S(post2, arrayList);
                mvhVar.s0 = Integer.valueOf(i2);
                sa30Var.getClass();
                return sa30.H(post, S);
            }
            if (mc) {
                mvhVar.s0 = Integer.valueOf(i2);
                sa30Var.getClass();
                return sa30.H(post, arrayList);
            }
            mvhVar.s0 = null;
            sa30Var.getClass();
            return sa30.S(post, arrayList);
        }
    }

    /* compiled from: CommunityProfileWallPresenterImpl.kt */
    public static final class b implements io.reactivex.rxjava3.functions.f {
        public final /* synthetic */ dr8 b;

        public b(dr8 dr8Var) {
            this.b = dr8Var;
        }

        @Override // io.reactivex.rxjava3.functions.f
        public final /* synthetic */ void accept(Object obj) {
            this.b.invoke(obj);
        }
    }

    public mvh(awh awhVar, UserId userId, ExtendedCommunityProfile extendedCommunityProfile, ExtendedProfilesRepository extendedProfilesRepository, WallGetMode wallGetMode) {
        super(awhVar);
        this.d0 = awhVar;
        this.e0 = userId;
        this.f0 = extendedCommunityProfile;
        this.g0 = extendedProfilesRepository;
        this.h0 = new sa30();
        vf0 vf0Var = new vf0(this, 28);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.i0 = msy.a(lazyThreadSafetyMode, vf0Var);
        this.j0 = msy.a(lazyThreadSafetyMode, new b3(this, 28));
        this.k0 = "wall_group";
        this.l0 = "club" + userId.b;
        this.q0 = new LinkedHashSet();
        this.t0 = wallGetMode;
        this.u0 = wallGetMode == WallGetMode.DONUT;
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter
    public final void A(NewsEntry newsEntry) {
        super.A(newsEntry);
        if (newsEntry instanceof Post) {
            Post post = (Post) newsEntry;
            if (!post.l.zb(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM)) {
                h0();
            }
            boolean oc = post.oc();
            awh awhVar = this.d0;
            if (oc) {
                int i = post.r;
                v6 v6Var = new v6(this, 24);
                this.h0.getClass();
                awhVar.a(sa30.O(i, v6Var));
            }
            if (!post.oc() && !post.rc() && !post.Z1() && post.o1() == this.u0) {
                int i2 = this.m0 + 1;
                this.m0 = i2;
                awhVar.v0(i2);
            }
            f0();
            awhVar.Wb(post);
        }
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter, xsna.dqp
    public final void A0(FragmentImpl fragmentImpl) {
        super.A0(fragmentImpl);
        if (this.d0.s1() && this.r0) {
            this.r0 = false;
            h0();
        }
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter
    public final void C() {
        this.d0.S7(0, 0);
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter
    public final void D(NewsEntry newsEntry, boolean z) {
        if (!(newsEntry instanceof Post)) {
            super.D(newsEntry, z);
            f0();
        } else {
            Post post = (Post) newsEntry;
            Flags flags = post.l;
            O(new NewsfeedExternalAction.c.w(post.m, post.n, flags.zb(PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH), flags.zb(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM), flags.zb(PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED), post.o1()));
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter, xsna.dqp
    public final void D0(Bundle bundle) {
        super.D0(bundle);
        io.reactivex.rxjava3.core.q<c5i> a2 = ((a5i) this.i0.getValue()).a();
        asu0 asu0Var = asu0.a;
        asu0Var.getClass();
        this.d0.a(a2.r0(asu0.i()).a0(asu0Var.d()).subscribe(new lf1(new wl0(this, 27), 17)));
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter
    public final void O(NewsfeedExternalAction.c.w wVar) {
        super.O(wVar);
        boolean z = wVar.c;
        awh awhVar = this.d0;
        if (z) {
            int i = this.n0 - 1;
            this.n0 = i;
            awhVar.W3(i, this.o0, this.p0);
            return;
        }
        boolean z2 = wVar.d;
        if (z2) {
            int i2 = this.n0;
            int i3 = this.o0 - 1;
            this.o0 = i3;
            awhVar.W3(i2, i3, this.p0);
            return;
        }
        if (wVar.e) {
            int i4 = this.n0;
            int i5 = this.o0;
            int i6 = this.p0 - 1;
            this.p0 = i6;
            awhVar.W3(i4, i5, i6);
            return;
        }
        boolean z3 = wVar.f;
        if (!z && !z2 && z3 == this.u0) {
            int i7 = this.m0 - 1;
            this.m0 = i7;
            awhVar.v0(i7);
        }
        f0();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.lists.c.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final io.reactivex.rxjava3.core.q<WallWithCounters> O9(String str, com.vk.lists.c cVar) {
        boolean z;
        if (!this.u0) {
            Boolean bool = this.v0;
            if (!(bool != null ? bool.booleanValue() : false)) {
                z = false;
                if (z) {
                    return io.reactivex.rxjava3.internal.operators.observable.g0.b;
                }
                ExtendedUserProfile L0 = this.g0.L0(this.e0);
                int i = L0 != null ? L0.a0 : 0;
                int k = cVar.k();
                FeedFeatures feedFeatures = FeedFeatures.FEED_YANDEX_AD;
                feedFeatures.getClass();
                gxt gxtVar = new gxt(this.e0, str, k, this.t0, "club", (com.vk.toggle.b.A.a(feedFeatures) && ((YandexAdFeatureComponent) this.j0.getValue()).e5().isInitialized()) ? !TextUtils.isEmpty((String) hd60.a().a().a(m6r0.H0)) : false);
                return rsg0.y0(i >= 2 ? new fxt(yfb.z(gxtVar.c(), new y8(22)), gxtVar.b("suggests"), gxtVar.b("postponed"), gxtVar.b("drafts")) : new fxt(yfb.z(gxtVar.c(), new y8(22)), gxtVar.b("suggests"), null, null, 12), null, null, 3);
            }
        }
        z = true;
        if (z) {
        }
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter
    public final void P(NewsEntry newsEntry) {
        F(newsEntry, newsEntry);
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter
    public final void Q(NewsEntry newsEntry) {
        if (newsEntry instanceof Post) {
            io.reactivex.rxjava3.internal.operators.single.b0 m = io.reactivex.rxjava3.subjects.c.b(asu0.a, new io.reactivex.rxjava3.internal.operators.single.v(new a(newsEntry))).m(io.reactivex.rxjava3.android.schedulers.a.b());
            b bVar = new b(new dr8(this, 2));
            int i = kwg0.a;
            this.d0.a(m.subscribe(bVar, new iwg0()));
            super.Q(newsEntry);
        }
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter
    public final void R(int i, int i2, NewsEntry newsEntry) {
        super.R(i, i2, newsEntry);
        if (i == 101 && this.d.indexOf(newsEntry) == 0) {
            Post post = newsEntry instanceof Post ? (Post) newsEntry : null;
            if (post != null) {
                this.d0.Ea(post.n);
            }
        }
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter
    public final void S(NewsEntry newsEntry) {
        F(newsEntry, newsEntry);
        if (newsEntry instanceof Post) {
            this.o0 = ((Post) newsEntry).ic() ? this.o0 - 1 : this.o0 + 1;
            this.d0.W3(this.n0, this.o0, this.p0);
        }
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter
    public final void U(List<? extends NewsEntry> list, boolean z) {
        if (this.s0 != null) {
            e0();
        } else {
            super.U(list, true);
        }
    }

    @Override // xsna.dqp
    public final String a() {
        return this.l0;
    }

    @Override // xsna.kvh
    public final void b(Boolean bool) {
        com.vk.lists.c cVar = this.g;
        if (cVar != null) {
            cVar.r(bool.booleanValue());
        }
        this.v0 = bool;
    }

    public final void e0() {
        com.vk.lists.c cVar = this.g;
        if (cVar != null) {
            cVar.r(true);
            io.reactivex.rxjava3.core.q<WallWithCounters> O9 = O9(null, cVar);
            tp0 tp0Var = new tp0(new zx0(this, 29), 18);
            a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
            a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
            wd(O9.E(tp0Var, lVar, kVar, kVar), true, cVar);
        }
    }

    @Override // xsna.kvh
    public final void f(boolean z) {
        List<GroupContentTabSetting> list;
        Object obj;
        List<GroupContentTabSetting> list2;
        Object obj2;
        boolean z2 = this.u0;
        awh awhVar = this.d0;
        ExtendedCommunityProfile extendedCommunityProfile = this.f0;
        if (z2) {
            if (extendedCommunityProfile != null && (list2 = extendedCommunityProfile.U2) != null) {
                Iterator<T> it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = it.next();
                        if (((GroupContentTabSetting) obj2).b == GroupContentTabType.DONUT_WALL) {
                            break;
                        }
                    }
                }
                GroupContentTabSetting groupContentTabSetting = (GroupContentTabSetting) obj2;
                if (groupContentTabSetting != null && groupContentTabSetting.i) {
                    awhVar.g3();
                    f0();
                    return;
                }
            }
        } else if (extendedCommunityProfile != null && (list = extendedCommunityProfile.U2) != null) {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it2.next();
                    if (((GroupContentTabSetting) obj).b == GroupContentTabType.WALL) {
                        break;
                    }
                }
            }
            GroupContentTabSetting groupContentTabSetting2 = (GroupContentTabSetting) obj;
            if (groupContentTabSetting2 != null && groupContentTabSetting2.i) {
                awhVar.g3();
                f0();
                return;
            }
        }
        com.vk.lists.c cVar = this.g;
        if (cVar != null) {
            io.reactivex.rxjava3.core.q<WallWithCounters> O9 = O9(null, cVar);
            ga gaVar = new ga(new wzf(this, 4), 22);
            a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
            a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
            io.reactivex.rxjava3.internal.operators.observable.b0 E = O9.E(gaVar, lVar, kVar, kVar);
            cVar.r(true);
            wd(E, z, cVar);
        }
    }

    public final void f0() {
        int i = this.m0;
        awh awhVar = this.d0;
        if (i <= 0) {
            awhVar.H1();
        } else {
            awhVar.w2();
        }
    }

    public final void g0(Post post) {
        Flags flags = post.l;
        int i = post.n;
        boolean zb = flags.zb(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
        awh awhVar = this.d0;
        if (zb) {
            int i2 = this.n0;
            int i3 = this.o0 + 1;
            this.o0 = i3;
            awhVar.W3(i2, i3, this.p0);
        }
        if (flags.zb(PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH)) {
            Integer valueOf = Integer.valueOf(i);
            LinkedHashSet linkedHashSet = this.q0;
            if (!linkedHashSet.contains(valueOf)) {
                linkedHashSet.add(Integer.valueOf(i));
                int i4 = this.n0 + 1;
                this.n0 = i4;
                awhVar.W3(i4, this.o0, this.p0);
            }
        }
        if (flags.zb(PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)) {
            int i5 = this.n0;
            int i6 = this.o0;
            int i7 = this.p0 + 1;
            this.p0 = i7;
            awhVar.W3(i5, i6, i7);
        }
    }

    @Override // xsna.dqp, xsna.kvh
    public final String getRef() {
        return this.k0;
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter, xsna.dqp
    public final VideoAutoPlayDelayType getVideoAutoPlayDelayType() {
        return VideoAutoPlayDelayType.WALL;
    }

    @Override // xsna.kvh
    public final void h(int i, int i2, int i3) {
        this.n0 = i;
        this.o0 = i2;
        this.p0 = i3;
    }

    public final void h0() {
        awh awhVar = this.d0;
        if (awhVar.s1()) {
            awhVar.a(rsg0.y0(new a0u(0, 1, this.e0, "suggests", (String) null), null, null, 3).subscribe(new ia(new ha(this, 24), 20)));
        } else {
            this.r0 = true;
        }
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<WallWithCounters> hj(com.vk.lists.c cVar, boolean z) {
        return O9(null, cVar);
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter
    public final boolean r(NewsEntry newsEntry) {
        if (!(newsEntry instanceof Post)) {
            return false;
        }
        Post post = (Post) newsEntry;
        Flags flags = post.l;
        boolean o1 = post.o1();
        boolean z = this.u0;
        if ((o1 && !z) || (!post.o1() && z)) {
            g0(post);
            return false;
        }
        UserId userId = post.m;
        UserId userId2 = this.e0;
        if (!epx.f(userId, userId2)) {
            return false;
        }
        if (this.t0 == WallGetMode.OWNER && !epx.f(post.o.b, userId2)) {
            return false;
        }
        if (!flags.zb(PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) && !flags.zb(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) && !flags.zb(PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)) {
            return true;
        }
        g0(post);
        Y();
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter
    public final void t() {
        e5y0 a2 = ((YandexAdFeatureComponent) this.j0.getValue()).e5().a();
        if (a2 != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<NewsEntry> it = this.d.iterator();
            while (it.hasNext()) {
                NewsEntry next = it.next();
                if (next instanceof YandexNativeAdEntry) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                z4y0 z4y0Var = ((YandexNativeAdEntry) it2.next()).k;
                if (z4y0Var != null) {
                    arrayList2.add(z4y0Var);
                }
            }
            a2.a(arrayList2);
        }
        super.t();
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<WallWithCounters> qVar, boolean z, com.vk.lists.c cVar) {
        this.d0.a(qVar.subscribe(new mf1(new lvh(cVar, this, z), 17), new nf1(new t9e(this, 9), 23)));
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
