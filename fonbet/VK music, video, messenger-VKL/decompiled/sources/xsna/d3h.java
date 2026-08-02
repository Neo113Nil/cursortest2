package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.common.links.LaunchContext;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.dto.common.id.UserId;
import com.vk.dto.profile.CatchUpBanner;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.profile.community.impl.ui.CommunityAction;
import com.vk.profile.community.impl.ui.members.GroupMembersFragment;
import com.vk.profile.community.impl.ui.suggestions.model.SuggestionVariant;
import com.vk.profile.community.impl.ui.tag.CommunityActionTags;
import com.vk.stat.scheme.CommonCommunitiesStat$ClickEvent;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeChannelItemClick;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.toggle.features.ComFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vkontakte.android.data.groups.FullSourceJoinApi;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.o1i;

/* compiled from: CommunityHeaderActionsDelegate.kt */
/* loaded from: classes5.dex */
public final class d3h implements ebh {
    public final FragmentImpl a;
    public final ExtendedCommunityProfile b;
    public final a c;
    public final String d;
    public final com.vk.ecomm.avito.api.a e;
    public final rmh f;
    public final cfh g;
    public final xv00 h;
    public final cwh i;
    public final zah j;
    public final b3i k;
    public final anm0 l;
    public final to80 m;
    public final rml0 n;
    public final maz o;
    public final qoh p;
    public final zqu q = new zqu();
    public final Object r;
    public final Object s;
    public final Object t;

    /* compiled from: CommunityHeaderActionsDelegate.kt */
    public interface a {
        void a();

        void b(String str);

        void c();

        void d();

        void e(ExtendedCommunityProfile extendedCommunityProfile);

        void f(UserId userId);

        void g();

        void h();

        void i();

        String j();

        void k(ExtendedCommunityProfile extendedCommunityProfile, String str);

        void l(String str, String str2);

        void m(io.reactivex.rxjava3.disposables.c cVar);

        void n();
    }

    /* compiled from: CommunityHeaderActionsDelegate.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[CommunityActionTags.values().length];
            try {
                iArr[CommunityActionTags.JOIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommunityActionTags.JOIN_UNSURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CommunityActionTags.LEAVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CommunityActionTags.EVENT_OPTIONS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CommunityActionTags.CALL_TO_ACTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CommunityActionTags.OPTIONS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CommunityActionTags.MESSAGE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CommunityActionTags.NOTIFICATION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CommunityActionTags.REVIEW.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[CommunityActionTags.ADMIN_MESSAGES.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[CommunityActionTags.ADMIN_PROMOTION.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[CommunityActionTags.JOIN_POPUP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CatchUpBanner.Style.values().length];
            try {
                iArr2[CatchUpBanner.Style.ONLINE_BOOKING_SECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[CatchUpBanner.Style.SOCCOM_DEFAULT_BANNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[SuggestionVariant.values().length];
            try {
                iArr3[SuggestionVariant.ON_SUBSCRIBE.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[SuggestionVariant.PERMANENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* compiled from: CommunityHeaderActionsDelegate.kt */
    public static final class c extends beg0 {
        public final /* synthetic */ Context d;
        public final /* synthetic */ d3h e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, d3h d3hVar) {
            super(context);
            this.d = context;
            this.e = d3hVar;
        }

