package xsna;

import com.vk.api.generated.account.dto.AccountGetInfoFieldsDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: AccountService.kt */
/* loaded from: classes11.dex */
public interface cs {

    /* compiled from: AccountService.kt */
    public static final class a {
        public static ufx a(String str, List list, List list2) {
            ufx ufxVar = new ufx("account.get", new ur(0), new vr(0));
            if (list != null) {
                ufx.o(ufxVar, "user_ids", list, 12);
            }
            if (list2 != null) {
                ufxVar.h("fields", list2);
            }
            if (str != null) {
                ufx.n(ufxVar, "name_case", str, 0, 12);
            }
            return ufxVar;
        }

        public static ufx b(List list) {
            ArrayList arrayList;
            ufx ufxVar = new ufx("account.getInfo", new wr(0), new xr(0));
            if (list != null) {
                List list2 = list;
                arrayList = new ArrayList(c5g.u(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AccountGetInfoFieldsDto) it.next()).i());
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                ufxVar.h("fields", arrayList);
            }
            return ufxVar;
        }

        public static ufx c(List list) {
            ufx ufxVar = new ufx("account.getMulti", new io.reactivex.rxjava3.subjects.c(1), new as(0));
            if (list != null) {
                ufxVar.h("fields", list);
            }
            return ufxVar;
        }

        public static ufx d(UserId userId, Integer num, String str, List list) {
            ufx ufxVar = new ufx("account.getToggles", new yr(), new zr());
            if (list != null) {
                ufxVar.h("toggles", list);
            }
            if (num != null) {
                ufx.k(ufxVar, "version", num.intValue(), 0, 12);
            }
            if (str != null) {
                ufx.n(ufxVar, "hash", str, 0, 12);
            }
            if (userId != null) {
                ufx.m(ufxVar, "user_id", userId, 0L, 8);
            }
            return ufxVar;
        }

        public static /* synthetic */ xy2 e(cs csVar, List list, Integer num, String str, UserId userId, int i) {
            if ((i & 1) != 0) {
                list = null;
            }
            if ((i & 2) != 0) {
                num = null;
            }
            if ((i & 4) != 0) {
                str = null;
            }
            if ((i & 8) != 0) {
                userId = null;
            }
            return csVar.k(userId, num, str, list);
        }
    }

    ufx a(List list);

    ufx k(UserId userId, Integer num, String str, List list);
}
