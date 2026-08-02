package defpackage;

import android.content.Context;
import android.view.MenuItem;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.sdk.auth.a;
import com.vk.censoredsettings.presentation.obscenetext.a;
import com.vk.censoredsettings.presentation.obscenetext.c;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.attaches.AttachWithDownload;
import com.vk.friends.groupinvite.api.domain.InviteFriendsAnalytics;
import com.vk.im.channelcreation.impl.d;
import com.vk.menu.presentation.entity.TabMenuItemUiData;
import com.vk.newsfeed.posting.privacy_picker.presentation.PrivacyViewState;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.onboarding.api.dto.VkOnboardingType;
import com.vk.photos.root.photoflow.presentation.a;
import com.vk.search.params.impl.presentation.modal.education.mvi.model.a;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsImStat$TypeImConversationsBannerItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonInvalidParams;
import com.vk.superapp.base.js.bridge.Responses$ReasonUnknownError;
import com.vk.superapp.base.js.bridge.VkUiView;
import com.vk.superapp.common.js.bridge.api.events.RetargetingPixel$Parameters;
import com.vk.toggle.b;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.ui.bottomnavigation.BottomNavigationView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.b68;
import xsna.bpn0;
import xsna.bsp;
import xsna.c5g;
import xsna.c8p;
import xsna.cc20;
import xsna.cqa0;
import xsna.cw30;
import xsna.d0u0;
import xsna.d8p0;
import xsna.dgm;
import xsna.dw20;
import xsna.e8v0;
import xsna.fdl;
import xsna.fkq0;
import xsna.g9g0;
import xsna.gzs;
import xsna.iid0;
import xsna.ilq;
import xsna.izs;
import xsna.j58;
import xsna.j5g;
import xsna.jbs;
import xsna.jd0;
import xsna.jlf;
import xsna.jzg;
import xsna.k6k;
import xsna.ll1;
import xsna.lvv0;
import xsna.lyd0;
import xsna.mo60;
import xsna.mtk0;
import xsna.mue;
import xsna.mz80;
import xsna.nue;
import xsna.nx50;
import xsna.nyd0;
import xsna.oa70;
import xsna.p3y;
import xsna.q0j0;
import xsna.q7v0;
import xsna.qrn;
import xsna.rh90;
import xsna.rrn;
import xsna.s3q0;
import xsna.s44;
import xsna.svp;
import xsna.t770;
import xsna.tk40;
import xsna.ugf;
import xsna.usi0;
import xsna.uu20;
import xsna.w58;
import xsna.wed0;
import xsna.wls;
import xsna.wow;
import xsna.x6p0;
import xsna.xls;
import xsna.xwv0;
import xsna.xz3;
import xsna.yrb0;
import xsna.yrm;
import xsna.yrp;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class u implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ u(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v86, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        nyd0.d f;
        VkUiView view;
        izs<lvv0, s3q0> ke;
        w58 menuView;
        int i = this.b;
        j58 j58Var = null;
        boolean z = true;
        int i2 = 0;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                RetargetingPixel$Parameters retargetingPixel$Parameters = (RetargetingPixel$Parameters) obj;
                cqa0 cqa0Var = (cqa0) ((l0) obj2).n.getValue();
                svp svpVar = cqa0Var.c;
                xwv0 xwv0Var = (xwv0) cqa0Var.a.invoke();
                if ((xwv0Var != null ? xwv0Var.getView() : null) == null) {
                    svpVar.n(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNKNOWN_ERROR, null, new Responses$ReasonUnknownError(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131064, null), retargetingPixel$Parameters.j(), 1, null));
                } else {
                    try {
                        xwv0Var.X(cqa0Var.a(retargetingPixel$Parameters).subscribe(new cc20(new mz80(4, cqa0Var, retargetingPixel$Parameters), 14), new tk40(new ll1(20, cqa0Var, retargetingPixel$Parameters), 8)));
                    } catch (Throwable unused) {
                        svpVar.n(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), retargetingPixel$Parameters.j(), 1, null));
                    }
                }
                break;
            case 1:
                ((izs) obj2).invoke((jd0) obj);
                break;
            case 2:
                ((izs) obj2).invoke(new q0j0.a.c(((s44) obj).a));
                break;
            case 3:
                break;
            case 4:
                ((d) obj2).b.k().z((jbs) obj, 1);
                break;
            case 5:
                break;
            case 6:
                ((izs) obj2).invoke(new nue.d(((mue.a) obj).a));
                break;
            case 7:
                q7v0 q7v0Var = (q7v0) obj2;
                jlf jlfVar = (jlf) obj;
                VkOnboardingCampaign e = q7v0Var.e("clips:attached_video");
                if (e != null) {
                    q7v0Var.a(e, VkOnboardingType.Banner, e8v0.g.b);
                }
                jlfVar.e(new ugf.h.j(false));
                break;
            case 8:
                jzg jzgVar = (jzg) obj2;
                jzgVar.b.a((Context) obj, jzgVar.c.c(), fkq0.e(jzgVar.a), InviteFriendsAnalytics.InviteFriendsSource.MAIN, false);
                break;
            case 9:
                lyd0 lyd0Var = (lyd0) obj2;
                izs izsVar = (izs) obj;
                if (lyd0Var != null && (f = lyd0Var.f()) != null) {
                    f.d(true);
                }
                izsVar.invoke(0);
                break;
            case 10:
                uu20 uu20Var = (uu20) obj;
                ((izs) obj2).invoke(uu20.a(uu20Var, null, null, null, null, new wow(j5g.v0(new rh90(0), uu20Var.e)), 15));
                break;
            case 11:
                fdl fdlVar = (fdl) obj;
                StringBuilder sb = new StringBuilder("DefaultCredentialsChangeListener: Refresh completed for userIds - ");
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((a) it.next()).a);
                }
                sb.append(arrayList);
                sb.append(", current sessions - ");
                ArrayList e2 = fdlVar.a.e();
                ArrayList arrayList2 = new ArrayList(c5g.u(e2, 10));
                Iterator it2 = e2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((usi0.a) it2.next()).c().a);
                }
                sb.append(arrayList2);
                break;
            case 12:
                ((yrm) obj2).b.d().r((Context) obj);
                break;
            case 13:
                rrn rrnVar = (rrn) obj2;
                float f2 = rrnVar.h / 2.0f;
                bpn0 bpn0Var = rrn.i;
                d0u0.a(rrnVar.b.animate().setInterpolator(new AccelerateDecelerateInterpolator()).setStartDelay(0L).setDuration(600L).translationX(f2 - rrn.a.a()).setUpdateListener(new qrn(rrnVar, i2)), (k6k) obj).start();
                break;
            case 14:
                c8p c8pVar = (c8p) obj;
                c8p.b bVar = c8p.n1;
                dw20 dw20Var = (dw20) ((Ref$ObjectRef) obj2).element;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                c8pVar.getFeature().C(a.f.b);
                break;
            case 15:
                bsp bspVar = (bsp) obj2;
                String str = (String) obj;
                yrp yrpVar = bspVar.b;
                if (yrpVar == null) {
                    Enum[] enumArr = bspVar.a;
                    yrpVar = new yrp(str, enumArr.length);
                    for (Enum r0 : enumArr) {
                        yrpVar.j(r0.name(), false);
                    }
                    break;
                }
                break;
            case 16:
                xls xlsVar = (xls) obj2;
                String str2 = xlsVar.b.b;
                iid0 iid0Var = new iid0();
                UiTracker uiTracker = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                SchemeStat$TypeAction b = SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsImStat$TypeImConversationsBannerItem(str2, MobileOfficialAppsImStat$TypeImConversationsBannerItem.EventType.HIDE, null), 3);
                iid0Var.f = c;
                iid0Var.g = b;
                iid0Var.q();
                ((wls) obj).l.a(xlsVar.b);
                break;
            case 17:
                lvv0.c cVar = (lvv0.c) obj;
                xwv0 xwv0Var2 = ((p3y) obj2).d;
                if (xwv0Var2 != null && (view = xwv0Var2.getView()) != null && (ke = view.ke()) != null) {
                    ke.invoke(cVar);
                }
                break;
            case 18:
                break;
            case 19:
                x6p0 x6p0Var = (x6p0) obj2;
                if (!((d8p0) ((mtk0) obj).getValue()).c && x6p0Var.b() >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    z = false;
                }
                break;
            case 20:
                break;
            case 21:
                com.vk.im.ui.components.msg_list.a aVar = (com.vk.im.ui.components.msg_list.a) obj;
                Iterator it3 = ((List) obj2).iterator();
                while (it3.hasNext()) {
                    aVar.f1((AttachWithDownload) it3.next());
                }
                break;
            case 22:
                cw30 cw30Var = (cw30) obj2;
                cw30Var.b.animate().alpha(1.0f).translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).scaleX(1.0f).scaleY(1.0f).setDuration(cw30Var.c).setInterpolator(new ilq()).withEndAction(new xz3(2, cw30Var, (dgm) obj)).start();
                break;
            case 23:
                nx50 nx50Var = (nx50) obj2;
                ?? r1 = nx50Var.m0;
                int itemId = ((MenuItem) obj).getItemId();
                TabMenuItemUiData tabMenuItemUiData = TabMenuItemUiData.IM;
                if (itemId == tabMenuItemUiData.h() && b.A.a(ImFeatures.READ_ALL_IN_ALL) && ((g9g0) r1.getValue()).b()) {
                    int c0 = j5g.c0(b68.b.g(), Integer.valueOf(tabMenuItemUiData.h()));
                    BottomNavigationView bottomNavigationView = nx50Var.z;
                    if (bottomNavigationView != null && (menuView = bottomNavigationView.getMenuView()) != null) {
                        try {
                            j58Var = menuView.g[c0];
                        } catch (IndexOutOfBoundsException unused2) {
                        }
                    }
                    if (j58Var != null) {
                        ((g9g0) r1.getValue()).e(nx50Var.b, j58Var);
                    }
                }
                break;
            case 24:
                mo60 mo60Var = (mo60) obj2;
                break;
            case 25:
                ((izs) obj2).invoke(oa70.a.b);
                ((t770) obj).getClass();
                break;
            case 26:
                ((com.vk.censoredsettings.presentation.obscenetext.b) obj2).T(new c.b(((a.b) obj).b));
                break;
            case 27:
                ((com.vk.photos.root.photoflow.presentation.b) obj2).C(new a.g.e((List) obj));
                break;
            case 28:
                ((izs) obj2).invoke((yrb0) obj);
                break;
            default:
                ((izs) obj2).invoke(new wed0.i(((PrivacyViewState.a.b) obj).a));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ u(yrm yrmVar, Context context, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen) {
        this.b = 12;
        this.c = yrmVar;
        this.d = context;
    }
}
