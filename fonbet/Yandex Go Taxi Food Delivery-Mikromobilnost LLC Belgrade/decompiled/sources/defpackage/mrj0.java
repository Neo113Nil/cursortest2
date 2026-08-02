package defpackage;

import android.webkit.CookieManager;
import java.util.HashMap;
import java.util.Iterator;
import ru.yandex.taxi.am.k;
import ru.yandex.taxi.am.m;
import ru.yandex.taxi.startup.launch.h;
import ru.yandex.taxi.zalogin.j;

/* loaded from: classes9.dex */
public final class mrj0 {
    public final k a;
    public final h b;
    public final h3y c;
    public final eky d;
    public final ru.yandex.taxi.am.h e;
    public final h3y f;
    public final m g;
    public final h3y h;

    public mrj0(k kVar, h hVar, h3y h3yVar, eky ekyVar, ru.yandex.taxi.am.h hVar2, h3y h3yVar2, m mVar, h3y h3yVar3) {
        this.a = kVar;
        this.b = hVar;
        this.c = h3yVar;
        this.d = ekyVar;
        this.e = hVar2;
        this.f = h3yVar2;
        this.g = mVar;
        this.h = h3yVar3;
    }

    public final void a(boolean z) {
        k kVar = this.a;
        kVar.Pg(null);
        hhz hhzVar = (hhz) this.c.get();
        hhzVar.getClass();
        hhzVar.a.a("LOGIN: TrackAuthToken clear token from resetAccountData", new HashMap(), 1, new HashMap());
        qme0 qme0Var = kVar.D;
        kgx kgxVar = k.S[3];
        Boolean bool = Boolean.FALSE;
        qme0Var.setValue(kVar, kgxVar, bool);
        kVar.C.g(bool);
        CookieManager.getInstance().removeAllCookies(null);
        this.g.b(z);
        this.e.a();
        j jVar = (j) this.f.get();
        jVar.f = null;
        jVar.g.g(Boolean.TRUE);
        eky ekyVar = this.d;
        ((cne0) ekyVar.b).w(ekyVar.w);
        h hVar = this.b;
        ((cne0) hVar.b).u("launch_actual", false);
        ((cne0) hVar.b).w("client id");
    }

    public final void b(boolean z) {
        if (z || this.a.x.a().a()) {
            a(false);
            Iterator it = ((Iterable) this.h.get()).iterator();
            while (it.hasNext()) {
                ((yl) it.next()).b();
            }
        }
    }
}
