package sg.bigo.ads.cl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes9.dex */
public final class g {
    private static final g b = new g();
    final Map<String, a> a = new ConcurrentHashMap();
    private boolean c = false;

    public class a {
        final AtomicInteger a = new AtomicInteger(0);
        final AtomicInteger b = new AtomicInteger(0);
        final AtomicInteger c = new AtomicInteger(0);

        public a() {
        }
    }

    @NonNull
    public final a a(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "null";
        }
        a aVar = this.a.get(str);
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a();
        this.a.put(str, aVar2);
        return aVar2;
    }

    public static g a() {
        return b;
    }

    public final void a(boolean z) {
        this.c = z;
        if (z) {
            Iterator<Map.Entry<String, a>> it = this.a.entrySet().iterator();
            while (it.hasNext()) {
                a value = it.next().getValue();
                if (value != null) {
                    value.c.set(0);
                }
            }
        }
    }
}