        @Override // xsna.beg0
        public final void r() {
            cvk.w(this.d.getString(R.string.community_news_shown), false);
            d3h d3hVar = this.e;
            ExtendedCommunityProfile extendedCommunityProfile = d3hVar.b;
            extendedCommunityProfile.m0 = false;
            d3hVar.c.e(extendedCommunityProfile);
        }
    }

    /* compiled from: CommunityHeaderActionsDelegate.kt */
    public static final class d extends beg0 {
        public final /* synthetic */ Context d;
        public final /* synthetic */ d3h e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, d3h d3hVar) {
            super(context);
            this.d = context;
            this.e = d3hVar;
        }

        @Override // xsna.beg0
        public final void r() {
            cvk.w(this.d.getString(R.string.community_news_hidden), false);
            d3h d3hVar = this.e;
            ExtendedCommunityProfile extendedCommunityProfile = d3hVar.b;
            extendedCommunityProfile.m0 = true;
            d3hVar.c.e(extendedCommunityProfile);
        }
    }

    /* compiled from: CommunityHeaderActionsDelegate.kt */
    public static final class e extends beg0 {
        public final /* synthetic */ Context d;
        public final /* synthetic */ d3h e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context, d3h d3hVar) {
            super(context);
            this.d = context;
            this.e = d3hVar;
        }

        @Override // xsna.beg0
        public final void r() {
            d3h d3hVar = this.e;
            ExtendedCommunityProfile extendedCommunityProfile = d3hVar.b;
            boolean z = extendedCommunityProfile.i1;
            extendedCommunityProfile.i1 = !z;
            cvk.w(this.d.getString(!z ? R.string.video_live_subscribed : R.string.video_live_unsubscribed), false);
            d3hVar.c.e(extendedCommunityProfile);
        }
    }

    /* compiled from: CommunityHeaderActionsDelegate.kt */
    public static final class f extends beg0 {
        public final /* synthetic */ Context d;
        public final /* synthetic */ d3h e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Context context, d3h d3hVar) {
            super(context);
            this.d = context;
            this.e = d3hVar;
        }

        @Override // xsna.beg0
        public final void r() {
            d3h d3hVar = this.e;
            ExtendedCommunityProfile extendedCommunityProfile = d3hVar.b;
            boolean z = extendedCommunityProfile.j1;
            extendedCommunityProfile.j1 = !z;
            cvk.w(this.d.getString(!z ? R.string.subscribed_to_posts : R.string.unsubscribed_from_posts), false);
            d3hVar.c.e(extendedCommunityProfile);
        }
    }

    /* compiled from: CommunityHeaderActionsDelegate.kt */
    public static final class g extends beg0 {
        public final /* synthetic */ Context d;
        public final /* synthetic */ d3h e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Context context, d3h d3hVar) {
            super(context);
            this.d = context;
            this.e = d3hVar;
        }

        @Override // xsna.beg0
        public final void r() {
            d3h d3hVar = this.e;
            ExtendedCommunityProfile extendedCommunityProfile = d3hVar.b;
            boolean z = extendedCommunityProfile.e1;
            extendedCommunityProfile.e1 = !z;
            cvk.w(this.d.getString(!z ? R.string.community_podcasts_subscribed : R.string.community_podcasts_unsubscribed), false);
            d3hVar.c.e(extendedCommunityProfile);
        }
    }

    public d3h(FragmentImpl fragmentImpl, ExtendedCommunityProfile extendedCommunityProfile, a aVar, String str, com.vk.ecomm.avito.api.a aVar2, rmh rmhVar, cfh cfhVar, xv00 xv00Var, cwh cwhVar, zah zahVar, b3i b3iVar, anm0 anm0Var, to80 to80Var, rml0 rml0Var, maz mazVar, qoh qohVar) {
        this.a = fragmentImpl;
        this.b = extendedCommunityProfile;
        this.c = aVar;
        this.d = str;
        this.e = aVar2;
        this.f = rmhVar;
        this.g = cfhVar;
        this.h = xv00Var;
        this.i = cwhVar;
        this.j = zahVar;
        this.k = b3iVar;
        this.l = anm0Var;
        this.m = to80Var;
        this.n = rml0Var;
        this.o = mazVar;
        this.p = qohVar;
        b3 b3Var = new b3(this, 23);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.r = msy.a(lazyThreadSafetyMode, b3Var);
        this.s = msy.a(lazyThreadSafetyMode, new sbg(this, 4));
        this.t = msy.a(lazyThreadSafetyMode, new tbg(this, 2));
    }

    @Override // xsna.ebh
    public final void a() {
        Context mo2getContext = this.a.mo2getContext();
        if (mo2getContext == null) {
            return;
        }
        zah zahVar = this.j;
        CommunityAction communityAction = CommunityAction.SUBSCRIBE_LIVE;
        ExtendedCommunityProfile extendedCommunityProfile = this.b;
        zahVar.c(extendedCommunityProfile, communityAction);
        jx2 jx2Var = new jx2(new r6z(extendedCommunityProfile.a.c, !extendedCommunityProfile.i1), new e(mo2getContext, this));
        jx2Var.g = mo2getContext;
        jx2Var.h = 400L;
        jx2Var.a();
    }

    @Override // xsna.ebh
    public final void b() {
        Context mo2getContext = this.a.mo2getContext();
        if (mo2getContext == null) {
            return;
        }
        jx2 jx2Var = new jx2(new zs(this.b.a.c, cqm0.m("BLOCK_HEADER_COMMUNITY"), !r3.j1), new f(mo2getContext, this));
        jx2Var.g = mo2getContext;
        jx2Var.h = 400L;
        jx2Var.a();
    }

    @Override // xsna.ebh
    public final void c() {
        Context mo2getContext = this.a.mo2getContext();
        if (mo2getContext == null) {
            return;
        }
        ExtendedCommunityProfile extendedCommunityProfile = this.b;
        boolean z = !extendedCommunityProfile.I1;
        this.l.A(z, false, MobileOfficialAppsCoreNavStat$EventScreen.PROFILE, null);
        io.reactivex.rxjava3.core.x n = hg1.n(qxi.a().h(extendedCommunityProfile.a.c, null, z).q(asu0.a.c()).m(io.reactivex.rxjava3.android.schedulers.a.b()), mo2getContext, false, null, 62);
        int i = kwg0.a;
        this.c.m(n.subscribe(new iwg0(), new kl6(new tb4(13), 9)));
    }

    @Override // xsna.ebh
    public final void d() {
        Context mo2getContext = this.a.mo2getContext();
        if (mo2getContext == null) {
            return;
        }
        zah zahVar = this.j;
        CommunityAction communityAction = CommunityAction.SUBSCRIBE_PODCASTS;
        ExtendedCommunityProfile extendedCommunityProfile = this.b;
        zahVar.c(extendedCommunityProfile, communityAction);
        jx2 jx2Var = new jx2(new ak70(extendedCommunityProfile.a.c, !extendedCommunityProfile.e1), new g(mo2getContext, this));
        jx2Var.g = mo2getContext;
        jx2Var.h = 400L;
        jx2Var.a();
    }

    public final void e(View view, String str, Rect rect) {
        View view2;
        VkContextMenu.c cVar;
        VkContextMenu.c cVar2;
        Context mo2getContext = this.a.mo2getContext();
        if (mo2getContext == null) {
            return;
        }
        if (rect != null) {
            int l = krv0.l(R.attr.vk_ui_icon_accent);
            view.getContext();
            cVar = new e.c(null, rect, view, l, 1);
            view2 = view;
        } else {
            view2 = view;
            int l2 = krv0.l(R.attr.vk_ui_icon_accent);
            view2.getContext();
            e.b bVar = new e.b(view2, null, null, l2, 6);
            bVar.w = R.layout.ds_internal_context_menu_item;
            cVar = bVar;
        }
        ExtendedCommunityProfile extendedCommunityProfile = this.b;
        int i = extendedCommunityProfile.a1;
        if (i == 1 || i == 2) {
            if (extendedCommunityProfile.Y != 1 || extendedCommunityProfile.T <= pvo0.a()) {
                cVar2 = cVar;
                VkContextMenu.c.c(cVar2, extendedCommunityProfile.Y != 2 ? R.string.leave_group : R.string.profile_unsubscribe, null, false, null, new com.vk.catalog2.common.ui.holders.b(6, this, str), 30);
            } else {
                com.vk.catalog2.common.ui.holders.a aVar = new com.vk.catalog2.common.ui.holders.a(7, this, view2);
                cVar2 = cVar;
                VkContextMenu.c.c(cVar2, R.string.event_change_decision, null, false, null, aVar, 30);
            }
            VkContextMenu.c.d(cVar2, mo2getContext.getString(extendedCommunityProfile.m0 ? R.string.show_community_news : R.string.hide_community_news), null, false, new oo(this, 27), 30);
        } else if (i == 4) {
            cVar2 = cVar;
            VkContextMenu.c.c(cVar2, R.string.profile_friend_cancel, null, false, null, new wx0(5, this, str), 30);
        } else if (i != 5) {
            cVar2 = cVar;
        } else {
            if (extendedCommunityProfile.Y == 1) {
                cVar2 = cVar;
                VkContextMenu.c.c(cVar2, R.string.group_event_join, null, false, null, new hn9(5, this, str), 30);
                VkContextMenu.c.c(cVar2, R.string.group_event_join_unsure, null, false, null, new rp1(6, this, str), 30);
            } else {
                cVar2 = cVar;
                VkContextMenu.c.c(cVar2, R.string.group_inv_accept, null, false, null, new mk(5, this, str), 30);
            }
            VkContextMenu.c.c(cVar2, R.string.group_inv_decline, null, false, null, new com.vk.movika.sdk.base.ui.r0(8, this, str), 30);
        }
        if (cVar2.f.isEmpty()) {
            return;
        }
        cVar2.a().j(false);
    }

    public final void f(View view, CommunityActionTags communityActionTags) {
        a aVar = this.c;
        String j = aVar.j();
        int i = b.$EnumSwitchMapping$0[communityActionTags.ordinal()];
        ExtendedCommunityProfile extendedCommunityProfile = this.b;
        switch (i) {
            case 1:
                h(j, true);
                return;
            case 2:
                h(j, false);
                return;
            case 3:
                i(j);
                return;
            case 4:
                m(view, j);
                return;
            case 5:
                aVar.k(extendedCommunityProfile, j);
                return;
            case 6:
                e(view, j, null);
                return;
            case 7:
                Context mo2getContext = this.a.mo2getContext();
                if (mo2getContext == null) {
                    return;
                }
                g2v.c().b().t(mo2getContext, (int) bwd0.i(extendedCommunityProfile).b, null, "community_page", "vkapp_profile_page");
                MobileOfficialAppsSearchStat$TypeSearchClickItem.Action action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SEND_MESSAGE_OUT;
                zah zahVar = this.j;
                SearchStatsLoggingInfo searchStatsLoggingInfo = zahVar.b;
                if (searchStatsLoggingInfo != null) {
                    zahVar.a.a(action, searchStatsLoggingInfo);
                }
                p0e0.c(bwd0.i(extendedCommunityProfile), j);
                return;
            case 8:
                lbh.a(extendedCommunityProfile, this, new o1i.a.InterfaceC3433a.b(view));
                return;
            case 9:
                this.i.b();
                return;
            case 10:
                aVar.i();
                g2h g2hVar = new g2h(bwd0.i(extendedCommunityProfile));
                g2hVar.b = "unread_messages";
                g2hVar.a();
                return;
            case 11:
                ExtendedCommunityProfile extendedCommunityProfile2 = this.b;
                ExtendedCommunityProfile.a aVar2 = extendedCommunityProfile2.j2;
                if (aVar2 != null) {
                    l(aVar2.a);
                }
                zah.b(this.j, bwd0.i(extendedCommunityProfile2), CommonCommunitiesStat$ClickEvent.ClickEventType.CLICK_ADS_PROMOTION_BUTTON, CommonCommunitiesStat$ClickEvent.Source.BLOCK_HEADER_COMMUNITY, null, 24);
                return;
            case 12:
                n(null, view);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void g() {
        Context mo2getContext = this.a.mo2getContext();
        if (mo2getContext == null) {
            return;
        }
        ExtendedCommunityProfile extendedCommunityProfile = this.b;
        if (extendedCommunityProfile.m0) {
            jx2 jx2Var = new jx2(new fh60(bwd0.i(extendedCommunityProfile)), new c(mo2getContext, this));
            jx2Var.g = mo2getContext;
            jx2Var.a();
            return;
        }
        UserId userId = extendedCommunityProfile.a.c;
        StringBuilder sb = new StringBuilder();
        sb.append(fkq0.b(userId) ? "club" : CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE);
        sb.append(userId.b);
        jx2 jx2Var2 = new jx2(new lc60(userId, sb.toString()), new d(mo2getContext, this));
        jx2Var2.g = mo2getContext;
        jx2Var2.a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void h(String str, boolean z) {
        String name;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        FullSourceJoinApi.EntryServiceType entryServiceType;
        n6h n6hVar = (n6h) this.t.getValue();
        UiTracker uiTracker = UiTracker.a;
        String name2 = UiTracker.c().name();
        qoh qohVar = this.p;
        if (qohVar == null || (name = qohVar.c) == null) {
            UiTrackingScreen b2 = UiTracker.j.b();
            name = (b2 == null || (mobileOfficialAppsCoreNavStat$EventScreen = b2.a) == null) ? null : mobileOfficialAppsCoreNavStat$EventScreen.name();
        }
        String h = FullSourceJoinApi.SourceType.BLOCK_HEADER_COMMUNITY.h();
        String str2 = qohVar != null ? qohVar.a : null;
        String i = (qohVar == null || (entryServiceType = qohVar.b) == null) ? null : entryServiceType.i();
        n6h.b(n6hVar, this.b, z, str, this.d, new FullSourceJoinApi(cqm0.m(name2), name != null ? cqm0.m(name) : null, h != null ? cqm0.m(h) : null, str2 != null ? cqm0.m(str2) : null, i != null ? cqm0.m(i) : null, null), 16);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void i(String str) {
        b7h.b((b7h) this.s.getValue(), this.b, str, this.d, 8);
    }

    public final void j(ExtendedCommunityProfile extendedCommunityProfile, boolean z) {
        Context mo2getContext = this.a.mo2getContext();
        if (mo2getContext == null) {
            return;
        }
        UserId userId = extendedCommunityProfile.a.c;
        Bundle bundle = new Bundle();
        bundle.putParcelable("gid", fkq0.e(userId));
        bundle.putCharSequence("title", mo2getContext.getString(R.string.group_members));
        bundle.putInt("type", extendedCommunityProfile.Y);
        bundle.putBoolean("_can_go_back", true);
        bundle.putBoolean("start_from_friends", z);
        bundle.putBoolean("members_is_hidden", (extendedCommunityProfile.x || bwd0.a(extendedCommunityProfile)) ? false : true);
        bundle.putBoolean("has_donut_tab", extendedCommunityProfile.t2 != null && extendedCommunityProfile.a0 >= 2);
        CommonCommunitiesStat$ClickEvent.Source source = CommonCommunitiesStat$ClickEvent.Source.BLOCK_HEADER_COMMUNITY;
        bundle.putSerializable("source", source);
        bundle.putSerializable("screen", MobileOfficialAppsCoreNavStat$EventScreen.GROUP);
        new oz50(GroupMembersFragment.class, null, bundle).k(mo2getContext);
        ComFeatures comFeatures = ComFeatures.COM_DONUT_VISIBILITY;
        comFeatures.getClass();
        if (com.vk.toggle.b.A.a(comFeatures)) {
            return;
        }
        zah.b(this.j, extendedCommunityProfile.a.c, z ? CommonCommunitiesStat$ClickEvent.ClickEventType.OPEN_SUBSCRIBED_FRIENDS_LIST : CommonCommunitiesStat$ClickEvent.ClickEventType.OPEN_SUBSCRIBED_LIST, source, null, 24);
    }

    public final void k(UserId userId, Integer num, Integer num2, String str) {
        UserId userId2;
        if (num == null || num2 == null) {
            userId2 = userId;
        } else {
            userId2 = userId;
            new bjc(MobileOfficialAppsCoreNavStat$EventScreen.GROUP, SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), new CommonCommunitiesStat$TypeChannelItemClick(CommonCommunitiesStat$TypeChannelItemClick.Event.OPEN_CHANNEL, userId2.b, num.intValue(), CommonCommunitiesStat$TypeChannelItemClick.ContentType.CHANNEL_PREVIEW, num2.intValue()), 2)).q();
        }
        zah.b(this.j, userId2, CommonCommunitiesStat$ClickEvent.ClickEventType.CLICK_TO_CHANNEL_BUTTON, CommonCommunitiesStat$ClickEvent.Source.BLOCK_HEADER_COMMUNITY, null, 24);
        l(str);
    }

    public final void l(String str) {
        Context mo2getContext = this.a.mo2getContext();
        if (mo2getContext == null) {
            return;
        }
        maz.c(this.o, mo2getContext, str, LaunchContext.A, null, null, 24);
    }

    public final void m(View view, String str) {
        int l = krv0.l(R.attr.vk_ui_icon_accent);
        view.getContext();
        e.b bVar = new e.b(view, null, null, l, 6);
        bVar.w = R.layout.ds_internal_context_menu_item;
        int i = 6;
        VkContextMenu.c.c(bVar, R.string.group_event_join, null, false, null, new u14(i, this, str), 30);
        VkContextMenu.c.c(bVar, R.string.group_event_join_unsure, null, false, null, new com.vk.movika.sdk.base.logic.processor.actions.e(i, this, str), 30);
        int i2 = this.b.a1;
        if (i2 == 1 || i2 == 2) {
            VkContextMenu.c.c(bVar, R.string.group_event_leave, null, false, null, new j3(6, this, str), 30);
        }
        bVar.a().j(false);
    }

    public final void n(Rect rect, View view) {
        View view2;
        VkContextMenu.d dVar;
        if (this.b.Y != 1) {
            f(view, CommunityActionTags.JOIN);
            return;
        }
        if (rect != null) {
            int l = krv0.l(R.attr.vk_ui_icon_accent);
            view.getContext();
            view2 = view;
            dVar = new e.c(null, rect, view, l, 1);
        } else {
            view2 = view;
            int l2 = krv0.l(R.attr.vk_ui_icon_accent);
            view2.getContext();
            e.b bVar = new e.b(view2, null, null, l2, 6);
            bVar.w = R.layout.ds_internal_context_menu_item;
            dVar = bVar;
        }
        VkContextMenu.c.c(dVar, R.string.group_event_join, null, false, null, new oe5(3, this, view2), 30);
        sk skVar = new sk(11, this, view2);
        VkContextMenu.d dVar2 = dVar;
        VkContextMenu.c.c(dVar2, R.string.group_event_join_unsure, null, false, null, skVar, 30);
        dVar2.a().j(false);
    }
}
