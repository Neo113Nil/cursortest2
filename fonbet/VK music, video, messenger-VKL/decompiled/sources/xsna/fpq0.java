package xsna;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.ironsource.Z3;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.photo.Photo;
import com.vk.dto.stories.model.SimpleStoriesContainer;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.dto.user.ImageStatus;
import com.vk.dto.user.UserProfile;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.log.L;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlaySource;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.onboarding.api.dto.VkOnboardingType;
import com.vk.profile.core.cover.ProfileCover;
import com.vk.profile.user.api.domain.actions.ProfileAction;
import com.vk.profile.user.impl.UserProfileDialogs;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.profile.user.impl.ui.b;
import com.vk.profile.user.impl.ui.f;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsProfileStat$AnotherUserProfileEvent;
import com.vk.stat.scheme.MobileOfficialAppsProfileStat$AnotherUserProfileMenuEvent;
import com.vk.stat.scheme.MobileOfficialAppsProfileStat$AvatarEvent;
import com.vk.stat.scheme.MobileOfficialAppsProfileStat$ServiceItem;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryViewItem;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import ru.ok.android.utils.Logger;
import xsna.a7f0;
import xsna.c5e0;
import xsna.e8v0;
import xsna.gs90;
import xsna.hfr;
import xsna.ios;
import xsna.moq0;
import xsna.nyd0;
import xsna.vlq0;
import xsna.zp0;

/* compiled from: UserProfileFeature.kt */
/* loaded from: classes5.dex */
public final class fpq0 extends wk50<com.vk.profile.user.impl.ui.h, com.vk.profile.user.impl.ui.g, UserProfileAction, com.vk.profile.user.impl.ui.b> implements ruu, zuq0 {
    public final vlq0 A;
    public final vpq0 B;
    public final gpq0 C;
    public final buq0 D;
    public final ynq0 E;
    public final fqq0 F;
    public final gxq0 G;
    public final gvq0 H;
    public final omq0 I;
    public final c5e0 J;
    public final b960 K;
    public final dsi0 L;
    public final ctn0 M;
    public final dxn N;
    public final f31 O;
    public final pnq0 P;
    public final r9c0 Q;
    public final f4z R;
    public VkOnboardingCampaign S;
    public final Object T;
    public final htq0 f;
    public final dvq0 g;
    public final xsq0 h;
    public final btq0 i;
    public final UserProfileDialogs j;
    public final yqq0 k;
    public final ouq0 l;
    public final iuq m;
    public final lyd0 n;
    public final r0e0 o;
    public final mzp0 p;
    public final wrq0 q;
    public final q7v0 r;
    public final jmq0 s;
    public final qvl0 t;
    public final rlq0 u;
    public final jtq0 v;
    public final cvq0 w;
    public final bvq0 x;
    public final stq0 y;
    public final koq0 z;

    public fpq0(htq0 htq0Var, dvq0 dvq0Var, xsq0 xsq0Var, btq0 btq0Var, UserProfileDialogs userProfileDialogs, yqq0 yqq0Var, ouq0 ouq0Var, iuq iuqVar, com.vk.profile.user.impl.ui.e eVar, lyd0 lyd0Var, r0e0 r0e0Var, mzp0 mzp0Var, wrq0 wrq0Var, q7v0 q7v0Var) {
        super(UserProfileAction.q.b, eVar);
        this.f = htq0Var;
        this.g = dvq0Var;
        this.h = xsq0Var;
        this.i = btq0Var;
        this.j = userProfileDialogs;
        this.k = yqq0Var;
        this.l = ouq0Var;
        this.m = iuqVar;
        this.n = lyd0Var;
        this.o = r0e0Var;
        this.p = mzp0Var;
        this.q = wrq0Var;
        this.r = q7v0Var;
        this.s = iuqVar.b;
        this.t = iuqVar.c;
        this.u = iuqVar.d;
        this.v = iuqVar.e;
        this.w = iuqVar.f;
        this.x = iuqVar.g;
        this.y = iuqVar.h;
        this.z = iuqVar.i;
        this.A = iuqVar.j;
        this.B = iuqVar.k;
        this.C = iuqVar.l;
        this.D = iuqVar.m;
        this.E = iuqVar.n;
        this.F = iuqVar.o;
        this.G = iuqVar.q;
        this.H = iuqVar.p;
        this.I = iuqVar.r;
        this.J = iuqVar.s;
        this.K = iuqVar.t;
        this.L = iuqVar.u;
        this.M = iuqVar.v;
        this.N = iuqVar.w;
        this.O = iuqVar.y;
        this.P = iuqVar.x;
        r9c0 r9c0Var = new r9c0(this, 17);
        this.Q = r9c0Var;
        this.R = new f4z();
        this.T = msy.a(LazyThreadSafetyMode.NONE, new w0o0(3));
        W(iuqVar);
        r9c0Var.invoke(new b.j((htq0Var.h.invoke().booleanValue() || htq0Var.e) ? false : true));
    }

    @Override // xsna.zuq0
    public final void B(com.vk.profile.user.impl.ui.f fVar) {
        this.R.b(fVar);
    }

    @Override // xsna.ruu
    public final izs<com.vk.profile.user.impl.ui.b, s3q0> L() {
        return this.Q;
    }

