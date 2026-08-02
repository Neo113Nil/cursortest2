package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseCityDto;
import com.vk.api.generated.base.dto.BaseCountryDto;
import com.vk.api.generated.base.dto.BaseSexDto;
import com.vk.api.generated.friends.dto.FriendsFriendStatusStatusDto;
import com.vk.api.generated.friends.dto.FriendsGetRecommendationsResponseDto;
import com.vk.api.generated.friends.dto.FriendsUserRecommendationsDto;
import com.vk.api.generated.status.dto.StatusImageStatusDto;
import com.vk.api.generated.users.dto.UsersOccupationDto;
import com.vk.dto.common.EntitySyncState;
import com.vk.dto.common.OccupationType;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.user.ImageStatus;
import com.vk.dto.user.OnlineInfo;
import com.vk.dto.user.SocialButtonType;
import com.vk.dto.user.UserSex;
import com.vk.dto.user.VisibleStatus;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.users.User;
import com.vk.im.engine.models.users.UserDeactivationStatus;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.g1e0;

/* compiled from: FriendsRecommendationsGetCmd.kt */
/* loaded from: classes2.dex */
public final class zrs extends le6<rts> {
    public final List<Source> b;
    public final boolean c;
    public final MobileOfficialAppsCoreNavStat$EventScreen d;

