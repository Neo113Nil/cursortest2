package xsna;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.libvideo.api.NotificationsPermission;
import com.vk.metrics.performance.scroll.ScrollScreenType;
import com.vk.stickers.ContextUser;
import com.vk.video.ui.share.api.VideoShareComponent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.InitializedLazyImpl;
import kotlin.Lazy;
import xsna.xhu0;

/* compiled from: CatalogEntryPointParams.kt */
/* loaded from: classes16.dex */
public final class u4a implements tb0 {
    public final a b;
    public final b c;

    /* compiled from: CatalogEntryPointParams.kt */
    public static final class a {
        public final String A;
        public final sd9 B;
        public final e7b0 C;
        public final z0a D;
        public final nvs E;
        public final izs<UIBlock, Integer> F;
        public final q530 G;
        public final yfa H;
        public final dha I;
        public final s1v J;
        public final NotificationsPermission K;
        public final Lazy<zia> L;
        public final Lazy<isd0> M;
        public final Lazy<ksd0> N;
        public final Lazy<eht0> O;
        public final com.vk.libvideo.videobottomsheet.api.a P;
        public final l4v0 Q;
        public final e1a R;
        public final Lazy<VideoShareComponent> S;
        public final tjj0 T;
        public final String a;
        public final nda b;
        public final boolean c;
        public final m3a d;
        public final q3a e;
        public final b5a f;
        public final Lazy<RecyclerView.u> g;
        public final gxp h;
        public final u2b0 i;
        public final k7a j;
        public final ScrollScreenType k;
        public final cks l;
        public final SearchStatInfoProvider m;
        public final dos n;
        public final mcc0 o;
        public final hh7 p;
        public final r8a q;
        public final b7a r;
        public final CatalogConfiguration s;
        public final fa40 t;
        public final xf40 u;
        public final c750 v;
        public final com.vk.catalog2.common.ui.mvp.util.a w;
        public final f0q x;
        public final ContextUser y;
        public final Collection<UserId> z;

