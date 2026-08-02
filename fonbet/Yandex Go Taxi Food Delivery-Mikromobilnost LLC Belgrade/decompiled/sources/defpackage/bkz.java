package defpackage;

import android.app.Application;
import ru.yandex.taxi.logistics.sdk.management.deliveries.d;
import ru.yandex.taxi.logistics.sdk.management.j;
import ru.yandex.taxi.logistics.sdk.management.storage.e;

/* loaded from: classes9.dex */
public final class bkz implements v7p {
    public static j a() {
        y8g u = bvf0.u();
        st2 st2Var = (st2) u.c.get();
        d dVar = (d) u.f0.get();
        Application application = (Application) u.a.b.c;
        q5z.h(application);
        return new j(st2Var, dVar, new e(application));
    }

    @Override // defpackage.yvf0
    public final Object get() {
        return a();
    }
}
