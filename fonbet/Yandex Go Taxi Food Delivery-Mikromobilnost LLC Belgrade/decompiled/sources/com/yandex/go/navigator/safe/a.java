package com.yandex.go.navigator.safe;

import com.yandex.runtime.recording.EventListener;
import defpackage.dj20;
import defpackage.evu0;
import defpackage.hbp0;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import java.util.Map;

/* loaded from: classes12.dex */
public final class a implements EventListener {
    public final dj20 a;

    public a(dj20 dj20Var) {
        this.a = dj20Var;
    }

    @Override // com.yandex.runtime.recording.EventListener
    public final void onEvent(String str, Map map) {
        if (evu0.y(str, "navigation.ping", false)) {
            dj20 dj20Var = this.a;
            if (dj20Var.d.get()) {
                return;
            }
            hbp0 hbp0Var = dj20Var.b.a;
            dj20Var.c.getClass();
            sjh sjhVar = uyj.a;
            tje.N(hbp0Var, mdh.b, null, new MissionControlRepository$sendEvent$1(dj20Var, null), 2);
        }
    }

    @Override // com.yandex.runtime.recording.EventListener
    public final void onFlush(boolean z) {
    }
}