        public /* synthetic */ a(String str, r4a r4aVar, boolean z, m3a m3aVar, lda ldaVar, b5a b5aVar, InitializedLazyImpl initializedLazyImpl, v4a v4aVar, u2b0 u2b0Var, k7a k7aVar, SearchStatInfoProvider searchStatInfoProvider, mcc0 mcc0Var, hh7 hh7Var, xhu0.a aVar, diu0 diu0Var, CatalogConfiguration catalogConfiguration, fa40 fa40Var, xf40 xf40Var, f750 f750Var, com.vk.catalog2.common.ui.mvp.util.a aVar2, f0q f0qVar, ContextUser contextUser, ArrayList arrayList, String str2, sd9 sd9Var, e7b0 e7b0Var, z0a z0aVar, nvs nvsVar, izs izsVar, yfa yfaVar, NotificationsPermission notificationsPermission, bpn0 bpn0Var, bpn0 bpn0Var2, bpn0 bpn0Var3, bpn0 bpn0Var4, h9s0 h9s0Var, l4v0 l4v0Var, e1a e1aVar, bpn0 bpn0Var5, yjj0 yjj0Var) {
            this(str, r4aVar, z, m3aVar, ldaVar, b5aVar, initializedLazyImpl, v4aVar, u2b0Var, k7aVar, null, null, searchStatInfoProvider, null, mcc0Var, hh7Var, aVar, diu0Var, catalogConfiguration, fa40Var, xf40Var, f750Var, aVar2, f0qVar, contextUser, arrayList, str2, sd9Var, e7b0Var, z0aVar, nvsVar, izsVar, null, yfaVar, null, null, notificationsPermission, bpn0Var, bpn0Var2, bpn0Var3, bpn0Var4, h9s0Var, l4v0Var, e1aVar, bpn0Var5, yjj0Var);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v29, types: [xsna.s1v] */
        public static a a(a aVar, nda ndaVar, u2b0 u2b0Var, ScrollScreenType scrollScreenType, cks cksVar, dos dosVar, CatalogConfiguration catalogConfiguration, String str, nvs nvsVar, q530 q530Var, dha dhaVar, onh0 onh0Var, int i, int i2) {
            b7a b7aVar;
            CatalogConfiguration catalogConfiguration2;
            Collection<UserId> collection;
            String str2;
            z0a z0aVar;
            nvs nvsVar2;
            izs<UIBlock, Integer> izsVar;
            q530 q530Var2;
            yfa yfaVar;
            dha dhaVar2;
            String str3 = aVar.a;
            nda ndaVar2 = (i & 2) != 0 ? aVar.b : ndaVar;
            boolean z = aVar.c;
            nda ndaVar3 = ndaVar2;
            m3a m3aVar = aVar.d;
            q3a q3aVar = aVar.e;
            b5a b5aVar = aVar.f;
            Lazy<RecyclerView.u> lazy = aVar.g;
            gxp gxpVar = aVar.h;
            u2b0 u2b0Var2 = (i & 256) != 0 ? aVar.i : u2b0Var;
            k7a k7aVar = aVar.j;
            ScrollScreenType scrollScreenType2 = (i & 1024) != 0 ? aVar.k : scrollScreenType;
            cks cksVar2 = (i & 2048) != 0 ? aVar.l : cksVar;
            aVar.getClass();
            u2b0 u2b0Var3 = u2b0Var2;
            ScrollScreenType scrollScreenType3 = scrollScreenType2;
            cks cksVar3 = cksVar2;
            SearchStatInfoProvider searchStatInfoProvider = aVar.m;
            dos dosVar2 = (i & 16384) != 0 ? aVar.n : dosVar;
            mcc0 mcc0Var = aVar.o;
            hh7 hh7Var = aVar.p;
            r8a r8aVar = aVar.q;
            b7a b7aVar2 = aVar.r;
            if ((i & 524288) != 0) {
                b7aVar = b7aVar2;
                catalogConfiguration2 = aVar.s;
            } else {
                b7aVar = b7aVar2;
                catalogConfiguration2 = catalogConfiguration;
            }
            fa40 fa40Var = aVar.t;
            xf40 xf40Var = aVar.u;
            c750 c750Var = aVar.v;
            com.vk.catalog2.common.ui.mvp.util.a aVar2 = aVar.w;
            f0q f0qVar = aVar.x;
            ContextUser contextUser = aVar.y;
            Collection<UserId> collection2 = aVar.z;
            if ((i & 134217728) != 0) {
                collection = collection2;
                str2 = aVar.A;
            } else {
                collection = collection2;
                str2 = str;
            }
            sd9 sd9Var = aVar.B;
            e7b0 e7b0Var = aVar.C;
            z0a z0aVar2 = aVar.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                z0aVar = z0aVar2;
                nvsVar2 = aVar.E;
            } else {
                z0aVar = z0aVar2;
                nvsVar2 = nvsVar;
            }
            izs<UIBlock, Integer> izsVar2 = aVar.F;
            if ((i2 & 2) != 0) {
                izsVar = izsVar2;
                q530Var2 = aVar.G;
            } else {
                izsVar = izsVar2;
                q530Var2 = q530Var;
            }
            yfa yfaVar2 = aVar.H;
            if ((i2 & 8) != 0) {
                yfaVar = yfaVar2;
                dhaVar2 = aVar.I;
            } else {
                yfaVar = yfaVar2;
                dhaVar2 = dhaVar;
            }
            onh0 onh0Var2 = (i2 & 16) != 0 ? aVar.J : onh0Var;
            NotificationsPermission notificationsPermission = aVar.K;
            Lazy<zia> lazy2 = aVar.L;
            Lazy<isd0> lazy3 = aVar.M;
            Lazy<ksd0> lazy4 = aVar.N;
            Lazy<eht0> lazy5 = aVar.O;
            com.vk.libvideo.videobottomsheet.api.a aVar3 = aVar.P;
            l4v0 l4v0Var = aVar.Q;
            aVar.getClass();
            aVar.getClass();
            aVar.getClass();
            aVar.getClass();
            e1a e1aVar = aVar.R;
            Lazy<VideoShareComponent> lazy6 = aVar.S;
            aVar.getClass();
            tjj0 tjj0Var = aVar.T;
            aVar.getClass();
            return new a(str3, ndaVar3, z, m3aVar, q3aVar, b5aVar, lazy, gxpVar, u2b0Var3, k7aVar, scrollScreenType3, cksVar3, searchStatInfoProvider, dosVar2, mcc0Var, hh7Var, r8aVar, b7aVar, catalogConfiguration2, fa40Var, xf40Var, c750Var, aVar2, f0qVar, contextUser, collection, str2, sd9Var, e7b0Var, z0aVar, nvsVar2, izsVar, q530Var2, yfaVar, dhaVar2, onh0Var2, notificationsPermission, lazy2, lazy3, lazy4, lazy5, aVar3, l4v0Var, e1aVar, lazy6, tjj0Var);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g) && epx.f(this.h, aVar.h) && epx.f(this.i, aVar.i) && epx.f(this.j, aVar.j) && this.k == aVar.k && epx.f(this.l, aVar.l) && epx.f(this.m, aVar.m) && epx.f(this.n, aVar.n) && epx.f(this.o, aVar.o) && epx.f(this.p, aVar.p) && epx.f(this.q, aVar.q) && epx.f(this.r, aVar.r) && epx.f(this.s, aVar.s) && epx.f(this.t, aVar.t) && epx.f(this.u, aVar.u) && epx.f(this.v, aVar.v) && epx.f(this.w, aVar.w) && epx.f(this.x, aVar.x) && epx.f(this.y, aVar.y) && epx.f(this.z, aVar.z) && epx.f(this.A, aVar.A) && epx.f(this.B, aVar.B) && epx.f(this.C, aVar.C) && epx.f(this.D, aVar.D) && epx.f(this.E, aVar.E) && epx.f(this.F, aVar.F) && epx.f(this.G, aVar.G) && epx.f(this.H, aVar.H) && epx.f(this.I, aVar.I) && epx.f(this.J, aVar.J) && epx.f(this.K, aVar.K) && epx.f(this.L, aVar.L) && epx.f(this.M, aVar.M) && epx.f(this.N, aVar.N) && epx.f(this.O, aVar.O) && epx.f(this.P, aVar.P) && epx.f(this.Q, aVar.Q) && epx.f(this.R, aVar.R) && epx.f(this.S, aVar.S) && epx.f(this.T, aVar.T);
        }

