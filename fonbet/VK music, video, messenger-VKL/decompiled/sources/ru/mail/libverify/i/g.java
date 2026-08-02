package ru.mail.libverify.i;

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import ru.mail.libverify.platform.storage.KeyValueStorage;
import ru.mail.libverify.u.w;
import xsna.on00;

/* loaded from: classes9.dex */
public final class g implements f {
    private final Context a;
    private final KeyValueStorage b;

    public g(Context context, w wVar) {
        this.a = context;
        this.b = wVar.c();
    }

    @Override // ru.mail.libverify.i.f
    public final Map<String, k> a() {
        return b();
    }

    @Override // ru.mail.libverify.i.f
    public final k b(String str) {
        Map<String, k> b = b();
        k remove = b.remove(str);
        LinkedHashMap linkedHashMap = new LinkedHashMap(on00.e(b.size()));
        Iterator<T> it = b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((k) entry.getValue()).b());
        }
        this.b.putValue("server_notification_message_data", ru.mail.libverify.q0.a.f(linkedHashMap)).commitSync();
        return remove;
    }

    @Override // ru.mail.libverify.i.f
    public final void clear() {
        this.b.removeValue("server_notification_message_data").commitSync();
    }

    @Override // ru.mail.libverify.i.f
    public final k a(String str) {
        return b().get(str);
    }

    @Override // ru.mail.libverify.i.f
    public final k a(String str, k kVar) {
        Map<String, k> b = b();
        k put = b.put(str, kVar);
        LinkedHashMap linkedHashMap = new LinkedHashMap(on00.e(b.size()));
        Iterator<T> it = b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((k) entry.getValue()).b());
        }
        this.b.putValue("server_notification_message_data", ru.mail.libverify.q0.a.f(linkedHashMap)).commitSync();
        return put;
    }

    private final Map<String, k> b() {
        try {
            String value = this.b.getValue("server_notification_message_data");
            if (value == null) {
                return new LinkedHashMap();
            }
            HashMap d = ru.mail.libverify.q0.a.d(value, ru.mail.libverify.g.b.class);
            LinkedHashMap linkedHashMap = new LinkedHashMap(on00.e(d.size()));
            for (Object obj : d.entrySet()) {
                linkedHashMap.put(((Map.Entry) obj).getKey(), new k(this.a, (ru.mail.libverify.g.b) ((Map.Entry) obj).getValue(), true));
            }
            return new LinkedHashMap(linkedHashMap);
        } catch (Throwable th) {
            th.printStackTrace();
            return new LinkedHashMap();
        }
    }
}
