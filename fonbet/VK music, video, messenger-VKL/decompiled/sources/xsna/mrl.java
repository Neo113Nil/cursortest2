package xsna;

import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import xsna.r1r0;

/* compiled from: VmojiStorageImpl.kt */
/* loaded from: classes7.dex */
public final class mrl implements b6w0 {
    public final u1r0 a = new u1r0();

    @Override // xsna.b6w0
    public final Map<UserId, x5w0> a(Collection<UserId> collection) {
        dz2 x = yfb.x(r1r0.a.b(this.a, j5g.O0(collection), Collections.singletonList(UsersFieldsDto.ANIMATED_AVATAR), null, null, 58));
        x.q = 0;
        x.n = false;
        List<UsersUserFullDto> list = (List) x.u(0L);
        if (list == null) {
            return jgp.b;
        }
        ArrayList arrayList = new ArrayList();
        for (UsersUserFullDto usersUserFullDto : list) {
            BaseImageDto g = usersUserFullDto.g();
            Pair pair = g != null ? new Pair(usersUserFullDto.s1(), new x5w0(g.getUrl(), g.getWidth(), g.getHeight())) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return pn00.s(arrayList);
    }
}