    @Override // xsna.wk50
    public final void N(com.vk.profile.user.impl.ui.g gVar, UserProfileAction userProfileAction) {
        UserProfile userProfile;
        UserId userId;
        UserProfile userProfile2;
        UserId userId2;
        UserProfile userProfile3;
        UserProfile userProfile4;
        UserId userId3;
        String stringExtra;
        UserProfile userProfile5;
        UserId userId4;
        WebApiApplication webApiApplication;
        CopyOnWriteArrayList<StoryEntry> copyOnWriteArrayList;
        StoryEntry storyEntry;
        kkq0 kkq0Var;
        kkq0 kkq0Var2;
        UserId Fb;
        StoryEntry storyEntry2;
        StoryEntry storyEntry3;
        StoryEntry storyEntry4;
        UserId Fb2;
        moq0.a.b bVar = moq0.a.b.f;
        moq0.a.e eVar = moq0.a.e.f;
        com.vk.profile.user.impl.ui.g gVar2 = gVar;
        UserProfileAction userProfileAction2 = userProfileAction;
        dsi0 dsi0Var = this.L;
        b960 b960Var = this.K;
        c5e0 c5e0Var = this.J;
        vpq0 vpq0Var = this.B;
        ynq0 ynq0Var = this.E;
        jtq0 jtq0Var = this.v;
        ExtendedUserProfile extendedUserProfile = gVar2.j;
        r14 = null;
        List list = null;
        Object obj = null;
        if (userProfileAction2.equals(UserProfileAction.q.b)) {
            X(b.r.c.b, gVar2, new UserProfileAction.x(null, 14));
            return;
        }
        if (userProfileAction2 instanceof UserProfileAction.x) {
            UserProfileAction.x xVar = (UserProfileAction.x) userProfileAction2;
            X(xVar.d ? b.r.d.b : b.r.a.b, gVar2, xVar);
            return;
        }
        if (userProfileAction2 instanceof UserProfileAction.y) {
            if (extendedUserProfile != null) {
                ynq0.c(this.E, extendedUserProfile, gVar2.i, null, 12);
                return;
            }
            return;
        }
        int i = 5;
        char c = 0;
        if (!(userProfileAction2 instanceof UserProfileAction.s)) {
            if (userProfileAction2 instanceof UserProfileAction.a) {
                UserProfileAction.a aVar = (UserProfileAction.a) userProfileAction2;
                Iterator it = ((ArrayList) this.m.w2()).iterator();
                while (it.hasNext()) {
                    ((huq) it.next()).J(gVar2, aVar);
                }
                return;
            }
            if (userProfileAction2 instanceof UserProfileAction.e) {
                omq0 omq0Var = this.I;
                lyd0 lyd0Var = omq0Var.d;
                dvq0 dvq0Var = omq0Var.b;
                Intent intent = ((UserProfileAction.e) userProfileAction2).b;
                String action = intent != null ? intent.getAction() : null;
                if (action != null) {
                    switch (action.hashCode()) {
                        case -1725246571:
                            if (action.equals("com.vkontakte.android.FRIEND_LIST_CHANGED")) {
                                u5p0 u5p0Var = omq0Var.e;
                                if (u5p0Var == null) {
                                    u5p0Var = null;
                                }
                                u5p0Var.invoke(new UserProfileAction.x(null, 15));
                                return;
                            }
                            return;
                        case -1414915502:
                            if (!action.equals("com.vkontakte.android.COUNTERS_UPDATED") || extendedUserProfile == null || (userProfile = extendedUserProfile.a) == null || (userId = userProfile.c) == null || !dvq0Var.a(userId)) {
                                return;
                            }
                            izs<? super com.vk.profile.user.impl.ui.b, s3q0> izsVar = omq0Var.f;
                            (izsVar != null ? izsVar : null).invoke(new b.c0(extendedUserProfile));
                            return;
                        case -1412190025:
                            if (!action.equals("com.vkontakte.android.USER_COVER_CHANGED") || extendedUserProfile == null || (userProfile2 = extendedUserProfile.a) == null || (userId2 = userProfile2.c) == null || !dvq0Var.a(userId2)) {
                                return;
                            }
                            lyd0Var.f().e();
                            Image image = (Image) intent.getParcelableExtra("image");
                            izs<? super com.vk.profile.user.impl.ui.b, s3q0> izsVar2 = omq0Var.f;
                            if (izsVar2 == null) {
                                izsVar2 = null;
                            }
                            extendedUserProfile.A = image != null ? new Photo(image) : null;
                            extendedUserProfile.z = image != null;
                            izsVar2.invoke(new b.y(extendedUserProfile));
                            return;
                        case -1289280523:
                            if (action.equals("com.vkontakte.android.ACTION_USER_IMAGE_STATUS_CHANGED")) {
                                bvq0 bvq0Var = omq0Var.c;
                                dvq0 dvq0Var2 = bvq0Var.b;
                                if (extendedUserProfile != null && dvq0Var2.a(extendedUserProfile.a.c)) {
                                    ImageStatus e = dvq0Var2.e();
                                    UserProfile userProfile6 = extendedUserProfile.a;
                                    userProfile6.R = e;
                                    extendedUserProfile.a = userProfile6;
                                    nyd0.a m = bvq0Var.d.m();
                                    m.getClass();
                                    m.a(MobileOfficialAppsProfileStat$AnotherUserProfileEvent.AnotherUserProfileEventType.CLICK_TO_EMOJI_STATUS, null);
                                    izs<? super com.vk.profile.user.impl.ui.b, s3q0> izsVar3 = bvq0Var.e;
                                    (izsVar3 != null ? izsVar3 : null).invoke(new b.y(extendedUserProfile));
                                    return;
                                }
                                return;
                            }
                            return;
                        case -443120485:
                            if (action.equals("com.vkontakte.android.ACTION_PROFILE_UPDATED")) {
                                if (epx.f(intent.getParcelableExtra("uid"), (extendedUserProfile == null || (userProfile3 = extendedUserProfile.a) == null) ? null : userProfile3.c)) {
                                    u5p0 u5p0Var2 = omq0Var.e;
                                    if (u5p0Var2 == null) {
                                        u5p0Var2 = null;
                                    }
                                    u5p0Var2.invoke(new UserProfileAction.x(null, 13));
                                    return;
                                }
                                return;
                            }
                            return;
                        case -169289252:
                            if (!action.equals("com.vkontakte.android.USER_STATUS_CHANGED") || extendedUserProfile == null || (userProfile4 = extendedUserProfile.a) == null || (userId3 = userProfile4.c) == null || !dvq0Var.a(userId3) || (stringExtra = intent.getStringExtra("status")) == null) {
                                return;
                            }
                            izs<? super com.vk.profile.user.impl.ui.b, s3q0> izsVar4 = omq0Var.f;
                            izs<? super com.vk.profile.user.impl.ui.b, s3q0> izsVar5 = izsVar4 != null ? izsVar4 : null;
                            extendedUserProfile.g1 = stringExtra;
                            izsVar5.invoke(new b.y(extendedUserProfile));
                            return;
                        case 333377586:
                            if (!action.equals("com.vkontakte.android.USER_PHOTO_CHANGED") || extendedUserProfile == null || (userProfile5 = extendedUserProfile.a) == null || (userId4 = userProfile5.c) == null || !dvq0Var.a(userId4)) {
                                return;
                            }
                            Bundle extras = intent.getExtras();
                            String string = extras != null ? extras.getString("ava_photo_id") : null;
                            if (string == null) {
                                string = "";
                            }
                            if (string.length() > 0) {
                                lyd0Var.k().e(string);
                            }
                            if (intent.getBooleanExtra("reload_wall", false)) {
                                fpq0 fpq0Var = omq0Var.g;
                                if (fpq0Var == null) {
                                    fpq0Var = null;
                                }
                                fpq0Var.B(f.l.b.a);
                            }
                            u5p0 u5p0Var3 = omq0Var.e;
                            (u5p0Var3 != null ? u5p0Var3 : null).invoke(new UserProfileAction.x(new UserProfileAction.x.a(true, true), 5));
                            return;
                        default:
                            return;
                    }
                }
                return;
            }
            if (userProfileAction2 instanceof UserProfileAction.r) {
                V(gVar2, (UserProfileAction.r) userProfileAction2);
                return;
            }
            if (userProfileAction2.equals(UserProfileAction.c.b)) {
                vpq0Var.a(gVar2);
                return;
            }
            if (userProfileAction2.equals(UserProfileAction.t.b)) {
                vpq0Var.getClass();
                if (extendedUserProfile == null) {
                    return;
                }
                fpq0 fpq0Var2 = vpq0Var.e;
                (fpq0Var2 != null ? fpq0Var2 : null).B(new f.e.v1(extendedUserProfile));
                return;
            }
            if (userProfileAction2.equals(UserProfileAction.j.b)) {
                gpq0 gpq0Var = this.C;
                gpq0Var.getClass();
                if (extendedUserProfile == null) {
                    return;
                }
                fpq0 fpq0Var3 = gpq0Var.f;
                (fpq0Var3 != null ? fpq0Var3 : null).B(new f.e.t1(extendedUserProfile));
                return;
            }
            if (userProfileAction2 instanceof UserProfileAction.l) {
                UserProfileAction.l lVar = (UserProfileAction.l) userProfileAction2;
                T(new b.w(false));
                VkOnboardingCampaign vkOnboardingCampaign = this.S;
                if (vkOnboardingCampaign == null) {
                    return;
                }
                this.r.a(vkOnboardingCampaign, VkOnboardingType.Tooltip, lVar.b ? e8v0.i.b : e8v0.g.b);
                this.S = null;
                return;
            }
            if (userProfileAction2 instanceof UserProfileAction.o) {
                izs<? super com.vk.profile.user.impl.ui.b, s3q0> izsVar6 = this.D.b;
                (izsVar6 != null ? izsVar6 : null).invoke(b.h.b);
                return;
            }
            if (userProfileAction2 instanceof UserProfileAction.m) {
                this.F.c(gVar2, (UserProfileAction.m) userProfileAction2);
                return;
            }
            if (userProfileAction2 instanceof UserProfileAction.d0) {
                this.H.a((UserProfileAction.d0) userProfileAction2, gVar2);
                return;
            }
            if (userProfileAction2 instanceof UserProfileAction.e0) {
                this.G.a((UserProfileAction.e0) userProfileAction2, gVar2);
                return;
            }
            if (userProfileAction2 instanceof UserProfileAction.w.b) {
                ExtendedUserProfile extendedUserProfile2 = ((UserProfileAction.w.b) userProfileAction2).b;
                c5e0Var.getClass();
                ExtendedUserProfile.h hVar = extendedUserProfile2.c1;
                if (hVar == null) {
                    return;
                }
                ouq0 ouq0Var = c5e0Var.b;
                UserProfile userProfile7 = extendedUserProfile2.a;
                io.reactivex.rxjava3.disposables.c subscribe = ouq0Var.y(userProfile7 != null ? userProfile7.c : null, hVar.d, hVar.a).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new cx00(new o440(c5e0Var, 21), 17), new c2y(new c5e0.b(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 22));
                io.reactivex.rxjava3.disposables.b bVar2 = c5e0Var.d;
                (bVar2 != null ? bVar2 : null).b(subscribe);
                return;
            }
            if (userProfileAction2 instanceof UserProfileAction.w.a) {
                c5e0Var.a(((UserProfileAction.w.a) userProfileAction2).b);
                return;
            }
            if (userProfileAction2 instanceof UserProfileAction.u.a) {
                jtq0Var.b((UserProfileAction.u.a) userProfileAction2, extendedUserProfile);
                return;
            }
            if (userProfileAction2 instanceof UserProfileAction.h.a) {
                jtq0Var.a((UserProfileAction.h.a) userProfileAction2);
                return;
            }
            if (userProfileAction2 instanceof UserProfileAction.v.a) {
                jtq0Var.c((UserProfileAction.v) userProfileAction2);
                return;
            }
            if (userProfileAction2 instanceof UserProfileAction.z.a) {
                jtq0Var.d((UserProfileAction.z) userProfileAction2);
                return;
            }
            if (userProfileAction2 instanceof UserProfileAction.n) {
                b960Var.b();
                return;
            }
            if (userProfileAction2 instanceof UserProfileAction.i) {
                b960Var.a(((UserProfileAction.i) userProfileAction2).b);
                return;
            }
            if (userProfileAction2 instanceof UserProfileAction.p.a.C1689a) {
                dsi0Var.a((UserProfileAction.p.a) userProfileAction2);
                return;
            }
            if (userProfileAction2 instanceof UserProfileAction.p.a.b) {
                dsi0Var.a((UserProfileAction.p.a) userProfileAction2);
                return;
            }
            if (userProfileAction2 instanceof UserProfileAction.c0) {
                this.M.a((UserProfileAction.c0) userProfileAction2, gVar2);
                return;
            }
            if (userProfileAction2 instanceof UserProfileAction.g) {
                ynq0Var.a((UserProfileAction.g) userProfileAction2, gVar2);
                return;
            }
            if (userProfileAction2 instanceof UserProfileAction.k) {
                ynq0Var.d(gVar2);
                return;
            }
            if (userProfileAction2 instanceof UserProfileAction.b0) {
                B(f.c.g.a);
                return;
            }
            if (userProfileAction2 instanceof UserProfileAction.DonutBanner) {
                this.N.a(gVar2, (UserProfileAction.DonutBanner) userProfileAction2);
                return;
            }
            if (userProfileAction2 instanceof UserProfileAction.f) {
                ynq0Var.b((UserProfileAction.f) userProfileAction2, gVar2);
                return;
            }
            if (userProfileAction2 instanceof UserProfileAction.a0) {
                T(new b.v(((UserProfileAction.a0) userProfileAction2).b));
                return;
            } else if (userProfileAction2 instanceof UserProfileAction.b) {
                this.O.a(gVar2, (UserProfileAction.b) userProfileAction2);
                return;
            } else {
                if (!(userProfileAction2 instanceof UserProfileAction.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
        UserProfileAction.s sVar = (UserProfileAction.s) userProfileAction2;
        vlq0 vlq0Var = this.A;
        qvl0 qvl0Var = this.t;
        int i2 = 2;
        if (sVar instanceof UserProfileAction.s.b) {
            jmq0 jmq0Var = this.s;
            UserProfileAction.s.b bVar3 = (UserProfileAction.s.b) sVar;
            lyd0 lyd0Var2 = jmq0Var.f;
            if (extendedUserProfile == null) {
                return;
            }
            if (!(bVar3 instanceof UserProfileAction.s.b.a)) {
                if (!(bVar3 instanceof UserProfileAction.s.b.c)) {
                    if (!bVar3.equals(UserProfileAction.s.b.C1693b.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    lyd0Var2.k().d();
                    io.reactivex.rxjava3.disposables.c subscribe2 = jmq0Var.e.v().subscribe(new ow40(new defpackage.y(29, jmq0Var, extendedUserProfile), 24), new pw40(new e750(25), 14));
                    io.reactivex.rxjava3.disposables.b bVar4 = jmq0Var.h;
                    (bVar4 != null ? bVar4 : null).b(subscribe2);
                    return;
                }
                moq0.a aVar2 = ((UserProfileAction.s.b.c) bVar3).b;
                if (epx.f(aVar2, bVar)) {
                    fpq0 fpq0Var4 = jmq0Var.k;
                    (fpq0Var4 != null ? fpq0Var4 : null).B(f.c.d.a);
                    return;
                }
                if (aVar2 instanceof moq0.a.c) {
                    jmq0Var.a(extendedUserProfile, (moq0.a.c) aVar2);
                    return;
                }
                if (epx.f(aVar2, eVar)) {
                    jmq0Var.d();
                    return;
                }
                if (epx.f(aVar2, moq0.a.C3354a.f)) {
                    nyd0.c k = jmq0Var.f.k();
                    k.getClass();
                    k.a(MobileOfficialAppsProfileStat$AvatarEvent.AvatarEventType.CLICK_TO_CREATE_STORY, null);
                    fpq0 fpq0Var5 = jmq0Var.k;
                    (fpq0Var5 != null ? fpq0Var5 : null).B(new f.e.j(extendedUserProfile));
                    return;
                }
                if (aVar2 instanceof moq0.a.d) {
                    jmq0Var.e(extendedUserProfile, ((moq0.a.d) aVar2).f, qvl0Var);
                    return;
                } else if (aVar2 instanceof moq0.a.g) {
                    jmq0Var.e(extendedUserProfile, ((moq0.a.g) aVar2).f, qvl0Var);
                    return;
                } else {
                    if (!(aVar2 instanceof moq0.a.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jmq0Var.e(extendedUserProfile, ((moq0.a.f) aVar2).f, qvl0Var);
                    return;
                }
            }
            e4t e4tVar = ((UserProfileAction.s.b.a) bVar3).b;
            u5p0 u5p0Var4 = jmq0Var.i;
            if (u5p0Var4 == null) {
                u5p0Var4 = null;
            }
            u5p0Var4.invoke(new UserProfileAction.a0("profile_photo"));
            lyd0Var2.k().c();
            if (extendedUserProfile.g()) {
                return;
            }
            if (!extendedUserProfile.A1 || extendedUserProfile.D1) {
                boolean a = jmq0Var.c.a(extendedUserProfile.a.c);
                boolean f = extendedUserProfile.f();
                boolean z = extendedUserProfile.n0;
                List l = a ? (f && z) ? e43.l(moq0.a.C3354a.f, jmq0.b(extendedUserProfile, e4tVar), eVar, new moq0.a.c(null), bVar) : (!f || z) ? (f || !z) ? (f || z) ? EmptyList.b : e43.l(moq0.a.C3354a.f, new moq0.a.c(null)) : e43.l(moq0.a.C3354a.f, eVar, new moq0.a.c(null), bVar) : e43.l(moq0.a.C3354a.f, jmq0.b(extendedUserProfile, e4tVar), new moq0.a.c(null)) : (f || z) ? (f || !z) ? (!f || z) ? (f && z) ? e43.l(jmq0.b(extendedUserProfile, e4tVar), eVar) : EmptyList.b : Collections.singletonList(jmq0.b(extendedUserProfile, e4tVar)) : Collections.singletonList(eVar) : EmptyList.b;
                int size = l.size();
                if (size == 0) {
                    jmq0Var.c();
                    return;
                }
                if (size != 1) {
                    fpq0 fpq0Var6 = jmq0Var.k;
                    (fpq0Var6 != null ? fpq0Var6 : null).B(new f.c.s(l, e4tVar));
                    return;
                }
                moq0.a aVar3 = (moq0.a) j5g.Y(l);
                if (aVar3 instanceof moq0.a.c) {
                    jmq0Var.a(extendedUserProfile, (moq0.a.c) aVar3);
                    return;
                }
                if (epx.f(aVar3, eVar)) {
                    jmq0Var.d();
                    return;
                }
                if (epx.f(aVar3, moq0.a.C3354a.f)) {
                    nyd0.c k2 = jmq0Var.f.k();
                    k2.getClass();
                    k2.a(MobileOfficialAppsProfileStat$AvatarEvent.AvatarEventType.CLICK_TO_CREATE_STORY, null);
                    fpq0 fpq0Var7 = jmq0Var.k;
                    (fpq0Var7 != null ? fpq0Var7 : null).B(new f.e.j(extendedUserProfile));
                    return;
                }
                if (aVar3 instanceof moq0.a.g) {
                    jmq0Var.e(extendedUserProfile, ((moq0.a.g) aVar3).f, qvl0Var);
                    return;
                }
                if (aVar3 instanceof moq0.a.f) {
                    jmq0Var.e(extendedUserProfile, ((moq0.a.f) aVar3).f, qvl0Var);
                    return;
                } else if (aVar3 instanceof moq0.a.d) {
                    jmq0Var.e(extendedUserProfile, ((moq0.a.d) aVar3).f, qvl0Var);
                    return;
                } else {
                    if (!epx.f(aVar3, bVar)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
            }
            return;
        }
        if (sVar instanceof UserProfileAction.s.c) {
            this.u.b(gVar2, (UserProfileAction.s.c) sVar, jtq0Var, vlq0Var);
            return;
        }
        if (sVar instanceof UserProfileAction.s.d) {
            koq0 koq0Var = this.z;
            UserProfileAction.s.d dVar = (UserProfileAction.s.d) sVar;
            koq0Var.getClass();
            if (extendedUserProfile == null) {
                return;
            }
            if (dVar.equals(UserProfileAction.s.d.a.b)) {
                fpq0 fpq0Var8 = koq0Var.e;
                (fpq0Var8 != null ? fpq0Var8 : null).B(new f.c.e(extendedUserProfile, new khq0(extendedUserProfile, koq0Var.b, koq0Var.c)));
                return;
            }
            if (dVar.equals(UserProfileAction.s.d.c.b)) {
                fpq0 fpq0Var9 = koq0Var.e;
                (fpq0Var9 != null ? fpq0Var9 : null).B(f.c.g.a);
                return;
            } else if (dVar.equals(UserProfileAction.s.d.b.b)) {
                fpq0 fpq0Var10 = koq0Var.e;
                (fpq0Var10 != null ? fpq0Var10 : null).B(new f.c.o(extendedUserProfile));
                return;
            } else {
                if (!dVar.equals(UserProfileAction.s.d.C1697d.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                fpq0 fpq0Var11 = koq0Var.e;
                (fpq0Var11 != null ? fpq0Var11 : null).B(new f.c.u(extendedUserProfile));
                return;
            }
        }
        if (sVar instanceof UserProfileAction.s.e) {
            this.y.a(gVar2, (UserProfileAction.s.e) sVar);
            return;
        }
        if (sVar instanceof UserProfileAction.s.f) {
            bvq0 bvq0Var2 = this.x;
            UserProfileAction.s.f fVar = (UserProfileAction.s.f) sVar;
            bvq0Var2.getClass();
            if (extendedUserProfile == null) {
                return;
            }
            if (fVar instanceof UserProfileAction.s.f.a) {
                UserProfileAction.s.f.a aVar4 = (UserProfileAction.s.f.a) fVar;
                nyd0.a m2 = bvq0Var2.d.m();
                m2.getClass();
                m2.a(MobileOfficialAppsProfileStat$AnotherUserProfileEvent.AnotherUserProfileEventType.CLICK_TO_EMOJI_STATUS, null);
                fpq0 fpq0Var12 = bvq0Var2.f;
                (fpq0Var12 != null ? fpq0Var12 : null).B(new f.c.j(extendedUserProfile.a.c, aVar4.b));
                return;
            }
            if (!(fVar instanceof UserProfileAction.s.f.b)) {
                throw new NoWhenBranchMatchedException();
            }
            MusicTrack musicTrack = ((UserProfileAction.s.f.b) fVar).b;
            u2b0 u2b0Var = bvq0Var2.c;
            if (bvq0Var2.b.n()) {
                if (!u2b0Var.y0(musicTrack)) {
                    u2b0Var.N0(new lqk0((StartPlaySource) null, musicTrack, (List) null, MusicPlaybackLaunchContext.h, 0, (ShuffleMode) null, (PlayRequestTrigger) null, (AdsAudioPixelsContainer) null, 0L, Z3.i));
                }
                fpq0 fpq0Var13 = bvq0Var2.f;
                (fpq0Var13 != null ? fpq0Var13 : null).B(f.e.o.a);
                return;
            }
            return;
        }
        if (!(sVar instanceof UserProfileAction.s.g)) {
            if (!(sVar instanceof UserProfileAction.s.a)) {
                throw new NoWhenBranchMatchedException();
            }
            UserProfileAction.s.a aVar5 = (UserProfileAction.s.a) sVar;
            lyd0 lyd0Var3 = vlq0Var.g;
            if (extendedUserProfile == null) {
                return;
            }
            if (aVar5 instanceof UserProfileAction.s.a.b.C1691a) {
                ProfileAction profileAction = ((UserProfileAction.s.a.b.C1691a) aVar5).b;
                switch (vlq0.a.$EnumSwitchMapping$0[profileAction.getType().ordinal()]) {
                    case 1:
                        nyd0.b a2 = lyd0Var3.a();
                        a2.getClass();
                        a2.a(MobileOfficialAppsProfileStat$AnotherUserProfileMenuEvent.AnotherUserProfileMenuEventType.CLICK_TO_GIFTS, null);
                        fpq0 fpq0Var14 = vlq0Var.k;
                        (fpq0Var14 != null ? fpq0Var14 : null).B(new f.e.m0(extendedUserProfile));
                        return;
                    case 2:
                        nyd0.b a3 = lyd0Var3.a();
                        oyd0.a(MobileOfficialAppsProfileStat$ServiceItem.NativeServiceType.QUESTIONS);
                        a3.b(-1L);
                        fpq0 fpq0Var15 = vlq0Var.k;
                        (fpq0Var15 != null ? fpq0Var15 : null).B(new f.e.z0(extendedUserProfile));
                        return;
                    case 3:
                        nyd0.b a4 = vlq0Var.g.a();
                        a4.getClass();
                        a4.a(MobileOfficialAppsProfileStat$AnotherUserProfileMenuEvent.AnotherUserProfileMenuEventType.ADD_TO_CHAT, null);
                        fpq0 fpq0Var16 = vlq0Var.k;
                        (fpq0Var16 != null ? fpq0Var16 : null).B(new f.e.a(extendedUserProfile.a.c));
                        return;
                    case 4:
                        gs90.a payload = profileAction.getPayload();
                        if (payload == null || (webApiApplication = payload.a) == null) {
                            return;
                        }
                        fpq0 fpq0Var17 = vlq0Var.k;
                        (fpq0Var17 != null ? fpq0Var17 : null).B(new f.e.y(webApiApplication));
                        return;
                    case 5:
                        lyd0Var3.j().c();
                        fpq0 fpq0Var18 = vlq0Var.k;
                        (fpq0Var18 != null ? fpq0Var18 : null).B(f.e.p0.a);
                        return;
                    case 6:
                        vlq0Var.e(extendedUserProfile);
                        return;
                    default:
                        throw new IllegalStateException("Profile action type " + profileAction.getType() + " is not supported");
                }
            }
            if (!(aVar5 instanceof UserProfileAction.s.a.b.C1692b)) {
                if (!aVar5.equals(UserProfileAction.s.a.C1690a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                vlq0Var.h(extendedUserProfile);
                return;
            }
            zp0.a aVar6 = ((UserProfileAction.s.a.b.C1692b) aVar5).b;
            lzh0 lzh0Var = vlq0Var.h;
            if (aVar6 instanceof zp0.a.C4191a) {
                nyd0.b a5 = lyd0Var3.a();
                a5.getClass();
                a5.a(MobileOfficialAppsProfileStat$AnotherUserProfileMenuEvent.AnotherUserProfileMenuEventType.ADD_TO_BEST_FRIENDS, null);
                vlq0Var.g(extendedUserProfile);
                return;
            }
            if (aVar6 instanceof zp0.a.g) {
                nyd0.b a6 = lyd0Var3.a();
                a6.getClass();
                a6.a(MobileOfficialAppsProfileStat$AnotherUserProfileMenuEvent.AnotherUserProfileMenuEventType.REMOVE_FROM_BEST_FRIENDS, null);
                vlq0Var.g(extendedUserProfile);
                return;
            }
            if (aVar6 instanceof zp0.a.b) {
                nyd0.b a7 = lyd0Var3.a();
                a7.getClass();
                a7.a(MobileOfficialAppsProfileStat$AnotherUserProfileMenuEvent.AnotherUserProfileMenuEventType.ADD_TO_CHAT, null);
                fpq0 fpq0Var19 = vlq0Var.k;
                (fpq0Var19 != null ? fpq0Var19 : null).B(new f.e.a(extendedUserProfile.a.c));
                return;
            }
            if (aVar6 instanceof zp0.a.c) {
                lzh0Var.a(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.FAVE_OUT);
                nyd0.b a8 = lyd0Var3.a();
                a8.getClass();
                a8.a(MobileOfficialAppsProfileStat$AnotherUserProfileMenuEvent.AnotherUserProfileMenuEventType.ADD_TO_BOOKMARKS, null);
                vlq0Var.l(extendedUserProfile, true);
                return;
            }
            if (aVar6 instanceof zp0.a.h) {
                lzh0Var.a(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.UNFAVE_OUT);
                nyd0.b a9 = lyd0Var3.a();
                a9.getClass();
                a9.a(MobileOfficialAppsProfileStat$AnotherUserProfileMenuEvent.AnotherUserProfileMenuEventType.REMOVE_FROM_BOOKMARKS, null);
                vlq0Var.l(extendedUserProfile, false);
                return;
            }
            if (aVar6 instanceof zp0.a.d) {
                nyd0.b a10 = lyd0Var3.a();
                a10.getClass();
                a10.a(MobileOfficialAppsProfileStat$AnotherUserProfileMenuEvent.AnotherUserProfileMenuEventType.BLOCK, null);
                fpq0 fpq0Var20 = vlq0Var.k;
                (fpq0Var20 != null ? fpq0Var20 : null).B(new f.c.C1718c(extendedUserProfile));
                return;
            }
            if (aVar6 instanceof zp0.a.m) {
                vlq0Var.h(extendedUserProfile);
                return;
            }
            if (aVar6 instanceof zp0.a.e) {
                lyd0Var3.j().d();
                dvq0 dvq0Var3 = vlq0Var.b;
                dvq0Var3.b(dvq0Var3.g(extendedUserProfile));
                fpq0 fpq0Var21 = vlq0Var.k;
                if (fpq0Var21 == null) {
                    fpq0Var21 = null;
                }
                Activity activity = vlq0Var.l;
                fpq0Var21.B(vlq0.c((activity != null ? activity : null).getString(R.string.link_copied)));
                return;
            }
            if (aVar6 instanceof zp0.a.j) {
                ProfileCover profileCover = gVar2.p.h;
                hea0 hea0Var = profileCover != null ? profileCover.d : null;
                if (hea0Var != null) {
                    fpq0 fpq0Var22 = vlq0Var.k;
                    (fpq0Var22 != null ? fpq0Var22 : null).B(new f.c.n(hea0Var, extendedUserProfile));
                    return;
                }
                nyd0.b a11 = lyd0Var3.a();
                a11.getClass();
                a11.a(MobileOfficialAppsProfileStat$AnotherUserProfileMenuEvent.AnotherUserProfileMenuEventType.CLAIM, null);
                fpq0 fpq0Var23 = vlq0Var.k;
                (fpq0Var23 != null ? fpq0Var23 : null).B(new f.e.m1(extendedUserProfile.a.c));
                return;
            }
            if (aVar6 instanceof zp0.a.k) {
                vlq0Var.e(extendedUserProfile);
                return;
            }
            if ((aVar6 instanceof zp0.a.f) || (aVar6 instanceof zp0.a.l)) {
                u5p0 u5p0Var5 = vlq0Var.i;
                (u5p0Var5 != null ? u5p0Var5 : null).invoke(UserProfileAction.s.c.d.b);
                return;
            } else {
                if (!(aVar6 instanceof zp0.a.i)) {
                    throw new NoWhenBranchMatchedException();
                }
                fpq0 fpq0Var24 = vlq0Var.k;
                (fpq0Var24 != null ? fpq0Var24 : null).B(new f.c.h(new hos(extendedUserProfile, ios.c.a)));
                return;
            }
        }
        UserProfileAction.s.g gVar3 = (UserProfileAction.s.g) sVar;
        dvq0 dvq0Var4 = qvl0Var.e;
        sdx sdxVar = gVar2.u;
        if (extendedUserProfile == null) {
            return;
        }
        if (gVar3 instanceof UserProfileAction.s.g.b) {
            StoryEntry storyEntry5 = ((UserProfileAction.s.g.b) gVar3).b;
            ArrayList<StoriesContainer> arrayList = extendedUserProfile.v1;
            if (arrayList != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (((StoriesContainer) obj2).Eb()) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((StoriesContainer) it2.next()).g);
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    Object next = it3.next();
                    if (((CopyOnWriteArrayList) next).contains(storyEntry5)) {
                        arrayList4.add(next);
                    }
                }
                Iterator it4 = arrayList4.iterator();
                while (it4.hasNext()) {
                    ((CopyOnWriteArrayList) it4.next()).remove(storyEntry5);
                }
                qvl0Var.c(arrayList);
                return;
            }
            return;
        }
        if (gVar3 instanceof UserProfileAction.s.g.c) {
            UserProfileAction.s.g.c cVar = (UserProfileAction.s.g.c) gVar3;
            ArrayList<StoriesContainer> arrayList5 = extendedUserProfile.v1;
            if (arrayList5 == null) {
                return;
            }
            hfr.a aVar7 = new hfr.a(rli0.j(rli0.p(rli0.j(new i5g(arrayList5), new jvl0(r13 ? 1 : 0)), new fyi0(i2)), new nvl0(r13 ? 1 : 0, j5g.S0(cVar.b))));
            while (aVar7.hasNext()) {
                StoryEntry storyEntry6 = (StoryEntry) aVar7.next();
                if (!storyEntry6.h) {
                    storyEntry6.h = true;
                    c = 1;
                }
            }
            if (c != 0) {
                qvl0Var.c(arrayList5);
                return;
            }
            return;
        }
        if (gVar3 instanceof UserProfileAction.s.g.i.a) {
            UserProfileAction.s.g.i.a aVar8 = (UserProfileAction.s.g.i.a) gVar3;
            ArrayList<StoriesContainer> arrayList6 = extendedUserProfile.v1;
            if (arrayList6 != null) {
                ArrayList arrayList7 = new ArrayList();
                for (Object obj3 : arrayList6) {
                    StoryOwner storyOwner = ((StoriesContainer) obj3).b;
                    if (storyOwner != null && (Fb2 = storyOwner.Fb()) != null && dvq0Var4.a(Fb2)) {
                        arrayList7.add(obj3);
                    }
                }
                Iterator it5 = arrayList7.iterator();
                while (it5.hasNext()) {
                    StoriesContainer storiesContainer = (StoriesContainer) it5.next();
                    Iterator<StoryEntry> it6 = storiesContainer.g.iterator();
                    while (true) {
                        if (it6.hasNext()) {
                            storyEntry4 = it6.next();
                            if (storyEntry4.c == aVar8.b.a) {
                                break;
                            }
                        } else {
                            storyEntry4 = null;
                            break;
                        }
                    }
                    StoryEntry storyEntry7 = storyEntry4;
                    if (storyEntry7 != null) {
                        storiesContainer.g.remove(storyEntry7);
                    }
                }
                return;
            }
            return;
        }
        if (gVar3 instanceof UserProfileAction.s.g.i.b) {
            UserProfileAction.s.g.i.b bVar5 = (UserProfileAction.s.g.i.b) gVar3;
            if (dvq0Var4.a(extendedUserProfile.a.c)) {
                zjm0 zjm0Var = bVar5.b;
                ArrayList<StoriesContainer> arrayList8 = extendedUserProfile.v1;
                if (arrayList8 != null) {
                    ArrayList arrayList9 = new ArrayList(c5g.u(arrayList8, 10));
                    Iterator<T> it7 = arrayList8.iterator();
                    while (it7.hasNext()) {
                        arrayList9.add(((StoriesContainer) it7.next()).g);
                    }
                    Iterator it8 = c5g.v(arrayList9).iterator();
                    while (it8.hasNext()) {
                        StoryEntry storyEntry8 = (StoryEntry) it8.next();
                        if (storyEntry8.b && storyEntry8.c == zjm0Var.a && (storyEntry3 = zjm0Var.g) != null) {
                            storyEntry8.y = zjm0Var.f;
                            storyEntry8.Xb(storyEntry3);
                        }
                    }
                    qvl0Var.c(arrayList8);
                }
                if (!qvl0Var.l || (storyEntry2 = zjm0Var.g) == null) {
                    return;
                }
                fpq0 fpq0Var25 = qvl0Var.k;
                (fpq0Var25 != null ? fpq0Var25 : null).B(new f.b.C1717b(storyEntry2.Gb()));
                return;
            }
            return;
        }
        if (gVar3 instanceof UserProfileAction.s.g.i.c) {
            UserProfileAction.s.g.i.c cVar2 = (UserProfileAction.s.g.i.c) gVar3;
            ArrayList<StoriesContainer> arrayList10 = extendedUserProfile.v1;
            if (arrayList10 != null) {
                if (arrayList10.isEmpty()) {
                    arrayList10.add(new SimpleStoriesContainer(dvq0Var4.h(), new ArrayList()));
                }
                ArrayList arrayList11 = new ArrayList();
                for (Object obj4 : arrayList10) {
                    if (!fsk.x((StoriesContainer) obj4)) {
                        arrayList11.add(obj4);
                    }
                }
                Iterator it9 = arrayList11.iterator();
                while (it9.hasNext()) {
                    StoriesContainer storiesContainer2 = (StoriesContainer) it9.next();
                    StoryOwner storyOwner2 = storiesContainer2.b;
                    if (storyOwner2 != null && (Fb = storyOwner2.Fb()) != null && dvq0Var4.a(Fb)) {
                        storiesContainer2.g.add(cVar2.b.e(o25.a().c()));
                        qvl0Var.c(arrayList10);
                    }
                }
                return;
            }
            return;
        }
        if (gVar3.equals(UserProfileAction.s.g.e.b)) {
            qvl0Var.c(extendedUserProfile.v1);
            return;
        }
        if (gVar3 instanceof UserProfileAction.s.g.h) {
            UserProfileAction.s.g.h hVar2 = (UserProfileAction.s.g.h) gVar3;
            fpq0 fpq0Var26 = qvl0Var.k;
            if (fpq0Var26 == null) {
                fpq0Var26 = null;
            }
            UserId userId5 = qvl0Var.c.a;
            String str = hVar2.b;
            if (sdxVar != null && (kkq0Var2 = sdxVar.b) != null) {
                list = kkq0Var2.a;
            }
            if (list == null) {
                list = EmptyList.b;
            }
            fpq0Var26.B(new f.e.q1(new cwl0(userId5, str, list, new nyh0(i), new ko60(7), new nyk0(i2), MobileOfficialAppsConStoriesStat$ViewEntryPoint.STORIES_POSSIBLE_FRIENDS_BLOCK, hVar2.c)));
            return;
        }
        if (gVar3 instanceof UserProfileAction.s.g.f) {
            fpq0 fpq0Var27 = qvl0Var.k;
            (fpq0Var27 != null ? fpq0Var27 : null).B(f.c.i.a);
            return;
        }
        if (gVar3 instanceof UserProfileAction.s.g.a) {
            qvl0Var.a();
            return;
        }
        if (gVar3 instanceof UserProfileAction.s.g.C1698g) {
            UserProfileAction.s.g.C1698g c1698g = (UserProfileAction.s.g.C1698g) gVar3;
            izs<? super com.vk.profile.user.impl.ui.b, s3q0> izsVar7 = qvl0Var.j;
            (izsVar7 != null ? izsVar7 : null).invoke(new b.a0.C1707b(c1698g.b));
            qvl0Var.f.t();
            return;
        }
        if (!(gVar3 instanceof UserProfileAction.s.g.d)) {
            throw new NoWhenBranchMatchedException();
        }
        List<StoriesContainer> list2 = (sdxVar == null || (kkq0Var = sdxVar.b) == null) ? null : kkq0Var.a;
        if (list2 == null) {
            list2 = EmptyList.b;
        }
        Iterator<T> it10 = list2.iterator();
        while (true) {
            if (!it10.hasNext()) {
                break;
            }
            Object next2 = it10.next();
            if (epx.f(((StoriesContainer) next2).Ob(), ((UserProfileAction.s.g.d) gVar3).b)) {
                obj = next2;
                break;
            }
        }
        StoriesContainer storiesContainer3 = (StoriesContainer) obj;
        if (storiesContainer3 == null || (copyOnWriteArrayList = storiesContainer3.g) == null || (storyEntry = (StoryEntry) j5g.a0(copyOnWriteArrayList)) == null) {
            return;
        }
        anm0.f(qvl0Var.g.a, MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.PREVIEW_VIEW, dul0.b, MobileOfficialAppsConStoriesStat$ViewEntryPoint.STORIES_POSSIBLE_FRIENDS_BLOCK_PREVIEW, storyEntry, null, 48);
    }

    public final ArrayList U() {
        return j5g.u0(this.m.w2(), this.E.n.w2());
    }

    public final void V(com.vk.profile.user.impl.ui.g gVar, UserProfileAction.r rVar) {
        if (epx.f(rVar, UserProfileAction.r.g.b)) {
            Iterator it = U().iterator();
            while (it.hasNext()) {
                ((huq) it.next()).onStart();
            }
            return;
        }
        if (epx.f(rVar, UserProfileAction.r.h.b)) {
            Iterator it2 = U().iterator();
            while (it2.hasNext()) {
                ((huq) it2.next()).onStop();
            }
            btq0 btq0Var = this.i;
            btq0Var.c.post(new ou4(btq0Var, 10));
            return;
        }
        if (epx.f(rVar, UserProfileAction.r.a.b)) {
            UserProfileDialogs userProfileDialogs = this.j;
            userProfileDialogs.j.post(new ov(userProfileDialogs, 17));
            return;
        }
        if (rVar instanceof UserProfileAction.r.f) {
            ExtendedUserProfile extendedUserProfile = gVar.j;
            if (extendedUserProfile != null) {
                this.n.l(extendedUserProfile);
            }
            Iterator it3 = U().iterator();
            while (it3.hasNext()) {
                ((huq) it3.next()).onResume();
            }
            return;
        }
        if (epx.f(rVar, UserProfileAction.r.e.b)) {
            Iterator it4 = U().iterator();
            while (it4.hasNext()) {
                ((huq) it4.next()).onPause();
            }
            return;
        }
        if (rVar instanceof UserProfileAction.r.b) {
            Iterator it5 = U().iterator();
            while (it5.hasNext()) {
                ((huq) it5.next()).m(((UserProfileAction.r.b) rVar).b);
            }
        } else {
            if (epx.f(rVar, UserProfileAction.r.c.b)) {
                Iterator it6 = U().iterator();
                while (it6.hasNext()) {
                    ((huq) it6.next()).onDestroy();
                }
                this.q.clear();
                return;
            }
            if (!epx.f(rVar, UserProfileAction.r.d.b)) {
                throw new NoWhenBranchMatchedException();
            }
            htq0 htq0Var = this.f;
            this.Q.invoke(new b.j((htq0Var.h.invoke().booleanValue() || htq0Var.e) ? false : true));
        }
    }

    public final void W(mtl mtlVar) {
        for (huq huqVar : mtlVar.w2()) {
            huqVar.r(this.Q);
            huqVar.i(this.e);
            huqVar.k(new u5p0(this, 4));
            huqVar.H(this);
            if (huqVar instanceof mtl) {
                W((mtl) huqVar);
            }
            huqVar.j();
        }
    }

    public final void X(b.r rVar, com.vk.profile.user.impl.ui.g gVar, UserProfileAction.x xVar) {
        mzp0 mzp0Var = this.p;
        if (mzp0Var != null) {
            mzp0Var.a();
        }
        io.reactivex.rxjava3.core.q K = super.K(this.l.g(xVar.d), rVar);
        Long valueOf = Long.valueOf(this.g.i());
        if (!xVar.b) {
            valueOf = null;
        }
        io.reactivex.rxjava3.internal.operators.observable.j1 U = K.y(valueOf != null ? valueOf.longValue() : 0L, TimeUnit.MILLISECONDS).U(new or20(new sx4(this, xVar, gVar, 9), 15));
        j7l0 j7l0Var = new j7l0(new by5(28, this, xVar), 6);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        a7f0.a.e(this, new io.reactivex.rxjava3.internal.operators.observable.z(new io.reactivex.rxjava3.internal.operators.observable.z(new io.reactivex.rxjava3.internal.operators.observable.z(new io.reactivex.rxjava3.internal.operators.observable.z(new io.reactivex.rxjava3.internal.operators.observable.z(new io.reactivex.rxjava3.internal.operators.observable.z(U.E(j7l0Var, lVar, kVar, kVar).E(new nan0(new fda0(this, 15), 2), lVar, kVar, kVar).E(new epq0(new n43(this, gVar, xVar, 5), 0), lVar, kVar, kVar), new j990(new prd0(6, this, xVar), 12)), new uk40(new sf4(27, this, gVar), 19)), new vk40(new h440(26, this, xVar), 25)), new qg60(new xka0(this, 20), 18)), new hu50(new ydn0(2, this, xVar), 26)), new w250(new yka0(this, 18), 25)), null, null, new xzk0(5, xVar, this), null, 11);
    }
}
