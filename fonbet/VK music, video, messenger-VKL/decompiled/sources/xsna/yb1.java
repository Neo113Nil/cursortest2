package xsna;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.a;
import androidx.lifecycle.Lifecycle;
import com.unity3d.ads.BuildConfig;
import com.unity3d.services.UnityAdsConstants;
import com.vk.common.links.LaunchContext;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.modal.Mode;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.donut.design.compose.banner.DonutBannerKt;
import com.vk.donut.design.compose.banner.c;
import com.vk.dto.common.actions.Action;
import com.vk.dto.profile.Donut;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.ecomm.market.good.ui.ProductActionButton;
import com.vk.libvideo.design.compose.base.datacontent.presets.VideoMetaViewState;
import com.vk.profile.community.impl.ui.CommunityAction;
import com.vk.profile.design.view.profileheader.UserProfileBaseInfoState;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.onelog.NetworkClass;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class yb1 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yb1(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x026d A[LOOP:3: B:72:0x0267->B:74:0x026d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0207  */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v37, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v40, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.wzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        Action action;
        Action action2;
        ArrayList arrayList;
        int i;
        qa10 qa10Var;
        ArrayList arrayList2;
        Iterator<T> it;
        Integer valueOf;
        switch (this.b) {
            case 0:
                afb0 afb0Var = (afb0) this.c;
                izs izsVar = (izs) this.d;
                ((Integer) obj2).getClass();
                int I = ne7.I(1);
                androidx.compose.runtime.a M = ((androidx.compose.runtime.a) obj).M(722707166);
                int i2 = (M.J(afb0Var) ? 4 : 2) | I | (M.y(izsVar) ? 32 : 16);
                if (M.t(i2 & 1, (i2 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(722707166, i2, -1, "com.vk.catalog2.common.ui.mvp.holder.video.assistant.AiAssistantCardPlaylistCardContent (AiAssistantCard.kt:330)");
                    }
                    throw null;
                }
                M.h();
                androidx.compose.runtime.f s = M.s();
                if (s != null) {
                    s.d = new yb1(afb0Var, izsVar, I, 0);
                }
                return s3q0.a;
            case 1:
                ztm0 ztm0Var = (ztm0) obj;
                o6j o6jVar = (o6j) obj2;
                return ((cp10) this.c).b(ztm0Var, ztm0Var.t1(s3q0.a, new jai(-431986394, new ta8(0, (jai) this.d, new xa8(ztm0Var, o6jVar.a)), true)), o6jVar.a);
            case 2:
                List list = (List) this.c;
                q630 q630Var = (q630) this.d;
                ((Integer) obj2).getClass();
                l0h.a(ne7.I(1), (androidx.compose.runtime.a) obj, list, q630Var);
                return s3q0.a;
            case 3:
                z1i z1iVar = (z1i) this.c;
                Context context = (Context) this.d;
                View view = (View) obj;
                o1i o1iVar = z1iVar.b;
                int i3 = ((e520) obj2).a;
                if (i3 == R.id.vk_community_archive) {
                    o1iVar.m();
                } else if (i3 == R.id.vk_community_allow_messages) {
                    o1iVar.k();
                } else if (i3 == R.id.vk_community_leave_community) {
                    ExtendedCommunityProfile extendedCommunityProfile = z1iVar.a;
                    int i4 = extendedCommunityProfile.Y;
                    new w2i(i4 == 2, extendedCommunityProfile.m0, i4 == 1, new w1i(0, o1iVar, k1i.class, "handleHideNews", "handleHideNews()V", 0, 0), new x1i(0, z1iVar.b, k1i.class, "handleLeaveGroup", "handleLeaveGroup(Z)V", 0), new y1i(0, o1iVar, k1i.class, "handleChangeEventDesicion", "handleChangeEventDesicion()V", 0)).d(context);
                } else if (i3 == R.id.vk_community_donut_change) {
                    Donut donut = o1iVar.c.t2;
                    if (donut != null && (action2 = donut.d) != null) {
                        ((q10) o1iVar.z.getValue()).a(o1iVar.q, action2);
                    }
                } else if (i3 == R.id.vk_community_donut_renew) {
                    Donut donut2 = o1iVar.c.t2;
                    if (donut2 != null && (action = donut2.d) != null) {
                        ((q10) o1iVar.z.getValue()).a(o1iVar.q, action);
                    }
                } else if (i3 == R.id.vk_community_copy_link) {
                    o1iVar.e();
                } else if (i3 == R.id.vk_community_open_avatar) {
                    ExtendedCommunityProfile extendedCommunityProfile2 = o1iVar.c;
                    if (!bwd0.c(extendedCommunityProfile2)) {
                        o1iVar.n.b(o1iVar.q, extendedCommunityProfile2);
                        g2h g2hVar = new g2h(extendedCommunityProfile2.a.c);
                        g2hVar.b = "avatar";
                        g2hVar.d = BuildConfig.FLAVOR;
                        g2hVar.a();
                    }
                } else if (i3 == R.id.vk_community_edit_avatar) {
                    o1iVar.f();
                } else if (i3 == R.id.vk_community_qr_open) {
                    o1iVar.o();
                } else if (i3 == R.id.vk_community_suggest) {
                    o1iVar.h();
                } else if (i3 == R.id.vk_community_report) {
                    o1iVar.p();
                } else if (i3 == R.id.vk_community_add_to_homescreen) {
                    o1iVar.e.c(o1iVar.c, CommunityAction.ADD_TO_HOMESCREEN);
                    o1iVar.d.a(hg1.m(new io.reactivex.rxjava3.internal.operators.observable.s0(new eqf(o1iVar, 1)).r0(asu0.a.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b()), o1iVar.q, 0L, false, 62).subscribe(new ga(new wzf(o1iVar, 6), 23)));
                } else if (i3 == R.id.vk_community_help) {
                    maz.c(((qdz) o1iVar.y.getValue()).e(), o1iVar.q, i5s.a(new StringBuilder("https://"), a0a.d, "/biz/articles?utm_source=vk_mainmenu"), LaunchContext.A, null, null, 24);
                } else if (i3 == R.id.vk_community_send_review_event) {
                    ?? r4 = o1iVar.v;
                    ((cwh) r4.getValue()).g = o1iVar.c.C2;
                    ((cwh) r4.getValue()).b();
                } else if (i3 == R.id.vk_community_write_message) {
                    zah zahVar = o1iVar.e;
                    MobileOfficialAppsSearchStat$TypeSearchClickItem.Action action3 = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SEND_MESSAGE_OUT;
                    SearchStatsLoggingInfo searchStatsLoggingInfo = zahVar.b;
                    if (searchStatsLoggingInfo != null) {
                        zahVar.a.a(action3, searchStatsLoggingInfo);
                    }
                    o0w b = g2v.c().b();
                    Context context2 = o1iVar.q;
                    ExtendedCommunityProfile extendedCommunityProfile3 = o1iVar.c;
                    b.t(context2, extendedCommunityProfile3.a.c.b, null, "community_page", "vkapp_profile_page");
                    p0e0.c(extendedCommunityProfile3.a.c, "community_page");
                } else if (i3 == R.id.vk_community_invite_friends) {
                    o1iVar.i();
                }
                view.postDelayed(new kv3(z1iVar, 6), context.getResources().getInteger(android.R.integer.config_shortAnimTime));
                return s3q0.a;
            case 4:
                swm0 swm0Var = (swm0) this.c;
                et9 et9Var = (et9) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1387980897, intValue, -1, "com.vk.donut.design.compose.banner.SubscribeCard.<anonymous> (DonutBanner.kt:592)");
                    }
                    com.vk.donut.design.compose.banner.c cVar = swm0Var.b;
                    if (cVar instanceof c.a) {
                        aVar.K(1688839913);
                        DonutBannerKt.p((c.a) cVar, et9Var, aVar, 0);
                        aVar.j();
                    } else {
                        if (!(cVar instanceof c.b)) {
                            throw alb0.c(-1885186032, aVar);
                        }
                        aVar.K(1689004523);
                        String str = ((c.b) cVar).a;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                        }
                        wuv0 wuv0Var = (wuv0) aVar.r(rrv0.c);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        frv0 frv0Var = wuv0Var.i0;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j = ylu0Var.getText().m;
                        q630.a aVar2 = q630.a.a;
                        boolean y = aVar.y(swm0Var);
                        Object x = aVar.x();
                        if (y || x == a.C0011a.a) {
                            x = new t3h(swm0Var, 11);
                            aVar.R(x);
                        }
                        yqv0.c(str, egi0.b(aVar2, false, (izs) x), j, null, null, 0, 0, null, 0, false, 0, 3, null, frv0Var, aVar, 0, 48, 6136);
                        aVar.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 5:
                izs izsVar2 = (izs) this.d;
                u710 u710Var = (u710) this.c;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(498255020, intValue2, -1, "com.vk.ecomm.market.good.linkedcontent.mvi2.ui.LinkedContentScreen.<anonymous> (MarketLinkedContentScreen.kt:198)");
                    }
                    j710.h(384, aVar3, izsVar2, ahn.E(q630.a.a, "mediaContentPanelHeader"), u710Var.e);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 6:
                km40 km40Var = (km40) this.c;
                fdj0 fdj0Var = (fdj0) this.d;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(714004872, intValue3, -1, "com.vk.musc.kidsmode.impl.MusicKidsModeOnboardingModal.Content.<anonymous> (MusicKidsModeOnboardingModal.kt:47)");
                    }
                    Mode mode = Mode.Card;
                    q630 E = ahn.E(q630.a.a, "MODAL_CONTENT");
                    boolean J = aVar4.J(km40Var);
                    Object x2 = aVar4.x();
                    if (J || x2 == a.C0011a.a) {
                        x2 = new obh(km40Var, 22);
                        aVar4.R(x2);
                    }
                    a030.b(mode, (gzs) x2, E, fdj0Var, null, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, false, null, false, null, null, false, null, null, kai.c(-1870617110, new rp7(km40Var, 3), aVar4), aVar4, 390, 100663296, 262128);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 7:
                ((Integer) obj2).getClass();
                n750.d(this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 8:
                izs izsVar3 = (izs) this.d;
                mtk0 mtk0Var = (mtk0) this.c;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar5.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-582699727, intValue4, -1, "com.vk.settings.impl.presentation.base.mvi.setting.NotificationSettingView.ContentSurface.<anonymous> (NotificationSettingView.kt:109)");
                    }
                    if (((String) mtk0Var.getValue()) != null) {
                        aVar5.K(1050289443);
                        String str2 = (String) mtk0Var.getValue();
                        boolean J2 = aVar5.J(izsVar3);
                        Object x3 = aVar5.x();
                        if (J2 || x3 == a.C0011a.a) {
                            x3 = new nse(izsVar3, 7);
                            aVar5.R(x3);
                        }
                        cg70.a(384, aVar5, str2, (gzs) x3, ahn.E(q630.a.a, "NotificationSettingAppbar"));
                    } else {
                        aVar5.K(1045950993);
                    }
                    aVar5.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
            case 9:
                d8d0 d8d0Var = (d8d0) this.c;
                xvy xvyVar = (xvy) this.d;
                ztm0 ztm0Var2 = (ztm0) obj;
                o6j o6jVar2 = (o6j) obj2;
                ta10 ta10Var = (ta10) j5g.a0(new wow(d8d0Var.v().a));
                Integer num = null;
                if (ta10Var != null) {
                    List<zo10> t1 = ztm0Var2.t1(NetworkClass.GOOD, new jai(-451657971, new ta8(4, d8d0Var, ta10Var), true));
                    arrayList = new ArrayList(c5g.u(t1, 10));
                    Iterator<T> it2 = t1.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((zo10) it2.next()).N(o6j.b(0, o6jVar2.a, 0, 0, 0, 11)));
                    }
                } else {
                    arrayList = null;
                }
                int i5 = 0;
                if (arrayList != null) {
                    Iterator it3 = arrayList.iterator();
                    if (it3.hasNext()) {
                        valueOf = Integer.valueOf(((tra0) it3.next()).c);
                        while (it3.hasNext()) {
                            Integer valueOf2 = Integer.valueOf(((tra0) it3.next()).c);
                            if (valueOf.compareTo(valueOf2) < 0) {
                                valueOf = valueOf2;
                            }
                        }
                    } else {
                        valueOf = null;
                    }
                    if (valueOf != null) {
                        i = valueOf.intValue();
                        qa10Var = (qa10) j5g.a0(new wow(d8d0Var.v().b));
                        if (qa10Var == null) {
                            List<zo10> t12 = ztm0Var2.t1("album", new jai(1339709233, new x7d(6, d8d0Var, qa10Var), true));
                            arrayList2 = new ArrayList(c5g.u(t12, 10));
                            Iterator<T> it4 = t12.iterator();
                            while (it4.hasNext()) {
                                arrayList2.add(((zo10) it4.next()).N(o6j.b(0, o6jVar2.a, 0, 0, 0, 11)));
                            }
                        } else {
                            arrayList2 = null;
                        }
                        if (arrayList2 != null) {
                            Iterator it5 = arrayList2.iterator();
                            if (it5.hasNext()) {
                                num = Integer.valueOf(((tra0) it5.next()).c);
                                while (it5.hasNext()) {
                                    Integer valueOf3 = Integer.valueOf(((tra0) it5.next()).c);
                                    if (num.compareTo(valueOf3) < 0) {
                                        num = valueOf3;
                                    }
                                }
                            }
                            if (num != null) {
                                i5 = num.intValue();
                            }
                        }
                        int max = Math.max(i, i5);
                        List<zo10> t13 = ztm0Var2.t1("real_content", new jai(336941189, new kw9(d8d0Var, ztm0Var2, max, xvyVar), true));
                        ArrayList arrayList3 = new ArrayList(c5g.u(t13, 10));
                        it = t13.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(((zo10) it.next()).N(o6jVar2.a));
                        }
                        return ztm0Var2.Q(o6j.i(o6jVar2.a), max, jgp.b, new bk30(arrayList3, 21));
                    }
                }
                i = 0;
                qa10Var = (qa10) j5g.a0(new wow(d8d0Var.v().b));
                if (qa10Var == null) {
                }
                if (arrayList2 != null) {
                }
                int max2 = Math.max(i, i5);
                List<zo10> t132 = ztm0Var2.t1("real_content", new jai(336941189, new kw9(d8d0Var, ztm0Var2, max2, xvyVar), true));
                ArrayList arrayList32 = new ArrayList(c5g.u(t132, 10));
                it = t132.iterator();
                while (it.hasNext()) {
                }
                return ztm0Var2.Q(o6j.i(o6jVar2.a), max2, jgp.b, new bk30(arrayList32, 21));
            case 10:
                ProductActionButton productActionButton = (ProductActionButton) this.c;
                com.vk.ecomm.market.good.ui.e eVar = (com.vk.ecomm.market.good.ui.e) this.d;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (aVar6.t(intValue5 & 1, (intValue5 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-82964260, intValue5, -1, "com.vk.ecomm.market.good.ui.ProductButtonsBinderImpl.bindButton.<anonymous> (ProductButtonsBinderImpl.kt:235)");
                    }
                    String obj3 = productActionButton.a.toString();
                    ButtonAppearance buttonAppearance = ButtonAppearance.Positive;
                    boolean y2 = aVar6.y(eVar);
                    Object x4 = aVar6.x();
                    if (y2 || x4 == a.C0011a.a) {
                        x4 = new c950(eVar, 21);
                        aVar6.R(x4);
                    }
                    bjd0.a(obj3, buttonAppearance, (gzs) x4, aVar6, 48);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                return s3q0.a;
            case 11:
                ((Integer) obj2).getClass();
                com.vk.profile.design.view.profileheader.b.m((UserProfileBaseInfoState.b) this.c, (izs) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 12:
                ((Integer) obj2).getClass();
                com.vk.libvideo.design.compose.base.datacontent.presets.b.k((VideoMetaViewState.h) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 13:
                ((Integer) obj2).getClass();
                x7u0.c((String) this.c, (SemanticsConfiguration) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 14:
                ((Integer) obj2).getClass();
                j3v0.a((Lifecycle) this.c, this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            default:
                ((Integer) obj2).getClass();
                ((VkTopBar.d) this.c).e((mtk0) this.d, (androidx.compose.runtime.a) obj, ne7.I(7));
                return s3q0.a;
        }
    }

    public /* synthetic */ yb1(int i, Object obj, izs izsVar) {
        this.b = i;
        this.d = izsVar;
        this.c = obj;
    }

    public /* synthetic */ yb1(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }
}
