package defpackage;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import ru.yandex.taxi.jobs.b;

/* loaded from: classes5.dex */
public final class hqo {
    public final b a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public hqo(b bVar) {
        this.a = bVar;
    }

    public final void a(String str) {
        this.b.computeIfAbsent(str, new yu0(8, new t8j(28, str, this)));
    }

    public final void b(String str) {
        UUID uuid = (UUID) this.b.remove(str);
        if (uuid != null) {
            unr0.C(new Object[]{str}, 1, "cancel expedited job for order %s", jst.e);
            this.a.c(new ez7("pull_order_status", uuid));
        }
    }
}
