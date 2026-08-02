package xsna;

import android.app.Activity;
import android.content.Context;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.ads.api.newsfeed.WallAdsEasyPromoteUrlBuilder;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vk.profile.user.api.domain.actions.ProfileAction;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.profile.user.impl.ui.b;
import com.vk.profile.user.impl.ui.f;
import com.vk.stat.scheme.MobileOfficialAppsProfileStat$AnotherUserProfileEvent;
import com.vk.stat.scheme.MobileOfficialAppsProfileStat$PublishingEvent;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.superapp.miniapps.api.utils.InternalVkMiniApps;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import xsna.atq0;
import xsna.gs90;
import xsna.ios;
import xsna.kwb0;
import xsna.nyd0;
import xsna.vlq0;
import xsna.zp0;

/* compiled from: UserProfileActionButtonsFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class rlq0 implements huq {
    public final r0e0 b;
    public final dvq0 c;
    public final ouq0 d;
    public final lyd0 e;
    public final lzh0 f;
    public final cwg0 g;
    public io.reactivex.rxjava3.disposables.b h;
    public u5p0 i;
    public izs<? super com.vk.profile.user.impl.ui.b, s3q0> j;
    public fpq0 k;
    public final Object l;
    public final Object m;

    public rlq0(r0e0 r0e0Var, dvq0 dvq0Var, ouq0 ouq0Var, lyd0 lyd0Var, lzh0 lzh0Var, cwg0 cwg0Var) {
        this.b = r0e0Var;
        this.c = dvq0Var;
        this.d = ouq0Var;
        this.e = lyd0Var;
        this.f = lzh0Var;
        this.g = cwg0Var;
        im80 im80Var = new im80(7);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.l = msy.a(lazyThreadSafetyMode, im80Var);
        this.m = msy.a(lazyThreadSafetyMode, new buc0(11));
    }

    public static final void h(ExtendedUserProfile extendedUserProfile, rlq0 rlq0Var, boolean z) {
        extendedUserProfile.m0 = z;
        String string = rlq0Var.c.getString(z ? R.string.user_profile_user_news_hidden : R.string.user_profile_user_news_shown, extendedUserProfile.b);
        fpq0 fpq0Var = rlq0Var.k;
        if (fpq0Var == null) {
            fpq0Var = null;
        }
        fpq0Var.B(new f.h(new atq0.f(null, string, null, 13)));
    }

    @Override // xsna.huq
    public final void H(fpq0 fpq0Var) {
        this.k = fpq0Var;
    }

    @Override // xsna.ruu
    public final izs<com.vk.profile.user.impl.ui.b, s3q0> L() {
        izs izsVar = this.j;
        if (izsVar != null) {
            return izsVar;
        }
        return null;
    }

    public final io.reactivex.rxjava3.internal.operators.observable.b0 a(ExtendedUserProfile extendedUserProfile, UserProfileAction.s.c.b bVar) {
        io.reactivex.rxjava3.internal.operators.observable.j1 C = this.d.C(bVar.b, !extendedUserProfile.D1);
        eiy eiyVar = new eiy(new qlq0(0, this, extendedUserProfile), 24);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return C.E(eiyVar, lVar, kVar, kVar).F(new jw80(new zkj0(5, this, extendedUserProfile), 18));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0435  */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v36, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(com.vk.profile.user.impl.ui.g gVar, UserProfileAction.s.c cVar, jtq0 jtq0Var, vlq0 vlq0Var) {
        ?? r20;
        ?? r17;
        String str;
        List singletonList;
        String str2;
        Integer num;
        Long l;
        WebApiApplication webApiApplication;
        boolean z;
        zp0.a.g gVar2;
        zp0.a.C4191a c4191a;
        zp0.a.f fVar;
        zp0.a.l lVar;
        zp0.a.i iVar;
        boolean z2;
        WebApiApplication webApiApplication2;
        char c;
        ExtendedUserProfile extendedUserProfile = gVar.j;
        if (extendedUserProfile == null) {
            return;
        }
        boolean z3 = true;
        boolean z4 = false;
        if (!(cVar instanceof UserProfileAction.s.c.a)) {
            if (cVar instanceof UserProfileAction.s.c.b) {
                c(extendedUserProfile, (UserProfileAction.s.c.b) cVar);
                return;
            }
            if (cVar.equals(UserProfileAction.s.c.C1696c.b)) {
                d(extendedUserProfile);
                return;
            }
            if (cVar.equals(UserProfileAction.s.c.d.b)) {
                g(extendedUserProfile);
                return;
            } else {
                if (!cVar.equals(UserProfileAction.s.c.e.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                io.reactivex.rxjava3.disposables.c subscribe = super.K(this.d.r(), b.r.a.b).L(new je40(new cpo0(1, extendedUserProfile, this), 12), false).subscribe();
                io.reactivex.rxjava3.disposables.b bVar = this.h;
                (bVar != null ? bVar : null).b(subscribe);
                return;
            }
        }
        UserProfileAction.s.c.a aVar = (UserProfileAction.s.c.a) cVar;
        char c2 = 3;
        if (aVar instanceof UserProfileAction.s.c.a.C1694a) {
            ios.d.a.C3068a c3068a = extendedUserProfile.A1 ? ios.d.a.C3068a.c : null;
            if (c3068a != null) {
                e(extendedUserProfile, c3068a);
            } else {
                u5p0 u5p0Var = this.i;
                (u5p0Var != null ? u5p0Var : null).invoke(new UserProfileAction.s.c.b(3));
            }
            this.f.a(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.ADD_FRIEND_OUT);
            return;
        }
        if (aVar instanceof UserProfileAction.s.c.a.k) {
            UserProfileAction.s.c.a.k kVar = (UserProfileAction.s.c.a.k) cVar;
            ArrayList arrayList = new ArrayList();
            arrayList.add(new kwb0.a.C3211a(new fk(22, this, extendedUserProfile)));
            if (extendedUserProfile.D1 && !this.c.h().a0) {
                arrayList.add(new kwb0.a.c(new plq0(0, this, extendedUserProfile)));
            }
            f(extendedUserProfile, arrayList, kVar);
            return;
        }
        if ((aVar instanceof UserProfileAction.s.c.a.e) || (aVar instanceof UserProfileAction.s.c.a.l)) {
            ArrayList arrayList2 = new ArrayList();
            if (extendedUserProfile.Q1) {
                arrayList2.add(new kwb0.a.f(new com.vk.voip.a(27, this, extendedUserProfile)));
            } else {
                arrayList2.add(new kwb0.a.b(new wx0(22, this, extendedUserProfile)));
            }
            if (extendedUserProfile.D1) {
                arrayList2.add(extendedUserProfile.m0 ? new kwb0.a.e(new t9b(18, this, extendedUserProfile)) : new kwb0.a.d(new pk(19, this, extendedUserProfile)));
            }
            f(extendedUserProfile, arrayList2, aVar);
            return;
        }
        if (aVar instanceof UserProfileAction.s.c.a.b) {
            UserProfileAction.s.c.a.b bVar2 = (UserProfileAction.s.c.a.b) cVar;
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(new kwb0.a.g(new qg1(22, this, extendedUserProfile)));
            arrayList3.add(extendedUserProfile.m0 ? new kwb0.a.e(new t9b(18, this, extendedUserProfile)) : new kwb0.a.d(new pk(19, this, extendedUserProfile)));
            f(extendedUserProfile, arrayList3, bVar2);
            return;
        }
        if (aVar instanceof UserProfileAction.s.c.a.C1695c) {
            fpq0 fpq0Var = this.k;
            (fpq0Var != null ? fpq0Var : null).B(new f.e.d(extendedUserProfile));
            return;
        }
        String str3 = "";
        if (!(aVar instanceof UserProfileAction.s.c.a.g)) {
            if (aVar instanceof UserProfileAction.s.c.a.h) {
                this.f.a(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SEND_MESSAGE_OUT);
                nyd0.a m = this.e.m();
                m.getClass();
                m.a(MobileOfficialAppsProfileStat$AnotherUserProfileEvent.AnotherUserProfileEventType.CLICK_TO_MESSAGE, null);
                fpq0 fpq0Var2 = this.k;
                (fpq0Var2 != null ? fpq0Var2 : null).B(f.e.g.a);
                return;
            }
            if (aVar instanceof UserProfileAction.s.c.a.j) {
                nyd0.j c3 = jtq0Var.g.c();
                c3.getClass();
                c3.a(MobileOfficialAppsProfileStat$PublishingEvent.PublishingEventType.CLICK_TO_PLUS);
                jtq0Var.n = new tfm0(extendedUserProfile, 10);
                egc0 egc0Var = jtq0Var.m;
                if (egc0Var == null) {
                    egc0Var = null;
                }
                egc0Var.u6(extendedUserProfile);
                egc0 egc0Var2 = jtq0Var.m;
                if (egc0Var2 == null) {
                    egc0Var2 = null;
                }
                egc0Var2.v0(jtq0Var.d.m(), PostingCreationEntryPoint.ProfilePlusButton, null);
                return;
            }
            if (!(aVar instanceof UserProfileAction.s.c.a.d)) {
                if (aVar instanceof UserProfileAction.s.c.a.i) {
                    maz e = xwk.d().e();
                    Context context = e43.a;
                    e.k(context != null ? context : null, er.a(HttpRequest.DEFAULT_SCHEME).authority("static.".concat(a0a.d)).appendPath("ads_easy_promote").appendEncodedPath("").appendQueryParameter("act", "profileDashboard").appendQueryParameter("from", WallAdsEasyPromoteUrlBuilder.From.PROFILE_HEADER.h()).build().toString());
                    return;
                } else {
                    if (!(aVar instanceof UserProfileAction.s.c.a.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    fpq0 fpq0Var3 = this.k;
                    (fpq0Var3 != null ? fpq0Var3 : null).B(new f.e.m0(extendedUserProfile));
                    return;
                }
            }
            this.f.a(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SUBSCRIBE_OUT);
            c(extendedUserProfile, new UserProfileAction.s.c.b(3));
            ouq0 ouq0Var = this.d;
            if (ouq0Var.p() && ((Boolean) this.l.getValue()).booleanValue() && !((Boolean) this.m.getValue()).booleanValue()) {
                fpq0 fpq0Var4 = this.k;
                (fpq0Var4 != null ? fpq0Var4 : null).B(f.c.q.a);
                ouq0Var.w();
                return;
            }
            return;
        }
        vlq0Var.g.j().b();
        boolean a = vlq0Var.b.a(extendedUserProfile.a.c);
        ProfileAction.a aVar2 = vlq0Var.f;
        ArrayList b = aVar2.b(extendedUserProfile, extendedUserProfile.c1 != null);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : b) {
            ProfileAction profileAction = (ProfileAction) obj;
            ListBuilder e2 = e43.e();
            if (vlq0.f() && bwd0.e(extendedUserProfile)) {
                c = c2;
            } else {
                c = c2;
                e2.add(ProfileAction.Type.GIFT);
            }
            e2.add(ProfileAction.Type.PROFILE_QUESTION);
            e2.add(ProfileAction.Type.ADD_TO_CONVERSATION);
            e2.add(ProfileAction.Type.OPEN_APP);
            if (e2.g().contains(profileAction.getType())) {
                arrayList4.add(obj);
            }
            c2 = c;
        }
        char c4 = c2;
        ArrayList arrayList5 = new ArrayList(arrayList4);
        int i = 4;
        if (arrayList5.size() < 4) {
            zp0.a.b bVar3 = zp0.a.b.g;
            if (!extendedUserProfile.y) {
                bVar3 = null;
            }
            if (bVar3 != null) {
                arrayList5.add(new wlq0(bVar3, ProfileAction.Type.ADD_TO_CONVERSATION));
            }
        }
        if (vlq0.f() && bwd0.e(extendedUserProfile) && arrayList5.size() < 4) {
            arrayList5.add(0, new wlq0(zp0.a.k.g, ProfileAction.Type.SHARE));
        }
        if (arrayList5.size() == 1) {
            singletonList = vlq0.d(0, arrayList5);
            r20 = 1;
            r17 = 0;
            str = "";
        } else {
            List<ProfileAction> H0 = j5g.H0(arrayList5, 4);
            ArrayList arrayList6 = new ArrayList(c5g.u(H0, 10));
            for (ProfileAction profileAction2 : H0) {
                boolean z5 = z4;
                Integer b2 = vlq0.b(profileAction2);
                boolean z6 = z3;
                if (vlq0.a.$EnumSwitchMapping$0[profileAction2.getType().ordinal()] == i) {
                    gs90.a payload = profileAction2.getPayload();
                    if (payload == null || (webApiApplication = payload.a) == null) {
                        str2 = str3;
                        l = null;
                    } else {
                        str2 = str3;
                        l = Long.valueOf(webApiApplication.b);
                    }
                    long j = InternalVkMiniApps.WISHLIST.h().a;
                    if (l != null && l.longValue() == j && !a) {
                        num = Integer.valueOf(R.string.user_profile_action_wishlist_short);
                        arrayList6.add(new zp0.b.a.C4192a(profileAction2, b2, num));
                        str3 = str2;
                        z4 = z5;
                        z3 = z6;
                        i = 4;
                    }
                } else {
                    str2 = str3;
                }
                num = null;
                arrayList6.add(new zp0.b.a.C4192a(profileAction2, b2, num));
                str3 = str2;
                z4 = z5;
                z3 = z6;
                i = 4;
            }
            r20 = z3;
            r17 = z4;
            str = str3;
            singletonList = Collections.singletonList(new zp0.b.a(arrayList6));
        }
        List list = singletonList;
        if (extendedUserProfile.a.A) {
            list = null;
        }
        List list2 = list;
        if (list2 == null) {
            list2 = EmptyList.b;
        }
        List<ProfileAction> a2 = aVar2.a(extendedUserProfile, extendedUserProfile.c1 != null ? r20 : r17);
        ArrayList arrayList7 = new ArrayList();
        for (Object obj2 : a2) {
            if (((ProfileAction) obj2).getType() == ProfileAction.Type.OPEN_APP) {
                arrayList7.add(obj2);
            }
        }
        ArrayList arrayList8 = new ArrayList(c5g.u(arrayList7, 10));
        Iterator it = arrayList7.iterator();
        while (it.hasNext()) {
            ProfileAction profileAction3 = (ProfileAction) it.next();
            gs90.a payload2 = profileAction3.getPayload();
            String str4 = (payload2 == null || (webApiApplication2 = payload2.a) == null) ? null : webApiApplication2.c;
            if (str4 == null) {
                str4 = str;
            }
            arrayList8.add(new zp0.b.c(str4, profileAction3));
        }
        vlq0.a(arrayList8);
        Iterable iterable = arrayList8;
        if (extendedUserProfile.a.A) {
            iterable = null;
        }
        if (iterable == null) {
            iterable = EmptyList.b;
        }
        List d = vlq0.d(4, arrayList5);
        vlq0.a(d);
        if (extendedUserProfile.a.A) {
            d = null;
        }
        if (d == null) {
            d = EmptyList.b;
        }
        if (vlq0.f() && bwd0.e(extendedUserProfile) && !arrayList5.isEmpty()) {
            Iterator it2 = arrayList5.iterator();
            while (it2.hasNext()) {
                if (((ProfileAction) it2.next()).getType() == ProfileAction.Type.SHARE) {
                    z = r20;
                    break;
                }
            }
        }
        z = r17;
        zp0.a.b bVar4 = zp0.a.b.g;
        if (extendedUserProfile.y) {
            if (!arrayList5.isEmpty()) {
                Iterator it3 = arrayList5.iterator();
                while (it3.hasNext()) {
                    if (((ProfileAction) it3.next()).getType() == ProfileAction.Type.ADD_TO_CONVERSATION) {
                    }
                }
            }
            if (extendedUserProfile.a.A) {
                bVar4 = null;
            }
            gVar2 = zp0.a.g.g;
            if (bwd0.e(extendedUserProfile) || !extendedUserProfile.o0) {
                gVar2 = null;
            }
            if (extendedUserProfile.a.A) {
                gVar2 = null;
            }
            c4191a = zp0.a.C4191a.g;
            if (bwd0.e(extendedUserProfile) || extendedUserProfile.o0) {
                c4191a = null;
            }
            if (extendedUserProfile.a.A) {
                c4191a = null;
            }
            zp0.a.h hVar = zp0.a.h.g;
            if (extendedUserProfile.l || extendedUserProfile.g()) {
                hVar = null;
            }
            zp0.a.c cVar2 = zp0.a.c.g;
            if (!extendedUserProfile.l || extendedUserProfile.g()) {
                cVar2 = null;
            }
            zp0.a.k kVar2 = zp0.a.k.g;
            if (z) {
                kVar2 = null;
            }
            fVar = new zp0.a.f(extendedUserProfile.b);
            if (vlq0.f() || !bwd0.e(extendedUserProfile) || extendedUserProfile.m0) {
                fVar = null;
            }
            if (extendedUserProfile.a.A) {
                fVar = null;
            }
            lVar = new zp0.a.l(extendedUserProfile.b);
            if (vlq0.f() || !bwd0.e(extendedUserProfile) || !extendedUserProfile.m0) {
                lVar = null;
            }
            if (extendedUserProfile.a.A) {
                lVar = null;
            }
            iVar = zp0.a.i.g;
            if (vlq0.f() || !bwd0.e(extendedUserProfile)) {
                iVar = null;
            }
            if (extendedUserProfile.a.A) {
                iVar = null;
            }
            zp0.a.m mVar = zp0.a.m.g;
            z2 = extendedUserProfile.i0;
            if (!z2) {
                mVar = null;
            }
            zp0.a.d dVar = zp0.a.d.g;
            if (z2) {
                dVar = null;
            }
            zp0.a[] aVarArr = new zp0.a[13];
            aVarArr[r17] = bVar4;
            aVarArr[r20] = gVar2;
            aVarArr[2] = c4191a;
            aVarArr[c4] = hVar;
            aVarArr[4] = cVar2;
            aVarArr[5] = kVar2;
            aVarArr[6] = zp0.a.e.g;
            aVarArr[7] = fVar;
            aVarArr[8] = lVar;
            aVarArr[9] = iVar;
            aVarArr[10] = zp0.a.j.g;
            aVarArr[11] = mVar;
            aVarArr[12] = dVar;
            List I = rl3.I(aVarArr);
            if (d.isEmpty()) {
                vlq0.a(I);
            }
            ArrayList u0 = j5g.u0(I, j5g.u0(d, j5g.u0(iterable, list2)));
            fpq0 fpq0Var5 = vlq0Var.k;
            (fpq0Var5 == null ? fpq0Var5 : null).B(new f.c.b(u0));
        }
        bVar4 = null;
        if (extendedUserProfile.a.A) {
        }
        gVar2 = zp0.a.g.g;
        if (bwd0.e(extendedUserProfile)) {
        }
        gVar2 = null;
        if (extendedUserProfile.a.A) {
        }
        c4191a = zp0.a.C4191a.g;
        if (bwd0.e(extendedUserProfile)) {
        }
        c4191a = null;
        if (extendedUserProfile.a.A) {
        }
        zp0.a.h hVar2 = zp0.a.h.g;
        if (extendedUserProfile.l) {
        }
        hVar2 = null;
        zp0.a.c cVar22 = zp0.a.c.g;
        if (!extendedUserProfile.l) {
        }
        cVar22 = null;
        zp0.a.k kVar22 = zp0.a.k.g;
        if (z) {
        }
        fVar = new zp0.a.f(extendedUserProfile.b);
        if (vlq0.f()) {
        }
        fVar = null;
        if (extendedUserProfile.a.A) {
        }
        lVar = new zp0.a.l(extendedUserProfile.b);
        if (vlq0.f()) {
        }
        lVar = null;
        if (extendedUserProfile.a.A) {
        }
        iVar = zp0.a.i.g;
        if (vlq0.f()) {
        }
        iVar = null;
        if (extendedUserProfile.a.A) {
        }
        zp0.a.m mVar2 = zp0.a.m.g;
        z2 = extendedUserProfile.i0;
        if (!z2) {
        }
        zp0.a.d dVar2 = zp0.a.d.g;
        if (z2) {
        }
        zp0.a[] aVarArr2 = new zp0.a[13];
        aVarArr2[r17] = bVar4;
        aVarArr2[r20] = gVar2;
        aVarArr2[2] = c4191a;
        aVarArr2[c4] = hVar2;
        aVarArr2[4] = cVar22;
        aVarArr2[5] = kVar22;
        aVarArr2[6] = zp0.a.e.g;
        aVarArr2[7] = fVar;
        aVarArr2[8] = lVar;
        aVarArr2[9] = iVar;
        aVarArr2[10] = zp0.a.j.g;
        aVarArr2[11] = mVar2;
        aVarArr2[12] = dVar2;
        List I2 = rl3.I(aVarArr2);
        if (d.isEmpty()) {
        }
        ArrayList u02 = j5g.u0(I2, j5g.u0(d, j5g.u0(iterable, list2)));
        fpq0 fpq0Var52 = vlq0Var.k;
        (fpq0Var52 == null ? fpq0Var52 : null).B(new f.c.b(u02));
    }

    public final void c(ExtendedUserProfile extendedUserProfile, UserProfileAction.s.c.b bVar) {
        io.reactivex.rxjava3.internal.operators.observable.b0 a = a(extendedUserProfile, bVar);
        if (bVar.c) {
            super.K(a, b.r.a.b);
        }
        io.reactivex.rxjava3.disposables.c subscribe = a.G(new jf1(this, 8)).subscribe();
        io.reactivex.rxjava3.disposables.b bVar2 = this.h;
        if (bVar2 == null) {
            bVar2 = null;
        }
        bVar2.b(subscribe);
    }

    public final void d(ExtendedUserProfile extendedUserProfile) {
        io.reactivex.rxjava3.disposables.c subscribe = super.K(this.d.E(), b.r.a.b).subscribe(new j720(new np5(23, extendedUserProfile, this), 13), new y730(new alj0(this, 12), 18));
        io.reactivex.rxjava3.disposables.b bVar = this.h;
        if (bVar == null) {
            bVar = null;
        }
        bVar.b(subscribe);
    }

    public final void e(ExtendedUserProfile extendedUserProfile, ios iosVar) {
        fpq0 fpq0Var = this.k;
        if (fpq0Var == null) {
            fpq0Var = null;
        }
        fpq0Var.B(new f.c.h(new hos(extendedUserProfile, iosVar)));
    }

    public final void f(ExtendedUserProfile extendedUserProfile, ArrayList arrayList, UserProfileAction.s.c.a aVar) {
        fpq0 fpq0Var = this.k;
        if (fpq0Var == null) {
            fpq0Var = null;
        }
        fpq0Var.B(new f.c.a(new hwb0(extendedUserProfile, aVar.a(), arrayList)));
    }

    public final void g(ExtendedUserProfile extendedUserProfile) {
        boolean z = extendedUserProfile.m0;
        ouq0 ouq0Var = this.d;
        if (z) {
            super.K(ouq0Var.m(), b.r.a.b).subscribe(new uu60(new h57(27, extendedUserProfile, this), 26), kwg0.b());
        } else {
            super.K(ouq0Var.a(), b.r.a.b).subscribe(new dpo0(new ozk0(3, extendedUserProfile, this), 2), kwg0.b());
        }
    }

    @Override // xsna.huq
    public final void i(io.reactivex.rxjava3.disposables.b bVar) {
        this.h = bVar;
    }

    @Override // xsna.huq
    public final void k(u5p0 u5p0Var) {
        this.i = u5p0Var;
    }

    @Override // xsna.ruu
    public final void r(r9c0 r9c0Var) {
        this.j = r9c0Var;
    }

    @Override // xsna.huq
    public final void j() {
    }

    @Override // xsna.huq
    public final void onDestroy() {
    }

    @Override // xsna.huq
    public final void onPause() {
    }

    @Override // xsna.huq
    public final void onResume() {
    }

    @Override // xsna.huq
    public final void onStart() {
    }

    @Override // xsna.huq
    public final void onStop() {
    }

    @Override // xsna.huq
    public final void m(Activity activity) {
    }

    @Override // xsna.huq
    public final void J(com.vk.profile.user.impl.ui.g gVar, UserProfileAction.a aVar) {
    }
}
