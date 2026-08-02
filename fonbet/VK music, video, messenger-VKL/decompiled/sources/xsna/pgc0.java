package xsna;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.bridges.di.BridgeComponent;
import com.vk.clips.entrypoints.di.ClipsEntryPointsComponent;
import com.vk.clips.entrypoints.params.ClipsEntryPointsParams;
import com.vk.common.links.LaunchContext;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.id.UserId;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import com.vk.dto.stories.entities.StoryCameraMode;
import com.vk.dto.user.UserProfile;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vk.newsfeed.api.posting.community.PostingCountersModel;
import com.vk.newsfeed.impl.items.posting.item.modals.PostingType;
import com.vk.posting.domain.PostingMetricsCreationEntryPoint;
import com.vk.profile.core.info_items.PostingCountersWithButtonItem;
import com.vk.stat.scheme.CommonCommunitiesStat$ClickEvent;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$NavigationEvent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsGroupsStat$TypeGroupsEventItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$PostDraftItemEventType;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.toggle.features.ComFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import xsna.bdc0;
import xsna.dw20;
import xsna.ghc0;
import xsna.gij;
import xsna.jbc0;
import xsna.mot0;

/* compiled from: PostingItemPresenter.kt */
/* loaded from: classes4.dex */
public class pgc0 implements egc0, jbc0.b, w8i {
    public final Object A;
    public final Object B;
    public final Object C;
    public final Object D;
    public final Object E;
    public gzs<s3q0> F;
    public io.reactivex.rxjava3.disposables.c G;
    public final Object H;
    public final b I;
    public final Object J;
    public final sjg b;
    public final UserId c;
    public LinearLayout d;
    public com.vk.profile.core.info_items.a e;
    public final Object f;
    public UserProfile g;
    public ExtendedUserProfile h;
    public aq1 i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public String n;
    public iug o;
    public x8a p;
    public bdc0 q;
    public PostingCreationEntryPoint r;
    public final Object s;
    public final Object t;
    public final bpn0 u;
    public final Object v;
    public final Object w;
    public final Object x;
    public final Object y;
    public final bpn0 z;

    /* compiled from: PostingItemPresenter.kt */
    public static final class a extends BroadcastReceiver {
        public final WeakReference<pgc0> a;

        public a(pgc0 pgc0Var) {
            this.a = new WeakReference<>(pgc0Var);
        }

