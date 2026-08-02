package com.yandex.go.taxi.order.multi.shortcuts;

import defpackage.c151;
import defpackage.i801;
import defpackage.jqr;
import defpackage.r551;
import defpackage.tpr;
import defpackage.yaf0;
import defpackage.zuj0;

/* loaded from: classes14.dex */
public final class e implements r551 {
    public final com.yandex.go.superapp.tracking.data.e a;
    public final zuj0 b;
    public final c151 c;
    public final i801 d;

    public e(com.yandex.go.superapp.tracking.data.e eVar, zuj0 zuj0Var, c151 c151Var, i801 i801Var) {
        this.a = eVar;
        this.b = zuj0Var;
        this.c = c151Var;
        this.d = i801Var;
    }

    @Override // defpackage.n4s0
    public final tpr b(yaf0 yaf0Var) {
        com.yandex.go.superapp.tracking.data.e eVar = this.a;
        eVar.b();
        return new d(new jqr(new jqr(eVar.v, new OrderShortcutViewSource$start$1(2, null), 0), new OrderShortcutViewSource$start$2(this, null), 3), this, yaf0Var);
    }

    @Override // defpackage.n4s0
    public final void stop() {
        this.a.c();
    }
}
