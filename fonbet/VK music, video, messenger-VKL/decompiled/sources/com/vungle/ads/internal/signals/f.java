package com.vungle.ads.internal.signals;

import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.model.v2;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;

/* loaded from: classes7.dex */
public final class f extends com.vungle.ads.internal.util.b {
    public final /* synthetic */ j a;

    public f(j jVar) {
        this.a = jVar;
    }

    @Override // com.vungle.ads.internal.util.b
    public final void a() {
        boolean z = u.a;
        t.a("SignalManager", "SignalManager#onBackground()");
        this.a.c = System.currentTimeMillis();
        j jVar = this.a;
        jVar.e = (jVar.c - jVar.d) + jVar.e;
    }

    @Override // com.vungle.ads.internal.util.b
    public final void b() {
        Integer num;
        boolean z = u.a;
        t.a("SignalManager", "SignalManager#onForeground()");
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.a.c;
        ConfigManager.INSTANCE.getClass();
        v2 v2Var = ConfigManager.a;
        if (j > ((v2Var == null || (num = v2Var.l) == null) ? 1800 : num.intValue()) * 1000) {
            j jVar = this.a;
            jVar.f();
            jVar.h = new c(jVar.f);
        }
        j jVar2 = this.a;
        jVar2.d = currentTimeMillis;
        jVar2.c = 0L;
    }
}
