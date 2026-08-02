package com.yandex.go.navigation.activity;

import android.net.Uri;
import com.yandex.go.navigation.activity.b;
import defpackage.a2f0;
import defpackage.g50;
import defpackage.j73;
import defpackage.jst;
import defpackage.m50;
import defpackage.oyr;
import defpackage.t50;
import defpackage.tje;
import defpackage.tse;
import defpackage.u40;
import defpackage.xby;
import defpackage.zlb0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.activity.g;

/* loaded from: classes8.dex */
public final class b implements a2f0 {
    public static final Set e = j73.f0(new Integer[]{Integer.valueOf(HProv.PP_CONTAINER_EXTENSION), Integer.valueOf(HProv.PP_CONTAINER_STATUS), 145});
    public final t50 a;
    public final g b;
    public final tse c;
    public final LinkedHashMap d = new LinkedHashMap();

    public b(t50 t50Var, g gVar, tse tseVar) {
        this.a = t50Var;
        this.b = gVar;
        this.c = tseVar;
    }

    @Override // defpackage.a2f0
    public final void c() {
        Iterator it = e.iterator();
        while (it.hasNext()) {
            final int intValue = ((Number) it.next()).intValue();
            this.d.put(Integer.valueOf(intValue), this.a.c(oyr.i(intValue, "com.yandex.go.PickVisualMedia"), new g50(), new u40() { // from class: amb0
                @Override // defpackage.u40
                public final void a(Object obj) {
                    g gVar = b.this.b;
                    z30 z30Var = new z30(intValue, (Uri) obj);
                    gVar.c.set(z30Var);
                    gVar.d.g(z30Var);
                }
            }));
        }
        tje.N(this.c, null, null, new PickVisualMediaRouterImpl$onActivityCreate$1(this, null), 3);
    }

    public final void d(zlb0 zlb0Var, int i) {
        m50 m50Var = (m50) this.d.get(Integer.valueOf(i));
        if (m50Var == null) {
            xby.l(jst.e, "ActivityResult:PickVisualMedia", null, null, oyr.j(i, "Trying to launch activity to PickVisualMedia with request code: ", " when launcher is null"), 6);
        }
        if (m50Var != null) {
            m50Var.a(zlb0Var);
        }
    }

    @Override // defpackage.s150
    public final String getName() {
        return "PickVisualMediaRouterImpl";
    }
}
