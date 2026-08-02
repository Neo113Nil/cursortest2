package xsna;

import com.vk.im.engine.models.contacts.Contact;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ContactsMergeTask.kt */
/* loaded from: classes2.dex */
public final class ccj extends b920 {
    public final Map<Long, Contact> c;
    public final long d;
    public final boolean e;

    public ccj(boolean z, long j, Map map) {
        this.c = map;
        this.d = j;
        this.e = z;
    }

    @Override // xsna.b920
    public final Object o(w2w w2wVar) {
        String str;
        Map<Long, Contact> map = this.c;
        if (map.isEmpty()) {
            return map;
        }
        Map<Long, Contact> d = w2wVar.I0().w().d(map.keySet());
        LinkedHashMap linkedHashMap = new LinkedHashMap(on00.e(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Contact contact = (Contact) entry.getValue();
            long j = contact.b;
            boolean z = contact.g;
            long j2 = contact.l;
            Contact contact2 = d.get(Long.valueOf(j));
            String str2 = contact.i;
            if (contact2 == null || (str = contact2.i) == null) {
                str = "";
            }
            boolean z2 = this.e;
            if (!z2) {
                Long valueOf = Long.valueOf(j2);
                if (j2 == 0) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    j2 = valueOf.longValue();
                } else {
                    Long valueOf2 = contact2 != null ? Long.valueOf(contact2.l) : null;
                    j2 = valueOf2 != null ? valueOf2.longValue() : 0L;
                }
            } else {
                if (!z2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (contact2 != null) {
                    j2 = contact2.l;
                }
            }
            if (z2) {
                if (!z2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (contact2 != null) {
                    z = contact2.g;
                }
            }
            if (!myc0.f(str2)) {
                str2 = str;
            }
            linkedHashMap.put(key, Contact.zb(contact, null, z, str2, null, this.d, j2, 31071));
        }
        w2wVar.I0().w().e(linkedHashMap.values());
        return linkedHashMap;
    }
}
