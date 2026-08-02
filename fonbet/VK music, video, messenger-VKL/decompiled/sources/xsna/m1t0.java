package xsna;

import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.dto.common.id.UserId;
import java.util.Collections;
import java.util.List;
import xsna.s1r0;
import xsna.xqu;

/* compiled from: VideoOwnerRepository.kt */
/* loaded from: classes7.dex */
public final class m1t0 {
    public static io.reactivex.rxjava3.core.x a(UserId userId) {
        if (fkq0.b(userId)) {
            List singletonList = Collections.singletonList(fkq0.a(userId));
            List l = e43.l(GroupsFieldsDto.NAME, GroupsFieldsDto.PHOTO_BASE);
            if ((4 & 2) != 0) {
                l = null;
            }
            dz2 x = yfb.x(xqu.a.a(null, singletonList, l));
            ahn.D(x);
            return rsg0.W(x, 7).l(new fe60(new bws(25), 17));
        }
        if (!fkq0.d(userId)) {
            return io.reactivex.rxjava3.internal.operators.single.a0.b;
        }
        List singletonList2 = Collections.singletonList(userId);
        List singletonList3 = Collections.singletonList(UsersFieldsDto.PHOTO_BASE);
        if ((58 & 1) != 0) {
            singletonList2 = null;
        }
        if ((4 & 58) != 0) {
            singletonList3 = null;
        }
        dz2 x2 = yfb.x(s1r0.a.b(singletonList2, null, singletonList3, null, null));
        ahn.D(x2);
        return rsg0.W(x2, 7).l(new qu50(new w9l0(10), 18));
    }
}
