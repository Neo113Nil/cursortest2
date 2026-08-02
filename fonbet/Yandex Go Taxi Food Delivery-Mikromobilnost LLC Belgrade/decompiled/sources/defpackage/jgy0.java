package defpackage;

import java.util.LinkedHashMap;
import java.util.UUID;

/* loaded from: classes4.dex */
public class jgy0 {
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a(String str) {
        this.a.remove(str);
    }

    public final String b(Object obj) {
        String uuid = UUID.randomUUID().toString();
        this.a.put(uuid, obj);
        return uuid;
    }
}