        /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, kotlin.Lazy] */
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            pgc0 pgc0Var = this.a.get();
            if (pgc0Var == null) {
                return;
            }
            long longExtra = intent.getLongExtra("extra_clips_draft_author_id", 0L);
            String stringExtra = intent.getStringExtra("extra_clips_draft_entry_point");
            if (longExtra == 0) {
                return;
            }
            UserId userId = new UserId(longExtra);
            PostingCreationEntryPoint.Companion.getClass();
            ((com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.data.c) pgc0Var.t.getValue()).a(new gij.a(userId, PostingCreationEntryPoint.a.a(stringExtra), false));
        }
    }

    /* compiled from: PostingItemPresenter.kt */
    public static final class b extends BroadcastReceiver {
        public final WeakReference<pgc0> a;

        public b(pgc0 pgc0Var) {
            this.a = new WeakReference<>(pgc0Var);
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            String stringExtra;
            pgc0 pgc0Var = this.a.get();
            if (pgc0Var == null || (stringExtra = intent.getStringExtra("type")) == null) {
                return;
            }
            int hashCode = stringExtra.hashCode();
            if (hashCode == -1465299073) {
                if (stringExtra.equals("draftRemoved")) {
                    pgc0Var.h0();
                }
            } else if (hashCode == -1393798177 && stringExtra.equals("draftAdded")) {
                pgc0Var.h0();
            }
        }
    }

    /* compiled from: PostingItemPresenter.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PostingCreationEntryPoint.values().length];
            try {
                iArr[PostingCreationEntryPoint.ProfilePlusButton.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PostingCreationEntryPoint.FeedPlus.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: PostingItemPresenter.kt */
    public static final class d implements PostingCountersWithButtonItem.a {
        public d() {
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
        @Override // com.vk.profile.core.info_items.PostingCountersWithButtonItem.a
        public final void a() {
            UserId userId;
            pgc0 pgc0Var = pgc0.this;
            gzs<s3q0> gzsVar = pgc0Var.F;
            if (gzsVar != null) {
                gzsVar.invoke();
            }
            ghc0.f a = pgc0Var.f0(pgc0Var.c).a();
            PostingMetricsCreationEntryPoint a2 = hhc0.a(pgc0Var.r);
            a.getClass();
            a.c(MobileOfficialAppsConPostingStat$NavigationEvent.NavigationEventType.CLICK_TO_SUGGEST, a2);
            Context b = pgc0Var.b();
            if (b == null) {
                return;
            }
            ExtendedUserProfile extendedUserProfile = pgc0Var.h;
            if (extendedUserProfile == null || (userId = pgc0.g0(extendedUserProfile)) == null) {
                userId = UserId.d;
            }
            ((NewsfeedRouter) pgc0Var.w.getValue()).d(b, userId);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
        @Override // com.vk.profile.core.info_items.PostingCountersWithButtonItem.a
        public final void b() {
            ExtendedUserProfile extendedUserProfile;
            UserId g0;
            pgc0 pgc0Var = pgc0.this;
            gzs<s3q0> gzsVar = pgc0Var.F;
            if (gzsVar != null) {
                gzsVar.invoke();
            }
            ghc0.f a = pgc0Var.f0(pgc0Var.c).a();
            PostingMetricsCreationEntryPoint a2 = hhc0.a(pgc0Var.r);
            a.getClass();
            a.c(MobileOfficialAppsConPostingStat$NavigationEvent.NavigationEventType.CLICK_TO_DRAFTS, a2);
            Context b = pgc0Var.b();
            if (b == null || (extendedUserProfile = pgc0Var.h) == null || (g0 = pgc0.g0(extendedUserProfile)) == null) {
                return;
            }
            ((NewsfeedRouter) pgc0Var.w.getValue()).V(b, g0, NewsfeedRouter.OpenFromRef.REF_FEED);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
        @Override // com.vk.profile.core.info_items.PostingCountersWithButtonItem.a
        public final void c() {
            UserId userId;
            pgc0 pgc0Var = pgc0.this;
            gzs<s3q0> gzsVar = pgc0Var.F;
            if (gzsVar != null) {
                gzsVar.invoke();
            }
            ghc0.f a = pgc0Var.f0(pgc0Var.c).a();
            PostingMetricsCreationEntryPoint a2 = hhc0.a(pgc0Var.r);
            a.getClass();
            a.c(MobileOfficialAppsConPostingStat$NavigationEvent.NavigationEventType.CLICK_TO_POSTPONED, a2);
            Context b = pgc0Var.b();
            if (b == null) {
                return;
            }
            ExtendedUserProfile extendedUserProfile = pgc0Var.h;
            if (extendedUserProfile == null || (userId = pgc0.g0(extendedUserProfile)) == null) {
                userId = UserId.d;
            }
            ((NewsfeedRouter) pgc0Var.w.getValue()).z(b, userId);
        }
    }

    public pgc0(sjg sjgVar, UserId userId) {
        this.b = sjgVar;
        this.c = userId;
        kk1 kk1Var = new kk1(22);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f = msy.a(lazyThreadSafetyMode, kk1Var);
        this.j = true;
        this.k = true;
        this.l = true;
        this.r = PostingCreationEntryPoint.Other;
        this.s = msy.a(lazyThreadSafetyMode, new uq50(this, 21));
        this.t = msy.a(lazyThreadSafetyMode, new pm60(4));
        this.u = new bpn0(new odc0(this, 2));
        this.v = msy.a(lazyThreadSafetyMode, new wf40(this, 15));
        this.w = msy.a(lazyThreadSafetyMode, new ko00(this, 24));
        this.x = msy.a(lazyThreadSafetyMode, new g2c0(1));
        this.y = msy.a(lazyThreadSafetyMode, new hvz(this, 28));
        this.z = new bpn0(new f540(this, 15));
        this.A = msy.a(lazyThreadSafetyMode, new x550(this, 16));
        this.B = msy.a(lazyThreadSafetyMode, new a040(this, 23));
        this.C = msy.a(lazyThreadSafetyMode, new p6y(this, 26));
        this.D = msy.a(lazyThreadSafetyMode, new w2a0(3));
        this.E = msy.a(lazyThreadSafetyMode, new nm60(this, 8));
        this.H = msy.a(lazyThreadSafetyMode, new vo50(10));
        this.I = new b(this);
        this.J = msy.a(lazyThreadSafetyMode, new vt30(this, 21));
    }

    public static UserId g0(ExtendedUserProfile extendedUserProfile) {
        UserId userId;
        UserProfile userProfile = extendedUserProfile.a;
        return (userProfile == null || (userId = userProfile.c) == null) ? UserId.d : userId;
    }

    @Override // xsna.egc0
    public final void A6(final PostingCreationEntryPoint postingCreationEntryPoint) {
        final Context b2 = b();
        if (b2 == null) {
            return;
        }
        vec0 g = g();
        io.reactivex.rxjava3.internal.operators.single.b0 m = g.a.b(this.c).q(asu0.a.c()).m(io.reactivex.rxjava3.android.schedulers.a.b());
        io.reactivex.rxjava3.functions.f fVar = new io.reactivex.rxjava3.functions.f() { // from class: xsna.ngc0
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Object obj) {
                Long l = (Long) obj;
                long longValue = l.longValue();
                pgc0 pgc0Var = pgc0.this;
                if (longValue > 0) {
                    pgc0Var.z().h(l.longValue()).i(postingCreationEntryPoint).l(b2);
                } else {
                    pgc0Var.h0();
                }
            }
        };
        int i = kwg0.a;
        this.b.a(m.subscribe(fVar, new iwg0()));
        UserProfile userProfile = this.g;
        if (userProfile != null) {
            g2h g2hVar = new g2h(userProfile.c);
            g2hVar.b = "posting";
            g2hVar.d = "draft";
            g2hVar.a();
        }
    }

    @Override // xsna.egc0
    public final void F3() {
        jgc0 Z = Z();
        if (Z != null) {
            Z.oj(true);
        }
    }

    @Override // xsna.kgc0
    public void F5(final PostingCreationEntryPoint postingCreationEntryPoint, final boolean z, final UserId userId, final ExtendedUserProfile extendedUserProfile) {
        final Context b2;
        aq1 aq1Var = this.i;
        if ((aq1Var == null || ((Boolean) aq1Var.invoke(ExtendedCommunityProfile.StrikesRestriction.StrikeRestrictionType.POSTS)).booleanValue()) && (b2 = b()) != null) {
            u0(userId, postingCreationEntryPoint, new gzs() { // from class: xsna.lgc0
                @Override // xsna.gzs
                public final Object invoke() {
                    ExtendedUserProfile extendedUserProfile2;
                    UserId userId2;
                    pgc0 pgc0Var = pgc0.this;
                    kk6 z2 = pgc0Var.z();
                    if (z) {
                        if (pgc0Var.d0() && (extendedUserProfile2 = extendedUserProfile) != null && (userId2 = userId) != null) {
                            if (fkq0.b(userId2)) {
                                z2.g(pgc0.g0(extendedUserProfile2), extendedUserProfile2);
                            } else {
                                z2.a(pgc0.g0(extendedUserProfile2), extendedUserProfile2.a.e, true);
                            }
                        }
                        z2.c();
                    }
                    z2.i(postingCreationEntryPoint);
                    z2.l(b2);
                    return s3q0.a;
                }
            });
        }
    }

    @Override // xsna.egc0
    public final void G5(PostingCreationEntryPoint postingCreationEntryPoint) {
        this.r = postingCreationEntryPoint;
    }

    @Override // xsna.egc0
    public final void H4(boolean z) {
        this.k = z;
        jgc0 Z = Z();
        if (Z != null) {
            Z.p8(z);
        }
    }

    @Override // xsna.kgc0
    public void I0(UserId userId, PostingCreationEntryPoint postingCreationEntryPoint, boolean z) {
        Context b2;
        Activity h;
        UserId userId2;
        aq1 aq1Var = this.i;
        if ((aq1Var != null && !((Boolean) aq1Var.invoke(ExtendedCommunityProfile.StrikesRestriction.StrikeRestrictionType.SHORT_VIDEOS)).booleanValue()) || (b2 = b()) == null || (h = e3m.h(b2)) == null) {
            return;
        }
        UserProfile userProfile = this.g;
        if (z) {
            ghc0.f a2 = f0(userId).a();
            PostingMetricsCreationEntryPoint a3 = hhc0.a(postingCreationEntryPoint);
            a2.getClass();
            a2.c(MobileOfficialAppsConPostingStat$NavigationEvent.NavigationEventType.CLICK_TO_CLIP, a3);
            p0(SchemeStat$PostDraftItemEventType.CLICK_TO_CLIP);
        } else {
            ghc0.f a4 = f0(userId).a();
            PostingMetricsCreationEntryPoint a5 = hhc0.a(postingCreationEntryPoint);
            a4.getClass();
            a4.c(MobileOfficialAppsConPostingStat$NavigationEvent.NavigationEventType.CLICK_TO_CLIP_ICON, a5);
            p0(SchemeStat$PostDraftItemEventType.CLICK_TO_CLIP_ICON);
        }
        int i = c.$EnumSwitchMapping$0[postingCreationEntryPoint.ordinal()];
        boolean z2 = true;
        MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint creationEntryPoint = i != 1 ? i != 2 ? MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.CLUB_PLUS : MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.FEED_PLUS : MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.PROFILE_PLUS;
        if (d0() && creationEntryPoint == MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.FEED_PLUS && userId != null) {
            userId2 = userId;
        } else {
            userId2 = (creationEntryPoint == MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.CLUB_PLUS && userProfile != null && userProfile.C()) ? userProfile.c : null;
        }
        p1e e = ((ClipsEntryPointsComponent) this.z.getValue()).e();
        if (postingCreationEntryPoint == PostingCreationEntryPoint.FeedPlus && !d0()) {
            z2 = false;
        }
        e.a(h, new ClipsEntryPointsParams(creationEntryPoint, null, null, false, false, userId2, z2, null, 158, null));
    }

    /* JADX WARN: Type inference failed for: r12v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.kgc0
    public boolean L3(PostingCreationEntryPoint postingCreationEntryPoint) {
        ghc0.f a2 = f0(this.c).a();
        PostingMetricsCreationEntryPoint a3 = hhc0.a(postingCreationEntryPoint);
        a2.getClass();
        if (a3 == PostingMetricsCreationEntryPoint.GroupWallButton) {
            a2.c(MobileOfficialAppsConPostingStat$NavigationEvent.NavigationEventType.CLICK_TO_CHANNEL, a3);
            UserId userId = ghc0.this.i.b;
            if (userId != null) {
                new bjc(MobileOfficialAppsCoreNavStat$EventScreen.COMMUNITY_PAGE, SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), MobileOfficialAppsGroupsStat$TypeGroupsEventItem.a.a(userId.b, null, null, new CommonCommunitiesStat$ClickEvent(CommonCommunitiesStat$ClickEvent.ClickEventType.CLICK_TO_CHANNEL_POSTING_BUTTON, CommonCommunitiesStat$ClickEvent.Source.BLOCK_HEADER_COMMUNITY, null, 4, null), 30), 2)).q();
            }
        }
        Context b2 = b();
        if (b2 == null) {
            return false;
        }
        iug iugVar = this.o;
        String str = iugVar != null ? iugVar.b : null;
        if (str == null || drm0.N(str)) {
            return false;
        }
        maz.c((maz) this.A.getValue(), b2, str, LaunchContext.A, null, null, 24);
        return true;
    }

    @Override // xsna.egc0
    public final void M2(String str) {
        jgc0 Z = Z();
        if (Z != null) {
            Z.M2(str);
        }
    }

    @Override // xsna.egc0
    public final void N2() {
        com.vk.profile.core.info_items.a aVar = this.e;
        if (aVar == null) {
            aVar = null;
        }
        if (aVar != null) {
            com.vk.profile.core.info_items.a.x6(aVar.p);
            com.vk.profile.core.info_items.a.x6(aVar.q);
            com.vk.profile.core.info_items.a.x6(aVar.u);
            com.vk.profile.core.info_items.a.x6(aVar.v);
            aVar.q6();
            PostingCountersModel postingCountersModel = aVar.w;
            if (postingCountersModel != null) {
                aVar.s6(postingCountersModel);
            }
        }
    }

    @Override // xsna.egc0
    public final void R2(iug iugVar) {
        this.o = iugVar;
    }

    @Override // xsna.egc0
    public final void S3(boolean z) {
        jgc0 Z = Z();
        if (Z != null) {
            Z.Z5(z);
        }
    }

    @Override // xsna.egc0
    public final ViewGroup V3() {
        if (this.d == null) {
            LinearLayout linearLayout = new LinearLayout(b());
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            linearLayout.setOrientation(1);
            this.d = linearLayout;
            d dVar = new d();
            ExtendedUserProfile extendedUserProfile = this.h;
            boolean z = (extendedUserProfile != null ? Integer.valueOf(extendedUserProfile.a0) : null) != null && extendedUserProfile.a0 >= 2;
            int i = com.vk.profile.core.info_items.a.x;
            com.vk.profile.core.info_items.a aVar = new com.vk.profile.core.info_items.a(dVar, this.d, z);
            View view = aVar.itemView;
            this.e = aVar;
            this.d.addView(view);
            this.b.a(hg1.i(g().a.b(this.c), new bl30(this, 12)));
        }
        return this.d;
    }

    @Override // xsna.egc0
    public final boolean Y2() {
        return this.m;
    }

    @Override // xsna.egc0
    public final void Y5(boolean z) {
        this.j = z;
        jgc0 Z = Z();
        if (Z != null) {
            Z.q8(z);
        }
    }

    public final jgc0 Z() {
        Object obj = this.e;
        if (obj instanceof jgc0) {
            return (jgc0) obj;
        }
        return null;
    }

    public Context b() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean d0() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }

    @Override // xsna.egc0
    public final void d3() {
        vec0 g = g();
        io.reactivex.rxjava3.internal.operators.single.b0 m = g.a.b(this.c).q(asu0.a.c()).m(io.reactivex.rxjava3.android.schedulers.a.b());
        n1r n1rVar = new n1r(this, 16);
        int i = kwg0.a;
        this.b.a(m.subscribe(n1rVar, new iwg0()));
    }

    @Override // xsna.kgc0
    public void d7(UserId userId, PostingCreationEntryPoint postingCreationEntryPoint) {
        if (postingCreationEntryPoint == PostingCreationEntryPoint.FeedPlus && d0()) {
            e0(userId, postingCreationEntryPoint);
        } else {
            u0(userId, postingCreationEntryPoint, new vx(this, userId, postingCreationEntryPoint, 4));
        }
    }

    public final void e0(UserId userId, PostingCreationEntryPoint postingCreationEntryPoint) {
        Context b2;
        UserId userId2;
        aq1 aq1Var = this.i;
        if ((aq1Var == null || ((Boolean) aq1Var.invoke(ExtendedCommunityProfile.StrikesRestriction.StrikeRestrictionType.POSTS)).booleanValue()) && (b2 = b()) != null) {
            boolean z = postingCreationEntryPoint == PostingCreationEntryPoint.GroupWallButton;
            boolean z2 = d0() && postingCreationEntryPoint == PostingCreationEntryPoint.FeedPlus;
            boolean z3 = postingCreationEntryPoint == PostingCreationEntryPoint.ProfilePlusButton;
            if (z || z2 || z3) {
                if (userId == null) {
                    ExtendedUserProfile extendedUserProfile = this.h;
                    userId2 = extendedUserProfile != null ? g0(extendedUserProfile) : null;
                } else {
                    userId2 = userId;
                }
                if (userId2 != null) {
                    mot0.b(mot0.a.a, b2, userId2, 0, postingCreationEntryPoint.toString(), 4);
                }
            } else {
                kk6 z4 = z();
                z4.c();
                z4.i(postingCreationEntryPoint);
                z4.f().l(b2);
            }
            ghc0.f a2 = f0(userId).a();
            PostingMetricsCreationEntryPoint a3 = hhc0.a(postingCreationEntryPoint);
            a2.getClass();
            a2.c(MobileOfficialAppsConPostingStat$NavigationEvent.NavigationEventType.CLICK_TO_VIDEO, a3);
            p0(SchemeStat$PostDraftItemEventType.CLICK_TO_VIDEO);
        }
    }

    public final fhc0 f0(UserId userId) {
        fhc0 fhc0Var = (fhc0) this.u.getValue();
        if (userId == null) {
            userId = this.c;
        }
        fhc0Var.c(userId);
        return fhc0Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final vec0 g() {
        return (vec0) this.E.getValue();
    }

    @Override // xsna.egc0
    public final void h7(boolean z) {
        this.l = z;
    }

    @Override // xsna.jbc0.b
    public final jbc0.a i0() {
        return new jbc0.a(null, null, null, null, null, null, null, null, null, null, null, null, null, x(), null, 49151);
    }

    @Override // xsna.egc0
    public final void i3(PostingCountersModel postingCountersModel) {
        com.vk.profile.core.info_items.a aVar = this.e;
        if (aVar != null) {
            aVar.w = postingCountersModel;
            aVar.s6(postingCountersModel);
        }
    }

    @Override // xsna.egc0
    public final void m(String str) {
        this.n = str;
        com.vk.profile.core.info_items.a aVar = this.e;
        if (aVar != null) {
            aVar.p.setText(str);
        }
    }

    @Override // xsna.egc0
    public final void n7(int i) {
        com.vk.profile.core.info_items.a aVar = this.e;
        if (aVar != null) {
            VkButton vkButton = aVar.p;
            Integer valueOf = Integer.valueOf(R.drawable.vk_icon_add_20);
            int[] iArr = VkButton.W;
            vkButton.a5(true, valueOf);
            vkButton.setIconSize(Integer.valueOf(i));
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.cc6
    public final void onDestroy() {
        Context b2 = b();
        if (b2 != null) {
            cuz.a(b2).d(this.I);
            if (d0()) {
                cuz.a(b2).d((a) this.J.getValue());
            }
        }
        io.reactivex.rxjava3.disposables.c cVar = this.G;
        if (cVar != null) {
            cVar.dispose();
        }
        this.G = null;
        bdc0 bdc0Var = this.q;
        if (bdc0Var != null) {
            sk3<bdc0.a> sk3Var = bdc0Var.d;
            while (!sk3Var.isEmpty()) {
                bdc0.a m = sk3Var.m();
                if (m != null) {
                    m.a().dismiss();
                }
            }
            sk3Var.clear();
            sk3Var.clear();
            bdc0Var.f = null;
            bdc0Var.e = null;
        }
        this.q = null;
    }

    @Override // xsna.cc6
    public final void onPause() {
        throw null;
    }

    @Override // xsna.cc6
    public final void onResume() {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.egc0
    public final void onStart() {
        Context b2 = b();
        if (b2 == null) {
            return;
        }
        cuz.a(b2).b(this.I, new IntentFilter("draft"));
        if (d0()) {
            cuz.a(b2).b((a) this.J.getValue(), new IntentFilter("com.vk.clips.intent.DRAFT_SAVED"));
        }
        this.G = ((ycc0) this.v.getValue()).c().subscribe();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void p0(SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType) {
        ?? r2 = this.s;
        ((jbc0) r2.getValue()).h(this);
        ((jbc0) r2.getValue()).g();
    }

    @Override // xsna.egc0
    public final boolean q4() {
        vec0 g = g();
        return g.a.d(this.c);
    }

    @Override // xsna.egc0
    public final void s7(boolean z) {
        this.m = z;
        jgc0 Z = Z();
        if (Z != null) {
            Z.v5(z);
        }
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void u0(UserId userId, PostingCreationEntryPoint postingCreationEntryPoint, gzs<s3q0> gzsVar) {
        if (d0() && postingCreationEntryPoint == PostingCreationEntryPoint.FeedPlus && userId != null && fkq0.b(userId)) {
            gzsVar.invoke();
            return;
        }
        Context b2 = b();
        if (b2 == null) {
            return;
        }
        if (q4()) {
            ((Handler) this.H.getValue()).post(new kg40(b2, this, postingCreationEntryPoint, gzsVar, 1));
        } else {
            gzsVar.invoke();
        }
    }

    @Override // xsna.egc0
    public final <T extends ExtendedUserProfile> void u6(T t) {
        this.h = t;
        this.g = t.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0082  */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.kgc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v0(boolean z, PostingCreationEntryPoint postingCreationEntryPoint, String str) {
        boolean z2;
        x8a x8aVar;
        Map<String, String> map;
        Context b2 = b();
        if (b2 == null) {
            return;
        }
        f0(this.c).a().a(hhc0.a(postingCreationEntryPoint));
        p0(SchemeStat$PostDraftItemEventType.CLICK_TO_PLUS);
        ?? r2 = this.B;
        h7v h7vVar = (h7v) r2.getValue();
        HintId hintId = HintId.GROUP_CHANNEL_BANNER;
        Hint p = h7vVar.p(hintId.getId());
        if (p != null) {
            iug iugVar = this.o;
            String str2 = iugVar != null ? iugVar.b : null;
            if (str2 == null || drm0.N(str2)) {
                HashSet hashSet = iah0.a;
                if (fnj.c(b2) && iah0.s(b2)) {
                    z2 = true;
                    if (z2) {
                        ((h7v) r2.getValue()).b(hintId.getId());
                    }
                    if (this.p == null) {
                        this.p = new x8a((h7v) r2.getValue());
                    }
                    ExtendedUserProfile extendedUserProfile = this.h;
                    boolean z3 = !(extendedUserProfile == null ? bwd0.g(extendedUserProfile) ^ true : false) || ((Boolean) this.D.getValue()).booleanValue();
                    ExtendedUserProfile extendedUserProfile2 = this.h;
                    boolean z4 = extendedUserProfile2 == null && (bwd0.g(extendedUserProfile2) ^ true);
                    boolean z5 = this.j;
                    boolean z6 = this.k;
                    boolean z7 = this.l;
                    ExtendedUserProfile extendedUserProfile3 = this.h;
                    boolean z8 = extendedUserProfile3 == null && bwd0.g(extendedUserProfile3);
                    String str3 = this.n;
                    iug iugVar2 = this.o;
                    rs80 rs80Var = new rs80(z, z6, z7, z5, z3, z4, z8, postingCreationEntryPoint, str3, new m7b(iugVar2 == null && iugVar2.a, z2, (p != null || (map = p.e) == null) ? null : map.get("subtitle_posting_button")), new o6c0(str));
                    x8aVar = this.p;
                    if (x8aVar == null) {
                        com.vk.newsfeed.impl.items.posting.item.modals.b bVar = new com.vk.newsfeed.impl.items.posting.item.modals.b(rs80Var, this, (h7v) x8aVar.b);
                        List A = rli0.A(new ulp0(rli0.j(new i5g(bVar.c((z3 && z8) ? new PostingType.UserRedesigned(0) : z3 ? PostingType.b.a : PostingType.a.a)), new k220(13)), new nc90(2)));
                        if (A.size() != 1) {
                            com.vk.newsfeed.impl.items.posting.item.modals.d dVar = new com.vk.newsfeed.impl.items.posting.item.modals.d(b2, rs80Var, this, bVar);
                            dVar.e = new dw20.b(b2, null).D0(dVar.d, false).F0(true).B(cn70.b(10), true, true).c(new cpo(false, iah0.a(100), 3)).l(dhr0.t.c(R.attr.vk_ui_background_content)).n(new asj0(dVar)).I0("modal_create_simple_post_redesigned");
                            return;
                        } else {
                            gzs gzsVar = (gzs) j5g.a0(A);
                            if (gzsVar != null) {
                                gzsVar.invoke();
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
            }
        }
        z2 = false;
        if (z2) {
        }
        if (this.p == null) {
        }
        ExtendedUserProfile extendedUserProfile4 = this.h;
        if (extendedUserProfile4 == null ? bwd0.g(extendedUserProfile4) ^ true : false) {
        }
        ExtendedUserProfile extendedUserProfile22 = this.h;
        if (extendedUserProfile22 == null) {
        }
        boolean z52 = this.j;
        boolean z62 = this.k;
        boolean z72 = this.l;
        ExtendedUserProfile extendedUserProfile32 = this.h;
        if (extendedUserProfile32 == null) {
        }
        String str32 = this.n;
        iug iugVar22 = this.o;
        rs80 rs80Var2 = new rs80(z, z62, z72, z52, z3, z4, z8, postingCreationEntryPoint, str32, new m7b(iugVar22 == null && iugVar22.a, z2, (p != null || (map = p.e) == null) ? null : map.get("subtitle_posting_button")), new o6c0(str));
        x8aVar = this.p;
        if (x8aVar == null) {
        }
    }

    @Override // xsna.kgc0
    public void w5(boolean z, PostingCreationEntryPoint postingCreationEntryPoint) {
        Context b2;
        String str;
        String str2;
        String str3;
        aq1 aq1Var = this.i;
        if ((aq1Var == null || ((Boolean) aq1Var.invoke(ExtendedCommunityProfile.StrikesRestriction.StrikeRestrictionType.LIVES)).booleanValue()) && (b2 = b()) != null) {
            UserId userId = UserId.d;
            UserProfile userProfile = this.g;
            if (userProfile != null) {
                String str4 = fkq0.d(userProfile.c) ? CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE : "club";
                UserId userId2 = userProfile.c;
                str3 = userProfile.e;
                String str5 = userProfile.h;
                str = str4;
                userId = userId2;
                str2 = str5;
            } else {
                str = "posting";
                str2 = null;
                str3 = null;
            }
            if (z) {
                UserProfile userProfile2 = this.g;
                ghc0.f a2 = f0(userProfile2 != null ? userProfile2.c : null).a();
                PostingMetricsCreationEntryPoint a3 = hhc0.a(postingCreationEntryPoint);
                a2.getClass();
                a2.c(MobileOfficialAppsConPostingStat$NavigationEvent.NavigationEventType.CLICK_TO_LIVE, a3);
                p0(SchemeStat$PostDraftItemEventType.CLICK_TO_LIVE);
            } else {
                ghc0.f a4 = f0(this.c).a();
                PostingMetricsCreationEntryPoint a5 = hhc0.a(postingCreationEntryPoint);
                a4.getClass();
                a4.c(MobileOfficialAppsConPostingStat$NavigationEvent.NavigationEventType.CLICK_TO_LIVE_ICON, a5);
                p0(SchemeStat$PostDraftItemEventType.CLICK_TO_LIVE_ICON);
            }
            String ref = this.b.getRef();
            if (ref == null) {
                ref = "";
            }
            com.vk.storycamera.builder.a aVar = new com.vk.storycamera.builder.a(ref, str);
            aVar.q(userId, str3, str2);
            StoryCameraMode storyCameraMode = StoryCameraMode.LIVE;
            aVar.g = e43.a(storyCameraMode);
            aVar.f = storyCameraMode;
            aVar.C(b2);
            UserProfile userProfile3 = this.g;
            if (userProfile3 != null) {
                g2h g2hVar = new g2h(userProfile3.c);
                g2hVar.b = "posting";
                g2hVar.d = "live";
                g2hVar.a();
            }
        }
    }

    public String x() {
        return this.b.getRef();
    }

    @Override // xsna.kgc0
    public void x1(final boolean z, final PostingCreationEntryPoint postingCreationEntryPoint) {
        u0(this.c, postingCreationEntryPoint, new gzs() { // from class: xsna.mgc0
            @Override // xsna.gzs
            public final Object invoke() {
                Context b2;
                pgc0 pgc0Var = pgc0.this;
                UserId userId = pgc0Var.c;
                aq1 aq1Var = pgc0Var.i;
                if ((aq1Var == null || ((Boolean) aq1Var.invoke(ExtendedCommunityProfile.StrikesRestriction.StrikeRestrictionType.POSTS)).booleanValue()) && (b2 = pgc0Var.b()) != null) {
                    kk6 z2 = pgc0Var.z();
                    boolean z3 = z;
                    PostingCreationEntryPoint postingCreationEntryPoint2 = postingCreationEntryPoint;
                    if (z3) {
                        z2.c();
                        pgc0Var.p0(SchemeStat$PostDraftItemEventType.CLICK_TO_GALLERY);
                        ghc0.f a2 = pgc0Var.f0(userId).a();
                        PostingMetricsCreationEntryPoint a3 = hhc0.a(postingCreationEntryPoint2);
                        a2.getClass();
                        a2.c(MobileOfficialAppsConPostingStat$NavigationEvent.NavigationEventType.CLICK_TO_GALLERY, a3);
                    } else {
                        pgc0Var.p0(SchemeStat$PostDraftItemEventType.CLICK_TO_GALLERY_ICON);
                        ghc0.f a4 = pgc0Var.f0(userId).a();
                        PostingMetricsCreationEntryPoint a5 = hhc0.a(postingCreationEntryPoint2);
                        a4.getClass();
                        a4.c(MobileOfficialAppsConPostingStat$NavigationEvent.NavigationEventType.CLICK_TO_GALLERY_ICON, a5);
                    }
                    z2.i(postingCreationEntryPoint2);
                    z2.k().l(b2);
                    UserProfile userProfile = pgc0Var.g;
                    if (userProfile != null) {
                        g2h g2hVar = new g2h(userProfile.c);
                        g2hVar.b = "posting";
                        g2hVar.d = "image";
                        g2hVar.a();
                    }
                }
                return s3q0.a;
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.kgc0
    public final void y4(Context context, PostingCreationEntryPoint postingCreationEntryPoint, gzs<s3q0> gzsVar) {
        ComFeatures comFeatures = ComFeatures.COM_POSTING_AUTHOR_SELECTION;
        comFeatures.getClass();
        if (!com.vk.toggle.b.A.a(comFeatures)) {
            gzsVar.invoke();
            return;
        }
        UserId c2 = ((BridgeComponent) ((k7m) m7m.f(this)).a(fpf0.a(BridgeComponent.class))).s().c();
        if (this.q == null) {
            this.q = new bdc0(postingCreationEntryPoint, c2, (wcc0) this.y.getValue());
        }
        bdc0 bdc0Var = this.q;
        if (bdc0Var != null) {
            bdc0Var.f = this;
            bdc0Var.e = null;
            bdc0Var.d.clear();
            bdc0Var.b(context, this);
        }
    }

    public kk6 z() {
        int i = rfc0.a;
        return new q860();
    }

    public void h0() {
    }

    @Override // xsna.egc0
    public final void o7(int i) {
    }

    @Override // xsna.kgc0
    public void d2(boolean z, dic0 dic0Var, PostingCreationEntryPoint postingCreationEntryPoint) {
    }
}
