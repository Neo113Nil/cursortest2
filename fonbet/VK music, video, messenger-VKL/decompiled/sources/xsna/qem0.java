package xsna;

import com.google.gson.Gson;
import com.vk.dto.common.id.UserId;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: StoryStatisticsExcludedUsersConverters.kt */
/* loaded from: classes6.dex */
public final class qem0 {
    public static final bpn0 a = new bpn0(new pdh0(2));

    public static HashSet a(String str) {
        List list = (List) ((Gson) a.getValue()).fromJson(str, new pem0().getType());
        if (list == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(new UserId(((Number) it.next()).longValue()));
        }
        return hashSet;
    }
}
