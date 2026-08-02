package defpackage;

import android.content.Intent;
import ru.yandex.taxi.order.services.c;
import ru.yandex.taxi.order.services.e;

/* loaded from: classes9.dex */
public final class chx {
    public final Class a;
    public final e b;
    public final /* synthetic */ c c;

    public chx(c cVar, Class cls, e eVar) {
        this.c = cVar;
        this.a = cls;
        this.b = eVar;
    }

    public final void a(String str) {
        boolean k;
        e eVar = this.b;
        synchronized (eVar) {
            k = eVar.d.k(fxq0.a, new exq0(str));
            if (k) {
                jst.e.o("KeepAliveService", "KeepAliveServiceStateHolder::setKeepAlive");
                eVar.a();
            }
        }
        if (k) {
            this.c.a.startService(new Intent(this.c.a, (Class<?>) this.a));
        }
    }
}
