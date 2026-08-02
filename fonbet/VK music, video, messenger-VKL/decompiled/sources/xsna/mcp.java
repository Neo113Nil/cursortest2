package xsna;

import com.vk.im.engine.models.emails.Email;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: EmailsMergeTask.kt */
/* loaded from: classes2.dex */
public final class mcp extends b920 {
    public final Map<Long, Email> c;

    public mcp(Collection<Email> collection) {
        HashMap hashMap = new HashMap(collection.size());
        for (Email email : collection) {
            hashMap.put(Long.valueOf(email.b), email);
        }
        this.c = hashMap;
    }

    @Override // xsna.b920
    public final Object o(w2w w2wVar) {
        ncp f = w2wVar.I0().f();
        Map<Long, Email> map = this.c;
        Map<Long, Email> c = f.c(map.keySet());
        ArrayList arrayList = new ArrayList(map.size());
        Iterator<Map.Entry<Long, Email>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Email value = it.next().getValue();
            Email email = c.get(Long.valueOf(value.b));
            if (email == null) {
                email = value;
            }
            String str = email.c;
            String obj = str != null ? drm0.p0(str).toString() : null;
            if (obj == null) {
                obj = "";
            }
            if (drm0.N(obj)) {
                obj = drm0.p0(value.c).toString();
            }
            arrayList.add(new Email(value.b, obj));
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        for (Map.Entry<Long, Email> entry : c.entrySet()) {
            long longValue = entry.getKey().longValue();
            Email value2 = entry.getValue();
            if (map.get(Long.valueOf(longValue)) == null) {
                arrayList2.add(value2);
            }
        }
        w2wVar.I0().f().a(arrayList2);
        return map;
    }

    public mcp(Map<Long, Email> map) {
        this.c = pn00.t(map);
    }
}
