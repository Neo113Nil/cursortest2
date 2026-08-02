package xsna;

import com.vk.api.generated.friends.dto.FriendsGetInterestingRequestsResponseDto;
import com.vk.api.generated.friends.dto.FriendsInterestingRequestDto;
import com.vk.api.generated.friends.dto.FriendsRequestsMutualDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.RequestUserProfile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.s1r0;

/* compiled from: FriendsGetRequestsSwipeNew.kt */
/* loaded from: classes14.dex */
public final class fps extends awi<List<? extends zxq0>> {
    public final int s;
    public final int t;
    public final UserId u;
    public final String v;

    public fps(int i, UserId userId, int i2, String str) {
        this.s = i;
        this.t = i2;
        this.u = userId;
        this.v = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0106 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a1 A[SYNTHETIC] */
    @Override // xsna.xz2, xsna.nx2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(l7r0 l7r0Var) {
        Object obj;
        zxq0 zxq0Var;
        FriendsRequestsMutualDto d;
        Integer d2;
        tfx t = new ots().t(null, Integer.valueOf(this.t), Integer.valueOf(this.s), null, this.v);
        UserId userId = this.u;
        if (userId != null) {
            long j = userId.b;
            if (j != 0) {
                this.j.put("pinned_request_id", Long.toString(j));
            }
        }
        FriendsGetInterestingRequestsResponseDto friendsGetInterestingRequestsResponseDto = (FriendsGetInterestingRequestsResponseDto) yfb.x(t).f(l7r0Var);
        List<FriendsInterestingRequestDto> d3 = friendsGetInterestingRequestsResponseDto.d();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = d3.iterator();
        while (it.hasNext()) {
            UserId userId2 = ((FriendsInterestingRequestDto) it.next()).getUserId();
            if (userId2 != null) {
                arrayList.add(userId2);
            }
        }
        List l = e43.l(UsersFieldsDto.CROP_PHOTO, UsersFieldsDto.BDATE, UsersFieldsDto.HAS_PHOTO, UsersFieldsDto.CITY, UsersFieldsDto.MUTUAL, UsersFieldsDto.FIRST_NAME_ACC, UsersFieldsDto.OCCUPATION, UsersFieldsDto.RELATION, UsersFieldsDto.PHOTO_BASE, UsersFieldsDto.SCREEN_NAME);
        if ((58 & 1) != 0) {
            arrayList = null;
        }
        if ((58 & 4) != 0) {
            l = null;
        }
        List<UsersUserFullDto> list = (List) yfb.x(s1r0.a.b(arrayList, null, l, null, null)).f(l7r0Var);
        ArrayList arrayList2 = new ArrayList();
        for (UsersUserFullDto usersUserFullDto : list) {
            Iterator<T> it2 = friendsGetInterestingRequestsResponseDto.d().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (epx.f(((FriendsInterestingRequestDto) obj).getUserId(), usersUserFullDto.s1())) {
                    break;
                }
            }
            FriendsInterestingRequestDto friendsInterestingRequestDto = (FriendsInterestingRequestDto) obj;
            if (friendsInterestingRequestDto != null && (d = friendsInterestingRequestDto.d()) != null && (d2 = d.d()) != null) {
                int intValue = d2.intValue();
                List<UserId> e = d.e();
                if (e != null) {
                    new j2r0();
                    zxq0Var = new zxq0(new RequestUserProfile(j2r0.a(usersUserFullDto)), intValue, e);
                    if (zxq0Var == null) {
                        arrayList2.add(zxq0Var);
                    }
                }
            }
            zxq0Var = null;
            if (zxq0Var == null) {
            }
        }
        return arrayList2;
    }
}
