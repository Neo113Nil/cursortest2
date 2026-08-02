package xsna;

import com.vk.api.generated.users.dto.UsersFieldsDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: UsersService.kt */
/* loaded from: classes.dex */
public interface r1r0 {

    /* compiled from: UsersService.kt */
    /* loaded from: classes17.dex */
    public static final class a {
        public static sfx a(List list, List list2, List list3, String str, List list4) {
            ArrayList arrayList;
            sfx sfxVar = new sfx("users.get", new zzq0(1), new zjh0(7));
            if (list != null) {
                sfx.h(sfxVar, "user_ids", list);
            }
            if (list2 != null) {
                sfx.h(sfxVar, "domains", list2);
            }
            if (list3 != null) {
                List list5 = list3;
                arrayList = new ArrayList(c5g.u(list5, 10));
                Iterator it = list5.iterator();
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
            if (list4 != null) {
                sfxVar.f("access_keys", list4);
            }
            return sfxVar;
        }

        public static /* synthetic */ xy2 b(r1r0 r1r0Var, List list, List list2, String str, List list3, int i) {
            if ((i & 1) != 0) {
                list = null;
            }
            if ((i & 4) != 0) {
                list2 = null;
            }
            if ((i & 8) != 0) {
                str = null;
            }
            return r1r0Var.b(list, null, list2, str, (i & 16) != 0 ? null : list3);
        }
    }

    sfx b(List list, List list2, List list3, String str, List list4);
}
