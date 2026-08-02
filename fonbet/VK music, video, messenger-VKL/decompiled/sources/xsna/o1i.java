package xsna;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.bridges.di.BridgeComponent;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import com.vk.friends.groupinvite.api.domain.InviteFriendsAnalytics;
import com.vk.log.L;
import com.vk.profile.community.impl.ui.CommunityAction;
import com.vk.profile.community.impl.ui.profile.CommunityProfileFragment;
import com.vk.sharing.api.dto.AttachmentInfo;
import com.vk.stat.scheme.CommonCommunitiesStat$ClickEvent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.webapp.fragments.ReportFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vkontakte.android.attachments.LinkAttachment;
import com.vkontakte.android.data.groups.FullSourceJoinApi;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.sw50;

/* compiled from: CommunitySettingsActionsDelegate.kt */
/* loaded from: classes5.dex */
public final class o1i implements k1i {
    public final Object A;
    public final Object B;
    public final Object C;
    public final Object D;
    public final CommunityProfileFragment b;
    public final ExtendedCommunityProfile c;
    public final a d;
    public final zah e;
    public final b3i f;
    public final anm0 g;
    public final bbj0 h;
    public final d70 i;
    public final String j;
    public final ajg0 k;
    public final gyh l;
    public final o2i m;
    public final fsh n;
    public final com.vk.friends.groupinvite.api.domain.a o;
    public final maz p;
    public final Context q;
    public final Object r;
    public final Object s;
    public final Object t;
    public final Object u;
    public final Object v;
    public final Object w;
    public final Object x;
    public final Object y;
    public final Object z;

    /* compiled from: CommunitySettingsActionsDelegate.kt */
    public interface a extends x2i {

        /* compiled from: CommunitySettingsActionsDelegate.kt */
        /* renamed from: xsna.o1i$a$a, reason: collision with other inner class name */
        public interface InterfaceC3433a {

            /* compiled from: CommunitySettingsActionsDelegate.kt */
            /* renamed from: xsna.o1i$a$a$a, reason: collision with other inner class name */
            public static final class C3434a implements InterfaceC3433a {
                public final Rect a;
                public final View b;

                public C3434a(Rect rect, View view) {
                    this.a = rect;
                    this.b = view;
                }
            }

            /* compiled from: CommunitySettingsActionsDelegate.kt */
            /* renamed from: xsna.o1i$a$a$b */
            public static final class b implements InterfaceC3433a {
                public final View a;

                public b(View view) {
                    this.a = view;
                }
            }
        }

        void a(io.reactivex.rxjava3.disposables.c cVar);

        void dl(ExtendedCommunityProfile extendedCommunityProfile);

        void t8(ExtendedCommunityProfile extendedCommunityProfile, boolean z);
    }

    /* compiled from: CommunitySettingsActionsDelegate.kt */
    public static final class b extends beg0 {
        public b(Context context) {
            super(context);
        }

        @Override // xsna.beg0
        public final void r() {
            cvk.w(((Context) this.b).getString(R.string.community_news_shown), false);
            o1i o1iVar = o1i.this;
            ExtendedCommunityProfile extendedCommunityProfile = o1iVar.c;
            extendedCommunityProfile.m0 = false;
            o1iVar.d.t8(extendedCommunityProfile, false);
        }
    }

    /* compiled from: CommunitySettingsActionsDelegate.kt */
    public static final class c extends beg0 {
        public c(Context context) {
            super(context);
        }

        @Override // xsna.beg0
        public final void r() {
            cvk.w(((Context) this.b).getString(R.string.community_news_hidden), false);
            o1i o1iVar = o1i.this;
            ExtendedCommunityProfile extendedCommunityProfile = o1iVar.c;
            extendedCommunityProfile.m0 = true;
            o1iVar.d.t8(extendedCommunityProfile, false);
        }
    }

    /* compiled from: CommunitySettingsActionsDelegate.kt */
    public static final class d extends beg0 {
        public d(Context context) {
            super(context);
        }

        @Override // xsna.beg0
        public final void r() {
            o1i o1iVar = o1i.this;
            ExtendedCommunityProfile extendedCommunityProfile = o1iVar.c;
            boolean z = extendedCommunityProfile.i1;
            extendedCommunityProfile.i1 = !z;
            cvk.w(((Context) this.b).getString(!z ? R.string.video_live_subscribed : R.string.video_live_unsubscribed), false);
            o1iVar.d.dl(extendedCommunityProfile);
        }
    }