        public final int hashCode() {
            int hashCode = (this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + g7r0.a(this.g, (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + qoy.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c)) * 31)) * 31)) * 31, 31)) * 31)) * 31)) * 31;
            ScrollScreenType scrollScreenType = this.k;
            int hashCode2 = (hashCode + (scrollScreenType == null ? 0 : scrollScreenType.hashCode())) * 31;
            cks cksVar = this.l;
            int hashCode3 = (this.m.hashCode() + ((hashCode2 + (cksVar == null ? 0 : cksVar.hashCode())) * 961)) * 31;
            dos dosVar = this.n;
            int hashCode4 = (this.o.hashCode() + ((hashCode3 + (dosVar == null ? 0 : dosVar.hashCode())) * 31)) * 31;
            hh7 hh7Var = this.p;
            int hashCode5 = (this.x.hashCode() + ((this.w.hashCode() + ((this.v.hashCode() + ((this.u.hashCode() + ((this.t.hashCode() + ((this.s.hashCode() + ((this.r.hashCode() + ((this.q.hashCode() + ((hashCode4 + (hh7Var == null ? 0 : hh7Var.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
            ContextUser contextUser = this.y;
            int a = s3j0.a((hashCode5 + (contextUser == null ? 0 : contextUser.hashCode())) * 31, this.z, 31);
            String str = this.A;
            int c = dq.c((this.E.hashCode() + ((this.D.hashCode() + ((this.C.hashCode() + ((this.B.hashCode() + ((a + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.F);
            q530 q530Var = this.G;
            int hashCode6 = (this.H.hashCode() + ((c + (q530Var == null ? 0 : q530Var.hashCode())) * 31)) * 31;
            dha dhaVar = this.I;
            int hashCode7 = (hashCode6 + (dhaVar == null ? 0 : dhaVar.hashCode())) * 31;
            s1v s1vVar = this.J;
            int a2 = g7r0.a(this.L, (this.K.hashCode() + ((hashCode7 + (s1vVar == null ? 0 : s1vVar.hashCode())) * 31)) * 31, 31);
            Lazy<isd0> lazy = this.M;
            int hashCode8 = (a2 + (lazy == null ? 0 : lazy.hashCode())) * 31;
            Lazy<ksd0> lazy2 = this.N;
            int hashCode9 = (hashCode8 + (lazy2 == null ? 0 : lazy2.hashCode())) * 31;
            Lazy<eht0> lazy3 = this.O;
            int hashCode10 = (hashCode9 + (lazy3 == null ? 0 : lazy3.hashCode())) * 31;
            com.vk.libvideo.videobottomsheet.api.a aVar = this.P;
            int hashCode11 = (hashCode10 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            l4v0 l4v0Var = this.Q;
            int hashCode12 = (this.R.hashCode() + ((hashCode11 + (l4v0Var == null ? 0 : l4v0Var.hashCode())) * 28629151)) * 31;
            Lazy<VideoShareComponent> lazy4 = this.S;
            int hashCode13 = (hashCode12 + (lazy4 == null ? 0 : lazy4.hashCode())) * 961;
            tjj0 tjj0Var = this.T;
            return hashCode13 + (tjj0Var != null ? tjj0Var.hashCode() : 0);
        }

        public final String toString() {
            return "CatalogScopeParams(entryPointToken=" + this.a + ", router=" + this.b + ", isTablet=" + this.c + ", catalogClickEvents=" + this.d + ", commandsBus=" + this.e + ", eventsBus=" + this.f + ", sharedRecyclerPool=" + this.g + ", errorViewConfiguration=" + this.h + ", playerModel=" + this.i + ", placeholderHelper=" + this.j + ", verticalListScreenType=" + this.k + ", friendsAnalytics=" + this.l + ", friendsState=null, searchStatInfoProvider=" + this.m + ", bindListeners=" + this.n + ", disposableHolder=" + this.o + ", blurTransform=" + this.p + ", linksParser=" + this.q + ", hintRenderer=" + this.r + ", catalogConfiguration=" + this.s + ", musicArtistModel=" + this.t + ", musicCuratorModel=" + this.u + ", musicSocialModel=" + this.v + ", catalogUniversalButtonsHandler=" + this.w + ", musicAutoTestIdlingManager=" + this.x + ", contextUser=" + this.y + ", giftUsers=" + this.z + ", ref=" + this.A + ", musicPodcastModel=" + this.B + ", catalogFriendsLikedFormatter=" + this.C + ", apiPositionIndexer=" + this.D + ", fullScreenBannerManager=" + this.E + ", swipeRefreshIndicatorOffsetProvider=" + this.F + ", moderationWrapper=" + this.G + ", catalogSectionScrollPositionsCache=" + this.H + ", statEventScreenNameProvider=" + this.I + ", analyticsDataExtractor=" + this.J + ", notificationsPermission=" + this.K + ", viewStyleResolverProvider=" + this.L + ", productTileCtaButtonConfigFactoryProvider=" + this.M + ", productTileCtaButtonDelegateProvider=" + this.N + ", videoSliderItemFactory=" + this.O + ", videoCatalogHelper=" + this.P + ", vkMixListener=" + this.Q + ", restrictedUserActions=null, videoPromoRepository=null, promoOnboardingBannerStatInteractor=null, videoOnboardingTooltip=null, catalogBackgroundExtractor=" + this.R + ", videoShareComponentProvider=" + this.S + ", onboardingManager=null, perfTracker=" + this.T + ')';
        }

        public a(String str, nda ndaVar, boolean z, m3a m3aVar, q3a q3aVar, b5a b5aVar, Lazy lazy, gxp gxpVar, u2b0 u2b0Var, k7a k7aVar, ScrollScreenType scrollScreenType, cks cksVar, SearchStatInfoProvider searchStatInfoProvider, dos dosVar, mcc0 mcc0Var, hh7 hh7Var, r8a r8aVar, b7a b7aVar, CatalogConfiguration catalogConfiguration, fa40 fa40Var, xf40 xf40Var, c750 c750Var, com.vk.catalog2.common.ui.mvp.util.a aVar, f0q f0qVar, ContextUser contextUser, Collection collection, String str2, sd9 sd9Var, e7b0 e7b0Var, z0a z0aVar, nvs nvsVar, izs izsVar, q530 q530Var, yfa yfaVar, dha dhaVar, s1v s1vVar, NotificationsPermission notificationsPermission, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5, com.vk.libvideo.videobottomsheet.api.a aVar2, l4v0 l4v0Var, e1a e1aVar, Lazy lazy6, tjj0 tjj0Var) {
            this.a = str;
            this.b = ndaVar;
            this.c = z;
            this.d = m3aVar;
            this.e = q3aVar;
            this.f = b5aVar;
            this.g = lazy;
            this.h = gxpVar;
            this.i = u2b0Var;
            this.j = k7aVar;
            this.k = scrollScreenType;
            this.l = cksVar;
            this.m = searchStatInfoProvider;
            this.n = dosVar;
            this.o = mcc0Var;
            this.p = hh7Var;
            this.q = r8aVar;
            this.r = b7aVar;
            this.s = catalogConfiguration;
            this.t = fa40Var;
            this.u = xf40Var;
            this.v = c750Var;
            this.w = aVar;
            this.x = f0qVar;
            this.y = contextUser;
            this.z = collection;
            this.A = str2;
            this.B = sd9Var;
            this.C = e7b0Var;
            this.D = z0aVar;
            this.E = nvsVar;
            this.F = izsVar;
            this.G = q530Var;
            this.H = yfaVar;
            this.I = dhaVar;
            this.J = s1vVar;
            this.K = notificationsPermission;
            this.L = lazy2;
            this.M = lazy3;
            this.N = lazy4;
            this.O = lazy5;
            this.P = aVar2;
            this.Q = l4v0Var;
            this.R = e1aVar;
            this.S = lazy6;
            this.T = tjj0Var;
        }
    }

    /* compiled from: CatalogEntryPointParams.kt */
    public static final class b {
        public final mba a;
        public final f9l0 b;
        public final List<Lazy<tb0>> c;
        public final t5a<MusicTrack> d;
        public final FragmentManager e;
        public final Context f;
        public final mzp0 g;

        public b() {
            throw null;
        }

        public b(mba mbaVar, f9l0 f9l0Var, List list, t5a t5aVar, FragmentManager fragmentManager, Context context, mzp0 mzp0Var, int i) {
            mzp0Var = (i & 128) != 0 ? null : mzp0Var;
            this.a = mbaVar;
            this.b = f9l0Var;
            this.c = list;
            this.d = t5aVar;
            this.e = fragmentManager;
            this.f = context;
            this.g = mzp0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e) && epx.f(this.f, bVar.f) && epx.f(this.g, bVar.g);
        }

        public final int hashCode() {
            int hashCode = (this.d.hashCode() + fw3.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c)) * 31;
            FragmentManager fragmentManager = this.e;
            int hashCode2 = (this.f.hashCode() + ((hashCode + (fragmentManager == null ? 0 : fragmentManager.hashCode())) * 31)) * 961;
            mzp0 mzp0Var = this.g;
            return hashCode2 + (mzp0Var != null ? mzp0Var.hashCode() : 0);
        }

        public final String toString() {
            return "ScreenScopeParams(catalogOnClickListener=" + this.a + ", stickersClickHandler=" + this.b + ", activityResulters=" + this.c + ", musicTracksCache=" + this.d + ", fragmentManager=" + this.e + ", context=" + this.f + ", videoProfileNavigator=null, uiMeasuringSession=" + this.g + ')';
        }
    }

    public u4a(a aVar, b bVar) {
        this.b = aVar;
        this.c = bVar;
    }

    public static u4a a(u4a u4aVar, a aVar) {
        b bVar = u4aVar.c;
        u4aVar.getClass();
        return new u4a(aVar, bVar);
    }

    public final hh7 b() {
        return this.b.p;
    }

    public final m3a c() {
        return this.b.d;
    }

    public final e7b0 d() {
        return this.b.C;
    }

    public final com.vk.catalog2.common.ui.mvp.util.a e() {
        return this.b.w;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u4a)) {
            return false;
        }
        u4a u4aVar = (u4a) obj;
        return epx.f(this.b, u4aVar.b) && epx.f(this.c, u4aVar.c);
    }

    public final q3a f() {
        return this.b.e;
    }

    public final b5a g() {
        return this.b.f;
    }

    public final cks h() {
        return this.b.l;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final jzi0 i() {
        this.b.getClass();
        return null;
    }

    public final t5a<MusicTrack> j() {
        return this.c.d;
    }

    public final k7a k() {
        return this.b.j;
    }

    public final u2b0 l() {
        return this.b.i;
    }

    public final nda m() {
        return this.b.b;
    }

    public final SearchStatInfoProvider n() {
        return this.b.m;
    }

    public final dha o() {
        return this.b.I;
    }

    @Override // xsna.tb0
    public final void onActivityResult(int i, int i2, Intent intent) {
        List<Lazy<tb0>> list = this.c.c;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((tb0) ((Lazy) it.next()).getValue());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((tb0) it2.next()).onActivityResult(i, i2, intent);
        }
    }

    public final Lazy<eht0> p() {
        return this.b.O;
    }

    public final String toString() {
        return "CatalogEntryPointParams(catalogScopeParams=" + this.b + ", screenScopeParams=" + this.c + ')';
    }
}
