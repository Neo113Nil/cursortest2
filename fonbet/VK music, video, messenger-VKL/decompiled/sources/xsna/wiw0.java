package xsna;

import com.vk.api.generated.catalog.dto.CatalogUserItemDto;
import com.vk.api.generated.friends.dto.FriendsFriendStatusStatusDto;
import com.vk.api.generated.users.dto.UsersOnlineInfoDto;
import com.vk.api.generated.users.dto.UsersUserDescriptionDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.SocialButtonType;
import com.vk.im.ui.views.avatars.a;
import com.vk.im.ui.views.online.OnlineMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.EmptyList;

/* compiled from: VoipCallServiceSearchDtoMapper.kt */
/* loaded from: classes7.dex */
public final class wiw0 {
    public final b25 a;

    public wiw0(b25 b25Var) {
        this.a = b25Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0127 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ec A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList a(List list, List list2) {
        ArrayList arrayList;
        OnlineMode onlineMode;
        String str;
        Object obj;
        UsersUserDescriptionDto usersUserDescriptionDto;
        Object obj2;
        List list3 = list == null ? EmptyList.b : list;
        List list4 = list2 == null ? EmptyList.b : list2;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list4.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            CatalogUserItemDto catalogUserItemDto = (CatalogUserItemDto) it.next();
            Iterator it2 = list3.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                UsersUserFullDto usersUserFullDto = (UsersUserFullDto) obj2;
                if (epx.f(usersUserFullDto.s1(), catalogUserItemDto.getUserId()) && usersUserFullDto.V0() != FriendsFriendStatusStatusDto.IS_FRIEND) {
                    if (!epx.f(usersUserFullDto.s1(), this.a.c())) {
                        break;
                    }
                }
            }
            UsersUserFullDto usersUserFullDto2 = (UsersUserFullDto) obj2;
            Pair pair = usersUserFullDto2 != null ? new Pair(catalogUserItemDto, usersUserFullDto2) : null;
            if (pair != null) {
                arrayList2.add(pair);
            }
        }
        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            Pair pair2 = (Pair) it3.next();
            CatalogUserItemDto catalogUserItemDto2 = (CatalogUserItemDto) pair2.i();
            UsersUserFullDto usersUserFullDto3 = (UsersUserFullDto) pair2.j();
            StringBuilder sb = new StringBuilder();
            String D0 = usersUserFullDto3.D0();
            if (D0 == null) {
                D0 = "";
            }
            sb.append(D0);
            sb.append(' ');
            String x1 = usersUserFullDto3.x1();
            sb.append(x1 != null ? x1 : "");
            String sb2 = sb.toString();
            List<UsersUserDescriptionDto> j = catalogUserItemDto2.j();
            String e = (j == null || (usersUserDescriptionDto = (UsersUserDescriptionDto) j5g.a0(j)) == null) ? null : usersUserDescriptionDto.e();
            List<UserId> f = catalogUserItemDto2.f();
            if (f != null) {
                arrayList = new ArrayList();
                for (UserId userId : f) {
                    if (list != null) {
                        Iterator it4 = list.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it4.next();
                            if (epx.f(((UsersUserFullDto) obj).s1(), userId)) {
                                break;
                            }
                        }
                        UsersUserFullDto usersUserFullDto4 = (UsersUserFullDto) obj;
                        if (usersUserFullDto4 != null) {
                            str = usersUserFullDto4.r2();
                            if (str == null) {
                                arrayList.add(str);
                            }
                        }
                    }
                    str = null;
                    if (str == null) {
                    }
                }
            } else {
                arrayList = null;
            }
            UsersUserDescriptionDto i = catalogUserItemDto2.i();
            Triple triple = new Triple(e, arrayList, i != null ? i.e() : null);
            String str2 = (String) triple.d();
            List list5 = (List) triple.g();
            String str3 = (String) triple.h();
            UserId s1 = usersUserFullDto3.s1();
            kr5 a = qp5.a(usersUserFullDto3);
            a.b.C1179b c1179b = new a.b.C1179b(sb2);
            UsersOnlineInfoDto U1 = usersUserFullDto3.U1();
            if (U1 == null) {
                onlineMode = OnlineMode.OFFLINE;
            } else if (U1.g()) {
                Boolean i2 = U1.i();
                Boolean bool = Boolean.TRUE;
                onlineMode = epx.f(i2, bool) ? OnlineMode.ONLINE_VK_APP : epx.f(U1.j(), bool) ? OnlineMode.ONLINE_WEB : OnlineMode.OFFLINE;
            } else {
                onlineMode = OnlineMode.OFFLINE;
            }
            OnlineMode onlineMode2 = onlineMode;
            SocialButtonType.a aVar = SocialButtonType.Companion;
            UsersUserFullDto.SocialButtonTypeDto M2 = usersUserFullDto3.M2();
            String i3 = M2 != null ? M2.i() : null;
            aVar.getClass();
            arrayList3.add(new ziw0(s1, a, c1179b, sb2, onlineMode2, str2, list5, str3, SocialButtonType.a.a(i3), catalogUserItemDto2.r()));
        }
        return arrayList3;
    }
}
