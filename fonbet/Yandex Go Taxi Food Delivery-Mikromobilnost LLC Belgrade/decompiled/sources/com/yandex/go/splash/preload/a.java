package com.yandex.go.splash.preload;

import defpackage.ad5;
import defpackage.epe0;
import defpackage.hpe0;
import defpackage.o61;
import java.util.HashMap;
import ru.yandex.taxi.startup.launch.i;

/* loaded from: classes13.dex */
public final class a extends ad5 {
    public final epe0 x;
    public final i y;

    public a(epe0 epe0Var, i iVar) {
        super(hpe0.class);
        this.x = epe0Var;
        this.y = iVar;
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        epe0 epe0Var = this.x;
        o61 o61Var = epe0Var.a;
        Double valueOf = epe0Var.b.b(PreloadSplashAnalytics$MarkedEvents.Splash) != null ? Double.valueOf(r4.floatValue()) : null;
        o61Var.getClass();
        HashMap hashMap = new HashMap();
        if (valueOf != null) {
            hashMap.put("duration", valueOf);
        }
        o61Var.a.a("BlockingLaunch.completed", hashMap, 1, new HashMap());
    }
}