    /* compiled from: CommunitySettingsActionsDelegate.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    /* compiled from: CommunitySettingsActionsDelegate.kt */
    public static final class f extends beg0 {
        public f(Context context) {
            super(context);
        }

        @Override // xsna.beg0
        public final void r() {
            o1i o1iVar = o1i.this;
            ExtendedCommunityProfile extendedCommunityProfile = o1iVar.c;
            boolean z = extendedCommunityProfile.e1;
            extendedCommunityProfile.e1 = !z;
            cvk.w(((Context) this.b).getString(!z ? R.string.community_podcasts_subscribed : R.string.community_podcasts_unsubscribed), false);
            o1iVar.d.dl(extendedCommunityProfile);
        }
    }

    public o1i(CommunityProfileFragment communityProfileFragment, ExtendedCommunityProfile extendedCommunityProfile, a aVar, zah zahVar, b3i b3iVar, anm0 anm0Var, bbj0 bbj0Var, d70 d70Var, String str, ajg0 ajg0Var, gyh gyhVar, o2i o2iVar, fsh fshVar, com.vk.friends.groupinvite.api.domain.a aVar2, maz mazVar) {
        this.b = communityProfileFragment;
        this.c = extendedCommunityProfile;
        this.d = aVar;
        this.e = zahVar;
        this.f = b3iVar;
        this.g = anm0Var;
        this.h = bbj0Var;
        this.i = d70Var;
        this.j = str;
        this.k = ajg0Var;
        this.l = gyhVar;
        this.m = o2iVar;
        this.n = fshVar;
        this.o = aVar2;
        this.p = mazVar;
        this.q = communityProfileFragment.requireContext();
        m1i m1iVar = new m1i(this, 0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.r = msy.a(lazyThreadSafetyMode, m1iVar);
        this.s = msy.a(lazyThreadSafetyMode, new vf0(this, 29));
        this.t = msy.a(lazyThreadSafetyMode, new n1i(this, 0));
        int i = 9;
        this.u = msy.a(lazyThreadSafetyMode, new sbg(this, i));
        this.v = msy.a(lazyThreadSafetyMode, new tbg(this, i));
        this.w = msy.a(lazyThreadSafetyMode, new jpf(this, 7));
        this.x = msy.a(lazyThreadSafetyMode, new sfg(this, 4));
        this.y = msy.a(lazyThreadSafetyMode, new kd(this, 27));
        this.z = msy.a(lazyThreadSafetyMode, new qrh(this, 1));
        this.A = msy.a(lazyThreadSafetyMode, new h6(this, 26));
        this.B = msy.a(lazyThreadSafetyMode, new l9h(this, 3));
        this.C = msy.a(lazyThreadSafetyMode, new xm1(this, 27));
        this.D = msy.a(lazyThreadSafetyMode, new ka0(this, 29));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.k1i
    public final void a(boolean z) {
        CommunityAction communityAction = CommunityAction.DELETE;
        zah zahVar = this.e;
        ExtendedCommunityProfile extendedCommunityProfile = this.c;
        zahVar.c(extendedCommunityProfile, communityAction);
        ((b7h) this.t.getValue()).c(extendedCommunityProfile, "community_navbar", this.j, z);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.m6h
    public final void b(boolean z, boolean z2, FullSourceJoinApi fullSourceJoinApi) {
        ((n6h) this.u.getValue()).a(this.c, z, "community_navbar", this.j, z2, fullSourceJoinApi);
    }

    @Override // xsna.k1i
    public final void c() {
        new k2h(new wzh(this, 1), new l1i(this, 0), new com.vk.movika.sdk.base.logic.interactor.h(this, 27)).d(this.q);
    }

    @Override // xsna.k1i
    public final void d() {
        ExtendedCommunityProfile extendedCommunityProfile = this.c;
        boolean z = extendedCommunityProfile.m0;
        Context context = this.q;
        if (z) {
            jx2 jx2Var = new jx2(new fh60(extendedCommunityProfile.a.c), new b(context));
            jx2Var.g = context;
            jx2Var.a();
            return;
        }
        UserId userId = extendedCommunityProfile.a.c;
        StringBuilder sb = new StringBuilder();
        sb.append(fkq0.b(userId) ? "club" : CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE);
        sb.append(userId.b);
        jx2 jx2Var2 = new jx2(new lc60(userId, sb.toString()), new c(context));
        jx2Var2.g = context;
        jx2Var2.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
    
        r2 = "";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e() {
        this.e.c(this.c, CommunityAction.COPY_LINK);
        Object systemService = this.q.getSystemService("clipboard");
        String str = null;
        ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
        if (clipboardManager == null) {
            return;
        }
        try {
            try {
                if (gz80.a(28) && clipboardManager.hasPrimaryClip()) {
                    clipboardManager.clearPrimaryClip();
                }
            } catch (NullPointerException e2) {
                L.i(e2);
            }
            ExtendedCommunityProfile extendedCommunityProfile = this.c;
            if (extendedCommunityProfile == null || !drm0.D(extendedCommunityProfile.T2, "https://", false)) {
                String str2 = extendedCommunityProfile != null ? extendedCommunityProfile.A0 : null;
                String str3 = "https://" + a0a.d + '/' + str2;
                if (str2 != null && !drm0.N(str2)) {
                    str = str3;
                }
            } else {
                str = extendedCommunityProfile.T2;
            }
            clipboardManager.setPrimaryClip(ClipData.newPlainText("VK link", str));
            cvk.u(R.string.link_copied, false);
        } catch (Throwable th) {
            com.vk.metrics.eventtracking.b.a.a(th);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    public final void f() {
        CommunityAction communityAction = CommunityAction.EDIT_COMMUNITY_AVATAR;
        zah zahVar = this.e;
        ExtendedCommunityProfile extendedCommunityProfile = this.c;
        zahVar.c(extendedCommunityProfile, communityAction);
        if (this.m.b(this.q, bwd0.i(extendedCommunityProfile), ExtendedCommunityProfile.StrikesRestriction.StrikeRestrictionType.AVATAR)) {
            sw50.f g = ((sw50) this.A.getValue()).g();
            jbs jbsVar = new jbs(this.b);
            UserProfile userProfile = extendedCommunityProfile.a;
            g.c(jbsVar, userProfile.c, userProfile.e, 3901);
        }
    }

    public final void g() {
        ExtendedCommunityProfile extendedCommunityProfile = this.c;
        this.e.c(extendedCommunityProfile, extendedCommunityProfile.l ? CommunityAction.FAVORITES_REMOVE : CommunityAction.FAVORITES_ADD);
        ((BridgeComponent) m7m.d(this.b).a(fpf0.a(BridgeComponent.class))).cb().g(this.q, extendedCommunityProfile, new w1(this, 2), this.j);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void h() {
        ExtendedCommunityProfile extendedCommunityProfile = this.c;
        zah.b(this.e, bwd0.i(extendedCommunityProfile), CommonCommunitiesStat$ClickEvent.ClickEventType.OPEN_SIMILAR_GROUPS, CommonCommunitiesStat$ClickEvent.Source.COMMUNITY_NAVBAR, this.j, 16);
        l3i l3iVar = (l3i) this.C.getValue();
        Context context = this.q;
        l3iVar.a(context, fkq0.e(extendedCommunityProfile.a.c), context.getString(R.string.groups_suggestions_title), "group_menu_item");
    }

    public final void i() {
        ExtendedCommunityProfile extendedCommunityProfile = this.c;
        if (extendedCommunityProfile.Z == 0 || !w2h.a(extendedCommunityProfile)) {
            t();
        } else {
            wx20.c(new v5h(new kbe(this, 9), new akh(this, 2)), this.q, "community_invite_menu", 0, 0, 28);
        }
    }

    public final void j() {
        CommunityAction communityAction = CommunityAction.SUBSCRIBE_LIVE;
        zah zahVar = this.e;
        ExtendedCommunityProfile extendedCommunityProfile = this.c;
        zahVar.c(extendedCommunityProfile, communityAction);
        r6z r6zVar = new r6z(extendedCommunityProfile.a.c, !extendedCommunityProfile.i1);
        Context context = this.q;
        jx2 jx2Var = new jx2(r6zVar, new d(context));
        jx2Var.g = context;
        jx2Var.h = 400L;
        jx2Var.a();
    }

    public final void k() {
        CommunityAction communityAction = CommunityAction.MESSAGES;
        zah zahVar = this.e;
        ExtendedCommunityProfile extendedCommunityProfile = this.c;
        zahVar.c(extendedCommunityProfile, communityAction);
        hg1.n(i2w.a().E("CommunityChangeAllowMessages", new fpu(com.vk.dto.common.a.a(extendedCommunityProfile.a.c), !extendedCommunityProfile.c2)), this.q, false, null, 62).subscribe(new i22(new ozh(this, 1), 13), new j22(new e(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 21));
    }

    public final void l() {
        new kbh(this.c, this, new a2i()).d(this.q);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void m() {
        krl0 krl0Var = (krl0) this.x.getValue();
        UserProfile userProfile = this.c.a;
        krl0Var.b(this.q, userProfile.c, userProfile.h, userProfile.e);
    }

    public final void n(CommonCommunitiesStat$ClickEvent.Source source) {
        zs zsVar = new zs(this.c.a.c, cqm0.m(source.name()), !r1.j1);
        Context context = this.q;
        jx2 jx2Var = new jx2(zsVar, new p1i(this, context));
        jx2Var.g = context;
        jx2Var.h = 400L;
        jx2Var.a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void o() {
        ((cpu) this.B.getValue()).k(this.q, this.c);
    }

    public final void p() {
        ExtendedCommunityProfile extendedCommunityProfile = this.c;
        zah.b(this.e, bwd0.i(extendedCommunityProfile), CommonCommunitiesStat$ClickEvent.ClickEventType.COMPLAIN_ABOUT_COMMUNITY, CommonCommunitiesStat$ClickEvent.Source.COMMUNITY_NAVBAR, this.j, 16);
        g2v.c().getClass();
        UserId userId = extendedCommunityProfile.a.c;
        int i = ReportFragment.a0;
        ReportFragment.a a2 = ReportFragment.b.a();
        a2.K("community");
        a2.C(userId);
        a2.k(this.q);
    }

    public final void q() {
        String str;
        zah.b(this.e, bwd0.i(this.c), CommonCommunitiesStat$ClickEvent.ClickEventType.MODAL_SHARING_OPEN, CommonCommunitiesStat$ClickEvent.Source.COMMUNITY_NAVBAR, this.j, 16);
        ExtendedCommunityProfile extendedCommunityProfile = this.c;
        if (extendedCommunityProfile == null || !drm0.D(extendedCommunityProfile.T2, "https://", false)) {
            String str2 = extendedCommunityProfile != null ? extendedCommunityProfile.A0 : null;
            str = (str2 == null || drm0.N(str2)) ? null : "https://" + a0a.d + '/' + str2;
            if (str == null) {
                str = "";
            }
        } else {
            str = extendedCommunityProfile.T2;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("attachments", new LinkAttachment(str));
        bundle.putString("link", str);
        AttachmentInfo attachmentInfo = new AttachmentInfo(11, 0L, 0L, null, bundle);
        tbj0 a2 = this.h.a(this.q);
        a2.c = attachmentInfo;
        a2.d = this.i.d(str);
        CommunityProfileFragment communityProfileFragment = this.b;
        a2.e();
        communityProfileFragment.startActivityForResult(a2.b(a2.a), 1004);
    }

    public final void r() {
        ExtendedCommunityProfile extendedCommunityProfile = this.c;
        boolean z = !extendedCommunityProfile.I1;
        this.g.A(z, false, MobileOfficialAppsCoreNavStat$EventScreen.PROFILE, null);
        this.d.a(hg1.n(qxi.a().h(extendedCommunityProfile.a.c, null, z).q(asu0.a.c()).m(io.reactivex.rxjava3.android.schedulers.a.b()), this.q, false, null, 62).subscribe(new da(new zg2(this, z, 1), 19), new ea(new y40(20), 22)));
    }

    public final void s() {
        CommunityAction communityAction = CommunityAction.SUBSCRIBE_PODCASTS;
        zah zahVar = this.e;
        ExtendedCommunityProfile extendedCommunityProfile = this.c;
        zahVar.c(extendedCommunityProfile, communityAction);
        ak70 ak70Var = new ak70(extendedCommunityProfile.a.c, !extendedCommunityProfile.e1);
        Context context = this.q;
        jx2 jx2Var = new jx2(ak70Var, new f(context));
        jx2Var.g = context;
        jx2Var.h = 400L;
        jx2Var.a();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    public final void t() {
        CommunityAction communityAction = CommunityAction.INVITE;
        zah zahVar = this.e;
        ExtendedCommunityProfile extendedCommunityProfile = this.c;
        zahVar.c(extendedCommunityProfile, communityAction);
        if (!bwd0.a(extendedCommunityProfile)) {
            ((cpu) this.B.getValue()).p(this.b, bwd0.i(extendedCommunityProfile));
            return;
        }
        this.o.a(this.q, ((b25) this.w.getValue()).c(), fkq0.e(bwd0.i(extendedCommunityProfile)), InviteFriendsAnalytics.InviteFriendsSource.MAIN, true);
    }
}
