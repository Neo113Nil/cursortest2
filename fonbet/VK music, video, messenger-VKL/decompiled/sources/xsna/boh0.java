package xsna;

import android.location.Location;
import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.api.generated.messages.dto.MessagesGetConversationsFilterDto;
import com.vk.dto.common.id.UserId;
import com.vk.repository.data.api.ExtendedProfilesRepository;
import com.vk.search.communities.map.api.domain.LocationCoordinate;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.subscription.api.SubscribeStatus;
import com.vk.toggle.features.ComFeatures;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vkontakte.android.data.groups.FullSourceJoinApi;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.a7f0;
import xsna.doh0;
import xsna.foh0;
import xsna.goh0;
import xsna.ynh0;

/* compiled from: SearchCommunitiesOnMapDetailsFeature.kt */
/* loaded from: classes5.dex */
public final class boh0 extends wk50<loh0, goh0, ynh0, doh0> {
    public final ExtendedProfilesRepository f;
    public final wqg g;
    public final bm01 h;
    public final woh0 i;
    public final vnh0 j;
    public final f4z k;
    public final Object l;
    public final j2r0 m;
    public final hsc0 n;

    public boh0(ynh0.e eVar, eoh0 eoh0Var, ExtendedProfilesRepository extendedProfilesRepository, wqg wqgVar, bm01 bm01Var, woh0 woh0Var, vnh0 vnh0Var) {
        super(eVar, eoh0Var);
        this.f = extendedProfilesRepository;
        this.g = wqgVar;
        this.h = bm01Var;
        this.i = woh0Var;
        this.j = vnh0Var;
        this.k = new f4z();
        this.l = msy.a(LazyThreadSafetyMode.NONE, new qc00(10));
        this.m = new j2r0();
        this.n = new hsc0(this, 8);
    }