    public zrs(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, List list, boolean z) {
        this.b = list;
        this.c = z;
        this.d = mobileOfficialAppsCoreNavStat$EventScreen;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("No sources are specified");
        }
    }

    @Override // xsna.le6
    public final rts e(w2w w2wVar) {
        rts f;
        w2wVar.getConfig().getClass();
        List<Source> list = this.b;
        boolean z = false;
        if (p4g.c(list, Source.CACHE)) {
            f = f(w2wVar);
        } else if (p4g.c(list, Source.ACTUAL)) {
            f = f(w2wVar);
            EntitySyncState entitySyncState = f.b;
            entitySyncState.getClass();
            if (entitySyncState == EntitySyncState.MISSED || entitySyncState == EntitySyncState.EXPIRED) {
                f = g(w2wVar);
                z = true;
            }
        } else {
            if (p4g.c(list, Source.NETWORK)) {
                f = g(w2wVar);
            } else {
                f = f(w2wVar);
                EntitySyncState entitySyncState2 = f.b;
                entitySyncState2.getClass();
                if (entitySyncState2 == EntitySyncState.MISSED) {
                    f = g(w2wVar);
                }
            }
            z = true;
        }
        long j = f.c;
        List<qtd0> list2 = f.a;
        if (z) {
            x1r0 d = w2wVar.I0().d();
            List<qtd0> list3 = list2;
            ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(((qtd0) it.next()).B7());
            }
            d.h(j, arrayList);
            new h1e0(new ProfilesSimpleInfo(list2), j, true).o(w2wVar);
            w2wVar.e1(this, new f680());
        }
        return f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zrs)) {
            return false;
        }
        zrs zrsVar = (zrs) obj;
        return epx.f(this.b, zrsVar.b) && this.c == zrsVar.c && this.d == zrsVar.d;
    }

    public final rts f(w2w w2wVar) {
        ArrayList q = w2wVar.I0().d().q();
        Long p = w2wVar.I0().d().p();
        if (q == null || p == null) {
            return new rts(EmptyList.b, EntitySyncState.MISSED, 0L);
        }
        g1e0.a aVar = new g1e0.a();
        aVar.a.e(new f1e0(q));
        aVar.b = Source.CACHE;
        ProfilesInfo profilesInfo = (ProfilesInfo) w2wVar.L0(this, new d1e0(new g1e0(aVar)));
        ArrayList arrayList = new ArrayList();
        Iterator it = q.iterator();
        while (it.hasNext()) {
            qtd0 Bb = profilesInfo.Bb((Peer) it.next());
            if (Bb != null) {
                arrayList.add(Bb);
            }
        }
        return profilesInfo.Fb() ? new rts(EmptyList.b, EntitySyncState.MISSED, p.longValue()) : profilesInfo.Eb() ? new rts(arrayList, EntitySyncState.EXPIRED, p.longValue()) : new rts(arrayList, EntitySyncState.ACTUAL, p.longValue());
    }

    public final rts g(w2w w2wVar) {
        ImageStatus imageStatus;
        String f;
        Integer e;
        String title;
        String title2;
        List<FriendsUserRecommendationsDto> e2 = ((FriendsGetRecommendationsResponseDto) bz2.c(bz2.n(nts.i(new ots(), 5, ky2.f, com.vk.stat.scheme.t0.a(this.d), null, null, null, null, 3962), new cvh(this, 7)), "FriendsRecommendationsGetCmd.friendsGetRecommendations")).e();
        ArrayList arrayList = new ArrayList(c5g.u(e2, 10));
        for (FriendsUserRecommendationsDto friendsUserRecommendationsDto : e2) {
            Object obj = jgq0.a;
            String d = friendsUserRecommendationsDto.d();
            if (d == null) {
                d = "";
            }
            int[] b = jgq0.b(d);
            long j = friendsUserRecommendationsDto.l0().b;
            Long valueOf = friendsUserRecommendationsDto.p() != null ? Long.valueOf(r6.intValue()) : null;
            String u = friendsUserRecommendationsDto.u();
            String K = friendsUserRecommendationsDto.K();
            String str = K == null ? "" : K;
            UserSex.a aVar = UserSex.Companion;
            BaseSexDto s1 = friendsUserRecommendationsDto.s1();
            Integer valueOf2 = s1 != null ? Integer.valueOf(s1.i()) : null;
            aVar.getClass();
            UserSex a = UserSex.a.a(valueOf2);
            ImageList imageList = new ImageList(null, 1, null);
            String d1 = friendsUserRecommendationsDto.d1();
            if (d1 != null) {
                imageList.zb(new Image(50, 50, d1, false));
            }
            String U0 = friendsUserRecommendationsDto.U0();
            if (U0 != null) {
                imageList.zb(new Image(100, 100, U0, false));
            }
            String V0 = friendsUserRecommendationsDto.V0();
            if (V0 != null) {
                imageList.zb(new Image(200, 200, V0, false));
            }
            String b1 = friendsUserRecommendationsDto.b1();
            if (b1 != null) {
                imageList.zb(new Image(400, 400, b1, false));
            }
            String n1 = friendsUserRecommendationsDto.n1();
            if (n1 != null) {
                imageList.zb(new Image(480, 480, n1, true));
            }
            BaseBoolIntDto e3 = friendsUserRecommendationsDto.e();
            BaseBoolIntDto baseBoolIntDto = BaseBoolIntDto.YES;
            boolean z = e3 == baseBoolIntDto;
            boolean z2 = friendsUserRecommendationsDto.f() == baseBoolIntDto;
            UserDeactivationStatus c = jgq0.c(friendsUserRecommendationsDto.D());
            boolean z3 = friendsUserRecommendationsDto.y1() == baseBoolIntDto;
            Boolean E1 = friendsUserRecommendationsDto.E1();
            boolean booleanValue = E1 != null ? E1.booleanValue() : false;
            OnlineInfo a2 = jgq0.a(friendsUserRecommendationsDto.S0());
            if (a2 == null) {
                a2 = VisibleStatus.f;
            }
            String R = friendsUserRecommendationsDto.R();
            String str2 = R == null ? "" : R;
            String W = friendsUserRecommendationsDto.W();
            String str3 = W == null ? "" : W;
            String Z = friendsUserRecommendationsDto.Z();
            if (Z == null) {
                Z = "";
            }
            String T = friendsUserRecommendationsDto.T();
            String str4 = T == null ? "" : T;
            String y0 = friendsUserRecommendationsDto.y0();
            String str5 = y0 == null ? "" : y0;
            String F0 = friendsUserRecommendationsDto.F0();
            String str6 = F0 == null ? "" : F0;
            String H0 = friendsUserRecommendationsDto.H0();
            if (H0 == null) {
                H0 = "";
            }
            String D0 = friendsUserRecommendationsDto.D0();
            if (D0 == null) {
                D0 = "";
            }
            Boolean j2 = friendsUserRecommendationsDto.j();
            boolean booleanValue2 = j2 != null ? j2.booleanValue() : false;
            Boolean B1 = friendsUserRecommendationsDto.B1();
            boolean booleanValue3 = B1 != null ? B1.booleanValue() : false;
            Boolean D1 = friendsUserRecommendationsDto.D1();
            boolean booleanValue4 = D1 != null ? D1.booleanValue() : false;
            FriendsFriendStatusStatusDto a0 = friendsUserRecommendationsDto.a0();
            int i = a0 != null ? a0.i() : 0;
            String K0 = friendsUserRecommendationsDto.K0();
            if (K0 == null) {
                K0 = "";
            }
            Boolean z1 = friendsUserRecommendationsDto.z1();
            boolean booleanValue5 = z1 != null ? z1.booleanValue() : false;
            Boolean i2 = friendsUserRecommendationsDto.i();
            boolean booleanValue6 = i2 != null ? i2.booleanValue() : true;
            Boolean k = friendsUserRecommendationsDto.k();
            boolean booleanValue7 = k != null ? k.booleanValue() : true;
            StatusImageStatusDto v0 = friendsUserRecommendationsDto.v0();
            if (v0 != null) {
                int id = v0.getId();
                String e4 = v0.e();
                new ne6();
                imageStatus = new ImageStatus(id, e4, ne6.a(v0.d()), null, 0, null, null, 120, null);
            } else {
                imageStatus = null;
            }
            BaseCountryDto B = friendsUserRecommendationsDto.B();
            String str7 = (B == null || (title2 = B.getTitle()) == null) ? "" : title2;
            BaseCityDto o = friendsUserRecommendationsDto.o();
            String str8 = (o == null || (title = o.getTitle()) == null) ? "" : title;
            OccupationType.a aVar2 = OccupationType.Companion;
            UsersOccupationDto P0 = friendsUserRecommendationsDto.P0();
            int i3 = (P0 == null || (e = P0.e()) == null) ? OccupationType.UNKNOWN.i() : e.intValue();
            aVar2.getClass();
            OccupationType a3 = OccupationType.a.a(i3);
            UsersOccupationDto P02 = friendsUserRecommendationsDto.P0();
            String str9 = (P02 == null || (f = P02.f()) == null) ? "" : f;
            Integer R2 = b != null ? rl3.R(0, b) : null;
            Integer R3 = b != null ? rl3.R(1, b) : null;
            Integer R4 = b != null ? rl3.R(2, b) : null;
            boolean z4 = friendsUserRecommendationsDto.l() == baseBoolIntDto;
            boolean z5 = friendsUserRecommendationsDto.n() == baseBoolIntDto;
            SocialButtonType.a aVar3 = SocialButtonType.Companion;
            FriendsUserRecommendationsDto.SocialButtonTypeDto t1 = friendsUserRecommendationsDto.t1();
            String i4 = t1 != null ? t1.i() : null;
            aVar3.getClass();
            SocialButtonType a4 = SocialButtonType.a.a(i4);
            if (a4 == null) {
                a4 = SocialButtonType.ADD;
            }
            arrayList.add(new User(j, valueOf, u, null, str, a, imageList, z, z2, c, z3, booleanValue, a2, Z, H0, str2, str5, str3, str6, str4, D0, booleanValue2, booleanValue3, booleanValue4, i, K0, booleanValue5, booleanValue6, booleanValue7, false, imageStatus, null, str7, str8, a3, str9, R2, R3, R4, z4, z5, false, a4, false, -2147483640, 2560, null));
        }
        return new rts(arrayList, EntitySyncState.ACTUAL, w2wVar.f1());
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.d.hashCode() + qoy.b(this.b.hashCode() * 31, 31, this.c);
    }

    @Override // xsna.e1w
    public final String toString() {
        return "FriendsRecommendationsGetCmd(sources=" + this.b + ", isAwaitNetwork=" + this.c + ", screenRef=" + this.d + ')';
    }
}
