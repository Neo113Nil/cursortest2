package com.yandex.passport.internal.sloth;

import com.yandex.passport.internal.report.sd;
import com.yandex.passport.sloth.v0;

/* loaded from: classes2.dex */
public final class m implements com.yandex.passport.sloth.dependencies.g {
    public final sd a;
    public final com.yandex.passport.internal.features.a b;

    public m(sd sdVar, com.yandex.passport.internal.features.a aVar) {
        this.a = sdVar;
        this.b = aVar;
    }

    public final boolean a() {
        com.yandex.passport.internal.features.a aVar = this.b;
        return ((Boolean) aVar.d.getValue(aVar, com.yandex.passport.internal.features.a.J[0])).booleanValue();
    }

    public final void b(v0 v0Var) {
        if (a()) {
            this.a.a("sloth.reportWebAmEvent." + v0Var.a.getEventId(), v0Var.b);
        }
    }
}
