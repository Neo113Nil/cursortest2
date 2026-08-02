package xsna;

import com.vk.api.generated.base.dto.BaseCityDto;
import com.vk.api.generated.base.dto.BaseSexDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.dto.common.id.UserId;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.superapp.api.dto.user.WebUserShortInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: UsersMapper.kt */
/* loaded from: classes6.dex */
public final class h1r0 {
    public h1r0(ikw ikwVar) {
    }

    public final WebUserShortInfo a(UsersUserFullDto usersUserFullDto) {
        UserId s1 = usersUserFullDto.s1();
        String D0 = usersUserFullDto.D0();
        if (D0 == null && (D0 = usersUserFullDto.S0()) == null) {
            D0 = "";
        }
        String x1 = usersUserFullDto.x1();
        String str = (x1 == null && (x1 = usersUserFullDto.L1()) == null) ? "" : x1;
        boolean z = usersUserFullDto.L2() == BaseSexDto.FEMALE;
        Boolean T2 = usersUserFullDto.T2();
        Boolean bool = Boolean.TRUE;
        boolean f = epx.f(T2, bool);
        boolean f2 = epx.f(usersUserFullDto.l(), bool);
        WebImage a = ikw.a(usersUserFullDto);
        BaseCityDto G = usersUserFullDto.G();
        return new WebUserShortInfo(s1, D0, str, z, f, f2, a, G != null ? G.getTitle() : null);
    }

    public final ArrayList b(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(a((UsersUserFullDto) it.next()));
        }
        return arrayList;
    }
}
