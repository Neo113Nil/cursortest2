package xsna;

import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: GroupsService.kt */
/* loaded from: classes.dex */
public interface wqu {

    /* compiled from: GroupsService.kt */
    /* loaded from: classes17.dex */
    public static final class a {
        public static sfx a(String str, List list, List list2) {
            ArrayList arrayList;
            sfx sfxVar = new sfx("groups.getById", new io.reactivex.rxjava3.subjects.b(20), new as(19));
            if (list != null) {
                sfx.h(sfxVar, "group_ids", list);
            }
            if (list2 != null) {
                List list3 = list2;
                arrayList = new ArrayList(c5g.u(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add(((GroupsFieldsDto) it.next()).k());
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                sfxVar.f("fields", arrayList);
            }
            if (str != null) {
                sfx.g(sfxVar, "ref", str);
            }
            return sfxVar;
        }

        public static /* synthetic */ xy2 b(wqu wquVar, List list, List list2, String str, int i) {
            if ((i & 2) != 0) {
                list2 = null;
            }
            if ((i & 4) != 0) {
                str = null;
            }
            return wquVar.r(str, list, list2);
        }
    }

    sfx r(String str, List list, List list2);
}
