package com.yandex.go.shortcuts.impl.ui.interactors;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.ck31;
import defpackage.n4s0;
import defpackage.tpr;
import defpackage.yaf0;
import defpackage.zuj0;

/* loaded from: classes13.dex */
public final class a implements n4s0 {
    public final zuj0 a;
    public final ck31 b;

    public a(zuj0 zuj0Var, ck31 ck31Var) {
        this.a = zuj0Var;
        this.b = ck31Var;
    }

    @Override // defpackage.n4s0
    public final tpr b(yaf0 yaf0Var) {
        return kotlinx.coroutines.flow.e.I(((k) this.b).r(""), new RidaLocalShortcutsViewSource$start$1(this, null));
    }

    @Override // defpackage.n4s0
    public final void stop() {
    }
}
