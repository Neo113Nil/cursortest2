package xsna;

import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetOwnerVideosSortDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetPlaylistsTypeDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.kte;
import xsna.lgj0;
import xsna.r1r0;
import xsna.wqu;

/* compiled from: ClipsPlaylistsRepository.kt */
/* loaded from: classes16.dex */
public final class kue implements w8i {
    public static final List<String> g = e43.l("verified", "member_status", "friend_status", "first_name_gen", "image_status", "photo_base", "url");
    public final ngj0 b = new ngj0();
    public final w1r0 c = new w1r0();
    public final aru d = new aru();
    public final lue e = new lue();
    public final bpn0 f = new bpn0(new pce(this, 2));

    public static io.reactivex.rxjava3.internal.operators.observable.f0 f(kue kueVar, UserId userId, int i, String str, String str2, int i2, boolean z, int i3) {
        String str3 = (i3 & 4) != 0 ? null : str;
        String str4 = (i3 & 8) != 0 ? null : str2;
        int i4 = (i3 & 16) != 0 ? 10 : i2;
        boolean z2 = (i3 & 32) != 0 ? false : z;
        ngj0 ngj0Var = kueVar.b;
        ShortVideoGetOwnerVideosSortDto shortVideoGetOwnerVideosSortDto = z2 ? ShortVideoGetOwnerVideosSortDto.DESC : null;
        dz2 x = yfb.x(lgj0.a.g(ngj0Var, userId, Integer.valueOf(i4), str4, g, null, null, Integer.valueOf(i), null, str3, shortVideoGetOwnerVideosSortDto, 63664));
        ahn.D(x);
        return rsg0.W(x, 7);
    }

    public final io.reactivex.rxjava3.internal.operators.single.y a(int i, UserId userId, String str) {
        return rsg0.w0(yfb.x(lgj0.a.g(this.b, userId, 15, str, null, null, null, null, null, null, null, 65528))).l(new tt0(new iue(this, userId, i, 0), 11));
    }

    public final io.reactivex.rxjava3.internal.operators.single.y b(int i, UserId userId, String str) {
        return rsg0.w0(yfb.x(lgj0.a.g(this.b, userId, 100, str, null, null, null, Integer.valueOf(i), null, null, null, 65464))).l(new s7(new xv2(this.e, 5), 7));
    }

    public final io.reactivex.rxjava3.internal.operators.single.y c(int i, UserId userId) {
        return rsg0.W(yfb.x(mgj0.n(this.b, userId, null, Collections.singletonList(Integer.valueOf(i)), null, null, null, null, null, 250)), 7).l(new t7(new q69(this.e, 1), 7));
    }

    public final io.reactivex.rxjava3.internal.operators.single.y d(int i, UserId userId, String str) {
        dz2 x = yfb.x(mgj0.n(this.b, userId, ShortVideoGetPlaylistsTypeDto.AUTHORS, null, null, null, null, Integer.valueOf(i), str, 60));
        ahn.D(x);
        return rsg0.W(x, 7).l(new v20(new hl1(11, this, userId), 13));
    }

    public final io.reactivex.rxjava3.core.x<List<kte.a>> e(List<? extends UserId> list) {
        if (list.size() <= 1) {
            return io.reactivex.rxjava3.core.x.k(EmptyList.b);
        }
        ArrayList arrayList = new ArrayList();
        for (UserId userId : list) {
            if (fkq0.d(userId)) {
                arrayList.add(userId);
            }
        }
        io.reactivex.rxjava3.core.b0 k = arrayList.isEmpty() ? io.reactivex.rxjava3.core.x.k(EmptyList.b) : new io.reactivex.rxjava3.internal.operators.single.d0(rsg0.W(yfb.x(r1r0.a.b(this.c, arrayList, Collections.singletonList(UsersFieldsDto.PHOTO_BASE), null, null, 58)), 7), new iq(5), null);
        ArrayList arrayList2 = new ArrayList();
        for (UserId userId2 : list) {
            if (fkq0.b(userId2)) {
                arrayList2.add(userId2);
            }
        }
        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(fkq0.a((UserId) it.next()));
        }
        return io.reactivex.rxjava3.core.x.B(k, arrayList3.isEmpty() ? io.reactivex.rxjava3.core.x.k(new GroupsGetByIdObjectResponseDto(null, null, 3, null)) : new io.reactivex.rxjava3.internal.operators.single.d0(rsg0.W(yfb.x(wqu.a.b(this.d, arrayList3, e43.l(GroupsFieldsDto.PHOTO_BASE, GroupsFieldsDto.NAME), null, 4)), 7), new lq(10), null), new z7(new hue(this, 0), 15));
    }
}
