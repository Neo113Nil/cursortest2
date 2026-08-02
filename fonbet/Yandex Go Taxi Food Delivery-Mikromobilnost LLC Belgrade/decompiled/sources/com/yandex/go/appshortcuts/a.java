package com.yandex.go.appshortcuts;

import defpackage.hbp0;
import defpackage.qx2;
import defpackage.zh3;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class a extends zh3 {
    public final qx2 d;
    public final AtomicBoolean e = new AtomicBoolean(true);

    public a(qx2 qx2Var) {
        this.d = qx2Var;
    }

    @Override // defpackage.zh3
    public final void a(boolean z) {
        AtomicBoolean atomicBoolean = this.e;
        if (!z) {
            atomicBoolean.set(false);
            qx2 qx2Var = this.d;
            qx2Var.f.a(null);
            qx2Var.d(new Pair(null, null));
            return;
        }
        if (atomicBoolean.compareAndSet(true, false)) {
            return;
        }
        qx2 qx2Var2 = this.d;
        qx2Var2.f.a(null);
        qx2Var2.f = hbp0.e(qx2Var2.g, null, null, new AppShortcutRepositoryImpl$updateShortcuts$1(qx2Var2, null), 3);
    }

    @Override // defpackage.j35
    public final String getName() {
        return "Shortcuts";
    }
}
