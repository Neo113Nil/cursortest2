package xsna;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.vk.ads.yandex.api.di.YandexAdFeatureComponent;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.GroupContentTabSetting;
import com.vk.dto.group.GroupContentTabType;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import com.vk.dto.newsfeed.Flags;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.core.models.news.YandexNativeAdEntry;
import com.vk.libvideo.api.VideoAutoPlayDelayType;
import com.vk.lists.c;
import com.vk.newsfeed.impl.presenters.EntriesListPresenter;
import com.vk.newsfeed.impl.requests.WallGetMain;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.repository.data.api.ExtendedProfilesRepository;
import com.vk.toggle.features.FeedFeatures;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.LazyThreadSafetyMode;

/* compiled from: CommunityProfileMainWallPresenterImpl.kt */
/* loaded from: classes4.dex */
public final class hrh extends EntriesListPresenter implements c.m<WallGetMain.Result>, kvh {
    public final awh d0;
    public final UserId e0;
    public ExtendedCommunityProfile f0;
    public final ExtendedProfilesRepository g0;
    public final sa30 h0;
    public final Object i0;
    public final Object j0;
    public final Object k0;
    public final Object l0;
    public final a m0;
    public final String n0;
    public int o0;
    public Integer p0;
    public Boolean q0;

    /* compiled from: CommunityProfileMainWallPresenterImpl.kt */
    public final class a implements bd70<Object> {
        public a() {
        }

        @Override // xsna.bd70
        public final void x0(int i, int i2, Object obj) {
            if (i == 159) {
                hrh.this.f0();
            }
        }
    }

    /* compiled from: CommunityProfileMainWallPresenterImpl.kt */
    public static final class b<V> implements Callable {
        public final /* synthetic */ NewsEntry c;

