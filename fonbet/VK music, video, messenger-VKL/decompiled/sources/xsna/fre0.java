package xsna;

import com.vk.core.apps.BuildInfo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: QueueEventsReceiver.kt */
/* loaded from: classes4.dex */
public final class fre0 implements w8i {
    public static final fre0 b = new fre0();
    public static final HashMap<String, sq9> c = new HashMap<>();
    public static final bpn0 d = new bpn0(new i8c0(1));

    /* compiled from: QueueEventsReceiver.kt */
    public static final class a {
        public final jql0 a;

        public a(nyk0 nyk0Var, jql0 jql0Var) {
            this.a = jql0Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(List list) {
        if (!o25.a().b()) {
            fre0 fre0Var = b;
            if (BuildInfo.t() || BuildInfo.g()) {
                return;
            }
            synchronized (fre0Var) {
                b();
                s3q0 s3q0Var = s3q0.a;
            }
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            aVar.getClass();
            HashMap<String, sq9> hashMap = c;
            if (!hashMap.containsKey("imagestatus_tag")) {
                rau0 rau0Var = rau0.b;
                if (Boolean.TRUE.booleanValue()) {
                    hashMap.put("imagestatus_tag", aVar.a.invoke());
                }
            }
        }
    }

    public static void b() {
        HashMap<String, sq9> hashMap = c;
        for (Map.Entry<String, sq9> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            entry.getValue().cancel();
            ((vre0) d.getValue()).f(key);
        }
        hashMap.clear();
    }
}