    @Override // xsna.wk50
    public final void N(goh0 goh0Var, ynh0 ynh0Var) {
        xy2 n;
        ExtendedCommunityProfile.a aVar;
        String str;
        Location location;
        io.reactivex.rxjava3.internal.operators.single.y l;
        goh0 goh0Var2 = goh0Var;
        ynh0 ynh0Var2 = ynh0Var;
        boolean z = ynh0Var2 instanceof ynh0.e;
        woh0 woh0Var = this.i;
        Location location2 = null;
        if (z) {
            ynh0.e eVar = (ynh0.e) ynh0Var2;
            UserId userId = eVar.b;
            LocationCoordinate locationCoordinate = eVar.c;
            UserId e = fkq0.e(userId);
            if (locationCoordinate != null) {
                Location location3 = new Location((String) null);
                location3.setLatitude(locationCoordinate.b);
                location3.setLongitude(locationCoordinate.c);
                location = location3;
            } else {
                location = null;
            }
            io.reactivex.rxjava3.internal.operators.observable.j1 S0 = this.f.S0(new ExtendedProfilesRepository.a(e, this.n, new vr0(22), null, location, j5g.g0(e43.l(GroupsFieldsDto.PHOTO_AVG_COLOR, GroupsFieldsDto.ADDRESSES, GroupsFieldsDto.RATING), StringUtils.COMMA, null, null, 0, aoh0.b, 30), 784));
            this.g.getClass();
            ComFeatures comFeatures = ComFeatures.COM_CODEGEN_GROUPS_ADDRESSES;
            comFeatures.getClass();
            if (com.vk.toggle.b.A.a(comFeatures)) {
                l = rsg0.T(yfb.x(xqu.j(new zqu(), fkq0.a(userId), null, locationCoordinate != null ? Float.valueOf(locationCoordinate.b) : null, locationCoordinate != null ? Float.valueOf(locationCoordinate.c) : null, null, 1, null, 82))).K().l(new qa(new com.vk.movika.sdk.base.utils.b(17), 15));
            } else {
                opu opuVar = new opu(userId);
                opuVar.v = 1;
                if (locationCoordinate != null) {
                    Location location4 = new Location((String) null);
                    location4.setLatitude(locationCoordinate.b);
                    location4.setLongitude(locationCoordinate.c);
                    location2 = location4;
                }
                opuVar.F0(location2);
                l = rsg0.T(opuVar).K().l(new k7(new tb4(11), 10));
            }
            a7f0.a.e(this, io.reactivex.rxjava3.core.q.m(S0, l.w(), new utg0(new w61(eVar, 12), 1)), null, new znh0(1, this, boh0.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", 0), null, null, 13);
            woh0Var.getClass();
            a7f0.a.e(this, new io.reactivex.rxjava3.internal.operators.observable.i0(woh0Var.c.a(), new pi40(new r820(fkq0.e(userId), 23), 8)).U(new tr(new zsw(18), 22)), null, new ba40(this, 20), null, null, 13);
            return;
        }
        boolean equals = ynh0Var2.equals(ynh0.d.b);
        f4z f4zVar = this.k;
        if (equals) {
            f4zVar.b(foh0.b.a);
            return;
        }
        boolean equals2 = ynh0Var2.equals(ynh0.g.b);
        vnh0 vnh0Var = this.j;
        if (equals2) {
            if (goh0Var2 instanceof goh0.a) {
                ExtendedCommunityProfile extendedCommunityProfile = ((goh0.a) goh0Var2).b;
                vnh0Var.a(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SEND_MESSAGE_OUT);
                f4zVar.b(new foh0.e(bwd0.i(extendedCommunityProfile)));
                return;
            }
            return;
        }
        if (ynh0Var2.equals(ynh0.a.b)) {
            if (goh0Var2 instanceof goh0.a) {
                ExtendedCommunityProfile extendedCommunityProfile2 = ((goh0.a) goh0Var2).b;
                vnh0Var.a(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.CLICK_REVIEW);
                UserId i = bwd0.i(extendedCommunityProfile2);
                ExtendedCommunityProfile.d dVar = extendedCommunityProfile2.C2;
                f4zVar.b(new foh0.f(i, dVar != null ? dVar.a : null, dVar != null ? dVar.b : null));
                return;
            }
            return;
        }
        if (ynh0Var2.equals(ynh0.j.b)) {
            if (goh0Var2 instanceof goh0.a) {
                ExtendedCommunityProfile extendedCommunityProfile3 = ((goh0.a) goh0Var2).b;
                UserId i2 = bwd0.i(extendedCommunityProfile3);
                ExtendedCommunityProfile.d dVar2 = extendedCommunityProfile3.C2;
                f4zVar.b(new foh0.h(i2, dVar2 != null ? dVar2.a : null, dVar2 != null ? dVar2.b : null));
                return;
            }
            return;
        }
        if (ynh0Var2.equals(ynh0.i.b)) {
            if (goh0Var2 instanceof goh0.a) {
                ExtendedCommunityProfile extendedCommunityProfile4 = ((goh0.a) goh0Var2).b;
                vnh0Var.a(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.OPEN_OWNER_OUT);
                f4zVar.b(new foh0.g(bwd0.i(extendedCommunityProfile4), vnh0Var.a));
                return;
            }
            return;
        }
        if (ynh0Var2.equals(ynh0.b.b)) {
            if (goh0Var2 instanceof goh0.a) {
                ExtendedCommunityProfile extendedCommunityProfile5 = ((goh0.a) goh0Var2).b;
                vnh0Var.a(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SEND_MESSAGE_OUT);
                f4zVar.b(new foh0.c(bwd0.i(extendedCommunityProfile5), extendedCommunityProfile5.a.e));
                return;
            }
            return;
        }
        if (ynh0Var2.equals(ynh0.c.b)) {
            if (!(goh0Var2 instanceof goh0.a) || (aVar = ((goh0.a) goh0Var2).b.j2) == null || (str = aVar.a) == null) {
                return;
            }
            f4zVar.b(new foh0.d(str));
            return;
        }
        if (ynh0Var2.equals(ynh0.h.b)) {
            if (goh0Var2 instanceof goh0.a) {
                n = ((vg20) this.h.b).n((r19 & 1) != 0 ? null : null, 0, (r19 & 4) != 0 ? null : MessagesGetConversationsFilterDto.UNREAD, (r19 & 8) != 0 ? null : Boolean.TRUE, (r19 & 32) != 0 ? null : null, (r19 & 64) != 0 ? null : fkq0.e(bwd0.i(((goh0.a) goh0Var2).b)), (r19 & 8192) != 0 ? null : 2);
                a7f0.a.f(this, rsg0.W(yfb.x(n), 7).l(new he40(new uuz(24), 9)), new h630(this, 25), null, 5);
                return;
            }
            return;
        }
        if (!ynh0Var2.equals(ynh0.f.b)) {
            if (!ynh0Var2.equals(ynh0.k.b)) {
                throw new NoWhenBranchMatchedException();
            }
            if (goh0Var2 instanceof goh0.a) {
                goh0.a aVar2 = (goh0.a) goh0Var2;
                vnh0Var.a(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.BUILD_ROUTE_OUT);
                LocationCoordinate locationCoordinate2 = aVar2.d;
                if (locationCoordinate2 != null) {
                    f4zVar.b(new foh0.a(bwd0.i(aVar2.b), locationCoordinate2));
                    return;
                }
                return;
            }
            return;
        }
        if (goh0Var2 instanceof goh0.a) {
            goh0.a aVar3 = (goh0.a) goh0Var2;
            if (aVar3.e) {
                return;
            }
            T(doh0.c.b);
            ExtendedCommunityProfile extendedCommunityProfile6 = aVar3.b;
            SubscribeStatus.a aVar4 = SubscribeStatus.Companion;
            int i3 = extendedCommunityProfile6.a1;
            aVar4.getClass();
            SubscribeStatus b = SubscribeStatus.a.b(i3);
            if (SubscribeStatus.a.c(b) || b == SubscribeStatus.MEMBER_STATUS_SENT_REQUEST) {
                vnh0Var.a(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.LEAVE_GROUP_OUT);
            } else {
                vnh0Var.a(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.JOIN_GROUP_OUT);
            }
            UserId i4 = bwd0.i(extendedCommunityProfile6);
            int i5 = extendedCommunityProfile6.Z;
            int i6 = extendedCommunityProfile6.a0;
            skd skdVar = woh0Var.b;
            a7f0.a.f(this, new io.reactivex.rxjava3.internal.operators.single.o(rsg0.T(new j0y(fkq0.e(i4), false, (String) null, (String) null, (FullSourceJoinApi) null, 60)).K().l(new qca0(new voh0(woh0Var, b, i5, i6), 4)), new ljs(new eo6(woh0Var, i4, b, 6), 24)).o(b), new i0b0(this, 9), null, 5);
        }
    }
}