        public b(NewsEntry newsEntry) {
            this.c = newsEntry;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            NewsEntry newsEntry;
            hrh hrhVar = hrh.this;
            sa30 sa30Var = hrhVar.h0;
            ArrayList<NewsEntry> arrayList = hrhVar.d;
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
                    Integer num = hrhVar.p0;
                    if (num != null && u == num.intValue()) {
                        break;
                    }
                }
            }
            NewsEntry newsEntry4 = newsEntry;
            boolean f = na60.f(newsEntry2);
            if (f && newsEntry4 != null) {
                hrhVar.p0 = null;
                sa30Var.getClass();
                ArrayList S = sa30.S(newsEntry4, arrayList);
                hrhVar.p0 = Integer.valueOf(di60.u(newsEntry2));
                sa30Var.getClass();
                return sa30.H(newsEntry2, S);
            }
            if (f) {
                hrhVar.p0 = Integer.valueOf(di60.u(newsEntry2));
                sa30Var.getClass();
                return sa30.H(newsEntry2, arrayList);
            }
            hrhVar.p0 = null;
            sa30Var.getClass();
            return sa30.S(newsEntry2, arrayList);
        }
    }

    /* compiled from: CommunityProfileMainWallPresenterImpl.kt */
    public static final class c implements io.reactivex.rxjava3.functions.f {
        public final /* synthetic */ irh b;

        public c(irh irhVar) {
            this.b = irhVar;
        }

        @Override // io.reactivex.rxjava3.functions.f
        public final /* synthetic */ void accept(Object obj) {
            this.b.invoke(obj);
        }
    }

    public hrh(awh awhVar, UserId userId, ExtendedCommunityProfile extendedCommunityProfile, ExtendedProfilesRepository extendedProfilesRepository) {
        super(awhVar);
        this.d0 = awhVar;
        this.e0 = userId;
        this.f0 = extendedCommunityProfile;
        this.g0 = extendedProfilesRepository;
        this.h0 = new sa30();
        ry0 ry0Var = new ry0(this, 29);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.i0 = msy.a(lazyThreadSafetyMode, ry0Var);
        this.j0 = msy.a(lazyThreadSafetyMode, new z4f(this, 10));
        this.k0 = msy.a(lazyThreadSafetyMode, new yqf(this, 4));
        this.l0 = msy.a(lazyThreadSafetyMode, new iz3(5));
        this.m0 = new a();
        this.n0 = "club" + userId.b;
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter
    public final void A(NewsEntry newsEntry) {
        super.A(newsEntry);
        if (newsEntry instanceof Post) {
            Post post = (Post) newsEntry;
            boolean oc = post.oc();
            awh awhVar = this.d0;
            if (!oc && !post.rc() && !post.Z1() && !post.o1()) {
                int i = this.o0 + 1;
                this.o0 = i;
                awhVar.v0(i);
            }
            g0();
            awhVar.Wb(post);
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
            g0();
        } else {
            Post post = (Post) newsEntry;
            Flags flags = post.l;
            O(new NewsfeedExternalAction.c.w(post.m, post.n, flags.zb(PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH), flags.zb(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM), flags.zb(PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED), post.o1()));
        }
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter, xsna.dqp
    public final void D0(Bundle bundle) {
        super.D0(bundle);
        ce60.b.getClass();
        p870.f().b(159, this.m0);
        io.reactivex.rxjava3.core.q<c5i> a2 = ((a5i) this.i0.getValue()).a();
        asu0 asu0Var = asu0.a;
        asu0Var.getClass();
        this.d0.a(a2.r0(asu0.i()).a0(asu0Var.d()).subscribe(new defpackage.d(new pcg(this, 6), 19)));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter
    public final void H(NewsEntry newsEntry, Integer num) {
        if ((newsEntry instanceof Videos) && ((Videos) newsEntry).r == null && ((Boolean) this.l0.getValue()).booleanValue()) {
            return;
        }
        super.H(newsEntry, num);
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter
    public final void N() {
        f0();
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter
    public final void O(NewsfeedExternalAction.c.w wVar) {
        super.O(wVar);
        int i = this.o0 - 1;
        this.o0 = i;
        this.d0.v0(i);
        g0();
    }

    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.lists.c.m
    public final io.reactivex.rxjava3.core.q<WallGetMain.Result> O9(String str, com.vk.lists.c cVar) {
        List<GroupContentTabSetting> list;
        Object obj;
        ExtendedCommunityProfile extendedCommunityProfile = this.f0;
        if (extendedCommunityProfile != null && (list = extendedCommunityProfile.U2) != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((GroupContentTabSetting) obj).b == GroupContentTabType.MAIN_WALL) {
                    break;
                }
            }
            GroupContentTabSetting groupContentTabSetting = (GroupContentTabSetting) obj;
            if (groupContentTabSetting != null && groupContentTabSetting.i) {
                this.d0.g3();
                g0();
                return io.reactivex.rxjava3.internal.operators.observable.g0.b;
            }
        }
        if (!epx.f(this.q0, Boolean.TRUE)) {
            return io.reactivex.rxjava3.internal.operators.observable.g0.b;
        }
        int k = cVar.k();
        FeedFeatures feedFeatures = FeedFeatures.FEED_YANDEX_AD;
        feedFeatures.getClass();
        return rsg0.y0(new WallGetMain(this.e0, k, "club", str, null, (com.vk.toggle.b.A.a(feedFeatures) && ((YandexAdFeatureComponent) this.k0.getValue()).e5().isInitialized()) ? !TextUtils.isEmpty((String) hd60.a().a().a(m6r0.H0)) : false), null, null, 3);
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter
    public final void P(NewsEntry newsEntry) {
        super.D(newsEntry, false);
        this.o0--;
        g0();
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

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0099, code lost:
    
        if (xsna.di60.o((xsna.wsx0) r1) != false) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00dc  */
    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T(NewsEntry newsEntry) {
        boolean z;
        Iterator<NewsEntry> it;
        int i;
        HashMap hashMap;
        Iterator<NewsEntry> it2;
        if (!na60.e(newsEntry)) {
            return;
        }
        ArrayList<NewsEntry> arrayList = this.d;
        boolean z2 = true;
        if (arrayList.size() > 1) {
            boolean z3 = (newsEntry instanceof Videos) && di60.o((wsx0) newsEntry) && !na60.f(newsEntry);
            if (this.p0 != null && !arrayList.isEmpty()) {
                Parcelable parcelable = (NewsEntry) arrayList.get(0);
                if ((parcelable instanceof Videos) && di60.o((wsx0) parcelable)) {
                    z = true;
                    if (!z3 && !z) {
                        int u = na60.f(newsEntry) ? di60.u(newsEntry) : di60.u(arrayList.get(0));
                        it = arrayList.iterator();
                        i = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                NewsEntry next = it.next();
                                if (na60.e(next) && u > di60.u(next)) {
                                    break;
                                } else {
                                    i++;
                                }
                            } else {
                                i = -1;
                                break;
                            }
                        }
                        if (i > 0) {
                            Parcelable parcelable2 = (NewsEntry) arrayList.get(i - 1);
                            if (parcelable2 instanceof Videos) {
                            }
                        }
                    }
                    io.reactivex.rxjava3.internal.operators.single.b0 m = io.reactivex.rxjava3.subjects.c.b(asu0.a, new io.reactivex.rxjava3.internal.operators.single.v(new b(newsEntry))).m(io.reactivex.rxjava3.android.schedulers.a.b());
                    c cVar = new c(new irh(this, z2));
                    int i2 = kwg0.a;
                    this.d0.a(m.subscribe(cVar, new iwg0()));
                    hashMap = new HashMap();
                    it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        NewsEntry next2 = it2.next();
                        if (na60.e(next2)) {
                            if (next2.equals(newsEntry)) {
                                hashMap.put(next2, next2);
                            } else if (na60.f(next2)) {
                                na60.i(next2, false);
                                hashMap.put(next2, next2);
                            }
                        }
                    }
                    if (hashMap.isEmpty()) {
                        return;
                    }
                    this.c.H(new com.vk.movika.sdk.base.logic.interactor.i(10, Collections.singleton(302), hashMap), new i50(hashMap, 28));
                    return;
                }
            }
            z = false;
            if (!z3) {
                if (na60.f(newsEntry)) {
                }
                it = arrayList.iterator();
                i = 0;
                while (true) {
                    if (!it.hasNext()) {
                    }
                    i++;
                }
                if (i > 0) {
                }
            }
            io.reactivex.rxjava3.internal.operators.single.b0 m2 = io.reactivex.rxjava3.subjects.c.b(asu0.a, new io.reactivex.rxjava3.internal.operators.single.v(new b(newsEntry))).m(io.reactivex.rxjava3.android.schedulers.a.b());
            c cVar2 = new c(new irh(this, z2));
            int i22 = kwg0.a;
            this.d0.a(m2.subscribe(cVar2, new iwg0()));
            hashMap = new HashMap();
            it2 = arrayList.iterator();
            while (it2.hasNext()) {
            }
            if (hashMap.isEmpty()) {
            }
        }
        z2 = false;
        io.reactivex.rxjava3.internal.operators.single.b0 m22 = io.reactivex.rxjava3.subjects.c.b(asu0.a, new io.reactivex.rxjava3.internal.operators.single.v(new b(newsEntry))).m(io.reactivex.rxjava3.android.schedulers.a.b());
        c cVar22 = new c(new irh(this, z2));
        int i222 = kwg0.a;
        this.d0.a(m22.subscribe(cVar22, new iwg0()));
        hashMap = new HashMap();
        it2 = arrayList.iterator();
        while (it2.hasNext()) {
        }
        if (hashMap.isEmpty()) {
        }
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter
    public final void U(List<? extends NewsEntry> list, boolean z) {
        if (this.p0 != null) {
            f0();
        } else {
            super.U(list, true);
        }
    }

    @Override // xsna.dqp
    public final String a() {
        return this.n0;
    }

    @Override // xsna.kvh
    public final void b(Boolean bool) {
        com.vk.lists.c cVar = this.g;
        if (cVar != null) {
            cVar.r(bool.booleanValue());
        }
        this.q0 = bool;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final h7v e0() {
        return (h7v) this.j0.getValue();
    }

    @Override // xsna.kvh
    public final void f(boolean z) {
        com.vk.lists.c cVar = this.g;
        if (cVar != null) {
            io.reactivex.rxjava3.core.q<WallGetMain.Result> O9 = O9(null, cVar);
            ph3 ph3Var = new ph3(new mre(this, 10), 20);
            a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
            a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
            io.reactivex.rxjava3.internal.operators.observable.b0 E = O9.E(ph3Var, lVar, kVar, kVar);
            cVar.r(true);
            wd(E, z, cVar);
        }
    }

    public final void f0() {
        com.vk.lists.c cVar = this.g;
        if (cVar != null) {
            cVar.r(true);
            io.reactivex.rxjava3.core.q<WallGetMain.Result> O9 = O9(null, cVar);
            oz ozVar = new oz(new wje(this, 5), 12);
            a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
            a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
            wd(O9.E(ozVar, lVar, kVar, kVar), true, cVar);
        }
    }

    public final void g0() {
        int i = this.o0;
        awh awhVar = this.d0;
        if (i <= 0) {
            awhVar.H1();
        } else {
            awhVar.w2();
        }
    }

    @Override // xsna.dqp, xsna.kvh
    public final String getRef() {
        return "wall_group";
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter, xsna.dqp
    public final VideoAutoPlayDelayType getVideoAutoPlayDelayType() {
        return VideoAutoPlayDelayType.WALL;
    }

    public final void h0() {
        ExtendedCommunityProfile extendedCommunityProfile;
        Hint p;
        if (e0().n() || e0().p(HintId.COMMUNITY_PROFILE_MAIN_WALL_TAB_ONBOARDING.getId()) != null || (extendedCommunityProfile = this.f0) == null || !w2h.a(extendedCommunityProfile) || (p = e0().p(HintId.COMMUNITY_PROFILE_MAIN_WALL_POST_OPTIONS_ONBOARDING.getId())) == null) {
            return;
        }
        this.d0.Y9(p.c, new com.vk.movika.sdk.base.observable.o(this, 21), new mh3(4, this, p));
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<WallGetMain.Result> hj(com.vk.lists.c cVar, boolean z) {
        return O9(null, cVar);
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter, xsna.dqp
    public final void onDestroyView() {
        super.onDestroyView();
        ce60.b.getClass();
        p870.f().g(this.m0);
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter
    public final boolean r(NewsEntry newsEntry) {
        if (!(newsEntry instanceof Post)) {
            return false;
        }
        Post post = (Post) newsEntry;
        Flags flags = post.l;
        return (!epx.f(post.m, this.e0) || flags.zb(PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) || flags.zb(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) || flags.zb(PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter
    public final void t() {
        e5y0 a2 = ((YandexAdFeatureComponent) this.k0.getValue()).e5().a();
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
    public final void wd(io.reactivex.rxjava3.core.q<WallGetMain.Result> qVar, boolean z, com.vk.lists.c cVar) {
        this.d0.a(qVar.subscribe(new qz(new grh(cVar, this, z), 12), new qs2(new com.vk.movika.sdk.base.observable.k(this, 27), 11)));
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter
    public final com.vk.lists.c z() {
        c.h hVar = new c.h(this);
        hVar.c = 25;
        hVar.s = this.w;
        hVar.t = v();
        return this.d0.fn(hVar);
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter
    public final void Q(NewsEntry newsEntry) {
    }

    @Override // xsna.kvh
    public final void h(int i, int i2, int i3) {
    }
}
