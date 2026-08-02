package xsna;

import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.api.generated.users.dto.UsersSearchSexDto;
import com.vk.api.generated.users.dto.UsersSearchStatusDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.r1r0;
import xsna.t1r0;

/* compiled from: UsersService.kt */
/* loaded from: classes.dex */
public interface s1r0 extends t1r0, r1r0 {

    /* compiled from: UsersService.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static sfx a(String str, List list, List list2) {
            ArrayList arrayList;
            sfx sfxVar = new sfx("getProfiles", new bkh0(6), new vcl0(3));
            if (list != null) {
                sfx.h(sfxVar, "user_ids", list);
            }
            if (list2 != null) {
                List list3 = list2;
                arrayList = new ArrayList(c5g.u(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add(((UsersFieldsDto) it.next()).i());
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                sfxVar.f("fields", arrayList);
            }
            if (str != null) {
                sfx.g(sfxVar, "name_case", str);
            }
            return sfxVar;
        }

        public static sfx b(List list, List list2, List list3, String str, List list4) {
            return r1r0.a.a(list, list2, list3, str, list4);
        }

        public static ufx c(String str, Integer num, Integer num2, List list, Integer num3, Integer num4, UsersSearchSexDto usersSearchSexDto, UsersSearchStatusDto usersSearchStatusDto, Integer num5, Integer num6, String str2) {
            return t1r0.a.a(str, num, num2, list, num3, num4, usersSearchSexDto, usersSearchStatusDto, num5, num6, str2);
        }
    }
}
