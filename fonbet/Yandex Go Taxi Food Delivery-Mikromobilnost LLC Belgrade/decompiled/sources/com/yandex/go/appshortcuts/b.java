package com.yandex.go.appshortcuts;

import defpackage.hbp0;
import defpackage.lz60;
import defpackage.qx2;
import ru.yandex.taxi.am.g;

/* loaded from: classes.dex */
public final class b implements lz60 {
    public final g a;
    public final qx2 b;

    public b(g gVar, qx2 qx2Var) {
        this.a = gVar;
        this.b = qx2Var;
    }

    @Override // defpackage.lz60
    public final void g() {
        if (this.a.f()) {
            qx2 qx2Var = this.b;
            qx2Var.f.a(null);
            qx2Var.f = hbp0.e(qx2Var.g, null, null, new AppShortcutRepositoryImpl$updateShortcuts$1(qx2Var, null), 3);
        }
    }

    @Override // defpackage.s150
    public final String getName() {
        return "AppShortcutsUpdater";
    }
}
