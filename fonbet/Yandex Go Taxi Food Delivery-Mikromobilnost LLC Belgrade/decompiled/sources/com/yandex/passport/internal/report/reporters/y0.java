package com.yandex.passport.internal.report.reporters;

import com.yandex.passport.internal.methods.l3;
import com.yandex.passport.internal.report.jd;
import com.yandex.passport.internal.report.md;
import com.yandex.passport.internal.report.pb;

/* loaded from: classes8.dex */
public final class y0 extends l3 {
    public final com.yandex.passport.internal.features.a b;

    public y0(com.yandex.passport.internal.report.j jVar, com.yandex.passport.internal.features.a aVar) {
        super(jVar);
        this.b = aVar;
    }

    @Override // com.yandex.passport.internal.methods.l3
    public final boolean a() {
        com.yandex.passport.internal.features.a aVar = this.b;
        return ((Boolean) aVar.u.getValue(aVar, com.yandex.passport.internal.features.a.J[17])).booleanValue();
    }

    public final void j(Integer num, String str) {
        pb pbVar = pb.w;
        if (str == null) {
            str = "";
        }
        f(pbVar, new jd(str, 3), new md(num != null ? num.intValue() : 0, 24));
    }
}
