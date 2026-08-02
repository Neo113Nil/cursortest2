package xsna;

import com.vk.api.generated.groups.dto.GroupsSetRecommendedTipCompleteChecklistTypeDto;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.checklist.impl.domain.model.CommunityCheckListTip;
import com.vk.log.L;
import com.vk.profile.user.api.di.UserProfileParamsComponent;
import com.vk.repository.data.api.ExtendedProfilesRepository;
import com.vk.stat.scheme.MobileOfficialAppsEcommStat$TypeAdminTipsChecklistClickItem;
import com.vk.stat.scheme.MobileOfficialAppsEcommStat$TypeAdminTipsClick;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import ru.ok.gl.tf.Tensorflow;
import xsna.a7f0;
import xsna.gzp0;
import xsna.mvg;
import xsna.owg;
import xsna.twg;

/* compiled from: CommunityCheckListFeature.kt */
/* loaded from: classes18.dex */
public final class yvg extends wk50<xwg, twg, mvg, owg> implements w8i {
    public final qwg f;
    public final fch g;
    public final UserId h;
    public final pvg i;
    public final mzp0 j;
    public final bpn0 k;
    public final f4z l;
    public final fzd0 m;
    public boolean n;

    /* compiled from: CommunityCheckListFeature.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CommunityCheckListTip.Type.values().length];
            try {
                iArr[CommunityCheckListTip.Type.LOAD_AVATAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommunityCheckListTip.Type.DESCRIPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CommunityCheckListTip.Type.SHORT_URL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CommunityCheckListTip.Type.ACTION_BUTTON.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CommunityCheckListTip.Type.MARKET_ITEM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CommunityCheckListTip.Type.MAKE_POST.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CommunityCheckListTip.Type.COVER_IMAGE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CommunityCheckListTip.Type.SUBSCRIBE_VK_NEWS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CommunityCheckListTip.Type.INVITE_FRIENDS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[CommunityCheckListTip.Type.ADS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public yvg(pwg pwgVar, qwg qwgVar, fch fchVar, UserId userId, htq0 htq0Var, pvg pvgVar, mzp0 mzp0Var, mvg.c cVar) {
        super(cVar, pwgVar);
        this.f = qwgVar;
        this.g = fchVar;
        this.h = userId;
        this.i = pvgVar;
        this.j = mzp0Var;
        this.k = new bpn0(new com.vk.movika.sdk.base.model.e(this, 24));
        this.l = new f4z();
        qmq0 qmq0Var = new qmq0(htq0Var);
        UserProfileParamsComponent userProfileParamsComponent = (UserProfileParamsComponent) ((k7m) m7m.f(this)).b(fpf0.a(UserProfileParamsComponent.class), qmq0Var);
        userProfileParamsComponent.aa().b(userId);
        this.m = userProfileParamsComponent.P3();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c4  */
    @Override // xsna.wk50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N(twg twgVar, mvg mvgVar) {
        GroupsSetRecommendedTipCompleteChecklistTypeDto groupsSetRecommendedTipCompleteChecklistTypeDto;
        MobileOfficialAppsEcommStat$TypeAdminTipsChecklistClickItem.ChecklistType checklistType;
        mvg.d bVar;
        mvg.d gVar;
        CommunityCheckListTip.Type type;
        twg twgVar2 = twgVar;
        mvg mvgVar2 = mvgVar;
        UserId userId = twgVar2.i;
        boolean z = mvgVar2 instanceof mvg.c;
        pvg pvgVar = this.i;
        Object obj = null;
        if (z) {
            pvgVar.getClass();
            hu20 hu20Var = new hu20();
            UserId userId2 = this.h;
            gzp0.a.c(new MobileOfficialAppsEcommStat$TypeAdminTipsClick(MobileOfficialAppsEcommStat$TypeAdminTipsClick.Type.TYPE_ADMIN_TIPS_CHECKLIST_MAIN_CLICK, userId2.b, null, hu20Var, 4, null));
            String str = ((mvg.c) mvgVar2).b;
            if (str != null) {
                switch (str.hashCode()) {
                    case -2027693268:
                        if (str.equals("short_url")) {
                            type = CommunityCheckListTip.Type.SHORT_URL;
                            break;
                        }
                        for (CommunityCheckListTip.Type type2 : CommunityCheckListTip.Type.values()) {
                            String name = type2.name();
                            Locale locale = Locale.ROOT;
                            if (name.toLowerCase(locale).equals(str.toLowerCase(locale))) {
                                type = type2;
                                break;
                            }
                        }
                        break;
                    case -1724546052:
                        if (str.equals("description")) {
                            type = CommunityCheckListTip.Type.DESCRIPTION;
                            break;
                        }
                        while (r5 < r4) {
                        }
                        break;
                    case -1147692044:
                        if (str.equals(RTCStatsConstants.KEY_ADDRESS)) {
                            type = CommunityCheckListTip.Type.ADDRESS;
                            break;
                        }
                        while (r5 < r4) {
                        }
                        break;
                    case -874919214:
                        if (str.equals("load_avatar")) {
                            type = CommunityCheckListTip.Type.LOAD_AVATAR;
                            break;
                        }
                        while (r5 < r4) {
                        }
                        break;
                    case 96432:
                        if (str.equals(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS)) {
                            type = CommunityCheckListTip.Type.ADS;
                            break;
                        }
                        while (r5 < r4) {
                        }
                        break;
                    case 172522195:
                        if (str.equals("cover_image")) {
                            type = CommunityCheckListTip.Type.COVER_IMAGE;
                            break;
                        }
                        while (r5 < r4) {
                        }
                        break;
                    case 285140278:
                        if (str.equals("market_item")) {
                            type = CommunityCheckListTip.Type.MARKET_ITEM;
                            break;
                        }
                        while (r5 < r4) {
                        }
                        break;
                    case 1054367067:
                        if (str.equals("action_button")) {
                            type = CommunityCheckListTip.Type.ACTION_BUTTON;
                            break;
                        }
                        while (r5 < r4) {
                        }
                        break;
                    case 1266208849:
                        if (str.equals("make_post")) {
                            type = CommunityCheckListTip.Type.MAKE_POST;
                            break;
                        }
                        while (r5 < r4) {
                        }
                        break;
                    case 1460012639:
                        if (str.equals("invite_friends")) {
                            type = CommunityCheckListTip.Type.INVITE_FRIENDS;
                            break;
                        }
                        while (r5 < r4) {
                        }
                        break;
                    default:
                        while (r5 < r4) {
                        }
                        break;
                }
                U(false, type);
                fch fchVar = this.g;
                a7f0.a.f(this, rsg0.w0(yfb.x(((zqu) fchVar.b).p(fkq0.a(userId2), 13))).l(new v20(new omf(fchVar, 3), 15)), new hy0(1, this, yvg.class, "onSuccessLoadBanner", "onSuccessLoadBanner(Lcom/vk/ecomm/checklist/impl/domain/model/CommunityCheckListPartnerBanner;)V", 0, 1), null, 1);
                return;
            }
            type = null;
            U(false, type);
            fch fchVar2 = this.g;
            a7f0.a.f(this, rsg0.w0(yfb.x(((zqu) fchVar2.b).p(fkq0.a(userId2), 13))).l(new v20(new omf(fchVar2, 3), 15)), new hy0(1, this, yvg.class, "onSuccessLoadBanner", "onSuccessLoadBanner(Lcom/vk/ecomm/checklist/impl/domain/model/CommunityCheckListPartnerBanner;)V", 0, 1), null, 1);
            return;
        }
        boolean z2 = mvgVar2 instanceof mvg.i;
        bpn0 bpn0Var = this.k;
        if (!z2) {
            if (!(mvgVar2 instanceof mvg.b)) {
                if (mvgVar2 instanceof mvg.f) {
                    U(true, null);
                    return;
                }
                if (mvgVar2 instanceof mvg.a) {
                    mvg.a aVar = (mvg.a) mvgVar2;
                    fzd0.b(this.m, aVar.b, aVar.c, aVar.d, new zvg(this), null, null, 112);
                    return;
                }
                if (mvgVar2 instanceof mvg.h) {
                    U(false, null);
                    return;
                }
                if (mvgVar2 instanceof mvg.g) {
                    if (this.n) {
                        U(false, null);
                    }
                    this.n = false;
                    return;
                } else {
                    if (!(mvgVar2 instanceof mvg.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((mwg) bpn0Var.getValue()).a(new mvg.d.k(((mvg.e) mvgVar2).b));
                    return;
                }
            }
            mvg.b bVar2 = (mvg.b) mvgVar2;
            CommunityCheckListTip.Type type3 = bVar2.b;
            if (type3 == CommunityCheckListTip.Type.SUBSCRIBE_VK_NEWS) {
                ((mwg) bpn0Var.getValue()).a(new mvg.d.i(bVar2.c));
            }
            T(new owg.a.b(false));
            qwg qwgVar = this.f;
            zqu zquVar = qwgVar.a;
            UserId a2 = fkq0.a(userId);
            switch (rwg.$EnumSwitchMapping$0[type3.ordinal()]) {
                case 1:
                    groupsSetRecommendedTipCompleteChecklistTypeDto = GroupsSetRecommendedTipCompleteChecklistTypeDto.LOAD_AVATAR;
                    break;
                case 2:
                    groupsSetRecommendedTipCompleteChecklistTypeDto = GroupsSetRecommendedTipCompleteChecklistTypeDto.DESCRIPTION;
                    break;
                case 3:
                    groupsSetRecommendedTipCompleteChecklistTypeDto = GroupsSetRecommendedTipCompleteChecklistTypeDto.SHORT_URL;
                    break;
                case 4:
                    groupsSetRecommendedTipCompleteChecklistTypeDto = GroupsSetRecommendedTipCompleteChecklistTypeDto.ADDRESS;
                    break;
                case 5:
                    groupsSetRecommendedTipCompleteChecklistTypeDto = GroupsSetRecommendedTipCompleteChecklistTypeDto.ACTION_BUTTON;
                    break;
                case 6:
                    groupsSetRecommendedTipCompleteChecklistTypeDto = GroupsSetRecommendedTipCompleteChecklistTypeDto.MARKET_ITEM;
                    break;
                case 7:
                    groupsSetRecommendedTipCompleteChecklistTypeDto = GroupsSetRecommendedTipCompleteChecklistTypeDto.MAKE_POST;
                    break;
                case 8:
                    groupsSetRecommendedTipCompleteChecklistTypeDto = GroupsSetRecommendedTipCompleteChecklistTypeDto.COVER_IMAGE;
                    break;
                case 9:
                    groupsSetRecommendedTipCompleteChecklistTypeDto = GroupsSetRecommendedTipCompleteChecklistTypeDto.SUBSCRIBE_VK_NEWS;
                    break;
                case 10:
                    groupsSetRecommendedTipCompleteChecklistTypeDto = GroupsSetRecommendedTipCompleteChecklistTypeDto.INVITE_FRIENDS;
                    break;
                case 11:
                    groupsSetRecommendedTipCompleteChecklistTypeDto = GroupsSetRecommendedTipCompleteChecklistTypeDto.ADS;
                    break;
                case 12:
                    groupsSetRecommendedTipCompleteChecklistTypeDto = GroupsSetRecommendedTipCompleteChecklistTypeDto.VKCONNECT;
                    break;
                default:
                    throw new IllegalArgumentException("Unknown tip type");
            }
            zquVar.getClass();
            tfx tfxVar = new tfx("groups.setRecommendedTipComplete", new wr(20), new xr(19));
            tfx.n(tfxVar, "group_id", a2, 1L, 0L, 8);
            tfx.o(tfxVar, "checklist_type", groupsSetRecommendedTipCompleteChecklistTypeDto.i(), 0, 0, 12);
            a7f0.a.f(this, new io.reactivex.rxjava3.internal.operators.single.r(rsg0.w0(yfb.x(tfxVar)), new qs6(new h1(7, qwgVar, userId), 7)), new g15(1, this, yvg.class, "onSuccessLoadCheckList", "onSuccessLoadCheckList(Lcom/vk/ecomm/checklist/impl/domain/model/CommunityCheckList;)V", 0, 4), new a2a(1, this, yvg.class, "onFailLoadCheckList", "onFailLoadCheckList(Ljava/lang/Throwable;)V", 0, 2), 1);
            return;
        }
        List<svg> list = twgVar2.d;
        CommunityCheckListTip.Type type4 = ((mvg.i) mvgVar2).b;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            g5g.y(((svg) it.next()).c, arrayList);
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((CommunityCheckListTip) next).d == type4) {
                obj = next;
                break;
            }
        }
        CommunityCheckListTip communityCheckListTip = (CommunityCheckListTip) obj;
        if (communityCheckListTip != null) {
            twg.a aVar2 = twgVar2.f;
            CommunityCheckListTip.Type type5 = communityCheckListTip.d;
            String str2 = communityCheckListTip.c;
            String str3 = communityCheckListTip.b;
            pvgVar.getClass();
            long j = fkq0.a(userId).b;
            switch (rvg.$EnumSwitchMapping$0[type5.ordinal()]) {
                case 1:
                    checklistType = MobileOfficialAppsEcommStat$TypeAdminTipsChecklistClickItem.ChecklistType.LOAD_AVATAR;
                    break;
                case 2:
                    checklistType = MobileOfficialAppsEcommStat$TypeAdminTipsChecklistClickItem.ChecklistType.DESCRIPTION;
                    break;
                case 3:
                    checklistType = MobileOfficialAppsEcommStat$TypeAdminTipsChecklistClickItem.ChecklistType.SHORT_URL;
                    break;
                case 4:
                    checklistType = MobileOfficialAppsEcommStat$TypeAdminTipsChecklistClickItem.ChecklistType.ADDRESS;
                    break;
                case 5:
                    checklistType = MobileOfficialAppsEcommStat$TypeAdminTipsChecklistClickItem.ChecklistType.ACTION_BUTTON;
                    break;
                case 6:
                    checklistType = MobileOfficialAppsEcommStat$TypeAdminTipsChecklistClickItem.ChecklistType.MARKET_ITEM;
                    break;
                case 7:
                    checklistType = MobileOfficialAppsEcommStat$TypeAdminTipsChecklistClickItem.ChecklistType.MAKE_POST;
                    break;
                case 8:
                    checklistType = MobileOfficialAppsEcommStat$TypeAdminTipsChecklistClickItem.ChecklistType.COVER_IMAGE;
                    break;
                case 9:
                    checklistType = MobileOfficialAppsEcommStat$TypeAdminTipsChecklistClickItem.ChecklistType.SUBSCRIBE_VK_NEWS;
                    break;
                case 10:
                    checklistType = MobileOfficialAppsEcommStat$TypeAdminTipsChecklistClickItem.ChecklistType.INVITE_FRIENDS;
                    break;
                case 11:
                    checklistType = MobileOfficialAppsEcommStat$TypeAdminTipsChecklistClickItem.ChecklistType.ADS;
                    break;
                case 12:
                    checklistType = MobileOfficialAppsEcommStat$TypeAdminTipsChecklistClickItem.ChecklistType.VKCONNECT;
                    break;
                case 13:
                    throw new IllegalArgumentException("Unknown type for analytics");
                default:
                    throw new NoWhenBranchMatchedException();
            }
            gzp0.a.c(new MobileOfficialAppsEcommStat$TypeAdminTipsClick(MobileOfficialAppsEcommStat$TypeAdminTipsClick.Type.TYPE_ADMIN_TIPS_CHECKLIST_CLICK, j, new MobileOfficialAppsEcommStat$TypeAdminTipsChecklistClickItem(checklistType), null, 8, null));
            switch (a.$EnumSwitchMapping$0[type5.ordinal()]) {
                case 1:
                    bVar = new mvg.d.b(userId);
                    break;
                case 2:
                    gVar = new mvg.d.g(userId, aVar2.a);
                    bVar = gVar;
                    break;
                case 3:
                    gVar = new mvg.d.h(userId, aVar2.b);
                    bVar = gVar;
                    break;
                case 4:
                    this.n = true;
                    bVar = new mvg.d.a(userId);
                    break;
                case 5:
                    this.n = true;
                    if (str3.length() == 0) {
                        L.i(new IllegalArgumentException("Mini app link for " + type5 + " is empty"));
                        bVar = mvg.d.l.a;
                        break;
                    } else {
                        bVar = new mvg.d.e(str3);
                        break;
                    }
                case 6:
                    this.n = true;
                    bVar = new mvg.d.C3375d(userId);
                    break;
                case 7:
                    this.n = true;
                    bVar = new mvg.d.c(userId);
                    break;
                case 8:
                    if (str2.length() == 0) {
                        L.i(new IllegalArgumentException("Internal link for " + type5 + " is empty"));
                        bVar = mvg.d.l.a;
                        break;
                    } else {
                        bVar = new mvg.d.m(type5, str2);
                        break;
                    }
                case 9:
                    this.n = true;
                    bVar = new mvg.d.j(userId);
                    break;
                case 10:
                    if (str3.length() == 0) {
                        L.i(new IllegalArgumentException("Mini app link for " + type5 + " is empty"));
                        bVar = mvg.d.l.a;
                        break;
                    } else {
                        bVar = new mvg.d.f(str3);
                        break;
                    }
                default:
                    L.l("Unsupported tip type=" + type5);
                    bVar = mvg.d.l.a;
                    break;
            }
            ((mwg) bpn0Var.getValue()).a(bVar);
        }
    }

    public final void U(boolean z, CommunityCheckListTip.Type type) {
        UserId userId = this.h;
        if (!fkq0.c(userId)) {
            L.i(new IllegalStateException("groupId is invalid"));
            T(new owg.a.C3476a());
            return;
        }
        T(new owg.a.b(z));
        int i = 15;
        io.reactivex.rxjava3.internal.operators.single.l h = new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.n(this.f.a(userId), new eu0(new mmf(this, 4), 13)), new fu0(new fre(this, 8), i)).h(new h60(new nhe(this, 3), i));
        ExtendedUserProfile L0 = t6g0.c().L0(userId);
        ExtendedCommunityProfile extendedCommunityProfile = L0 instanceof ExtendedCommunityProfile ? (ExtendedCommunityProfile) L0 : null;
        a7f0.a.f(this, io.reactivex.rxjava3.core.x.B(h, new io.reactivex.rxjava3.internal.operators.single.d0((extendedCommunityProfile != null ? io.reactivex.rxjava3.core.x.k(extendedCommunityProfile) : t6g0.c().S0(new ExtendedProfilesRepository.a(userId, new ur0(14), new vr0(22), ExtendedProfilesRepository.LoadStrategy.CACHE_FIRST, null, null, Tensorflow.FRAME_HEIGHT)).K().l(new y34(new sc(13), 14))).l(new q7(new t1e(this, 6), 12)), new vp(9), null), new bl(new mz1(5, this, type), 16)), new v7(19), new db(25), 1);
    }
}
